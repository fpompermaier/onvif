
package org.xmlsoap.schemas.ws._2005._04.discovery;

import java.util.List;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.xmlsoap.schemas.ws._2005._04.discovery package. 
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

    private final static QName _Hello_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "Hello");
    private final static QName _Bye_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "Bye");
    private final static QName _Probe_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "Probe");
    private final static QName _ProbeMatches_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "ProbeMatches");
    private final static QName _Resolve_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "Resolve");
    private final static QName _ResolveMatches_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "ResolveMatches");
    private final static QName _Types_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "Types");
    private final static QName _Scopes_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "Scopes");
    private final static QName _XAddrs_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "XAddrs");
    private final static QName _MetadataVersion_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "MetadataVersion");
    private final static QName _SupportedMatchingRules_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "SupportedMatchingRules");
    private final static QName _Security_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "Security");
    private final static QName _Sig_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "Sig");
    private final static QName _AppSequence_QNAME = new QName("http://schemas.xmlsoap.org/ws/2005/04/discovery", "AppSequence");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.xmlsoap.schemas.ws._2005._04.discovery
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloType }
     * 
     */
    public HelloType createHelloType() {
        return new HelloType();
    }

    /**
     * Create an instance of {@link ByeType }
     * 
     */
    public ByeType createByeType() {
        return new ByeType();
    }

    /**
     * Create an instance of {@link ProbeType }
     * 
     */
    public ProbeType createProbeType() {
        return new ProbeType();
    }

    /**
     * Create an instance of {@link ProbeMatchesType }
     * 
     */
    public ProbeMatchesType createProbeMatchesType() {
        return new ProbeMatchesType();
    }

    /**
     * Create an instance of {@link ResolveType }
     * 
     */
    public ResolveType createResolveType() {
        return new ResolveType();
    }

    /**
     * Create an instance of {@link ResolveMatchesType }
     * 
     */
    public ResolveMatchesType createResolveMatchesType() {
        return new ResolveMatchesType();
    }

    /**
     * Create an instance of {@link ScopesType }
     * 
     */
    public ScopesType createScopesType() {
        return new ScopesType();
    }

    /**
     * Create an instance of {@link SecurityType }
     * 
     */
    public SecurityType createSecurityType() {
        return new SecurityType();
    }

    /**
     * Create an instance of {@link SigType }
     * 
     */
    public SigType createSigType() {
        return new SigType();
    }

    /**
     * Create an instance of {@link AppSequenceType }
     * 
     */
    public AppSequenceType createAppSequenceType() {
        return new AppSequenceType();
    }

    /**
     * Create an instance of {@link ProbeMatchType }
     * 
     */
    public ProbeMatchType createProbeMatchType() {
        return new ProbeMatchType();
    }

    /**
     * Create an instance of {@link ResolveMatchType }
     * 
     */
    public ResolveMatchType createResolveMatchType() {
        return new ResolveMatchType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "Hello")
    public JAXBElement<HelloType> createHello(HelloType value) {
        return new JAXBElement<HelloType>(_Hello_QNAME, HelloType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ByeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ByeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "Bye")
    public JAXBElement<ByeType> createBye(ByeType value) {
        return new JAXBElement<ByeType>(_Bye_QNAME, ByeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProbeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProbeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "Probe")
    public JAXBElement<ProbeType> createProbe(ProbeType value) {
        return new JAXBElement<ProbeType>(_Probe_QNAME, ProbeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProbeMatchesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProbeMatchesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "ProbeMatches")
    public JAXBElement<ProbeMatchesType> createProbeMatches(ProbeMatchesType value) {
        return new JAXBElement<ProbeMatchesType>(_ProbeMatches_QNAME, ProbeMatchesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResolveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "Resolve")
    public JAXBElement<ResolveType> createResolve(ResolveType value) {
        return new JAXBElement<ResolveType>(_Resolve_QNAME, ResolveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResolveMatchesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ResolveMatchesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "ResolveMatches")
    public JAXBElement<ResolveMatchesType> createResolveMatches(ResolveMatchesType value) {
        return new JAXBElement<ResolveMatchesType>(_ResolveMatches_QNAME, ResolveMatchesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link QName }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link QName }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "Types")
    public JAXBElement<List<QName>> createTypes(List<QName> value) {
        return new JAXBElement<List<QName>>(_Types_QNAME, ((Class) List.class), null, ((List<QName> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScopesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ScopesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "Scopes")
    public JAXBElement<ScopesType> createScopes(ScopesType value) {
        return new JAXBElement<ScopesType>(_Scopes_QNAME, ScopesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "XAddrs")
    public JAXBElement<List<String>> createXAddrs(List<String> value) {
        return new JAXBElement<List<String>>(_XAddrs_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "MetadataVersion")
    public JAXBElement<Long> createMetadataVersion(Long value) {
        return new JAXBElement<Long>(_MetadataVersion_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "SupportedMatchingRules")
    public JAXBElement<List<String>> createSupportedMatchingRules(List<String> value) {
        return new JAXBElement<List<String>>(_SupportedMatchingRules_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SecurityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "Security")
    public JAXBElement<SecurityType> createSecurity(SecurityType value) {
        return new JAXBElement<SecurityType>(_Security_QNAME, SecurityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SigType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SigType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "Sig")
    public JAXBElement<SigType> createSig(SigType value) {
        return new JAXBElement<SigType>(_Sig_QNAME, SigType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppSequenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppSequenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/ws/2005/04/discovery", name = "AppSequence")
    public JAXBElement<AppSequenceType> createAppSequence(AppSequenceType value) {
        return new JAXBElement<AppSequenceType>(_AppSequence_QNAME, AppSequenceType.class, null, value);
    }

}
