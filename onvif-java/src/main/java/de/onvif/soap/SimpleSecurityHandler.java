package de.onvif.soap;

import jakarta.xml.soap.*;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;
import org.apache.commons.codec.binary.Base64;

import javax.xml.namespace.QName;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.*;

import static org.apache.wss4j.common.WSS4JConstants.*;

/*
 Utility class to add user/password onvif credentials to SOAP communications
*/
public class SimpleSecurityHandler implements SOAPHandler<SOAPMessageContext> {

    private final String username;
    private final String password;
    private String utcTime;
    private static Random rnd = new SecureRandom();

    public SimpleSecurityHandler(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public byte[] generateNonce(int length) {
        byte[] nonceBytes = new byte[length];

        // fill byte[]
        rnd.nextBytes(nonceBytes);
        return nonceBytes;
    }

    public String encryptPassword(String password, byte[] nonceBytes) {
        String digestBase64 = "";

        try {
            // 1. Base64 decode the nonce
            byte[] decodedNonce = nonceBytes;

            // 2. Concatenate decodedNonce, date, and password
            byte[] dateBytes = getUTCTime().getBytes();
            byte[] passwordBytes = password.getBytes();
            byte[] toBeHashed = new byte[decodedNonce.length + dateBytes.length + passwordBytes.length];

            System.arraycopy(decodedNonce, 0, toBeHashed, 0, decodedNonce.length);
            System.arraycopy(dateBytes, 0, toBeHashed, decodedNonce.length, dateBytes.length);
            System.arraycopy(passwordBytes, 0, toBeHashed, decodedNonce.length + dateBytes.length, passwordBytes.length);

            // 3. SHA-1 hash the concatenated bytes
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            byte[] sha1Hash = digest.digest(toBeHashed);

            // 4. Base64 encode the SHA-1 hash
            digestBase64 = java.util.Base64.getEncoder().encodeToString(sha1Hash);

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return digestBase64;
    }

    @Override
    public boolean handleMessage(final SOAPMessageContext msgCtx) {
        byte[] nonceBytes = generateNonce(16);
        // Indicator telling us which direction this message is going in
        final Boolean outInd = (Boolean) msgCtx.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

        // Handler must only add security headers to outbound messages
        if (outInd.booleanValue()) {
            try {
                // Create the xml
                SOAPMessage soapMessage = msgCtx.getMessage();
                SOAPEnvelope envelope = soapMessage.getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();
                if (header == null) {
                    header = envelope.addHeader();
                }

                SOAPPart sp = soapMessage.getSOAPPart();
                SOAPEnvelope se = sp.getEnvelope();
                se.addNamespaceDeclaration(WSSE_PREFIX, WSSE_NS);
                se.addNamespaceDeclaration(WSU_PREFIX, WSU_NS);

                SOAPElement securityElem = header.addChildElement(WSSE_LN, WSSE_PREFIX);
                // securityElem.setAttribute("SOAP-ENV:mustUnderstand", "1");

                SOAPElement usernameTokenElem =
                        securityElem.addChildElement(USERNAME_TOKEN_LN, WSSE_PREFIX);

                SOAPElement usernameElem = usernameTokenElem.addChildElement(USERNAME_LN, WSSE_PREFIX);
                usernameElem.setTextContent(username);

                SOAPElement passwordElem = usernameTokenElem.addChildElement(PASSWORD_LN, WSSE_PREFIX);
                passwordElem.setAttribute(PASSWORD_TYPE_ATTR, PASSWORD_DIGEST);
                passwordElem.setTextContent(encryptPassword(password, nonceBytes));

                SOAPElement nonceElem = usernameTokenElem.addChildElement(NONCE_LN, WSSE_PREFIX);
                nonceElem.setAttribute("EncodingType", BASE64_ENCODING);
                nonceElem.setTextContent(Base64.encodeBase64String(nonceBytes));

                SOAPElement createdElem = usernameTokenElem.addChildElement(CREATED_LN, WSU_PREFIX);
                createdElem.setTextContent(getLastUTCTime());
            } catch (final Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public String getLastUTCTime() {
        return utcTime;
    }

    public String getUTCTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-d'T'HH:mm:ss'Z'");
        sdf.setTimeZone(new SimpleTimeZone(SimpleTimeZone.UTC_TIME, "UTC"));
        Calendar cal = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        String utcTime = sdf.format(cal.getTime());
        this.utcTime = utcTime;
        return utcTime;
    }


    @Override
    public boolean handleFault(SOAPMessageContext context) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void close(MessageContext context) {
        // TODO Auto-generated method stub

    }

    @Override
    public Set<QName> getHeaders() {
        // TODO Auto-generated method stub
        return null;
    }
}
