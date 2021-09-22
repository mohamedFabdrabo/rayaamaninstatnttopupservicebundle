
package com.paymentplaform.raya.gate.search;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.paymentplaform.raya.gate.search package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.paymentplaform.raya.gate.search
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchTransactionsResponse }
     * 
     */
    public SearchTransactionsResponse createSearchTransactionsResponse() {
        return new SearchTransactionsResponse();
    }

    /**
     * Create an instance of {@link SearchTransactionsResponse.TrxnsData }
     * 
     */
    public SearchTransactionsResponse.TrxnsData createSearchTransactionsResponseTrxnsData() {
        return new SearchTransactionsResponse.TrxnsData();
    }

    /**
     * Create an instance of {@link SearchTransactionsRequest }
     * 
     */
    public SearchTransactionsRequest createSearchTransactionsRequest() {
        return new SearchTransactionsRequest();
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
     * Create an instance of {@link SearchTransactionsResponseType }
     * 
     */
    public SearchTransactionsResponseType createSearchTransactionsResponseType() {
        return new SearchTransactionsResponseType();
    }

    /**
     * Create an instance of {@link SearchTransactionsResponse.ExtraAttributes }
     * 
     */
    public SearchTransactionsResponse.ExtraAttributes createSearchTransactionsResponseExtraAttributes() {
        return new SearchTransactionsResponse.ExtraAttributes();
    }

    /**
     * Create an instance of {@link SearchTransactionsResponse.TrxnsData.TrxnData }
     * 
     */
    public SearchTransactionsResponse.TrxnsData.TrxnData createSearchTransactionsResponseTrxnsDataTrxnData() {
        return new SearchTransactionsResponse.TrxnsData.TrxnData();
    }

    /**
     * Create an instance of {@link SearchTransactionsRequest.Requester }
     * 
     */
    public SearchTransactionsRequest.Requester createSearchTransactionsRequestRequester() {
        return new SearchTransactionsRequest.Requester();
    }

    /**
     * Create an instance of {@link SearchTransactionsRequest.SearchParameters }
     * 
     */
    public SearchTransactionsRequest.SearchParameters createSearchTransactionsRequestSearchParameters() {
        return new SearchTransactionsRequest.SearchParameters();
    }

    /**
     * Create an instance of {@link SearchTransactionsRequest.ExtraAttributes }
     * 
     */
    public SearchTransactionsRequest.ExtraAttributes createSearchTransactionsRequestExtraAttributes() {
        return new SearchTransactionsRequest.ExtraAttributes();
    }

}
