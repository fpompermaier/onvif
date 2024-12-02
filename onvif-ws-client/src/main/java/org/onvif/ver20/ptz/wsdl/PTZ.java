package org.onvif.ver20.ptz.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 4.0.1
 * Generated source version: 4.0.1
 *
 */
@WebService(targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", name = "PTZ")
@XmlSeeAlso({ObjectFactory.class, org.oasis_open.docs.wsrf.bf_2.ObjectFactory.class, org.w3._2004._08.xop.include.ObjectFactory.class, org.onvif.ver10.schema.ObjectFactory.class, org.oasis_open.docs.wsn.b_2.ObjectFactory.class, org.oasis_open.docs.wsn.t_1.ObjectFactory.class, org.w3._2003._05.soap_envelope.ObjectFactory.class, org.w3._2005._05.xmlmime.ObjectFactory.class})
public interface PTZ {

    /**
     * The SetPreset command saves the current device position parameters so that the device can
     * move to the saved preset position through the GotoPreset operation.
     * In order to create a new preset, the SetPresetRequest contains no PresetToken. If creation
     * is
     * successful, the Response contains the PresetToken which uniquely identifies the Preset. An
     * existing Preset can be overwritten by specifying the PresetToken of the corresponding
     * Preset.
     * In both cases (overwriting or creation) an optional PresetName can be specified. The
     * operation fails if the PTZ device is moving during the SetPreset operation.
     * The device MAY internally save additional states such as imaging properties in the PTZ
     * Preset which then should be recalled in the GotoPreset operation.
     *       
     */
    @WebMethod(operationName = "SetPreset", action = "http://www.onvif.org/ver20/ptz/wsdl/SetPreset")
    @RequestWrapper(localName = "SetPreset", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.SetPreset")
    @ResponseWrapper(localName = "SetPresetResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.SetPresetResponse")
    public void setPreset(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "PresetName", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String presetName,
        @WebParam(mode = WebParam.Mode.INOUT, name = "PresetToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        jakarta.xml.ws.Holder<java.lang.String> presetToken
    );

    /**
     * Operation for continuous Pan/Tilt and Zoom movements. The operation is
     *         supported if the PTZNode supports at least one continuous Pan/Tilt or Zoom space. If the
     *         space argument is omitted, the default space set by the PTZConfiguration will be used.
     *       
     */
    @WebMethod(operationName = "ContinuousMove", action = "http://www.onvif.org/ver20/ptz/wsdl/ContinuousMove")
    @RequestWrapper(localName = "ContinuousMove", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.ContinuousMove")
    @ResponseWrapper(localName = "ContinuousMoveResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.ContinuousMoveResponse")
    public void continuousMove(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "Velocity", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        org.onvif.ver10.schema.PTZSpeed velocity,
        @WebParam(name = "Timeout", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        javax.xml.datatype.Duration timeout
    );

    /**
     * Operation to request PTZ status for the Node in the
     * selected profile.
     *       
     */
    @WebMethod(operationName = "GetStatus", action = "http://www.onvif.org/ver20/ptz/wsdl/GetStatus")
    @RequestWrapper(localName = "GetStatus", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetStatus")
    @ResponseWrapper(localName = "GetStatusResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetStatusResponse")
    @WebResult(name = "PTZStatus", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public org.onvif.ver10.schema.PTZStatus getStatus(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken
    );

    /**
     * Operation to perform specific operation on the preset tour in selected
     *         media profile.
     *       
     */
    @WebMethod(operationName = "OperatePresetTour", action = "http://www.onvif.org/ver20/ptz/wsdl/OperatePresetTour")
    @RequestWrapper(localName = "OperatePresetTour", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.OperatePresetTour")
    @ResponseWrapper(localName = "OperatePresetTourResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.OperatePresetTourResponse")
    public void operatePresetTour(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "PresetTourToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String presetTourToken,
        @WebParam(name = "Operation", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        org.onvif.ver10.schema.PTZPresetTourOperation operation
    );

    /**
     * Operation to save current position as the home position.
     *         The SetHomePosition command returns with a failure if the “home” position is fixed and
     *         cannot be overwritten. If the SetHomePosition is successful, it is possible to recall the
     *         Home Position with the GotoHomePosition command.
     *       
     */
    @WebMethod(operationName = "SetHomePosition", action = "http://www.onvif.org/ver20/ptz/wsdl/SetHomePosition")
    @RequestWrapper(localName = "SetHomePosition", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.SetHomePosition")
    @ResponseWrapper(localName = "SetHomePositionResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.SetHomePositionResponse")
    public void setHomePosition(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken
    );

    /**
     * Operation to create a preset tour for the selected media profile.
     *       
     */
    @WebMethod(operationName = "CreatePresetTour", action = "http://www.onvif.org/ver20/ptz/wsdl/CreatePresetTour")
    @RequestWrapper(localName = "CreatePresetTour", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.CreatePresetTour")
    @ResponseWrapper(localName = "CreatePresetTourResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.CreatePresetTourResponse")
    @WebResult(name = "PresetTourToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public java.lang.String createPresetTour(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken
    );

    /**
     * Operation to modify a preset tour for the selected media profile.
     *       
     */
    @WebMethod(operationName = "ModifyPresetTour", action = "http://www.onvif.org/ver20/ptz/wsdl/ModifyPresetTour")
    @RequestWrapper(localName = "ModifyPresetTour", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.ModifyPresetTour")
    @ResponseWrapper(localName = "ModifyPresetTourResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.ModifyPresetTourResponse")
    public void modifyPresetTour(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "PresetTour", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        org.onvif.ver10.schema.PresetTour presetTour
    );

    /**
     * Operation to stop ongoing pan, tilt and zoom movements of absolute
     *         relative and continuous type.
     *         If no stop argument for pan, tilt or zoom is set, the device will stop all ongoing pan, tilt
     *         and zoom movements.
     *       
     */
    @WebMethod(operationName = "Stop", action = "http://www.onvif.org/ver20/ptz/wsdl/Stop")
    @RequestWrapper(localName = "Stop", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.Stop")
    @ResponseWrapper(localName = "StopResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.StopResponse")
    public void stop(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "PanTilt", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.Boolean panTilt,
        @WebParam(name = "Zoom", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.Boolean zoom
    );

    /**
     * Get all the existing PTZConfigurations from the device.
     * 
     * The default Position/Translation/Velocity Spaces are introduced to allow NVCs sending move
     * requests without the need to specify a certain coordinate system. The default Speeds are
     * introduced to control the speed of move requests (absolute, relative, preset), where no
     * explicit speed has been set.
     * 
     * The allowed pan and tilt range for Pan/Tilt Limits is defined by a two-dimensional space
     * range
     * that is mapped to a specific Absolute Pan/Tilt Position Space. At least one Pan/Tilt
     * Position
     * Space is required by the PTZNode to support Pan/Tilt limits. The limits apply to all
     * supported
     * absolute, relative and continuous Pan/Tilt movements. The limits shall be checked within the
     * coordinate system for which the limits have been specified. That means that even if
     * movements are specified in a different coordinate system, the requested movements shall be
     * transformed to the coordinate system of the limits where the limits can be checked. When a
     * relative or continuous movements is specified, which would leave the specified limits, the
     * PTZ
     * unit has to move along the specified limits. The Zoom Limits have to be interpreted
     * accordingly.
     *       
     */
    @WebMethod(operationName = "GetConfigurations", action = "http://www.onvif.org/ver20/ptz/wsdl/GetConfigurations")
    @RequestWrapper(localName = "GetConfigurations", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetConfigurations")
    @ResponseWrapper(localName = "GetConfigurationsResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetConfigurationsResponse")
    @WebResult(name = "PTZConfiguration", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public java.util.List<org.onvif.ver10.schema.PTZConfiguration> getConfigurations()
;

    /**
     * Operation to request PTZ preset tours in the selected media profiles.
     *       
     */
    @WebMethod(operationName = "GetPresetTours", action = "http://www.onvif.org/ver20/ptz/wsdl/GetPresetTours")
    @RequestWrapper(localName = "GetPresetTours", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetPresetTours")
    @ResponseWrapper(localName = "GetPresetToursResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetPresetToursResponse")
    @WebResult(name = "PresetTour", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public java.util.List<org.onvif.ver10.schema.PresetTour> getPresetTours(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken
    );

    /**
     * Operation to remove a PTZ preset for the Node in
     * the
     * selected profile. The operation is supported if the
     * PresetPosition
     * capability exists for teh Node in the
     * selected profile.
     *       
     */
    @WebMethod(operationName = "RemovePreset", action = "http://www.onvif.org/ver20/ptz/wsdl/RemovePreset")
    @RequestWrapper(localName = "RemovePreset", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.RemovePreset")
    @ResponseWrapper(localName = "RemovePresetResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.RemovePresetResponse")
    public void removePreset(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "PresetToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String presetToken
    );

    /**
     * Operation to request a specific PTZ preset tour in the selected media
     *         profile.
     *       
     */
    @WebMethod(operationName = "GetPresetTour", action = "http://www.onvif.org/ver20/ptz/wsdl/GetPresetTour")
    @RequestWrapper(localName = "GetPresetTour", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetPresetTour")
    @ResponseWrapper(localName = "GetPresetTourResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetPresetTourResponse")
    @WebResult(name = "PresetTour", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public org.onvif.ver10.schema.PresetTour getPresetTour(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "PresetTourToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String presetTourToken
    );

    /**
     * Operation for Relative Pan/Tilt and Zoom Move. The operation is supported
     *         if the PTZNode supports at least one relative Pan/Tilt or Zoom space.
     *         
     *         The speed argument is optional. If an x/y speed value is given it is up to the device to
     *         either use
     *         the x value as absolute resoluting speed vector or to map x and y to the component speed.
     *         If the speed argument is omitted, the default speed set by the PTZConfiguration will be
     *         used.
     *       
     */
    @WebMethod(operationName = "RelativeMove", action = "http://www.onvif.org/ver20/ptz/wsdl/RelativeMove")
    @RequestWrapper(localName = "RelativeMove", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.RelativeMove")
    @ResponseWrapper(localName = "RelativeMoveResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.RelativeMoveResponse")
    public void relativeMove(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "Translation", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        org.onvif.ver10.schema.PTZVector translation,
        @WebParam(name = "Speed", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        org.onvif.ver10.schema.PTZSpeed speed
    );

    /**
     * Operation to move the PTZ device to it's "home" position. The operation is
     * supported if the HomeSupported element in the PTZNode is true.
     *       
     */
    @WebMethod(operationName = "GotoHomePosition", action = "http://www.onvif.org/ver20/ptz/wsdl/GotoHomePosition")
    @RequestWrapper(localName = "GotoHomePosition", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GotoHomePosition")
    @ResponseWrapper(localName = "GotoHomePositionResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GotoHomePositionResponse")
    public void gotoHomePosition(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "Speed", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        org.onvif.ver10.schema.PTZSpeed speed
    );

    /**
     * Returns the capabilities of the PTZ service. The result is returned in a
     *         typed answer.
     *       
     */
    @WebMethod(operationName = "GetServiceCapabilities", action = "http://www.onvif.org/ver20/ptz/wsdl/GetServiceCapabilities")
    @RequestWrapper(localName = "GetServiceCapabilities", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetServiceCapabilities")
    @ResponseWrapper(localName = "GetServiceCapabilitiesResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetServiceCapabilitiesResponse")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public org.onvif.ver20.ptz.wsdl.Capabilities getServiceCapabilities()
;

    /**
     * Get a specific PTZonfiguration from the device, identified by its
     *         reference token or name.
     *         
     *         The default Position/Translation/Velocity Spaces are introduced to allow NVCs sending move
     *         requests without the need to specify a certain coordinate system. The default Speeds are
     *         introduced to control the speed of move requests (absolute, relative, preset), where no
     *         explicit speed has been set.
     *         
     *         The allowed pan and tilt range for Pan/Tilt Limits is defined by a two-dimensional space
     *         range
     *         that is mapped to a specific Absolute Pan/Tilt Position Space. At least one Pan/Tilt
     *         Position
     *         Space is required by the PTZNode to support Pan/Tilt limits. The limits apply to all
     *         supported
     *         absolute, relative and continuous Pan/Tilt movements. The limits shall be checked within the
     *         coordinate system for which the limits have been specified. That means that even if
     *         movements are specified in a different coordinate system, the requested movements shall be
     *         transformed to the coordinate system of the limits where the limits can be checked. When a
     *         relative or continuous movements is specified, which would leave the specified limits, the
     *         PTZ
     *         unit has to move along the specified limits. The Zoom Limits have to be interpreted
     *         accordingly.
     *       
     */
    @WebMethod(operationName = "GetConfiguration", action = "http://www.onvif.org/ver20/ptz/wsdl/GetConfiguration")
    @RequestWrapper(localName = "GetConfiguration", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetConfiguration")
    @ResponseWrapper(localName = "GetConfigurationResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetConfigurationResponse")
    @WebResult(name = "PTZConfiguration", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public org.onvif.ver10.schema.PTZConfiguration getConfiguration(

        @WebParam(name = "PTZConfigurationToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String ptzConfigurationToken
    );

    /**
     * Operation to send auxiliary commands to the PTZ device
     * mapped by the PTZNode in the selected profile. The
     * operation is supported
     * if the AuxiliarySupported element of the PTZNode is true
     *       
     */
    @WebMethod(operationName = "SendAuxiliaryCommand", action = "http://www.onvif.org/ver20/ptz/wsdl/SendAuxiliaryCommand")
    @RequestWrapper(localName = "SendAuxiliaryCommand", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.SendAuxiliaryCommand")
    @ResponseWrapper(localName = "SendAuxiliaryCommandResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.SendAuxiliaryCommandResponse")
    @WebResult(name = "AuxiliaryResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public java.lang.String sendAuxiliaryCommand(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "AuxiliaryData", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String auxiliaryData
    );

    /**
     * Set/update a existing PTZConfiguration on the device.
     *       
     */
    @WebMethod(operationName = "SetConfiguration", action = "http://www.onvif.org/ver20/ptz/wsdl/SetConfiguration")
    @RequestWrapper(localName = "SetConfiguration", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.SetConfiguration")
    @ResponseWrapper(localName = "SetConfigurationResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.SetConfigurationResponse")
    public void setConfiguration(

        @WebParam(name = "PTZConfiguration", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        org.onvif.ver10.schema.PTZConfiguration ptzConfiguration,
        @WebParam(name = "ForcePersistence", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        boolean forcePersistence
    );

    /**
     * Operation to request all PTZ presets for the PTZNode
     * in the selected profile. The operation is supported if there is support
     * for at least on PTZ preset by the PTZNode.
     *       
     */
    @WebMethod(operationName = "GetPresets", action = "http://www.onvif.org/ver20/ptz/wsdl/GetPresets")
    @RequestWrapper(localName = "GetPresets", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetPresets")
    @ResponseWrapper(localName = "GetPresetsResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetPresetsResponse")
    @WebResult(name = "Preset", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public java.util.List<org.onvif.ver10.schema.PTZPreset> getPresets(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken
    );

    /**
     * Get a specific PTZ Node identified by a reference
     *         token or a name.
     *       
     */
    @WebMethod(operationName = "GetNode", action = "http://www.onvif.org/ver20/ptz/wsdl/GetNode")
    @RequestWrapper(localName = "GetNode", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetNode")
    @ResponseWrapper(localName = "GetNodeResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetNodeResponse")
    @WebResult(name = "PTZNode", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public org.onvif.ver10.schema.PTZNode getNode(

        @WebParam(name = "NodeToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String nodeToken
    );

    /**
     * Operation to go to a saved preset position for the
     * PTZNode in the selected profile. The operation is supported if there is
     * support for at least on PTZ preset by the PTZNode.
     *       
     */
    @WebMethod(operationName = "GotoPreset", action = "http://www.onvif.org/ver20/ptz/wsdl/GotoPreset")
    @RequestWrapper(localName = "GotoPreset", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GotoPreset")
    @ResponseWrapper(localName = "GotoPresetResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GotoPresetResponse")
    public void gotoPreset(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "PresetToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String presetToken,
        @WebParam(name = "Speed", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        org.onvif.ver10.schema.PTZSpeed speed
    );

    /**
     * Operation to delete a specific preset tour from the media profile.
     *       
     */
    @WebMethod(operationName = "RemovePresetTour", action = "http://www.onvif.org/ver20/ptz/wsdl/RemovePresetTour")
    @RequestWrapper(localName = "RemovePresetTour", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.RemovePresetTour")
    @ResponseWrapper(localName = "RemovePresetTourResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.RemovePresetTourResponse")
    public void removePresetTour(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "PresetTourToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String presetTourToken
    );

    /**
     * Get the descriptions of the available PTZ Nodes.
     * 
     * A PTZ-capable device may have multiple PTZ Nodes. The PTZ Nodes may represent
     * mechanical PTZ drivers, uploaded PTZ drivers or digital PTZ drivers. PTZ Nodes are the
     * lowest level entities in the PTZ control API and reflect the supported PTZ capabilities. The
     * PTZ Node is referenced either by its name or by its reference token.
     *       
     */
    @WebMethod(operationName = "GetNodes", action = "http://www.onvif.org/ver20/ptz/wsdl/GetNodes")
    @RequestWrapper(localName = "GetNodes", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetNodes")
    @ResponseWrapper(localName = "GetNodesResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetNodesResponse")
    @WebResult(name = "PTZNode", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public java.util.List<org.onvif.ver10.schema.PTZNode> getNodes()
;

    /**
     * Operation to request available options to configure PTZ preset tour.
     *       
     */
    @WebMethod(operationName = "GetPresetTourOptions", action = "http://www.onvif.org/ver20/ptz/wsdl/GetPresetTourOptions")
    @RequestWrapper(localName = "GetPresetTourOptions", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetPresetTourOptions")
    @ResponseWrapper(localName = "GetPresetTourOptionsResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetPresetTourOptionsResponse")
    @WebResult(name = "Options", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public org.onvif.ver10.schema.PTZPresetTourOptions getPresetTourOptions(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "PresetTourToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String presetTourToken
    );

    /**
     * Operation to move pan,tilt or zoom to a absolute destination.
     *         
     *         The speed argument is optional. If an x/y speed value is given it is up to the device to
     *         either use
     *         the x value as absolute resoluting speed vector or to map x and y to the component speed.
     *         If the speed argument is omitted, the default speed set by the PTZConfiguration will be
     *         used.
     *       
     */
    @WebMethod(operationName = "AbsoluteMove", action = "http://www.onvif.org/ver20/ptz/wsdl/AbsoluteMove")
    @RequestWrapper(localName = "AbsoluteMove", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.AbsoluteMove")
    @ResponseWrapper(localName = "AbsoluteMoveResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.AbsoluteMoveResponse")
    public void absoluteMove(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken,
        @WebParam(name = "Position", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        org.onvif.ver10.schema.PTZVector position,
        @WebParam(name = "Speed", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        org.onvif.ver10.schema.PTZSpeed speed
    );

    /**
     * Operation to get all available PTZConfigurations that can be added to the
     *         referenced media profile.
     *         
     *         A device providing more than one PTZConfiguration or more than one VideoSourceConfiguration
     *         or which has any other resource
     *         interdependency between PTZConfiguration entities and other resources listable in a media
     *         profile should implement this operation.
     *         PTZConfiguration entities returned by this operation shall not fail on adding them to the
     *         referenced media profile.
     *       
     */
    @WebMethod(operationName = "GetCompatibleConfigurations", action = "http://www.onvif.org/ver20/ptz/wsdl/GetCompatibleConfigurations")
    @RequestWrapper(localName = "GetCompatibleConfigurations", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetCompatibleConfigurations")
    @ResponseWrapper(localName = "GetCompatibleConfigurationsResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetCompatibleConfigurationsResponse")
    @WebResult(name = "PTZConfiguration", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public java.util.List<org.onvif.ver10.schema.PTZConfiguration> getCompatibleConfigurations(

        @WebParam(name = "ProfileToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String profileToken
    );

    /**
     * List supported coordinate systems including their range limitations. Therefore, the options
     * MAY differ depending on whether the PTZ Configuration is assigned to a Profile containing a
     * Video Source Configuration. In that case, the options may additionally contain coordinate
     * systems referring to the image coordinate system described by the Video Source
     * Configuration. If the PTZ Node supports continuous movements, it shall return a Timeout
     * Range within
     * which Timeouts are accepted by the PTZ Node.
     *       
     */
    @WebMethod(operationName = "GetConfigurationOptions", action = "http://www.onvif.org/ver20/ptz/wsdl/GetConfigurationOptions")
    @RequestWrapper(localName = "GetConfigurationOptions", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetConfigurationOptions")
    @ResponseWrapper(localName = "GetConfigurationOptionsResponse", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl", className = "org.onvif.ver20.ptz.wsdl.GetConfigurationOptionsResponse")
    @WebResult(name = "PTZConfigurationOptions", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
    public org.onvif.ver10.schema.PTZConfigurationOptions getConfigurationOptions(

        @WebParam(name = "ConfigurationToken", targetNamespace = "http://www.onvif.org/ver20/ptz/wsdl")
        java.lang.String configurationToken
    );
}
