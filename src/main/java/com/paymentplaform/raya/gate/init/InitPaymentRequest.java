
package com.paymentplaform.raya.gate.init;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.paymentplaform.raya.gate.EnumCurrencyCode;
import com.paymentplaform.raya.gate.EnumTransType;
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


/**
 * <p>Java class for Init_Payment_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Init_Payment_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AsynchUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MaxRec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cursor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TrxnType" type="{http://raya.paymentplaform.com/gate}EnumTransType"/&gt;
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ServiceReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="BillRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PaymentParameters" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ParameterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ParameterValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="DRAcct"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FundBOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TermID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DRAcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreditAccount" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CRBOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TermID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CRAcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReAttempt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Init_Payment_Request", namespace = "http://raya.paymentplaform.com/gate/init", propOrder = {
    "rqUID",
    "asynchUID",
    "maxRec",
    "cursor",
    "serviceCode",
    "trxnType",
    "paymentMethod",
    "serviceData",
    "payAmt",
    "drAcct",
    "creditAccount",
    "reAttempt"
})
public class InitPaymentRequest implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsynchUID")
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
    @XmlElement(name = "PaymentMethod", required = true, defaultValue = "Cash")
    protected String paymentMethod;
    @XmlElement(name = "ServiceData")
    protected InitPaymentRequest.ServiceData serviceData;
    @XmlElement(name = "PayAmt", required = true)
    protected InitPaymentRequest.PayAmt payAmt;
    @XmlElement(name = "DRAcct", required = true)
    protected InitPaymentRequest.DRAcct drAcct;
    @XmlElement(name = "CreditAccount")
    protected InitPaymentRequest.CreditAccount creditAccount;
    @XmlElement(name = "ReAttempt")
    protected Boolean reAttempt;

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
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the serviceData property.
     * 
     * @return
     *     possible object is
     *     {@link InitPaymentRequest.ServiceData }
     *     
     */
    public InitPaymentRequest.ServiceData getServiceData() {
        return serviceData;
    }

    /**
     * Sets the value of the serviceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitPaymentRequest.ServiceData }
     *     
     */
    public void setServiceData(InitPaymentRequest.ServiceData value) {
        this.serviceData = value;
    }

    /**
     * Gets the value of the payAmt property.
     * 
     * @return
     *     possible object is
     *     {@link InitPaymentRequest.PayAmt }
     *     
     */
    public InitPaymentRequest.PayAmt getPayAmt() {
        return payAmt;
    }

    /**
     * Sets the value of the payAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitPaymentRequest.PayAmt }
     *     
     */
    public void setPayAmt(InitPaymentRequest.PayAmt value) {
        this.payAmt = value;
    }

    /**
     * Gets the value of the drAcct property.
     * 
     * @return
     *     possible object is
     *     {@link InitPaymentRequest.DRAcct }
     *     
     */
    public InitPaymentRequest.DRAcct getDRAcct() {
        return drAcct;
    }

    /**
     * Sets the value of the drAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitPaymentRequest.DRAcct }
     *     
     */
    public void setDRAcct(InitPaymentRequest.DRAcct value) {
        this.drAcct = value;
    }

    /**
     * Gets the value of the creditAccount property.
     * 
     * @return
     *     possible object is
     *     {@link InitPaymentRequest.CreditAccount }
     *     
     */
    public InitPaymentRequest.CreditAccount getCreditAccount() {
        return creditAccount;
    }

    /**
     * Sets the value of the creditAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitPaymentRequest.CreditAccount }
     *     
     */
    public void setCreditAccount(InitPaymentRequest.CreditAccount value) {
        this.creditAccount = value;
    }

    /**
     * Gets the value of the reAttempt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReAttempt() {
        return reAttempt;
    }

    /**
     * Sets the value of the reAttempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReAttempt(Boolean value) {
        this.reAttempt = value;
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
            String thePaymentMethod;
            thePaymentMethod = this.getPaymentMethod();
            strategy.appendField(locator, this, "paymentMethod", buffer, thePaymentMethod, (this.paymentMethod!= null));
        }
        {
            InitPaymentRequest.ServiceData theServiceData;
            theServiceData = this.getServiceData();
            strategy.appendField(locator, this, "serviceData", buffer, theServiceData, (this.serviceData!= null));
        }
        {
            InitPaymentRequest.PayAmt thePayAmt;
            thePayAmt = this.getPayAmt();
            strategy.appendField(locator, this, "payAmt", buffer, thePayAmt, (this.payAmt!= null));
        }
        {
            InitPaymentRequest.DRAcct theDRAcct;
            theDRAcct = this.getDRAcct();
            strategy.appendField(locator, this, "drAcct", buffer, theDRAcct, (this.drAcct!= null));
        }
        {
            InitPaymentRequest.CreditAccount theCreditAccount;
            theCreditAccount = this.getCreditAccount();
            strategy.appendField(locator, this, "creditAccount", buffer, theCreditAccount, (this.creditAccount!= null));
        }
        {
            Boolean theReAttempt;
            theReAttempt = this.isReAttempt();
            strategy.appendField(locator, this, "reAttempt", buffer, theReAttempt, (this.reAttempt!= null));
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
        final InitPaymentRequest that = ((InitPaymentRequest) object);
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
            String lhsPaymentMethod;
            lhsPaymentMethod = this.getPaymentMethod();
            String rhsPaymentMethod;
            rhsPaymentMethod = that.getPaymentMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentMethod", lhsPaymentMethod), LocatorUtils.property(thatLocator, "paymentMethod", rhsPaymentMethod), lhsPaymentMethod, rhsPaymentMethod, (this.paymentMethod!= null), (that.paymentMethod!= null))) {
                return false;
            }
        }
        {
            InitPaymentRequest.ServiceData lhsServiceData;
            lhsServiceData = this.getServiceData();
            InitPaymentRequest.ServiceData rhsServiceData;
            rhsServiceData = that.getServiceData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceData", lhsServiceData), LocatorUtils.property(thatLocator, "serviceData", rhsServiceData), lhsServiceData, rhsServiceData, (this.serviceData!= null), (that.serviceData!= null))) {
                return false;
            }
        }
        {
            InitPaymentRequest.PayAmt lhsPayAmt;
            lhsPayAmt = this.getPayAmt();
            InitPaymentRequest.PayAmt rhsPayAmt;
            rhsPayAmt = that.getPayAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payAmt", lhsPayAmt), LocatorUtils.property(thatLocator, "payAmt", rhsPayAmt), lhsPayAmt, rhsPayAmt, (this.payAmt!= null), (that.payAmt!= null))) {
                return false;
            }
        }
        {
            InitPaymentRequest.DRAcct lhsDRAcct;
            lhsDRAcct = this.getDRAcct();
            InitPaymentRequest.DRAcct rhsDRAcct;
            rhsDRAcct = that.getDRAcct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "drAcct", lhsDRAcct), LocatorUtils.property(thatLocator, "drAcct", rhsDRAcct), lhsDRAcct, rhsDRAcct, (this.drAcct!= null), (that.drAcct!= null))) {
                return false;
            }
        }
        {
            InitPaymentRequest.CreditAccount lhsCreditAccount;
            lhsCreditAccount = this.getCreditAccount();
            InitPaymentRequest.CreditAccount rhsCreditAccount;
            rhsCreditAccount = that.getCreditAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "creditAccount", lhsCreditAccount), LocatorUtils.property(thatLocator, "creditAccount", rhsCreditAccount), lhsCreditAccount, rhsCreditAccount, (this.creditAccount!= null), (that.creditAccount!= null))) {
                return false;
            }
        }
        {
            Boolean lhsReAttempt;
            lhsReAttempt = this.isReAttempt();
            Boolean rhsReAttempt;
            rhsReAttempt = that.isReAttempt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reAttempt", lhsReAttempt), LocatorUtils.property(thatLocator, "reAttempt", rhsReAttempt), lhsReAttempt, rhsReAttempt, (this.reAttempt!= null), (that.reAttempt!= null))) {
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
            String thePaymentMethod;
            thePaymentMethod = this.getPaymentMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentMethod", thePaymentMethod), currentHashCode, thePaymentMethod, (this.paymentMethod!= null));
        }
        {
            InitPaymentRequest.ServiceData theServiceData;
            theServiceData = this.getServiceData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceData", theServiceData), currentHashCode, theServiceData, (this.serviceData!= null));
        }
        {
            InitPaymentRequest.PayAmt thePayAmt;
            thePayAmt = this.getPayAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payAmt", thePayAmt), currentHashCode, thePayAmt, (this.payAmt!= null));
        }
        {
            InitPaymentRequest.DRAcct theDRAcct;
            theDRAcct = this.getDRAcct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "drAcct", theDRAcct), currentHashCode, theDRAcct, (this.drAcct!= null));
        }
        {
            InitPaymentRequest.CreditAccount theCreditAccount;
            theCreditAccount = this.getCreditAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "creditAccount", theCreditAccount), currentHashCode, theCreditAccount, (this.creditAccount!= null));
        }
        {
            Boolean theReAttempt;
            theReAttempt = this.isReAttempt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reAttempt", theReAttempt), currentHashCode, theReAttempt, (this.reAttempt!= null));
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
        if (draftCopy instanceof InitPaymentRequest) {
            final InitPaymentRequest copy = ((InitPaymentRequest) draftCopy);
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
                Boolean paymentMethodShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.paymentMethod!= null));
                if (paymentMethodShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourcePaymentMethod;
                    sourcePaymentMethod = this.getPaymentMethod();
                    String copyPaymentMethod = ((String) strategy.copy(LocatorUtils.property(locator, "paymentMethod", sourcePaymentMethod), sourcePaymentMethod, (this.paymentMethod!= null)));
                    copy.setPaymentMethod(copyPaymentMethod);
                } else {
                    if (paymentMethodShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.paymentMethod = null;
                    }
                }
            }
            {
                Boolean serviceDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceData!= null));
                if (serviceDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    InitPaymentRequest.ServiceData sourceServiceData;
                    sourceServiceData = this.getServiceData();
                    InitPaymentRequest.ServiceData copyServiceData = ((InitPaymentRequest.ServiceData) strategy.copy(LocatorUtils.property(locator, "serviceData", sourceServiceData), sourceServiceData, (this.serviceData!= null)));
                    copy.setServiceData(copyServiceData);
                } else {
                    if (serviceDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceData = null;
                    }
                }
            }
            {
                Boolean payAmtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.payAmt!= null));
                if (payAmtShouldBeCopiedAndSet == Boolean.TRUE) {
                    InitPaymentRequest.PayAmt sourcePayAmt;
                    sourcePayAmt = this.getPayAmt();
                    InitPaymentRequest.PayAmt copyPayAmt = ((InitPaymentRequest.PayAmt) strategy.copy(LocatorUtils.property(locator, "payAmt", sourcePayAmt), sourcePayAmt, (this.payAmt!= null)));
                    copy.setPayAmt(copyPayAmt);
                } else {
                    if (payAmtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.payAmt = null;
                    }
                }
            }
            {
                Boolean drAcctShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.drAcct!= null));
                if (drAcctShouldBeCopiedAndSet == Boolean.TRUE) {
                    InitPaymentRequest.DRAcct sourceDRAcct;
                    sourceDRAcct = this.getDRAcct();
                    InitPaymentRequest.DRAcct copyDRAcct = ((InitPaymentRequest.DRAcct) strategy.copy(LocatorUtils.property(locator, "drAcct", sourceDRAcct), sourceDRAcct, (this.drAcct!= null)));
                    copy.setDRAcct(copyDRAcct);
                } else {
                    if (drAcctShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.drAcct = null;
                    }
                }
            }
            {
                Boolean creditAccountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.creditAccount!= null));
                if (creditAccountShouldBeCopiedAndSet == Boolean.TRUE) {
                    InitPaymentRequest.CreditAccount sourceCreditAccount;
                    sourceCreditAccount = this.getCreditAccount();
                    InitPaymentRequest.CreditAccount copyCreditAccount = ((InitPaymentRequest.CreditAccount) strategy.copy(LocatorUtils.property(locator, "creditAccount", sourceCreditAccount), sourceCreditAccount, (this.creditAccount!= null)));
                    copy.setCreditAccount(copyCreditAccount);
                } else {
                    if (creditAccountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.creditAccount = null;
                    }
                }
            }
            {
                Boolean reAttemptShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.reAttempt!= null));
                if (reAttemptShouldBeCopiedAndSet == Boolean.TRUE) {
                    Boolean sourceReAttempt;
                    sourceReAttempt = this.isReAttempt();
                    Boolean copyReAttempt = ((Boolean) strategy.copy(LocatorUtils.property(locator, "reAttempt", sourceReAttempt), sourceReAttempt, (this.reAttempt!= null)));
                    copy.setReAttempt(copyReAttempt);
                } else {
                    if (reAttemptShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.reAttempt = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new InitPaymentRequest();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof InitPaymentRequest) {
            final InitPaymentRequest target = this;
            final InitPaymentRequest leftObject = ((InitPaymentRequest) left);
            final InitPaymentRequest rightObject = ((InitPaymentRequest) right);
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
                Boolean paymentMethodShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.paymentMethod!= null), (rightObject.paymentMethod!= null));
                if (paymentMethodShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsPaymentMethod;
                    lhsPaymentMethod = leftObject.getPaymentMethod();
                    String rhsPaymentMethod;
                    rhsPaymentMethod = rightObject.getPaymentMethod();
                    String mergedPaymentMethod = ((String) strategy.merge(LocatorUtils.property(leftLocator, "paymentMethod", lhsPaymentMethod), LocatorUtils.property(rightLocator, "paymentMethod", rhsPaymentMethod), lhsPaymentMethod, rhsPaymentMethod, (leftObject.paymentMethod!= null), (rightObject.paymentMethod!= null)));
                    target.setPaymentMethod(mergedPaymentMethod);
                } else {
                    if (paymentMethodShouldBeMergedAndSet == Boolean.FALSE) {
                        target.paymentMethod = null;
                    }
                }
            }
            {
                Boolean serviceDataShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceData!= null), (rightObject.serviceData!= null));
                if (serviceDataShouldBeMergedAndSet == Boolean.TRUE) {
                    InitPaymentRequest.ServiceData lhsServiceData;
                    lhsServiceData = leftObject.getServiceData();
                    InitPaymentRequest.ServiceData rhsServiceData;
                    rhsServiceData = rightObject.getServiceData();
                    InitPaymentRequest.ServiceData mergedServiceData = ((InitPaymentRequest.ServiceData) strategy.merge(LocatorUtils.property(leftLocator, "serviceData", lhsServiceData), LocatorUtils.property(rightLocator, "serviceData", rhsServiceData), lhsServiceData, rhsServiceData, (leftObject.serviceData!= null), (rightObject.serviceData!= null)));
                    target.setServiceData(mergedServiceData);
                } else {
                    if (serviceDataShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceData = null;
                    }
                }
            }
            {
                Boolean payAmtShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.payAmt!= null), (rightObject.payAmt!= null));
                if (payAmtShouldBeMergedAndSet == Boolean.TRUE) {
                    InitPaymentRequest.PayAmt lhsPayAmt;
                    lhsPayAmt = leftObject.getPayAmt();
                    InitPaymentRequest.PayAmt rhsPayAmt;
                    rhsPayAmt = rightObject.getPayAmt();
                    InitPaymentRequest.PayAmt mergedPayAmt = ((InitPaymentRequest.PayAmt) strategy.merge(LocatorUtils.property(leftLocator, "payAmt", lhsPayAmt), LocatorUtils.property(rightLocator, "payAmt", rhsPayAmt), lhsPayAmt, rhsPayAmt, (leftObject.payAmt!= null), (rightObject.payAmt!= null)));
                    target.setPayAmt(mergedPayAmt);
                } else {
                    if (payAmtShouldBeMergedAndSet == Boolean.FALSE) {
                        target.payAmt = null;
                    }
                }
            }
            {
                Boolean drAcctShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.drAcct!= null), (rightObject.drAcct!= null));
                if (drAcctShouldBeMergedAndSet == Boolean.TRUE) {
                    InitPaymentRequest.DRAcct lhsDRAcct;
                    lhsDRAcct = leftObject.getDRAcct();
                    InitPaymentRequest.DRAcct rhsDRAcct;
                    rhsDRAcct = rightObject.getDRAcct();
                    InitPaymentRequest.DRAcct mergedDRAcct = ((InitPaymentRequest.DRAcct) strategy.merge(LocatorUtils.property(leftLocator, "drAcct", lhsDRAcct), LocatorUtils.property(rightLocator, "drAcct", rhsDRAcct), lhsDRAcct, rhsDRAcct, (leftObject.drAcct!= null), (rightObject.drAcct!= null)));
                    target.setDRAcct(mergedDRAcct);
                } else {
                    if (drAcctShouldBeMergedAndSet == Boolean.FALSE) {
                        target.drAcct = null;
                    }
                }
            }
            {
                Boolean creditAccountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.creditAccount!= null), (rightObject.creditAccount!= null));
                if (creditAccountShouldBeMergedAndSet == Boolean.TRUE) {
                    InitPaymentRequest.CreditAccount lhsCreditAccount;
                    lhsCreditAccount = leftObject.getCreditAccount();
                    InitPaymentRequest.CreditAccount rhsCreditAccount;
                    rhsCreditAccount = rightObject.getCreditAccount();
                    InitPaymentRequest.CreditAccount mergedCreditAccount = ((InitPaymentRequest.CreditAccount) strategy.merge(LocatorUtils.property(leftLocator, "creditAccount", lhsCreditAccount), LocatorUtils.property(rightLocator, "creditAccount", rhsCreditAccount), lhsCreditAccount, rhsCreditAccount, (leftObject.creditAccount!= null), (rightObject.creditAccount!= null)));
                    target.setCreditAccount(mergedCreditAccount);
                } else {
                    if (creditAccountShouldBeMergedAndSet == Boolean.FALSE) {
                        target.creditAccount = null;
                    }
                }
            }
            {
                Boolean reAttemptShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.reAttempt!= null), (rightObject.reAttempt!= null));
                if (reAttemptShouldBeMergedAndSet == Boolean.TRUE) {
                    Boolean lhsReAttempt;
                    lhsReAttempt = leftObject.isReAttempt();
                    Boolean rhsReAttempt;
                    rhsReAttempt = rightObject.isReAttempt();
                    Boolean mergedReAttempt = ((Boolean) strategy.merge(LocatorUtils.property(leftLocator, "reAttempt", lhsReAttempt), LocatorUtils.property(rightLocator, "reAttempt", rhsReAttempt), lhsReAttempt, rhsReAttempt, (leftObject.reAttempt!= null), (rightObject.reAttempt!= null)));
                    target.setReAttempt(mergedReAttempt);
                } else {
                    if (reAttemptShouldBeMergedAndSet == Boolean.FALSE) {
                        target.reAttempt = null;
                    }
                }
            }
        }
    }

    public Boolean getReAttempt() {
        return isReAttempt();
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
     *         &lt;element name="CRBOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TermID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CRAcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "crbOrg",
        "termID",
        "crAcctNo"
    })
    public static class CreditAccount implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "CRBOrg")
        protected String crbOrg;
        @XmlElement(name = "TermID", required = true)
        protected String termID;
        @XmlElement(name = "CRAcctNo", required = true)
        protected String crAcctNo;

        /**
         * Gets the value of the crbOrg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRBOrg() {
            return crbOrg;
        }

        /**
         * Sets the value of the crbOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRBOrg(String value) {
            this.crbOrg = value;
        }

        /**
         * Gets the value of the termID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTermID() {
            return termID;
        }

        /**
         * Sets the value of the termID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTermID(String value) {
            this.termID = value;
        }

        /**
         * Gets the value of the crAcctNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCRAcctNo() {
            return crAcctNo;
        }

        /**
         * Sets the value of the crAcctNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCRAcctNo(String value) {
            this.crAcctNo = value;
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
                String theCRBOrg;
                theCRBOrg = this.getCRBOrg();
                strategy.appendField(locator, this, "crbOrg", buffer, theCRBOrg, (this.crbOrg!= null));
            }
            {
                String theTermID;
                theTermID = this.getTermID();
                strategy.appendField(locator, this, "termID", buffer, theTermID, (this.termID!= null));
            }
            {
                String theCRAcctNo;
                theCRAcctNo = this.getCRAcctNo();
                strategy.appendField(locator, this, "crAcctNo", buffer, theCRAcctNo, (this.crAcctNo!= null));
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
            final InitPaymentRequest.CreditAccount that = ((InitPaymentRequest.CreditAccount) object);
            {
                String lhsCRBOrg;
                lhsCRBOrg = this.getCRBOrg();
                String rhsCRBOrg;
                rhsCRBOrg = that.getCRBOrg();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "crbOrg", lhsCRBOrg), LocatorUtils.property(thatLocator, "crbOrg", rhsCRBOrg), lhsCRBOrg, rhsCRBOrg, (this.crbOrg!= null), (that.crbOrg!= null))) {
                    return false;
                }
            }
            {
                String lhsTermID;
                lhsTermID = this.getTermID();
                String rhsTermID;
                rhsTermID = that.getTermID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "termID", lhsTermID), LocatorUtils.property(thatLocator, "termID", rhsTermID), lhsTermID, rhsTermID, (this.termID!= null), (that.termID!= null))) {
                    return false;
                }
            }
            {
                String lhsCRAcctNo;
                lhsCRAcctNo = this.getCRAcctNo();
                String rhsCRAcctNo;
                rhsCRAcctNo = that.getCRAcctNo();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "crAcctNo", lhsCRAcctNo), LocatorUtils.property(thatLocator, "crAcctNo", rhsCRAcctNo), lhsCRAcctNo, rhsCRAcctNo, (this.crAcctNo!= null), (that.crAcctNo!= null))) {
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
                String theCRBOrg;
                theCRBOrg = this.getCRBOrg();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "crbOrg", theCRBOrg), currentHashCode, theCRBOrg, (this.crbOrg!= null));
            }
            {
                String theTermID;
                theTermID = this.getTermID();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "termID", theTermID), currentHashCode, theTermID, (this.termID!= null));
            }
            {
                String theCRAcctNo;
                theCRAcctNo = this.getCRAcctNo();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "crAcctNo", theCRAcctNo), currentHashCode, theCRAcctNo, (this.crAcctNo!= null));
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
            if (draftCopy instanceof InitPaymentRequest.CreditAccount) {
                final InitPaymentRequest.CreditAccount copy = ((InitPaymentRequest.CreditAccount) draftCopy);
                {
                    Boolean crbOrgShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.crbOrg!= null));
                    if (crbOrgShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceCRBOrg;
                        sourceCRBOrg = this.getCRBOrg();
                        String copyCRBOrg = ((String) strategy.copy(LocatorUtils.property(locator, "crbOrg", sourceCRBOrg), sourceCRBOrg, (this.crbOrg!= null)));
                        copy.setCRBOrg(copyCRBOrg);
                    } else {
                        if (crbOrgShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.crbOrg = null;
                        }
                    }
                }
                {
                    Boolean termIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.termID!= null));
                    if (termIDShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceTermID;
                        sourceTermID = this.getTermID();
                        String copyTermID = ((String) strategy.copy(LocatorUtils.property(locator, "termID", sourceTermID), sourceTermID, (this.termID!= null)));
                        copy.setTermID(copyTermID);
                    } else {
                        if (termIDShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.termID = null;
                        }
                    }
                }
                {
                    Boolean crAcctNoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.crAcctNo!= null));
                    if (crAcctNoShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceCRAcctNo;
                        sourceCRAcctNo = this.getCRAcctNo();
                        String copyCRAcctNo = ((String) strategy.copy(LocatorUtils.property(locator, "crAcctNo", sourceCRAcctNo), sourceCRAcctNo, (this.crAcctNo!= null)));
                        copy.setCRAcctNo(copyCRAcctNo);
                    } else {
                        if (crAcctNoShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.crAcctNo = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new InitPaymentRequest.CreditAccount();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InitPaymentRequest.CreditAccount) {
                final InitPaymentRequest.CreditAccount target = this;
                final InitPaymentRequest.CreditAccount leftObject = ((InitPaymentRequest.CreditAccount) left);
                final InitPaymentRequest.CreditAccount rightObject = ((InitPaymentRequest.CreditAccount) right);
                {
                    Boolean crbOrgShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.crbOrg!= null), (rightObject.crbOrg!= null));
                    if (crbOrgShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsCRBOrg;
                        lhsCRBOrg = leftObject.getCRBOrg();
                        String rhsCRBOrg;
                        rhsCRBOrg = rightObject.getCRBOrg();
                        String mergedCRBOrg = ((String) strategy.merge(LocatorUtils.property(leftLocator, "crbOrg", lhsCRBOrg), LocatorUtils.property(rightLocator, "crbOrg", rhsCRBOrg), lhsCRBOrg, rhsCRBOrg, (leftObject.crbOrg!= null), (rightObject.crbOrg!= null)));
                        target.setCRBOrg(mergedCRBOrg);
                    } else {
                        if (crbOrgShouldBeMergedAndSet == Boolean.FALSE) {
                            target.crbOrg = null;
                        }
                    }
                }
                {
                    Boolean termIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.termID!= null), (rightObject.termID!= null));
                    if (termIDShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsTermID;
                        lhsTermID = leftObject.getTermID();
                        String rhsTermID;
                        rhsTermID = rightObject.getTermID();
                        String mergedTermID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "termID", lhsTermID), LocatorUtils.property(rightLocator, "termID", rhsTermID), lhsTermID, rhsTermID, (leftObject.termID!= null), (rightObject.termID!= null)));
                        target.setTermID(mergedTermID);
                    } else {
                        if (termIDShouldBeMergedAndSet == Boolean.FALSE) {
                            target.termID = null;
                        }
                    }
                }
                {
                    Boolean crAcctNoShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.crAcctNo!= null), (rightObject.crAcctNo!= null));
                    if (crAcctNoShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsCRAcctNo;
                        lhsCRAcctNo = leftObject.getCRAcctNo();
                        String rhsCRAcctNo;
                        rhsCRAcctNo = rightObject.getCRAcctNo();
                        String mergedCRAcctNo = ((String) strategy.merge(LocatorUtils.property(leftLocator, "crAcctNo", lhsCRAcctNo), LocatorUtils.property(rightLocator, "crAcctNo", rhsCRAcctNo), lhsCRAcctNo, rhsCRAcctNo, (leftObject.crAcctNo!= null), (rightObject.crAcctNo!= null)));
                        target.setCRAcctNo(mergedCRAcctNo);
                    } else {
                        if (crAcctNoShouldBeMergedAndSet == Boolean.FALSE) {
                            target.crAcctNo = null;
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
     *         &lt;element name="FundBOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TermID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DRAcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode"/&gt;
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
        "fundBOrg",
        "termID",
        "drAcctNo",
        "pin",
        "currencyCode"
    })
    public static class DRAcct implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "FundBOrg")
        protected String fundBOrg;
        @XmlElement(name = "TermID", required = true)
        protected String termID;
        @XmlElement(name = "DRAcctNo", required = true)
        protected String drAcctNo;
        @XmlElement(name = "PIN", required = true)
        protected String pin;
        @XmlElement(name = "CurrencyCode", required = true)
        @XmlSchemaType(name = "string")
        protected EnumCurrencyCode currencyCode;

        /**
         * Gets the value of the fundBOrg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFundBOrg() {
            return fundBOrg;
        }

        /**
         * Sets the value of the fundBOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFundBOrg(String value) {
            this.fundBOrg = value;
        }

        /**
         * Gets the value of the termID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTermID() {
            return termID;
        }

        /**
         * Sets the value of the termID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTermID(String value) {
            this.termID = value;
        }

        /**
         * Gets the value of the drAcctNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDRAcctNo() {
            return drAcctNo;
        }

        /**
         * Sets the value of the drAcctNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDRAcctNo(String value) {
            this.drAcctNo = value;
        }

        /**
         * Gets the value of the pin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPIN() {
            return pin;
        }

        /**
         * Sets the value of the pin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPIN(String value) {
            this.pin = value;
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
                String theFundBOrg;
                theFundBOrg = this.getFundBOrg();
                strategy.appendField(locator, this, "fundBOrg", buffer, theFundBOrg, (this.fundBOrg!= null));
            }
            {
                String theTermID;
                theTermID = this.getTermID();
                strategy.appendField(locator, this, "termID", buffer, theTermID, (this.termID!= null));
            }
            {
                String theDRAcctNo;
                theDRAcctNo = this.getDRAcctNo();
                strategy.appendField(locator, this, "drAcctNo", buffer, theDRAcctNo, (this.drAcctNo!= null));
            }
            {
                String thePIN;
                thePIN = this.getPIN();
                strategy.appendField(locator, this, "pin", buffer, thePIN, (this.pin!= null));
            }
            {
                EnumCurrencyCode theCurrencyCode;
                theCurrencyCode = this.getCurrencyCode();
                strategy.appendField(locator, this, "currencyCode", buffer, theCurrencyCode, (this.currencyCode!= null));
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
            final InitPaymentRequest.DRAcct that = ((InitPaymentRequest.DRAcct) object);
            {
                String lhsFundBOrg;
                lhsFundBOrg = this.getFundBOrg();
                String rhsFundBOrg;
                rhsFundBOrg = that.getFundBOrg();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fundBOrg", lhsFundBOrg), LocatorUtils.property(thatLocator, "fundBOrg", rhsFundBOrg), lhsFundBOrg, rhsFundBOrg, (this.fundBOrg!= null), (that.fundBOrg!= null))) {
                    return false;
                }
            }
            {
                String lhsTermID;
                lhsTermID = this.getTermID();
                String rhsTermID;
                rhsTermID = that.getTermID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "termID", lhsTermID), LocatorUtils.property(thatLocator, "termID", rhsTermID), lhsTermID, rhsTermID, (this.termID!= null), (that.termID!= null))) {
                    return false;
                }
            }
            {
                String lhsDRAcctNo;
                lhsDRAcctNo = this.getDRAcctNo();
                String rhsDRAcctNo;
                rhsDRAcctNo = that.getDRAcctNo();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "drAcctNo", lhsDRAcctNo), LocatorUtils.property(thatLocator, "drAcctNo", rhsDRAcctNo), lhsDRAcctNo, rhsDRAcctNo, (this.drAcctNo!= null), (that.drAcctNo!= null))) {
                    return false;
                }
            }
            {
                String lhsPIN;
                lhsPIN = this.getPIN();
                String rhsPIN;
                rhsPIN = that.getPIN();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "pin", lhsPIN), LocatorUtils.property(thatLocator, "pin", rhsPIN), lhsPIN, rhsPIN, (this.pin!= null), (that.pin!= null))) {
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
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
            int currentHashCode = 1;
            {
                String theFundBOrg;
                theFundBOrg = this.getFundBOrg();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fundBOrg", theFundBOrg), currentHashCode, theFundBOrg, (this.fundBOrg!= null));
            }
            {
                String theTermID;
                theTermID = this.getTermID();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "termID", theTermID), currentHashCode, theTermID, (this.termID!= null));
            }
            {
                String theDRAcctNo;
                theDRAcctNo = this.getDRAcctNo();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "drAcctNo", theDRAcctNo), currentHashCode, theDRAcctNo, (this.drAcctNo!= null));
            }
            {
                String thePIN;
                thePIN = this.getPIN();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pin", thePIN), currentHashCode, thePIN, (this.pin!= null));
            }
            {
                EnumCurrencyCode theCurrencyCode;
                theCurrencyCode = this.getCurrencyCode();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currencyCode", theCurrencyCode), currentHashCode, theCurrencyCode, (this.currencyCode!= null));
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
            if (draftCopy instanceof InitPaymentRequest.DRAcct) {
                final InitPaymentRequest.DRAcct copy = ((InitPaymentRequest.DRAcct) draftCopy);
                {
                    Boolean fundBOrgShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fundBOrg!= null));
                    if (fundBOrgShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceFundBOrg;
                        sourceFundBOrg = this.getFundBOrg();
                        String copyFundBOrg = ((String) strategy.copy(LocatorUtils.property(locator, "fundBOrg", sourceFundBOrg), sourceFundBOrg, (this.fundBOrg!= null)));
                        copy.setFundBOrg(copyFundBOrg);
                    } else {
                        if (fundBOrgShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.fundBOrg = null;
                        }
                    }
                }
                {
                    Boolean termIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.termID!= null));
                    if (termIDShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceTermID;
                        sourceTermID = this.getTermID();
                        String copyTermID = ((String) strategy.copy(LocatorUtils.property(locator, "termID", sourceTermID), sourceTermID, (this.termID!= null)));
                        copy.setTermID(copyTermID);
                    } else {
                        if (termIDShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.termID = null;
                        }
                    }
                }
                {
                    Boolean drAcctNoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.drAcctNo!= null));
                    if (drAcctNoShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceDRAcctNo;
                        sourceDRAcctNo = this.getDRAcctNo();
                        String copyDRAcctNo = ((String) strategy.copy(LocatorUtils.property(locator, "drAcctNo", sourceDRAcctNo), sourceDRAcctNo, (this.drAcctNo!= null)));
                        copy.setDRAcctNo(copyDRAcctNo);
                    } else {
                        if (drAcctNoShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.drAcctNo = null;
                        }
                    }
                }
                {
                    Boolean pinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pin!= null));
                    if (pinShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourcePIN;
                        sourcePIN = this.getPIN();
                        String copyPIN = ((String) strategy.copy(LocatorUtils.property(locator, "pin", sourcePIN), sourcePIN, (this.pin!= null)));
                        copy.setPIN(copyPIN);
                    } else {
                        if (pinShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.pin = null;
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
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new InitPaymentRequest.DRAcct();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InitPaymentRequest.DRAcct) {
                final InitPaymentRequest.DRAcct target = this;
                final InitPaymentRequest.DRAcct leftObject = ((InitPaymentRequest.DRAcct) left);
                final InitPaymentRequest.DRAcct rightObject = ((InitPaymentRequest.DRAcct) right);
                {
                    Boolean fundBOrgShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.fundBOrg!= null), (rightObject.fundBOrg!= null));
                    if (fundBOrgShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsFundBOrg;
                        lhsFundBOrg = leftObject.getFundBOrg();
                        String rhsFundBOrg;
                        rhsFundBOrg = rightObject.getFundBOrg();
                        String mergedFundBOrg = ((String) strategy.merge(LocatorUtils.property(leftLocator, "fundBOrg", lhsFundBOrg), LocatorUtils.property(rightLocator, "fundBOrg", rhsFundBOrg), lhsFundBOrg, rhsFundBOrg, (leftObject.fundBOrg!= null), (rightObject.fundBOrg!= null)));
                        target.setFundBOrg(mergedFundBOrg);
                    } else {
                        if (fundBOrgShouldBeMergedAndSet == Boolean.FALSE) {
                            target.fundBOrg = null;
                        }
                    }
                }
                {
                    Boolean termIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.termID!= null), (rightObject.termID!= null));
                    if (termIDShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsTermID;
                        lhsTermID = leftObject.getTermID();
                        String rhsTermID;
                        rhsTermID = rightObject.getTermID();
                        String mergedTermID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "termID", lhsTermID), LocatorUtils.property(rightLocator, "termID", rhsTermID), lhsTermID, rhsTermID, (leftObject.termID!= null), (rightObject.termID!= null)));
                        target.setTermID(mergedTermID);
                    } else {
                        if (termIDShouldBeMergedAndSet == Boolean.FALSE) {
                            target.termID = null;
                        }
                    }
                }
                {
                    Boolean drAcctNoShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.drAcctNo!= null), (rightObject.drAcctNo!= null));
                    if (drAcctNoShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsDRAcctNo;
                        lhsDRAcctNo = leftObject.getDRAcctNo();
                        String rhsDRAcctNo;
                        rhsDRAcctNo = rightObject.getDRAcctNo();
                        String mergedDRAcctNo = ((String) strategy.merge(LocatorUtils.property(leftLocator, "drAcctNo", lhsDRAcctNo), LocatorUtils.property(rightLocator, "drAcctNo", rhsDRAcctNo), lhsDRAcctNo, rhsDRAcctNo, (leftObject.drAcctNo!= null), (rightObject.drAcctNo!= null)));
                        target.setDRAcctNo(mergedDRAcctNo);
                    } else {
                        if (drAcctNoShouldBeMergedAndSet == Boolean.FALSE) {
                            target.drAcctNo = null;
                        }
                    }
                }
                {
                    Boolean pinShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.pin!= null), (rightObject.pin!= null));
                    if (pinShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsPIN;
                        lhsPIN = leftObject.getPIN();
                        String rhsPIN;
                        rhsPIN = rightObject.getPIN();
                        String mergedPIN = ((String) strategy.merge(LocatorUtils.property(leftLocator, "pin", lhsPIN), LocatorUtils.property(rightLocator, "pin", rhsPIN), lhsPIN, rhsPIN, (leftObject.pin!= null), (rightObject.pin!= null)));
                        target.setPIN(mergedPIN);
                    } else {
                        if (pinShouldBeMergedAndSet == Boolean.FALSE) {
                            target.pin = null;
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
            final InitPaymentRequest.PayAmt that = ((InitPaymentRequest.PayAmt) object);
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
            if (draftCopy instanceof InitPaymentRequest.PayAmt) {
                final InitPaymentRequest.PayAmt copy = ((InitPaymentRequest.PayAmt) draftCopy);
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
            return new InitPaymentRequest.PayAmt();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InitPaymentRequest.PayAmt) {
                final InitPaymentRequest.PayAmt target = this;
                final InitPaymentRequest.PayAmt leftObject = ((InitPaymentRequest.PayAmt) left);
                final InitPaymentRequest.PayAmt rightObject = ((InitPaymentRequest.PayAmt) right);
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
     *         &lt;element name="ServiceReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="BillRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PaymentParameters" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ParameterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ParameterValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "serviceReferenceNumber",
        "billRefNumber",
        "productCode",
        "paymentParameters"
    })
    public static class ServiceData implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "ServiceReferenceNumber", required = true)
        protected String serviceReferenceNumber;
        @XmlElement(name = "BillRefNumber")
        protected String billRefNumber;
        @XmlElement(name = "ProductCode")
        protected String productCode;
        @XmlElement(name = "PaymentParameters")
        protected List<InitPaymentRequest.ServiceData.PaymentParameters> paymentParameters;

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

        /**
         * Gets the value of the productCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductCode() {
            return productCode;
        }

        /**
         * Sets the value of the productCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductCode(String value) {
            this.productCode = value;
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
         * {@link InitPaymentRequest.ServiceData.PaymentParameters }
         * 
         * 
         */
        public List<InitPaymentRequest.ServiceData.PaymentParameters> getPaymentParameters() {
            if (paymentParameters == null) {
                paymentParameters = new ArrayList<InitPaymentRequest.ServiceData.PaymentParameters>();
            }
            return this.paymentParameters;
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
            {
                String theProductCode;
                theProductCode = this.getProductCode();
                strategy.appendField(locator, this, "productCode", buffer, theProductCode, (this.productCode!= null));
            }
            {
                List<InitPaymentRequest.ServiceData.PaymentParameters> thePaymentParameters;
                thePaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
                strategy.appendField(locator, this, "paymentParameters", buffer, thePaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())));
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
            final InitPaymentRequest.ServiceData that = ((InitPaymentRequest.ServiceData) object);
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
            {
                String lhsProductCode;
                lhsProductCode = this.getProductCode();
                String rhsProductCode;
                rhsProductCode = that.getProductCode();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "productCode", lhsProductCode), LocatorUtils.property(thatLocator, "productCode", rhsProductCode), lhsProductCode, rhsProductCode, (this.productCode!= null), (that.productCode!= null))) {
                    return false;
                }
            }
            {
                List<InitPaymentRequest.ServiceData.PaymentParameters> lhsPaymentParameters;
                lhsPaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
                List<InitPaymentRequest.ServiceData.PaymentParameters> rhsPaymentParameters;
                rhsPaymentParameters = (((that.paymentParameters!= null)&&(!that.paymentParameters.isEmpty()))?that.getPaymentParameters():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentParameters", lhsPaymentParameters), LocatorUtils.property(thatLocator, "paymentParameters", rhsPaymentParameters), lhsPaymentParameters, rhsPaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())), ((that.paymentParameters!= null)&&(!that.paymentParameters.isEmpty())))) {
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
            {
                String theProductCode;
                theProductCode = this.getProductCode();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productCode", theProductCode), currentHashCode, theProductCode, (this.productCode!= null));
            }
            {
                List<InitPaymentRequest.ServiceData.PaymentParameters> thePaymentParameters;
                thePaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentParameters", thePaymentParameters), currentHashCode, thePaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())));
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
            if (draftCopy instanceof InitPaymentRequest.ServiceData) {
                final InitPaymentRequest.ServiceData copy = ((InitPaymentRequest.ServiceData) draftCopy);
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
                {
                    Boolean productCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productCode!= null));
                    if (productCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceProductCode;
                        sourceProductCode = this.getProductCode();
                        String copyProductCode = ((String) strategy.copy(LocatorUtils.property(locator, "productCode", sourceProductCode), sourceProductCode, (this.productCode!= null)));
                        copy.setProductCode(copyProductCode);
                    } else {
                        if (productCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.productCode = null;
                        }
                    }
                }
                {
                    Boolean paymentParametersShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())));
                    if (paymentParametersShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<InitPaymentRequest.ServiceData.PaymentParameters> sourcePaymentParameters;
                        sourcePaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
                        @SuppressWarnings("unchecked")
                        List<InitPaymentRequest.ServiceData.PaymentParameters> copyPaymentParameters = ((List<InitPaymentRequest.ServiceData.PaymentParameters> ) strategy.copy(LocatorUtils.property(locator, "paymentParameters", sourcePaymentParameters), sourcePaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))));
                        copy.paymentParameters = null;
                        if (copyPaymentParameters!= null) {
                            List<InitPaymentRequest.ServiceData.PaymentParameters> uniquePaymentParametersl = copy.getPaymentParameters();
                            uniquePaymentParametersl.addAll(copyPaymentParameters);
                        }
                    } else {
                        if (paymentParametersShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.paymentParameters = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new InitPaymentRequest.ServiceData();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InitPaymentRequest.ServiceData) {
                final InitPaymentRequest.ServiceData target = this;
                final InitPaymentRequest.ServiceData leftObject = ((InitPaymentRequest.ServiceData) left);
                final InitPaymentRequest.ServiceData rightObject = ((InitPaymentRequest.ServiceData) right);
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
                {
                    Boolean productCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productCode!= null), (rightObject.productCode!= null));
                    if (productCodeShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsProductCode;
                        lhsProductCode = leftObject.getProductCode();
                        String rhsProductCode;
                        rhsProductCode = rightObject.getProductCode();
                        String mergedProductCode = ((String) strategy.merge(LocatorUtils.property(leftLocator, "productCode", lhsProductCode), LocatorUtils.property(rightLocator, "productCode", rhsProductCode), lhsProductCode, rhsProductCode, (leftObject.productCode!= null), (rightObject.productCode!= null)));
                        target.setProductCode(mergedProductCode);
                    } else {
                        if (productCodeShouldBeMergedAndSet == Boolean.FALSE) {
                            target.productCode = null;
                        }
                    }
                }
                {
                    Boolean paymentParametersShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.paymentParameters!= null)&&(!leftObject.paymentParameters.isEmpty())), ((rightObject.paymentParameters!= null)&&(!rightObject.paymentParameters.isEmpty())));
                    if (paymentParametersShouldBeMergedAndSet == Boolean.TRUE) {
                        List<InitPaymentRequest.ServiceData.PaymentParameters> lhsPaymentParameters;
                        lhsPaymentParameters = (((leftObject.paymentParameters!= null)&&(!leftObject.paymentParameters.isEmpty()))?leftObject.getPaymentParameters():null);
                        List<InitPaymentRequest.ServiceData.PaymentParameters> rhsPaymentParameters;
                        rhsPaymentParameters = (((rightObject.paymentParameters!= null)&&(!rightObject.paymentParameters.isEmpty()))?rightObject.getPaymentParameters():null);
                        List<InitPaymentRequest.ServiceData.PaymentParameters> mergedPaymentParameters = ((List<InitPaymentRequest.ServiceData.PaymentParameters> ) strategy.merge(LocatorUtils.property(leftLocator, "paymentParameters", lhsPaymentParameters), LocatorUtils.property(rightLocator, "paymentParameters", rhsPaymentParameters), lhsPaymentParameters, rhsPaymentParameters, ((leftObject.paymentParameters!= null)&&(!leftObject.paymentParameters.isEmpty())), ((rightObject.paymentParameters!= null)&&(!rightObject.paymentParameters.isEmpty()))));
                        target.paymentParameters = null;
                        if (mergedPaymentParameters!= null) {
                            List<InitPaymentRequest.ServiceData.PaymentParameters> uniquePaymentParametersl = target.getPaymentParameters();
                            uniquePaymentParametersl.addAll(mergedPaymentParameters);
                        }
                    } else {
                        if (paymentParametersShouldBeMergedAndSet == Boolean.FALSE) {
                            target.paymentParameters = null;
                        }
                    }
                }
            }
        }

        public void setPaymentParameters(List<InitPaymentRequest.ServiceData.PaymentParameters> value) {
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
         *         &lt;element name="ParameterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ParameterValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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

            @XmlElement(name = "ParameterKey")
            protected String parameterKey;
            @XmlElement(name = "ParameterValue")
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
                final InitPaymentRequest.ServiceData.PaymentParameters that = ((InitPaymentRequest.ServiceData.PaymentParameters) object);
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
                if (draftCopy instanceof InitPaymentRequest.ServiceData.PaymentParameters) {
                    final InitPaymentRequest.ServiceData.PaymentParameters copy = ((InitPaymentRequest.ServiceData.PaymentParameters) draftCopy);
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
                return new InitPaymentRequest.ServiceData.PaymentParameters();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof InitPaymentRequest.ServiceData.PaymentParameters) {
                    final InitPaymentRequest.ServiceData.PaymentParameters target = this;
                    final InitPaymentRequest.ServiceData.PaymentParameters leftObject = ((InitPaymentRequest.ServiceData.PaymentParameters) left);
                    final InitPaymentRequest.ServiceData.PaymentParameters rightObject = ((InitPaymentRequest.ServiceData.PaymentParameters) right);
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

    }

}
