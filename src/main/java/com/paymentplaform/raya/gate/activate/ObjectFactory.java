
package com.paymentplaform.raya.gate.activate;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.paymentplaform.raya.gate.activate package. 
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

    private final static QName _ActivateResponseRqUID_QNAME = new QName("", "RqUID");
    private final static QName _ActivateResponseAsynchUID_QNAME = new QName("", "AsynchUID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.paymentplaform.raya.gate.activate
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActivateResponse }
     * 
     */
    public ActivateResponse createActivateResponse() {
        return new ActivateResponse();
    }

    /**
     * Create an instance of {@link ActivateRequest }
     * 
     */
    public ActivateRequest createActivateRequest() {
        return new ActivateRequest();
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
     * Create an instance of {@link ActivateResponseType }
     * 
     */
    public ActivateResponseType createActivateResponseType() {
        return new ActivateResponseType();
    }

    /**
     * Create an instance of {@link ActivateResponse.ActivateParameters }
     * 
     */
    public ActivateResponse.ActivateParameters createActivateResponseActivateParameters() {
        return new ActivateResponse.ActivateParameters();
    }

    /**
     * Create an instance of {@link ActivateRequest.ActivateParameters }
     * 
     */
    public ActivateRequest.ActivateParameters createActivateRequestActivateParameters() {
        return new ActivateRequest.ActivateParameters();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "RqUID", scope = ActivateResponse.class)
    public JAXBElement<String> createActivateResponseRqUID(String value) {
        return new JAXBElement<String>(_ActivateResponseRqUID_QNAME, String.class, ActivateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AsynchUID", scope = ActivateResponse.class)
    public JAXBElement<String> createActivateResponseAsynchUID(String value) {
        return new JAXBElement<String>(_ActivateResponseAsynchUID_QNAME, String.class, ActivateResponse.class, value);
    }

}
