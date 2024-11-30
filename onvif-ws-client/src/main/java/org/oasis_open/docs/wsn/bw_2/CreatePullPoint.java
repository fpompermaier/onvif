package org.oasis_open.docs.wsn.bw_2;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.5
 * Generated source version: 4.0.5
 *
 */
@WebService(targetNamespace = "http://docs.oasis-open.org/wsn/bw-2", name = "CreatePullPoint")
@XmlSeeAlso({org.oasis_open.docs.wsrf.r_2.ObjectFactory.class, org.oasis_open.docs.wsrf.bf_2.ObjectFactory.class, org.oasis_open.docs.wsn.b_2.ObjectFactory.class, org.oasis_open.docs.wsn.t_1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CreatePullPoint {

    @WebMethod(operationName = "CreatePullPoint")
    @WebResult(name = "CreatePullPointResponse", targetNamespace = "http://docs.oasis-open.org/wsn/b-2", partName = "CreatePullPointResponse")
    public org.oasis_open.docs.wsn.b_2.CreatePullPointResponse createPullPoint(

        @WebParam(partName = "CreatePullPointRequest", name = "CreatePullPoint", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
        org.oasis_open.docs.wsn.b_2.CreatePullPoint createPullPointRequest
    ) throws UnableToCreatePullPointFault;
}
