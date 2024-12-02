package org.onvif.ver10.receiver.wsdl;

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
@WebService(targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", name = "ReceiverPort")
@XmlSeeAlso({org.oasis_open.docs.wsrf.bf_2.ObjectFactory.class, ObjectFactory.class, org.w3._2004._08.xop.include.ObjectFactory.class, org.onvif.ver10.schema.ObjectFactory.class, org.oasis_open.docs.wsn.b_2.ObjectFactory.class, org.oasis_open.docs.wsn.t_1.ObjectFactory.class, org.w3._2003._05.soap_envelope.ObjectFactory.class, org.w3._2005._05.xmlmime.ObjectFactory.class})
public interface ReceiverPort {

    /**
     * Lists all receivers currently present on a device. This operation is mandatory.
     *       
     */
    @WebMethod(operationName = "GetReceivers", action = "http://www.onvif.org/ver10/receiver/wsdl/GetReceivers")
    @RequestWrapper(localName = "GetReceivers", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.GetReceivers")
    @ResponseWrapper(localName = "GetReceiversResponse", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.GetReceiversResponse")
    @WebResult(name = "Receivers", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
    public java.util.List<org.onvif.ver10.schema.Receiver> getReceivers()
;

    /**
     * Creates a new receiver. This operation is mandatory, although the service may
     * raise a fault if the receiver cannot be created.
     *       
     */
    @WebMethod(operationName = "CreateReceiver", action = "http://www.onvif.org/ver10/receiver/wsdl/CreateReceiver")
    @RequestWrapper(localName = "CreateReceiver", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.CreateReceiver")
    @ResponseWrapper(localName = "CreateReceiverResponse", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.CreateReceiverResponse")
    @WebResult(name = "Receiver", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
    public org.onvif.ver10.schema.Receiver createReceiver(

        @WebParam(name = "Configuration", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
        org.onvif.ver10.schema.ReceiverConfiguration configuration
    );

    /**
     * Configures an existing receiver. This operation is mandatory.
     *       
     */
    @WebMethod(operationName = "ConfigureReceiver", action = "http://www.onvif.org/ver10/receiver/wsdl/ConfigureReceiver")
    @RequestWrapper(localName = "ConfigureReceiver", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.ConfigureReceiver")
    @ResponseWrapper(localName = "ConfigureReceiverResponse", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.ConfigureReceiverResponse")
    public void configureReceiver(

        @WebParam(name = "ReceiverToken", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
        java.lang.String receiverToken,
        @WebParam(name = "Configuration", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
        org.onvif.ver10.schema.ReceiverConfiguration configuration
    );

    /**
     * Determines whether the receiver is currently disconnected, connected or
     * attempting to connect.
     * This operation is mandatory.
     *       
     */
    @WebMethod(operationName = "GetReceiverState", action = "http://www.onvif.org/ver10/receiver/wsdl/GetReceiverState")
    @RequestWrapper(localName = "GetReceiverState", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.GetReceiverState")
    @ResponseWrapper(localName = "GetReceiverStateResponse", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.GetReceiverStateResponse")
    @WebResult(name = "ReceiverState", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
    public org.onvif.ver10.schema.ReceiverStateInformation getReceiverState(

        @WebParam(name = "ReceiverToken", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
        java.lang.String receiverToken
    );

    /**
     * Returns the capabilities of the receiver service. The result is returned
     *         in a typed answer.
     *       
     */
    @WebMethod(operationName = "GetServiceCapabilities", action = "http://www.onvif.org/ver10/receiver/wsdl/GetServiceCapabilities")
    @RequestWrapper(localName = "GetServiceCapabilities", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.GetServiceCapabilities")
    @ResponseWrapper(localName = "GetServiceCapabilitiesResponse", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.GetServiceCapabilitiesResponse")
    @WebResult(name = "Capabilities", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
    public org.onvif.ver10.receiver.wsdl.Capabilities getServiceCapabilities()
;

    /**
     * Deletes an existing receiver. A receiver may be deleted only if it is not
     * currently in use; otherwise a fault shall be raised.
     * This operation is mandatory.
     *       
     */
    @WebMethod(operationName = "DeleteReceiver", action = "http://www.onvif.org/ver10/receiver/wsdl/DeleteReceiver")
    @RequestWrapper(localName = "DeleteReceiver", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.DeleteReceiver")
    @ResponseWrapper(localName = "DeleteReceiverResponse", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.DeleteReceiverResponse")
    public void deleteReceiver(

        @WebParam(name = "ReceiverToken", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
        java.lang.String receiverToken
    );

    /**
     * Sets the mode of the receiver without affecting the rest of its configuration.
     * This operation is mandatory.
     *       
     */
    @WebMethod(operationName = "SetReceiverMode", action = "http://www.onvif.org/ver10/receiver/wsdl/SetReceiverMode")
    @RequestWrapper(localName = "SetReceiverMode", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.SetReceiverMode")
    @ResponseWrapper(localName = "SetReceiverModeResponse", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.SetReceiverModeResponse")
    public void setReceiverMode(

        @WebParam(name = "ReceiverToken", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
        java.lang.String receiverToken,
        @WebParam(name = "Mode", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
        org.onvif.ver10.schema.ReceiverMode mode
    );

    /**
     * Retrieves the details of a specific receiver. This operation is mandatory.
     *       
     */
    @WebMethod(operationName = "GetReceiver", action = "http://www.onvif.org/ver10/receiver/wsdl/GetReceiver")
    @RequestWrapper(localName = "GetReceiver", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.GetReceiver")
    @ResponseWrapper(localName = "GetReceiverResponse", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl", className = "org.onvif.ver10.receiver.wsdl.GetReceiverResponse")
    @WebResult(name = "Receiver", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
    public org.onvif.ver10.schema.Receiver getReceiver(

        @WebParam(name = "ReceiverToken", targetNamespace = "http://www.onvif.org/ver10/receiver/wsdl")
        java.lang.String receiverToken
    );
}
