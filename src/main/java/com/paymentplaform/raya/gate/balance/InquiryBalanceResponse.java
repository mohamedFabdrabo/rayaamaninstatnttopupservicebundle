
package com.paymentplaform.raya.gate.balance;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for Inquiry_Balance_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Inquiry_Balance_Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://raya.paymentplaform.com/gate}Status"/&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AsynchUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Balances" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DemandAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="OpenBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="AvailBalance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                   &lt;element name="OutStandingBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="DueBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExtraAttributes" maxOccurs="unbounded" minOccurs="0"&gt;
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
@XmlType(name = "Inquiry_Balance_Response", namespace = "http://raya.paymentplaform.com/gate/balance", propOrder = {
    "status",
    "rqUID",
    "asynchUID",
    "balances",
    "extraAttributes",
    "notifications",
    "any"
})
public class InquiryBalanceResponse implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsynchUID")
    protected String asynchUID;
    @XmlElement(name = "Balances")
    protected InquiryBalanceResponse.Balances balances;
    @XmlElement(name = "ExtraAttributes")
    protected List<InquiryBalanceResponse.ExtraAttributes> extraAttributes;
    @XmlElement(required = true)
    protected InquiryBalanceResponse.Notifications notifications;
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
     * Gets the value of the balances property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryBalanceResponse.Balances }
     *     
     */
    public InquiryBalanceResponse.Balances getBalances() {
        return balances;
    }

    /**
     * Sets the value of the balances property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryBalanceResponse.Balances }
     *     
     */
    public void setBalances(InquiryBalanceResponse.Balances value) {
        this.balances = value;
    }

    /**
     * Gets the value of the extraAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InquiryBalanceResponse.ExtraAttributes }
     * 
     * 
     */
    public List<InquiryBalanceResponse.ExtraAttributes> getExtraAttributes() {
        if (extraAttributes == null) {
            extraAttributes = new ArrayList<InquiryBalanceResponse.ExtraAttributes>();
        }
        return this.extraAttributes;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryBalanceResponse.Notifications }
     *     
     */
    public InquiryBalanceResponse.Notifications getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryBalanceResponse.Notifications }
     *     
     */
    public void setNotifications(InquiryBalanceResponse.Notifications value) {
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
            InquiryBalanceResponse.Balances theBalances;
            theBalances = this.getBalances();
            strategy.appendField(locator, this, "balances", buffer, theBalances, (this.balances!= null));
        }
        {
            List<InquiryBalanceResponse.ExtraAttributes> theExtraAttributes;
            theExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            strategy.appendField(locator, this, "extraAttributes", buffer, theExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
        }
        {
            InquiryBalanceResponse.Notifications theNotifications;
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
        final InquiryBalanceResponse that = ((InquiryBalanceResponse) object);
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
            InquiryBalanceResponse.Balances lhsBalances;
            lhsBalances = this.getBalances();
            InquiryBalanceResponse.Balances rhsBalances;
            rhsBalances = that.getBalances();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balances", lhsBalances), LocatorUtils.property(thatLocator, "balances", rhsBalances), lhsBalances, rhsBalances, (this.balances!= null), (that.balances!= null))) {
                return false;
            }
        }
        {
            List<InquiryBalanceResponse.ExtraAttributes> lhsExtraAttributes;
            lhsExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            List<InquiryBalanceResponse.ExtraAttributes> rhsExtraAttributes;
            rhsExtraAttributes = (((that.extraAttributes!= null)&&(!that.extraAttributes.isEmpty()))?that.getExtraAttributes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(thatLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())), ((that.extraAttributes!= null)&&(!that.extraAttributes.isEmpty())))) {
                return false;
            }
        }
        {
            InquiryBalanceResponse.Notifications lhsNotifications;
            lhsNotifications = this.getNotifications();
            InquiryBalanceResponse.Notifications rhsNotifications;
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
            InquiryBalanceResponse.Balances theBalances;
            theBalances = this.getBalances();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "balances", theBalances), currentHashCode, theBalances, (this.balances!= null));
        }
        {
            List<InquiryBalanceResponse.ExtraAttributes> theExtraAttributes;
            theExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extraAttributes", theExtraAttributes), currentHashCode, theExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
        }
        {
            InquiryBalanceResponse.Notifications theNotifications;
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
        if (draftCopy instanceof InquiryBalanceResponse) {
            final InquiryBalanceResponse copy = ((InquiryBalanceResponse) draftCopy);
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
                Boolean balancesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balances!= null));
                if (balancesShouldBeCopiedAndSet == Boolean.TRUE) {
                    InquiryBalanceResponse.Balances sourceBalances;
                    sourceBalances = this.getBalances();
                    InquiryBalanceResponse.Balances copyBalances = ((InquiryBalanceResponse.Balances) strategy.copy(LocatorUtils.property(locator, "balances", sourceBalances), sourceBalances, (this.balances!= null)));
                    copy.setBalances(copyBalances);
                } else {
                    if (balancesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.balances = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<InquiryBalanceResponse.ExtraAttributes> sourceExtraAttributes;
                    sourceExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
                    @SuppressWarnings("unchecked")
                    List<InquiryBalanceResponse.ExtraAttributes> copyExtraAttributes = ((List<InquiryBalanceResponse.ExtraAttributes> ) strategy.copy(LocatorUtils.property(locator, "extraAttributes", sourceExtraAttributes), sourceExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))));
                    copy.extraAttributes = null;
                    if (copyExtraAttributes!= null) {
                        List<InquiryBalanceResponse.ExtraAttributes> uniqueExtraAttributesl = copy.getExtraAttributes();
                        uniqueExtraAttributesl.addAll(copyExtraAttributes);
                    }
                } else {
                    if (extraAttributesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.extraAttributes = null;
                    }
                }
            }
            {
                Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.notifications!= null));
                if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                    InquiryBalanceResponse.Notifications sourceNotifications;
                    sourceNotifications = this.getNotifications();
                    InquiryBalanceResponse.Notifications copyNotifications = ((InquiryBalanceResponse.Notifications) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, (this.notifications!= null)));
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
        return new InquiryBalanceResponse();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof InquiryBalanceResponse) {
            final InquiryBalanceResponse target = this;
            final InquiryBalanceResponse leftObject = ((InquiryBalanceResponse) left);
            final InquiryBalanceResponse rightObject = ((InquiryBalanceResponse) right);
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
                Boolean balancesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.balances!= null), (rightObject.balances!= null));
                if (balancesShouldBeMergedAndSet == Boolean.TRUE) {
                    InquiryBalanceResponse.Balances lhsBalances;
                    lhsBalances = leftObject.getBalances();
                    InquiryBalanceResponse.Balances rhsBalances;
                    rhsBalances = rightObject.getBalances();
                    InquiryBalanceResponse.Balances mergedBalances = ((InquiryBalanceResponse.Balances) strategy.merge(LocatorUtils.property(leftLocator, "balances", lhsBalances), LocatorUtils.property(rightLocator, "balances", rhsBalances), lhsBalances, rhsBalances, (leftObject.balances!= null), (rightObject.balances!= null)));
                    target.setBalances(mergedBalances);
                } else {
                    if (balancesShouldBeMergedAndSet == Boolean.FALSE) {
                        target.balances = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeMergedAndSet == Boolean.TRUE) {
                    List<InquiryBalanceResponse.ExtraAttributes> lhsExtraAttributes;
                    lhsExtraAttributes = (((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty()))?leftObject.getExtraAttributes():null);
                    List<InquiryBalanceResponse.ExtraAttributes> rhsExtraAttributes;
                    rhsExtraAttributes = (((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))?rightObject.getExtraAttributes():null);
                    List<InquiryBalanceResponse.ExtraAttributes> mergedExtraAttributes = ((List<InquiryBalanceResponse.ExtraAttributes> ) strategy.merge(LocatorUtils.property(leftLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(rightLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))));
                    target.extraAttributes = null;
                    if (mergedExtraAttributes!= null) {
                        List<InquiryBalanceResponse.ExtraAttributes> uniqueExtraAttributesl = target.getExtraAttributes();
                        uniqueExtraAttributesl.addAll(mergedExtraAttributes);
                    }
                } else {
                    if (extraAttributesShouldBeMergedAndSet == Boolean.FALSE) {
                        target.extraAttributes = null;
                    }
                }
            }
            {
                Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.notifications!= null), (rightObject.notifications!= null));
                if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                    InquiryBalanceResponse.Notifications lhsNotifications;
                    lhsNotifications = leftObject.getNotifications();
                    InquiryBalanceResponse.Notifications rhsNotifications;
                    rhsNotifications = rightObject.getNotifications();
                    InquiryBalanceResponse.Notifications mergedNotifications = ((InquiryBalanceResponse.Notifications) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, (leftObject.notifications!= null), (rightObject.notifications!= null)));
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

    public void setExtraAttributes(List<InquiryBalanceResponse.ExtraAttributes> value) {
        this.extraAttributes = value;
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
     *         &lt;element name="DemandAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="OpenBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="AvailBalance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *         &lt;element name="OutStandingBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="DueBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
        "demandAccountNo",
        "openBalance",
        "availBalance",
        "outStandingBalance",
        "dueBalance"
    })
    public static class Balances implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "DemandAccountNo")
        protected String demandAccountNo;
        @XmlElement(name = "OpenBalance")
        protected Double openBalance;
        @XmlElement(name = "AvailBalance")
        protected double availBalance;
        @XmlElement(name = "OutStandingBalance")
        protected Double outStandingBalance;
        @XmlElement(name = "DueBalance")
        protected Double dueBalance;

        /**
         * Gets the value of the demandAccountNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDemandAccountNo() {
            return demandAccountNo;
        }

        /**
         * Sets the value of the demandAccountNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDemandAccountNo(String value) {
            this.demandAccountNo = value;
        }

        /**
         * Gets the value of the openBalance property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getOpenBalance() {
            return openBalance;
        }

        /**
         * Sets the value of the openBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setOpenBalance(Double value) {
            this.openBalance = value;
        }

        /**
         * Gets the value of the availBalance property.
         * 
         */
        public double getAvailBalance() {
            return availBalance;
        }

        /**
         * Sets the value of the availBalance property.
         * 
         */
        public void setAvailBalance(double value) {
            this.availBalance = value;
        }

        /**
         * Gets the value of the outStandingBalance property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getOutStandingBalance() {
            return outStandingBalance;
        }

        /**
         * Sets the value of the outStandingBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setOutStandingBalance(Double value) {
            this.outStandingBalance = value;
        }

        /**
         * Gets the value of the dueBalance property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getDueBalance() {
            return dueBalance;
        }

        /**
         * Sets the value of the dueBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setDueBalance(Double value) {
            this.dueBalance = value;
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
                String theDemandAccountNo;
                theDemandAccountNo = this.getDemandAccountNo();
                strategy.appendField(locator, this, "demandAccountNo", buffer, theDemandAccountNo, (this.demandAccountNo!= null));
            }
            {
                Double theOpenBalance;
                theOpenBalance = this.getOpenBalance();
                strategy.appendField(locator, this, "openBalance", buffer, theOpenBalance, (this.openBalance!= null));
            }
            {
                double theAvailBalance;
                theAvailBalance = this.getAvailBalance();
                strategy.appendField(locator, this, "availBalance", buffer, theAvailBalance, true);
            }
            {
                Double theOutStandingBalance;
                theOutStandingBalance = this.getOutStandingBalance();
                strategy.appendField(locator, this, "outStandingBalance", buffer, theOutStandingBalance, (this.outStandingBalance!= null));
            }
            {
                Double theDueBalance;
                theDueBalance = this.getDueBalance();
                strategy.appendField(locator, this, "dueBalance", buffer, theDueBalance, (this.dueBalance!= null));
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
            final InquiryBalanceResponse.Balances that = ((InquiryBalanceResponse.Balances) object);
            {
                String lhsDemandAccountNo;
                lhsDemandAccountNo = this.getDemandAccountNo();
                String rhsDemandAccountNo;
                rhsDemandAccountNo = that.getDemandAccountNo();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "demandAccountNo", lhsDemandAccountNo), LocatorUtils.property(thatLocator, "demandAccountNo", rhsDemandAccountNo), lhsDemandAccountNo, rhsDemandAccountNo, (this.demandAccountNo!= null), (that.demandAccountNo!= null))) {
                    return false;
                }
            }
            {
                Double lhsOpenBalance;
                lhsOpenBalance = this.getOpenBalance();
                Double rhsOpenBalance;
                rhsOpenBalance = that.getOpenBalance();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "openBalance", lhsOpenBalance), LocatorUtils.property(thatLocator, "openBalance", rhsOpenBalance), lhsOpenBalance, rhsOpenBalance, (this.openBalance!= null), (that.openBalance!= null))) {
                    return false;
                }
            }
            {
                double lhsAvailBalance;
                lhsAvailBalance = this.getAvailBalance();
                double rhsAvailBalance;
                rhsAvailBalance = that.getAvailBalance();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "availBalance", lhsAvailBalance), LocatorUtils.property(thatLocator, "availBalance", rhsAvailBalance), lhsAvailBalance, rhsAvailBalance, true, true)) {
                    return false;
                }
            }
            {
                Double lhsOutStandingBalance;
                lhsOutStandingBalance = this.getOutStandingBalance();
                Double rhsOutStandingBalance;
                rhsOutStandingBalance = that.getOutStandingBalance();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "outStandingBalance", lhsOutStandingBalance), LocatorUtils.property(thatLocator, "outStandingBalance", rhsOutStandingBalance), lhsOutStandingBalance, rhsOutStandingBalance, (this.outStandingBalance!= null), (that.outStandingBalance!= null))) {
                    return false;
                }
            }
            {
                Double lhsDueBalance;
                lhsDueBalance = this.getDueBalance();
                Double rhsDueBalance;
                rhsDueBalance = that.getDueBalance();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "dueBalance", lhsDueBalance), LocatorUtils.property(thatLocator, "dueBalance", rhsDueBalance), lhsDueBalance, rhsDueBalance, (this.dueBalance!= null), (that.dueBalance!= null))) {
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
                String theDemandAccountNo;
                theDemandAccountNo = this.getDemandAccountNo();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "demandAccountNo", theDemandAccountNo), currentHashCode, theDemandAccountNo, (this.demandAccountNo!= null));
            }
            {
                Double theOpenBalance;
                theOpenBalance = this.getOpenBalance();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "openBalance", theOpenBalance), currentHashCode, theOpenBalance, (this.openBalance!= null));
            }
            {
                double theAvailBalance;
                theAvailBalance = this.getAvailBalance();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "availBalance", theAvailBalance), currentHashCode, theAvailBalance, true);
            }
            {
                Double theOutStandingBalance;
                theOutStandingBalance = this.getOutStandingBalance();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "outStandingBalance", theOutStandingBalance), currentHashCode, theOutStandingBalance, (this.outStandingBalance!= null));
            }
            {
                Double theDueBalance;
                theDueBalance = this.getDueBalance();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dueBalance", theDueBalance), currentHashCode, theDueBalance, (this.dueBalance!= null));
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
            if (draftCopy instanceof InquiryBalanceResponse.Balances) {
                final InquiryBalanceResponse.Balances copy = ((InquiryBalanceResponse.Balances) draftCopy);
                {
                    Boolean demandAccountNoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.demandAccountNo!= null));
                    if (demandAccountNoShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceDemandAccountNo;
                        sourceDemandAccountNo = this.getDemandAccountNo();
                        String copyDemandAccountNo = ((String) strategy.copy(LocatorUtils.property(locator, "demandAccountNo", sourceDemandAccountNo), sourceDemandAccountNo, (this.demandAccountNo!= null)));
                        copy.setDemandAccountNo(copyDemandAccountNo);
                    } else {
                        if (demandAccountNoShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.demandAccountNo = null;
                        }
                    }
                }
                {
                    Boolean openBalanceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.openBalance!= null));
                    if (openBalanceShouldBeCopiedAndSet == Boolean.TRUE) {
                        Double sourceOpenBalance;
                        sourceOpenBalance = this.getOpenBalance();
                        Double copyOpenBalance = ((Double) strategy.copy(LocatorUtils.property(locator, "openBalance", sourceOpenBalance), sourceOpenBalance, (this.openBalance!= null)));
                        copy.setOpenBalance(copyOpenBalance);
                    } else {
                        if (openBalanceShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.openBalance = null;
                        }
                    }
                }
                {
                    Boolean availBalanceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                    if (availBalanceShouldBeCopiedAndSet == Boolean.TRUE) {
                        double sourceAvailBalance;
                        sourceAvailBalance = this.getAvailBalance();
                        double copyAvailBalance = strategy.copy(LocatorUtils.property(locator, "availBalance", sourceAvailBalance), sourceAvailBalance, true);
                        copy.setAvailBalance(copyAvailBalance);
                    } else {
                        if (availBalanceShouldBeCopiedAndSet == Boolean.FALSE) {
                        }
                    }
                }
                {
                    Boolean outStandingBalanceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.outStandingBalance!= null));
                    if (outStandingBalanceShouldBeCopiedAndSet == Boolean.TRUE) {
                        Double sourceOutStandingBalance;
                        sourceOutStandingBalance = this.getOutStandingBalance();
                        Double copyOutStandingBalance = ((Double) strategy.copy(LocatorUtils.property(locator, "outStandingBalance", sourceOutStandingBalance), sourceOutStandingBalance, (this.outStandingBalance!= null)));
                        copy.setOutStandingBalance(copyOutStandingBalance);
                    } else {
                        if (outStandingBalanceShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.outStandingBalance = null;
                        }
                    }
                }
                {
                    Boolean dueBalanceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dueBalance!= null));
                    if (dueBalanceShouldBeCopiedAndSet == Boolean.TRUE) {
                        Double sourceDueBalance;
                        sourceDueBalance = this.getDueBalance();
                        Double copyDueBalance = ((Double) strategy.copy(LocatorUtils.property(locator, "dueBalance", sourceDueBalance), sourceDueBalance, (this.dueBalance!= null)));
                        copy.setDueBalance(copyDueBalance);
                    } else {
                        if (dueBalanceShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.dueBalance = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new InquiryBalanceResponse.Balances();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InquiryBalanceResponse.Balances) {
                final InquiryBalanceResponse.Balances target = this;
                final InquiryBalanceResponse.Balances leftObject = ((InquiryBalanceResponse.Balances) left);
                final InquiryBalanceResponse.Balances rightObject = ((InquiryBalanceResponse.Balances) right);
                {
                    Boolean demandAccountNoShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.demandAccountNo!= null), (rightObject.demandAccountNo!= null));
                    if (demandAccountNoShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsDemandAccountNo;
                        lhsDemandAccountNo = leftObject.getDemandAccountNo();
                        String rhsDemandAccountNo;
                        rhsDemandAccountNo = rightObject.getDemandAccountNo();
                        String mergedDemandAccountNo = ((String) strategy.merge(LocatorUtils.property(leftLocator, "demandAccountNo", lhsDemandAccountNo), LocatorUtils.property(rightLocator, "demandAccountNo", rhsDemandAccountNo), lhsDemandAccountNo, rhsDemandAccountNo, (leftObject.demandAccountNo!= null), (rightObject.demandAccountNo!= null)));
                        target.setDemandAccountNo(mergedDemandAccountNo);
                    } else {
                        if (demandAccountNoShouldBeMergedAndSet == Boolean.FALSE) {
                            target.demandAccountNo = null;
                        }
                    }
                }
                {
                    Boolean openBalanceShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.openBalance!= null), (rightObject.openBalance!= null));
                    if (openBalanceShouldBeMergedAndSet == Boolean.TRUE) {
                        Double lhsOpenBalance;
                        lhsOpenBalance = leftObject.getOpenBalance();
                        Double rhsOpenBalance;
                        rhsOpenBalance = rightObject.getOpenBalance();
                        Double mergedOpenBalance = ((Double) strategy.merge(LocatorUtils.property(leftLocator, "openBalance", lhsOpenBalance), LocatorUtils.property(rightLocator, "openBalance", rhsOpenBalance), lhsOpenBalance, rhsOpenBalance, (leftObject.openBalance!= null), (rightObject.openBalance!= null)));
                        target.setOpenBalance(mergedOpenBalance);
                    } else {
                        if (openBalanceShouldBeMergedAndSet == Boolean.FALSE) {
                            target.openBalance = null;
                        }
                    }
                }
                {
                    Boolean availBalanceShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, true, true);
                    if (availBalanceShouldBeMergedAndSet == Boolean.TRUE) {
                        double lhsAvailBalance;
                        lhsAvailBalance = leftObject.getAvailBalance();
                        double rhsAvailBalance;
                        rhsAvailBalance = rightObject.getAvailBalance();
                        double mergedAvailBalance = ((double) strategy.merge(LocatorUtils.property(leftLocator, "availBalance", lhsAvailBalance), LocatorUtils.property(rightLocator, "availBalance", rhsAvailBalance), lhsAvailBalance, rhsAvailBalance, true, true));
                        target.setAvailBalance(mergedAvailBalance);
                    } else {
                        if (availBalanceShouldBeMergedAndSet == Boolean.FALSE) {
                        }
                    }
                }
                {
                    Boolean outStandingBalanceShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.outStandingBalance!= null), (rightObject.outStandingBalance!= null));
                    if (outStandingBalanceShouldBeMergedAndSet == Boolean.TRUE) {
                        Double lhsOutStandingBalance;
                        lhsOutStandingBalance = leftObject.getOutStandingBalance();
                        Double rhsOutStandingBalance;
                        rhsOutStandingBalance = rightObject.getOutStandingBalance();
                        Double mergedOutStandingBalance = ((Double) strategy.merge(LocatorUtils.property(leftLocator, "outStandingBalance", lhsOutStandingBalance), LocatorUtils.property(rightLocator, "outStandingBalance", rhsOutStandingBalance), lhsOutStandingBalance, rhsOutStandingBalance, (leftObject.outStandingBalance!= null), (rightObject.outStandingBalance!= null)));
                        target.setOutStandingBalance(mergedOutStandingBalance);
                    } else {
                        if (outStandingBalanceShouldBeMergedAndSet == Boolean.FALSE) {
                            target.outStandingBalance = null;
                        }
                    }
                }
                {
                    Boolean dueBalanceShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.dueBalance!= null), (rightObject.dueBalance!= null));
                    if (dueBalanceShouldBeMergedAndSet == Boolean.TRUE) {
                        Double lhsDueBalance;
                        lhsDueBalance = leftObject.getDueBalance();
                        Double rhsDueBalance;
                        rhsDueBalance = rightObject.getDueBalance();
                        Double mergedDueBalance = ((Double) strategy.merge(LocatorUtils.property(leftLocator, "dueBalance", lhsDueBalance), LocatorUtils.property(rightLocator, "dueBalance", rhsDueBalance), lhsDueBalance, rhsDueBalance, (leftObject.dueBalance!= null), (rightObject.dueBalance!= null)));
                        target.setDueBalance(mergedDueBalance);
                    } else {
                        if (dueBalanceShouldBeMergedAndSet == Boolean.FALSE) {
                            target.dueBalance = null;
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
    public static class ExtraAttributes implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
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
            final InquiryBalanceResponse.ExtraAttributes that = ((InquiryBalanceResponse.ExtraAttributes) object);
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
            if (draftCopy instanceof InquiryBalanceResponse.ExtraAttributes) {
                final InquiryBalanceResponse.ExtraAttributes copy = ((InquiryBalanceResponse.ExtraAttributes) draftCopy);
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
            return new InquiryBalanceResponse.ExtraAttributes();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InquiryBalanceResponse.ExtraAttributes) {
                final InquiryBalanceResponse.ExtraAttributes target = this;
                final InquiryBalanceResponse.ExtraAttributes leftObject = ((InquiryBalanceResponse.ExtraAttributes) left);
                final InquiryBalanceResponse.ExtraAttributes rightObject = ((InquiryBalanceResponse.ExtraAttributes) right);
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
        protected List<InquiryBalanceResponse.Notifications.Notification> notifications;

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
         * {@link InquiryBalanceResponse.Notifications.Notification }
         * 
         * 
         */
        public List<InquiryBalanceResponse.Notifications.Notification> getNotifications() {
            if (notifications == null) {
                notifications = new ArrayList<InquiryBalanceResponse.Notifications.Notification>();
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
                List<InquiryBalanceResponse.Notifications.Notification> theNotifications;
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
            final InquiryBalanceResponse.Notifications that = ((InquiryBalanceResponse.Notifications) object);
            {
                List<InquiryBalanceResponse.Notifications.Notification> lhsNotifications;
                lhsNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                List<InquiryBalanceResponse.Notifications.Notification> rhsNotifications;
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
                List<InquiryBalanceResponse.Notifications.Notification> theNotifications;
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
            if (draftCopy instanceof InquiryBalanceResponse.Notifications) {
                final InquiryBalanceResponse.Notifications copy = ((InquiryBalanceResponse.Notifications) draftCopy);
                {
                    Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.notifications!= null)&&(!this.notifications.isEmpty())));
                    if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<InquiryBalanceResponse.Notifications.Notification> sourceNotifications;
                        sourceNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                        @SuppressWarnings("unchecked")
                        List<InquiryBalanceResponse.Notifications.Notification> copyNotifications = ((List<InquiryBalanceResponse.Notifications.Notification> ) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, ((this.notifications!= null)&&(!this.notifications.isEmpty()))));
                        copy.notifications = null;
                        if (copyNotifications!= null) {
                            List<InquiryBalanceResponse.Notifications.Notification> uniqueNotificationsl = copy.getNotifications();
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
            return new InquiryBalanceResponse.Notifications();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InquiryBalanceResponse.Notifications) {
                final InquiryBalanceResponse.Notifications target = this;
                final InquiryBalanceResponse.Notifications leftObject = ((InquiryBalanceResponse.Notifications) left);
                final InquiryBalanceResponse.Notifications rightObject = ((InquiryBalanceResponse.Notifications) right);
                {
                    Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty())));
                    if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<InquiryBalanceResponse.Notifications.Notification> lhsNotifications;
                        lhsNotifications = (((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty()))?leftObject.getNotifications():null);
                        List<InquiryBalanceResponse.Notifications.Notification> rhsNotifications;
                        rhsNotifications = (((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))?rightObject.getNotifications():null);
                        List<InquiryBalanceResponse.Notifications.Notification> mergedNotifications = ((List<InquiryBalanceResponse.Notifications.Notification> ) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))));
                        target.notifications = null;
                        if (mergedNotifications!= null) {
                            List<InquiryBalanceResponse.Notifications.Notification> uniqueNotificationsl = target.getNotifications();
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

        public void setNotifications(List<InquiryBalanceResponse.Notifications.Notification> value) {
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
                final InquiryBalanceResponse.Notifications.Notification that = ((InquiryBalanceResponse.Notifications.Notification) object);
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
                if (draftCopy instanceof InquiryBalanceResponse.Notifications.Notification) {
                    final InquiryBalanceResponse.Notifications.Notification copy = ((InquiryBalanceResponse.Notifications.Notification) draftCopy);
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
                return new InquiryBalanceResponse.Notifications.Notification();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof InquiryBalanceResponse.Notifications.Notification) {
                    final InquiryBalanceResponse.Notifications.Notification target = this;
                    final InquiryBalanceResponse.Notifications.Notification leftObject = ((InquiryBalanceResponse.Notifications.Notification) left);
                    final InquiryBalanceResponse.Notifications.Notification rightObject = ((InquiryBalanceResponse.Notifications.Notification) right);
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
