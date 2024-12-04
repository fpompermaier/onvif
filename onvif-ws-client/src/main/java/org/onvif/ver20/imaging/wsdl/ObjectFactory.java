
package org.onvif.ver20.imaging.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver20.imaging.wsdl package. 
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

    private final static QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver20/imaging/wsdl", "Capabilities");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver20.imaging.wsdl
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link Capabilities }
     * 
     */
    public Capabilities createCapabilities() {
        return new Capabilities();
    }

    /**
     * Create an instance of {@link GetImagingSettings }
     * 
     */
    public GetImagingSettings createGetImagingSettings() {
        return new GetImagingSettings();
    }

    /**
     * Create an instance of {@link GetImagingSettingsResponse }
     * 
     */
    public GetImagingSettingsResponse createGetImagingSettingsResponse() {
        return new GetImagingSettingsResponse();
    }

    /**
     * Create an instance of {@link SetImagingSettings }
     * 
     */
    public SetImagingSettings createSetImagingSettings() {
        return new SetImagingSettings();
    }

    /**
     * Create an instance of {@link SetImagingSettingsResponse }
     * 
     */
    public SetImagingSettingsResponse createSetImagingSettingsResponse() {
        return new SetImagingSettingsResponse();
    }

    /**
     * Create an instance of {@link GetOptions }
     * 
     */
    public GetOptions createGetOptions() {
        return new GetOptions();
    }

    /**
     * Create an instance of {@link GetOptionsResponse }
     * 
     */
    public GetOptionsResponse createGetOptionsResponse() {
        return new GetOptionsResponse();
    }

    /**
     * Create an instance of {@link Move }
     * 
     */
    public Move createMove() {
        return new Move();
    }

    /**
     * Create an instance of {@link MoveResponse }
     * 
     */
    public MoveResponse createMoveResponse() {
        return new MoveResponse();
    }

    /**
     * Create an instance of {@link GetMoveOptions }
     * 
     */
    public GetMoveOptions createGetMoveOptions() {
        return new GetMoveOptions();
    }

    /**
     * Create an instance of {@link GetMoveOptionsResponse }
     * 
     */
    public GetMoveOptionsResponse createGetMoveOptionsResponse() {
        return new GetMoveOptionsResponse();
    }

    /**
     * Create an instance of {@link Stop }
     * 
     */
    public Stop createStop() {
        return new Stop();
    }

    /**
     * Create an instance of {@link StopResponse }
     * 
     */
    public StopResponse createStopResponse() {
        return new StopResponse();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/imaging/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<Capabilities>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

}
