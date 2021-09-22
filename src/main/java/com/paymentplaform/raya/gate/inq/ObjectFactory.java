
package com.paymentplaform.raya.gate.inq;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.paymentplaform.raya.gate.inq package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.paymentplaform.raya.gate.inq
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BillInquiryResponse }
     * 
     */
    public BillInquiryResponse createBillInquiryResponse() {
        return new BillInquiryResponse();
    }

    /**
     * Create an instance of {@link BillInquiryResponse.Bills }
     * 
     */
    public BillInquiryResponse.Bills createBillInquiryResponseBills() {
        return new BillInquiryResponse.Bills();
    }

    /**
     * Create an instance of {@link BillInquiryResponse.Bills.Bill }
     * 
     */
    public BillInquiryResponse.Bills.Bill createBillInquiryResponseBillsBill() {
        return new BillInquiryResponse.Bills.Bill();
    }

    /**
     * Create an instance of {@link BillInquiryResponse.Bills.Bill.BillData }
     * 
     */
    public BillInquiryResponse.Bills.Bill.BillData createBillInquiryResponseBillsBillBillData() {
        return new BillInquiryResponse.Bills.Bill.BillData();
    }

    /**
     * Create an instance of {@link BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts }
     * 
     */
    public BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts createBillInquiryResponseBillsBillBillDataBillDueAmounts() {
        return new BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts();
    }

    /**
     * Create an instance of {@link BillInquiryRequest }
     * 
     */
    public BillInquiryRequest createBillInquiryRequest() {
        return new BillInquiryRequest();
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
     * Create an instance of {@link BillsInquiryResponseType }
     * 
     */
    public BillsInquiryResponseType createBillsInquiryResponseType() {
        return new BillsInquiryResponseType();
    }

    /**
     * Create an instance of {@link BillInquiryResponse.InquiryAttributes }
     * 
     */
    public BillInquiryResponse.InquiryAttributes createBillInquiryResponseInquiryAttributes() {
        return new BillInquiryResponse.InquiryAttributes();
    }

    /**
     * Create an instance of {@link BillInquiryResponse.Bills.Bill.BillData.PaymentRange }
     * 
     */
    public BillInquiryResponse.Bills.Bill.BillData.PaymentRange createBillInquiryResponseBillsBillBillDataPaymentRange() {
        return new BillInquiryResponse.Bills.Bill.BillData.PaymentRange();
    }

    /**
     * Create an instance of {@link BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt }
     * 
     */
    public BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt createBillInquiryResponseBillsBillBillDataBillDueAmountsBillDueAmt() {
        return new BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt();
    }

    /**
     * Create an instance of {@link BillInquiryRequest.PaymentParameters }
     * 
     */
    public BillInquiryRequest.PaymentParameters createBillInquiryRequestPaymentParameters() {
        return new BillInquiryRequest.PaymentParameters();
    }

}
