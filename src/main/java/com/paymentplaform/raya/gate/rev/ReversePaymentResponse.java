
package com.paymentplaform.raya.gate.rev;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for Reverse_Payment_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reverse_Payment_Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://raya.paymentplaform.com/gate}Status"/&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AsynchUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Reverse_Payment_Response", namespace = "http://raya.paymentplaform.com/gate/rev", propOrder = {
    "status",
    "rqUID",
    "asynchUID",
    "serviceCode",
    "trxnType",
    "trxnIds",
    "notifications",
    "any"
})
public class ReversePaymentResponse implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsynchUID")
    protected String asynchUID;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "TrxnType", required = true)
    @XmlSchemaType(name = "string")
    protected EnumTransType trxnType;
    @XmlElement(name = "TrxnIds", required = true)
    protected ReversePaymentResponse.TrxnIds trxnIds;
    @XmlElement(required = true)
    protected ReversePaymentResponse.Notifications notifications;
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
     *     {@link ReversePaymentResponse.TrxnIds }
     *     
     */
    public ReversePaymentResponse.TrxnIds getTrxnIds() {
        return trxnIds;
    }

    /**
     * Sets the value of the trxnIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversePaymentResponse.TrxnIds }
     *     
     */
    public void setTrxnIds(ReversePaymentResponse.TrxnIds value) {
        this.trxnIds = value;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link ReversePaymentResponse.Notifications }
     *     
     */
    public ReversePaymentResponse.Notifications getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversePaymentResponse.Notifications }
     *     
     */
    public void setNotifications(ReversePaymentResponse.Notifications value) {
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
            EnumTransType theTrxnType;
            theTrxnType = this.getTrxnType();
            strategy.appendField(locator, this, "trxnType", buffer, theTrxnType, (this.trxnType!= null));
        }
        {
            ReversePaymentResponse.TrxnIds theTrxnIds;
            theTrxnIds = this.getTrxnIds();
            strategy.appendField(locator, this, "trxnIds", buffer, theTrxnIds, (this.trxnIds!= null));
        }
        {
            ReversePaymentResponse.Notifications theNotifications;
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
        final ReversePaymentResponse that = ((ReversePaymentResponse) object);
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
            EnumTransType lhsTrxnType;
            lhsTrxnType = this.getTrxnType();
            EnumTransType rhsTrxnType;
            rhsTrxnType = that.getTrxnType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnType", lhsTrxnType), LocatorUtils.property(thatLocator, "trxnType", rhsTrxnType), lhsTrxnType, rhsTrxnType, (this.trxnType!= null), (that.trxnType!= null))) {
                return false;
            }
        }
        {
            ReversePaymentResponse.TrxnIds lhsTrxnIds;
            lhsTrxnIds = this.getTrxnIds();
            ReversePaymentResponse.TrxnIds rhsTrxnIds;
            rhsTrxnIds = that.getTrxnIds();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnIds", lhsTrxnIds), LocatorUtils.property(thatLocator, "trxnIds", rhsTrxnIds), lhsTrxnIds, rhsTrxnIds, (this.trxnIds!= null), (that.trxnIds!= null))) {
                return false;
            }
        }
        {
            ReversePaymentResponse.Notifications lhsNotifications;
            lhsNotifications = this.getNotifications();
            ReversePaymentResponse.Notifications rhsNotifications;
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
            EnumTransType theTrxnType;
            theTrxnType = this.getTrxnType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnType", theTrxnType), currentHashCode, theTrxnType, (this.trxnType!= null));
        }
        {
            ReversePaymentResponse.TrxnIds theTrxnIds;
            theTrxnIds = this.getTrxnIds();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnIds", theTrxnIds), currentHashCode, theTrxnIds, (this.trxnIds!= null));
        }
        {
            ReversePaymentResponse.Notifications theNotifications;
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
        if (draftCopy instanceof ReversePaymentResponse) {
            final ReversePaymentResponse copy = ((ReversePaymentResponse) draftCopy);
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
                    ReversePaymentResponse.TrxnIds sourceTrxnIds;
                    sourceTrxnIds = this.getTrxnIds();
                    ReversePaymentResponse.TrxnIds copyTrxnIds = ((ReversePaymentResponse.TrxnIds) strategy.copy(LocatorUtils.property(locator, "trxnIds", sourceTrxnIds), sourceTrxnIds, (this.trxnIds!= null)));
                    copy.setTrxnIds(copyTrxnIds);
                } else {
                    if (trxnIdsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trxnIds = null;
                    }
                }
            }
            {
                Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.notifications!= null));
                if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReversePaymentResponse.Notifications sourceNotifications;
                    sourceNotifications = this.getNotifications();
                    ReversePaymentResponse.Notifications copyNotifications = ((ReversePaymentResponse.Notifications) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, (this.notifications!= null)));
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
        return new ReversePaymentResponse();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ReversePaymentResponse) {
            final ReversePaymentResponse target = this;
            final ReversePaymentResponse leftObject = ((ReversePaymentResponse) left);
            final ReversePaymentResponse rightObject = ((ReversePaymentResponse) right);
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
                    ReversePaymentResponse.TrxnIds lhsTrxnIds;
                    lhsTrxnIds = leftObject.getTrxnIds();
                    ReversePaymentResponse.TrxnIds rhsTrxnIds;
                    rhsTrxnIds = rightObject.getTrxnIds();
                    ReversePaymentResponse.TrxnIds mergedTrxnIds = ((ReversePaymentResponse.TrxnIds) strategy.merge(LocatorUtils.property(leftLocator, "trxnIds", lhsTrxnIds), LocatorUtils.property(rightLocator, "trxnIds", rhsTrxnIds), lhsTrxnIds, rhsTrxnIds, (leftObject.trxnIds!= null), (rightObject.trxnIds!= null)));
                    target.setTrxnIds(mergedTrxnIds);
                } else {
                    if (trxnIdsShouldBeMergedAndSet == Boolean.FALSE) {
                        target.trxnIds = null;
                    }
                }
            }
            {
                Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.notifications!= null), (rightObject.notifications!= null));
                if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                    ReversePaymentResponse.Notifications lhsNotifications;
                    lhsNotifications = leftObject.getNotifications();
                    ReversePaymentResponse.Notifications rhsNotifications;
                    rhsNotifications = rightObject.getNotifications();
                    ReversePaymentResponse.Notifications mergedNotifications = ((ReversePaymentResponse.Notifications) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, (leftObject.notifications!= null), (rightObject.notifications!= null)));
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
        protected List<ReversePaymentResponse.Notifications.Notification> notifications;

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
         * {@link ReversePaymentResponse.Notifications.Notification }
         * 
         * 
         */
        public List<ReversePaymentResponse.Notifications.Notification> getNotifications() {
            if (notifications == null) {
                notifications = new ArrayList<ReversePaymentResponse.Notifications.Notification>();
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
                List<ReversePaymentResponse.Notifications.Notification> theNotifications;
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
            final ReversePaymentResponse.Notifications that = ((ReversePaymentResponse.Notifications) object);
            {
                List<ReversePaymentResponse.Notifications.Notification> lhsNotifications;
                lhsNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                List<ReversePaymentResponse.Notifications.Notification> rhsNotifications;
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
                List<ReversePaymentResponse.Notifications.Notification> theNotifications;
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
            if (draftCopy instanceof ReversePaymentResponse.Notifications) {
                final ReversePaymentResponse.Notifications copy = ((ReversePaymentResponse.Notifications) draftCopy);
                {
                    Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.notifications!= null)&&(!this.notifications.isEmpty())));
                    if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ReversePaymentResponse.Notifications.Notification> sourceNotifications;
                        sourceNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                        @SuppressWarnings("unchecked")
                        List<ReversePaymentResponse.Notifications.Notification> copyNotifications = ((List<ReversePaymentResponse.Notifications.Notification> ) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, ((this.notifications!= null)&&(!this.notifications.isEmpty()))));
                        copy.notifications = null;
                        if (copyNotifications!= null) {
                            List<ReversePaymentResponse.Notifications.Notification> uniqueNotificationsl = copy.getNotifications();
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
            return new ReversePaymentResponse.Notifications();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ReversePaymentResponse.Notifications) {
                final ReversePaymentResponse.Notifications target = this;
                final ReversePaymentResponse.Notifications leftObject = ((ReversePaymentResponse.Notifications) left);
                final ReversePaymentResponse.Notifications rightObject = ((ReversePaymentResponse.Notifications) right);
                {
                    Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty())));
                    if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<ReversePaymentResponse.Notifications.Notification> lhsNotifications;
                        lhsNotifications = (((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty()))?leftObject.getNotifications():null);
                        List<ReversePaymentResponse.Notifications.Notification> rhsNotifications;
                        rhsNotifications = (((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))?rightObject.getNotifications():null);
                        List<ReversePaymentResponse.Notifications.Notification> mergedNotifications = ((List<ReversePaymentResponse.Notifications.Notification> ) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))));
                        target.notifications = null;
                        if (mergedNotifications!= null) {
                            List<ReversePaymentResponse.Notifications.Notification> uniqueNotificationsl = target.getNotifications();
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

        public void setNotifications(List<ReversePaymentResponse.Notifications.Notification> value) {
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
                final ReversePaymentResponse.Notifications.Notification that = ((ReversePaymentResponse.Notifications.Notification) object);
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
                if (draftCopy instanceof ReversePaymentResponse.Notifications.Notification) {
                    final ReversePaymentResponse.Notifications.Notification copy = ((ReversePaymentResponse.Notifications.Notification) draftCopy);
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
                return new ReversePaymentResponse.Notifications.Notification();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ReversePaymentResponse.Notifications.Notification) {
                    final ReversePaymentResponse.Notifications.Notification target = this;
                    final ReversePaymentResponse.Notifications.Notification leftObject = ((ReversePaymentResponse.Notifications.Notification) left);
                    final ReversePaymentResponse.Notifications.Notification rightObject = ((ReversePaymentResponse.Notifications.Notification) right);
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
        protected List<ReversePaymentResponse.TrxnIds.TrxnId> trxnIds;

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
         * {@link ReversePaymentResponse.TrxnIds.TrxnId }
         * 
         * 
         */
        public List<ReversePaymentResponse.TrxnIds.TrxnId> getTrxnIds() {
            if (trxnIds == null) {
                trxnIds = new ArrayList<ReversePaymentResponse.TrxnIds.TrxnId>();
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
                List<ReversePaymentResponse.TrxnIds.TrxnId> theTrxnIds;
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
            final ReversePaymentResponse.TrxnIds that = ((ReversePaymentResponse.TrxnIds) object);
            {
                List<ReversePaymentResponse.TrxnIds.TrxnId> lhsTrxnIds;
                lhsTrxnIds = (((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))?this.getTrxnIds():null);
                List<ReversePaymentResponse.TrxnIds.TrxnId> rhsTrxnIds;
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
                List<ReversePaymentResponse.TrxnIds.TrxnId> theTrxnIds;
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
            if (draftCopy instanceof ReversePaymentResponse.TrxnIds) {
                final ReversePaymentResponse.TrxnIds copy = ((ReversePaymentResponse.TrxnIds) draftCopy);
                {
                    Boolean trxnIdsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.trxnIds!= null)&&(!this.trxnIds.isEmpty())));
                    if (trxnIdsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ReversePaymentResponse.TrxnIds.TrxnId> sourceTrxnIds;
                        sourceTrxnIds = (((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))?this.getTrxnIds():null);
                        @SuppressWarnings("unchecked")
                        List<ReversePaymentResponse.TrxnIds.TrxnId> copyTrxnIds = ((List<ReversePaymentResponse.TrxnIds.TrxnId> ) strategy.copy(LocatorUtils.property(locator, "trxnIds", sourceTrxnIds), sourceTrxnIds, ((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))));
                        copy.trxnIds = null;
                        if (copyTrxnIds!= null) {
                            List<ReversePaymentResponse.TrxnIds.TrxnId> uniqueTrxnIdsl = copy.getTrxnIds();
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
            return new ReversePaymentResponse.TrxnIds();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ReversePaymentResponse.TrxnIds) {
                final ReversePaymentResponse.TrxnIds target = this;
                final ReversePaymentResponse.TrxnIds leftObject = ((ReversePaymentResponse.TrxnIds) left);
                final ReversePaymentResponse.TrxnIds rightObject = ((ReversePaymentResponse.TrxnIds) right);
                {
                    Boolean trxnIdsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.trxnIds!= null)&&(!leftObject.trxnIds.isEmpty())), ((rightObject.trxnIds!= null)&&(!rightObject.trxnIds.isEmpty())));
                    if (trxnIdsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<ReversePaymentResponse.TrxnIds.TrxnId> lhsTrxnIds;
                        lhsTrxnIds = (((leftObject.trxnIds!= null)&&(!leftObject.trxnIds.isEmpty()))?leftObject.getTrxnIds():null);
                        List<ReversePaymentResponse.TrxnIds.TrxnId> rhsTrxnIds;
                        rhsTrxnIds = (((rightObject.trxnIds!= null)&&(!rightObject.trxnIds.isEmpty()))?rightObject.getTrxnIds():null);
                        List<ReversePaymentResponse.TrxnIds.TrxnId> mergedTrxnIds = ((List<ReversePaymentResponse.TrxnIds.TrxnId> ) strategy.merge(LocatorUtils.property(leftLocator, "trxnIds", lhsTrxnIds), LocatorUtils.property(rightLocator, "trxnIds", rhsTrxnIds), lhsTrxnIds, rhsTrxnIds, ((leftObject.trxnIds!= null)&&(!leftObject.trxnIds.isEmpty())), ((rightObject.trxnIds!= null)&&(!rightObject.trxnIds.isEmpty()))));
                        target.trxnIds = null;
                        if (mergedTrxnIds!= null) {
                            List<ReversePaymentResponse.TrxnIds.TrxnId> uniqueTrxnIdsl = target.getTrxnIds();
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

        public void setTrxnIds(List<ReversePaymentResponse.TrxnIds.TrxnId> value) {
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
                final ReversePaymentResponse.TrxnIds.TrxnId that = ((ReversePaymentResponse.TrxnIds.TrxnId) object);
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
                if (draftCopy instanceof ReversePaymentResponse.TrxnIds.TrxnId) {
                    final ReversePaymentResponse.TrxnIds.TrxnId copy = ((ReversePaymentResponse.TrxnIds.TrxnId) draftCopy);
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
                return new ReversePaymentResponse.TrxnIds.TrxnId();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ReversePaymentResponse.TrxnIds.TrxnId) {
                    final ReversePaymentResponse.TrxnIds.TrxnId target = this;
                    final ReversePaymentResponse.TrxnIds.TrxnId leftObject = ((ReversePaymentResponse.TrxnIds.TrxnId) left);
                    final ReversePaymentResponse.TrxnIds.TrxnId rightObject = ((ReversePaymentResponse.TrxnIds.TrxnId) right);
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

}
