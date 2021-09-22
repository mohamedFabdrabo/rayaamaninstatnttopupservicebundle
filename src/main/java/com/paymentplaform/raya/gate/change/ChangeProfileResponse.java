
package com.paymentplaform.raya.gate.change;

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
 * <p>Java class for Change_profile_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_profile_Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://raya.paymentplaform.com/gate}Status"/&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AsynchUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrxnsId" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TrxnId" maxOccurs="unbounded" minOccurs="0"&gt;
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
 *         &lt;element name="ProfileUpdates"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ProfileUpdate" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DemandAccount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ProfileElement" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "Change_profile_Response", namespace = "http://raya.paymentplaform.com/gate/change", propOrder = {
    "status",
    "rqUID",
    "asynchUID",
    "trxnsId",
    "profileUpdates",
    "extraAttributes",
    "notifications",
    "any"
})
public class ChangeProfileResponse implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsynchUID")
    protected String asynchUID;
    @XmlElement(name = "TrxnsId")
    protected ChangeProfileResponse.TrxnsId trxnsId;
    @XmlElement(name = "ProfileUpdates", required = true)
    protected ChangeProfileResponse.ProfileUpdates profileUpdates;
    @XmlElement(name = "ExtraAttributes")
    protected List<ChangeProfileResponse.ExtraAttributes> extraAttributes;
    @XmlElement(required = true)
    protected ChangeProfileResponse.Notifications notifications;
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
     * Gets the value of the trxnsId property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeProfileResponse.TrxnsId }
     *     
     */
    public ChangeProfileResponse.TrxnsId getTrxnsId() {
        return trxnsId;
    }

    /**
     * Sets the value of the trxnsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeProfileResponse.TrxnsId }
     *     
     */
    public void setTrxnsId(ChangeProfileResponse.TrxnsId value) {
        this.trxnsId = value;
    }

    /**
     * Gets the value of the profileUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeProfileResponse.ProfileUpdates }
     *     
     */
    public ChangeProfileResponse.ProfileUpdates getProfileUpdates() {
        return profileUpdates;
    }

    /**
     * Sets the value of the profileUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeProfileResponse.ProfileUpdates }
     *     
     */
    public void setProfileUpdates(ChangeProfileResponse.ProfileUpdates value) {
        this.profileUpdates = value;
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
     * {@link ChangeProfileResponse.ExtraAttributes }
     * 
     * 
     */
    public List<ChangeProfileResponse.ExtraAttributes> getExtraAttributes() {
        if (extraAttributes == null) {
            extraAttributes = new ArrayList<ChangeProfileResponse.ExtraAttributes>();
        }
        return this.extraAttributes;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeProfileResponse.Notifications }
     *     
     */
    public ChangeProfileResponse.Notifications getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeProfileResponse.Notifications }
     *     
     */
    public void setNotifications(ChangeProfileResponse.Notifications value) {
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
            ChangeProfileResponse.TrxnsId theTrxnsId;
            theTrxnsId = this.getTrxnsId();
            strategy.appendField(locator, this, "trxnsId", buffer, theTrxnsId, (this.trxnsId!= null));
        }
        {
            ChangeProfileResponse.ProfileUpdates theProfileUpdates;
            theProfileUpdates = this.getProfileUpdates();
            strategy.appendField(locator, this, "profileUpdates", buffer, theProfileUpdates, (this.profileUpdates!= null));
        }
        {
            List<ChangeProfileResponse.ExtraAttributes> theExtraAttributes;
            theExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            strategy.appendField(locator, this, "extraAttributes", buffer, theExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
        }
        {
            ChangeProfileResponse.Notifications theNotifications;
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
        final ChangeProfileResponse that = ((ChangeProfileResponse) object);
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
            ChangeProfileResponse.TrxnsId lhsTrxnsId;
            lhsTrxnsId = this.getTrxnsId();
            ChangeProfileResponse.TrxnsId rhsTrxnsId;
            rhsTrxnsId = that.getTrxnsId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnsId", lhsTrxnsId), LocatorUtils.property(thatLocator, "trxnsId", rhsTrxnsId), lhsTrxnsId, rhsTrxnsId, (this.trxnsId!= null), (that.trxnsId!= null))) {
                return false;
            }
        }
        {
            ChangeProfileResponse.ProfileUpdates lhsProfileUpdates;
            lhsProfileUpdates = this.getProfileUpdates();
            ChangeProfileResponse.ProfileUpdates rhsProfileUpdates;
            rhsProfileUpdates = that.getProfileUpdates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "profileUpdates", lhsProfileUpdates), LocatorUtils.property(thatLocator, "profileUpdates", rhsProfileUpdates), lhsProfileUpdates, rhsProfileUpdates, (this.profileUpdates!= null), (that.profileUpdates!= null))) {
                return false;
            }
        }
        {
            List<ChangeProfileResponse.ExtraAttributes> lhsExtraAttributes;
            lhsExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            List<ChangeProfileResponse.ExtraAttributes> rhsExtraAttributes;
            rhsExtraAttributes = (((that.extraAttributes!= null)&&(!that.extraAttributes.isEmpty()))?that.getExtraAttributes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(thatLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())), ((that.extraAttributes!= null)&&(!that.extraAttributes.isEmpty())))) {
                return false;
            }
        }
        {
            ChangeProfileResponse.Notifications lhsNotifications;
            lhsNotifications = this.getNotifications();
            ChangeProfileResponse.Notifications rhsNotifications;
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
            ChangeProfileResponse.TrxnsId theTrxnsId;
            theTrxnsId = this.getTrxnsId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnsId", theTrxnsId), currentHashCode, theTrxnsId, (this.trxnsId!= null));
        }
        {
            ChangeProfileResponse.ProfileUpdates theProfileUpdates;
            theProfileUpdates = this.getProfileUpdates();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "profileUpdates", theProfileUpdates), currentHashCode, theProfileUpdates, (this.profileUpdates!= null));
        }
        {
            List<ChangeProfileResponse.ExtraAttributes> theExtraAttributes;
            theExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extraAttributes", theExtraAttributes), currentHashCode, theExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
        }
        {
            ChangeProfileResponse.Notifications theNotifications;
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
        if (draftCopy instanceof ChangeProfileResponse) {
            final ChangeProfileResponse copy = ((ChangeProfileResponse) draftCopy);
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
                Boolean trxnsIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnsId!= null));
                if (trxnsIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    ChangeProfileResponse.TrxnsId sourceTrxnsId;
                    sourceTrxnsId = this.getTrxnsId();
                    ChangeProfileResponse.TrxnsId copyTrxnsId = ((ChangeProfileResponse.TrxnsId) strategy.copy(LocatorUtils.property(locator, "trxnsId", sourceTrxnsId), sourceTrxnsId, (this.trxnsId!= null)));
                    copy.setTrxnsId(copyTrxnsId);
                } else {
                    if (trxnsIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trxnsId = null;
                    }
                }
            }
            {
                Boolean profileUpdatesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.profileUpdates!= null));
                if (profileUpdatesShouldBeCopiedAndSet == Boolean.TRUE) {
                    ChangeProfileResponse.ProfileUpdates sourceProfileUpdates;
                    sourceProfileUpdates = this.getProfileUpdates();
                    ChangeProfileResponse.ProfileUpdates copyProfileUpdates = ((ChangeProfileResponse.ProfileUpdates) strategy.copy(LocatorUtils.property(locator, "profileUpdates", sourceProfileUpdates), sourceProfileUpdates, (this.profileUpdates!= null)));
                    copy.setProfileUpdates(copyProfileUpdates);
                } else {
                    if (profileUpdatesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.profileUpdates = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ChangeProfileResponse.ExtraAttributes> sourceExtraAttributes;
                    sourceExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
                    @SuppressWarnings("unchecked")
                    List<ChangeProfileResponse.ExtraAttributes> copyExtraAttributes = ((List<ChangeProfileResponse.ExtraAttributes> ) strategy.copy(LocatorUtils.property(locator, "extraAttributes", sourceExtraAttributes), sourceExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))));
                    copy.extraAttributes = null;
                    if (copyExtraAttributes!= null) {
                        List<ChangeProfileResponse.ExtraAttributes> uniqueExtraAttributesl = copy.getExtraAttributes();
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
                    ChangeProfileResponse.Notifications sourceNotifications;
                    sourceNotifications = this.getNotifications();
                    ChangeProfileResponse.Notifications copyNotifications = ((ChangeProfileResponse.Notifications) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, (this.notifications!= null)));
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
        return new ChangeProfileResponse();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ChangeProfileResponse) {
            final ChangeProfileResponse target = this;
            final ChangeProfileResponse leftObject = ((ChangeProfileResponse) left);
            final ChangeProfileResponse rightObject = ((ChangeProfileResponse) right);
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
                Boolean trxnsIdShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnsId!= null), (rightObject.trxnsId!= null));
                if (trxnsIdShouldBeMergedAndSet == Boolean.TRUE) {
                    ChangeProfileResponse.TrxnsId lhsTrxnsId;
                    lhsTrxnsId = leftObject.getTrxnsId();
                    ChangeProfileResponse.TrxnsId rhsTrxnsId;
                    rhsTrxnsId = rightObject.getTrxnsId();
                    ChangeProfileResponse.TrxnsId mergedTrxnsId = ((ChangeProfileResponse.TrxnsId) strategy.merge(LocatorUtils.property(leftLocator, "trxnsId", lhsTrxnsId), LocatorUtils.property(rightLocator, "trxnsId", rhsTrxnsId), lhsTrxnsId, rhsTrxnsId, (leftObject.trxnsId!= null), (rightObject.trxnsId!= null)));
                    target.setTrxnsId(mergedTrxnsId);
                } else {
                    if (trxnsIdShouldBeMergedAndSet == Boolean.FALSE) {
                        target.trxnsId = null;
                    }
                }
            }
            {
                Boolean profileUpdatesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.profileUpdates!= null), (rightObject.profileUpdates!= null));
                if (profileUpdatesShouldBeMergedAndSet == Boolean.TRUE) {
                    ChangeProfileResponse.ProfileUpdates lhsProfileUpdates;
                    lhsProfileUpdates = leftObject.getProfileUpdates();
                    ChangeProfileResponse.ProfileUpdates rhsProfileUpdates;
                    rhsProfileUpdates = rightObject.getProfileUpdates();
                    ChangeProfileResponse.ProfileUpdates mergedProfileUpdates = ((ChangeProfileResponse.ProfileUpdates) strategy.merge(LocatorUtils.property(leftLocator, "profileUpdates", lhsProfileUpdates), LocatorUtils.property(rightLocator, "profileUpdates", rhsProfileUpdates), lhsProfileUpdates, rhsProfileUpdates, (leftObject.profileUpdates!= null), (rightObject.profileUpdates!= null)));
                    target.setProfileUpdates(mergedProfileUpdates);
                } else {
                    if (profileUpdatesShouldBeMergedAndSet == Boolean.FALSE) {
                        target.profileUpdates = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeMergedAndSet == Boolean.TRUE) {
                    List<ChangeProfileResponse.ExtraAttributes> lhsExtraAttributes;
                    lhsExtraAttributes = (((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty()))?leftObject.getExtraAttributes():null);
                    List<ChangeProfileResponse.ExtraAttributes> rhsExtraAttributes;
                    rhsExtraAttributes = (((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))?rightObject.getExtraAttributes():null);
                    List<ChangeProfileResponse.ExtraAttributes> mergedExtraAttributes = ((List<ChangeProfileResponse.ExtraAttributes> ) strategy.merge(LocatorUtils.property(leftLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(rightLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))));
                    target.extraAttributes = null;
                    if (mergedExtraAttributes!= null) {
                        List<ChangeProfileResponse.ExtraAttributes> uniqueExtraAttributesl = target.getExtraAttributes();
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
                    ChangeProfileResponse.Notifications lhsNotifications;
                    lhsNotifications = leftObject.getNotifications();
                    ChangeProfileResponse.Notifications rhsNotifications;
                    rhsNotifications = rightObject.getNotifications();
                    ChangeProfileResponse.Notifications mergedNotifications = ((ChangeProfileResponse.Notifications) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, (leftObject.notifications!= null), (rightObject.notifications!= null)));
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

    public void setExtraAttributes(List<ChangeProfileResponse.ExtraAttributes> value) {
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
            final ChangeProfileResponse.ExtraAttributes that = ((ChangeProfileResponse.ExtraAttributes) object);
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
            if (draftCopy instanceof ChangeProfileResponse.ExtraAttributes) {
                final ChangeProfileResponse.ExtraAttributes copy = ((ChangeProfileResponse.ExtraAttributes) draftCopy);
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
            return new ChangeProfileResponse.ExtraAttributes();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ChangeProfileResponse.ExtraAttributes) {
                final ChangeProfileResponse.ExtraAttributes target = this;
                final ChangeProfileResponse.ExtraAttributes leftObject = ((ChangeProfileResponse.ExtraAttributes) left);
                final ChangeProfileResponse.ExtraAttributes rightObject = ((ChangeProfileResponse.ExtraAttributes) right);
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
        protected List<ChangeProfileResponse.Notifications.Notification> notifications;

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
         * {@link ChangeProfileResponse.Notifications.Notification }
         * 
         * 
         */
        public List<ChangeProfileResponse.Notifications.Notification> getNotifications() {
            if (notifications == null) {
                notifications = new ArrayList<ChangeProfileResponse.Notifications.Notification>();
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
                List<ChangeProfileResponse.Notifications.Notification> theNotifications;
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
            final ChangeProfileResponse.Notifications that = ((ChangeProfileResponse.Notifications) object);
            {
                List<ChangeProfileResponse.Notifications.Notification> lhsNotifications;
                lhsNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                List<ChangeProfileResponse.Notifications.Notification> rhsNotifications;
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
                List<ChangeProfileResponse.Notifications.Notification> theNotifications;
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
            if (draftCopy instanceof ChangeProfileResponse.Notifications) {
                final ChangeProfileResponse.Notifications copy = ((ChangeProfileResponse.Notifications) draftCopy);
                {
                    Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.notifications!= null)&&(!this.notifications.isEmpty())));
                    if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ChangeProfileResponse.Notifications.Notification> sourceNotifications;
                        sourceNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                        @SuppressWarnings("unchecked")
                        List<ChangeProfileResponse.Notifications.Notification> copyNotifications = ((List<ChangeProfileResponse.Notifications.Notification> ) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, ((this.notifications!= null)&&(!this.notifications.isEmpty()))));
                        copy.notifications = null;
                        if (copyNotifications!= null) {
                            List<ChangeProfileResponse.Notifications.Notification> uniqueNotificationsl = copy.getNotifications();
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
            return new ChangeProfileResponse.Notifications();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ChangeProfileResponse.Notifications) {
                final ChangeProfileResponse.Notifications target = this;
                final ChangeProfileResponse.Notifications leftObject = ((ChangeProfileResponse.Notifications) left);
                final ChangeProfileResponse.Notifications rightObject = ((ChangeProfileResponse.Notifications) right);
                {
                    Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty())));
                    if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<ChangeProfileResponse.Notifications.Notification> lhsNotifications;
                        lhsNotifications = (((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty()))?leftObject.getNotifications():null);
                        List<ChangeProfileResponse.Notifications.Notification> rhsNotifications;
                        rhsNotifications = (((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))?rightObject.getNotifications():null);
                        List<ChangeProfileResponse.Notifications.Notification> mergedNotifications = ((List<ChangeProfileResponse.Notifications.Notification> ) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))));
                        target.notifications = null;
                        if (mergedNotifications!= null) {
                            List<ChangeProfileResponse.Notifications.Notification> uniqueNotificationsl = target.getNotifications();
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

        public void setNotifications(List<ChangeProfileResponse.Notifications.Notification> value) {
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
                final ChangeProfileResponse.Notifications.Notification that = ((ChangeProfileResponse.Notifications.Notification) object);
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
                if (draftCopy instanceof ChangeProfileResponse.Notifications.Notification) {
                    final ChangeProfileResponse.Notifications.Notification copy = ((ChangeProfileResponse.Notifications.Notification) draftCopy);
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
                return new ChangeProfileResponse.Notifications.Notification();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ChangeProfileResponse.Notifications.Notification) {
                    final ChangeProfileResponse.Notifications.Notification target = this;
                    final ChangeProfileResponse.Notifications.Notification leftObject = ((ChangeProfileResponse.Notifications.Notification) left);
                    final ChangeProfileResponse.Notifications.Notification rightObject = ((ChangeProfileResponse.Notifications.Notification) right);
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
     *         &lt;element name="ProfileUpdate" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DemandAccount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ProfileElement" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "profileUpdates"
    })
    public static class ProfileUpdates implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "ProfileUpdate", required = true)
        protected List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> profileUpdates;

        /**
         * Gets the value of the profileUpdates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the profileUpdates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProfileUpdates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ChangeProfileResponse.ProfileUpdates.ProfileUpdate }
         * 
         * 
         */
        public List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> getProfileUpdates() {
            if (profileUpdates == null) {
                profileUpdates = new ArrayList<ChangeProfileResponse.ProfileUpdates.ProfileUpdate>();
            }
            return this.profileUpdates;
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
                List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> theProfileUpdates;
                theProfileUpdates = (((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty()))?this.getProfileUpdates():null);
                strategy.appendField(locator, this, "profileUpdates", buffer, theProfileUpdates, ((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty())));
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
            final ChangeProfileResponse.ProfileUpdates that = ((ChangeProfileResponse.ProfileUpdates) object);
            {
                List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> lhsProfileUpdates;
                lhsProfileUpdates = (((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty()))?this.getProfileUpdates():null);
                List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> rhsProfileUpdates;
                rhsProfileUpdates = (((that.profileUpdates!= null)&&(!that.profileUpdates.isEmpty()))?that.getProfileUpdates():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "profileUpdates", lhsProfileUpdates), LocatorUtils.property(thatLocator, "profileUpdates", rhsProfileUpdates), lhsProfileUpdates, rhsProfileUpdates, ((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty())), ((that.profileUpdates!= null)&&(!that.profileUpdates.isEmpty())))) {
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
                List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> theProfileUpdates;
                theProfileUpdates = (((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty()))?this.getProfileUpdates():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "profileUpdates", theProfileUpdates), currentHashCode, theProfileUpdates, ((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty())));
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
            if (draftCopy instanceof ChangeProfileResponse.ProfileUpdates) {
                final ChangeProfileResponse.ProfileUpdates copy = ((ChangeProfileResponse.ProfileUpdates) draftCopy);
                {
                    Boolean profileUpdatesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty())));
                    if (profileUpdatesShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> sourceProfileUpdates;
                        sourceProfileUpdates = (((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty()))?this.getProfileUpdates():null);
                        @SuppressWarnings("unchecked")
                        List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> copyProfileUpdates = ((List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> ) strategy.copy(LocatorUtils.property(locator, "profileUpdates", sourceProfileUpdates), sourceProfileUpdates, ((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty()))));
                        copy.profileUpdates = null;
                        if (copyProfileUpdates!= null) {
                            List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> uniqueProfileUpdatesl = copy.getProfileUpdates();
                            uniqueProfileUpdatesl.addAll(copyProfileUpdates);
                        }
                    } else {
                        if (profileUpdatesShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.profileUpdates = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ChangeProfileResponse.ProfileUpdates();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ChangeProfileResponse.ProfileUpdates) {
                final ChangeProfileResponse.ProfileUpdates target = this;
                final ChangeProfileResponse.ProfileUpdates leftObject = ((ChangeProfileResponse.ProfileUpdates) left);
                final ChangeProfileResponse.ProfileUpdates rightObject = ((ChangeProfileResponse.ProfileUpdates) right);
                {
                    Boolean profileUpdatesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.profileUpdates!= null)&&(!leftObject.profileUpdates.isEmpty())), ((rightObject.profileUpdates!= null)&&(!rightObject.profileUpdates.isEmpty())));
                    if (profileUpdatesShouldBeMergedAndSet == Boolean.TRUE) {
                        List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> lhsProfileUpdates;
                        lhsProfileUpdates = (((leftObject.profileUpdates!= null)&&(!leftObject.profileUpdates.isEmpty()))?leftObject.getProfileUpdates():null);
                        List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> rhsProfileUpdates;
                        rhsProfileUpdates = (((rightObject.profileUpdates!= null)&&(!rightObject.profileUpdates.isEmpty()))?rightObject.getProfileUpdates():null);
                        List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> mergedProfileUpdates = ((List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> ) strategy.merge(LocatorUtils.property(leftLocator, "profileUpdates", lhsProfileUpdates), LocatorUtils.property(rightLocator, "profileUpdates", rhsProfileUpdates), lhsProfileUpdates, rhsProfileUpdates, ((leftObject.profileUpdates!= null)&&(!leftObject.profileUpdates.isEmpty())), ((rightObject.profileUpdates!= null)&&(!rightObject.profileUpdates.isEmpty()))));
                        target.profileUpdates = null;
                        if (mergedProfileUpdates!= null) {
                            List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> uniqueProfileUpdatesl = target.getProfileUpdates();
                            uniqueProfileUpdatesl.addAll(mergedProfileUpdates);
                        }
                    } else {
                        if (profileUpdatesShouldBeMergedAndSet == Boolean.FALSE) {
                            target.profileUpdates = null;
                        }
                    }
                }
            }
        }

        public void setProfileUpdates(List<ChangeProfileResponse.ProfileUpdates.ProfileUpdate> value) {
            this.profileUpdates = value;
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
         *         &lt;element name="DemandAccount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ProfileElement" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "demandAccount",
            "profileElement"
        })
        public static class ProfileUpdate implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            @XmlElement(name = "DemandAccount", required = true)
            protected String demandAccount;
            @XmlElement(name = "ProfileElement", required = true)
            protected String profileElement;

            /**
             * Gets the value of the demandAccount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDemandAccount() {
                return demandAccount;
            }

            /**
             * Sets the value of the demandAccount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDemandAccount(String value) {
                this.demandAccount = value;
            }

            /**
             * Gets the value of the profileElement property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfileElement() {
                return profileElement;
            }

            /**
             * Sets the value of the profileElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfileElement(String value) {
                this.profileElement = value;
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
                    String theDemandAccount;
                    theDemandAccount = this.getDemandAccount();
                    strategy.appendField(locator, this, "demandAccount", buffer, theDemandAccount, (this.demandAccount!= null));
                }
                {
                    String theProfileElement;
                    theProfileElement = this.getProfileElement();
                    strategy.appendField(locator, this, "profileElement", buffer, theProfileElement, (this.profileElement!= null));
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
                final ChangeProfileResponse.ProfileUpdates.ProfileUpdate that = ((ChangeProfileResponse.ProfileUpdates.ProfileUpdate) object);
                {
                    String lhsDemandAccount;
                    lhsDemandAccount = this.getDemandAccount();
                    String rhsDemandAccount;
                    rhsDemandAccount = that.getDemandAccount();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "demandAccount", lhsDemandAccount), LocatorUtils.property(thatLocator, "demandAccount", rhsDemandAccount), lhsDemandAccount, rhsDemandAccount, (this.demandAccount!= null), (that.demandAccount!= null))) {
                        return false;
                    }
                }
                {
                    String lhsProfileElement;
                    lhsProfileElement = this.getProfileElement();
                    String rhsProfileElement;
                    rhsProfileElement = that.getProfileElement();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "profileElement", lhsProfileElement), LocatorUtils.property(thatLocator, "profileElement", rhsProfileElement), lhsProfileElement, rhsProfileElement, (this.profileElement!= null), (that.profileElement!= null))) {
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
                    String theDemandAccount;
                    theDemandAccount = this.getDemandAccount();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "demandAccount", theDemandAccount), currentHashCode, theDemandAccount, (this.demandAccount!= null));
                }
                {
                    String theProfileElement;
                    theProfileElement = this.getProfileElement();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "profileElement", theProfileElement), currentHashCode, theProfileElement, (this.profileElement!= null));
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
                if (draftCopy instanceof ChangeProfileResponse.ProfileUpdates.ProfileUpdate) {
                    final ChangeProfileResponse.ProfileUpdates.ProfileUpdate copy = ((ChangeProfileResponse.ProfileUpdates.ProfileUpdate) draftCopy);
                    {
                        Boolean demandAccountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.demandAccount!= null));
                        if (demandAccountShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceDemandAccount;
                            sourceDemandAccount = this.getDemandAccount();
                            String copyDemandAccount = ((String) strategy.copy(LocatorUtils.property(locator, "demandAccount", sourceDemandAccount), sourceDemandAccount, (this.demandAccount!= null)));
                            copy.setDemandAccount(copyDemandAccount);
                        } else {
                            if (demandAccountShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.demandAccount = null;
                            }
                        }
                    }
                    {
                        Boolean profileElementShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.profileElement!= null));
                        if (profileElementShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceProfileElement;
                            sourceProfileElement = this.getProfileElement();
                            String copyProfileElement = ((String) strategy.copy(LocatorUtils.property(locator, "profileElement", sourceProfileElement), sourceProfileElement, (this.profileElement!= null)));
                            copy.setProfileElement(copyProfileElement);
                        } else {
                            if (profileElementShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.profileElement = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new ChangeProfileResponse.ProfileUpdates.ProfileUpdate();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ChangeProfileResponse.ProfileUpdates.ProfileUpdate) {
                    final ChangeProfileResponse.ProfileUpdates.ProfileUpdate target = this;
                    final ChangeProfileResponse.ProfileUpdates.ProfileUpdate leftObject = ((ChangeProfileResponse.ProfileUpdates.ProfileUpdate) left);
                    final ChangeProfileResponse.ProfileUpdates.ProfileUpdate rightObject = ((ChangeProfileResponse.ProfileUpdates.ProfileUpdate) right);
                    {
                        Boolean demandAccountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.demandAccount!= null), (rightObject.demandAccount!= null));
                        if (demandAccountShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsDemandAccount;
                            lhsDemandAccount = leftObject.getDemandAccount();
                            String rhsDemandAccount;
                            rhsDemandAccount = rightObject.getDemandAccount();
                            String mergedDemandAccount = ((String) strategy.merge(LocatorUtils.property(leftLocator, "demandAccount", lhsDemandAccount), LocatorUtils.property(rightLocator, "demandAccount", rhsDemandAccount), lhsDemandAccount, rhsDemandAccount, (leftObject.demandAccount!= null), (rightObject.demandAccount!= null)));
                            target.setDemandAccount(mergedDemandAccount);
                        } else {
                            if (demandAccountShouldBeMergedAndSet == Boolean.FALSE) {
                                target.demandAccount = null;
                            }
                        }
                    }
                    {
                        Boolean profileElementShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.profileElement!= null), (rightObject.profileElement!= null));
                        if (profileElementShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsProfileElement;
                            lhsProfileElement = leftObject.getProfileElement();
                            String rhsProfileElement;
                            rhsProfileElement = rightObject.getProfileElement();
                            String mergedProfileElement = ((String) strategy.merge(LocatorUtils.property(leftLocator, "profileElement", lhsProfileElement), LocatorUtils.property(rightLocator, "profileElement", rhsProfileElement), lhsProfileElement, rhsProfileElement, (leftObject.profileElement!= null), (rightObject.profileElement!= null)));
                            target.setProfileElement(mergedProfileElement);
                        } else {
                            if (profileElementShouldBeMergedAndSet == Boolean.FALSE) {
                                target.profileElement = null;
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
     *         &lt;element name="TrxnId" maxOccurs="unbounded" minOccurs="0"&gt;
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
    public static class TrxnsId implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "TrxnId")
        protected List<ChangeProfileResponse.TrxnsId.TrxnId> trxnIds;

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
         * {@link ChangeProfileResponse.TrxnsId.TrxnId }
         * 
         * 
         */
        public List<ChangeProfileResponse.TrxnsId.TrxnId> getTrxnIds() {
            if (trxnIds == null) {
                trxnIds = new ArrayList<ChangeProfileResponse.TrxnsId.TrxnId>();
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
                List<ChangeProfileResponse.TrxnsId.TrxnId> theTrxnIds;
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
            final ChangeProfileResponse.TrxnsId that = ((ChangeProfileResponse.TrxnsId) object);
            {
                List<ChangeProfileResponse.TrxnsId.TrxnId> lhsTrxnIds;
                lhsTrxnIds = (((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))?this.getTrxnIds():null);
                List<ChangeProfileResponse.TrxnsId.TrxnId> rhsTrxnIds;
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
                List<ChangeProfileResponse.TrxnsId.TrxnId> theTrxnIds;
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
            if (draftCopy instanceof ChangeProfileResponse.TrxnsId) {
                final ChangeProfileResponse.TrxnsId copy = ((ChangeProfileResponse.TrxnsId) draftCopy);
                {
                    Boolean trxnIdsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.trxnIds!= null)&&(!this.trxnIds.isEmpty())));
                    if (trxnIdsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ChangeProfileResponse.TrxnsId.TrxnId> sourceTrxnIds;
                        sourceTrxnIds = (((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))?this.getTrxnIds():null);
                        @SuppressWarnings("unchecked")
                        List<ChangeProfileResponse.TrxnsId.TrxnId> copyTrxnIds = ((List<ChangeProfileResponse.TrxnsId.TrxnId> ) strategy.copy(LocatorUtils.property(locator, "trxnIds", sourceTrxnIds), sourceTrxnIds, ((this.trxnIds!= null)&&(!this.trxnIds.isEmpty()))));
                        copy.trxnIds = null;
                        if (copyTrxnIds!= null) {
                            List<ChangeProfileResponse.TrxnsId.TrxnId> uniqueTrxnIdsl = copy.getTrxnIds();
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
            return new ChangeProfileResponse.TrxnsId();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ChangeProfileResponse.TrxnsId) {
                final ChangeProfileResponse.TrxnsId target = this;
                final ChangeProfileResponse.TrxnsId leftObject = ((ChangeProfileResponse.TrxnsId) left);
                final ChangeProfileResponse.TrxnsId rightObject = ((ChangeProfileResponse.TrxnsId) right);
                {
                    Boolean trxnIdsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.trxnIds!= null)&&(!leftObject.trxnIds.isEmpty())), ((rightObject.trxnIds!= null)&&(!rightObject.trxnIds.isEmpty())));
                    if (trxnIdsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<ChangeProfileResponse.TrxnsId.TrxnId> lhsTrxnIds;
                        lhsTrxnIds = (((leftObject.trxnIds!= null)&&(!leftObject.trxnIds.isEmpty()))?leftObject.getTrxnIds():null);
                        List<ChangeProfileResponse.TrxnsId.TrxnId> rhsTrxnIds;
                        rhsTrxnIds = (((rightObject.trxnIds!= null)&&(!rightObject.trxnIds.isEmpty()))?rightObject.getTrxnIds():null);
                        List<ChangeProfileResponse.TrxnsId.TrxnId> mergedTrxnIds = ((List<ChangeProfileResponse.TrxnsId.TrxnId> ) strategy.merge(LocatorUtils.property(leftLocator, "trxnIds", lhsTrxnIds), LocatorUtils.property(rightLocator, "trxnIds", rhsTrxnIds), lhsTrxnIds, rhsTrxnIds, ((leftObject.trxnIds!= null)&&(!leftObject.trxnIds.isEmpty())), ((rightObject.trxnIds!= null)&&(!rightObject.trxnIds.isEmpty()))));
                        target.trxnIds = null;
                        if (mergedTrxnIds!= null) {
                            List<ChangeProfileResponse.TrxnsId.TrxnId> uniqueTrxnIdsl = target.getTrxnIds();
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

        public void setTrxnIds(List<ChangeProfileResponse.TrxnsId.TrxnId> value) {
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
                final ChangeProfileResponse.TrxnsId.TrxnId that = ((ChangeProfileResponse.TrxnsId.TrxnId) object);
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
                if (draftCopy instanceof ChangeProfileResponse.TrxnsId.TrxnId) {
                    final ChangeProfileResponse.TrxnsId.TrxnId copy = ((ChangeProfileResponse.TrxnsId.TrxnId) draftCopy);
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
                return new ChangeProfileResponse.TrxnsId.TrxnId();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ChangeProfileResponse.TrxnsId.TrxnId) {
                    final ChangeProfileResponse.TrxnsId.TrxnId target = this;
                    final ChangeProfileResponse.TrxnsId.TrxnId leftObject = ((ChangeProfileResponse.TrxnsId.TrxnId) left);
                    final ChangeProfileResponse.TrxnsId.TrxnId rightObject = ((ChangeProfileResponse.TrxnsId.TrxnId) right);
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
