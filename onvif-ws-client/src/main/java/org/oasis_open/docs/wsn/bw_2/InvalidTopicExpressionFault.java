
package org.oasis_open.docs.wsn.bw_2;

import jakarta.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 4.0.1
 * Generated source version: 4.0.1
 */

@WebFault(name = "InvalidTopicExpressionFault", targetNamespace = "http://docs.oasis-open.org/wsn/b-2")
public class InvalidTopicExpressionFault extends Exception {

    private org.oasis_open.docs.wsn.b_2.InvalidTopicExpressionFaultType faultInfo;

    public InvalidTopicExpressionFault() {
        super();
    }

    public InvalidTopicExpressionFault(String message) {
        super(message);
    }

    public InvalidTopicExpressionFault(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public InvalidTopicExpressionFault(String message, org.oasis_open.docs.wsn.b_2.InvalidTopicExpressionFaultType invalidTopicExpressionFault) {
        super(message);
        this.faultInfo = invalidTopicExpressionFault;
    }

    public InvalidTopicExpressionFault(String message, org.oasis_open.docs.wsn.b_2.InvalidTopicExpressionFaultType invalidTopicExpressionFault, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = invalidTopicExpressionFault;
    }

    public org.oasis_open.docs.wsn.b_2.InvalidTopicExpressionFaultType getFaultInfo() {
        return this.faultInfo;
    }
}
