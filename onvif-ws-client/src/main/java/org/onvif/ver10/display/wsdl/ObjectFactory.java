
package org.onvif.ver10.display.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver10.display.wsdl package. 
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

    private final static QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver10/display/wsdl", "Capabilities");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver10.display.wsdl
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
     * Create an instance of {@link GetLayout }
     * 
     */
    public GetLayout createGetLayout() {
        return new GetLayout();
    }

    /**
     * Create an instance of {@link GetLayoutResponse }
     * 
     */
    public GetLayoutResponse createGetLayoutResponse() {
        return new GetLayoutResponse();
    }

    /**
     * Create an instance of {@link SetLayout }
     * 
     */
    public SetLayout createSetLayout() {
        return new SetLayout();
    }

    /**
     * Create an instance of {@link SetLayoutResponse }
     * 
     */
    public SetLayoutResponse createSetLayoutResponse() {
        return new SetLayoutResponse();
    }

    /**
     * Create an instance of {@link GetDisplayOptions }
     * 
     */
    public GetDisplayOptions createGetDisplayOptions() {
        return new GetDisplayOptions();
    }

    /**
     * Create an instance of {@link GetDisplayOptionsResponse }
     * 
     */
    public GetDisplayOptionsResponse createGetDisplayOptionsResponse() {
        return new GetDisplayOptionsResponse();
    }

    /**
     * Create an instance of {@link GetPaneConfigurations }
     * 
     */
    public GetPaneConfigurations createGetPaneConfigurations() {
        return new GetPaneConfigurations();
    }

    /**
     * Create an instance of {@link GetPaneConfigurationsResponse }
     * 
     */
    public GetPaneConfigurationsResponse createGetPaneConfigurationsResponse() {
        return new GetPaneConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetPaneConfiguration }
     * 
     */
    public GetPaneConfiguration createGetPaneConfiguration() {
        return new GetPaneConfiguration();
    }

    /**
     * Create an instance of {@link GetPaneConfigurationResponse }
     * 
     */
    public GetPaneConfigurationResponse createGetPaneConfigurationResponse() {
        return new GetPaneConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetPaneConfigurations }
     * 
     */
    public SetPaneConfigurations createSetPaneConfigurations() {
        return new SetPaneConfigurations();
    }

    /**
     * Create an instance of {@link SetPaneConfigurationsResponse }
     * 
     */
    public SetPaneConfigurationsResponse createSetPaneConfigurationsResponse() {
        return new SetPaneConfigurationsResponse();
    }

    /**
     * Create an instance of {@link SetPaneConfiguration }
     * 
     */
    public SetPaneConfiguration createSetPaneConfiguration() {
        return new SetPaneConfiguration();
    }

    /**
     * Create an instance of {@link SetPaneConfigurationResponse }
     * 
     */
    public SetPaneConfigurationResponse createSetPaneConfigurationResponse() {
        return new SetPaneConfigurationResponse();
    }

    /**
     * Create an instance of {@link CreatePaneConfiguration }
     * 
     */
    public CreatePaneConfiguration createCreatePaneConfiguration() {
        return new CreatePaneConfiguration();
    }

    /**
     * Create an instance of {@link CreatePaneConfigurationResponse }
     * 
     */
    public CreatePaneConfigurationResponse createCreatePaneConfigurationResponse() {
        return new CreatePaneConfigurationResponse();
    }

    /**
     * Create an instance of {@link DeletePaneConfiguration }
     * 
     */
    public DeletePaneConfiguration createDeletePaneConfiguration() {
        return new DeletePaneConfiguration();
    }

    /**
     * Create an instance of {@link DeletePaneConfigurationResponse }
     * 
     */
    public DeletePaneConfigurationResponse createDeletePaneConfigurationResponse() {
        return new DeletePaneConfigurationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver10/display/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<Capabilities>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

}
