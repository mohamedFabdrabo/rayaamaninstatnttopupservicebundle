package com.paymentplaform.raya.gate;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * POS gateway
 *
 * This class was generated by Apache CXF 3.0.4
 * 2017-07-30T18:56:30.514+02:00
 * Generated source version: 3.0.4
 * 
 */
@WebServiceClient(name = "AmanPaymentServer", 
                  wsdlLocation = "classpath:wsdl/POSGW_PROXY.wsdl",
                  targetNamespace = "http://raya.paymentplaform.com/gate") 
public class AmanPaymentServer extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://raya.paymentplaform.com/gate", "AmanPaymentServer");
    public final static QName SVPOSGateSOAP = new QName("http://raya.paymentplaform.com/gate", "SVPOSGateSOAP");
    static {
        URL url = AmanPaymentServer.class.getClassLoader().getResource("wsdl/POSGW_PROXY.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(AmanPaymentServer.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/POSGW_PROXY.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public AmanPaymentServer(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AmanPaymentServer(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AmanPaymentServer() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AmanPaymentServer(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AmanPaymentServer(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AmanPaymentServer(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns Gate
     */
    @WebEndpoint(name = "SVPOSGateSOAP")
    public Gate getSVPOSGateSOAP() {
        return super.getPort(SVPOSGateSOAP, Gate.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Gate
     */
    @WebEndpoint(name = "SVPOSGateSOAP")
    public Gate getSVPOSGateSOAP(WebServiceFeature... features) {
        return super.getPort(SVPOSGateSOAP, Gate.class, features);
    }

}
