package com.paymentplaform.raya.gate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.apache.cxf.annotations.SchemaValidation.SchemaValidationType;

/**
 * This class was generated by Apache CXF 3.0.4
 * 2017-08-01T10:43:16.515+02:00
 * Generated source version: 3.0.4
 * 
 */
@WebService(targetNamespace = "http://raya.paymentplaform.com/gate", name = "Gate")
@XmlSeeAlso({ObjectFactory.class, com.paymentplaform.raya.gate.search.ObjectFactory.class, com.paymentplaform.raya.gate.change.ObjectFactory.class, com.paymentplaform.raya.gate.rev.ObjectFactory.class, com.paymentplaform.raya.gate.inq.ObjectFactory.class, com.paymentplaform.raya.gate.summary.ObjectFactory.class, com.paymentplaform.raya.gate.distack.ObjectFactory.class, com.paymentplaform.raya.gate.balance.ObjectFactory.class, com.paymentplaform.raya.gate.init.ObjectFactory.class, com.paymentplaform.raya.gate.services.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@org.apache.cxf.annotations.SchemaValidation(type=SchemaValidationType.NONE)
public interface Gate {

    @WebMethod(operationName = "ReversePayment", action = "http://raya.paymentplaform.com/ReversePayment")
    public void reversePayment(
        @WebParam(partName = "MessageHeader", name = "MessageHeader", targetNamespace = "http://raya.paymentplaform.com/gate/rev")
        com.paymentplaform.raya.gate.rev.MessageHeader messageHeader,
        @WebParam(partName = "MessageBody", name = "MessageBody", targetNamespace = "http://raya.paymentplaform.com/gate/rev")
        com.paymentplaform.raya.gate.rev.MessageBody messageBody,
        @WebParam(partName = "MessageHeader", mode = WebParam.Mode.OUT, name = "MessageHeader", targetNamespace = "")
        javax.xml.ws.Holder<ResponseHeaderType> messageHeader1,
        @WebParam(partName = "MessageBody", mode = WebParam.Mode.OUT, name = "MessageBody", targetNamespace = "")
        javax.xml.ws.Holder<com.paymentplaform.raya.gate.rev.ReversePaymentResponseType> messageBody1
    ) throws TimeoutException, RemoteNotAvailableException;

    @WebMethod(operationName = "InitPayment", action = "http://raya.paymentplaform.com/InitPayment")
    public void initPayment(
        @WebParam(partName = "MessageHeader", name = "MessageHeader", targetNamespace = "http://raya.paymentplaform.com/gate/init")
        com.paymentplaform.raya.gate.init.MessageHeader messageHeader,
        @WebParam(partName = "MessageBody", name = "MessageBody", targetNamespace = "http://raya.paymentplaform.com/gate/init")
        com.paymentplaform.raya.gate.init.MessageBody messageBody,
        @WebParam(partName = "MessageHeader", mode = WebParam.Mode.OUT, name = "MessageHeader", targetNamespace = "")
        javax.xml.ws.Holder<ResponseHeaderType> messageHeader1,
        @WebParam(partName = "MessageBody", mode = WebParam.Mode.OUT, name = "MessageBody", targetNamespace = "")
        javax.xml.ws.Holder<com.paymentplaform.raya.gate.init.InitPaymentResponseType> messageBody1
    ) throws TimeoutException, RemoteNotAvailableException;

    @WebMethod(operationName = "BillsInquiry", action = "http://raya.paymentplaform.com/BillsInquiry")
    public void billsInquiry(
        @WebParam(partName = "MessageHeader", name = "MessageHeader", targetNamespace = "http://raya.paymentplaform.com/gate/inq")
        com.paymentplaform.raya.gate.inq.MessageHeader messageHeader,
        @WebParam(partName = "MessageBody", name = "MessageBody", targetNamespace = "http://raya.paymentplaform.com/gate/inq")
        com.paymentplaform.raya.gate.inq.MessageBody messageBody,
        @WebParam(partName = "MessageHeader", mode = WebParam.Mode.OUT, name = "MessageHeader", targetNamespace = "")
        javax.xml.ws.Holder<ResponseHeaderType> messageHeader1,
        @WebParam(partName = "MessageBody", mode = WebParam.Mode.OUT, name = "MessageBody", targetNamespace = "")
        javax.xml.ws.Holder<com.paymentplaform.raya.gate.inq.BillsInquiryResponseType> messageBody1
    ) throws TimeoutException, RemoteNotAvailableException;

    @WebMethod(operationName = "DailySummaryInquiry", action = "http://raya.paymentplaform.com/DailySummaryInquiry")
    public void dailySummaryInquiry(
        @WebParam(partName = "MessageHeader", name = "MessageHeader", targetNamespace = "http://raya.paymentplaform.com/gate/summary")
        com.paymentplaform.raya.gate.summary.MessageHeader messageHeader,
        @WebParam(partName = "MessageBody", name = "MessageBody", targetNamespace = "http://raya.paymentplaform.com/gate/summary")
        com.paymentplaform.raya.gate.summary.MessageBody messageBody,
        @WebParam(partName = "MessageHeader", mode = WebParam.Mode.OUT, name = "MessageHeader", targetNamespace = "")
        javax.xml.ws.Holder<ResponseHeaderType> messageHeader1,
        @WebParam(partName = "MessageBody", mode = WebParam.Mode.OUT, name = "MessageBody", targetNamespace = "")
        javax.xml.ws.Holder<com.paymentplaform.raya.gate.summary.DailySummaryResponseType> messageBody1
    ) throws TimeoutException, RemoteNotAvailableException;

    @WebMethod(operationName = "VoucherDistack", action = "http://raya.paymentplaform.com/VoucherDistack")
    public void voucherDistack(
        @WebParam(partName = "MessageHeader", name = "MessageHeader", targetNamespace = "http://raya.paymentplaform.com/gate/distack")
        com.paymentplaform.raya.gate.distack.MessageHeader messageHeader,
        @WebParam(partName = "MessageBody", name = "MessageBody", targetNamespace = "http://raya.paymentplaform.com/gate/distack")
        com.paymentplaform.raya.gate.distack.MessageBody messageBody,
        @WebParam(partName = "MessageHeader", mode = WebParam.Mode.OUT, name = "MessageHeader", targetNamespace = "")
        javax.xml.ws.Holder<ResponseHeaderType> messageHeader1,
        @WebParam(partName = "MessageBody", mode = WebParam.Mode.OUT, name = "MessageBody", targetNamespace = "")
        javax.xml.ws.Holder<com.paymentplaform.raya.gate.distack.ConfirmVoucherPrintResponseType> messageBody1
    ) throws TimeoutException, RemoteNotAvailableException;

    @WebMethod(operationName = "ChangeProfile", action = "http://raya.paymentplaform.com/ChangeProfile")
    public void changeProfile(
        @WebParam(partName = "MessageHeader", name = "MessageHeader", targetNamespace = "http://raya.paymentplaform.com/gate/change")
        com.paymentplaform.raya.gate.change.MessageHeader messageHeader,
        @WebParam(partName = "MessageBody", name = "MessageBody", targetNamespace = "http://raya.paymentplaform.com/gate/change")
        com.paymentplaform.raya.gate.change.MessageBody messageBody,
        @WebParam(partName = "MessageHeader", mode = WebParam.Mode.OUT, name = "MessageHeader", targetNamespace = "")
        javax.xml.ws.Holder<ResponseHeaderType> messageHeader1,
        @WebParam(partName = "MessageBody", mode = WebParam.Mode.OUT, name = "MessageBody", targetNamespace = "")
        javax.xml.ws.Holder<com.paymentplaform.raya.gate.change.ChangeProfileResponseType> messageBody1
    ) throws TimeoutException, RemoteNotAvailableException;

    @WebMethod(operationName = "SearchTransactions", action = "http://raya.paymentplaform.com/SearchTransactions")
    public void searchTransactions(
        @WebParam(partName = "MessageHeader", name = "MessageHeader", targetNamespace = "http://raya.paymentplaform.com/gate/search")
        com.paymentplaform.raya.gate.search.MessageHeader messageHeader,
        @WebParam(partName = "MessageBody", name = "MessageBody", targetNamespace = "http://raya.paymentplaform.com/gate/search")
        com.paymentplaform.raya.gate.search.MessageBody messageBody,
        @WebParam(partName = "MessageHeader", mode = WebParam.Mode.OUT, name = "MessageHeader", targetNamespace = "")
        javax.xml.ws.Holder<ResponseHeaderType> messageHeader1,
        @WebParam(partName = "MessageBody", mode = WebParam.Mode.OUT, name = "MessageBody", targetNamespace = "")
        javax.xml.ws.Holder<com.paymentplaform.raya.gate.search.SearchTransactionsResponseType> messageBody1
    ) throws TimeoutException, RemoteNotAvailableException;

    @WebMethod(operationName = "InquireBalance", action = "http://raya.paymentplaform.com/InquireBalance")
    public void inquireBalance(
        @WebParam(partName = "MessageHeader", name = "MessageHeader", targetNamespace = "http://raya.paymentplaform.com/gate/balance")
        com.paymentplaform.raya.gate.balance.MessageHeader messageHeader,
        @WebParam(partName = "MessageBody", name = "MessageBody", targetNamespace = "http://raya.paymentplaform.com/gate/balance")
        com.paymentplaform.raya.gate.balance.MessageBody messageBody,
        @WebParam(partName = "MessageHeader", mode = WebParam.Mode.OUT, name = "MessageHeader", targetNamespace = "")
        javax.xml.ws.Holder<ResponseHeaderType> messageHeader1,
        @WebParam(partName = "MessageBody", mode = WebParam.Mode.OUT, name = "MessageBody", targetNamespace = "")
        javax.xml.ws.Holder<com.paymentplaform.raya.gate.balance.InquiryBalanceResponseType> messageBody1
    ) throws TimeoutException, RemoteNotAvailableException;

    @WebResult(name = "LoadServiceDirectoryResponse", targetNamespace = "http://raya.paymentplaform.com/gate/services/", partName = "LoadServiceDirectoryResponse")
    @WebMethod(operationName = "ServiceDirectory", action = "http://raya.paymentplaform.com/ServiceDirectory")
    public com.paymentplaform.raya.gate.services.LoadServiceDirectoryResponse serviceDirectory(
        @WebParam(partName = "LoadServiceDirectoryRequest", name = "LoadServiceDirectoryReq", targetNamespace = "http://raya.paymentplaform.com/gate/services/")
        com.paymentplaform.raya.gate.services.LoadServiceDirectoryReq loadServiceDirectoryRequest
    ) throws TimeoutException, RemoteNotAvailableException;
}