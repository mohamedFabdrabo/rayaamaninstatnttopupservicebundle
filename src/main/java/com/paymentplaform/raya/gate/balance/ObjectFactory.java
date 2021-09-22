
package com.paymentplaform.raya.gate.balance;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.paymentplaform.raya.gate.balance package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.paymentplaform.raya.gate.balance
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InquiryBalanceResponse }
     * 
     */
    public InquiryBalanceResponse createInquiryBalanceResponse() {
        return new InquiryBalanceResponse();
    }

    /**
     * Create an instance of {@link InquiryBalanceRequest }
     * 
     */
    public InquiryBalanceRequest createInquiryBalanceRequest() {
        return new InquiryBalanceRequest();
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
     * Create an instance of {@link InquiryBalanceResponseType }
     * 
     */
    public InquiryBalanceResponseType createInquiryBalanceResponseType() {
        return new InquiryBalanceResponseType();
    }

    /**
     * Create an instance of {@link InquiryBalanceResponse.Balances }
     * 
     */
    public InquiryBalanceResponse.Balances createInquiryBalanceResponseBalances() {
        return new InquiryBalanceResponse.Balances();
    }

    /**
     * Create an instance of {@link InquiryBalanceResponse.ExtraAttributes }
     * 
     */
    public InquiryBalanceResponse.ExtraAttributes createInquiryBalanceResponseExtraAttributes() {
        return new InquiryBalanceResponse.ExtraAttributes();
    }

    /**
     * Create an instance of {@link InquiryBalanceRequest.RequesterIdentifier }
     * 
     */
    public InquiryBalanceRequest.RequesterIdentifier createInquiryBalanceRequestRequesterIdentifier() {
        return new InquiryBalanceRequest.RequesterIdentifier();
    }

    /**
     * Create an instance of {@link InquiryBalanceRequest.ExtraAttributes }
     * 
     */
    public InquiryBalanceRequest.ExtraAttributes createInquiryBalanceRequestExtraAttributes() {
        return new InquiryBalanceRequest.ExtraAttributes();
    }

}
