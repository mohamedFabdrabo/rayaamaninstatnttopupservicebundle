
package com.paymentplaform.raya.gate.summary;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.paymentplaform.raya.gate.summary package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.paymentplaform.raya.gate.summary
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DailySummaryResponse }
     * 
     */
    public DailySummaryResponse createDailySummaryResponse() {
        return new DailySummaryResponse();
    }

    /**
     * Create an instance of {@link DailySummaryResponse.TrxnsSummary }
     * 
     */
    public DailySummaryResponse.TrxnsSummary createDailySummaryResponseTrxnsSummary() {
        return new DailySummaryResponse.TrxnsSummary();
    }

    /**
     * Create an instance of {@link DailySummaryRequest }
     * 
     */
    public DailySummaryRequest createDailySummaryRequest() {
        return new DailySummaryRequest();
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
     * Create an instance of {@link DailySummaryResponseType }
     * 
     */
    public DailySummaryResponseType createDailySummaryResponseType() {
        return new DailySummaryResponseType();
    }

    /**
     * Create an instance of {@link DailySummaryResponse.Balances }
     * 
     */
    public DailySummaryResponse.Balances createDailySummaryResponseBalances() {
        return new DailySummaryResponse.Balances();
    }

    /**
     * Create an instance of {@link DailySummaryResponse.ExtraAttributes }
     * 
     */
    public DailySummaryResponse.ExtraAttributes createDailySummaryResponseExtraAttributes() {
        return new DailySummaryResponse.ExtraAttributes();
    }

    /**
     * Create an instance of {@link DailySummaryResponse.TrxnsSummary.TrxnSummary }
     * 
     */
    public DailySummaryResponse.TrxnsSummary.TrxnSummary createDailySummaryResponseTrxnsSummaryTrxnSummary() {
        return new DailySummaryResponse.TrxnsSummary.TrxnSummary();
    }

    /**
     * Create an instance of {@link DailySummaryRequest.Requester }
     * 
     */
    public DailySummaryRequest.Requester createDailySummaryRequestRequester() {
        return new DailySummaryRequest.Requester();
    }

    /**
     * Create an instance of {@link DailySummaryRequest.ExtraAttributes }
     * 
     */
    public DailySummaryRequest.ExtraAttributes createDailySummaryRequestExtraAttributes() {
        return new DailySummaryRequest.ExtraAttributes();
    }

}
