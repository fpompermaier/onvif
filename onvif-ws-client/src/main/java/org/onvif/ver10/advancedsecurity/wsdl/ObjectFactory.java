
package org.onvif.ver10.advancedsecurity.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver10.advancedsecurity.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver10/advancedsecurity/wsdl", "Capabilities");
    private final static QName _GetAssignedCertPathValidationPoliciesResponseCertPathValidationPolicyID_QNAME = new QName("http://www.onvif.org/ver10/advancedsecurity/wsdl", "CertPathValidationPolicyID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver10.advancedsecurity.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadCRL }
     * 
     */
    public UploadCRL createUploadCRL() {
        return new UploadCRL();
    }

    /**
     * Create an instance of {@link CreateCertPathValidationPolicy }
     * 
     */
    public CreateCertPathValidationPolicy createCreateCertPathValidationPolicy() {
        return new CreateCertPathValidationPolicy();
    }

    /**
     * Create an instance of {@link KeystoreCapabilities }
     * 
     */
    public KeystoreCapabilities createKeystoreCapabilities() {
        return new KeystoreCapabilities();
    }

    /**
     * Create an instance of {@link CertPathValidationPolicy }
     * 
     */
    public CertPathValidationPolicy createCertPathValidationPolicy() {
        return new CertPathValidationPolicy();
    }

    /**
     * Create an instance of {@link CertPathValidationParameters }
     * 
     */
    public CertPathValidationParameters createCertPathValidationParameters() {
        return new CertPathValidationParameters();
    }

    /**
     * Create an instance of {@link PassphraseAttribute }
     * 
     */
    public PassphraseAttribute createPassphraseAttribute() {
        return new PassphraseAttribute();
    }

    /**
     * Create an instance of {@link CertificationPath }
     * 
     */
    public CertificationPath createCertificationPath() {
        return new CertificationPath();
    }

    /**
     * Create an instance of {@link AlgorithmIdentifier }
     * 
     */
    public AlgorithmIdentifier createAlgorithmIdentifier() {
        return new AlgorithmIdentifier();
    }

    /**
     * Create an instance of {@link CSRAttribute }
     * 
     */
    public CSRAttribute createCSRAttribute() {
        return new CSRAttribute();
    }

    /**
     * Create an instance of {@link DistinguishedName }
     * 
     */
    public DistinguishedName createDistinguishedName() {
        return new DistinguishedName();
    }

    /**
     * Create an instance of {@link KeyAttribute }
     * 
     */
    public KeyAttribute createKeyAttribute() {
        return new KeyAttribute();
    }

    /**
     * Create an instance of {@link Capabilities }
     * 
     */
    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    /**
     * Create an instance of {@link GetServiceCapabilities }
     * 
     */
    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    /**
     * Create an instance of {@link GetServiceCapabilitiesResponse }
     * 
     */
    public GetServiceCapabilitiesResponse createGetServiceCapabilitiesResponse() {
        return new GetServiceCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link CreateRSAKeyPair }
     * 
     */
    public CreateRSAKeyPair createCreateRSAKeyPair() {
        return new CreateRSAKeyPair();
    }

    /**
     * Create an instance of {@link CreateRSAKeyPairResponse }
     * 
     */
    public CreateRSAKeyPairResponse createCreateRSAKeyPairResponse() {
        return new CreateRSAKeyPairResponse();
    }

    /**
     * Create an instance of {@link UploadKeyPairInPKCS8 }
     * 
     */
    public UploadKeyPairInPKCS8 createUploadKeyPairInPKCS8() {
        return new UploadKeyPairInPKCS8();
    }

    /**
     * Create an instance of {@link UploadKeyPairInPKCS8Response }
     * 
     */
    public UploadKeyPairInPKCS8Response createUploadKeyPairInPKCS8Response() {
        return new UploadKeyPairInPKCS8Response();
    }

    /**
     * Create an instance of {@link UploadCertificateWithPrivateKeyInPKCS12 }
     * 
     */
    public UploadCertificateWithPrivateKeyInPKCS12 createUploadCertificateWithPrivateKeyInPKCS12() {
        return new UploadCertificateWithPrivateKeyInPKCS12();
    }

    /**
     * Create an instance of {@link UploadCertificateWithPrivateKeyInPKCS12Response }
     * 
     */
    public UploadCertificateWithPrivateKeyInPKCS12Response createUploadCertificateWithPrivateKeyInPKCS12Response() {
        return new UploadCertificateWithPrivateKeyInPKCS12Response();
    }

    /**
     * Create an instance of {@link GetKeyStatus }
     * 
     */
    public GetKeyStatus createGetKeyStatus() {
        return new GetKeyStatus();
    }

    /**
     * Create an instance of {@link GetKeyStatusResponse }
     * 
     */
    public GetKeyStatusResponse createGetKeyStatusResponse() {
        return new GetKeyStatusResponse();
    }

    /**
     * Create an instance of {@link GetPrivateKeyStatus }
     * 
     */
    public GetPrivateKeyStatus createGetPrivateKeyStatus() {
        return new GetPrivateKeyStatus();
    }

    /**
     * Create an instance of {@link GetPrivateKeyStatusResponse }
     * 
     */
    public GetPrivateKeyStatusResponse createGetPrivateKeyStatusResponse() {
        return new GetPrivateKeyStatusResponse();
    }

    /**
     * Create an instance of {@link GetAllKeys }
     * 
     */
    public GetAllKeys createGetAllKeys() {
        return new GetAllKeys();
    }

    /**
     * Create an instance of {@link GetAllKeysResponse }
     * 
     */
    public GetAllKeysResponse createGetAllKeysResponse() {
        return new GetAllKeysResponse();
    }

    /**
     * Create an instance of {@link DeleteKey }
     * 
     */
    public DeleteKey createDeleteKey() {
        return new DeleteKey();
    }

    /**
     * Create an instance of {@link DeleteKeyResponse }
     * 
     */
    public DeleteKeyResponse createDeleteKeyResponse() {
        return new DeleteKeyResponse();
    }

    /**
     * Create an instance of {@link CreatePKCS10CSR }
     * 
     */
    public CreatePKCS10CSR createCreatePKCS10CSR() {
        return new CreatePKCS10CSR();
    }

    /**
     * Create an instance of {@link CreatePKCS10CSRResponse }
     * 
     */
    public CreatePKCS10CSRResponse createCreatePKCS10CSRResponse() {
        return new CreatePKCS10CSRResponse();
    }

    /**
     * Create an instance of {@link CreateSelfSignedCertificate }
     * 
     */
    public CreateSelfSignedCertificate createCreateSelfSignedCertificate() {
        return new CreateSelfSignedCertificate();
    }

    /**
     * Create an instance of {@link X509V3Extension }
     * 
     */
    public X509V3Extension createX509V3Extension() {
        return new X509V3Extension();
    }

    /**
     * Create an instance of {@link CreateSelfSignedCertificateResponse }
     * 
     */
    public CreateSelfSignedCertificateResponse createCreateSelfSignedCertificateResponse() {
        return new CreateSelfSignedCertificateResponse();
    }

    /**
     * Create an instance of {@link UploadCertificate }
     * 
     */
    public UploadCertificate createUploadCertificate() {
        return new UploadCertificate();
    }

    /**
     * Create an instance of {@link UploadCertificateResponse }
     * 
     */
    public UploadCertificateResponse createUploadCertificateResponse() {
        return new UploadCertificateResponse();
    }

    /**
     * Create an instance of {@link GetCertificate }
     * 
     */
    public GetCertificate createGetCertificate() {
        return new GetCertificate();
    }

    /**
     * Create an instance of {@link GetCertificateResponse }
     * 
     */
    public GetCertificateResponse createGetCertificateResponse() {
        return new GetCertificateResponse();
    }

    /**
     * Create an instance of {@link X509Certificate }
     * 
     */
    public X509Certificate createX509Certificate() {
        return new X509Certificate();
    }

    /**
     * Create an instance of {@link GetAllCertificates }
     * 
     */
    public GetAllCertificates createGetAllCertificates() {
        return new GetAllCertificates();
    }

    /**
     * Create an instance of {@link GetAllCertificatesResponse }
     * 
     */
    public GetAllCertificatesResponse createGetAllCertificatesResponse() {
        return new GetAllCertificatesResponse();
    }

    /**
     * Create an instance of {@link DeleteCertificate }
     * 
     */
    public DeleteCertificate createDeleteCertificate() {
        return new DeleteCertificate();
    }

    /**
     * Create an instance of {@link DeleteCertificateResponse }
     * 
     */
    public DeleteCertificateResponse createDeleteCertificateResponse() {
        return new DeleteCertificateResponse();
    }

    /**
     * Create an instance of {@link CreateCertificationPath }
     * 
     */
    public CreateCertificationPath createCreateCertificationPath() {
        return new CreateCertificationPath();
    }

    /**
     * Create an instance of {@link CertificateIDs }
     * 
     */
    public CertificateIDs createCertificateIDs() {
        return new CertificateIDs();
    }

    /**
     * Create an instance of {@link CreateCertificationPathResponse }
     * 
     */
    public CreateCertificationPathResponse createCreateCertificationPathResponse() {
        return new CreateCertificationPathResponse();
    }

    /**
     * Create an instance of {@link GetCertificationPath }
     * 
     */
    public GetCertificationPath createGetCertificationPath() {
        return new GetCertificationPath();
    }

    /**
     * Create an instance of {@link GetCertificationPathResponse }
     * 
     */
    public GetCertificationPathResponse createGetCertificationPathResponse() {
        return new GetCertificationPathResponse();
    }

    /**
     * Create an instance of {@link GetAllCertificationPaths }
     * 
     */
    public GetAllCertificationPaths createGetAllCertificationPaths() {
        return new GetAllCertificationPaths();
    }

    /**
     * Create an instance of {@link GetAllCertificationPathsResponse }
     * 
     */
    public GetAllCertificationPathsResponse createGetAllCertificationPathsResponse() {
        return new GetAllCertificationPathsResponse();
    }

    /**
     * Create an instance of {@link DeleteCertificationPath }
     * 
     */
    public DeleteCertificationPath createDeleteCertificationPath() {
        return new DeleteCertificationPath();
    }

    /**
     * Create an instance of {@link DeleteCertificationPathResponse }
     * 
     */
    public DeleteCertificationPathResponse createDeleteCertificationPathResponse() {
        return new DeleteCertificationPathResponse();
    }

    /**
     * Create an instance of {@link UploadPassphrase }
     * 
     */
    public UploadPassphrase createUploadPassphrase() {
        return new UploadPassphrase();
    }

    /**
     * Create an instance of {@link UploadPassphraseResponse }
     * 
     */
    public UploadPassphraseResponse createUploadPassphraseResponse() {
        return new UploadPassphraseResponse();
    }

    /**
     * Create an instance of {@link GetAllPassphrases }
     * 
     */
    public GetAllPassphrases createGetAllPassphrases() {
        return new GetAllPassphrases();
    }

    /**
     * Create an instance of {@link GetAllPassphrasesResponse }
     * 
     */
    public GetAllPassphrasesResponse createGetAllPassphrasesResponse() {
        return new GetAllPassphrasesResponse();
    }

    /**
     * Create an instance of {@link DeletePassphrase }
     * 
     */
    public DeletePassphrase createDeletePassphrase() {
        return new DeletePassphrase();
    }

    /**
     * Create an instance of {@link DeletePassphraseResponse }
     * 
     */
    public DeletePassphraseResponse createDeletePassphraseResponse() {
        return new DeletePassphraseResponse();
    }

    /**
     * Create an instance of {@link AddServerCertificateAssignment }
     * 
     */
    public AddServerCertificateAssignment createAddServerCertificateAssignment() {
        return new AddServerCertificateAssignment();
    }

    /**
     * Create an instance of {@link AddServerCertificateAssignmentResponse }
     * 
     */
    public AddServerCertificateAssignmentResponse createAddServerCertificateAssignmentResponse() {
        return new AddServerCertificateAssignmentResponse();
    }

    /**
     * Create an instance of {@link RemoveServerCertificateAssignment }
     * 
     */
    public RemoveServerCertificateAssignment createRemoveServerCertificateAssignment() {
        return new RemoveServerCertificateAssignment();
    }

    /**
     * Create an instance of {@link RemoveServerCertificateAssignmentResponse }
     * 
     */
    public RemoveServerCertificateAssignmentResponse createRemoveServerCertificateAssignmentResponse() {
        return new RemoveServerCertificateAssignmentResponse();
    }

    /**
     * Create an instance of {@link ReplaceServerCertificateAssignment }
     * 
     */
    public ReplaceServerCertificateAssignment createReplaceServerCertificateAssignment() {
        return new ReplaceServerCertificateAssignment();
    }

    /**
     * Create an instance of {@link ReplaceServerCertificateAssignmentResponse }
     * 
     */
    public ReplaceServerCertificateAssignmentResponse createReplaceServerCertificateAssignmentResponse() {
        return new ReplaceServerCertificateAssignmentResponse();
    }

    /**
     * Create an instance of {@link GetAssignedServerCertificates }
     * 
     */
    public GetAssignedServerCertificates createGetAssignedServerCertificates() {
        return new GetAssignedServerCertificates();
    }

    /**
     * Create an instance of {@link GetAssignedServerCertificatesResponse }
     * 
     */
    public GetAssignedServerCertificatesResponse createGetAssignedServerCertificatesResponse() {
        return new GetAssignedServerCertificatesResponse();
    }

    /**
     * Create an instance of {@link UploadCRL.AnyParameters }
     * 
     */
    public UploadCRL.AnyParameters createUploadCRLAnyParameters() {
        return new UploadCRL.AnyParameters();
    }

    /**
     * Create an instance of {@link UploadCRLResponse }
     * 
     */
    public UploadCRLResponse createUploadCRLResponse() {
        return new UploadCRLResponse();
    }

    /**
     * Create an instance of {@link GetCRL }
     * 
     */
    public GetCRL createGetCRL() {
        return new GetCRL();
    }

    /**
     * Create an instance of {@link GetCRLResponse }
     * 
     */
    public GetCRLResponse createGetCRLResponse() {
        return new GetCRLResponse();
    }

    /**
     * Create an instance of {@link CRL }
     * 
     */
    public CRL createCRL() {
        return new CRL();
    }

    /**
     * Create an instance of {@link GetAllCRLs }
     * 
     */
    public GetAllCRLs createGetAllCRLs() {
        return new GetAllCRLs();
    }

    /**
     * Create an instance of {@link GetAllCRLsResponse }
     * 
     */
    public GetAllCRLsResponse createGetAllCRLsResponse() {
        return new GetAllCRLsResponse();
    }

    /**
     * Create an instance of {@link DeleteCRL }
     * 
     */
    public DeleteCRL createDeleteCRL() {
        return new DeleteCRL();
    }

    /**
     * Create an instance of {@link DeleteCRLResponse }
     * 
     */
    public DeleteCRLResponse createDeleteCRLResponse() {
        return new DeleteCRLResponse();
    }

    /**
     * Create an instance of {@link TrustAnchor }
     * 
     */
    public TrustAnchor createTrustAnchor() {
        return new TrustAnchor();
    }

    /**
     * Create an instance of {@link CreateCertPathValidationPolicy.AnyParameters }
     * 
     */
    public CreateCertPathValidationPolicy.AnyParameters createCreateCertPathValidationPolicyAnyParameters() {
        return new CreateCertPathValidationPolicy.AnyParameters();
    }

    /**
     * Create an instance of {@link CreateCertPathValidationPolicyResponse }
     * 
     */
    public CreateCertPathValidationPolicyResponse createCreateCertPathValidationPolicyResponse() {
        return new CreateCertPathValidationPolicyResponse();
    }

    /**
     * Create an instance of {@link GetCertPathValidationPolicy }
     * 
     */
    public GetCertPathValidationPolicy createGetCertPathValidationPolicy() {
        return new GetCertPathValidationPolicy();
    }

    /**
     * Create an instance of {@link GetCertPathValidationPolicyResponse }
     * 
     */
    public GetCertPathValidationPolicyResponse createGetCertPathValidationPolicyResponse() {
        return new GetCertPathValidationPolicyResponse();
    }

    /**
     * Create an instance of {@link GetAllCertPathValidationPolicies }
     * 
     */
    public GetAllCertPathValidationPolicies createGetAllCertPathValidationPolicies() {
        return new GetAllCertPathValidationPolicies();
    }

    /**
     * Create an instance of {@link GetAllCertPathValidationPoliciesResponse }
     * 
     */
    public GetAllCertPathValidationPoliciesResponse createGetAllCertPathValidationPoliciesResponse() {
        return new GetAllCertPathValidationPoliciesResponse();
    }

    /**
     * Create an instance of {@link DeleteCertPathValidationPolicy }
     * 
     */
    public DeleteCertPathValidationPolicy createDeleteCertPathValidationPolicy() {
        return new DeleteCertPathValidationPolicy();
    }

    /**
     * Create an instance of {@link DeleteCertPathValidationPolicyResponse }
     * 
     */
    public DeleteCertPathValidationPolicyResponse createDeleteCertPathValidationPolicyResponse() {
        return new DeleteCertPathValidationPolicyResponse();
    }

    /**
     * Create an instance of {@link SetClientAuthenticationRequired }
     * 
     */
    public SetClientAuthenticationRequired createSetClientAuthenticationRequired() {
        return new SetClientAuthenticationRequired();
    }

    /**
     * Create an instance of {@link SetClientAuthenticationRequiredResponse }
     * 
     */
    public SetClientAuthenticationRequiredResponse createSetClientAuthenticationRequiredResponse() {
        return new SetClientAuthenticationRequiredResponse();
    }

    /**
     * Create an instance of {@link GetClientAuthenticationRequired }
     * 
     */
    public GetClientAuthenticationRequired createGetClientAuthenticationRequired() {
        return new GetClientAuthenticationRequired();
    }

    /**
     * Create an instance of {@link GetClientAuthenticationRequiredResponse }
     * 
     */
    public GetClientAuthenticationRequiredResponse createGetClientAuthenticationRequiredResponse() {
        return new GetClientAuthenticationRequiredResponse();
    }

    /**
     * Create an instance of {@link AddCertPathValidationPolicyAssignment }
     * 
     */
    public AddCertPathValidationPolicyAssignment createAddCertPathValidationPolicyAssignment() {
        return new AddCertPathValidationPolicyAssignment();
    }

    /**
     * Create an instance of {@link AddCertPathValidationPolicyAssignmentResponse }
     * 
     */
    public AddCertPathValidationPolicyAssignmentResponse createAddCertPathValidationPolicyAssignmentResponse() {
        return new AddCertPathValidationPolicyAssignmentResponse();
    }

    /**
     * Create an instance of {@link RemoveCertPathValidationPolicyAssignment }
     * 
     */
    public RemoveCertPathValidationPolicyAssignment createRemoveCertPathValidationPolicyAssignment() {
        return new RemoveCertPathValidationPolicyAssignment();
    }

    /**
     * Create an instance of {@link RemoveCertPathValidationPolicyAssignmentResponse }
     * 
     */
    public RemoveCertPathValidationPolicyAssignmentResponse createRemoveCertPathValidationPolicyAssignmentResponse() {
        return new RemoveCertPathValidationPolicyAssignmentResponse();
    }

    /**
     * Create an instance of {@link ReplaceCertPathValidationPolicyAssignment }
     * 
     */
    public ReplaceCertPathValidationPolicyAssignment createReplaceCertPathValidationPolicyAssignment() {
        return new ReplaceCertPathValidationPolicyAssignment();
    }

    /**
     * Create an instance of {@link ReplaceCertPathValidationPolicyAssignmentResponse }
     * 
     */
    public ReplaceCertPathValidationPolicyAssignmentResponse createReplaceCertPathValidationPolicyAssignmentResponse() {
        return new ReplaceCertPathValidationPolicyAssignmentResponse();
    }

    /**
     * Create an instance of {@link GetAssignedCertPathValidationPolicies }
     * 
     */
    public GetAssignedCertPathValidationPolicies createGetAssignedCertPathValidationPolicies() {
        return new GetAssignedCertPathValidationPolicies();
    }

    /**
     * Create an instance of {@link GetAssignedCertPathValidationPoliciesResponse }
     * 
     */
    public GetAssignedCertPathValidationPoliciesResponse createGetAssignedCertPathValidationPoliciesResponse() {
        return new GetAssignedCertPathValidationPoliciesResponse();
    }

    /**
     * Create an instance of {@link DNAttributeTypeAndValue }
     * 
     */
    public DNAttributeTypeAndValue createDNAttributeTypeAndValue() {
        return new DNAttributeTypeAndValue();
    }

    /**
     * Create an instance of {@link MultiValuedRDN }
     * 
     */
    public MultiValuedRDN createMultiValuedRDN() {
        return new MultiValuedRDN();
    }

    /**
     * Create an instance of {@link BasicRequestAttribute }
     * 
     */
    public BasicRequestAttribute createBasicRequestAttribute() {
        return new BasicRequestAttribute();
    }

    /**
     * Create an instance of {@link TLSServerCapabilities }
     * 
     */
    public TLSServerCapabilities createTLSServerCapabilities() {
        return new TLSServerCapabilities();
    }

    /**
     * Create an instance of {@link KeystoreCapabilities.AnyElement }
     * 
     */
    public KeystoreCapabilities.AnyElement createKeystoreCapabilitiesAnyElement() {
        return new KeystoreCapabilities.AnyElement();
    }

    /**
     * Create an instance of {@link CertPathValidationPolicy.AnyParameters }
     * 
     */
    public CertPathValidationPolicy.AnyParameters createCertPathValidationPolicyAnyParameters() {
        return new CertPathValidationPolicy.AnyParameters();
    }

    /**
     * Create an instance of {@link CertPathValidationParameters.AnyParameters }
     * 
     */
    public CertPathValidationParameters.AnyParameters createCertPathValidationParametersAnyParameters() {
        return new CertPathValidationParameters.AnyParameters();
    }

    /**
     * Create an instance of {@link PassphraseAttribute.Extension }
     * 
     */
    public PassphraseAttribute.Extension createPassphraseAttributeExtension() {
        return new PassphraseAttribute.Extension();
    }

    /**
     * Create an instance of {@link CertificationPath.AnyElement }
     * 
     */
    public CertificationPath.AnyElement createCertificationPathAnyElement() {
        return new CertificationPath.AnyElement();
    }

    /**
     * Create an instance of {@link AlgorithmIdentifier.AnyParameters }
     * 
     */
    public AlgorithmIdentifier.AnyParameters createAlgorithmIdentifierAnyParameters() {
        return new AlgorithmIdentifier.AnyParameters();
    }

    /**
     * Create an instance of {@link CSRAttribute.AnyAttribute }
     * 
     */
    public CSRAttribute.AnyAttribute createCSRAttributeAnyAttribute() {
        return new CSRAttribute.AnyAttribute();
    }

    /**
     * Create an instance of {@link DistinguishedName.AnyAttribute }
     * 
     */
    public DistinguishedName.AnyAttribute createDistinguishedNameAnyAttribute() {
        return new DistinguishedName.AnyAttribute();
    }

    /**
     * Create an instance of {@link KeyAttribute.Extension }
     * 
     */
    public KeyAttribute.Extension createKeyAttributeExtension() {
        return new KeyAttribute.Extension();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/advancedsecurity/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<Capabilities>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/advancedsecurity/wsdl", name = "CertPathValidationPolicyID", scope = GetAssignedCertPathValidationPoliciesResponse.class)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    public JAXBElement<String> createGetAssignedCertPathValidationPoliciesResponseCertPathValidationPolicyID(String value) {
        return new JAXBElement<String>(_GetAssignedCertPathValidationPoliciesResponseCertPathValidationPolicyID_QNAME, String.class, GetAssignedCertPathValidationPoliciesResponse.class, value);
    }

}
