
package org.onvif.ver20.ptz.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver20.ptz.wsdl package. 
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

    private final static QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver20/ptz/wsdl", "Capabilities");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver20.ptz.wsdl
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
     * Create an instance of {@link GetNodes }
     * 
     */
    public GetNodes createGetNodes() {
        return new GetNodes();
    }

    /**
     * Create an instance of {@link GetNodesResponse }
     * 
     */
    public GetNodesResponse createGetNodesResponse() {
        return new GetNodesResponse();
    }

    /**
     * Create an instance of {@link GetNode }
     * 
     */
    public GetNode createGetNode() {
        return new GetNode();
    }

    /**
     * Create an instance of {@link GetNodeResponse }
     * 
     */
    public GetNodeResponse createGetNodeResponse() {
        return new GetNodeResponse();
    }

    /**
     * Create an instance of {@link GetConfigurations }
     * 
     */
    public GetConfigurations createGetConfigurations() {
        return new GetConfigurations();
    }

    /**
     * Create an instance of {@link GetConfigurationsResponse }
     * 
     */
    public GetConfigurationsResponse createGetConfigurationsResponse() {
        return new GetConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetConfiguration }
     * 
     */
    public GetConfiguration createGetConfiguration() {
        return new GetConfiguration();
    }

    /**
     * Create an instance of {@link GetConfigurationResponse }
     * 
     */
    public GetConfigurationResponse createGetConfigurationResponse() {
        return new GetConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetConfiguration }
     * 
     */
    public SetConfiguration createSetConfiguration() {
        return new SetConfiguration();
    }

    /**
     * Create an instance of {@link SetConfigurationResponse }
     * 
     */
    public SetConfigurationResponse createSetConfigurationResponse() {
        return new SetConfigurationResponse();
    }

    /**
     * Create an instance of {@link GetConfigurationOptions }
     * 
     */
    public GetConfigurationOptions createGetConfigurationOptions() {
        return new GetConfigurationOptions();
    }

    /**
     * Create an instance of {@link GetConfigurationOptionsResponse }
     * 
     */
    public GetConfigurationOptionsResponse createGetConfigurationOptionsResponse() {
        return new GetConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link SendAuxiliaryCommand }
     * 
     */
    public SendAuxiliaryCommand createSendAuxiliaryCommand() {
        return new SendAuxiliaryCommand();
    }

    /**
     * Create an instance of {@link SendAuxiliaryCommandResponse }
     * 
     */
    public SendAuxiliaryCommandResponse createSendAuxiliaryCommandResponse() {
        return new SendAuxiliaryCommandResponse();
    }

    /**
     * Create an instance of {@link GetPresets }
     * 
     */
    public GetPresets createGetPresets() {
        return new GetPresets();
    }

    /**
     * Create an instance of {@link GetPresetsResponse }
     * 
     */
    public GetPresetsResponse createGetPresetsResponse() {
        return new GetPresetsResponse();
    }

    /**
     * Create an instance of {@link SetPreset }
     * 
     */
    public SetPreset createSetPreset() {
        return new SetPreset();
    }

    /**
     * Create an instance of {@link SetPresetResponse }
     * 
     */
    public SetPresetResponse createSetPresetResponse() {
        return new SetPresetResponse();
    }

    /**
     * Create an instance of {@link RemovePreset }
     * 
     */
    public RemovePreset createRemovePreset() {
        return new RemovePreset();
    }

    /**
     * Create an instance of {@link RemovePresetResponse }
     * 
     */
    public RemovePresetResponse createRemovePresetResponse() {
        return new RemovePresetResponse();
    }

    /**
     * Create an instance of {@link GotoPreset }
     * 
     */
    public GotoPreset createGotoPreset() {
        return new GotoPreset();
    }

    /**
     * Create an instance of {@link GotoPresetResponse }
     * 
     */
    public GotoPresetResponse createGotoPresetResponse() {
        return new GotoPresetResponse();
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
     * Create an instance of {@link GotoHomePosition }
     * 
     */
    public GotoHomePosition createGotoHomePosition() {
        return new GotoHomePosition();
    }

    /**
     * Create an instance of {@link GotoHomePositionResponse }
     * 
     */
    public GotoHomePositionResponse createGotoHomePositionResponse() {
        return new GotoHomePositionResponse();
    }

    /**
     * Create an instance of {@link SetHomePosition }
     * 
     */
    public SetHomePosition createSetHomePosition() {
        return new SetHomePosition();
    }

    /**
     * Create an instance of {@link SetHomePositionResponse }
     * 
     */
    public SetHomePositionResponse createSetHomePositionResponse() {
        return new SetHomePositionResponse();
    }

    /**
     * Create an instance of {@link ContinuousMove }
     * 
     */
    public ContinuousMove createContinuousMove() {
        return new ContinuousMove();
    }

    /**
     * Create an instance of {@link ContinuousMoveResponse }
     * 
     */
    public ContinuousMoveResponse createContinuousMoveResponse() {
        return new ContinuousMoveResponse();
    }

    /**
     * Create an instance of {@link RelativeMove }
     * 
     */
    public RelativeMove createRelativeMove() {
        return new RelativeMove();
    }

    /**
     * Create an instance of {@link RelativeMoveResponse }
     * 
     */
    public RelativeMoveResponse createRelativeMoveResponse() {
        return new RelativeMoveResponse();
    }

    /**
     * Create an instance of {@link AbsoluteMove }
     * 
     */
    public AbsoluteMove createAbsoluteMove() {
        return new AbsoluteMove();
    }

    /**
     * Create an instance of {@link AbsoluteMoveResponse }
     * 
     */
    public AbsoluteMoveResponse createAbsoluteMoveResponse() {
        return new AbsoluteMoveResponse();
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
     * Create an instance of {@link GetPresetTours }
     * 
     */
    public GetPresetTours createGetPresetTours() {
        return new GetPresetTours();
    }

    /**
     * Create an instance of {@link GetPresetToursResponse }
     * 
     */
    public GetPresetToursResponse createGetPresetToursResponse() {
        return new GetPresetToursResponse();
    }

    /**
     * Create an instance of {@link GetPresetTour }
     * 
     */
    public GetPresetTour createGetPresetTour() {
        return new GetPresetTour();
    }

    /**
     * Create an instance of {@link GetPresetTourResponse }
     * 
     */
    public GetPresetTourResponse createGetPresetTourResponse() {
        return new GetPresetTourResponse();
    }

    /**
     * Create an instance of {@link GetPresetTourOptions }
     * 
     */
    public GetPresetTourOptions createGetPresetTourOptions() {
        return new GetPresetTourOptions();
    }

    /**
     * Create an instance of {@link GetPresetTourOptionsResponse }
     * 
     */
    public GetPresetTourOptionsResponse createGetPresetTourOptionsResponse() {
        return new GetPresetTourOptionsResponse();
    }

    /**
     * Create an instance of {@link CreatePresetTour }
     * 
     */
    public CreatePresetTour createCreatePresetTour() {
        return new CreatePresetTour();
    }

    /**
     * Create an instance of {@link CreatePresetTourResponse }
     * 
     */
    public CreatePresetTourResponse createCreatePresetTourResponse() {
        return new CreatePresetTourResponse();
    }

    /**
     * Create an instance of {@link ModifyPresetTour }
     * 
     */
    public ModifyPresetTour createModifyPresetTour() {
        return new ModifyPresetTour();
    }

    /**
     * Create an instance of {@link ModifyPresetTourResponse }
     * 
     */
    public ModifyPresetTourResponse createModifyPresetTourResponse() {
        return new ModifyPresetTourResponse();
    }

    /**
     * Create an instance of {@link OperatePresetTour }
     * 
     */
    public OperatePresetTour createOperatePresetTour() {
        return new OperatePresetTour();
    }

    /**
     * Create an instance of {@link OperatePresetTourResponse }
     * 
     */
    public OperatePresetTourResponse createOperatePresetTourResponse() {
        return new OperatePresetTourResponse();
    }

    /**
     * Create an instance of {@link RemovePresetTour }
     * 
     */
    public RemovePresetTour createRemovePresetTour() {
        return new RemovePresetTour();
    }

    /**
     * Create an instance of {@link RemovePresetTourResponse }
     * 
     */
    public RemovePresetTourResponse createRemovePresetTourResponse() {
        return new RemovePresetTourResponse();
    }

    /**
     * Create an instance of {@link GetCompatibleConfigurations }
     * 
     */
    public GetCompatibleConfigurations createGetCompatibleConfigurations() {
        return new GetCompatibleConfigurations();
    }

    /**
     * Create an instance of {@link GetCompatibleConfigurationsResponse }
     * 
     */
    public GetCompatibleConfigurationsResponse createGetCompatibleConfigurationsResponse() {
        return new GetCompatibleConfigurationsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Capabilities }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/ptz/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities> createCapabilities(Capabilities value) {
        return new JAXBElement<Capabilities>(_Capabilities_QNAME, Capabilities.class, null, value);
    }

}
