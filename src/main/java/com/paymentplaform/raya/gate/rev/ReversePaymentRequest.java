
package com.paymentplaform.raya.gate.rev;

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
 * <p>Java class for Reverse_Payment_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reverse_Payment_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AsynchUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TrxnType" type="{http://raya.paymentplaform.com/gate}EnumTransType"/&gt;
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
 *         &lt;element name="ServiceData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ServiceReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PayAmt" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
 *                   &lt;element name="ChargesAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
 *                   &lt;element name="TermID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DRAcctNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="PIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PmtMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VCRs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="VCR" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VouchNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reverse_Payment_Request", namespace = "http://raya.paymentplaform.com/gate/rev", propOrder = {
    "rqUID",
    "asynchUID",
    "serviceCode",
    "trxnType",
    "trxnIds",
    "serviceData",
    "payAmt",
    "drAcct",
    "pmtMethod",
    "vcRs"
})
public class ReversePaymentRequest implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsynchUID", required = true)
    protected String asynchUID;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "TrxnType", required = true)
    @XmlSchemaType(name = "string")
    protected EnumTransType trxnType;
    @XmlElement(name = "TrxnIds", required = true)
    protected ReversePaymentRequest.TrxnIds trxnIds;
    @XmlElement(name = "ServiceData")
    protected ReversePaymentRequest.ServiceData serviceData;
    @XmlElement(name = "PayAmt")
    protected ReversePaymentRequest.PayAmt payAmt;
    @XmlElement(name = "DRAcct", required = true)
    protected ReversePaymentRequest.DRAcct drAcct;
    @XmlElement(name = "PmtMethod", required = true)
    protected String pmtMethod;
    @XmlElement(name = "VCRs")
    protected ReversePaymentRequest.VCRs vcRs;

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
     * Gets the value of the trxnIds property.
     * 
     * @return
     *     possible object is
     *     {@link ReversePaymentRequest.TrxnIds }
     *     
     */
    public ReversePaymentRequest.TrxnIds getTrxnIds() {
        return trxnIds;
    }

    /**
     * Sets the value of the trxnIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversePaymentRequest.TrxnIds }
     *     
     */
    public void setTrxnIds(ReversePaymentRequest.TrxnIds value) {
        this.trxnIds = value;
    }

    /**
     * Gets the value of the serviceData property.
     * 
     * @return
     *     possible object is
     *     {@link ReversePaymentRequest.ServiceData }
     *     
     */
    public ReversePaymentRequest.ServiceData getServiceData() {
        return serviceData;
    }

    /**
     * Sets the value of the serviceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversePaymentRequest.ServiceData }
     *     
     */
    public void setServiceData(ReversePaymentRequest.ServiceData value) {
        this.serviceData = value;
    }

    /**
     * Gets the value of the payAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ReversePaymentRequest.PayAmt }
     *     
     */
    public ReversePaymentRequest.PayAmt getPayAmt() {
        return payAmt;
    }

    /**
     * Sets the value of the payAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversePaymentRequest.PayAmt }
     *     
     */
    public void setPayAmt(ReversePaymentRequest.PayAmt value) {
        this.payAmt = value;
    }

    /**
     * Gets the value of the drAcct property.
     * 
     * @return
     *     possible object is
     *     {@link ReversePaymentRequest.DRAcct }
     *     
     */
    public ReversePaymentRequest.DRAcct getDRAcct() {
        return drAcct;
    }

    /**
     * Sets the value of the drAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversePaymentRequest.DRAcct }
     *     
     */
    public void setDRAcct(ReversePaymentRequest.DRAcct value) {
        this.drAcct = value;
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
     * Gets the value of the vcRs property.
     * 
     * @return
     *     possible object is
     *     {@link ReversePaymentRequest.VCRs }
     *     
     */
    public ReversePaymentRequest.VCRs getVCRs() {
        return vcRs;
    }

    /**
     * Sets the value of the vcRs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversePaymentRequest.VCRs }
     *     
     */
    public void setVCRs(ReversePaymentRequest.VCRs value) {
        this.vcRs = value;
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
            ReversePaymentRequest.TrxnIds theTrxnIds;
            theTrxnIds = this.getTrxnIds();
            strategy.appendField(locator, this, "trxnIds", buffer, theTrxnIds, (this.trxnIds!= null));
        }
        {
            ReversePaymentRequest.ServiceData theServiceData;
            theServiceData = this.getServiceData();
            strategy.appendField(locator, this, "serviceData", buffer, theServiceData, (this.serviceData!= null));
        }
        {
            ReversePaymentRequest.PayAmt thePayAmt;
            thePayAmt = this.getPayAmt();
            strategy.appendField(locator, this, "payAmt", buffer, thePayAmt, (this.payAmt!= null));
        }
        {
            ReversePaymentRequest.DRAcct theDRAcct;
            theDRAcct = this.getDRAcct();
            strategy.appendField(locator, this, "drAcct", buffer, theDRAcct, (this.drAcct!= null));
        }
        {
            String thePmtMethod;
            thePmtMethod = this.getPmtMethod();
            strategy.appendField(locator, this, "pmtMethod", buffer, thePmtMethod, (this.pmtMethod!= null));
        }
        {
            ReversePaymentRequest.VCRs theVCRs;
            theVCRs = this.getVCRs();
            strategy.appendField(locator, this, "vcRs", buffer, theVCRs, (this.vcRs!= null));
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
        final ReversePaymentRequest that = ((ReversePaymentRequest) object);
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
            ReversePaymentRequest.TrxnIds lhsTrxnIds;
            lhsTrxnIds = this.getTrxnIds();
            ReversePaymentRequest.TrxnIds rhsTrxnIds;
            rhsTrxnIds = that.getTrxnIds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnIds", lhsTrxnIds), LocatorUtils.property(thatLocator, "trxnIds", rhsTrxnIds), lhsTrxnIds, rhsTrxnIds, (this.trxnIds!= null), (that.trxnIds!= null))) {
                return false;
            }
        }
        {
            ReversePaymentRequest.ServiceData lhsServiceData;
            lhsServiceData = this.getServiceData();
            ReversePaymentRequest.ServiceData rhsServiceData;
            rhsServiceData = that.getServiceData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceData", lhsServiceData), LocatorUtils.property(thatLocator, "serviceData", rhsServiceData), lhsServiceData, rhsServiceData, (this.serviceData!= null), (that.serviceData!= null))) {
                return false;
            }
        }
        {
            ReversePaymentRequest.PayAmt lhsPayAmt;
            lhsPayAmt = this.getPayAmt();
            ReversePaymentRequest.PayAmt rhsPayAmt;
            rhsPayAmt = that.getPayAmt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "payAmt", lhsPayAmt), LocatorUtils.property(thatLocator, "payAmt", rhsPayAmt), lhsPayAmt, rhsPayAmt, (this.payAmt!= null), (that.payAmt!= null))) {
                return false;
            }
        }
        {
            ReversePaymentRequest.DRAcct lhsDRAcct;
            lhsDRAcct = this.getDRAcct();
            ReversePaymentRequest.DRAcct rhsDRAcct;
            rhsDRAcct = that.getDRAcct();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "drAcct", lhsDRAcct), LocatorUtils.property(thatLocator, "drAcct", rhsDRAcct), lhsDRAcct, rhsDRAcct, (this.drAcct!= null), (that.drAcct!= null))) {
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
            ReversePaymentRequest.VCRs lhsVCRs;
            lhsVCRs = this.getVCRs();
            ReversePaymentRequest.VCRs rhsVCRs;
            rhsVCRs = that.getVCRs();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vcRs", lhsVCRs), LocatorUtils.property(thatLocator, "vcRs", rhsVCRs), lhsVCRs, rhsVCRs, (this.vcRs!= null), (that.vcRs!= null))) {
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
            ReversePaymentRequest.TrxnIds theTrxnIds;
            theTrxnIds = this.getTrxnIds();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnIds", theTrxnIds), currentHashCode, theTrxnIds, (this.trxnIds!= null));
        }
        {
            ReversePaymentRequest.ServiceData theServiceData;
            theServiceData = this.getServiceData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceData", theServiceData), currentHashCode, theServiceData, (this.serviceData!= null));
        }
        {
            ReversePaymentRequest.PayAmt thePayAmt;
            thePayAmt = this.getPayAmt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "payAmt", thePayAmt), currentHashCode, thePayAmt, (this.payAmt!= null));
        }
        {
            ReversePaymentRequest.DRAcct theDRAcct;
            theDRAcct = this.getDRAcct();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "drAcct", theDRAcct), currentHashCode, theDRAcct, (this.drAcct!= null));
        }
        {
            String thePmtMethod;
            thePmtMethod = this.getPmtMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtMethod", thePmtMethod), currentHashCode, thePmtMethod, (this.pmtMethod!= null));
        }
        {
            ReversePaymentRequest.VCRs theVCRs;
            theVCRs = this.getVCRs();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vcRs", theVCRs), currentHashCode, theVCRs, (this.vcRs!= null));
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
        if (draftCopy instanceof ReversePaymentRequest) {
            final ReversePaymentRequest copy = ((ReversePaymentRequest) draftCopy);
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
                Boolean trxnIdsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnIds!= null));
                if (trxnIdsShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReversePaymentRequest.TrxnIds sourceTrxnIds;
                    sourceTrxnIds = this.getTrxnIds();
                    ReversePaymentRequest.TrxnIds copyTrxnIds = ((ReversePaymentRequest.TrxnIds) strategy.copy(LocatorUtils.property(locator, "trxnIds", sourceTrxnIds), sourceTrxnIds, (this.trxnIds!= null)));
                    copy.setTrxnIds(copyTrxnIds);
                } else {
                    if (trxnIdsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trxnIds = null;
                    }
                }
            }
            {
                Boolean serviceDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceData!= null));
                if (serviceDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReversePaymentRequest.ServiceData sourceServiceData;
                    sourceServiceData = this.getServiceData();
                    ReversePaymentRequest.ServiceData copyServiceData = ((ReversePaymentRequest.ServiceData) strategy.copy(LocatorUtils.property(locator, "serviceData", sourceServiceData), sourceServiceData, (this.serviceData!= null)));
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
                    ReversePaymentRequest.PayAmt sourcePayAmt;
                    sourcePayAmt = this.getPayAmt();
                    ReversePaymentRequest.PayAmt copyPayAmt = ((ReversePaymentRequest.PayAmt) strategy.copy(LocatorUtils.property(locator, "payAmt", sourcePayAmt), sourcePayAmt, (this.payAmt!= null)));
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
                    ReversePaymentRequest.DRAcct sourceDRAcct;
                    sourceDRAcct = this.getDRAcct();
                    ReversePaymentRequest.DRAcct copyDRAcct = ((ReversePaymentRequest.DRAcct) strategy.copy(LocatorUtils.property(locator, "drAcct", sourceDRAcct), sourceDRAcct, (this.drAcct!= null)));
                    copy.setDRAcct(copyDRAcct);
                } else {
                    if (drAcctShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.drAcct = null;
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
                Boolean vcRsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vcRs!= null));
                if (vcRsShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReversePaymentRequest.VCRs sourceVCRs;
                    sourceVCRs = this.getVCRs();
                    ReversePaymentRequest.VCRs copyVCRs = ((ReversePaymentRequest.VCRs) strategy.copy(LocatorUtils.property(locator, "vcRs", sourceVCRs), sourceVCRs, (this.vcRs!= null)));
                    copy.setVCRs(copyVCRs);
                } else {
                    if (vcRsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vcRs = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ReversePaymentRequest();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ReversePaymentRequest) {
            final ReversePaymentRequest target = this;
            final ReversePaymentRequest leftObject = ((ReversePaymentRequest) left);
            final ReversePaymentRequest rightObject = ((ReversePaymentRequest) right);
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
                Boolean trxnIdsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnIds!= null), (rightObject.trxnIds!= null));
                if (trxnIdsShouldBeMergedAndSet == Boolean.TRUE) {
                    ReversePaymentRequest.TrxnIds lhsTrxnIds;
                    lhsTrxnIds = leftObject.getTrxnIds();
                    ReversePaymentRequest.TrxnIds rhsTrxnIds;
                    rhsTrxnIds = rightObject.getTrxnIds();
                    ReversePaymentRequest.TrxnIds mergedTrxnIds = ((ReversePaymentRequest.TrxnIds) strategy.merge(LocatorUtils.property(leftLocator, "trxnIds", lhsTrxnIds), LocatorUtils.property(rightLocator, "trxnIds", rhsTrxnIds), lhsTrxnIds, rhsTrxnIds, (leftObject.trxnIds!= null), (rightObject.trxnIds!= null)));
                    target.setTrxnIds(mergedTrxnIds);
                } else {
                    if (trxnIdsShouldBeMergedAndSet == Boolean.FALSE) {
                        target.trxnIds = null;
                    }
                }
            }
            {
                Boolean serviceDataShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceData!= null), (rightObject.serviceData!= null));
                if (serviceDataShouldBeMergedAndSet == Boolean.TRUE) {
                    ReversePaymentRequest.ServiceData lhsServiceData;
                    lhsServiceData = leftObject.getServiceData();
                    ReversePaymentRequest.ServiceData rhsServiceData;
                    rhsServiceData = rightObject.getServiceData();
                    ReversePaymentRequest.ServiceData mergedServiceData = ((ReversePaymentRequest.ServiceData) strategy.merge(LocatorUtils.property(leftLocator, "serviceData", lhsServiceData), LocatorUtils.property(rightLocator, "serviceData", rhsServiceData), lhsServiceData, rhsServiceData, (leftObject.serviceData!= null), (rightObject.serviceData!= null)));
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
                    ReversePaymentRequest.PayAmt lhsPayAmt;
                    lhsPayAmt = leftObject.getPayAmt();
                    ReversePaymentRequest.PayAmt rhsPayAmt;
                    rhsPayAmt = rightObject.getPayAmt();
                    ReversePaymentRequest.PayAmt mergedPayAmt = ((ReversePaymentRequest.PayAmt) strategy.merge(LocatorUtils.property(leftLocator, "payAmt", lhsPayAmt), LocatorUtils.property(rightLocator, "payAmt", rhsPayAmt), lhsPayAmt, rhsPayAmt, (leftObject.payAmt!= null), (rightObject.payAmt!= null)));
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
                    ReversePaymentRequest.DRAcct lhsDRAcct;
                    lhsDRAcct = leftObject.getDRAcct();
                    ReversePaymentRequest.DRAcct rhsDRAcct;
                    rhsDRAcct = rightObject.getDRAcct();
                    ReversePaymentRequest.DRAcct mergedDRAcct = ((ReversePaymentRequest.DRAcct) strategy.merge(LocatorUtils.property(leftLocator, "drAcct", lhsDRAcct), LocatorUtils.property(rightLocator, "drAcct", rhsDRAcct), lhsDRAcct, rhsDRAcct, (leftObject.drAcct!= null), (rightObject.drAcct!= null)));
                    target.setDRAcct(mergedDRAcct);
                } else {
                    if (drAcctShouldBeMergedAndSet == Boolean.FALSE) {
                        target.drAcct = null;
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
                Boolean vcRsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.vcRs!= null), (rightObject.vcRs!= null));
                if (vcRsShouldBeMergedAndSet == Boolean.TRUE) {
                    ReversePaymentRequest.VCRs lhsVCRs;
                    lhsVCRs = leftObject.getVCRs();
                    ReversePaymentRequest.VCRs rhsVCRs;
                    rhsVCRs = rightObject.getVCRs();
                    ReversePaymentRequest.VCRs mergedVCRs = ((ReversePaymentRequest.VCRs) strategy.merge(LocatorUtils.property(leftLocator, "vcRs", lhsVCRs), LocatorUtils.property(rightLocator, "vcRs", rhsVCRs), lhsVCRs, rhsVCRs, (leftObject.vcRs!= null), (rightObject.vcRs!= null)));
                    target.setVCRs(mergedVCRs);
                } else {
                    if (vcRsShouldBeMergedAndSet == Boolean.FALSE) {
                        target.vcRs = null;
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
        "termID",
        "drAcctNo",
        "pin",
        "currencyCode"
    })
    public static class DRAcct implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

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
            final ReversePaymentRequest.DRAcct that = ((ReversePaymentRequest.DRAcct) object);
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
            if (draftCopy instanceof ReversePaymentRequest.DRAcct) {
                final ReversePaymentRequest.DRAcct copy = ((ReversePaymentRequest.DRAcct) draftCopy);
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
            return new ReversePaymentRequest.DRAcct();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ReversePaymentRequest.DRAcct) {
                final ReversePaymentRequest.DRAcct target = this;
                final ReversePaymentRequest.DRAcct leftObject = ((ReversePaymentRequest.DRAcct) left);
                final ReversePaymentRequest.DRAcct rightObject = ((ReversePaymentRequest.DRAcct) right);
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
     *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
     *         &lt;element name="ChargesAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
        protected Double amount;
        @XmlElement(name = "CurrencyCode")
        @XmlSchemaType(name = "string")
        protected EnumCurrencyCode currencyCode;
        @XmlElement(name = "ChargesAmount")
        protected Double chargesAmount;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setAmount(Double value) {
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
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getChargesAmount() {
            return chargesAmount;
        }

        /**
         * Sets the value of the chargesAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setChargesAmount(Double value) {
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
                Double theAmount;
                theAmount = this.getAmount();
                strategy.appendField(locator, this, "amount", buffer, theAmount, (this.amount!= null));
            }
            {
                EnumCurrencyCode theCurrencyCode;
                theCurrencyCode = this.getCurrencyCode();
                strategy.appendField(locator, this, "currencyCode", buffer, theCurrencyCode, (this.currencyCode!= null));
            }
            {
                Double theChargesAmount;
                theChargesAmount = this.getChargesAmount();
                strategy.appendField(locator, this, "chargesAmount", buffer, theChargesAmount, (this.chargesAmount!= null));
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
            final ReversePaymentRequest.PayAmt that = ((ReversePaymentRequest.PayAmt) object);
            {
                Double lhsAmount;
                lhsAmount = this.getAmount();
                Double rhsAmount;
                rhsAmount = that.getAmount();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount, (this.amount!= null), (that.amount!= null))) {
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
                Double lhsChargesAmount;
                lhsChargesAmount = this.getChargesAmount();
                Double rhsChargesAmount;
                rhsChargesAmount = that.getChargesAmount();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "chargesAmount", lhsChargesAmount), LocatorUtils.property(thatLocator, "chargesAmount", rhsChargesAmount), lhsChargesAmount, rhsChargesAmount, (this.chargesAmount!= null), (that.chargesAmount!= null))) {
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
                Double theAmount;
                theAmount = this.getAmount();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, (this.amount!= null));
            }
            {
                EnumCurrencyCode theCurrencyCode;
                theCurrencyCode = this.getCurrencyCode();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currencyCode", theCurrencyCode), currentHashCode, theCurrencyCode, (this.currencyCode!= null));
            }
            {
                Double theChargesAmount;
                theChargesAmount = this.getChargesAmount();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chargesAmount", theChargesAmount), currentHashCode, theChargesAmount, (this.chargesAmount!= null));
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
            if (draftCopy instanceof ReversePaymentRequest.PayAmt) {
                final ReversePaymentRequest.PayAmt copy = ((ReversePaymentRequest.PayAmt) draftCopy);
                {
                    Boolean amountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.amount!= null));
                    if (amountShouldBeCopiedAndSet == Boolean.TRUE) {
                        Double sourceAmount;
                        sourceAmount = this.getAmount();
                        Double copyAmount = ((Double) strategy.copy(LocatorUtils.property(locator, "amount", sourceAmount), sourceAmount, (this.amount!= null)));
                        copy.setAmount(copyAmount);
                    } else {
                        if (amountShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.amount = null;
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
                    Boolean chargesAmountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.chargesAmount!= null));
                    if (chargesAmountShouldBeCopiedAndSet == Boolean.TRUE) {
                        Double sourceChargesAmount;
                        sourceChargesAmount = this.getChargesAmount();
                        Double copyChargesAmount = ((Double) strategy.copy(LocatorUtils.property(locator, "chargesAmount", sourceChargesAmount), sourceChargesAmount, (this.chargesAmount!= null)));
                        copy.setChargesAmount(copyChargesAmount);
                    } else {
                        if (chargesAmountShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.chargesAmount = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ReversePaymentRequest.PayAmt();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ReversePaymentRequest.PayAmt) {
                final ReversePaymentRequest.PayAmt target = this;
                final ReversePaymentRequest.PayAmt leftObject = ((ReversePaymentRequest.PayAmt) left);
                final ReversePaymentRequest.PayAmt rightObject = ((ReversePaymentRequest.PayAmt) right);
                {
                    Boolean amountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.amount!= null), (rightObject.amount!= null));
                    if (amountShouldBeMergedAndSet == Boolean.TRUE) {
                        Double lhsAmount;
                        lhsAmount = leftObject.getAmount();
                        Double rhsAmount;
                        rhsAmount = rightObject.getAmount();
                        Double mergedAmount = ((Double) strategy.merge(LocatorUtils.property(leftLocator, "amount", lhsAmount), LocatorUtils.property(rightLocator, "amount", rhsAmount), lhsAmount, rhsAmount, (leftObject.amount!= null), (rightObject.amount!= null)));
                        target.setAmount(mergedAmount);
                    } else {
                        if (amountShouldBeMergedAndSet == Boolean.FALSE) {
                            target.amount = null;
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
                    Boolean chargesAmountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.chargesAmount!= null), (rightObject.chargesAmount!= null));
                    if (chargesAmountShouldBeMergedAndSet == Boolean.TRUE) {
                        Double lhsChargesAmount;
                        lhsChargesAmount = leftObject.getChargesAmount();
                        Double rhsChargesAmount;
                        rhsChargesAmount = rightObject.getChargesAmount();
                        Double mergedChargesAmount = ((Double) strategy.merge(LocatorUtils.property(leftLocator, "chargesAmount", lhsChargesAmount), LocatorUtils.property(rightLocator, "chargesAmount", rhsChargesAmount), lhsChargesAmount, rhsChargesAmount, (leftObject.chargesAmount!= null), (rightObject.chargesAmount!= null)));
                        target.setChargesAmount(mergedChargesAmount);
                    } else {
                        if (chargesAmountShouldBeMergedAndSet == Boolean.FALSE) {
                            target.chargesAmount = null;
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
     *         &lt;element name="ServiceReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "serviceReferenceNumber"
    })
    public static class ServiceData implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "ServiceReferenceNumber")
        protected String serviceReferenceNumber;

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
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ReversePaymentRequest.ServiceData that = ((ReversePaymentRequest.ServiceData) object);
            {
                String lhsServiceReferenceNumber;
                lhsServiceReferenceNumber = this.getServiceReferenceNumber();
                String rhsServiceReferenceNumber;
                rhsServiceReferenceNumber = that.getServiceReferenceNumber();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceReferenceNumber", lhsServiceReferenceNumber), LocatorUtils.property(thatLocator, "serviceReferenceNumber", rhsServiceReferenceNumber), lhsServiceReferenceNumber, rhsServiceReferenceNumber, (this.serviceReferenceNumber!= null), (that.serviceReferenceNumber!= null))) {
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
            if (draftCopy instanceof ReversePaymentRequest.ServiceData) {
                final ReversePaymentRequest.ServiceData copy = ((ReversePaymentRequest.ServiceData) draftCopy);
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
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ReversePaymentRequest.ServiceData();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ReversePaymentRequest.ServiceData) {
                final ReversePaymentRequest.ServiceData target = this;
                final ReversePaymentRequest.ServiceData leftObject = ((ReversePaymentRequest.ServiceData) left);
                final ReversePaymentRequest.ServiceData rightObject = ((ReversePaymentRequest.ServiceData) right);
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
        protected List<ReversePaymentRequest.TrxnIds.TrxnId> trxnIds;

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
         * {@link ReversePaymentRequest.TrxnIds.TrxnId }
         * 
         * 
         */
        public List<ReversePaymentRequest.TrxnIds.TrxnId> getTrxnIds() {
            if (trxnIds == null) {
                trxnIds = new ArrayList<ReversePaymentRequest.TrxnIds.TrxnId>();
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
                List<ReversePaymentRequest.TrxnIds.TrxnId> theTrxnIds;
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
            final ReversePaymentRequest.TrxnIds that = ((ReversePaymentRequest.TrxnIds) object);
            {
                List<ReversePaymentRequest.TrxnIds.TrxnId> lhsTrxnIds;
                lhsTrxnIds = (((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))?this.getTrxnIds():null);
                List<ReversePaymentRequest.TrxnIds.TrxnId> rhsTrxnIds;
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
                List<ReversePaymentRequest.TrxnIds.TrxnId> theTrxnIds;
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
            if (draftCopy instanceof ReversePaymentRequest.TrxnIds) {
                final ReversePaymentRequest.TrxnIds copy = ((ReversePaymentRequest.TrxnIds) draftCopy);
                {
                    Boolean trxnIdsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.trxnIds!= null)&&(!this.trxnIds.isEmpty())));
                    if (trxnIdsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ReversePaymentRequest.TrxnIds.TrxnId> sourceTrxnIds;
                        sourceTrxnIds = (((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))?this.getTrxnIds():null);
                        @SuppressWarnings("unchecked")
                        List<ReversePaymentRequest.TrxnIds.TrxnId> copyTrxnIds = ((List<ReversePaymentRequest.TrxnIds.TrxnId> ) strategy.copy(LocatorUtils.property(locator, "trxnIds", sourceTrxnIds), sourceTrxnIds, ((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))));
                        copy.trxnIds = null;
                        if (copyTrxnIds!= null) {
                            List<ReversePaymentRequest.TrxnIds.TrxnId> uniqueTrxnIdsl = copy.getTrxnIds();
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
            return new ReversePaymentRequest.TrxnIds();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ReversePaymentRequest.TrxnIds) {
                final ReversePaymentRequest.TrxnIds target = this;
                final ReversePaymentRequest.TrxnIds leftObject = ((ReversePaymentRequest.TrxnIds) left);
                final ReversePaymentRequest.TrxnIds rightObject = ((ReversePaymentRequest.TrxnIds) right);
                {
                    Boolean trxnIdsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.trxnIds!= null)&&(!leftObject.trxnIds.isEmpty())), ((rightObject.trxnIds!= null)&&(!rightObject.trxnIds.isEmpty())));
                    if (trxnIdsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<ReversePaymentRequest.TrxnIds.TrxnId> lhsTrxnIds;
                        lhsTrxnIds = (((leftObject.trxnIds!= null)&&(!leftObject.trxnIds.isEmpty()))?leftObject.getTrxnIds():null);
                        List<ReversePaymentRequest.TrxnIds.TrxnId> rhsTrxnIds;
                        rhsTrxnIds = (((rightObject.trxnIds!= null)&&(!rightObject.trxnIds.isEmpty()))?rightObject.getTrxnIds():null);
                        List<ReversePaymentRequest.TrxnIds.TrxnId> mergedTrxnIds = ((List<ReversePaymentRequest.TrxnIds.TrxnId> ) strategy.merge(LocatorUtils.property(leftLocator, "trxnIds", lhsTrxnIds), LocatorUtils.property(rightLocator, "trxnIds", rhsTrxnIds), lhsTrxnIds, rhsTrxnIds, ((leftObject.trxnIds!= null)&&(!leftObject.trxnIds.isEmpty())), ((rightObject.trxnIds!= null)&&(!rightObject.trxnIds.isEmpty()))));
                        target.trxnIds = null;
                        if (mergedTrxnIds!= null) {
                            List<ReversePaymentRequest.TrxnIds.TrxnId> uniqueTrxnIdsl = target.getTrxnIds();
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

        public void setTrxnIds(List<ReversePaymentRequest.TrxnIds.TrxnId> value) {
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
                final ReversePaymentRequest.TrxnIds.TrxnId that = ((ReversePaymentRequest.TrxnIds.TrxnId) object);
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
                if (draftCopy instanceof ReversePaymentRequest.TrxnIds.TrxnId) {
                    final ReversePaymentRequest.TrxnIds.TrxnId copy = ((ReversePaymentRequest.TrxnIds.TrxnId) draftCopy);
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
                return new ReversePaymentRequest.TrxnIds.TrxnId();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ReversePaymentRequest.TrxnIds.TrxnId) {
                    final ReversePaymentRequest.TrxnIds.TrxnId target = this;
                    final ReversePaymentRequest.TrxnIds.TrxnId leftObject = ((ReversePaymentRequest.TrxnIds.TrxnId) left);
                    final ReversePaymentRequest.TrxnIds.TrxnId rightObject = ((ReversePaymentRequest.TrxnIds.TrxnId) right);
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
     *         &lt;element name="VCR" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VouchNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
        "vcrs"
    })
    public static class VCRs implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "VCR")
        protected List<ReversePaymentRequest.VCRs.VCR> vcrs;

        /**
         * Gets the value of the vcrs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vcrs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVCRS().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ReversePaymentRequest.VCRs.VCR }
         * 
         * 
         */
        public List<ReversePaymentRequest.VCRs.VCR> getVCRS() {
            if (vcrs == null) {
                vcrs = new ArrayList<ReversePaymentRequest.VCRs.VCR>();
            }
            return this.vcrs;
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
                List<ReversePaymentRequest.VCRs.VCR> theVCRS;
                theVCRS = (((this.vcrs!= null)&&(!this.vcrs.isEmpty()))?this.getVCRS():null);
                strategy.appendField(locator, this, "vcrs", buffer, theVCRS, ((this.vcrs!= null)&&(!this.vcrs.isEmpty())));
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
            final ReversePaymentRequest.VCRs that = ((ReversePaymentRequest.VCRs) object);
            {
                List<ReversePaymentRequest.VCRs.VCR> lhsVCRS;
                lhsVCRS = (((this.vcrs!= null)&&(!this.vcrs.isEmpty()))?this.getVCRS():null);
                List<ReversePaymentRequest.VCRs.VCR> rhsVCRS;
                rhsVCRS = (((that.vcrs!= null)&&(!that.vcrs.isEmpty()))?that.getVCRS():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "vcrs", lhsVCRS), LocatorUtils.property(thatLocator, "vcrs", rhsVCRS), lhsVCRS, rhsVCRS, ((this.vcrs!= null)&&(!this.vcrs.isEmpty())), ((that.vcrs!= null)&&(!that.vcrs.isEmpty())))) {
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
                List<ReversePaymentRequest.VCRs.VCR> theVCRS;
                theVCRS = (((this.vcrs!= null)&&(!this.vcrs.isEmpty()))?this.getVCRS():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vcrs", theVCRS), currentHashCode, theVCRS, ((this.vcrs!= null)&&(!this.vcrs.isEmpty())));
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
            if (draftCopy instanceof ReversePaymentRequest.VCRs) {
                final ReversePaymentRequest.VCRs copy = ((ReversePaymentRequest.VCRs) draftCopy);
                {
                    Boolean vcrsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.vcrs!= null)&&(!this.vcrs.isEmpty())));
                    if (vcrsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ReversePaymentRequest.VCRs.VCR> sourceVCRS;
                        sourceVCRS = (((this.vcrs!= null)&&(!this.vcrs.isEmpty()))?this.getVCRS():null);
                        @SuppressWarnings("unchecked")
                        List<ReversePaymentRequest.VCRs.VCR> copyVCRS = ((List<ReversePaymentRequest.VCRs.VCR> ) strategy.copy(LocatorUtils.property(locator, "vcrs", sourceVCRS), sourceVCRS, ((this.vcrs!= null)&&(!this.vcrs.isEmpty()))));
                        copy.vcrs = null;
                        if (copyVCRS!= null) {
                            List<ReversePaymentRequest.VCRs.VCR> uniqueVCRSl = copy.getVCRS();
                            uniqueVCRSl.addAll(copyVCRS);
                        }
                    } else {
                        if (vcrsShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.vcrs = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ReversePaymentRequest.VCRs();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ReversePaymentRequest.VCRs) {
                final ReversePaymentRequest.VCRs target = this;
                final ReversePaymentRequest.VCRs leftObject = ((ReversePaymentRequest.VCRs) left);
                final ReversePaymentRequest.VCRs rightObject = ((ReversePaymentRequest.VCRs) right);
                {
                    Boolean vcrsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.vcrs!= null)&&(!leftObject.vcrs.isEmpty())), ((rightObject.vcrs!= null)&&(!rightObject.vcrs.isEmpty())));
                    if (vcrsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<ReversePaymentRequest.VCRs.VCR> lhsVCRS;
                        lhsVCRS = (((leftObject.vcrs!= null)&&(!leftObject.vcrs.isEmpty()))?leftObject.getVCRS():null);
                        List<ReversePaymentRequest.VCRs.VCR> rhsVCRS;
                        rhsVCRS = (((rightObject.vcrs!= null)&&(!rightObject.vcrs.isEmpty()))?rightObject.getVCRS():null);
                        List<ReversePaymentRequest.VCRs.VCR> mergedVCRS = ((List<ReversePaymentRequest.VCRs.VCR> ) strategy.merge(LocatorUtils.property(leftLocator, "vcrs", lhsVCRS), LocatorUtils.property(rightLocator, "vcrs", rhsVCRS), lhsVCRS, rhsVCRS, ((leftObject.vcrs!= null)&&(!leftObject.vcrs.isEmpty())), ((rightObject.vcrs!= null)&&(!rightObject.vcrs.isEmpty()))));
                        target.vcrs = null;
                        if (mergedVCRS!= null) {
                            List<ReversePaymentRequest.VCRs.VCR> uniqueVCRSl = target.getVCRS();
                            uniqueVCRSl.addAll(mergedVCRS);
                        }
                    } else {
                        if (vcrsShouldBeMergedAndSet == Boolean.FALSE) {
                            target.vcrs = null;
                        }
                    }
                }
            }
        }

        public void setVCRS(List<ReversePaymentRequest.VCRs.VCR> value) {
            this.vcrs = value;
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
         *         &lt;element name="VouchNumber" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
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
            "vouchNumber"
        })
        public static class VCR implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            @XmlElement(name = "VouchNumber")
            protected Object vouchNumber;

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
                    Object theVouchNumber;
                    theVouchNumber = this.getVouchNumber();
                    strategy.appendField(locator, this, "vouchNumber", buffer, theVouchNumber, (this.vouchNumber!= null));
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
                final ReversePaymentRequest.VCRs.VCR that = ((ReversePaymentRequest.VCRs.VCR) object);
                {
                    Object lhsVouchNumber;
                    lhsVouchNumber = this.getVouchNumber();
                    Object rhsVouchNumber;
                    rhsVouchNumber = that.getVouchNumber();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "vouchNumber", lhsVouchNumber), LocatorUtils.property(thatLocator, "vouchNumber", rhsVouchNumber), lhsVouchNumber, rhsVouchNumber, (this.vouchNumber!= null), (that.vouchNumber!= null))) {
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
                    Object theVouchNumber;
                    theVouchNumber = this.getVouchNumber();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vouchNumber", theVouchNumber), currentHashCode, theVouchNumber, (this.vouchNumber!= null));
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
                if (draftCopy instanceof ReversePaymentRequest.VCRs.VCR) {
                    final ReversePaymentRequest.VCRs.VCR copy = ((ReversePaymentRequest.VCRs.VCR) draftCopy);
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
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new ReversePaymentRequest.VCRs.VCR();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ReversePaymentRequest.VCRs.VCR) {
                    final ReversePaymentRequest.VCRs.VCR target = this;
                    final ReversePaymentRequest.VCRs.VCR leftObject = ((ReversePaymentRequest.VCRs.VCR) left);
                    final ReversePaymentRequest.VCRs.VCR rightObject = ((ReversePaymentRequest.VCRs.VCR) right);
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
                }
            }

        }

    }

}
