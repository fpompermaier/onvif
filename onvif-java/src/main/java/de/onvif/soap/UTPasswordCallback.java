package de.onvif.soap;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

/**
 * Callback invoked by the WSS Username Token to validate the password
 * 
 * @author Alessio Iannone - quonn77@gmail.com
 *
 */
public class UTPasswordCallback implements CallbackHandler {

    private final static Map<String, String> passwords = new HashMap<String, String>();
    

    public UTPasswordCallback() {
        ;
    }

    /**
     * Here, we attempt to get the password from the private alias/passwords map.
     */
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
            String pass = passwords.get(pc.getIdentifier());
            if (pass != null) {
                pc.setPassword(pass);
                return;
            }
        }
    }

    /**
     * Add an alias/password pair to the callback mechanism.
     */
    public static void setAliasPassword(String alias, String password) {
        passwords.put(alias, password);
    }
}