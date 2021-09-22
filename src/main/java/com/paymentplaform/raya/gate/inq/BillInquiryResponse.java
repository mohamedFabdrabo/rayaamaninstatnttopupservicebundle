
package com.paymentplaform.raya.gate.inq;

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
 * <p>Java class for Bill_Inquiry_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bill_Inquiry_Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://raya.paymentplaform.com/gate}Status"/&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AsynchUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Bills"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Bill" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ServiceRefNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="BillRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BillCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="SPBillMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BillData" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="BillDueAmounts"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="BillDueAmt" maxOccurs="unbounded"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="BillDueAmtType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                                           &lt;element name="BillDueAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                           &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="PaymentRange" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Lower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="Upper" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                                                 &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *         &lt;element name="inquiryAttributes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="attributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="attributeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Bill_Inquiry_Response", namespace = "http://raya.paymentplaform.com/gate/inq", propOrder = {
    "status",
    "rqUID",
    "asynchUID",
    "serviceCode",
    "bills",
    "inquiryAttributes",
    "notifications",
    "any"
})
public class BillInquiryResponse implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsynchUID", required = true)
    protected String asynchUID;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "Bills", required = true)
    protected BillInquiryResponse.Bills bills;
    protected List<BillInquiryResponse.InquiryAttributes> inquiryAttributes;
    @XmlElement(required = true)
    protected BillInquiryResponse.Notifications notifications;
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
     * Gets the value of the bills property.
     * 
     * @return
     *     possible object is
     *     {@link BillInquiryResponse.Bills }
     *     
     */
    public BillInquiryResponse.Bills getBills() {
        return bills;
    }

    /**
     * Sets the value of the bills property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillInquiryResponse.Bills }
     *     
     */
    public void setBills(BillInquiryResponse.Bills value) {
        this.bills = value;
    }

    /**
     * Gets the value of the inquiryAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inquiryAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInquiryAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillInquiryResponse.InquiryAttributes }
     * 
     * 
     */
    public List<BillInquiryResponse.InquiryAttributes> getInquiryAttributes() {
        if (inquiryAttributes == null) {
            inquiryAttributes = new ArrayList<BillInquiryResponse.InquiryAttributes>();
        }
        return this.inquiryAttributes;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link BillInquiryResponse.Notifications }
     *     
     */
    public BillInquiryResponse.Notifications getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillInquiryResponse.Notifications }
     *     
     */
    public void setNotifications(BillInquiryResponse.Notifications value) {
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
            String theServiceCode;
            theServiceCode = this.getServiceCode();
            strategy.appendField(locator, this, "serviceCode", buffer, theServiceCode, (this.serviceCode!= null));
        }
        {
            BillInquiryResponse.Bills theBills;
            theBills = this.getBills();
            strategy.appendField(locator, this, "bills", buffer, theBills, (this.bills!= null));
        }
        {
            List<BillInquiryResponse.InquiryAttributes> theInquiryAttributes;
            theInquiryAttributes = (((this.inquiryAttributes!= null)&&(!this.inquiryAttributes.isEmpty()))?this.getInquiryAttributes():null);
            strategy.appendField(locator, this, "inquiryAttributes", buffer, theInquiryAttributes, ((this.inquiryAttributes!= null)&&(!this.inquiryAttributes.isEmpty())));
        }
        {
            BillInquiryResponse.Notifications theNotifications;
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
        final BillInquiryResponse that = ((BillInquiryResponse) object);
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
            String lhsServiceCode;
            lhsServiceCode = this.getServiceCode();
            String rhsServiceCode;
            rhsServiceCode = that.getServiceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCode", lhsServiceCode), LocatorUtils.property(thatLocator, "serviceCode", rhsServiceCode), lhsServiceCode, rhsServiceCode, (this.serviceCode!= null), (that.serviceCode!= null))) {
                return false;
            }
        }
        {
            BillInquiryResponse.Bills lhsBills;
            lhsBills = this.getBills();
            BillInquiryResponse.Bills rhsBills;
            rhsBills = that.getBills();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bills", lhsBills), LocatorUtils.property(thatLocator, "bills", rhsBills), lhsBills, rhsBills, (this.bills!= null), (that.bills!= null))) {
                return false;
            }
        }
        {
            List<BillInquiryResponse.InquiryAttributes> lhsInquiryAttributes;
            lhsInquiryAttributes = (((this.inquiryAttributes!= null)&&(!this.inquiryAttributes.isEmpty()))?this.getInquiryAttributes():null);
            List<BillInquiryResponse.InquiryAttributes> rhsInquiryAttributes;
            rhsInquiryAttributes = (((that.inquiryAttributes!= null)&&(!that.inquiryAttributes.isEmpty()))?that.getInquiryAttributes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inquiryAttributes", lhsInquiryAttributes), LocatorUtils.property(thatLocator, "inquiryAttributes", rhsInquiryAttributes), lhsInquiryAttributes, rhsInquiryAttributes, ((this.inquiryAttributes!= null)&&(!this.inquiryAttributes.isEmpty())), ((that.inquiryAttributes!= null)&&(!that.inquiryAttributes.isEmpty())))) {
                return false;
            }
        }
        {
            BillInquiryResponse.Notifications lhsNotifications;
            lhsNotifications = this.getNotifications();
            BillInquiryResponse.Notifications rhsNotifications;
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
            String theServiceCode;
            theServiceCode = this.getServiceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceCode", theServiceCode), currentHashCode, theServiceCode, (this.serviceCode!= null));
        }
        {
            BillInquiryResponse.Bills theBills;
            theBills = this.getBills();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bills", theBills), currentHashCode, theBills, (this.bills!= null));
        }
        {
            List<BillInquiryResponse.InquiryAttributes> theInquiryAttributes;
            theInquiryAttributes = (((this.inquiryAttributes!= null)&&(!this.inquiryAttributes.isEmpty()))?this.getInquiryAttributes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inquiryAttributes", theInquiryAttributes), currentHashCode, theInquiryAttributes, ((this.inquiryAttributes!= null)&&(!this.inquiryAttributes.isEmpty())));
        }
        {
            BillInquiryResponse.Notifications theNotifications;
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
        if (draftCopy instanceof BillInquiryResponse) {
            final BillInquiryResponse copy = ((BillInquiryResponse) draftCopy);
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
                Boolean billsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bills!= null));
                if (billsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BillInquiryResponse.Bills sourceBills;
                    sourceBills = this.getBills();
                    BillInquiryResponse.Bills copyBills = ((BillInquiryResponse.Bills) strategy.copy(LocatorUtils.property(locator, "bills", sourceBills), sourceBills, (this.bills!= null)));
                    copy.setBills(copyBills);
                } else {
                    if (billsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bills = null;
                    }
                }
            }
            {
                Boolean inquiryAttributesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.inquiryAttributes!= null)&&(!this.inquiryAttributes.isEmpty())));
                if (inquiryAttributesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<BillInquiryResponse.InquiryAttributes> sourceInquiryAttributes;
                    sourceInquiryAttributes = (((this.inquiryAttributes!= null)&&(!this.inquiryAttributes.isEmpty()))?this.getInquiryAttributes():null);
                    @SuppressWarnings("unchecked")
                    List<BillInquiryResponse.InquiryAttributes> copyInquiryAttributes = ((List<BillInquiryResponse.InquiryAttributes> ) strategy.copy(LocatorUtils.property(locator, "inquiryAttributes", sourceInquiryAttributes), sourceInquiryAttributes, ((this.inquiryAttributes!= null)&&(!this.inquiryAttributes.isEmpty()))));
                    copy.inquiryAttributes = null;
                    if (copyInquiryAttributes!= null) {
                        List<BillInquiryResponse.InquiryAttributes> uniqueInquiryAttributesl = copy.getInquiryAttributes();
                        uniqueInquiryAttributesl.addAll(copyInquiryAttributes);
                    }
                } else {
                    if (inquiryAttributesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.inquiryAttributes = null;
                    }
                }
            }
            {
                Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.notifications!= null));
                if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                    BillInquiryResponse.Notifications sourceNotifications;
                    sourceNotifications = this.getNotifications();
                    BillInquiryResponse.Notifications copyNotifications = ((BillInquiryResponse.Notifications) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, (this.notifications!= null)));
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
        return new BillInquiryResponse();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof BillInquiryResponse) {
            final BillInquiryResponse target = this;
            final BillInquiryResponse leftObject = ((BillInquiryResponse) left);
            final BillInquiryResponse rightObject = ((BillInquiryResponse) right);
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
                Boolean billsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.bills!= null), (rightObject.bills!= null));
                if (billsShouldBeMergedAndSet == Boolean.TRUE) {
                    BillInquiryResponse.Bills lhsBills;
                    lhsBills = leftObject.getBills();
                    BillInquiryResponse.Bills rhsBills;
                    rhsBills = rightObject.getBills();
                    BillInquiryResponse.Bills mergedBills = ((BillInquiryResponse.Bills) strategy.merge(LocatorUtils.property(leftLocator, "bills", lhsBills), LocatorUtils.property(rightLocator, "bills", rhsBills), lhsBills, rhsBills, (leftObject.bills!= null), (rightObject.bills!= null)));
                    target.setBills(mergedBills);
                } else {
                    if (billsShouldBeMergedAndSet == Boolean.FALSE) {
                        target.bills = null;
                    }
                }
            }
            {
                Boolean inquiryAttributesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.inquiryAttributes!= null)&&(!leftObject.inquiryAttributes.isEmpty())), ((rightObject.inquiryAttributes!= null)&&(!rightObject.inquiryAttributes.isEmpty())));
                if (inquiryAttributesShouldBeMergedAndSet == Boolean.TRUE) {
                    List<BillInquiryResponse.InquiryAttributes> lhsInquiryAttributes;
                    lhsInquiryAttributes = (((leftObject.inquiryAttributes!= null)&&(!leftObject.inquiryAttributes.isEmpty()))?leftObject.getInquiryAttributes():null);
                    List<BillInquiryResponse.InquiryAttributes> rhsInquiryAttributes;
                    rhsInquiryAttributes = (((rightObject.inquiryAttributes!= null)&&(!rightObject.inquiryAttributes.isEmpty()))?rightObject.getInquiryAttributes():null);
                    List<BillInquiryResponse.InquiryAttributes> mergedInquiryAttributes = ((List<BillInquiryResponse.InquiryAttributes> ) strategy.merge(LocatorUtils.property(leftLocator, "inquiryAttributes", lhsInquiryAttributes), LocatorUtils.property(rightLocator, "inquiryAttributes", rhsInquiryAttributes), lhsInquiryAttributes, rhsInquiryAttributes, ((leftObject.inquiryAttributes!= null)&&(!leftObject.inquiryAttributes.isEmpty())), ((rightObject.inquiryAttributes!= null)&&(!rightObject.inquiryAttributes.isEmpty()))));
                    target.inquiryAttributes = null;
                    if (mergedInquiryAttributes!= null) {
                        List<BillInquiryResponse.InquiryAttributes> uniqueInquiryAttributesl = target.getInquiryAttributes();
                        uniqueInquiryAttributesl.addAll(mergedInquiryAttributes);
                    }
                } else {
                    if (inquiryAttributesShouldBeMergedAndSet == Boolean.FALSE) {
                        target.inquiryAttributes = null;
                    }
                }
            }
            {
                Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.notifications!= null), (rightObject.notifications!= null));
                if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                    BillInquiryResponse.Notifications lhsNotifications;
                    lhsNotifications = leftObject.getNotifications();
                    BillInquiryResponse.Notifications rhsNotifications;
                    rhsNotifications = rightObject.getNotifications();
                    BillInquiryResponse.Notifications mergedNotifications = ((BillInquiryResponse.Notifications) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, (leftObject.notifications!= null), (rightObject.notifications!= null)));
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

    public void setInquiryAttributes(List<BillInquiryResponse.InquiryAttributes> value) {
        this.inquiryAttributes = value;
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
     *         &lt;element name="Bill" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ServiceRefNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="BillRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BillCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="SPBillMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BillData" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="BillDueAmounts"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="BillDueAmt" maxOccurs="unbounded"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="BillDueAmtType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                                                 &lt;element name="BillDueAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                                 &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="PaymentRange" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Lower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="Upper" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *                                       &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
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
    @XmlType(name = "", propOrder = {
        "bills"
    })
    public static class Bills implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "Bill", required = true)
        protected List<BillInquiryResponse.Bills.Bill> bills;

        /**
         * Gets the value of the bills property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bills property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBills().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BillInquiryResponse.Bills.Bill }
         * 
         * 
         */
        public List<BillInquiryResponse.Bills.Bill> getBills() {
            if (bills == null) {
                bills = new ArrayList<BillInquiryResponse.Bills.Bill>();
            }
            return this.bills;
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
                List<BillInquiryResponse.Bills.Bill> theBills;
                theBills = (((this.bills!= null)&&(!this.bills.isEmpty()))?this.getBills():null);
                strategy.appendField(locator, this, "bills", buffer, theBills, ((this.bills!= null)&&(!this.bills.isEmpty())));
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
            final BillInquiryResponse.Bills that = ((BillInquiryResponse.Bills) object);
            {
                List<BillInquiryResponse.Bills.Bill> lhsBills;
                lhsBills = (((this.bills!= null)&&(!this.bills.isEmpty()))?this.getBills():null);
                List<BillInquiryResponse.Bills.Bill> rhsBills;
                rhsBills = (((that.bills!= null)&&(!that.bills.isEmpty()))?that.getBills():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "bills", lhsBills), LocatorUtils.property(thatLocator, "bills", rhsBills), lhsBills, rhsBills, ((this.bills!= null)&&(!this.bills.isEmpty())), ((that.bills!= null)&&(!that.bills.isEmpty())))) {
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
                List<BillInquiryResponse.Bills.Bill> theBills;
                theBills = (((this.bills!= null)&&(!this.bills.isEmpty()))?this.getBills():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bills", theBills), currentHashCode, theBills, ((this.bills!= null)&&(!this.bills.isEmpty())));
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
            if (draftCopy instanceof BillInquiryResponse.Bills) {
                final BillInquiryResponse.Bills copy = ((BillInquiryResponse.Bills) draftCopy);
                {
                    Boolean billsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.bills!= null)&&(!this.bills.isEmpty())));
                    if (billsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<BillInquiryResponse.Bills.Bill> sourceBills;
                        sourceBills = (((this.bills!= null)&&(!this.bills.isEmpty()))?this.getBills():null);
                        @SuppressWarnings("unchecked")
                        List<BillInquiryResponse.Bills.Bill> copyBills = ((List<BillInquiryResponse.Bills.Bill> ) strategy.copy(LocatorUtils.property(locator, "bills", sourceBills), sourceBills, ((this.bills!= null)&&(!this.bills.isEmpty()))));
                        copy.bills = null;
                        if (copyBills!= null) {
                            List<BillInquiryResponse.Bills.Bill> uniqueBillsl = copy.getBills();
                            uniqueBillsl.addAll(copyBills);
                        }
                    } else {
                        if (billsShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.bills = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new BillInquiryResponse.Bills();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof BillInquiryResponse.Bills) {
                final BillInquiryResponse.Bills target = this;
                final BillInquiryResponse.Bills leftObject = ((BillInquiryResponse.Bills) left);
                final BillInquiryResponse.Bills rightObject = ((BillInquiryResponse.Bills) right);
                {
                    Boolean billsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.bills!= null)&&(!leftObject.bills.isEmpty())), ((rightObject.bills!= null)&&(!rightObject.bills.isEmpty())));
                    if (billsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<BillInquiryResponse.Bills.Bill> lhsBills;
                        lhsBills = (((leftObject.bills!= null)&&(!leftObject.bills.isEmpty()))?leftObject.getBills():null);
                        List<BillInquiryResponse.Bills.Bill> rhsBills;
                        rhsBills = (((rightObject.bills!= null)&&(!rightObject.bills.isEmpty()))?rightObject.getBills():null);
                        List<BillInquiryResponse.Bills.Bill> mergedBills = ((List<BillInquiryResponse.Bills.Bill> ) strategy.merge(LocatorUtils.property(leftLocator, "bills", lhsBills), LocatorUtils.property(rightLocator, "bills", rhsBills), lhsBills, rhsBills, ((leftObject.bills!= null)&&(!leftObject.bills.isEmpty())), ((rightObject.bills!= null)&&(!rightObject.bills.isEmpty()))));
                        target.bills = null;
                        if (mergedBills!= null) {
                            List<BillInquiryResponse.Bills.Bill> uniqueBillsl = target.getBills();
                            uniqueBillsl.addAll(mergedBills);
                        }
                    } else {
                        if (billsShouldBeMergedAndSet == Boolean.FALSE) {
                            target.bills = null;
                        }
                    }
                }
            }
        }

        public void setBills(List<BillInquiryResponse.Bills.Bill> value) {
            this.bills = value;
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
         *         &lt;element name="ServiceRefNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="BillRefNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BillCycle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="SPBillMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BillData" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="BillDueAmounts"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="BillDueAmt" maxOccurs="unbounded"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="BillDueAmtType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                                       &lt;element name="BillDueAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                                       &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="PaymentRange" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Lower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="Upper" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
         *                             &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
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
        @XmlType(name = "", propOrder = {
            "serviceRefNumber",
            "billRefNumber",
            "billCycle",
            "issueDate",
            "dueDate",
            "spBillMessage",
            "billData"
        })
        public static class Bill implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            @XmlElement(name = "ServiceRefNumber", required = true)
            protected String serviceRefNumber;
            @XmlElement(name = "BillRefNumber")
            protected String billRefNumber;
            @XmlElement(name = "BillCycle")
            protected String billCycle;
            @XmlElement(name = "IssueDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar issueDate;
            @XmlElement(name = "DueDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dueDate;
            @XmlElement(name = "SPBillMessage")
            protected String spBillMessage;
            @XmlElement(name = "BillData")
            protected BillInquiryResponse.Bills.Bill.BillData billData;

            /**
             * Gets the value of the serviceRefNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceRefNumber() {
                return serviceRefNumber;
            }

            /**
             * Sets the value of the serviceRefNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceRefNumber(String value) {
                this.serviceRefNumber = value;
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
             * Gets the value of the billCycle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBillCycle() {
                return billCycle;
            }

            /**
             * Sets the value of the billCycle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBillCycle(String value) {
                this.billCycle = value;
            }

            /**
             * Gets the value of the issueDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getIssueDate() {
                return issueDate;
            }

            /**
             * Sets the value of the issueDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setIssueDate(XMLGregorianCalendar value) {
                this.issueDate = value;
            }

            /**
             * Gets the value of the dueDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDueDate() {
                return dueDate;
            }

            /**
             * Sets the value of the dueDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDueDate(XMLGregorianCalendar value) {
                this.dueDate = value;
            }

            /**
             * Gets the value of the spBillMessage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPBillMessage() {
                return spBillMessage;
            }

            /**
             * Sets the value of the spBillMessage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPBillMessage(String value) {
                this.spBillMessage = value;
            }

            /**
             * Gets the value of the billData property.
             * 
             * @return
             *     possible object is
             *     {@link BillInquiryResponse.Bills.Bill.BillData }
             *     
             */
            public BillInquiryResponse.Bills.Bill.BillData getBillData() {
                return billData;
            }

            /**
             * Sets the value of the billData property.
             * 
             * @param value
             *     allowed object is
             *     {@link BillInquiryResponse.Bills.Bill.BillData }
             *     
             */
            public void setBillData(BillInquiryResponse.Bills.Bill.BillData value) {
                this.billData = value;
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
                    String theServiceRefNumber;
                    theServiceRefNumber = this.getServiceRefNumber();
                    strategy.appendField(locator, this, "serviceRefNumber", buffer, theServiceRefNumber, (this.serviceRefNumber!= null));
                }
                {
                    String theBillRefNumber;
                    theBillRefNumber = this.getBillRefNumber();
                    strategy.appendField(locator, this, "billRefNumber", buffer, theBillRefNumber, (this.billRefNumber!= null));
                }
                {
                    String theBillCycle;
                    theBillCycle = this.getBillCycle();
                    strategy.appendField(locator, this, "billCycle", buffer, theBillCycle, (this.billCycle!= null));
                }
                {
                    XMLGregorianCalendar theIssueDate;
                    theIssueDate = this.getIssueDate();
                    strategy.appendField(locator, this, "issueDate", buffer, theIssueDate, (this.issueDate!= null));
                }
                {
                    XMLGregorianCalendar theDueDate;
                    theDueDate = this.getDueDate();
                    strategy.appendField(locator, this, "dueDate", buffer, theDueDate, (this.dueDate!= null));
                }
                {
                    String theSPBillMessage;
                    theSPBillMessage = this.getSPBillMessage();
                    strategy.appendField(locator, this, "spBillMessage", buffer, theSPBillMessage, (this.spBillMessage!= null));
                }
                {
                    BillInquiryResponse.Bills.Bill.BillData theBillData;
                    theBillData = this.getBillData();
                    strategy.appendField(locator, this, "billData", buffer, theBillData, (this.billData!= null));
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
                final BillInquiryResponse.Bills.Bill that = ((BillInquiryResponse.Bills.Bill) object);
                {
                    String lhsServiceRefNumber;
                    lhsServiceRefNumber = this.getServiceRefNumber();
                    String rhsServiceRefNumber;
                    rhsServiceRefNumber = that.getServiceRefNumber();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceRefNumber", lhsServiceRefNumber), LocatorUtils.property(thatLocator, "serviceRefNumber", rhsServiceRefNumber), lhsServiceRefNumber, rhsServiceRefNumber, (this.serviceRefNumber!= null), (that.serviceRefNumber!= null))) {
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
                    String lhsBillCycle;
                    lhsBillCycle = this.getBillCycle();
                    String rhsBillCycle;
                    rhsBillCycle = that.getBillCycle();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "billCycle", lhsBillCycle), LocatorUtils.property(thatLocator, "billCycle", rhsBillCycle), lhsBillCycle, rhsBillCycle, (this.billCycle!= null), (that.billCycle!= null))) {
                        return false;
                    }
                }
                {
                    XMLGregorianCalendar lhsIssueDate;
                    lhsIssueDate = this.getIssueDate();
                    XMLGregorianCalendar rhsIssueDate;
                    rhsIssueDate = that.getIssueDate();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "issueDate", lhsIssueDate), LocatorUtils.property(thatLocator, "issueDate", rhsIssueDate), lhsIssueDate, rhsIssueDate, (this.issueDate!= null), (that.issueDate!= null))) {
                        return false;
                    }
                }
                {
                    XMLGregorianCalendar lhsDueDate;
                    lhsDueDate = this.getDueDate();
                    XMLGregorianCalendar rhsDueDate;
                    rhsDueDate = that.getDueDate();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "dueDate", lhsDueDate), LocatorUtils.property(thatLocator, "dueDate", rhsDueDate), lhsDueDate, rhsDueDate, (this.dueDate!= null), (that.dueDate!= null))) {
                        return false;
                    }
                }
                {
                    String lhsSPBillMessage;
                    lhsSPBillMessage = this.getSPBillMessage();
                    String rhsSPBillMessage;
                    rhsSPBillMessage = that.getSPBillMessage();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "spBillMessage", lhsSPBillMessage), LocatorUtils.property(thatLocator, "spBillMessage", rhsSPBillMessage), lhsSPBillMessage, rhsSPBillMessage, (this.spBillMessage!= null), (that.spBillMessage!= null))) {
                        return false;
                    }
                }
                {
                    BillInquiryResponse.Bills.Bill.BillData lhsBillData;
                    lhsBillData = this.getBillData();
                    BillInquiryResponse.Bills.Bill.BillData rhsBillData;
                    rhsBillData = that.getBillData();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "billData", lhsBillData), LocatorUtils.property(thatLocator, "billData", rhsBillData), lhsBillData, rhsBillData, (this.billData!= null), (that.billData!= null))) {
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
                    String theServiceRefNumber;
                    theServiceRefNumber = this.getServiceRefNumber();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceRefNumber", theServiceRefNumber), currentHashCode, theServiceRefNumber, (this.serviceRefNumber!= null));
                }
                {
                    String theBillRefNumber;
                    theBillRefNumber = this.getBillRefNumber();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billRefNumber", theBillRefNumber), currentHashCode, theBillRefNumber, (this.billRefNumber!= null));
                }
                {
                    String theBillCycle;
                    theBillCycle = this.getBillCycle();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billCycle", theBillCycle), currentHashCode, theBillCycle, (this.billCycle!= null));
                }
                {
                    XMLGregorianCalendar theIssueDate;
                    theIssueDate = this.getIssueDate();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "issueDate", theIssueDate), currentHashCode, theIssueDate, (this.issueDate!= null));
                }
                {
                    XMLGregorianCalendar theDueDate;
                    theDueDate = this.getDueDate();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dueDate", theDueDate), currentHashCode, theDueDate, (this.dueDate!= null));
                }
                {
                    String theSPBillMessage;
                    theSPBillMessage = this.getSPBillMessage();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spBillMessage", theSPBillMessage), currentHashCode, theSPBillMessage, (this.spBillMessage!= null));
                }
                {
                    BillInquiryResponse.Bills.Bill.BillData theBillData;
                    theBillData = this.getBillData();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billData", theBillData), currentHashCode, theBillData, (this.billData!= null));
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
                if (draftCopy instanceof BillInquiryResponse.Bills.Bill) {
                    final BillInquiryResponse.Bills.Bill copy = ((BillInquiryResponse.Bills.Bill) draftCopy);
                    {
                        Boolean serviceRefNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceRefNumber!= null));
                        if (serviceRefNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceServiceRefNumber;
                            sourceServiceRefNumber = this.getServiceRefNumber();
                            String copyServiceRefNumber = ((String) strategy.copy(LocatorUtils.property(locator, "serviceRefNumber", sourceServiceRefNumber), sourceServiceRefNumber, (this.serviceRefNumber!= null)));
                            copy.setServiceRefNumber(copyServiceRefNumber);
                        } else {
                            if (serviceRefNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.serviceRefNumber = null;
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
                        Boolean billCycleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billCycle!= null));
                        if (billCycleShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceBillCycle;
                            sourceBillCycle = this.getBillCycle();
                            String copyBillCycle = ((String) strategy.copy(LocatorUtils.property(locator, "billCycle", sourceBillCycle), sourceBillCycle, (this.billCycle!= null)));
                            copy.setBillCycle(copyBillCycle);
                        } else {
                            if (billCycleShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.billCycle = null;
                            }
                        }
                    }
                    {
                        Boolean issueDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.issueDate!= null));
                        if (issueDateShouldBeCopiedAndSet == Boolean.TRUE) {
                            XMLGregorianCalendar sourceIssueDate;
                            sourceIssueDate = this.getIssueDate();
                            XMLGregorianCalendar copyIssueDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "issueDate", sourceIssueDate), sourceIssueDate, (this.issueDate!= null)));
                            copy.setIssueDate(copyIssueDate);
                        } else {
                            if (issueDateShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.issueDate = null;
                            }
                        }
                    }
                    {
                        Boolean dueDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dueDate!= null));
                        if (dueDateShouldBeCopiedAndSet == Boolean.TRUE) {
                            XMLGregorianCalendar sourceDueDate;
                            sourceDueDate = this.getDueDate();
                            XMLGregorianCalendar copyDueDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "dueDate", sourceDueDate), sourceDueDate, (this.dueDate!= null)));
                            copy.setDueDate(copyDueDate);
                        } else {
                            if (dueDateShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.dueDate = null;
                            }
                        }
                    }
                    {
                        Boolean spBillMessageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.spBillMessage!= null));
                        if (spBillMessageShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceSPBillMessage;
                            sourceSPBillMessage = this.getSPBillMessage();
                            String copySPBillMessage = ((String) strategy.copy(LocatorUtils.property(locator, "spBillMessage", sourceSPBillMessage), sourceSPBillMessage, (this.spBillMessage!= null)));
                            copy.setSPBillMessage(copySPBillMessage);
                        } else {
                            if (spBillMessageShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.spBillMessage = null;
                            }
                        }
                    }
                    {
                        Boolean billDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billData!= null));
                        if (billDataShouldBeCopiedAndSet == Boolean.TRUE) {
                            BillInquiryResponse.Bills.Bill.BillData sourceBillData;
                            sourceBillData = this.getBillData();
                            BillInquiryResponse.Bills.Bill.BillData copyBillData = ((BillInquiryResponse.Bills.Bill.BillData) strategy.copy(LocatorUtils.property(locator, "billData", sourceBillData), sourceBillData, (this.billData!= null)));
                            copy.setBillData(copyBillData);
                        } else {
                            if (billDataShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.billData = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new BillInquiryResponse.Bills.Bill();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof BillInquiryResponse.Bills.Bill) {
                    final BillInquiryResponse.Bills.Bill target = this;
                    final BillInquiryResponse.Bills.Bill leftObject = ((BillInquiryResponse.Bills.Bill) left);
                    final BillInquiryResponse.Bills.Bill rightObject = ((BillInquiryResponse.Bills.Bill) right);
                    {
                        Boolean serviceRefNumberShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceRefNumber!= null), (rightObject.serviceRefNumber!= null));
                        if (serviceRefNumberShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsServiceRefNumber;
                            lhsServiceRefNumber = leftObject.getServiceRefNumber();
                            String rhsServiceRefNumber;
                            rhsServiceRefNumber = rightObject.getServiceRefNumber();
                            String mergedServiceRefNumber = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceRefNumber", lhsServiceRefNumber), LocatorUtils.property(rightLocator, "serviceRefNumber", rhsServiceRefNumber), lhsServiceRefNumber, rhsServiceRefNumber, (leftObject.serviceRefNumber!= null), (rightObject.serviceRefNumber!= null)));
                            target.setServiceRefNumber(mergedServiceRefNumber);
                        } else {
                            if (serviceRefNumberShouldBeMergedAndSet == Boolean.FALSE) {
                                target.serviceRefNumber = null;
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
                        Boolean billCycleShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.billCycle!= null), (rightObject.billCycle!= null));
                        if (billCycleShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsBillCycle;
                            lhsBillCycle = leftObject.getBillCycle();
                            String rhsBillCycle;
                            rhsBillCycle = rightObject.getBillCycle();
                            String mergedBillCycle = ((String) strategy.merge(LocatorUtils.property(leftLocator, "billCycle", lhsBillCycle), LocatorUtils.property(rightLocator, "billCycle", rhsBillCycle), lhsBillCycle, rhsBillCycle, (leftObject.billCycle!= null), (rightObject.billCycle!= null)));
                            target.setBillCycle(mergedBillCycle);
                        } else {
                            if (billCycleShouldBeMergedAndSet == Boolean.FALSE) {
                                target.billCycle = null;
                            }
                        }
                    }
                    {
                        Boolean issueDateShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.issueDate!= null), (rightObject.issueDate!= null));
                        if (issueDateShouldBeMergedAndSet == Boolean.TRUE) {
                            XMLGregorianCalendar lhsIssueDate;
                            lhsIssueDate = leftObject.getIssueDate();
                            XMLGregorianCalendar rhsIssueDate;
                            rhsIssueDate = rightObject.getIssueDate();
                            XMLGregorianCalendar mergedIssueDate = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "issueDate", lhsIssueDate), LocatorUtils.property(rightLocator, "issueDate", rhsIssueDate), lhsIssueDate, rhsIssueDate, (leftObject.issueDate!= null), (rightObject.issueDate!= null)));
                            target.setIssueDate(mergedIssueDate);
                        } else {
                            if (issueDateShouldBeMergedAndSet == Boolean.FALSE) {
                                target.issueDate = null;
                            }
                        }
                    }
                    {
                        Boolean dueDateShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.dueDate!= null), (rightObject.dueDate!= null));
                        if (dueDateShouldBeMergedAndSet == Boolean.TRUE) {
                            XMLGregorianCalendar lhsDueDate;
                            lhsDueDate = leftObject.getDueDate();
                            XMLGregorianCalendar rhsDueDate;
                            rhsDueDate = rightObject.getDueDate();
                            XMLGregorianCalendar mergedDueDate = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "dueDate", lhsDueDate), LocatorUtils.property(rightLocator, "dueDate", rhsDueDate), lhsDueDate, rhsDueDate, (leftObject.dueDate!= null), (rightObject.dueDate!= null)));
                            target.setDueDate(mergedDueDate);
                        } else {
                            if (dueDateShouldBeMergedAndSet == Boolean.FALSE) {
                                target.dueDate = null;
                            }
                        }
                    }
                    {
                        Boolean spBillMessageShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.spBillMessage!= null), (rightObject.spBillMessage!= null));
                        if (spBillMessageShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsSPBillMessage;
                            lhsSPBillMessage = leftObject.getSPBillMessage();
                            String rhsSPBillMessage;
                            rhsSPBillMessage = rightObject.getSPBillMessage();
                            String mergedSPBillMessage = ((String) strategy.merge(LocatorUtils.property(leftLocator, "spBillMessage", lhsSPBillMessage), LocatorUtils.property(rightLocator, "spBillMessage", rhsSPBillMessage), lhsSPBillMessage, rhsSPBillMessage, (leftObject.spBillMessage!= null), (rightObject.spBillMessage!= null)));
                            target.setSPBillMessage(mergedSPBillMessage);
                        } else {
                            if (spBillMessageShouldBeMergedAndSet == Boolean.FALSE) {
                                target.spBillMessage = null;
                            }
                        }
                    }
                    {
                        Boolean billDataShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.billData!= null), (rightObject.billData!= null));
                        if (billDataShouldBeMergedAndSet == Boolean.TRUE) {
                            BillInquiryResponse.Bills.Bill.BillData lhsBillData;
                            lhsBillData = leftObject.getBillData();
                            BillInquiryResponse.Bills.Bill.BillData rhsBillData;
                            rhsBillData = rightObject.getBillData();
                            BillInquiryResponse.Bills.Bill.BillData mergedBillData = ((BillInquiryResponse.Bills.Bill.BillData) strategy.merge(LocatorUtils.property(leftLocator, "billData", lhsBillData), LocatorUtils.property(rightLocator, "billData", rhsBillData), lhsBillData, rhsBillData, (leftObject.billData!= null), (rightObject.billData!= null)));
                            target.setBillData(mergedBillData);
                        } else {
                            if (billDataShouldBeMergedAndSet == Boolean.FALSE) {
                                target.billData = null;
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
             *         &lt;element name="BillDueAmounts"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="BillDueAmt" maxOccurs="unbounded"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="BillDueAmtType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
             *                             &lt;element name="BillDueAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                             &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
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
             *         &lt;element name="PaymentRange" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Lower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="Upper" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
             *                   &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
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
                "billDueAmounts",
                "paymentRange"
            })
            public static class BillData implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
            {

                @XmlElement(name = "BillDueAmounts", required = true)
                protected BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts billDueAmounts;
                @XmlElement(name = "PaymentRange")
                protected BillInquiryResponse.Bills.Bill.BillData.PaymentRange paymentRange;

                /**
                 * Gets the value of the billDueAmounts property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts }
                 *     
                 */
                public BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts getBillDueAmounts() {
                    return billDueAmounts;
                }

                /**
                 * Sets the value of the billDueAmounts property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts }
                 *     
                 */
                public void setBillDueAmounts(BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts value) {
                    this.billDueAmounts = value;
                }

                /**
                 * Gets the value of the paymentRange property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BillInquiryResponse.Bills.Bill.BillData.PaymentRange }
                 *     
                 */
                public BillInquiryResponse.Bills.Bill.BillData.PaymentRange getPaymentRange() {
                    return paymentRange;
                }

                /**
                 * Sets the value of the paymentRange property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BillInquiryResponse.Bills.Bill.BillData.PaymentRange }
                 *     
                 */
                public void setPaymentRange(BillInquiryResponse.Bills.Bill.BillData.PaymentRange value) {
                    this.paymentRange = value;
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
                        BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts theBillDueAmounts;
                        theBillDueAmounts = this.getBillDueAmounts();
                        strategy.appendField(locator, this, "billDueAmounts", buffer, theBillDueAmounts, (this.billDueAmounts!= null));
                    }
                    {
                        BillInquiryResponse.Bills.Bill.BillData.PaymentRange thePaymentRange;
                        thePaymentRange = this.getPaymentRange();
                        strategy.appendField(locator, this, "paymentRange", buffer, thePaymentRange, (this.paymentRange!= null));
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
                    final BillInquiryResponse.Bills.Bill.BillData that = ((BillInquiryResponse.Bills.Bill.BillData) object);
                    {
                        BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts lhsBillDueAmounts;
                        lhsBillDueAmounts = this.getBillDueAmounts();
                        BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts rhsBillDueAmounts;
                        rhsBillDueAmounts = that.getBillDueAmounts();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "billDueAmounts", lhsBillDueAmounts), LocatorUtils.property(thatLocator, "billDueAmounts", rhsBillDueAmounts), lhsBillDueAmounts, rhsBillDueAmounts, (this.billDueAmounts!= null), (that.billDueAmounts!= null))) {
                            return false;
                        }
                    }
                    {
                        BillInquiryResponse.Bills.Bill.BillData.PaymentRange lhsPaymentRange;
                        lhsPaymentRange = this.getPaymentRange();
                        BillInquiryResponse.Bills.Bill.BillData.PaymentRange rhsPaymentRange;
                        rhsPaymentRange = that.getPaymentRange();
                        if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentRange", lhsPaymentRange), LocatorUtils.property(thatLocator, "paymentRange", rhsPaymentRange), lhsPaymentRange, rhsPaymentRange, (this.paymentRange!= null), (that.paymentRange!= null))) {
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
                        BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts theBillDueAmounts;
                        theBillDueAmounts = this.getBillDueAmounts();
                        currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billDueAmounts", theBillDueAmounts), currentHashCode, theBillDueAmounts, (this.billDueAmounts!= null));
                    }
                    {
                        BillInquiryResponse.Bills.Bill.BillData.PaymentRange thePaymentRange;
                        thePaymentRange = this.getPaymentRange();
                        currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentRange", thePaymentRange), currentHashCode, thePaymentRange, (this.paymentRange!= null));
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
                    if (draftCopy instanceof BillInquiryResponse.Bills.Bill.BillData) {
                        final BillInquiryResponse.Bills.Bill.BillData copy = ((BillInquiryResponse.Bills.Bill.BillData) draftCopy);
                        {
                            Boolean billDueAmountsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billDueAmounts!= null));
                            if (billDueAmountsShouldBeCopiedAndSet == Boolean.TRUE) {
                                BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts sourceBillDueAmounts;
                                sourceBillDueAmounts = this.getBillDueAmounts();
                                BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts copyBillDueAmounts = ((BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts) strategy.copy(LocatorUtils.property(locator, "billDueAmounts", sourceBillDueAmounts), sourceBillDueAmounts, (this.billDueAmounts!= null)));
                                copy.setBillDueAmounts(copyBillDueAmounts);
                            } else {
                                if (billDueAmountsShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.billDueAmounts = null;
                                }
                            }
                        }
                        {
                            Boolean paymentRangeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.paymentRange!= null));
                            if (paymentRangeShouldBeCopiedAndSet == Boolean.TRUE) {
                                BillInquiryResponse.Bills.Bill.BillData.PaymentRange sourcePaymentRange;
                                sourcePaymentRange = this.getPaymentRange();
                                BillInquiryResponse.Bills.Bill.BillData.PaymentRange copyPaymentRange = ((BillInquiryResponse.Bills.Bill.BillData.PaymentRange) strategy.copy(LocatorUtils.property(locator, "paymentRange", sourcePaymentRange), sourcePaymentRange, (this.paymentRange!= null)));
                                copy.setPaymentRange(copyPaymentRange);
                            } else {
                                if (paymentRangeShouldBeCopiedAndSet == Boolean.FALSE) {
                                    copy.paymentRange = null;
                                }
                            }
                        }
                    }
                    return draftCopy;
                }

                public Object createNewInstance() {
                    return new BillInquiryResponse.Bills.Bill.BillData();
                }

                public void mergeFrom(Object left, Object right) {
                    final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                    mergeFrom(null, null, left, right, strategy);
                }

                public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                    if (right instanceof BillInquiryResponse.Bills.Bill.BillData) {
                        final BillInquiryResponse.Bills.Bill.BillData target = this;
                        final BillInquiryResponse.Bills.Bill.BillData leftObject = ((BillInquiryResponse.Bills.Bill.BillData) left);
                        final BillInquiryResponse.Bills.Bill.BillData rightObject = ((BillInquiryResponse.Bills.Bill.BillData) right);
                        {
                            Boolean billDueAmountsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.billDueAmounts!= null), (rightObject.billDueAmounts!= null));
                            if (billDueAmountsShouldBeMergedAndSet == Boolean.TRUE) {
                                BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts lhsBillDueAmounts;
                                lhsBillDueAmounts = leftObject.getBillDueAmounts();
                                BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts rhsBillDueAmounts;
                                rhsBillDueAmounts = rightObject.getBillDueAmounts();
                                BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts mergedBillDueAmounts = ((BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts) strategy.merge(LocatorUtils.property(leftLocator, "billDueAmounts", lhsBillDueAmounts), LocatorUtils.property(rightLocator, "billDueAmounts", rhsBillDueAmounts), lhsBillDueAmounts, rhsBillDueAmounts, (leftObject.billDueAmounts!= null), (rightObject.billDueAmounts!= null)));
                                target.setBillDueAmounts(mergedBillDueAmounts);
                            } else {
                                if (billDueAmountsShouldBeMergedAndSet == Boolean.FALSE) {
                                    target.billDueAmounts = null;
                                }
                            }
                        }
                        {
                            Boolean paymentRangeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.paymentRange!= null), (rightObject.paymentRange!= null));
                            if (paymentRangeShouldBeMergedAndSet == Boolean.TRUE) {
                                BillInquiryResponse.Bills.Bill.BillData.PaymentRange lhsPaymentRange;
                                lhsPaymentRange = leftObject.getPaymentRange();
                                BillInquiryResponse.Bills.Bill.BillData.PaymentRange rhsPaymentRange;
                                rhsPaymentRange = rightObject.getPaymentRange();
                                BillInquiryResponse.Bills.Bill.BillData.PaymentRange mergedPaymentRange = ((BillInquiryResponse.Bills.Bill.BillData.PaymentRange) strategy.merge(LocatorUtils.property(leftLocator, "paymentRange", lhsPaymentRange), LocatorUtils.property(rightLocator, "paymentRange", rhsPaymentRange), lhsPaymentRange, rhsPaymentRange, (leftObject.paymentRange!= null), (rightObject.paymentRange!= null)));
                                target.setPaymentRange(mergedPaymentRange);
                            } else {
                                if (paymentRangeShouldBeMergedAndSet == Boolean.FALSE) {
                                    target.paymentRange = null;
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
                 *         &lt;element name="BillDueAmt" maxOccurs="unbounded"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="BillDueAmtType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                 *                   &lt;element name="BillDueAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *                   &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
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
                    "billDueAmts"
                })
                public static class BillDueAmounts implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
                {

                    @XmlElement(name = "BillDueAmt", required = true)
                    protected List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> billDueAmts;

                    /**
                     * Gets the value of the billDueAmts property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the billDueAmts property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBillDueAmts().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt }
                     * 
                     * 
                     */
                    public List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> getBillDueAmts() {
                        if (billDueAmts == null) {
                            billDueAmts = new ArrayList<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt>();
                        }
                        return this.billDueAmts;
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
                            List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> theBillDueAmts;
                            theBillDueAmts = (((this.billDueAmts!= null)&&(!this.billDueAmts.isEmpty()))?this.getBillDueAmts():null);
                            strategy.appendField(locator, this, "billDueAmts", buffer, theBillDueAmts, ((this.billDueAmts!= null)&&(!this.billDueAmts.isEmpty())));
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
                        final BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts that = ((BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts) object);
                        {
                            List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> lhsBillDueAmts;
                            lhsBillDueAmts = (((this.billDueAmts!= null)&&(!this.billDueAmts.isEmpty()))?this.getBillDueAmts():null);
                            List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> rhsBillDueAmts;
                            rhsBillDueAmts = (((that.billDueAmts!= null)&&(!that.billDueAmts.isEmpty()))?that.getBillDueAmts():null);
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "billDueAmts", lhsBillDueAmts), LocatorUtils.property(thatLocator, "billDueAmts", rhsBillDueAmts), lhsBillDueAmts, rhsBillDueAmts, ((this.billDueAmts!= null)&&(!this.billDueAmts.isEmpty())), ((that.billDueAmts!= null)&&(!that.billDueAmts.isEmpty())))) {
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
                            List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> theBillDueAmts;
                            theBillDueAmts = (((this.billDueAmts!= null)&&(!this.billDueAmts.isEmpty()))?this.getBillDueAmts():null);
                            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billDueAmts", theBillDueAmts), currentHashCode, theBillDueAmts, ((this.billDueAmts!= null)&&(!this.billDueAmts.isEmpty())));
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
                        if (draftCopy instanceof BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts) {
                            final BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts copy = ((BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts) draftCopy);
                            {
                                Boolean billDueAmtsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.billDueAmts!= null)&&(!this.billDueAmts.isEmpty())));
                                if (billDueAmtsShouldBeCopiedAndSet == Boolean.TRUE) {
                                    List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> sourceBillDueAmts;
                                    sourceBillDueAmts = (((this.billDueAmts!= null)&&(!this.billDueAmts.isEmpty()))?this.getBillDueAmts():null);
                                    @SuppressWarnings("unchecked")
                                    List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> copyBillDueAmts = ((List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> ) strategy.copy(LocatorUtils.property(locator, "billDueAmts", sourceBillDueAmts), sourceBillDueAmts, ((this.billDueAmts!= null)&&(!this.billDueAmts.isEmpty()))));
                                    copy.billDueAmts = null;
                                    if (copyBillDueAmts!= null) {
                                        List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> uniqueBillDueAmtsl = copy.getBillDueAmts();
                                        uniqueBillDueAmtsl.addAll(copyBillDueAmts);
                                    }
                                } else {
                                    if (billDueAmtsShouldBeCopiedAndSet == Boolean.FALSE) {
                                        copy.billDueAmts = null;
                                    }
                                }
                            }
                        }
                        return draftCopy;
                    }

                    public Object createNewInstance() {
                        return new BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts();
                    }

                    public void mergeFrom(Object left, Object right) {
                        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                        mergeFrom(null, null, left, right, strategy);
                    }

                    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                        if (right instanceof BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts) {
                            final BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts target = this;
                            final BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts leftObject = ((BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts) left);
                            final BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts rightObject = ((BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts) right);
                            {
                                Boolean billDueAmtsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.billDueAmts!= null)&&(!leftObject.billDueAmts.isEmpty())), ((rightObject.billDueAmts!= null)&&(!rightObject.billDueAmts.isEmpty())));
                                if (billDueAmtsShouldBeMergedAndSet == Boolean.TRUE) {
                                    List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> lhsBillDueAmts;
                                    lhsBillDueAmts = (((leftObject.billDueAmts!= null)&&(!leftObject.billDueAmts.isEmpty()))?leftObject.getBillDueAmts():null);
                                    List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> rhsBillDueAmts;
                                    rhsBillDueAmts = (((rightObject.billDueAmts!= null)&&(!rightObject.billDueAmts.isEmpty()))?rightObject.getBillDueAmts():null);
                                    List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> mergedBillDueAmts = ((List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> ) strategy.merge(LocatorUtils.property(leftLocator, "billDueAmts", lhsBillDueAmts), LocatorUtils.property(rightLocator, "billDueAmts", rhsBillDueAmts), lhsBillDueAmts, rhsBillDueAmts, ((leftObject.billDueAmts!= null)&&(!leftObject.billDueAmts.isEmpty())), ((rightObject.billDueAmts!= null)&&(!rightObject.billDueAmts.isEmpty()))));
                                    target.billDueAmts = null;
                                    if (mergedBillDueAmts!= null) {
                                        List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> uniqueBillDueAmtsl = target.getBillDueAmts();
                                        uniqueBillDueAmtsl.addAll(mergedBillDueAmts);
                                    }
                                } else {
                                    if (billDueAmtsShouldBeMergedAndSet == Boolean.FALSE) {
                                        target.billDueAmts = null;
                                    }
                                }
                            }
                        }
                    }

                    public void setBillDueAmts(List<BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt> value) {
                        this.billDueAmts = value;
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
                     *         &lt;element name="BillDueAmtType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
                     *         &lt;element name="BillDueAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                     *         &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
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
                        "billDueAmtType",
                        "billDueAmt",
                        "currencyCode"
                    })
                    public static class BillDueAmt implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
                    {

                        @XmlElement(name = "BillDueAmtType")
                        protected String billDueAmtType;
                        @XmlElement(name = "BillDueAmt")
                        protected Double billDueAmt;
                        @XmlElement(name = "CurrencyCode")
                        @XmlSchemaType(name = "string")
                        protected EnumCurrencyCode currencyCode;

                        /**
                         * Gets the value of the billDueAmtType property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getBillDueAmtType() {
                            return billDueAmtType;
                        }

                        /**
                         * Sets the value of the billDueAmtType property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setBillDueAmtType(String value) {
                            this.billDueAmtType = value;
                        }

                        /**
                         * Gets the value of the billDueAmt property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Double }
                         *     
                         */
                        public Double getBillDueAmt() {
                            return billDueAmt;
                        }

                        /**
                         * Sets the value of the billDueAmt property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Double }
                         *     
                         */
                        public void setBillDueAmt(Double value) {
                            this.billDueAmt = value;
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
                                String theBillDueAmtType;
                                theBillDueAmtType = this.getBillDueAmtType();
                                strategy.appendField(locator, this, "billDueAmtType", buffer, theBillDueAmtType, (this.billDueAmtType!= null));
                            }
                            {
                                Double theBillDueAmt;
                                theBillDueAmt = this.getBillDueAmt();
                                strategy.appendField(locator, this, "billDueAmt", buffer, theBillDueAmt, (this.billDueAmt!= null));
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
                            final BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt that = ((BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt) object);
                            {
                                String lhsBillDueAmtType;
                                lhsBillDueAmtType = this.getBillDueAmtType();
                                String rhsBillDueAmtType;
                                rhsBillDueAmtType = that.getBillDueAmtType();
                                if (!strategy.equals(LocatorUtils.property(thisLocator, "billDueAmtType", lhsBillDueAmtType), LocatorUtils.property(thatLocator, "billDueAmtType", rhsBillDueAmtType), lhsBillDueAmtType, rhsBillDueAmtType, (this.billDueAmtType!= null), (that.billDueAmtType!= null))) {
                                    return false;
                                }
                            }
                            {
                                Double lhsBillDueAmt;
                                lhsBillDueAmt = this.getBillDueAmt();
                                Double rhsBillDueAmt;
                                rhsBillDueAmt = that.getBillDueAmt();
                                if (!strategy.equals(LocatorUtils.property(thisLocator, "billDueAmt", lhsBillDueAmt), LocatorUtils.property(thatLocator, "billDueAmt", rhsBillDueAmt), lhsBillDueAmt, rhsBillDueAmt, (this.billDueAmt!= null), (that.billDueAmt!= null))) {
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
                                String theBillDueAmtType;
                                theBillDueAmtType = this.getBillDueAmtType();
                                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billDueAmtType", theBillDueAmtType), currentHashCode, theBillDueAmtType, (this.billDueAmtType!= null));
                            }
                            {
                                Double theBillDueAmt;
                                theBillDueAmt = this.getBillDueAmt();
                                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billDueAmt", theBillDueAmt), currentHashCode, theBillDueAmt, (this.billDueAmt!= null));
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
                            if (draftCopy instanceof BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt) {
                                final BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt copy = ((BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt) draftCopy);
                                {
                                    Boolean billDueAmtTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billDueAmtType!= null));
                                    if (billDueAmtTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                                        String sourceBillDueAmtType;
                                        sourceBillDueAmtType = this.getBillDueAmtType();
                                        String copyBillDueAmtType = ((String) strategy.copy(LocatorUtils.property(locator, "billDueAmtType", sourceBillDueAmtType), sourceBillDueAmtType, (this.billDueAmtType!= null)));
                                        copy.setBillDueAmtType(copyBillDueAmtType);
                                    } else {
                                        if (billDueAmtTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                                            copy.billDueAmtType = null;
                                        }
                                    }
                                }
                                {
                                    Boolean billDueAmtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billDueAmt!= null));
                                    if (billDueAmtShouldBeCopiedAndSet == Boolean.TRUE) {
                                        Double sourceBillDueAmt;
                                        sourceBillDueAmt = this.getBillDueAmt();
                                        Double copyBillDueAmt = ((Double) strategy.copy(LocatorUtils.property(locator, "billDueAmt", sourceBillDueAmt), sourceBillDueAmt, (this.billDueAmt!= null)));
                                        copy.setBillDueAmt(copyBillDueAmt);
                                    } else {
                                        if (billDueAmtShouldBeCopiedAndSet == Boolean.FALSE) {
                                            copy.billDueAmt = null;
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
                            return new BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt();
                        }

                        public void mergeFrom(Object left, Object right) {
                            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                            mergeFrom(null, null, left, right, strategy);
                        }

                        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                            if (right instanceof BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt) {
                                final BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt target = this;
                                final BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt leftObject = ((BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt) left);
                                final BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt rightObject = ((BillInquiryResponse.Bills.Bill.BillData.BillDueAmounts.BillDueAmt) right);
                                {
                                    Boolean billDueAmtTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.billDueAmtType!= null), (rightObject.billDueAmtType!= null));
                                    if (billDueAmtTypeShouldBeMergedAndSet == Boolean.TRUE) {
                                        String lhsBillDueAmtType;
                                        lhsBillDueAmtType = leftObject.getBillDueAmtType();
                                        String rhsBillDueAmtType;
                                        rhsBillDueAmtType = rightObject.getBillDueAmtType();
                                        String mergedBillDueAmtType = ((String) strategy.merge(LocatorUtils.property(leftLocator, "billDueAmtType", lhsBillDueAmtType), LocatorUtils.property(rightLocator, "billDueAmtType", rhsBillDueAmtType), lhsBillDueAmtType, rhsBillDueAmtType, (leftObject.billDueAmtType!= null), (rightObject.billDueAmtType!= null)));
                                        target.setBillDueAmtType(mergedBillDueAmtType);
                                    } else {
                                        if (billDueAmtTypeShouldBeMergedAndSet == Boolean.FALSE) {
                                            target.billDueAmtType = null;
                                        }
                                    }
                                }
                                {
                                    Boolean billDueAmtShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.billDueAmt!= null), (rightObject.billDueAmt!= null));
                                    if (billDueAmtShouldBeMergedAndSet == Boolean.TRUE) {
                                        Double lhsBillDueAmt;
                                        lhsBillDueAmt = leftObject.getBillDueAmt();
                                        Double rhsBillDueAmt;
                                        rhsBillDueAmt = rightObject.getBillDueAmt();
                                        Double mergedBillDueAmt = ((Double) strategy.merge(LocatorUtils.property(leftLocator, "billDueAmt", lhsBillDueAmt), LocatorUtils.property(rightLocator, "billDueAmt", rhsBillDueAmt), lhsBillDueAmt, rhsBillDueAmt, (leftObject.billDueAmt!= null), (rightObject.billDueAmt!= null)));
                                        target.setBillDueAmt(mergedBillDueAmt);
                                    } else {
                                        if (billDueAmtShouldBeMergedAndSet == Boolean.FALSE) {
                                            target.billDueAmt = null;
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
                 *         &lt;element name="Lower" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="Upper" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
                 *         &lt;element name="CurrencyCode" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode" minOccurs="0"/&gt;
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
                    "lower",
                    "upper",
                    "currencyCode"
                })
                public static class PaymentRange implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
                {

                    @XmlElement(name = "Lower")
                    protected Double lower;
                    @XmlElement(name = "Upper")
                    protected Double upper;
                    @XmlElement(name = "CurrencyCode")
                    @XmlSchemaType(name = "string")
                    protected EnumCurrencyCode currencyCode;

                    /**
                     * Gets the value of the lower property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getLower() {
                        return lower;
                    }

                    /**
                     * Sets the value of the lower property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setLower(Double value) {
                        this.lower = value;
                    }

                    /**
                     * Gets the value of the upper property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Double }
                     *     
                     */
                    public Double getUpper() {
                        return upper;
                    }

                    /**
                     * Sets the value of the upper property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Double }
                     *     
                     */
                    public void setUpper(Double value) {
                        this.upper = value;
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
                            Double theLower;
                            theLower = this.getLower();
                            strategy.appendField(locator, this, "lower", buffer, theLower, (this.lower!= null));
                        }
                        {
                            Double theUpper;
                            theUpper = this.getUpper();
                            strategy.appendField(locator, this, "upper", buffer, theUpper, (this.upper!= null));
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
                        final BillInquiryResponse.Bills.Bill.BillData.PaymentRange that = ((BillInquiryResponse.Bills.Bill.BillData.PaymentRange) object);
                        {
                            Double lhsLower;
                            lhsLower = this.getLower();
                            Double rhsLower;
                            rhsLower = that.getLower();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "lower", lhsLower), LocatorUtils.property(thatLocator, "lower", rhsLower), lhsLower, rhsLower, (this.lower!= null), (that.lower!= null))) {
                                return false;
                            }
                        }
                        {
                            Double lhsUpper;
                            lhsUpper = this.getUpper();
                            Double rhsUpper;
                            rhsUpper = that.getUpper();
                            if (!strategy.equals(LocatorUtils.property(thisLocator, "upper", lhsUpper), LocatorUtils.property(thatLocator, "upper", rhsUpper), lhsUpper, rhsUpper, (this.upper!= null), (that.upper!= null))) {
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
                            Double theLower;
                            theLower = this.getLower();
                            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lower", theLower), currentHashCode, theLower, (this.lower!= null));
                        }
                        {
                            Double theUpper;
                            theUpper = this.getUpper();
                            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "upper", theUpper), currentHashCode, theUpper, (this.upper!= null));
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
                        if (draftCopy instanceof BillInquiryResponse.Bills.Bill.BillData.PaymentRange) {
                            final BillInquiryResponse.Bills.Bill.BillData.PaymentRange copy = ((BillInquiryResponse.Bills.Bill.BillData.PaymentRange) draftCopy);
                            {
                                Boolean lowerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lower!= null));
                                if (lowerShouldBeCopiedAndSet == Boolean.TRUE) {
                                    Double sourceLower;
                                    sourceLower = this.getLower();
                                    Double copyLower = ((Double) strategy.copy(LocatorUtils.property(locator, "lower", sourceLower), sourceLower, (this.lower!= null)));
                                    copy.setLower(copyLower);
                                } else {
                                    if (lowerShouldBeCopiedAndSet == Boolean.FALSE) {
                                        copy.lower = null;
                                    }
                                }
                            }
                            {
                                Boolean upperShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.upper!= null));
                                if (upperShouldBeCopiedAndSet == Boolean.TRUE) {
                                    Double sourceUpper;
                                    sourceUpper = this.getUpper();
                                    Double copyUpper = ((Double) strategy.copy(LocatorUtils.property(locator, "upper", sourceUpper), sourceUpper, (this.upper!= null)));
                                    copy.setUpper(copyUpper);
                                } else {
                                    if (upperShouldBeCopiedAndSet == Boolean.FALSE) {
                                        copy.upper = null;
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
                        return new BillInquiryResponse.Bills.Bill.BillData.PaymentRange();
                    }

                    public void mergeFrom(Object left, Object right) {
                        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                        mergeFrom(null, null, left, right, strategy);
                    }

                    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                        if (right instanceof BillInquiryResponse.Bills.Bill.BillData.PaymentRange) {
                            final BillInquiryResponse.Bills.Bill.BillData.PaymentRange target = this;
                            final BillInquiryResponse.Bills.Bill.BillData.PaymentRange leftObject = ((BillInquiryResponse.Bills.Bill.BillData.PaymentRange) left);
                            final BillInquiryResponse.Bills.Bill.BillData.PaymentRange rightObject = ((BillInquiryResponse.Bills.Bill.BillData.PaymentRange) right);
                            {
                                Boolean lowerShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.lower!= null), (rightObject.lower!= null));
                                if (lowerShouldBeMergedAndSet == Boolean.TRUE) {
                                    Double lhsLower;
                                    lhsLower = leftObject.getLower();
                                    Double rhsLower;
                                    rhsLower = rightObject.getLower();
                                    Double mergedLower = ((Double) strategy.merge(LocatorUtils.property(leftLocator, "lower", lhsLower), LocatorUtils.property(rightLocator, "lower", rhsLower), lhsLower, rhsLower, (leftObject.lower!= null), (rightObject.lower!= null)));
                                    target.setLower(mergedLower);
                                } else {
                                    if (lowerShouldBeMergedAndSet == Boolean.FALSE) {
                                        target.lower = null;
                                    }
                                }
                            }
                            {
                                Boolean upperShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.upper!= null), (rightObject.upper!= null));
                                if (upperShouldBeMergedAndSet == Boolean.TRUE) {
                                    Double lhsUpper;
                                    lhsUpper = leftObject.getUpper();
                                    Double rhsUpper;
                                    rhsUpper = rightObject.getUpper();
                                    Double mergedUpper = ((Double) strategy.merge(LocatorUtils.property(leftLocator, "upper", lhsUpper), LocatorUtils.property(rightLocator, "upper", rhsUpper), lhsUpper, rhsUpper, (leftObject.upper!= null), (rightObject.upper!= null)));
                                    target.setUpper(mergedUpper);
                                } else {
                                    if (upperShouldBeMergedAndSet == Boolean.FALSE) {
                                        target.upper = null;
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
     *         &lt;element name="attributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="attributeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "attributeName",
        "attributeValue"
    })
    public static class InquiryAttributes implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        protected String attributeName;
        protected String attributeValue;

        /**
         * Gets the value of the attributeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeName() {
            return attributeName;
        }

        /**
         * Sets the value of the attributeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeName(String value) {
            this.attributeName = value;
        }

        /**
         * Gets the value of the attributeValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeValue() {
            return attributeValue;
        }

        /**
         * Sets the value of the attributeValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeValue(String value) {
            this.attributeValue = value;
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
                String theAttributeName;
                theAttributeName = this.getAttributeName();
                strategy.appendField(locator, this, "attributeName", buffer, theAttributeName, (this.attributeName!= null));
            }
            {
                String theAttributeValue;
                theAttributeValue = this.getAttributeValue();
                strategy.appendField(locator, this, "attributeValue", buffer, theAttributeValue, (this.attributeValue!= null));
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
            final BillInquiryResponse.InquiryAttributes that = ((BillInquiryResponse.InquiryAttributes) object);
            {
                String lhsAttributeName;
                lhsAttributeName = this.getAttributeName();
                String rhsAttributeName;
                rhsAttributeName = that.getAttributeName();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "attributeName", lhsAttributeName), LocatorUtils.property(thatLocator, "attributeName", rhsAttributeName), lhsAttributeName, rhsAttributeName, (this.attributeName!= null), (that.attributeName!= null))) {
                    return false;
                }
            }
            {
                String lhsAttributeValue;
                lhsAttributeValue = this.getAttributeValue();
                String rhsAttributeValue;
                rhsAttributeValue = that.getAttributeValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "attributeValue", lhsAttributeValue), LocatorUtils.property(thatLocator, "attributeValue", rhsAttributeValue), lhsAttributeValue, rhsAttributeValue, (this.attributeValue!= null), (that.attributeValue!= null))) {
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
                String theAttributeName;
                theAttributeName = this.getAttributeName();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributeName", theAttributeName), currentHashCode, theAttributeName, (this.attributeName!= null));
            }
            {
                String theAttributeValue;
                theAttributeValue = this.getAttributeValue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributeValue", theAttributeValue), currentHashCode, theAttributeValue, (this.attributeValue!= null));
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
            if (draftCopy instanceof BillInquiryResponse.InquiryAttributes) {
                final BillInquiryResponse.InquiryAttributes copy = ((BillInquiryResponse.InquiryAttributes) draftCopy);
                {
                    Boolean attributeNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.attributeName!= null));
                    if (attributeNameShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceAttributeName;
                        sourceAttributeName = this.getAttributeName();
                        String copyAttributeName = ((String) strategy.copy(LocatorUtils.property(locator, "attributeName", sourceAttributeName), sourceAttributeName, (this.attributeName!= null)));
                        copy.setAttributeName(copyAttributeName);
                    } else {
                        if (attributeNameShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.attributeName = null;
                        }
                    }
                }
                {
                    Boolean attributeValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.attributeValue!= null));
                    if (attributeValueShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceAttributeValue;
                        sourceAttributeValue = this.getAttributeValue();
                        String copyAttributeValue = ((String) strategy.copy(LocatorUtils.property(locator, "attributeValue", sourceAttributeValue), sourceAttributeValue, (this.attributeValue!= null)));
                        copy.setAttributeValue(copyAttributeValue);
                    } else {
                        if (attributeValueShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.attributeValue = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new BillInquiryResponse.InquiryAttributes();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof BillInquiryResponse.InquiryAttributes) {
                final BillInquiryResponse.InquiryAttributes target = this;
                final BillInquiryResponse.InquiryAttributes leftObject = ((BillInquiryResponse.InquiryAttributes) left);
                final BillInquiryResponse.InquiryAttributes rightObject = ((BillInquiryResponse.InquiryAttributes) right);
                {
                    Boolean attributeNameShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.attributeName!= null), (rightObject.attributeName!= null));
                    if (attributeNameShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsAttributeName;
                        lhsAttributeName = leftObject.getAttributeName();
                        String rhsAttributeName;
                        rhsAttributeName = rightObject.getAttributeName();
                        String mergedAttributeName = ((String) strategy.merge(LocatorUtils.property(leftLocator, "attributeName", lhsAttributeName), LocatorUtils.property(rightLocator, "attributeName", rhsAttributeName), lhsAttributeName, rhsAttributeName, (leftObject.attributeName!= null), (rightObject.attributeName!= null)));
                        target.setAttributeName(mergedAttributeName);
                    } else {
                        if (attributeNameShouldBeMergedAndSet == Boolean.FALSE) {
                            target.attributeName = null;
                        }
                    }
                }
                {
                    Boolean attributeValueShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.attributeValue!= null), (rightObject.attributeValue!= null));
                    if (attributeValueShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsAttributeValue;
                        lhsAttributeValue = leftObject.getAttributeValue();
                        String rhsAttributeValue;
                        rhsAttributeValue = rightObject.getAttributeValue();
                        String mergedAttributeValue = ((String) strategy.merge(LocatorUtils.property(leftLocator, "attributeValue", lhsAttributeValue), LocatorUtils.property(rightLocator, "attributeValue", rhsAttributeValue), lhsAttributeValue, rhsAttributeValue, (leftObject.attributeValue!= null), (rightObject.attributeValue!= null)));
                        target.setAttributeValue(mergedAttributeValue);
                    } else {
                        if (attributeValueShouldBeMergedAndSet == Boolean.FALSE) {
                            target.attributeValue = null;
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
        protected List<BillInquiryResponse.Notifications.Notification> notifications;

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
         * {@link BillInquiryResponse.Notifications.Notification }
         * 
         * 
         */
        public List<BillInquiryResponse.Notifications.Notification> getNotifications() {
            if (notifications == null) {
                notifications = new ArrayList<BillInquiryResponse.Notifications.Notification>();
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
                List<BillInquiryResponse.Notifications.Notification> theNotifications;
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
            final BillInquiryResponse.Notifications that = ((BillInquiryResponse.Notifications) object);
            {
                List<BillInquiryResponse.Notifications.Notification> lhsNotifications;
                lhsNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                List<BillInquiryResponse.Notifications.Notification> rhsNotifications;
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
                List<BillInquiryResponse.Notifications.Notification> theNotifications;
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
            if (draftCopy instanceof BillInquiryResponse.Notifications) {
                final BillInquiryResponse.Notifications copy = ((BillInquiryResponse.Notifications) draftCopy);
                {
                    Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.notifications!= null)&&(!this.notifications.isEmpty())));
                    if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<BillInquiryResponse.Notifications.Notification> sourceNotifications;
                        sourceNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                        @SuppressWarnings("unchecked")
                        List<BillInquiryResponse.Notifications.Notification> copyNotifications = ((List<BillInquiryResponse.Notifications.Notification> ) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, ((this.notifications!= null)&&(!this.notifications.isEmpty()))));
                        copy.notifications = null;
                        if (copyNotifications!= null) {
                            List<BillInquiryResponse.Notifications.Notification> uniqueNotificationsl = copy.getNotifications();
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
            return new BillInquiryResponse.Notifications();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof BillInquiryResponse.Notifications) {
                final BillInquiryResponse.Notifications target = this;
                final BillInquiryResponse.Notifications leftObject = ((BillInquiryResponse.Notifications) left);
                final BillInquiryResponse.Notifications rightObject = ((BillInquiryResponse.Notifications) right);
                {
                    Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty())));
                    if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<BillInquiryResponse.Notifications.Notification> lhsNotifications;
                        lhsNotifications = (((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty()))?leftObject.getNotifications():null);
                        List<BillInquiryResponse.Notifications.Notification> rhsNotifications;
                        rhsNotifications = (((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))?rightObject.getNotifications():null);
                        List<BillInquiryResponse.Notifications.Notification> mergedNotifications = ((List<BillInquiryResponse.Notifications.Notification> ) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))));
                        target.notifications = null;
                        if (mergedNotifications!= null) {
                            List<BillInquiryResponse.Notifications.Notification> uniqueNotificationsl = target.getNotifications();
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

        public void setNotifications(List<BillInquiryResponse.Notifications.Notification> value) {
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
                final BillInquiryResponse.Notifications.Notification that = ((BillInquiryResponse.Notifications.Notification) object);
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
                if (draftCopy instanceof BillInquiryResponse.Notifications.Notification) {
                    final BillInquiryResponse.Notifications.Notification copy = ((BillInquiryResponse.Notifications.Notification) draftCopy);
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
                return new BillInquiryResponse.Notifications.Notification();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof BillInquiryResponse.Notifications.Notification) {
                    final BillInquiryResponse.Notifications.Notification target = this;
                    final BillInquiryResponse.Notifications.Notification leftObject = ((BillInquiryResponse.Notifications.Notification) left);
                    final BillInquiryResponse.Notifications.Notification rightObject = ((BillInquiryResponse.Notifications.Notification) right);
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

}
