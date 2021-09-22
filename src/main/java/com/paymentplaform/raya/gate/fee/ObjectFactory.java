
package com.paymentplaform.raya.gate.fee;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.paymentplaform.raya.gate.fee package. 
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

    private final static QName _FeeResponseRqUID_QNAME = new QName("", "RqUID");
    private final static QName _FeeResponseAsynchUID_QNAME = new QName("", "AsynchUID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.paymentplaform.raya.gate.fee
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FeeResponse }
     * 
     */
    public FeeResponse createFeeResponse() {
        return new FeeResponse();
    }

    /**
     * Create an instance of {@link FeeRequest }
     * 
     */
    public FeeRequest createFeeRequest() {
        return new FeeRequest();
    }

    /**
     * Create an instance of {@link MessageBody }
     * 
     */
    public MessageBody createMessageBody() {
        return new MessageBody();
    }

    /**
     * Create an instance of {@link MessageHeader }
     * 
     */
    public MessageHeader createMessageHeader() {
        return new MessageHeader();
    }

    /**
     * Create an instance of {@link FeeResponseType }
     * 
     */
    public FeeResponseType createFeeResponseType() {
        return new FeeResponseType();
    }

    /**
     * Create an instance of {@link FeeResponse.FeeParameters }
     * 
     */
    public FeeResponse.FeeParameters createFeeResponseFeeParameters() {
        return new FeeResponse.FeeParameters();
    }

    /**
     * Create an instance of {@link FeeRequest.FeeParameters }
     * 
     */
    public FeeRequest.FeeParameters createFeeRequestFeeParameters() {
        return new FeeRequest.FeeParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RqUID", scope = FeeResponse.class)
    public JAXBElement<String> createFeeResponseRqUID(String value) {
        return new JAXBElement<String>(_FeeResponseRqUID_QNAME, String.class, FeeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AsynchUID", scope = FeeResponse.class)
    public JAXBElement<String> createFeeResponseAsynchUID(String value) {
        return new JAXBElement<String>(_FeeResponseAsynchUID_QNAME, String.class, FeeResponse.class, value);
    }

}
