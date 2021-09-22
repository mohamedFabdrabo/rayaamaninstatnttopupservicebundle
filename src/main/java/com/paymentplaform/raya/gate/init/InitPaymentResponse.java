
package com.paymentplaform.raya.gate.init;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.paymentplaform.raya.gate.EnumCurrencyCode;
import com.paymentplaform.raya.gate.EnumTransType;
import com.paymentplaform.raya.gate.Status;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom2;
import org.jvnet.jaxb2_commons.lang.MergeStrategy2;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.w3c.dom.Element;


/**
 * <p>Java class for Init_Payment_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Init_Payment_Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://raya.paymentplaform.com/gate}Status"/&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AsynchUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaxRec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cursor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TrxnType" type="{http://raya.paymentplaform.com/gate}EnumTransType"/&gt;
 *         &lt;element name="PmtMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PmtStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TrxEfftDt" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ServiceData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ServiceReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="BillRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TrxnIds"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TrxnId" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TrxnIdType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TrxnIdValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PayAmt"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                   &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode"/&gt;
 *                   &lt;element name="ChargesAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VouchersData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VoucherData" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VoucherSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="VouchNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="VoucherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="VoucherPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="VoucherExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="paymentParameters" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ParameterKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ParameterValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="notifications"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="notification" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;any processContents='lax' namespace='RequestData' minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Init_Payment_Response", namespace = "http://raya.paymentplaform.com/gate/init", propOrder = {
    "status",
    "rqUID",
    "asynchUID",
    "maxRec",
    "cursor",
    "serviceCode",
    "trxnType",
    "pmtMethod",
    "pmtStatus",
    "trxEfftDt",
    "serviceData",
    "trxnIds",
    "payAmt",
    "vouchersData",
    "paymentParameters",
    "notifications",
    "any"
})
public class InitPaymentResponse implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsynchUID", required = true)
    protected String asynchUID;
    @XmlElement(name = "MaxRec")
    protected Integer maxRec;
    @XmlElement(name = "Cursor")
    protected String cursor;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "TrxnType", required = true)
    @XmlSchemaType(name = "string")
    protected EnumTransType trxnType;
    @XmlElement(name = "PmtMethod", required = true)
    protected String pmtMethod;
    @XmlElement(name = "PmtStatus", required = true)
    protected String pmtStatus;
    @XmlElement(name = "TrxEfftDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trxEfftDt;
    @XmlElement(name = "ServiceData")
    protected InitPaymentResponse.ServiceData serviceData;
    @XmlElement(name = "TrxnIds", required = true)
    protected InitPaymentResponse.TrxnIds trxnIds;
    @XmlElement(name = "PayAmt", required = true)
    protected InitPaymentResponse.PayAmt payAmt;
    @XmlElement(name = "VouchersData")
    protected InitPaymentResponse.VouchersData vouchersData;
    protected List<InitPaymentResponse.PaymentParameters> paymentParameters;
    @XmlElement(required = true)
    protected InitPaymentResponse.Notifications notifications;
    @XmlAnyElement
    protected Element any;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the asynchUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsynchUID() {
        return asynchUID;
    }

    /**
     * Sets the value of the asynchUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsynchUID(String value) {
        this.asynchUID = value;
    }

    /**
     * Gets the value of the maxRec property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRec() {
        return maxRec;
    }

    /**
     * Sets the value of the maxRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRec(Integer value) {
        this.maxRec = value;
    }

    /**
     * Gets the value of the cursor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * Sets the value of the cursor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursor(String value) {
        this.cursor = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the trxnType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumTransType }
     *     
     */
    public EnumTransType getTrxnType() {
        return trxnType;
    }

    /**
     * Sets the value of the trxnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumTransType }
     *     
     */
    public void setTrxnType(EnumTransType value) {
        this.trxnType = value;
    }

    /**
     * Gets the value of the pmtMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtMethod() {
        return pmtMethod;
    }

    /**
     * Sets the value of the pmtMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtMethod(String value) {
        this.pmtMethod = value;
    }

    /**
     * Gets the value of the pmtStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtStatus() {
        return pmtStatus;
    }

    /**
     * Sets the value of the pmtStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPmtStatus(String value) {
        this.pmtStatus = value;
    }

    /**
     * Gets the value of the trxEfftDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTrxEfftDt() {
        return trxEfftDt;
    }

    /**
     * Sets the value of the trxEfftDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTrxEfftDt(XMLGregorianCalendar value) {
        this.trxEfftDt = value;
    }

    /**
     * Gets the value of the serviceData property.
     * 
     * @return
     *     possible object is
     *     {@link InitPaymentResponse.ServiceData }
     *     
     */
    public InitPaymentResponse.ServiceData getServiceData() {
        return serviceData;
    }

    /**
     * Sets the value of the serviceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitPaymentResponse.ServiceData }
     *     
     */
    public void setServiceData(InitPaymentResponse.ServiceData value) {
        this.serviceData = value;
    }

    /**
     * Gets the value of the trxnIds property.
     * 
     * @return
     *     possible object is
     *     {@link InitPaymentResponse.TrxnIds }
     *     
     */
    public InitPaymentResponse.TrxnIds getTrxnIds() {
        return trxnIds;
    }

    /**
     * Sets the value of the trxnIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitPaymentResponse.TrxnIds }
     *     
     */
    public void setTrxnIds(InitPaymentResponse.TrxnIds value) {
        this.trxnIds = value;
    }

    /**
     * Gets the value of the payAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InitPaymentResponse.PayAmt }
     *     
     */
    public InitPaymentResponse.PayAmt getPayAmt() {
        return payAmt;
    }

    /**
     * Sets the value of the payAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitPaymentResponse.PayAmt }
     *     
     */
    public void setPayAmt(InitPaymentResponse.PayAmt value) {
        this.payAmt = value;
    }

    /**
     * Gets the value of the vouchersData property.
     * 
     * @return
     *     possible object is
     *     {@link InitPaymentResponse.VouchersData }
     *     
     */
    public InitPaymentResponse.VouchersData getVouchersData() {
        return vouchersData;
    }

    /**
     * Sets the value of the vouchersData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitPaymentResponse.VouchersData }
     *     
     */
    public void setVouchersData(InitPaymentResponse.VouchersData value) {
        this.vouchersData = value;
    }

    /**
     * Gets the value of the paymentParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InitPaymentResponse.PaymentParameters }
     * 
     * 
     */
    public List<InitPaymentResponse.PaymentParameters> getPaymentParameters() {
        if (paymentParameters == null) {
            paymentParameters = new ArrayList<InitPaymentResponse.PaymentParameters>();
        }
        return this.paymentParameters;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link InitPaymentResponse.Notifications }
     *     
     */
    public InitPaymentResponse.Notifications getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitPaymentResponse.Notifications }
     *     
     */
    public void setNotifications(InitPaymentResponse.Notifications value) {
        this.notifications = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setAny(Element value) {
        this.any = value;
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            Status theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus, (this.status!= null));
        }
        {
            String theRqUID;
            theRqUID = this.getRqUID();
            strategy.appendField(locator, this, "rqUID", buffer, theRqUID, (this.rqUID!= null));
        }
        {
            String theAsynchUID;
            theAsynchUID = this.getAsynchUID();
            strategy.appendField(locator, this, "asynchUID", buffer, theAsynchUID, (this.asynchUID!= null));
        }
        {
            Integer theMaxRec;
            theMaxRec = this.getMaxRec();
            strategy.appendField(locator, this, "maxRec", buffer, theMaxRec, (this.maxRec!= null));
        }
        {
            String theCursor;
            theCursor = this.getCursor();
            strategy.appendField(locator, this, "cursor", buffer, theCursor, (this.cursor!= null));
        }
        {
            String theServiceCode;
            theServiceCode = this.getServiceCode();
            strategy.appendField(locator, this, "serviceCode", buffer, theServiceCode, (this.serviceCode!= null));
        }
        {
            EnumTransType theTrxnType;
            theTrxnType = this.getTrxnType();
            strategy.appendField(locator, this, "trxnType", buffer, theTrxnType, (this.trxnType!= null));
        }
        {
            String thePmtMethod;
            thePmtMethod = this.getPmtMethod();
            strategy.appendField(locator, this, "pmtMethod", buffer, thePmtMethod, (this.pmtMethod!= null));
        }
        {
            String thePmtStatus;
            thePmtStatus = this.getPmtStatus();
            strategy.appendField(locator, this, "pmtStatus", buffer, thePmtStatus, (this.pmtStatus!= null));
        }
        {
            XMLGregorianCalendar theTrxEfftDt;
            theTrxEfftDt = this.getTrxEfftDt();
            strategy.appendField(locator, this, "trxEfftDt", buffer, theTrxEfftDt, (this.trxEfftDt!= null));
        }
        {
            InitPaymentResponse.ServiceData theServiceData;
            theServiceData = this.getServiceData();
            strategy.appendField(locator, this, "serviceData", buffer, theServiceData, (this.serviceData!= null));
        }
        {
            InitPaymentResponse.TrxnIds theTrxnIds;
            theTrxnIds = this.getTrxnIds();
            strategy.appendField(locator, this, "trxnIds", buffer, theTrxnIds, (this.trxnIds!= null));
        }
        {
            InitPaymentResponse.PayAmt thePayAmt;
            thePayAmt = this.getPayAmt();
            strategy.appendField(locator, this, "payAmt", buffer, thePayAmt, (this.payAmt!= null));
        }
        {
            InitPaymentResponse.VouchersData theVouchersData;
            theVouchersData = this.getVouchersData();
            strategy.appendField(locator, this, "vouchersData", buffer, theVouchersData, (this.vouchersData!= null));
        }
        {
            List<InitPaymentResponse.PaymentParameters> thePaymentParameters;
            thePaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
            strategy.appendField(locator, this, "paymentParameters", buffer, thePaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())));
        }
        {
            InitPaymentResponse.Notifications theNotifications;
            theNotifications = this.getNotifications();
            strategy.appendField(locator, this, "notifications", buffer, theNotifications, (this.notifications!= null));
        }
        {
            Element theAny;
            theAny = this.getAny();
            strategy.appendField(locator, this, "any", buffer, theAny, (this.any!= null));
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final InitPaymentResponse that = ((InitPaymentResponse) object);
        {
            Status lhsStatus;
            lhsStatus = this.getStatus();
            Status rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        {
            String lhsRqUID;
            lhsRqUID = this.getRqUID();
            String rhsRqUID;
            rhsRqUID = that.getRqUID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rqUID", lhsRqUID), LocatorUtils.property(thatLocator, "rqUID", rhsRqUID), lhsRqUID, rhsRqUID, (this.rqUID!= null), (that.rqUID!= null))) {
                return false;
            }
        }
        {
            String lhsAsynchUID;
            lhsAsynchUID = this.getAsynchUID();
            String rhsAsynchUID;
            rhsAsynchUID = that.getAsynchUID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asynchUID", lhsAsynchUID), LocatorUtils.property(thatLocator, "asynchUID", rhsAsynchUID), lhsAsynchUID, rhsAsynchUID, (this.asynchUID!= null), (that.asynchUID!= null))) {
                return false;
            }
        }
        {
            Integer lhsMaxRec;
            lhsMaxRec = this.getMaxRec();
            Integer rhsMaxRec;
            rhsMaxRec = that.getMaxRec();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxRec", lhsMaxRec), LocatorUtils.property(thatLocator, "maxRec", rhsMaxRec), lhsMaxRec, rhsMaxRec, (this.maxRec!= null), (that.maxRec!= null))) {
                return false;
            }
        }
        {
            String lhsCursor;
            lhsCursor = this.getCursor();
            String rhsCursor;
            rhsCursor = that.getCursor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cursor", lhsCursor), LocatorUtils.property(thatLocator, "cursor", rhsCursor), lhsCursor, rhsCursor, (this.cursor!= null), (that.cursor!= null))) {
                return false;
            }
        }
        {
            String lhsServiceCode;
            lhsServiceCode = this.getServiceCode();
            String rhsServiceCode;
            rhsServiceCode = that.getServiceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCode", lhsServiceCode), LocatorUtils.property(thatLocator, "serviceCode", rhsServiceCode), lhsServiceCode, rhsServiceCode, (this.serviceCode!= null), (that.serviceCode!= null))) {
                return false;
            }
        }
        {
            EnumTransType lhsTrxnType;
            lhsTrxnType = this.getTrxnType();
            EnumTransType rhsTrxnType;
            rhsTrxnType = that.getTrxnType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnType", lhsTrxnType), LocatorUtils.property(thatLocator, "trxnType", rhsTrxnType), lhsTrxnType, rhsTrxnType, (this.trxnType!= null), (that.trxnType!= null))) {
                return false;
            }
        }
        {
            String lhsPmtMethod;
            lhsPmtMethod = this.getPmtMethod();
            String rhsPmtMethod;
            rhsPmtMethod = that.getPmtMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtMethod", lhsPmtMethod), LocatorUtils.property(thatLocator, "pmtMethod", rhsPmtMethod), lhsPmtMethod, rhsPmtMethod, (this.pmtMethod!= null), (that.pmtMethod!= null))) {
                return false;
            }
        }
        {
            String lhsPmtStatus;
            lhsPmtStatus = this.getPmtStatus();
            String rhsPmtStatus;
            rhsPmtStatus = that.getPmtStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtStatus", lhsPmtStatus), LocatorUtils.property(thatLocator, "pmtStatus", rhsPmtStatus), lhsPmtStatus, rhsPmtStatus, (this.pmtStatus!= null), (that.pmtStatus!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsTrxEfftDt;
            lhsTrxEfftDt = this.getTrxEfftDt();
            XMLGregorianCalendar rhsTrxEfftDt;
            rhsTrxEfftDt = that.getTrxEfftDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trxEfftDt", lhsTrxEfftDt), LocatorUtils.property(thatLocator, "trxEfftDt", rhsTrxEfftDt), lhsTrxEfftDt, rhsTrxEfftDt, (this.trxEfftDt!= null), (that.trxEfftDt!= null))) {
                return false;
            }
        }
        {
            InitPaymentResponse.ServiceData lhsServiceData;
            lhsServiceData = this.getServiceData();
            InitPaymentResponse.ServiceData rhsServiceData;
            rhsServiceData = that.getServiceData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceData", lhsServiceData), LocatorUtils.property(thatLocator, "serviceData", rhsServiceData), lhsServiceData, rhsServiceData, (this.serviceData!= null), (that.serviceData!= null))) {
                return false;
            }
        }
        {
            InitPaymentResponse.TrxnIds lhsTrxnIds;
            lhsTrxnIds = this.getTrxnIds();
            InitPaymentResponse.TrxnIds rhsTrxnIds;
            rhsTrxnIds = that.getTrxnIds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnIds", lhsTrxnIds), LocatorUtils.property(thatLocator, "trxnIds", rhsTrxnIds), lhsTrxnIds, rhsTrxnIds, (this.trxnIds!= null), (that.trxnIds!= null))) {
                return false;
            }
        }
        {
            InitPaymentResponse.PayAmt lhsPayAmt;
            lhsPayAmt = this.getPayAmt();
            InitPaymentResponse.PayAmt rhsPayAmt;
            rhsPayAmt = that.getPayAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payAmt", lhsPayAmt), LocatorUtils.property(thatLocator, "payAmt", rhsPayAmt), lhsPayAmt, rhsPayAmt, (this.payAmt!= null), (that.payAmt!= null))) {
                return false;
            }
        }
        {
            InitPaymentResponse.VouchersData lhsVouchersData;
            lhsVouchersData = this.getVouchersData();
            InitPaymentResponse.VouchersData rhsVouchersData;
            rhsVouchersData = that.getVouchersData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vouchersData", lhsVouchersData), LocatorUtils.property(thatLocator, "vouchersData", rhsVouchersData), lhsVouchersData, rhsVouchersData, (this.vouchersData!= null), (that.vouchersData!= null))) {
                return false;
            }
        }
        {
            List<InitPaymentResponse.PaymentParameters> lhsPaymentParameters;
            lhsPaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
            List<InitPaymentResponse.PaymentParameters> rhsPaymentParameters;
            rhsPaymentParameters = (((that.paymentParameters!= null)&&(!that.paymentParameters.isEmpty()))?that.getPaymentParameters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentParameters", lhsPaymentParameters), LocatorUtils.property(thatLocator, "paymentParameters", rhsPaymentParameters), lhsPaymentParameters, rhsPaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())), ((that.paymentParameters!= null)&&(!that.paymentParameters.isEmpty())))) {
                return false;
            }
        }
        {
            InitPaymentResponse.Notifications lhsNotifications;
            lhsNotifications = this.getNotifications();
            InitPaymentResponse.Notifications rhsNotifications;
            rhsNotifications = that.getNotifications();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notifications", lhsNotifications), LocatorUtils.property(thatLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, (this.notifications!= null), (that.notifications!= null))) {
                return false;
            }
        }
        {
            Element lhsAny;
            lhsAny = this.getAny();
            Element rhsAny;
            rhsAny = that.getAny();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny, (this.any!= null), (that.any!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            Status theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
        }
        {
            String theRqUID;
            theRqUID = this.getRqUID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rqUID", theRqUID), currentHashCode, theRqUID, (this.rqUID!= null));
        }
        {
            String theAsynchUID;
            theAsynchUID = this.getAsynchUID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asynchUID", theAsynchUID), currentHashCode, theAsynchUID, (this.asynchUID!= null));
        }
        {
            Integer theMaxRec;
            theMaxRec = this.getMaxRec();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxRec", theMaxRec), currentHashCode, theMaxRec, (this.maxRec!= null));
        }
        {
            String theCursor;
            theCursor = this.getCursor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cursor", theCursor), currentHashCode, theCursor, (this.cursor!= null));
        }
        {
            String theServiceCode;
            theServiceCode = this.getServiceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceCode", theServiceCode), currentHashCode, theServiceCode, (this.serviceCode!= null));
        }
        {
            EnumTransType theTrxnType;
            theTrxnType = this.getTrxnType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnType", theTrxnType), currentHashCode, theTrxnType, (this.trxnType!= null));
        }
        {
            String thePmtMethod;
            thePmtMethod = this.getPmtMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtMethod", thePmtMethod), currentHashCode, thePmtMethod, (this.pmtMethod!= null));
        }
        {
            String thePmtStatus;
            thePmtStatus = this.getPmtStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtStatus", thePmtStatus), currentHashCode, thePmtStatus, (this.pmtStatus!= null));
        }
        {
            XMLGregorianCalendar theTrxEfftDt;
            theTrxEfftDt = this.getTrxEfftDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxEfftDt", theTrxEfftDt), currentHashCode, theTrxEfftDt, (this.trxEfftDt!= null));
        }
        {
            InitPaymentResponse.ServiceData theServiceData;
            theServiceData = this.getServiceData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceData", theServiceData), currentHashCode, theServiceData, (this.serviceData!= null));
        }
        {
            InitPaymentResponse.TrxnIds theTrxnIds;
            theTrxnIds = this.getTrxnIds();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnIds", theTrxnIds), currentHashCode, theTrxnIds, (this.trxnIds!= null));
        }
        {
            InitPaymentResponse.PayAmt thePayAmt;
            thePayAmt = this.getPayAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payAmt", thePayAmt), currentHashCode, thePayAmt, (this.payAmt!= null));
        }
        {
            InitPaymentResponse.VouchersData theVouchersData;
            theVouchersData = this.getVouchersData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vouchersData", theVouchersData), currentHashCode, theVouchersData, (this.vouchersData!= null));
        }
        {
            List<InitPaymentResponse.PaymentParameters> thePaymentParameters;
            thePaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentParameters", thePaymentParameters), currentHashCode, thePaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())));
        }
        {
            InitPaymentResponse.Notifications theNotifications;
            theNotifications = this.getNotifications();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notifications", theNotifications), currentHashCode, theNotifications, (this.notifications!= null));
        }
        {
            Element theAny;
            theAny = this.getAny();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny, (this.any!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof InitPaymentResponse) {
            final InitPaymentResponse copy = ((InitPaymentResponse) draftCopy);
            {
                Boolean statusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.status!= null));
                if (statusShouldBeCopiedAndSet == Boolean.TRUE) {
                    Status sourceStatus;
                    sourceStatus = this.getStatus();
                    Status copyStatus = ((Status) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus, (this.status!= null)));
                    copy.setStatus(copyStatus);
                } else {
                    if (statusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.status = null;
                    }
                }
            }
            {
                Boolean rqUIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rqUID!= null));
                if (rqUIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRqUID;
                    sourceRqUID = this.getRqUID();
                    String copyRqUID = ((String) strategy.copy(LocatorUtils.property(locator, "rqUID", sourceRqUID), sourceRqUID, (this.rqUID!= null)));
                    copy.setRqUID(copyRqUID);
                } else {
                    if (rqUIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rqUID = null;
                    }
                }
            }
            {
                Boolean asynchUIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.asynchUID!= null));
                if (asynchUIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAsynchUID;
                    sourceAsynchUID = this.getAsynchUID();
                    String copyAsynchUID = ((String) strategy.copy(LocatorUtils.property(locator, "asynchUID", sourceAsynchUID), sourceAsynchUID, (this.asynchUID!= null)));
                    copy.setAsynchUID(copyAsynchUID);
                } else {
                    if (asynchUIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.asynchUID = null;
                    }
                }
            }
            {
                Boolean maxRecShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxRec!= null));
                if (maxRecShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceMaxRec;
                    sourceMaxRec = this.getMaxRec();
                    Integer copyMaxRec = ((Integer) strategy.copy(LocatorUtils.property(locator, "maxRec", sourceMaxRec), sourceMaxRec, (this.maxRec!= null)));
                    copy.setMaxRec(copyMaxRec);
                } else {
                    if (maxRecShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxRec = null;
                    }
                }
            }
            {
                Boolean cursorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cursor!= null));
                if (cursorShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCursor;
                    sourceCursor = this.getCursor();
                    String copyCursor = ((String) strategy.copy(LocatorUtils.property(locator, "cursor", sourceCursor), sourceCursor, (this.cursor!= null)));
                    copy.setCursor(copyCursor);
                } else {
                    if (cursorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cursor = null;
                    }
                }
            }
            {
                Boolean serviceCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceCode!= null));
                if (serviceCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceServiceCode;
                    sourceServiceCode = this.getServiceCode();
                    String copyServiceCode = ((String) strategy.copy(LocatorUtils.property(locator, "serviceCode", sourceServiceCode), sourceServiceCode, (this.serviceCode!= null)));
                    copy.setServiceCode(copyServiceCode);
                } else {
                    if (serviceCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceCode = null;
                    }
                }
            }
            {
                Boolean trxnTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnType!= null));
                if (trxnTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnumTransType sourceTrxnType;
                    sourceTrxnType = this.getTrxnType();
                    EnumTransType copyTrxnType = ((EnumTransType) strategy.copy(LocatorUtils.property(locator, "trxnType", sourceTrxnType), sourceTrxnType, (this.trxnType!= null)));
                    copy.setTrxnType(copyTrxnType);
                } else {
                    if (trxnTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trxnType = null;
                    }
                }
            }
            {
                Boolean pmtMethodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pmtMethod!= null));
                if (pmtMethodShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePmtMethod;
                    sourcePmtMethod = this.getPmtMethod();
                    String copyPmtMethod = ((String) strategy.copy(LocatorUtils.property(locator, "pmtMethod", sourcePmtMethod), sourcePmtMethod, (this.pmtMethod!= null)));
                    copy.setPmtMethod(copyPmtMethod);
                } else {
                    if (pmtMethodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pmtMethod = null;
                    }
                }
            }
            {
                Boolean pmtStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pmtStatus!= null));
                if (pmtStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePmtStatus;
                    sourcePmtStatus = this.getPmtStatus();
                    String copyPmtStatus = ((String) strategy.copy(LocatorUtils.property(locator, "pmtStatus", sourcePmtStatus), sourcePmtStatus, (this.pmtStatus!= null)));
                    copy.setPmtStatus(copyPmtStatus);
                } else {
                    if (pmtStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pmtStatus = null;
                    }
                }
            }
            {
                Boolean trxEfftDtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxEfftDt!= null));
                if (trxEfftDtShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceTrxEfftDt;
                    sourceTrxEfftDt = this.getTrxEfftDt();
                    XMLGregorianCalendar copyTrxEfftDt = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "trxEfftDt", sourceTrxEfftDt), sourceTrxEfftDt, (this.trxEfftDt!= null)));
                    copy.setTrxEfftDt(copyTrxEfftDt);
                } else {
                    if (trxEfftDtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trxEfftDt = null;
                    }
                }
            }
            {
                Boolean serviceDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceData!= null));
                if (serviceDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    InitPaymentResponse.ServiceData sourceServiceData;
                    sourceServiceData = this.getServiceData();
                    InitPaymentResponse.ServiceData copyServiceData = ((InitPaymentResponse.ServiceData) strategy.copy(LocatorUtils.property(locator, "serviceData", sourceServiceData), sourceServiceData, (this.serviceData!= null)));
                    copy.setServiceData(copyServiceData);
                } else {
                    if (serviceDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceData = null;
                    }
                }
            }
            {
                Boolean trxnIdsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnIds!= null));
                if (trxnIdsShouldBeCopiedAndSet == Boolean.TRUE) {
                    InitPaymentResponse.TrxnIds sourceTrxnIds;
                    sourceTrxnIds = this.getTrxnIds();
                    InitPaymentResponse.TrxnIds copyTrxnIds = ((InitPaymentResponse.TrxnIds) strategy.copy(LocatorUtils.property(locator, "trxnIds", sourceTrxnIds), sourceTrxnIds, (this.trxnIds!= null)));
                    copy.setTrxnIds(copyTrxnIds);
                } else {
                    if (trxnIdsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trxnIds = null;
                    }
                }
            }
            {
                Boolean payAmtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.payAmt!= null));
                if (payAmtShouldBeCopiedAndSet == Boolean.TRUE) {
                    InitPaymentResponse.PayAmt sourcePayAmt;
                    sourcePayAmt = this.getPayAmt();
                    InitPaymentResponse.PayAmt copyPayAmt = ((InitPaymentResponse.PayAmt) strategy.copy(LocatorUtils.property(locator, "payAmt", sourcePayAmt), sourcePayAmt, (this.payAmt!= null)));
                    copy.setPayAmt(copyPayAmt);
                } else {
                    if (payAmtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.payAmt = null;
                    }
                }
            }
            {
                Boolean vouchersDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vouchersData!= null));
                if (vouchersDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    InitPaymentResponse.VouchersData sourceVouchersData;
                    sourceVouchersData = this.getVouchersData();
                    InitPaymentResponse.VouchersData copyVouchersData = ((InitPaymentResponse.VouchersData) strategy.copy(LocatorUtils.property(locator, "vouchersData", sourceVouchersData), sourceVouchersData, (this.vouchersData!= null)));
                    copy.setVouchersData(copyVouchersData);
                } else {
                    if (vouchersDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vouchersData = null;
                    }
                }
            }
            {
                Boolean paymentParametersShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())));
                if (paymentParametersShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<InitPaymentResponse.PaymentParameters> sourcePaymentParameters;
                    sourcePaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
                    @SuppressWarnings("unchecked")
                    List<InitPaymentResponse.PaymentParameters> copyPaymentParameters = ((List<InitPaymentResponse.PaymentParameters> ) strategy.copy(LocatorUtils.property(locator, "paymentParameters", sourcePaymentParameters), sourcePaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))));
                    copy.paymentParameters = null;
                    if (copyPaymentParameters!= null) {
                        List<InitPaymentResponse.PaymentParameters> uniquePaymentParametersl = copy.getPaymentParameters();
                        uniquePaymentParametersl.addAll(copyPaymentParameters);
                    }
                } else {
                    if (paymentParametersShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.paymentParameters = null;
                    }
                }
            }
            {
                Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.notifications!= null));
                if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                    InitPaymentResponse.Notifications sourceNotifications;
                    sourceNotifications = this.getNotifications();
                    InitPaymentResponse.Notifications copyNotifications = ((InitPaymentResponse.Notifications) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, (this.notifications!= null)));
                    copy.setNotifications(copyNotifications);
                } else {
                    if (notificationsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.notifications = null;
                    }
                }
            }
            {
                Boolean anyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.any!= null));
                if (anyShouldBeCopiedAndSet == Boolean.TRUE) {
                    Element sourceAny;
                    sourceAny = this.getAny();
                    Element copyAny = ((Element) strategy.copy(LocatorUtils.property(locator, "any", sourceAny), sourceAny, (this.any!= null)));
                    copy.setAny(copyAny);
                } else {
                    if (anyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.any = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new InitPaymentResponse();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof InitPaymentResponse) {
            final InitPaymentResponse target = this;
            final InitPaymentResponse leftObject = ((InitPaymentResponse) left);
            final InitPaymentResponse rightObject = ((InitPaymentResponse) right);
            {
                Boolean statusShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.status!= null), (rightObject.status!= null));
                if (statusShouldBeMergedAndSet == Boolean.TRUE) {
                    Status lhsStatus;
                    lhsStatus = leftObject.getStatus();
                    Status rhsStatus;
                    rhsStatus = rightObject.getStatus();
                    Status mergedStatus = ((Status) strategy.merge(LocatorUtils.property(leftLocator, "status", lhsStatus), LocatorUtils.property(rightLocator, "status", rhsStatus), lhsStatus, rhsStatus, (leftObject.status!= null), (rightObject.status!= null)));
                    target.setStatus(mergedStatus);
                } else {
                    if (statusShouldBeMergedAndSet == Boolean.FALSE) {
                        target.status = null;
                    }
                }
            }
            {
                Boolean rqUIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.rqUID!= null), (rightObject.rqUID!= null));
                if (rqUIDShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsRqUID;
                    lhsRqUID = leftObject.getRqUID();
                    String rhsRqUID;
                    rhsRqUID = rightObject.getRqUID();
                    String mergedRqUID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "rqUID", lhsRqUID), LocatorUtils.property(rightLocator, "rqUID", rhsRqUID), lhsRqUID, rhsRqUID, (leftObject.rqUID!= null), (rightObject.rqUID!= null)));
                    target.setRqUID(mergedRqUID);
                } else {
                    if (rqUIDShouldBeMergedAndSet == Boolean.FALSE) {
                        target.rqUID = null;
                    }
                }
            }
            {
                Boolean asynchUIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.asynchUID!= null), (rightObject.asynchUID!= null));
                if (asynchUIDShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsAsynchUID;
                    lhsAsynchUID = leftObject.getAsynchUID();
                    String rhsAsynchUID;
                    rhsAsynchUID = rightObject.getAsynchUID();
                    String mergedAsynchUID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "asynchUID", lhsAsynchUID), LocatorUtils.property(rightLocator, "asynchUID", rhsAsynchUID), lhsAsynchUID, rhsAsynchUID, (leftObject.asynchUID!= null), (rightObject.asynchUID!= null)));
                    target.setAsynchUID(mergedAsynchUID);
                } else {
                    if (asynchUIDShouldBeMergedAndSet == Boolean.FALSE) {
                        target.asynchUID = null;
                    }
                }
            }
            {
                Boolean maxRecShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.maxRec!= null), (rightObject.maxRec!= null));
                if (maxRecShouldBeMergedAndSet == Boolean.TRUE) {
                    Integer lhsMaxRec;
                    lhsMaxRec = leftObject.getMaxRec();
                    Integer rhsMaxRec;
                    rhsMaxRec = rightObject.getMaxRec();
                    Integer mergedMaxRec = ((Integer) strategy.merge(LocatorUtils.property(leftLocator, "maxRec", lhsMaxRec), LocatorUtils.property(rightLocator, "maxRec", rhsMaxRec), lhsMaxRec, rhsMaxRec, (leftObject.maxRec!= null), (rightObject.maxRec!= null)));
                    target.setMaxRec(mergedMaxRec);
                } else {
                    if (maxRecShouldBeMergedAndSet == Boolean.FALSE) {
                        target.maxRec = null;
                    }
                }
            }
            {
                Boolean cursorShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.cursor!= null), (rightObject.cursor!= null));
                if (cursorShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsCursor;
                    lhsCursor = leftObject.getCursor();
                    String rhsCursor;
                    rhsCursor = rightObject.getCursor();
                    String mergedCursor = ((String) strategy.merge(LocatorUtils.property(leftLocator, "cursor", lhsCursor), LocatorUtils.property(rightLocator, "cursor", rhsCursor), lhsCursor, rhsCursor, (leftObject.cursor!= null), (rightObject.cursor!= null)));
                    target.setCursor(mergedCursor);
                } else {
                    if (cursorShouldBeMergedAndSet == Boolean.FALSE) {
                        target.cursor = null;
                    }
                }
            }
            {
                Boolean serviceCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceCode!= null), (rightObject.serviceCode!= null));
                if (serviceCodeShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsServiceCode;
                    lhsServiceCode = leftObject.getServiceCode();
                    String rhsServiceCode;
                    rhsServiceCode = rightObject.getServiceCode();
                    String mergedServiceCode = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceCode", lhsServiceCode), LocatorUtils.property(rightLocator, "serviceCode", rhsServiceCode), lhsServiceCode, rhsServiceCode, (leftObject.serviceCode!= null), (rightObject.serviceCode!= null)));
                    target.setServiceCode(mergedServiceCode);
                } else {
                    if (serviceCodeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceCode = null;
                    }
                }
            }
            {
                Boolean trxnTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnType!= null), (rightObject.trxnType!= null));
                if (trxnTypeShouldBeMergedAndSet == Boolean.TRUE) {
                    EnumTransType lhsTrxnType;
                    lhsTrxnType = leftObject.getTrxnType();
                    EnumTransType rhsTrxnType;
                    rhsTrxnType = rightObject.getTrxnType();
                    EnumTransType mergedTrxnType = ((EnumTransType) strategy.merge(LocatorUtils.property(leftLocator, "trxnType", lhsTrxnType), LocatorUtils.property(rightLocator, "trxnType", rhsTrxnType), lhsTrxnType, rhsTrxnType, (leftObject.trxnType!= null), (rightObject.trxnType!= null)));
                    target.setTrxnType(mergedTrxnType);
                } else {
                    if (trxnTypeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.trxnType = null;
                    }
                }
            }
            {
                Boolean pmtMethodShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.pmtMethod!= null), (rightObject.pmtMethod!= null));
                if (pmtMethodShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsPmtMethod;
                    lhsPmtMethod = leftObject.getPmtMethod();
                    String rhsPmtMethod;
                    rhsPmtMethod = rightObject.getPmtMethod();
                    String mergedPmtMethod = ((String) strategy.merge(LocatorUtils.property(leftLocator, "pmtMethod", lhsPmtMethod), LocatorUtils.property(rightLocator, "pmtMethod", rhsPmtMethod), lhsPmtMethod, rhsPmtMethod, (leftObject.pmtMethod!= null), (rightObject.pmtMethod!= null)));
                    target.setPmtMethod(mergedPmtMethod);
                } else {
                    if (pmtMethodShouldBeMergedAndSet == Boolean.FALSE) {
                        target.pmtMethod = null;
                    }
                }
            }
            {
                Boolean pmtStatusShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.pmtStatus!= null), (rightObject.pmtStatus!= null));
                if (pmtStatusShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsPmtStatus;
                    lhsPmtStatus = leftObject.getPmtStatus();
                    String rhsPmtStatus;
                    rhsPmtStatus = rightObject.getPmtStatus();
                    String mergedPmtStatus = ((String) strategy.merge(LocatorUtils.property(leftLocator, "pmtStatus", lhsPmtStatus), LocatorUtils.property(rightLocator, "pmtStatus", rhsPmtStatus), lhsPmtStatus, rhsPmtStatus, (leftObject.pmtStatus!= null), (rightObject.pmtStatus!= null)));
                    target.setPmtStatus(mergedPmtStatus);
                } else {
                    if (pmtStatusShouldBeMergedAndSet == Boolean.FALSE) {
                        target.pmtStatus = null;
                    }
                }
            }
            {
                Boolean trxEfftDtShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxEfftDt!= null), (rightObject.trxEfftDt!= null));
                if (trxEfftDtShouldBeMergedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar lhsTrxEfftDt;
                    lhsTrxEfftDt = leftObject.getTrxEfftDt();
                    XMLGregorianCalendar rhsTrxEfftDt;
                    rhsTrxEfftDt = rightObject.getTrxEfftDt();
                    XMLGregorianCalendar mergedTrxEfftDt = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "trxEfftDt", lhsTrxEfftDt), LocatorUtils.property(rightLocator, "trxEfftDt", rhsTrxEfftDt), lhsTrxEfftDt, rhsTrxEfftDt, (leftObject.trxEfftDt!= null), (rightObject.trxEfftDt!= null)));
                    target.setTrxEfftDt(mergedTrxEfftDt);
                } else {
                    if (trxEfftDtShouldBeMergedAndSet == Boolean.FALSE) {
                        target.trxEfftDt = null;
                    }
                }
            }
            {
                Boolean serviceDataShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceData!= null), (rightObject.serviceData!= null));
                if (serviceDataShouldBeMergedAndSet == Boolean.TRUE) {
                    InitPaymentResponse.ServiceData lhsServiceData;
                    lhsServiceData = leftObject.getServiceData();
                    InitPaymentResponse.ServiceData rhsServiceData;
                    rhsServiceData = rightObject.getServiceData();
                    InitPaymentResponse.ServiceData mergedServiceData = ((InitPaymentResponse.ServiceData) strategy.merge(LocatorUtils.property(leftLocator, "serviceData", lhsServiceData), LocatorUtils.property(rightLocator, "serviceData", rhsServiceData), lhsServiceData, rhsServiceData, (leftObject.serviceData!= null), (rightObject.serviceData!= null)));
                    target.setServiceData(mergedServiceData);
                } else {
                    if (serviceDataShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceData = null;
                    }
                }
            }
            {
                Boolean trxnIdsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnIds!= null), (rightObject.trxnIds!= null));
                if (trxnIdsShouldBeMergedAndSet == Boolean.TRUE) {
                    InitPaymentResponse.TrxnIds lhsTrxnIds;
                    lhsTrxnIds = leftObject.getTrxnIds();
                    InitPaymentResponse.TrxnIds rhsTrxnIds;
                    rhsTrxnIds = rightObject.getTrxnIds();
                    InitPaymentResponse.TrxnIds mergedTrxnIds = ((InitPaymentResponse.TrxnIds) strategy.merge(LocatorUtils.property(leftLocator, "trxnIds", lhsTrxnIds), LocatorUtils.property(rightLocator, "trxnIds", rhsTrxnIds), lhsTrxnIds, rhsTrxnIds, (leftObject.trxnIds!= null), (rightObject.trxnIds!= null)));
                    target.setTrxnIds(mergedTrxnIds);
                } else {
                    if (trxnIdsShouldBeMergedAndSet == Boolean.FALSE) {
                        target.trxnIds = null;
                    }
                }
            }
            {
                Boolean payAmtShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.payAmt!= null), (rightObject.payAmt!= null));
                if (payAmtShouldBeMergedAndSet == Boolean.TRUE) {
                    InitPaymentResponse.PayAmt lhsPayAmt;
                    lhsPayAmt = leftObject.getPayAmt();
                    InitPaymentResponse.PayAmt rhsPayAmt;
                    rhsPayAmt = rightObject.getPayAmt();
                    InitPaymentResponse.PayAmt mergedPayAmt = ((InitPaymentResponse.PayAmt) strategy.merge(LocatorUtils.property(leftLocator, "payAmt", lhsPayAmt), LocatorUtils.property(rightLocator, "payAmt", rhsPayAmt), lhsPayAmt, rhsPayAmt, (leftObject.payAmt!= null), (rightObject.payAmt!= null)));
                    target.setPayAmt(mergedPayAmt);
                } else {
                    if (payAmtShouldBeMergedAndSet == Boolean.FALSE) {
                        target.payAmt = null;
                    }
                }
            }
            {
                Boolean vouchersDataShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.vouchersData!= null), (rightObject.vouchersData!= null));
                if (vouchersDataShouldBeMergedAndSet == Boolean.TRUE) {
                    InitPaymentResponse.VouchersData lhsVouchersData;
                    lhsVouchersData = leftObject.getVouchersData();
                    InitPaymentResponse.VouchersData rhsVouchersData;
                    rhsVouchersData = rightObject.getVouchersData();
                    InitPaymentResponse.VouchersData mergedVouchersData = ((InitPaymentResponse.VouchersData) strategy.merge(LocatorUtils.property(leftLocator, "vouchersData", lhsVouchersData), LocatorUtils.property(rightLocator, "vouchersData", rhsVouchersData), lhsVouchersData, rhsVouchersData, (leftObject.vouchersData!= null), (rightObject.vouchersData!= null)));
                    target.setVouchersData(mergedVouchersData);
                } else {
                    if (vouchersDataShouldBeMergedAndSet == Boolean.FALSE) {
                        target.vouchersData = null;
                    }
                }
            }
            {
                Boolean paymentParametersShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.paymentParameters!= null)&&(!leftObject.paymentParameters.isEmpty())), ((rightObject.paymentParameters!= null)&&(!rightObject.paymentParameters.isEmpty())));
                if (paymentParametersShouldBeMergedAndSet == Boolean.TRUE) {
                    List<InitPaymentResponse.PaymentParameters> lhsPaymentParameters;
                    lhsPaymentParameters = (((leftObject.paymentParameters!= null)&&(!leftObject.paymentParameters.isEmpty()))?leftObject.getPaymentParameters():null);
                    List<InitPaymentResponse.PaymentParameters> rhsPaymentParameters;
                    rhsPaymentParameters = (((rightObject.paymentParameters!= null)&&(!rightObject.paymentParameters.isEmpty()))?rightObject.getPaymentParameters():null);
                    List<InitPaymentResponse.PaymentParameters> mergedPaymentParameters = ((List<InitPaymentResponse.PaymentParameters> ) strategy.merge(LocatorUtils.property(leftLocator, "paymentParameters", lhsPaymentParameters), LocatorUtils.property(rightLocator, "paymentParameters", rhsPaymentParameters), lhsPaymentParameters, rhsPaymentParameters, ((leftObject.paymentParameters!= null)&&(!leftObject.paymentParameters.isEmpty())), ((rightObject.paymentParameters!= null)&&(!rightObject.paymentParameters.isEmpty()))));
                    target.paymentParameters = null;
                    if (mergedPaymentParameters!= null) {
                        List<InitPaymentResponse.PaymentParameters> uniquePaymentParametersl = target.getPaymentParameters();
                        uniquePaymentParametersl.addAll(mergedPaymentParameters);
                    }
                } else {
                    if (paymentParametersShouldBeMergedAndSet == Boolean.FALSE) {
                        target.paymentParameters = null;
                    }
                }
            }
            {
                Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.notifications!= null), (rightObject.notifications!= null));
                if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                    InitPaymentResponse.Notifications lhsNotifications;
                    lhsNotifications = leftObject.getNotifications();
                    InitPaymentResponse.Notifications rhsNotifications;
                    rhsNotifications = rightObject.getNotifications();
                    InitPaymentResponse.Notifications mergedNotifications = ((InitPaymentResponse.Notifications) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, (leftObject.notifications!= null), (rightObject.notifications!= null)));
                    target.setNotifications(mergedNotifications);
                } else {
                    if (notificationsShouldBeMergedAndSet == Boolean.FALSE) {
                        target.notifications = null;
                    }
                }
            }
            {
                Boolean anyShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.any!= null), (rightObject.any!= null));
                if (anyShouldBeMergedAndSet == Boolean.TRUE) {
                    Element lhsAny;
                    lhsAny = leftObject.getAny();
                    Element rhsAny;
                    rhsAny = rightObject.getAny();
                    Element mergedAny = ((Element) strategy.merge(LocatorUtils.property(leftLocator, "any", lhsAny), LocatorUtils.property(rightLocator, "any", rhsAny), lhsAny, rhsAny, (leftObject.any!= null), (rightObject.any!= null)));
                    target.setAny(mergedAny);
                } else {
                    if (anyShouldBeMergedAndSet == Boolean.FALSE) {
                        target.any = null;
                    }
                }
            }
        }
    }

    public void setPaymentParameters(List<InitPaymentResponse.PaymentParameters> value) {
        this.paymentParameters = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="notification" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "notifications"
    })
    public static class Notifications implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "notification", required = true)
        protected List<InitPaymentResponse.Notifications.Notification> notifications;

        /**
         * Gets the value of the notifications property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the notifications property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNotifications().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InitPaymentResponse.Notifications.Notification }
         * 
         * 
         */
        public List<InitPaymentResponse.Notifications.Notification> getNotifications() {
            if (notifications == null) {
                notifications = new ArrayList<InitPaymentResponse.Notifications.Notification>();
            }
            return this.notifications;
        }

        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                List<InitPaymentResponse.Notifications.Notification> theNotifications;
                theNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                strategy.appendField(locator, this, "notifications", buffer, theNotifications, ((this.notifications!= null)&&(!this.notifications.isEmpty())));
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final InitPaymentResponse.Notifications that = ((InitPaymentResponse.Notifications) object);
            {
                List<InitPaymentResponse.Notifications.Notification> lhsNotifications;
                lhsNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                List<InitPaymentResponse.Notifications.Notification> rhsNotifications;
                rhsNotifications = (((that.notifications!= null)&&(!that.notifications.isEmpty()))?that.getNotifications():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "notifications", lhsNotifications), LocatorUtils.property(thatLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, ((this.notifications!= null)&&(!this.notifications.isEmpty())), ((that.notifications!= null)&&(!that.notifications.isEmpty())))) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
            int currentHashCode = 1;
            {
                List<InitPaymentResponse.Notifications.Notification> theNotifications;
                theNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notifications", theNotifications), currentHashCode, theNotifications, ((this.notifications!= null)&&(!this.notifications.isEmpty())));
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public Object clone() {
            return copyTo(createNewInstance());
        }

        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof InitPaymentResponse.Notifications) {
                final InitPaymentResponse.Notifications copy = ((InitPaymentResponse.Notifications) draftCopy);
                {
                    Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.notifications!= null)&&(!this.notifications.isEmpty())));
                    if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<InitPaymentResponse.Notifications.Notification> sourceNotifications;
                        sourceNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                        @SuppressWarnings("unchecked")
                        List<InitPaymentResponse.Notifications.Notification> copyNotifications = ((List<InitPaymentResponse.Notifications.Notification> ) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, ((this.notifications!= null)&&(!this.notifications.isEmpty()))));
                        copy.notifications = null;
                        if (copyNotifications!= null) {
                            List<InitPaymentResponse.Notifications.Notification> uniqueNotificationsl = copy.getNotifications();
                            uniqueNotificationsl.addAll(copyNotifications);
                        }
                    } else {
                        if (notificationsShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.notifications = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new InitPaymentResponse.Notifications();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InitPaymentResponse.Notifications) {
                final InitPaymentResponse.Notifications target = this;
                final InitPaymentResponse.Notifications leftObject = ((InitPaymentResponse.Notifications) left);
                final InitPaymentResponse.Notifications rightObject = ((InitPaymentResponse.Notifications) right);
                {
                    Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty())));
                    if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<InitPaymentResponse.Notifications.Notification> lhsNotifications;
                        lhsNotifications = (((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty()))?leftObject.getNotifications():null);
                        List<InitPaymentResponse.Notifications.Notification> rhsNotifications;
                        rhsNotifications = (((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))?rightObject.getNotifications():null);
                        List<InitPaymentResponse.Notifications.Notification> mergedNotifications = ((List<InitPaymentResponse.Notifications.Notification> ) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))));
                        target.notifications = null;
                        if (mergedNotifications!= null) {
                            List<InitPaymentResponse.Notifications.Notification> uniqueNotificationsl = target.getNotifications();
                            uniqueNotificationsl.addAll(mergedNotifications);
                        }
                    } else {
                        if (notificationsShouldBeMergedAndSet == Boolean.FALSE) {
                            target.notifications = null;
                        }
                    }
                }
            }
        }

        public void setNotifications(List<InitPaymentResponse.Notifications.Notification> value) {
            this.notifications = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "message",
            "category",
            "date"
        })
        public static class Notification implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            @XmlElement(required = true)
            protected String message;
            @XmlElement(required = true)
            protected String category;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;

            /**
             * Gets the value of the message property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMessage() {
                return message;
            }

            /**
             * Sets the value of the message property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMessage(String value) {
                this.message = value;
            }

            /**
             * Gets the value of the category property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategory() {
                return category;
            }

            /**
             * Sets the value of the category property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategory(String value) {
                this.category = value;
            }

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            public String toString() {
                final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                final StringBuilder buffer = new StringBuilder();
                append(null, buffer, strategy);
                return buffer.toString();
            }

            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                {
                    String theMessage;
                    theMessage = this.getMessage();
                    strategy.appendField(locator, this, "message", buffer, theMessage, (this.message!= null));
                }
                {
                    String theCategory;
                    theCategory = this.getCategory();
                    strategy.appendField(locator, this, "category", buffer, theCategory, (this.category!= null));
                }
                {
                    XMLGregorianCalendar theDate;
                    theDate = this.getDate();
                    strategy.appendField(locator, this, "date", buffer, theDate, (this.date!= null));
                }
                return buffer;
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final InitPaymentResponse.Notifications.Notification that = ((InitPaymentResponse.Notifications.Notification) object);
                {
                    String lhsMessage;
                    lhsMessage = this.getMessage();
                    String rhsMessage;
                    rhsMessage = that.getMessage();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage, (this.message!= null), (that.message!= null))) {
                        return false;
                    }
                }
                {
                    String lhsCategory;
                    lhsCategory = this.getCategory();
                    String rhsCategory;
                    rhsCategory = that.getCategory();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory, (this.category!= null), (that.category!= null))) {
                        return false;
                    }
                }
                {
                    XMLGregorianCalendar lhsDate;
                    lhsDate = this.getDate();
                    XMLGregorianCalendar rhsDate;
                    rhsDate = that.getDate();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "date", lhsDate), LocatorUtils.property(thatLocator, "date", rhsDate), lhsDate, rhsDate, (this.date!= null), (that.date!= null))) {
                        return false;
                    }
                }
                return true;
            }

            public boolean equals(Object object) {
                final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
                return equals(null, null, object, strategy);
            }

            public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
                int currentHashCode = 1;
                {
                    String theMessage;
                    theMessage = this.getMessage();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage, (this.message!= null));
                }
                {
                    String theCategory;
                    theCategory = this.getCategory();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "category", theCategory), currentHashCode, theCategory, (this.category!= null));
                }
                {
                    XMLGregorianCalendar theDate;
                    theDate = this.getDate();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "date", theDate), currentHashCode, theDate, (this.date!= null));
                }
                return currentHashCode;
            }

            public int hashCode() {
                final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
                return this.hashCode(null, strategy);
            }

            public Object clone() {
                return copyTo(createNewInstance());
            }

            public Object copyTo(Object target) {
                final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                return copyTo(null, target, strategy);
            }

            public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                final Object draftCopy = ((target == null)?createNewInstance():target);
                if (draftCopy instanceof InitPaymentResponse.Notifications.Notification) {
                    final InitPaymentResponse.Notifications.Notification copy = ((InitPaymentResponse.Notifications.Notification) draftCopy);
                    {
                        Boolean messageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.message!= null));
                        if (messageShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceMessage;
                            sourceMessage = this.getMessage();
                            String copyMessage = ((String) strategy.copy(LocatorUtils.property(locator, "message", sourceMessage), sourceMessage, (this.message!= null)));
                            copy.setMessage(copyMessage);
                        } else {
                            if (messageShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.message = null;
                            }
                        }
                    }
                    {
                        Boolean categoryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.category!= null));
                        if (categoryShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceCategory;
                            sourceCategory = this.getCategory();
                            String copyCategory = ((String) strategy.copy(LocatorUtils.property(locator, "category", sourceCategory), sourceCategory, (this.category!= null)));
                            copy.setCategory(copyCategory);
                        } else {
                            if (categoryShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.category = null;
                            }
                        }
                    }
                    {
                        Boolean dateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.date!= null));
                        if (dateShouldBeCopiedAndSet == Boolean.TRUE) {
                            XMLGregorianCalendar sourceDate;
                            sourceDate = this.getDate();
                            XMLGregorianCalendar copyDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "date", sourceDate), sourceDate, (this.date!= null)));
                            copy.setDate(copyDate);
                        } else {
                            if (dateShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.date = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new InitPaymentResponse.Notifications.Notification();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof InitPaymentResponse.Notifications.Notification) {
                    final InitPaymentResponse.Notifications.Notification target = this;
                    final InitPaymentResponse.Notifications.Notification leftObject = ((InitPaymentResponse.Notifications.Notification) left);
                    final InitPaymentResponse.Notifications.Notification rightObject = ((InitPaymentResponse.Notifications.Notification) right);
                    {
                        Boolean messageShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.message!= null), (rightObject.message!= null));
                        if (messageShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsMessage;
                            lhsMessage = leftObject.getMessage();
                            String rhsMessage;
                            rhsMessage = rightObject.getMessage();
                            String mergedMessage = ((String) strategy.merge(LocatorUtils.property(leftLocator, "message", lhsMessage), LocatorUtils.property(rightLocator, "message", rhsMessage), lhsMessage, rhsMessage, (leftObject.message!= null), (rightObject.message!= null)));
                            target.setMessage(mergedMessage);
                        } else {
                            if (messageShouldBeMergedAndSet == Boolean.FALSE) {
                                target.message = null;
                            }
                        }
                    }
                    {
                        Boolean categoryShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.category!= null), (rightObject.category!= null));
                        if (categoryShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsCategory;
                            lhsCategory = leftObject.getCategory();
                            String rhsCategory;
                            rhsCategory = rightObject.getCategory();
                            String mergedCategory = ((String) strategy.merge(LocatorUtils.property(leftLocator, "category", lhsCategory), LocatorUtils.property(rightLocator, "category", rhsCategory), lhsCategory, rhsCategory, (leftObject.category!= null), (rightObject.category!= null)));
                            target.setCategory(mergedCategory);
                        } else {
                            if (categoryShouldBeMergedAndSet == Boolean.FALSE) {
                                target.category = null;
                            }
                        }
                    }
                    {
                        Boolean dateShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.date!= null), (rightObject.date!= null));
                        if (dateShouldBeMergedAndSet == Boolean.TRUE) {
                            XMLGregorianCalendar lhsDate;
                            lhsDate = leftObject.getDate();
                            XMLGregorianCalendar rhsDate;
                            rhsDate = rightObject.getDate();
                            XMLGregorianCalendar mergedDate = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "date", lhsDate), LocatorUtils.property(rightLocator, "date", rhsDate), lhsDate, rhsDate, (leftObject.date!= null), (rightObject.date!= null)));
                            target.setDate(mergedDate);
                        } else {
                            if (dateShouldBeMergedAndSet == Boolean.FALSE) {
                                target.date = null;
                            }
                        }
                    }
                }
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *         &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode"/&gt;
     *         &lt;element name="ChargesAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amount",
        "currencyCode",
        "chargesAmount"
    })
    public static class PayAmt implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "Amount")
        protected double amount;
        @XmlElement(name = "CurrencyCode", required = true)
        @XmlSchemaType(name = "string")
        protected EnumCurrencyCode currencyCode;
        @XmlElement(name = "ChargesAmount")
        protected double chargesAmount;

        /**
         * Gets the value of the amount property.
         * 
         */
        public double getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         */
        public void setAmount(double value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link EnumCurrencyCode }
         *     
         */
        public EnumCurrencyCode getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link EnumCurrencyCode }
         *     
         */
        public void setCurrencyCode(EnumCurrencyCode value) {
            this.currencyCode = value;
        }

        /**
         * Gets the value of the chargesAmount property.
         * 
         */
        public double getChargesAmount() {
            return chargesAmount;
        }

        /**
         * Sets the value of the chargesAmount property.
         * 
         */
        public void setChargesAmount(double value) {
            this.chargesAmount = value;
        }

        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                double theAmount;
                theAmount = this.getAmount();
                strategy.appendField(locator, this, "amount", buffer, theAmount, true);
            }
            {
                EnumCurrencyCode theCurrencyCode;
                theCurrencyCode = this.getCurrencyCode();
                strategy.appendField(locator, this, "currencyCode", buffer, theCurrencyCode, (this.currencyCode!= null));
            }
            {
                double theChargesAmount;
                theChargesAmount = this.getChargesAmount();
                strategy.appendField(locator, this, "chargesAmount", buffer, theChargesAmount, true);
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final InitPaymentResponse.PayAmt that = ((InitPaymentResponse.PayAmt) object);
            {
                double lhsAmount;
                lhsAmount = this.getAmount();
                double rhsAmount;
                rhsAmount = that.getAmount();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount, true, true)) {
                    return false;
                }
            }
            {
                EnumCurrencyCode lhsCurrencyCode;
                lhsCurrencyCode = this.getCurrencyCode();
                EnumCurrencyCode rhsCurrencyCode;
                rhsCurrencyCode = that.getCurrencyCode();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "currencyCode", lhsCurrencyCode), LocatorUtils.property(thatLocator, "currencyCode", rhsCurrencyCode), lhsCurrencyCode, rhsCurrencyCode, (this.currencyCode!= null), (that.currencyCode!= null))) {
                    return false;
                }
            }
            {
                double lhsChargesAmount;
                lhsChargesAmount = this.getChargesAmount();
                double rhsChargesAmount;
                rhsChargesAmount = that.getChargesAmount();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "chargesAmount", lhsChargesAmount), LocatorUtils.property(thatLocator, "chargesAmount", rhsChargesAmount), lhsChargesAmount, rhsChargesAmount, true, true)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
            int currentHashCode = 1;
            {
                double theAmount;
                theAmount = this.getAmount();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, true);
            }
            {
                EnumCurrencyCode theCurrencyCode;
                theCurrencyCode = this.getCurrencyCode();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currencyCode", theCurrencyCode), currentHashCode, theCurrencyCode, (this.currencyCode!= null));
            }
            {
                double theChargesAmount;
                theChargesAmount = this.getChargesAmount();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chargesAmount", theChargesAmount), currentHashCode, theChargesAmount, true);
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public Object clone() {
            return copyTo(createNewInstance());
        }

        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof InitPaymentResponse.PayAmt) {
                final InitPaymentResponse.PayAmt copy = ((InitPaymentResponse.PayAmt) draftCopy);
                {
                    Boolean amountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                    if (amountShouldBeCopiedAndSet == Boolean.TRUE) {
                        double sourceAmount;
                        sourceAmount = this.getAmount();
                        double copyAmount = strategy.copy(LocatorUtils.property(locator, "amount", sourceAmount), sourceAmount, true);
                        copy.setAmount(copyAmount);
                    } else {
                        if (amountShouldBeCopiedAndSet == Boolean.FALSE) {
                        }
                    }
                }
                {
                    Boolean currencyCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currencyCode!= null));
                    if (currencyCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                        EnumCurrencyCode sourceCurrencyCode;
                        sourceCurrencyCode = this.getCurrencyCode();
                        EnumCurrencyCode copyCurrencyCode = ((EnumCurrencyCode) strategy.copy(LocatorUtils.property(locator, "currencyCode", sourceCurrencyCode), sourceCurrencyCode, (this.currencyCode!= null)));
                        copy.setCurrencyCode(copyCurrencyCode);
                    } else {
                        if (currencyCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.currencyCode = null;
                        }
                    }
                }
                {
                    Boolean chargesAmountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                    if (chargesAmountShouldBeCopiedAndSet == Boolean.TRUE) {
                        double sourceChargesAmount;
                        sourceChargesAmount = this.getChargesAmount();
                        double copyChargesAmount = strategy.copy(LocatorUtils.property(locator, "chargesAmount", sourceChargesAmount), sourceChargesAmount, true);
                        copy.setChargesAmount(copyChargesAmount);
                    } else {
                        if (chargesAmountShouldBeCopiedAndSet == Boolean.FALSE) {
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new InitPaymentResponse.PayAmt();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InitPaymentResponse.PayAmt) {
                final InitPaymentResponse.PayAmt target = this;
                final InitPaymentResponse.PayAmt leftObject = ((InitPaymentResponse.PayAmt) left);
                final InitPaymentResponse.PayAmt rightObject = ((InitPaymentResponse.PayAmt) right);
                {
                    Boolean amountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, true, true);
                    if (amountShouldBeMergedAndSet == Boolean.TRUE) {
                        double lhsAmount;
                        lhsAmount = leftObject.getAmount();
                        double rhsAmount;
                        rhsAmount = rightObject.getAmount();
                        double mergedAmount = ((double) strategy.merge(LocatorUtils.property(leftLocator, "amount", lhsAmount), LocatorUtils.property(rightLocator, "amount", rhsAmount), lhsAmount, rhsAmount, true, true));
                        target.setAmount(mergedAmount);
                    } else {
                        if (amountShouldBeMergedAndSet == Boolean.FALSE) {
                        }
                    }
                }
                {
                    Boolean currencyCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.currencyCode!= null), (rightObject.currencyCode!= null));
                    if (currencyCodeShouldBeMergedAndSet == Boolean.TRUE) {
                        EnumCurrencyCode lhsCurrencyCode;
                        lhsCurrencyCode = leftObject.getCurrencyCode();
                        EnumCurrencyCode rhsCurrencyCode;
                        rhsCurrencyCode = rightObject.getCurrencyCode();
                        EnumCurrencyCode mergedCurrencyCode = ((EnumCurrencyCode) strategy.merge(LocatorUtils.property(leftLocator, "currencyCode", lhsCurrencyCode), LocatorUtils.property(rightLocator, "currencyCode", rhsCurrencyCode), lhsCurrencyCode, rhsCurrencyCode, (leftObject.currencyCode!= null), (rightObject.currencyCode!= null)));
                        target.setCurrencyCode(mergedCurrencyCode);
                    } else {
                        if (currencyCodeShouldBeMergedAndSet == Boolean.FALSE) {
                            target.currencyCode = null;
                        }
                    }
                }
                {
                    Boolean chargesAmountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, true, true);
                    if (chargesAmountShouldBeMergedAndSet == Boolean.TRUE) {
                        double lhsChargesAmount;
                        lhsChargesAmount = leftObject.getChargesAmount();
                        double rhsChargesAmount;
                        rhsChargesAmount = rightObject.getChargesAmount();
                        double mergedChargesAmount = ((double) strategy.merge(LocatorUtils.property(leftLocator, "chargesAmount", lhsChargesAmount), LocatorUtils.property(rightLocator, "chargesAmount", rhsChargesAmount), lhsChargesAmount, rhsChargesAmount, true, true));
                        target.setChargesAmount(mergedChargesAmount);
                    } else {
                        if (chargesAmountShouldBeMergedAndSet == Boolean.FALSE) {
                        }
                    }
                }
            }
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ParameterKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ParameterValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "parameterKey",
        "parameterValue"
    })
    public static class PaymentParameters implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "ParameterKey", required = true)
        protected String parameterKey;
        @XmlElement(name = "ParameterValue", required = true)
        protected String parameterValue;

        /**
         * Gets the value of the parameterKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParameterKey() {
            return parameterKey;
        }

        /**
         * Sets the value of the parameterKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParameterKey(String value) {
            this.parameterKey = value;
        }

        /**
         * Gets the value of the parameterValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParameterValue() {
            return parameterValue;
        }

        /**
         * Sets the value of the parameterValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParameterValue(String value) {
            this.parameterValue = value;
        }

        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                String theParameterKey;
                theParameterKey = this.getParameterKey();
                strategy.appendField(locator, this, "parameterKey", buffer, theParameterKey, (this.parameterKey!= null));
            }
            {
                String theParameterValue;
                theParameterValue = this.getParameterValue();
                strategy.appendField(locator, this, "parameterValue", buffer, theParameterValue, (this.parameterValue!= null));
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final InitPaymentResponse.PaymentParameters that = ((InitPaymentResponse.PaymentParameters) object);
            {
                String lhsParameterKey;
                lhsParameterKey = this.getParameterKey();
                String rhsParameterKey;
                rhsParameterKey = that.getParameterKey();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "parameterKey", lhsParameterKey), LocatorUtils.property(thatLocator, "parameterKey", rhsParameterKey), lhsParameterKey, rhsParameterKey, (this.parameterKey!= null), (that.parameterKey!= null))) {
                    return false;
                }
            }
            {
                String lhsParameterValue;
                lhsParameterValue = this.getParameterValue();
                String rhsParameterValue;
                rhsParameterValue = that.getParameterValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "parameterValue", lhsParameterValue), LocatorUtils.property(thatLocator, "parameterValue", rhsParameterValue), lhsParameterValue, rhsParameterValue, (this.parameterValue!= null), (that.parameterValue!= null))) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
            int currentHashCode = 1;
            {
                String theParameterKey;
                theParameterKey = this.getParameterKey();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameterKey", theParameterKey), currentHashCode, theParameterKey, (this.parameterKey!= null));
            }
            {
                String theParameterValue;
                theParameterValue = this.getParameterValue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameterValue", theParameterValue), currentHashCode, theParameterValue, (this.parameterValue!= null));
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public Object clone() {
            return copyTo(createNewInstance());
        }

        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof InitPaymentResponse.PaymentParameters) {
                final InitPaymentResponse.PaymentParameters copy = ((InitPaymentResponse.PaymentParameters) draftCopy);
                {
                    Boolean parameterKeyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parameterKey!= null));
                    if (parameterKeyShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceParameterKey;
                        sourceParameterKey = this.getParameterKey();
                        String copyParameterKey = ((String) strategy.copy(LocatorUtils.property(locator, "parameterKey", sourceParameterKey), sourceParameterKey, (this.parameterKey!= null)));
                        copy.setParameterKey(copyParameterKey);
                    } else {
                        if (parameterKeyShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.parameterKey = null;
                        }
                    }
                }
                {
                    Boolean parameterValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parameterValue!= null));
                    if (parameterValueShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceParameterValue;
                        sourceParameterValue = this.getParameterValue();
                        String copyParameterValue = ((String) strategy.copy(LocatorUtils.property(locator, "parameterValue", sourceParameterValue), sourceParameterValue, (this.parameterValue!= null)));
                        copy.setParameterValue(copyParameterValue);
                    } else {
                        if (parameterValueShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.parameterValue = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new InitPaymentResponse.PaymentParameters();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InitPaymentResponse.PaymentParameters) {
                final InitPaymentResponse.PaymentParameters target = this;
                final InitPaymentResponse.PaymentParameters leftObject = ((InitPaymentResponse.PaymentParameters) left);
                final InitPaymentResponse.PaymentParameters rightObject = ((InitPaymentResponse.PaymentParameters) right);
                {
                    Boolean parameterKeyShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.parameterKey!= null), (rightObject.parameterKey!= null));
                    if (parameterKeyShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsParameterKey;
                        lhsParameterKey = leftObject.getParameterKey();
                        String rhsParameterKey;
                        rhsParameterKey = rightObject.getParameterKey();
                        String mergedParameterKey = ((String) strategy.merge(LocatorUtils.property(leftLocator, "parameterKey", lhsParameterKey), LocatorUtils.property(rightLocator, "parameterKey", rhsParameterKey), lhsParameterKey, rhsParameterKey, (leftObject.parameterKey!= null), (rightObject.parameterKey!= null)));
                        target.setParameterKey(mergedParameterKey);
                    } else {
                        if (parameterKeyShouldBeMergedAndSet == Boolean.FALSE) {
                            target.parameterKey = null;
                        }
                    }
                }
                {
                    Boolean parameterValueShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.parameterValue!= null), (rightObject.parameterValue!= null));
                    if (parameterValueShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsParameterValue;
                        lhsParameterValue = leftObject.getParameterValue();
                        String rhsParameterValue;
                        rhsParameterValue = rightObject.getParameterValue();
                        String mergedParameterValue = ((String) strategy.merge(LocatorUtils.property(leftLocator, "parameterValue", lhsParameterValue), LocatorUtils.property(rightLocator, "parameterValue", rhsParameterValue), lhsParameterValue, rhsParameterValue, (leftObject.parameterValue!= null), (rightObject.parameterValue!= null)));
                        target.setParameterValue(mergedParameterValue);
                    } else {
                        if (parameterValueShouldBeMergedAndSet == Boolean.FALSE) {
                            target.parameterValue = null;
                        }
                    }
                }
            }
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ServiceReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="BillRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceReferenceNumber",
        "billRefNumber"
    })
    public static class ServiceData implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "ServiceReferenceNumber", required = true)
        protected String serviceReferenceNumber;
        @XmlElement(name = "BillRefNumber")
        protected String billRefNumber;

        /**
         * Gets the value of the serviceReferenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceReferenceNumber() {
            return serviceReferenceNumber;
        }

        /**
         * Sets the value of the serviceReferenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceReferenceNumber(String value) {
            this.serviceReferenceNumber = value;
        }

        /**
         * Gets the value of the billRefNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillRefNumber() {
            return billRefNumber;
        }

        /**
         * Sets the value of the billRefNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillRefNumber(String value) {
            this.billRefNumber = value;
        }

        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                String theServiceReferenceNumber;
                theServiceReferenceNumber = this.getServiceReferenceNumber();
                strategy.appendField(locator, this, "serviceReferenceNumber", buffer, theServiceReferenceNumber, (this.serviceReferenceNumber!= null));
            }
            {
                String theBillRefNumber;
                theBillRefNumber = this.getBillRefNumber();
                strategy.appendField(locator, this, "billRefNumber", buffer, theBillRefNumber, (this.billRefNumber!= null));
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final InitPaymentResponse.ServiceData that = ((InitPaymentResponse.ServiceData) object);
            {
                String lhsServiceReferenceNumber;
                lhsServiceReferenceNumber = this.getServiceReferenceNumber();
                String rhsServiceReferenceNumber;
                rhsServiceReferenceNumber = that.getServiceReferenceNumber();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceReferenceNumber", lhsServiceReferenceNumber), LocatorUtils.property(thatLocator, "serviceReferenceNumber", rhsServiceReferenceNumber), lhsServiceReferenceNumber, rhsServiceReferenceNumber, (this.serviceReferenceNumber!= null), (that.serviceReferenceNumber!= null))) {
                    return false;
                }
            }
            {
                String lhsBillRefNumber;
                lhsBillRefNumber = this.getBillRefNumber();
                String rhsBillRefNumber;
                rhsBillRefNumber = that.getBillRefNumber();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "billRefNumber", lhsBillRefNumber), LocatorUtils.property(thatLocator, "billRefNumber", rhsBillRefNumber), lhsBillRefNumber, rhsBillRefNumber, (this.billRefNumber!= null), (that.billRefNumber!= null))) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
            int currentHashCode = 1;
            {
                String theServiceReferenceNumber;
                theServiceReferenceNumber = this.getServiceReferenceNumber();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceReferenceNumber", theServiceReferenceNumber), currentHashCode, theServiceReferenceNumber, (this.serviceReferenceNumber!= null));
            }
            {
                String theBillRefNumber;
                theBillRefNumber = this.getBillRefNumber();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billRefNumber", theBillRefNumber), currentHashCode, theBillRefNumber, (this.billRefNumber!= null));
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public Object clone() {
            return copyTo(createNewInstance());
        }

        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof InitPaymentResponse.ServiceData) {
                final InitPaymentResponse.ServiceData copy = ((InitPaymentResponse.ServiceData) draftCopy);
                {
                    Boolean serviceReferenceNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceReferenceNumber!= null));
                    if (serviceReferenceNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceServiceReferenceNumber;
                        sourceServiceReferenceNumber = this.getServiceReferenceNumber();
                        String copyServiceReferenceNumber = ((String) strategy.copy(LocatorUtils.property(locator, "serviceReferenceNumber", sourceServiceReferenceNumber), sourceServiceReferenceNumber, (this.serviceReferenceNumber!= null)));
                        copy.setServiceReferenceNumber(copyServiceReferenceNumber);
                    } else {
                        if (serviceReferenceNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.serviceReferenceNumber = null;
                        }
                    }
                }
                {
                    Boolean billRefNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billRefNumber!= null));
                    if (billRefNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceBillRefNumber;
                        sourceBillRefNumber = this.getBillRefNumber();
                        String copyBillRefNumber = ((String) strategy.copy(LocatorUtils.property(locator, "billRefNumber", sourceBillRefNumber), sourceBillRefNumber, (this.billRefNumber!= null)));
                        copy.setBillRefNumber(copyBillRefNumber);
                    } else {
                        if (billRefNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.billRefNumber = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new InitPaymentResponse.ServiceData();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InitPaymentResponse.ServiceData) {
                final InitPaymentResponse.ServiceData target = this;
                final InitPaymentResponse.ServiceData leftObject = ((InitPaymentResponse.ServiceData) left);
                final InitPaymentResponse.ServiceData rightObject = ((InitPaymentResponse.ServiceData) right);
                {
                    Boolean serviceReferenceNumberShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceReferenceNumber!= null), (rightObject.serviceReferenceNumber!= null));
                    if (serviceReferenceNumberShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsServiceReferenceNumber;
                        lhsServiceReferenceNumber = leftObject.getServiceReferenceNumber();
                        String rhsServiceReferenceNumber;
                        rhsServiceReferenceNumber = rightObject.getServiceReferenceNumber();
                        String mergedServiceReferenceNumber = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceReferenceNumber", lhsServiceReferenceNumber), LocatorUtils.property(rightLocator, "serviceReferenceNumber", rhsServiceReferenceNumber), lhsServiceReferenceNumber, rhsServiceReferenceNumber, (leftObject.serviceReferenceNumber!= null), (rightObject.serviceReferenceNumber!= null)));
                        target.setServiceReferenceNumber(mergedServiceReferenceNumber);
                    } else {
                        if (serviceReferenceNumberShouldBeMergedAndSet == Boolean.FALSE) {
                            target.serviceReferenceNumber = null;
                        }
                    }
                }
                {
                    Boolean billRefNumberShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.billRefNumber!= null), (rightObject.billRefNumber!= null));
                    if (billRefNumberShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsBillRefNumber;
                        lhsBillRefNumber = leftObject.getBillRefNumber();
                        String rhsBillRefNumber;
                        rhsBillRefNumber = rightObject.getBillRefNumber();
                        String mergedBillRefNumber = ((String) strategy.merge(LocatorUtils.property(leftLocator, "billRefNumber", lhsBillRefNumber), LocatorUtils.property(rightLocator, "billRefNumber", rhsBillRefNumber), lhsBillRefNumber, rhsBillRefNumber, (leftObject.billRefNumber!= null), (rightObject.billRefNumber!= null)));
                        target.setBillRefNumber(mergedBillRefNumber);
                    } else {
                        if (billRefNumberShouldBeMergedAndSet == Boolean.FALSE) {
                            target.billRefNumber = null;
                        }
                    }
                }
            }
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TrxnId" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TrxnIdType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TrxnIdValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trxnIds"
    })
    public static class TrxnIds implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "TrxnId", required = true)
        protected List<InitPaymentResponse.TrxnIds.TrxnId> trxnIds;

        /**
         * Gets the value of the trxnIds property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trxnIds property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrxnIds().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InitPaymentResponse.TrxnIds.TrxnId }
         * 
         * 
         */
        public List<InitPaymentResponse.TrxnIds.TrxnId> getTrxnIds() {
            if (trxnIds == null) {
                trxnIds = new ArrayList<InitPaymentResponse.TrxnIds.TrxnId>();
            }
            return this.trxnIds;
        }

        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                List<InitPaymentResponse.TrxnIds.TrxnId> theTrxnIds;
                theTrxnIds = (((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))?this.getTrxnIds():null);
                strategy.appendField(locator, this, "trxnIds", buffer, theTrxnIds, ((this.trxnIds!= null)&&(!this.trxnIds.isEmpty())));
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final InitPaymentResponse.TrxnIds that = ((InitPaymentResponse.TrxnIds) object);
            {
                List<InitPaymentResponse.TrxnIds.TrxnId> lhsTrxnIds;
                lhsTrxnIds = (((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))?this.getTrxnIds():null);
                List<InitPaymentResponse.TrxnIds.TrxnId> rhsTrxnIds;
                rhsTrxnIds = (((that.trxnIds!= null)&&(!that.trxnIds.isEmpty()))?that.getTrxnIds():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnIds", lhsTrxnIds), LocatorUtils.property(thatLocator, "trxnIds", rhsTrxnIds), lhsTrxnIds, rhsTrxnIds, ((this.trxnIds!= null)&&(!this.trxnIds.isEmpty())), ((that.trxnIds!= null)&&(!that.trxnIds.isEmpty())))) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
            int currentHashCode = 1;
            {
                List<InitPaymentResponse.TrxnIds.TrxnId> theTrxnIds;
                theTrxnIds = (((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))?this.getTrxnIds():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnIds", theTrxnIds), currentHashCode, theTrxnIds, ((this.trxnIds!= null)&&(!this.trxnIds.isEmpty())));
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public Object clone() {
            return copyTo(createNewInstance());
        }

        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof InitPaymentResponse.TrxnIds) {
                final InitPaymentResponse.TrxnIds copy = ((InitPaymentResponse.TrxnIds) draftCopy);
                {
                    Boolean trxnIdsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.trxnIds!= null)&&(!this.trxnIds.isEmpty())));
                    if (trxnIdsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<InitPaymentResponse.TrxnIds.TrxnId> sourceTrxnIds;
                        sourceTrxnIds = (((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))?this.getTrxnIds():null);
                        @SuppressWarnings("unchecked")
                        List<InitPaymentResponse.TrxnIds.TrxnId> copyTrxnIds = ((List<InitPaymentResponse.TrxnIds.TrxnId> ) strategy.copy(LocatorUtils.property(locator, "trxnIds", sourceTrxnIds), sourceTrxnIds, ((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))));
                        copy.trxnIds = null;
                        if (copyTrxnIds!= null) {
                            List<InitPaymentResponse.TrxnIds.TrxnId> uniqueTrxnIdsl = copy.getTrxnIds();
                            uniqueTrxnIdsl.addAll(copyTrxnIds);
                        }
                    } else {
                        if (trxnIdsShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.trxnIds = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new InitPaymentResponse.TrxnIds();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InitPaymentResponse.TrxnIds) {
                final InitPaymentResponse.TrxnIds target = this;
                final InitPaymentResponse.TrxnIds leftObject = ((InitPaymentResponse.TrxnIds) left);
                final InitPaymentResponse.TrxnIds rightObject = ((InitPaymentResponse.TrxnIds) right);
                {
                    Boolean trxnIdsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.trxnIds!= null)&&(!leftObject.trxnIds.isEmpty())), ((rightObject.trxnIds!= null)&&(!rightObject.trxnIds.isEmpty())));
                    if (trxnIdsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<InitPaymentResponse.TrxnIds.TrxnId> lhsTrxnIds;
                        lhsTrxnIds = (((leftObject.trxnIds!= null)&&(!leftObject.trxnIds.isEmpty()))?leftObject.getTrxnIds():null);
                        List<InitPaymentResponse.TrxnIds.TrxnId> rhsTrxnIds;
                        rhsTrxnIds = (((rightObject.trxnIds!= null)&&(!rightObject.trxnIds.isEmpty()))?rightObject.getTrxnIds():null);
                        List<InitPaymentResponse.TrxnIds.TrxnId> mergedTrxnIds = ((List<InitPaymentResponse.TrxnIds.TrxnId> ) strategy.merge(LocatorUtils.property(leftLocator, "trxnIds", lhsTrxnIds), LocatorUtils.property(rightLocator, "trxnIds", rhsTrxnIds), lhsTrxnIds, rhsTrxnIds, ((leftObject.trxnIds!= null)&&(!leftObject.trxnIds.isEmpty())), ((rightObject.trxnIds!= null)&&(!rightObject.trxnIds.isEmpty()))));
                        target.trxnIds = null;
                        if (mergedTrxnIds!= null) {
                            List<InitPaymentResponse.TrxnIds.TrxnId> uniqueTrxnIdsl = target.getTrxnIds();
                            uniqueTrxnIdsl.addAll(mergedTrxnIds);
                        }
                    } else {
                        if (trxnIdsShouldBeMergedAndSet == Boolean.FALSE) {
                            target.trxnIds = null;
                        }
                    }
                }
            }
        }

        public void setTrxnIds(List<InitPaymentResponse.TrxnIds.TrxnId> value) {
            this.trxnIds = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="TrxnIdType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TrxnIdValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "trxnIdType",
            "trxnIdValue"
        })
        public static class TrxnId implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            @XmlElement(name = "TrxnIdType", required = true)
            protected String trxnIdType;
            @XmlElement(name = "TrxnIdValue", required = true)
            protected String trxnIdValue;

            /**
             * Gets the value of the trxnIdType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrxnIdType() {
                return trxnIdType;
            }

            /**
             * Sets the value of the trxnIdType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrxnIdType(String value) {
                this.trxnIdType = value;
            }

            /**
             * Gets the value of the trxnIdValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrxnIdValue() {
                return trxnIdValue;
            }

            /**
             * Sets the value of the trxnIdValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrxnIdValue(String value) {
                this.trxnIdValue = value;
            }

            public String toString() {
                final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                final StringBuilder buffer = new StringBuilder();
                append(null, buffer, strategy);
                return buffer.toString();
            }

            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                {
                    String theTrxnIdType;
                    theTrxnIdType = this.getTrxnIdType();
                    strategy.appendField(locator, this, "trxnIdType", buffer, theTrxnIdType, (this.trxnIdType!= null));
                }
                {
                    String theTrxnIdValue;
                    theTrxnIdValue = this.getTrxnIdValue();
                    strategy.appendField(locator, this, "trxnIdValue", buffer, theTrxnIdValue, (this.trxnIdValue!= null));
                }
                return buffer;
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final InitPaymentResponse.TrxnIds.TrxnId that = ((InitPaymentResponse.TrxnIds.TrxnId) object);
                {
                    String lhsTrxnIdType;
                    lhsTrxnIdType = this.getTrxnIdType();
                    String rhsTrxnIdType;
                    rhsTrxnIdType = that.getTrxnIdType();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnIdType", lhsTrxnIdType), LocatorUtils.property(thatLocator, "trxnIdType", rhsTrxnIdType), lhsTrxnIdType, rhsTrxnIdType, (this.trxnIdType!= null), (that.trxnIdType!= null))) {
                        return false;
                    }
                }
                {
                    String lhsTrxnIdValue;
                    lhsTrxnIdValue = this.getTrxnIdValue();
                    String rhsTrxnIdValue;
                    rhsTrxnIdValue = that.getTrxnIdValue();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnIdValue", lhsTrxnIdValue), LocatorUtils.property(thatLocator, "trxnIdValue", rhsTrxnIdValue), lhsTrxnIdValue, rhsTrxnIdValue, (this.trxnIdValue!= null), (that.trxnIdValue!= null))) {
                        return false;
                    }
                }
                return true;
            }

            public boolean equals(Object object) {
                final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
                return equals(null, null, object, strategy);
            }

            public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
                int currentHashCode = 1;
                {
                    String theTrxnIdType;
                    theTrxnIdType = this.getTrxnIdType();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnIdType", theTrxnIdType), currentHashCode, theTrxnIdType, (this.trxnIdType!= null));
                }
                {
                    String theTrxnIdValue;
                    theTrxnIdValue = this.getTrxnIdValue();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnIdValue", theTrxnIdValue), currentHashCode, theTrxnIdValue, (this.trxnIdValue!= null));
                }
                return currentHashCode;
            }

            public int hashCode() {
                final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
                return this.hashCode(null, strategy);
            }

            public Object clone() {
                return copyTo(createNewInstance());
            }

            public Object copyTo(Object target) {
                final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                return copyTo(null, target, strategy);
            }

            public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                final Object draftCopy = ((target == null)?createNewInstance():target);
                if (draftCopy instanceof InitPaymentResponse.TrxnIds.TrxnId) {
                    final InitPaymentResponse.TrxnIds.TrxnId copy = ((InitPaymentResponse.TrxnIds.TrxnId) draftCopy);
                    {
                        Boolean trxnIdTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnIdType!= null));
                        if (trxnIdTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceTrxnIdType;
                            sourceTrxnIdType = this.getTrxnIdType();
                            String copyTrxnIdType = ((String) strategy.copy(LocatorUtils.property(locator, "trxnIdType", sourceTrxnIdType), sourceTrxnIdType, (this.trxnIdType!= null)));
                            copy.setTrxnIdType(copyTrxnIdType);
                        } else {
                            if (trxnIdTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.trxnIdType = null;
                            }
                        }
                    }
                    {
                        Boolean trxnIdValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnIdValue!= null));
                        if (trxnIdValueShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceTrxnIdValue;
                            sourceTrxnIdValue = this.getTrxnIdValue();
                            String copyTrxnIdValue = ((String) strategy.copy(LocatorUtils.property(locator, "trxnIdValue", sourceTrxnIdValue), sourceTrxnIdValue, (this.trxnIdValue!= null)));
                            copy.setTrxnIdValue(copyTrxnIdValue);
                        } else {
                            if (trxnIdValueShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.trxnIdValue = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new InitPaymentResponse.TrxnIds.TrxnId();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof InitPaymentResponse.TrxnIds.TrxnId) {
                    final InitPaymentResponse.TrxnIds.TrxnId target = this;
                    final InitPaymentResponse.TrxnIds.TrxnId leftObject = ((InitPaymentResponse.TrxnIds.TrxnId) left);
                    final InitPaymentResponse.TrxnIds.TrxnId rightObject = ((InitPaymentResponse.TrxnIds.TrxnId) right);
                    {
                        Boolean trxnIdTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnIdType!= null), (rightObject.trxnIdType!= null));
                        if (trxnIdTypeShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsTrxnIdType;
                            lhsTrxnIdType = leftObject.getTrxnIdType();
                            String rhsTrxnIdType;
                            rhsTrxnIdType = rightObject.getTrxnIdType();
                            String mergedTrxnIdType = ((String) strategy.merge(LocatorUtils.property(leftLocator, "trxnIdType", lhsTrxnIdType), LocatorUtils.property(rightLocator, "trxnIdType", rhsTrxnIdType), lhsTrxnIdType, rhsTrxnIdType, (leftObject.trxnIdType!= null), (rightObject.trxnIdType!= null)));
                            target.setTrxnIdType(mergedTrxnIdType);
                        } else {
                            if (trxnIdTypeShouldBeMergedAndSet == Boolean.FALSE) {
                                target.trxnIdType = null;
                            }
                        }
                    }
                    {
                        Boolean trxnIdValueShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnIdValue!= null), (rightObject.trxnIdValue!= null));
                        if (trxnIdValueShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsTrxnIdValue;
                            lhsTrxnIdValue = leftObject.getTrxnIdValue();
                            String rhsTrxnIdValue;
                            rhsTrxnIdValue = rightObject.getTrxnIdValue();
                            String mergedTrxnIdValue = ((String) strategy.merge(LocatorUtils.property(leftLocator, "trxnIdValue", lhsTrxnIdValue), LocatorUtils.property(rightLocator, "trxnIdValue", rhsTrxnIdValue), lhsTrxnIdValue, rhsTrxnIdValue, (leftObject.trxnIdValue!= null), (rightObject.trxnIdValue!= null)));
                            target.setTrxnIdValue(mergedTrxnIdValue);
                        } else {
                            if (trxnIdValueShouldBeMergedAndSet == Boolean.FALSE) {
                                target.trxnIdValue = null;
                            }
                        }
                    }
                }
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="VoucherData" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VoucherSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="VouchNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="VoucherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VoucherPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VoucherExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "voucherDatas"
    })
    public static class VouchersData implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "VoucherData")
        protected List<InitPaymentResponse.VouchersData.VoucherData> voucherDatas;

        /**
         * Gets the value of the voucherDatas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the voucherDatas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVoucherDatas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InitPaymentResponse.VouchersData.VoucherData }
         * 
         * 
         */
        public List<InitPaymentResponse.VouchersData.VoucherData> getVoucherDatas() {
            if (voucherDatas == null) {
                voucherDatas = new ArrayList<InitPaymentResponse.VouchersData.VoucherData>();
            }
            return this.voucherDatas;
        }

        public String toString() {
            final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
            final StringBuilder buffer = new StringBuilder();
            append(null, buffer, strategy);
            return buffer.toString();
        }

        public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            strategy.appendStart(locator, this, buffer);
            appendFields(locator, buffer, strategy);
            strategy.appendEnd(locator, this, buffer);
            return buffer;
        }

        public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
            {
                List<InitPaymentResponse.VouchersData.VoucherData> theVoucherDatas;
                theVoucherDatas = (((this.voucherDatas!= null)&&(!this.voucherDatas.isEmpty()))?this.getVoucherDatas():null);
                strategy.appendField(locator, this, "voucherDatas", buffer, theVoucherDatas, ((this.voucherDatas!= null)&&(!this.voucherDatas.isEmpty())));
            }
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final InitPaymentResponse.VouchersData that = ((InitPaymentResponse.VouchersData) object);
            {
                List<InitPaymentResponse.VouchersData.VoucherData> lhsVoucherDatas;
                lhsVoucherDatas = (((this.voucherDatas!= null)&&(!this.voucherDatas.isEmpty()))?this.getVoucherDatas():null);
                List<InitPaymentResponse.VouchersData.VoucherData> rhsVoucherDatas;
                rhsVoucherDatas = (((that.voucherDatas!= null)&&(!that.voucherDatas.isEmpty()))?that.getVoucherDatas():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "voucherDatas", lhsVoucherDatas), LocatorUtils.property(thatLocator, "voucherDatas", rhsVoucherDatas), lhsVoucherDatas, rhsVoucherDatas, ((this.voucherDatas!= null)&&(!this.voucherDatas.isEmpty())), ((that.voucherDatas!= null)&&(!that.voucherDatas.isEmpty())))) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
            int currentHashCode = 1;
            {
                List<InitPaymentResponse.VouchersData.VoucherData> theVoucherDatas;
                theVoucherDatas = (((this.voucherDatas!= null)&&(!this.voucherDatas.isEmpty()))?this.getVoucherDatas():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "voucherDatas", theVoucherDatas), currentHashCode, theVoucherDatas, ((this.voucherDatas!= null)&&(!this.voucherDatas.isEmpty())));
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

        public Object clone() {
            return copyTo(createNewInstance());
        }

        public Object copyTo(Object target) {
            final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
            return copyTo(null, target, strategy);
        }

        public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
            final Object draftCopy = ((target == null)?createNewInstance():target);
            if (draftCopy instanceof InitPaymentResponse.VouchersData) {
                final InitPaymentResponse.VouchersData copy = ((InitPaymentResponse.VouchersData) draftCopy);
                {
                    Boolean voucherDatasShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.voucherDatas!= null)&&(!this.voucherDatas.isEmpty())));
                    if (voucherDatasShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<InitPaymentResponse.VouchersData.VoucherData> sourceVoucherDatas;
                        sourceVoucherDatas = (((this.voucherDatas!= null)&&(!this.voucherDatas.isEmpty()))?this.getVoucherDatas():null);
                        @SuppressWarnings("unchecked")
                        List<InitPaymentResponse.VouchersData.VoucherData> copyVoucherDatas = ((List<InitPaymentResponse.VouchersData.VoucherData> ) strategy.copy(LocatorUtils.property(locator, "voucherDatas", sourceVoucherDatas), sourceVoucherDatas, ((this.voucherDatas!= null)&&(!this.voucherDatas.isEmpty()))));
                        copy.voucherDatas = null;
                        if (copyVoucherDatas!= null) {
                            List<InitPaymentResponse.VouchersData.VoucherData> uniqueVoucherDatasl = copy.getVoucherDatas();
                            uniqueVoucherDatasl.addAll(copyVoucherDatas);
                        }
                    } else {
                        if (voucherDatasShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.voucherDatas = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new InitPaymentResponse.VouchersData();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InitPaymentResponse.VouchersData) {
                final InitPaymentResponse.VouchersData target = this;
                final InitPaymentResponse.VouchersData leftObject = ((InitPaymentResponse.VouchersData) left);
                final InitPaymentResponse.VouchersData rightObject = ((InitPaymentResponse.VouchersData) right);
                {
                    Boolean voucherDatasShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.voucherDatas!= null)&&(!leftObject.voucherDatas.isEmpty())), ((rightObject.voucherDatas!= null)&&(!rightObject.voucherDatas.isEmpty())));
                    if (voucherDatasShouldBeMergedAndSet == Boolean.TRUE) {
                        List<InitPaymentResponse.VouchersData.VoucherData> lhsVoucherDatas;
                        lhsVoucherDatas = (((leftObject.voucherDatas!= null)&&(!leftObject.voucherDatas.isEmpty()))?leftObject.getVoucherDatas():null);
                        List<InitPaymentResponse.VouchersData.VoucherData> rhsVoucherDatas;
                        rhsVoucherDatas = (((rightObject.voucherDatas!= null)&&(!rightObject.voucherDatas.isEmpty()))?rightObject.getVoucherDatas():null);
                        List<InitPaymentResponse.VouchersData.VoucherData> mergedVoucherDatas = ((List<InitPaymentResponse.VouchersData.VoucherData> ) strategy.merge(LocatorUtils.property(leftLocator, "voucherDatas", lhsVoucherDatas), LocatorUtils.property(rightLocator, "voucherDatas", rhsVoucherDatas), lhsVoucherDatas, rhsVoucherDatas, ((leftObject.voucherDatas!= null)&&(!leftObject.voucherDatas.isEmpty())), ((rightObject.voucherDatas!= null)&&(!rightObject.voucherDatas.isEmpty()))));
                        target.voucherDatas = null;
                        if (mergedVoucherDatas!= null) {
                            List<InitPaymentResponse.VouchersData.VoucherData> uniqueVoucherDatasl = target.getVoucherDatas();
                            uniqueVoucherDatasl.addAll(mergedVoucherDatas);
                        }
                    } else {
                        if (voucherDatasShouldBeMergedAndSet == Boolean.FALSE) {
                            target.voucherDatas = null;
                        }
                    }
                }
            }
        }

        public void setVoucherDatas(List<InitPaymentResponse.VouchersData.VoucherData> value) {
            this.voucherDatas = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="VoucherSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="VouchNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="VoucherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="VoucherPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="VoucherExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "voucherSerialNumber",
            "vouchNumber",
            "voucherName",
            "voucherPIN",
            "voucherExpiryDate"
        })
        public static class VoucherData implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            @XmlElement(name = "VoucherSerialNumber", required = true)
            protected String voucherSerialNumber;
            @XmlElement(name = "VouchNumber")
            protected Object vouchNumber;
            @XmlElement(name = "VoucherName")
            protected String voucherName;
            @XmlElement(name = "VoucherPIN")
            protected String voucherPIN;
            @XmlElement(name = "VoucherExpiryDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar voucherExpiryDate;

            /**
             * Gets the value of the voucherSerialNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVoucherSerialNumber() {
                return voucherSerialNumber;
            }

            /**
             * Sets the value of the voucherSerialNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVoucherSerialNumber(String value) {
                this.voucherSerialNumber = value;
            }

            /**
             * Gets the value of the vouchNumber property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getVouchNumber() {
                return vouchNumber;
            }

            /**
             * Sets the value of the vouchNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setVouchNumber(Object value) {
                this.vouchNumber = value;
            }

            /**
             * Gets the value of the voucherName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVoucherName() {
                return voucherName;
            }

            /**
             * Sets the value of the voucherName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVoucherName(String value) {
                this.voucherName = value;
            }

            /**
             * Gets the value of the voucherPIN property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVoucherPIN() {
                return voucherPIN;
            }

            /**
             * Sets the value of the voucherPIN property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVoucherPIN(String value) {
                this.voucherPIN = value;
            }

            /**
             * Gets the value of the voucherExpiryDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getVoucherExpiryDate() {
                return voucherExpiryDate;
            }

            /**
             * Sets the value of the voucherExpiryDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setVoucherExpiryDate(XMLGregorianCalendar value) {
                this.voucherExpiryDate = value;
            }

            public String toString() {
                final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
                final StringBuilder buffer = new StringBuilder();
                append(null, buffer, strategy);
                return buffer.toString();
            }

            public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                strategy.appendStart(locator, this, buffer);
                appendFields(locator, buffer, strategy);
                strategy.appendEnd(locator, this, buffer);
                return buffer;
            }

            public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
                {
                    String theVoucherSerialNumber;
                    theVoucherSerialNumber = this.getVoucherSerialNumber();
                    strategy.appendField(locator, this, "voucherSerialNumber", buffer, theVoucherSerialNumber, (this.voucherSerialNumber!= null));
                }
                {
                    Object theVouchNumber;
                    theVouchNumber = this.getVouchNumber();
                    strategy.appendField(locator, this, "vouchNumber", buffer, theVouchNumber, (this.vouchNumber!= null));
                }
                {
                    String theVoucherName;
                    theVoucherName = this.getVoucherName();
                    strategy.appendField(locator, this, "voucherName", buffer, theVoucherName, (this.voucherName!= null));
                }
                {
                    String theVoucherPIN;
                    theVoucherPIN = this.getVoucherPIN();
                    strategy.appendField(locator, this, "voucherPIN", buffer, theVoucherPIN, (this.voucherPIN!= null));
                }
                {
                    XMLGregorianCalendar theVoucherExpiryDate;
                    theVoucherExpiryDate = this.getVoucherExpiryDate();
                    strategy.appendField(locator, this, "voucherExpiryDate", buffer, theVoucherExpiryDate, (this.voucherExpiryDate!= null));
                }
                return buffer;
            }

            public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
                if ((object == null)||(this.getClass()!= object.getClass())) {
                    return false;
                }
                if (this == object) {
                    return true;
                }
                final InitPaymentResponse.VouchersData.VoucherData that = ((InitPaymentResponse.VouchersData.VoucherData) object);
                {
                    String lhsVoucherSerialNumber;
                    lhsVoucherSerialNumber = this.getVoucherSerialNumber();
                    String rhsVoucherSerialNumber;
                    rhsVoucherSerialNumber = that.getVoucherSerialNumber();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "voucherSerialNumber", lhsVoucherSerialNumber), LocatorUtils.property(thatLocator, "voucherSerialNumber", rhsVoucherSerialNumber), lhsVoucherSerialNumber, rhsVoucherSerialNumber, (this.voucherSerialNumber!= null), (that.voucherSerialNumber!= null))) {
                        return false;
                    }
                }
                {
                    Object lhsVouchNumber;
                    lhsVouchNumber = this.getVouchNumber();
                    Object rhsVouchNumber;
                    rhsVouchNumber = that.getVouchNumber();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "vouchNumber", lhsVouchNumber), LocatorUtils.property(thatLocator, "vouchNumber", rhsVouchNumber), lhsVouchNumber, rhsVouchNumber, (this.vouchNumber!= null), (that.vouchNumber!= null))) {
                        return false;
                    }
                }
                {
                    String lhsVoucherName;
                    lhsVoucherName = this.getVoucherName();
                    String rhsVoucherName;
                    rhsVoucherName = that.getVoucherName();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "voucherName", lhsVoucherName), LocatorUtils.property(thatLocator, "voucherName", rhsVoucherName), lhsVoucherName, rhsVoucherName, (this.voucherName!= null), (that.voucherName!= null))) {
                        return false;
                    }
                }
                {
                    String lhsVoucherPIN;
                    lhsVoucherPIN = this.getVoucherPIN();
                    String rhsVoucherPIN;
                    rhsVoucherPIN = that.getVoucherPIN();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "voucherPIN", lhsVoucherPIN), LocatorUtils.property(thatLocator, "voucherPIN", rhsVoucherPIN), lhsVoucherPIN, rhsVoucherPIN, (this.voucherPIN!= null), (that.voucherPIN!= null))) {
                        return false;
                    }
                }
                {
                    XMLGregorianCalendar lhsVoucherExpiryDate;
                    lhsVoucherExpiryDate = this.getVoucherExpiryDate();
                    XMLGregorianCalendar rhsVoucherExpiryDate;
                    rhsVoucherExpiryDate = that.getVoucherExpiryDate();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "voucherExpiryDate", lhsVoucherExpiryDate), LocatorUtils.property(thatLocator, "voucherExpiryDate", rhsVoucherExpiryDate), lhsVoucherExpiryDate, rhsVoucherExpiryDate, (this.voucherExpiryDate!= null), (that.voucherExpiryDate!= null))) {
                        return false;
                    }
                }
                return true;
            }

            public boolean equals(Object object) {
                final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
                return equals(null, null, object, strategy);
            }

            public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
                int currentHashCode = 1;
                {
                    String theVoucherSerialNumber;
                    theVoucherSerialNumber = this.getVoucherSerialNumber();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "voucherSerialNumber", theVoucherSerialNumber), currentHashCode, theVoucherSerialNumber, (this.voucherSerialNumber!= null));
                }
                {
                    Object theVouchNumber;
                    theVouchNumber = this.getVouchNumber();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vouchNumber", theVouchNumber), currentHashCode, theVouchNumber, (this.vouchNumber!= null));
                }
                {
                    String theVoucherName;
                    theVoucherName = this.getVoucherName();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "voucherName", theVoucherName), currentHashCode, theVoucherName, (this.voucherName!= null));
                }
                {
                    String theVoucherPIN;
                    theVoucherPIN = this.getVoucherPIN();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "voucherPIN", theVoucherPIN), currentHashCode, theVoucherPIN, (this.voucherPIN!= null));
                }
                {
                    XMLGregorianCalendar theVoucherExpiryDate;
                    theVoucherExpiryDate = this.getVoucherExpiryDate();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "voucherExpiryDate", theVoucherExpiryDate), currentHashCode, theVoucherExpiryDate, (this.voucherExpiryDate!= null));
                }
                return currentHashCode;
            }

            public int hashCode() {
                final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
                return this.hashCode(null, strategy);
            }

            public Object clone() {
                return copyTo(createNewInstance());
            }

            public Object copyTo(Object target) {
                final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
                return copyTo(null, target, strategy);
            }

            public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
                final Object draftCopy = ((target == null)?createNewInstance():target);
                if (draftCopy instanceof InitPaymentResponse.VouchersData.VoucherData) {
                    final InitPaymentResponse.VouchersData.VoucherData copy = ((InitPaymentResponse.VouchersData.VoucherData) draftCopy);
                    {
                        Boolean voucherSerialNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.voucherSerialNumber!= null));
                        if (voucherSerialNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceVoucherSerialNumber;
                            sourceVoucherSerialNumber = this.getVoucherSerialNumber();
                            String copyVoucherSerialNumber = ((String) strategy.copy(LocatorUtils.property(locator, "voucherSerialNumber", sourceVoucherSerialNumber), sourceVoucherSerialNumber, (this.voucherSerialNumber!= null)));
                            copy.setVoucherSerialNumber(copyVoucherSerialNumber);
                        } else {
                            if (voucherSerialNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.voucherSerialNumber = null;
                            }
                        }
                    }
                    {
                        Boolean vouchNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vouchNumber!= null));
                        if (vouchNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                            Object sourceVouchNumber;
                            sourceVouchNumber = this.getVouchNumber();
                            Object copyVouchNumber = ((Object) strategy.copy(LocatorUtils.property(locator, "vouchNumber", sourceVouchNumber), sourceVouchNumber, (this.vouchNumber!= null)));
                            copy.setVouchNumber(copyVouchNumber);
                        } else {
                            if (vouchNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.vouchNumber = null;
                            }
                        }
                    }
                    {
                        Boolean voucherNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.voucherName!= null));
                        if (voucherNameShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceVoucherName;
                            sourceVoucherName = this.getVoucherName();
                            String copyVoucherName = ((String) strategy.copy(LocatorUtils.property(locator, "voucherName", sourceVoucherName), sourceVoucherName, (this.voucherName!= null)));
                            copy.setVoucherName(copyVoucherName);
                        } else {
                            if (voucherNameShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.voucherName = null;
                            }
                        }
                    }
                    {
                        Boolean voucherPINShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.voucherPIN!= null));
                        if (voucherPINShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceVoucherPIN;
                            sourceVoucherPIN = this.getVoucherPIN();
                            String copyVoucherPIN = ((String) strategy.copy(LocatorUtils.property(locator, "voucherPIN", sourceVoucherPIN), sourceVoucherPIN, (this.voucherPIN!= null)));
                            copy.setVoucherPIN(copyVoucherPIN);
                        } else {
                            if (voucherPINShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.voucherPIN = null;
                            }
                        }
                    }
                    {
                        Boolean voucherExpiryDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.voucherExpiryDate!= null));
                        if (voucherExpiryDateShouldBeCopiedAndSet == Boolean.TRUE) {
                            XMLGregorianCalendar sourceVoucherExpiryDate;
                            sourceVoucherExpiryDate = this.getVoucherExpiryDate();
                            XMLGregorianCalendar copyVoucherExpiryDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "voucherExpiryDate", sourceVoucherExpiryDate), sourceVoucherExpiryDate, (this.voucherExpiryDate!= null)));
                            copy.setVoucherExpiryDate(copyVoucherExpiryDate);
                        } else {
                            if (voucherExpiryDateShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.voucherExpiryDate = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new InitPaymentResponse.VouchersData.VoucherData();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof InitPaymentResponse.VouchersData.VoucherData) {
                    final InitPaymentResponse.VouchersData.VoucherData target = this;
                    final InitPaymentResponse.VouchersData.VoucherData leftObject = ((InitPaymentResponse.VouchersData.VoucherData) left);
                    final InitPaymentResponse.VouchersData.VoucherData rightObject = ((InitPaymentResponse.VouchersData.VoucherData) right);
                    {
                        Boolean voucherSerialNumberShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.voucherSerialNumber!= null), (rightObject.voucherSerialNumber!= null));
                        if (voucherSerialNumberShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsVoucherSerialNumber;
                            lhsVoucherSerialNumber = leftObject.getVoucherSerialNumber();
                            String rhsVoucherSerialNumber;
                            rhsVoucherSerialNumber = rightObject.getVoucherSerialNumber();
                            String mergedVoucherSerialNumber = ((String) strategy.merge(LocatorUtils.property(leftLocator, "voucherSerialNumber", lhsVoucherSerialNumber), LocatorUtils.property(rightLocator, "voucherSerialNumber", rhsVoucherSerialNumber), lhsVoucherSerialNumber, rhsVoucherSerialNumber, (leftObject.voucherSerialNumber!= null), (rightObject.voucherSerialNumber!= null)));
                            target.setVoucherSerialNumber(mergedVoucherSerialNumber);
                        } else {
                            if (voucherSerialNumberShouldBeMergedAndSet == Boolean.FALSE) {
                                target.voucherSerialNumber = null;
                            }
                        }
                    }
                    {
                        Boolean vouchNumberShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.vouchNumber!= null), (rightObject.vouchNumber!= null));
                        if (vouchNumberShouldBeMergedAndSet == Boolean.TRUE) {
                            Object lhsVouchNumber;
                            lhsVouchNumber = leftObject.getVouchNumber();
                            Object rhsVouchNumber;
                            rhsVouchNumber = rightObject.getVouchNumber();
                            Object mergedVouchNumber = ((Object) strategy.merge(LocatorUtils.property(leftLocator, "vouchNumber", lhsVouchNumber), LocatorUtils.property(rightLocator, "vouchNumber", rhsVouchNumber), lhsVouchNumber, rhsVouchNumber, (leftObject.vouchNumber!= null), (rightObject.vouchNumber!= null)));
                            target.setVouchNumber(mergedVouchNumber);
                        } else {
                            if (vouchNumberShouldBeMergedAndSet == Boolean.FALSE) {
                                target.vouchNumber = null;
                            }
                        }
                    }
                    {
                        Boolean voucherNameShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.voucherName!= null), (rightObject.voucherName!= null));
                        if (voucherNameShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsVoucherName;
                            lhsVoucherName = leftObject.getVoucherName();
                            String rhsVoucherName;
                            rhsVoucherName = rightObject.getVoucherName();
                            String mergedVoucherName = ((String) strategy.merge(LocatorUtils.property(leftLocator, "voucherName", lhsVoucherName), LocatorUtils.property(rightLocator, "voucherName", rhsVoucherName), lhsVoucherName, rhsVoucherName, (leftObject.voucherName!= null), (rightObject.voucherName!= null)));
                            target.setVoucherName(mergedVoucherName);
                        } else {
                            if (voucherNameShouldBeMergedAndSet == Boolean.FALSE) {
                                target.voucherName = null;
                            }
                        }
                    }
                    {
                        Boolean voucherPINShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.voucherPIN!= null), (rightObject.voucherPIN!= null));
                        if (voucherPINShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsVoucherPIN;
                            lhsVoucherPIN = leftObject.getVoucherPIN();
                            String rhsVoucherPIN;
                            rhsVoucherPIN = rightObject.getVoucherPIN();
                            String mergedVoucherPIN = ((String) strategy.merge(LocatorUtils.property(leftLocator, "voucherPIN", lhsVoucherPIN), LocatorUtils.property(rightLocator, "voucherPIN", rhsVoucherPIN), lhsVoucherPIN, rhsVoucherPIN, (leftObject.voucherPIN!= null), (rightObject.voucherPIN!= null)));
                            target.setVoucherPIN(mergedVoucherPIN);
                        } else {
                            if (voucherPINShouldBeMergedAndSet == Boolean.FALSE) {
                                target.voucherPIN = null;
                            }
                        }
                    }
                    {
                        Boolean voucherExpiryDateShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.voucherExpiryDate!= null), (rightObject.voucherExpiryDate!= null));
                        if (voucherExpiryDateShouldBeMergedAndSet == Boolean.TRUE) {
                            XMLGregorianCalendar lhsVoucherExpiryDate;
                            lhsVoucherExpiryDate = leftObject.getVoucherExpiryDate();
                            XMLGregorianCalendar rhsVoucherExpiryDate;
                            rhsVoucherExpiryDate = rightObject.getVoucherExpiryDate();
                            XMLGregorianCalendar mergedVoucherExpiryDate = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "voucherExpiryDate", lhsVoucherExpiryDate), LocatorUtils.property(rightLocator, "voucherExpiryDate", rhsVoucherExpiryDate), lhsVoucherExpiryDate, rhsVoucherExpiryDate, (leftObject.voucherExpiryDate!= null), (rightObject.voucherExpiryDate!= null)));
                            target.setVoucherExpiryDate(mergedVoucherExpiryDate);
                        } else {
                            if (voucherExpiryDateShouldBeMergedAndSet == Boolean.FALSE) {
                                target.voucherExpiryDate = null;
                            }
                        }
                    }
                }
            }

        }

    }

}
