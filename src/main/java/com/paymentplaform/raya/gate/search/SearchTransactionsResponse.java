
package com.paymentplaform.raya.gate.search;

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
 * <p>Java class for Search_Transactions_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Search_Transactions_Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://raya.paymentplaform.com/gate}Status"/&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AsynchUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrxnsData" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TrxnData" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TrxnID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TermID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TrxnEfftDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                             &lt;element name="TrxnServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TrxnServiceRefNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TrxnAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                             &lt;element name="PmtMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TrxType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TrxSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TrxnStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DRAcct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CRAcct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "Search_Transactions_Response", namespace = "http://raya.paymentplaform.com/gate/search", propOrder = {
    "status",
    "rqUID",
    "asynchUID",
    "trxnsData",
    "extraAttributes",
    "notifications",
    "any"
})
public class SearchTransactionsResponse implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsynchUID")
    protected String asynchUID;
    @XmlElement(name = "TrxnsData")
    protected SearchTransactionsResponse.TrxnsData trxnsData;
    @XmlElement(name = "ExtraAttributes")
    protected List<SearchTransactionsResponse.ExtraAttributes> extraAttributes;
    @XmlElement(required = true)
    protected SearchTransactionsResponse.Notifications notifications;
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
     * Gets the value of the trxnsData property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTransactionsResponse.TrxnsData }
     *     
     */
    public SearchTransactionsResponse.TrxnsData getTrxnsData() {
        return trxnsData;
    }

    /**
     * Sets the value of the trxnsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTransactionsResponse.TrxnsData }
     *     
     */
    public void setTrxnsData(SearchTransactionsResponse.TrxnsData value) {
        this.trxnsData = value;
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
     * {@link SearchTransactionsResponse.ExtraAttributes }
     * 
     * 
     */
    public List<SearchTransactionsResponse.ExtraAttributes> getExtraAttributes() {
        if (extraAttributes == null) {
            extraAttributes = new ArrayList<SearchTransactionsResponse.ExtraAttributes>();
        }
        return this.extraAttributes;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTransactionsResponse.Notifications }
     *     
     */
    public SearchTransactionsResponse.Notifications getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTransactionsResponse.Notifications }
     *     
     */
    public void setNotifications(SearchTransactionsResponse.Notifications value) {
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
            SearchTransactionsResponse.TrxnsData theTrxnsData;
            theTrxnsData = this.getTrxnsData();
            strategy.appendField(locator, this, "trxnsData", buffer, theTrxnsData, (this.trxnsData!= null));
        }
        {
            List<SearchTransactionsResponse.ExtraAttributes> theExtraAttributes;
            theExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            strategy.appendField(locator, this, "extraAttributes", buffer, theExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
        }
        {
            SearchTransactionsResponse.Notifications theNotifications;
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
        final SearchTransactionsResponse that = ((SearchTransactionsResponse) object);
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
            SearchTransactionsResponse.TrxnsData lhsTrxnsData;
            lhsTrxnsData = this.getTrxnsData();
            SearchTransactionsResponse.TrxnsData rhsTrxnsData;
            rhsTrxnsData = that.getTrxnsData();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnsData", lhsTrxnsData), LocatorUtils.property(thatLocator, "trxnsData", rhsTrxnsData), lhsTrxnsData, rhsTrxnsData, (this.trxnsData!= null), (that.trxnsData!= null))) {
                return false;
            }
        }
        {
            List<SearchTransactionsResponse.ExtraAttributes> lhsExtraAttributes;
            lhsExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            List<SearchTransactionsResponse.ExtraAttributes> rhsExtraAttributes;
            rhsExtraAttributes = (((that.extraAttributes!= null)&&(!that.extraAttributes.isEmpty()))?that.getExtraAttributes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(thatLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())), ((that.extraAttributes!= null)&&(!that.extraAttributes.isEmpty())))) {
                return false;
            }
        }
        {
            SearchTransactionsResponse.Notifications lhsNotifications;
            lhsNotifications = this.getNotifications();
            SearchTransactionsResponse.Notifications rhsNotifications;
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
            SearchTransactionsResponse.TrxnsData theTrxnsData;
            theTrxnsData = this.getTrxnsData();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnsData", theTrxnsData), currentHashCode, theTrxnsData, (this.trxnsData!= null));
        }
        {
            List<SearchTransactionsResponse.ExtraAttributes> theExtraAttributes;
            theExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extraAttributes", theExtraAttributes), currentHashCode, theExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
        }
        {
            SearchTransactionsResponse.Notifications theNotifications;
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
        if (draftCopy instanceof SearchTransactionsResponse) {
            final SearchTransactionsResponse copy = ((SearchTransactionsResponse) draftCopy);
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
                Boolean trxnsDataShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnsData!= null));
                if (trxnsDataShouldBeCopiedAndSet == Boolean.TRUE) {
                    SearchTransactionsResponse.TrxnsData sourceTrxnsData;
                    sourceTrxnsData = this.getTrxnsData();
                    SearchTransactionsResponse.TrxnsData copyTrxnsData = ((SearchTransactionsResponse.TrxnsData) strategy.copy(LocatorUtils.property(locator, "trxnsData", sourceTrxnsData), sourceTrxnsData, (this.trxnsData!= null)));
                    copy.setTrxnsData(copyTrxnsData);
                } else {
                    if (trxnsDataShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trxnsData = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SearchTransactionsResponse.ExtraAttributes> sourceExtraAttributes;
                    sourceExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
                    @SuppressWarnings("unchecked")
                    List<SearchTransactionsResponse.ExtraAttributes> copyExtraAttributes = ((List<SearchTransactionsResponse.ExtraAttributes> ) strategy.copy(LocatorUtils.property(locator, "extraAttributes", sourceExtraAttributes), sourceExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))));
                    copy.extraAttributes = null;
                    if (copyExtraAttributes!= null) {
                        List<SearchTransactionsResponse.ExtraAttributes> uniqueExtraAttributesl = copy.getExtraAttributes();
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
                    SearchTransactionsResponse.Notifications sourceNotifications;
                    sourceNotifications = this.getNotifications();
                    SearchTransactionsResponse.Notifications copyNotifications = ((SearchTransactionsResponse.Notifications) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, (this.notifications!= null)));
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
        return new SearchTransactionsResponse();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof SearchTransactionsResponse) {
            final SearchTransactionsResponse target = this;
            final SearchTransactionsResponse leftObject = ((SearchTransactionsResponse) left);
            final SearchTransactionsResponse rightObject = ((SearchTransactionsResponse) right);
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
                Boolean trxnsDataShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnsData!= null), (rightObject.trxnsData!= null));
                if (trxnsDataShouldBeMergedAndSet == Boolean.TRUE) {
                    SearchTransactionsResponse.TrxnsData lhsTrxnsData;
                    lhsTrxnsData = leftObject.getTrxnsData();
                    SearchTransactionsResponse.TrxnsData rhsTrxnsData;
                    rhsTrxnsData = rightObject.getTrxnsData();
                    SearchTransactionsResponse.TrxnsData mergedTrxnsData = ((SearchTransactionsResponse.TrxnsData) strategy.merge(LocatorUtils.property(leftLocator, "trxnsData", lhsTrxnsData), LocatorUtils.property(rightLocator, "trxnsData", rhsTrxnsData), lhsTrxnsData, rhsTrxnsData, (leftObject.trxnsData!= null), (rightObject.trxnsData!= null)));
                    target.setTrxnsData(mergedTrxnsData);
                } else {
                    if (trxnsDataShouldBeMergedAndSet == Boolean.FALSE) {
                        target.trxnsData = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeMergedAndSet == Boolean.TRUE) {
                    List<SearchTransactionsResponse.ExtraAttributes> lhsExtraAttributes;
                    lhsExtraAttributes = (((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty()))?leftObject.getExtraAttributes():null);
                    List<SearchTransactionsResponse.ExtraAttributes> rhsExtraAttributes;
                    rhsExtraAttributes = (((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))?rightObject.getExtraAttributes():null);
                    List<SearchTransactionsResponse.ExtraAttributes> mergedExtraAttributes = ((List<SearchTransactionsResponse.ExtraAttributes> ) strategy.merge(LocatorUtils.property(leftLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(rightLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))));
                    target.extraAttributes = null;
                    if (mergedExtraAttributes!= null) {
                        List<SearchTransactionsResponse.ExtraAttributes> uniqueExtraAttributesl = target.getExtraAttributes();
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
                    SearchTransactionsResponse.Notifications lhsNotifications;
                    lhsNotifications = leftObject.getNotifications();
                    SearchTransactionsResponse.Notifications rhsNotifications;
                    rhsNotifications = rightObject.getNotifications();
                    SearchTransactionsResponse.Notifications mergedNotifications = ((SearchTransactionsResponse.Notifications) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, (leftObject.notifications!= null), (rightObject.notifications!= null)));
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

    public void setExtraAttributes(List<SearchTransactionsResponse.ExtraAttributes> value) {
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
            final SearchTransactionsResponse.ExtraAttributes that = ((SearchTransactionsResponse.ExtraAttributes) object);
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
            if (draftCopy instanceof SearchTransactionsResponse.ExtraAttributes) {
                final SearchTransactionsResponse.ExtraAttributes copy = ((SearchTransactionsResponse.ExtraAttributes) draftCopy);
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
            return new SearchTransactionsResponse.ExtraAttributes();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof SearchTransactionsResponse.ExtraAttributes) {
                final SearchTransactionsResponse.ExtraAttributes target = this;
                final SearchTransactionsResponse.ExtraAttributes leftObject = ((SearchTransactionsResponse.ExtraAttributes) left);
                final SearchTransactionsResponse.ExtraAttributes rightObject = ((SearchTransactionsResponse.ExtraAttributes) right);
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
        protected List<SearchTransactionsResponse.Notifications.Notification> notifications;

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
         * {@link SearchTransactionsResponse.Notifications.Notification }
         * 
         * 
         */
        public List<SearchTransactionsResponse.Notifications.Notification> getNotifications() {
            if (notifications == null) {
                notifications = new ArrayList<SearchTransactionsResponse.Notifications.Notification>();
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
                List<SearchTransactionsResponse.Notifications.Notification> theNotifications;
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
            final SearchTransactionsResponse.Notifications that = ((SearchTransactionsResponse.Notifications) object);
            {
                List<SearchTransactionsResponse.Notifications.Notification> lhsNotifications;
                lhsNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                List<SearchTransactionsResponse.Notifications.Notification> rhsNotifications;
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
                List<SearchTransactionsResponse.Notifications.Notification> theNotifications;
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
            if (draftCopy instanceof SearchTransactionsResponse.Notifications) {
                final SearchTransactionsResponse.Notifications copy = ((SearchTransactionsResponse.Notifications) draftCopy);
                {
                    Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.notifications!= null)&&(!this.notifications.isEmpty())));
                    if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<SearchTransactionsResponse.Notifications.Notification> sourceNotifications;
                        sourceNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                        @SuppressWarnings("unchecked")
                        List<SearchTransactionsResponse.Notifications.Notification> copyNotifications = ((List<SearchTransactionsResponse.Notifications.Notification> ) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, ((this.notifications!= null)&&(!this.notifications.isEmpty()))));
                        copy.notifications = null;
                        if (copyNotifications!= null) {
                            List<SearchTransactionsResponse.Notifications.Notification> uniqueNotificationsl = copy.getNotifications();
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
            return new SearchTransactionsResponse.Notifications();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof SearchTransactionsResponse.Notifications) {
                final SearchTransactionsResponse.Notifications target = this;
                final SearchTransactionsResponse.Notifications leftObject = ((SearchTransactionsResponse.Notifications) left);
                final SearchTransactionsResponse.Notifications rightObject = ((SearchTransactionsResponse.Notifications) right);
                {
                    Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty())));
                    if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<SearchTransactionsResponse.Notifications.Notification> lhsNotifications;
                        lhsNotifications = (((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty()))?leftObject.getNotifications():null);
                        List<SearchTransactionsResponse.Notifications.Notification> rhsNotifications;
                        rhsNotifications = (((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))?rightObject.getNotifications():null);
                        List<SearchTransactionsResponse.Notifications.Notification> mergedNotifications = ((List<SearchTransactionsResponse.Notifications.Notification> ) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))));
                        target.notifications = null;
                        if (mergedNotifications!= null) {
                            List<SearchTransactionsResponse.Notifications.Notification> uniqueNotificationsl = target.getNotifications();
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

        public void setNotifications(List<SearchTransactionsResponse.Notifications.Notification> value) {
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
                final SearchTransactionsResponse.Notifications.Notification that = ((SearchTransactionsResponse.Notifications.Notification) object);
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
                if (draftCopy instanceof SearchTransactionsResponse.Notifications.Notification) {
                    final SearchTransactionsResponse.Notifications.Notification copy = ((SearchTransactionsResponse.Notifications.Notification) draftCopy);
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
                return new SearchTransactionsResponse.Notifications.Notification();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof SearchTransactionsResponse.Notifications.Notification) {
                    final SearchTransactionsResponse.Notifications.Notification target = this;
                    final SearchTransactionsResponse.Notifications.Notification leftObject = ((SearchTransactionsResponse.Notifications.Notification) left);
                    final SearchTransactionsResponse.Notifications.Notification rightObject = ((SearchTransactionsResponse.Notifications.Notification) right);
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
     *         &lt;element name="TrxnData" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TrxnID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TermID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TrxnEfftDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *                   &lt;element name="TrxnServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TrxnServiceRefNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TrxnAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                   &lt;element name="PmtMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TrxType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TrxSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TrxnStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DRAcct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CRAcct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "trxnDatas"
    })
    public static class TrxnsData implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "TrxnData")
        protected List<SearchTransactionsResponse.TrxnsData.TrxnData> trxnDatas;

        /**
         * Gets the value of the trxnDatas property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trxnDatas property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrxnDatas().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchTransactionsResponse.TrxnsData.TrxnData }
         * 
         * 
         */
        public List<SearchTransactionsResponse.TrxnsData.TrxnData> getTrxnDatas() {
            if (trxnDatas == null) {
                trxnDatas = new ArrayList<SearchTransactionsResponse.TrxnsData.TrxnData>();
            }
            return this.trxnDatas;
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
                List<SearchTransactionsResponse.TrxnsData.TrxnData> theTrxnDatas;
                theTrxnDatas = (((this.trxnDatas!= null)&&(!this.trxnDatas.isEmpty()))?this.getTrxnDatas():null);
                strategy.appendField(locator, this, "trxnDatas", buffer, theTrxnDatas, ((this.trxnDatas!= null)&&(!this.trxnDatas.isEmpty())));
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
            final SearchTransactionsResponse.TrxnsData that = ((SearchTransactionsResponse.TrxnsData) object);
            {
                List<SearchTransactionsResponse.TrxnsData.TrxnData> lhsTrxnDatas;
                lhsTrxnDatas = (((this.trxnDatas!= null)&&(!this.trxnDatas.isEmpty()))?this.getTrxnDatas():null);
                List<SearchTransactionsResponse.TrxnsData.TrxnData> rhsTrxnDatas;
                rhsTrxnDatas = (((that.trxnDatas!= null)&&(!that.trxnDatas.isEmpty()))?that.getTrxnDatas():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnDatas", lhsTrxnDatas), LocatorUtils.property(thatLocator, "trxnDatas", rhsTrxnDatas), lhsTrxnDatas, rhsTrxnDatas, ((this.trxnDatas!= null)&&(!this.trxnDatas.isEmpty())), ((that.trxnDatas!= null)&&(!that.trxnDatas.isEmpty())))) {
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
                List<SearchTransactionsResponse.TrxnsData.TrxnData> theTrxnDatas;
                theTrxnDatas = (((this.trxnDatas!= null)&&(!this.trxnDatas.isEmpty()))?this.getTrxnDatas():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnDatas", theTrxnDatas), currentHashCode, theTrxnDatas, ((this.trxnDatas!= null)&&(!this.trxnDatas.isEmpty())));
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
            if (draftCopy instanceof SearchTransactionsResponse.TrxnsData) {
                final SearchTransactionsResponse.TrxnsData copy = ((SearchTransactionsResponse.TrxnsData) draftCopy);
                {
                    Boolean trxnDatasShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.trxnDatas!= null)&&(!this.trxnDatas.isEmpty())));
                    if (trxnDatasShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<SearchTransactionsResponse.TrxnsData.TrxnData> sourceTrxnDatas;
                        sourceTrxnDatas = (((this.trxnDatas!= null)&&(!this.trxnDatas.isEmpty()))?this.getTrxnDatas():null);
                        @SuppressWarnings("unchecked")
                        List<SearchTransactionsResponse.TrxnsData.TrxnData> copyTrxnDatas = ((List<SearchTransactionsResponse.TrxnsData.TrxnData> ) strategy.copy(LocatorUtils.property(locator, "trxnDatas", sourceTrxnDatas), sourceTrxnDatas, ((this.trxnDatas!= null)&&(!this.trxnDatas.isEmpty()))));
                        copy.trxnDatas = null;
                        if (copyTrxnDatas!= null) {
                            List<SearchTransactionsResponse.TrxnsData.TrxnData> uniqueTrxnDatasl = copy.getTrxnDatas();
                            uniqueTrxnDatasl.addAll(copyTrxnDatas);
                        }
                    } else {
                        if (trxnDatasShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.trxnDatas = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new SearchTransactionsResponse.TrxnsData();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof SearchTransactionsResponse.TrxnsData) {
                final SearchTransactionsResponse.TrxnsData target = this;
                final SearchTransactionsResponse.TrxnsData leftObject = ((SearchTransactionsResponse.TrxnsData) left);
                final SearchTransactionsResponse.TrxnsData rightObject = ((SearchTransactionsResponse.TrxnsData) right);
                {
                    Boolean trxnDatasShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.trxnDatas!= null)&&(!leftObject.trxnDatas.isEmpty())), ((rightObject.trxnDatas!= null)&&(!rightObject.trxnDatas.isEmpty())));
                    if (trxnDatasShouldBeMergedAndSet == Boolean.TRUE) {
                        List<SearchTransactionsResponse.TrxnsData.TrxnData> lhsTrxnDatas;
                        lhsTrxnDatas = (((leftObject.trxnDatas!= null)&&(!leftObject.trxnDatas.isEmpty()))?leftObject.getTrxnDatas():null);
                        List<SearchTransactionsResponse.TrxnsData.TrxnData> rhsTrxnDatas;
                        rhsTrxnDatas = (((rightObject.trxnDatas!= null)&&(!rightObject.trxnDatas.isEmpty()))?rightObject.getTrxnDatas():null);
                        List<SearchTransactionsResponse.TrxnsData.TrxnData> mergedTrxnDatas = ((List<SearchTransactionsResponse.TrxnsData.TrxnData> ) strategy.merge(LocatorUtils.property(leftLocator, "trxnDatas", lhsTrxnDatas), LocatorUtils.property(rightLocator, "trxnDatas", rhsTrxnDatas), lhsTrxnDatas, rhsTrxnDatas, ((leftObject.trxnDatas!= null)&&(!leftObject.trxnDatas.isEmpty())), ((rightObject.trxnDatas!= null)&&(!rightObject.trxnDatas.isEmpty()))));
                        target.trxnDatas = null;
                        if (mergedTrxnDatas!= null) {
                            List<SearchTransactionsResponse.TrxnsData.TrxnData> uniqueTrxnDatasl = target.getTrxnDatas();
                            uniqueTrxnDatasl.addAll(mergedTrxnDatas);
                        }
                    } else {
                        if (trxnDatasShouldBeMergedAndSet == Boolean.FALSE) {
                            target.trxnDatas = null;
                        }
                    }
                }
            }
        }

        public void setTrxnDatas(List<SearchTransactionsResponse.TrxnsData.TrxnData> value) {
            this.trxnDatas = value;
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
         *         &lt;element name="TrxnID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ClientID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TermID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TrxnEfftDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
         *         &lt;element name="TrxnServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TrxnServiceRefNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TrxnAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
         *         &lt;element name="PmtMethod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TrxType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TrxSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TrxnStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DRAcct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CRAcct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "trxnID",
            "clientID",
            "termID",
            "trxnEfftDt",
            "trxnServiceCode",
            "trxnServiceRefNumber",
            "trxnAmount",
            "pmtMethod",
            "trxType",
            "trxSubType",
            "trxnStatus",
            "drAcct",
            "crAcct"
        })
        public static class TrxnData implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            @XmlElement(name = "TrxnID", required = true)
            protected String trxnID;
            @XmlElement(name = "ClientID", required = true)
            protected String clientID;
            @XmlElement(name = "TermID", required = true)
            protected String termID;
            @XmlElement(name = "TrxnEfftDt", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar trxnEfftDt;
            @XmlElement(name = "TrxnServiceCode", required = true)
            protected String trxnServiceCode;
            @XmlElement(name = "TrxnServiceRefNumber", required = true)
            protected String trxnServiceRefNumber;
            @XmlElement(name = "TrxnAmount")
            protected double trxnAmount;
            @XmlElement(name = "PmtMethod", required = true)
            protected String pmtMethod;
            @XmlElement(name = "TrxType", required = true)
            protected String trxType;
            @XmlElement(name = "TrxSubType")
            protected String trxSubType;
            @XmlElement(name = "TrxnStatus", required = true)
            protected String trxnStatus;
            @XmlElement(name = "DRAcct", required = true)
            protected String drAcct;
            @XmlElement(name = "CRAcct", required = true)
            protected String crAcct;

            /**
             * Gets the value of the trxnID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrxnID() {
                return trxnID;
            }

            /**
             * Sets the value of the trxnID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrxnID(String value) {
                this.trxnID = value;
            }

            /**
             * Gets the value of the clientID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClientID() {
                return clientID;
            }

            /**
             * Sets the value of the clientID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClientID(String value) {
                this.clientID = value;
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
             * Gets the value of the trxnEfftDt property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getTrxnEfftDt() {
                return trxnEfftDt;
            }

            /**
             * Sets the value of the trxnEfftDt property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setTrxnEfftDt(XMLGregorianCalendar value) {
                this.trxnEfftDt = value;
            }

            /**
             * Gets the value of the trxnServiceCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrxnServiceCode() {
                return trxnServiceCode;
            }

            /**
             * Sets the value of the trxnServiceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrxnServiceCode(String value) {
                this.trxnServiceCode = value;
            }

            /**
             * Gets the value of the trxnServiceRefNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrxnServiceRefNumber() {
                return trxnServiceRefNumber;
            }

            /**
             * Sets the value of the trxnServiceRefNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrxnServiceRefNumber(String value) {
                this.trxnServiceRefNumber = value;
            }

            /**
             * Gets the value of the trxnAmount property.
             * 
             */
            public double getTrxnAmount() {
                return trxnAmount;
            }

            /**
             * Sets the value of the trxnAmount property.
             * 
             */
            public void setTrxnAmount(double value) {
                this.trxnAmount = value;
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
             * Gets the value of the trxType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrxType() {
                return trxType;
            }

            /**
             * Sets the value of the trxType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrxType(String value) {
                this.trxType = value;
            }

            /**
             * Gets the value of the trxSubType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrxSubType() {
                return trxSubType;
            }

            /**
             * Sets the value of the trxSubType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrxSubType(String value) {
                this.trxSubType = value;
            }

            /**
             * Gets the value of the trxnStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrxnStatus() {
                return trxnStatus;
            }

            /**
             * Sets the value of the trxnStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrxnStatus(String value) {
                this.trxnStatus = value;
            }

            /**
             * Gets the value of the drAcct property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDRAcct() {
                return drAcct;
            }

            /**
             * Sets the value of the drAcct property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDRAcct(String value) {
                this.drAcct = value;
            }

            /**
             * Gets the value of the crAcct property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCRAcct() {
                return crAcct;
            }

            /**
             * Sets the value of the crAcct property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCRAcct(String value) {
                this.crAcct = value;
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
                    String theTrxnID;
                    theTrxnID = this.getTrxnID();
                    strategy.appendField(locator, this, "trxnID", buffer, theTrxnID, (this.trxnID!= null));
                }
                {
                    String theClientID;
                    theClientID = this.getClientID();
                    strategy.appendField(locator, this, "clientID", buffer, theClientID, (this.clientID!= null));
                }
                {
                    String theTermID;
                    theTermID = this.getTermID();
                    strategy.appendField(locator, this, "termID", buffer, theTermID, (this.termID!= null));
                }
                {
                    XMLGregorianCalendar theTrxnEfftDt;
                    theTrxnEfftDt = this.getTrxnEfftDt();
                    strategy.appendField(locator, this, "trxnEfftDt", buffer, theTrxnEfftDt, (this.trxnEfftDt!= null));
                }
                {
                    String theTrxnServiceCode;
                    theTrxnServiceCode = this.getTrxnServiceCode();
                    strategy.appendField(locator, this, "trxnServiceCode", buffer, theTrxnServiceCode, (this.trxnServiceCode!= null));
                }
                {
                    String theTrxnServiceRefNumber;
                    theTrxnServiceRefNumber = this.getTrxnServiceRefNumber();
                    strategy.appendField(locator, this, "trxnServiceRefNumber", buffer, theTrxnServiceRefNumber, (this.trxnServiceRefNumber!= null));
                }
                {
                    double theTrxnAmount;
                    theTrxnAmount = this.getTrxnAmount();
                    strategy.appendField(locator, this, "trxnAmount", buffer, theTrxnAmount, true);
                }
                {
                    String thePmtMethod;
                    thePmtMethod = this.getPmtMethod();
                    strategy.appendField(locator, this, "pmtMethod", buffer, thePmtMethod, (this.pmtMethod!= null));
                }
                {
                    String theTrxType;
                    theTrxType = this.getTrxType();
                    strategy.appendField(locator, this, "trxType", buffer, theTrxType, (this.trxType!= null));
                }
                {
                    String theTrxSubType;
                    theTrxSubType = this.getTrxSubType();
                    strategy.appendField(locator, this, "trxSubType", buffer, theTrxSubType, (this.trxSubType!= null));
                }
                {
                    String theTrxnStatus;
                    theTrxnStatus = this.getTrxnStatus();
                    strategy.appendField(locator, this, "trxnStatus", buffer, theTrxnStatus, (this.trxnStatus!= null));
                }
                {
                    String theDRAcct;
                    theDRAcct = this.getDRAcct();
                    strategy.appendField(locator, this, "drAcct", buffer, theDRAcct, (this.drAcct!= null));
                }
                {
                    String theCRAcct;
                    theCRAcct = this.getCRAcct();
                    strategy.appendField(locator, this, "crAcct", buffer, theCRAcct, (this.crAcct!= null));
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
                final SearchTransactionsResponse.TrxnsData.TrxnData that = ((SearchTransactionsResponse.TrxnsData.TrxnData) object);
                {
                    String lhsTrxnID;
                    lhsTrxnID = this.getTrxnID();
                    String rhsTrxnID;
                    rhsTrxnID = that.getTrxnID();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnID", lhsTrxnID), LocatorUtils.property(thatLocator, "trxnID", rhsTrxnID), lhsTrxnID, rhsTrxnID, (this.trxnID!= null), (that.trxnID!= null))) {
                        return false;
                    }
                }
                {
                    String lhsClientID;
                    lhsClientID = this.getClientID();
                    String rhsClientID;
                    rhsClientID = that.getClientID();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "clientID", lhsClientID), LocatorUtils.property(thatLocator, "clientID", rhsClientID), lhsClientID, rhsClientID, (this.clientID!= null), (that.clientID!= null))) {
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
                    XMLGregorianCalendar lhsTrxnEfftDt;
                    lhsTrxnEfftDt = this.getTrxnEfftDt();
                    XMLGregorianCalendar rhsTrxnEfftDt;
                    rhsTrxnEfftDt = that.getTrxnEfftDt();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnEfftDt", lhsTrxnEfftDt), LocatorUtils.property(thatLocator, "trxnEfftDt", rhsTrxnEfftDt), lhsTrxnEfftDt, rhsTrxnEfftDt, (this.trxnEfftDt!= null), (that.trxnEfftDt!= null))) {
                        return false;
                    }
                }
                {
                    String lhsTrxnServiceCode;
                    lhsTrxnServiceCode = this.getTrxnServiceCode();
                    String rhsTrxnServiceCode;
                    rhsTrxnServiceCode = that.getTrxnServiceCode();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnServiceCode", lhsTrxnServiceCode), LocatorUtils.property(thatLocator, "trxnServiceCode", rhsTrxnServiceCode), lhsTrxnServiceCode, rhsTrxnServiceCode, (this.trxnServiceCode!= null), (that.trxnServiceCode!= null))) {
                        return false;
                    }
                }
                {
                    String lhsTrxnServiceRefNumber;
                    lhsTrxnServiceRefNumber = this.getTrxnServiceRefNumber();
                    String rhsTrxnServiceRefNumber;
                    rhsTrxnServiceRefNumber = that.getTrxnServiceRefNumber();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnServiceRefNumber", lhsTrxnServiceRefNumber), LocatorUtils.property(thatLocator, "trxnServiceRefNumber", rhsTrxnServiceRefNumber), lhsTrxnServiceRefNumber, rhsTrxnServiceRefNumber, (this.trxnServiceRefNumber!= null), (that.trxnServiceRefNumber!= null))) {
                        return false;
                    }
                }
                {
                    double lhsTrxnAmount;
                    lhsTrxnAmount = this.getTrxnAmount();
                    double rhsTrxnAmount;
                    rhsTrxnAmount = that.getTrxnAmount();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnAmount", lhsTrxnAmount), LocatorUtils.property(thatLocator, "trxnAmount", rhsTrxnAmount), lhsTrxnAmount, rhsTrxnAmount, true, true)) {
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
                    String lhsTrxType;
                    lhsTrxType = this.getTrxType();
                    String rhsTrxType;
                    rhsTrxType = that.getTrxType();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "trxType", lhsTrxType), LocatorUtils.property(thatLocator, "trxType", rhsTrxType), lhsTrxType, rhsTrxType, (this.trxType!= null), (that.trxType!= null))) {
                        return false;
                    }
                }
                {
                    String lhsTrxSubType;
                    lhsTrxSubType = this.getTrxSubType();
                    String rhsTrxSubType;
                    rhsTrxSubType = that.getTrxSubType();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "trxSubType", lhsTrxSubType), LocatorUtils.property(thatLocator, "trxSubType", rhsTrxSubType), lhsTrxSubType, rhsTrxSubType, (this.trxSubType!= null), (that.trxSubType!= null))) {
                        return false;
                    }
                }
                {
                    String lhsTrxnStatus;
                    lhsTrxnStatus = this.getTrxnStatus();
                    String rhsTrxnStatus;
                    rhsTrxnStatus = that.getTrxnStatus();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnStatus", lhsTrxnStatus), LocatorUtils.property(thatLocator, "trxnStatus", rhsTrxnStatus), lhsTrxnStatus, rhsTrxnStatus, (this.trxnStatus!= null), (that.trxnStatus!= null))) {
                        return false;
                    }
                }
                {
                    String lhsDRAcct;
                    lhsDRAcct = this.getDRAcct();
                    String rhsDRAcct;
                    rhsDRAcct = that.getDRAcct();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "drAcct", lhsDRAcct), LocatorUtils.property(thatLocator, "drAcct", rhsDRAcct), lhsDRAcct, rhsDRAcct, (this.drAcct!= null), (that.drAcct!= null))) {
                        return false;
                    }
                }
                {
                    String lhsCRAcct;
                    lhsCRAcct = this.getCRAcct();
                    String rhsCRAcct;
                    rhsCRAcct = that.getCRAcct();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "crAcct", lhsCRAcct), LocatorUtils.property(thatLocator, "crAcct", rhsCRAcct), lhsCRAcct, rhsCRAcct, (this.crAcct!= null), (that.crAcct!= null))) {
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
                    String theTrxnID;
                    theTrxnID = this.getTrxnID();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnID", theTrxnID), currentHashCode, theTrxnID, (this.trxnID!= null));
                }
                {
                    String theClientID;
                    theClientID = this.getClientID();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientID", theClientID), currentHashCode, theClientID, (this.clientID!= null));
                }
                {
                    String theTermID;
                    theTermID = this.getTermID();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "termID", theTermID), currentHashCode, theTermID, (this.termID!= null));
                }
                {
                    XMLGregorianCalendar theTrxnEfftDt;
                    theTrxnEfftDt = this.getTrxnEfftDt();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnEfftDt", theTrxnEfftDt), currentHashCode, theTrxnEfftDt, (this.trxnEfftDt!= null));
                }
                {
                    String theTrxnServiceCode;
                    theTrxnServiceCode = this.getTrxnServiceCode();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnServiceCode", theTrxnServiceCode), currentHashCode, theTrxnServiceCode, (this.trxnServiceCode!= null));
                }
                {
                    String theTrxnServiceRefNumber;
                    theTrxnServiceRefNumber = this.getTrxnServiceRefNumber();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnServiceRefNumber", theTrxnServiceRefNumber), currentHashCode, theTrxnServiceRefNumber, (this.trxnServiceRefNumber!= null));
                }
                {
                    double theTrxnAmount;
                    theTrxnAmount = this.getTrxnAmount();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnAmount", theTrxnAmount), currentHashCode, theTrxnAmount, true);
                }
                {
                    String thePmtMethod;
                    thePmtMethod = this.getPmtMethod();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtMethod", thePmtMethod), currentHashCode, thePmtMethod, (this.pmtMethod!= null));
                }
                {
                    String theTrxType;
                    theTrxType = this.getTrxType();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxType", theTrxType), currentHashCode, theTrxType, (this.trxType!= null));
                }
                {
                    String theTrxSubType;
                    theTrxSubType = this.getTrxSubType();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxSubType", theTrxSubType), currentHashCode, theTrxSubType, (this.trxSubType!= null));
                }
                {
                    String theTrxnStatus;
                    theTrxnStatus = this.getTrxnStatus();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnStatus", theTrxnStatus), currentHashCode, theTrxnStatus, (this.trxnStatus!= null));
                }
                {
                    String theDRAcct;
                    theDRAcct = this.getDRAcct();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "drAcct", theDRAcct), currentHashCode, theDRAcct, (this.drAcct!= null));
                }
                {
                    String theCRAcct;
                    theCRAcct = this.getCRAcct();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "crAcct", theCRAcct), currentHashCode, theCRAcct, (this.crAcct!= null));
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
                if (draftCopy instanceof SearchTransactionsResponse.TrxnsData.TrxnData) {
                    final SearchTransactionsResponse.TrxnsData.TrxnData copy = ((SearchTransactionsResponse.TrxnsData.TrxnData) draftCopy);
                    {
                        Boolean trxnIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnID!= null));
                        if (trxnIDShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceTrxnID;
                            sourceTrxnID = this.getTrxnID();
                            String copyTrxnID = ((String) strategy.copy(LocatorUtils.property(locator, "trxnID", sourceTrxnID), sourceTrxnID, (this.trxnID!= null)));
                            copy.setTrxnID(copyTrxnID);
                        } else {
                            if (trxnIDShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.trxnID = null;
                            }
                        }
                    }
                    {
                        Boolean clientIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.clientID!= null));
                        if (clientIDShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceClientID;
                            sourceClientID = this.getClientID();
                            String copyClientID = ((String) strategy.copy(LocatorUtils.property(locator, "clientID", sourceClientID), sourceClientID, (this.clientID!= null)));
                            copy.setClientID(copyClientID);
                        } else {
                            if (clientIDShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.clientID = null;
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
                        Boolean trxnEfftDtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnEfftDt!= null));
                        if (trxnEfftDtShouldBeCopiedAndSet == Boolean.TRUE) {
                            XMLGregorianCalendar sourceTrxnEfftDt;
                            sourceTrxnEfftDt = this.getTrxnEfftDt();
                            XMLGregorianCalendar copyTrxnEfftDt = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "trxnEfftDt", sourceTrxnEfftDt), sourceTrxnEfftDt, (this.trxnEfftDt!= null)));
                            copy.setTrxnEfftDt(copyTrxnEfftDt);
                        } else {
                            if (trxnEfftDtShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.trxnEfftDt = null;
                            }
                        }
                    }
                    {
                        Boolean trxnServiceCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnServiceCode!= null));
                        if (trxnServiceCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceTrxnServiceCode;
                            sourceTrxnServiceCode = this.getTrxnServiceCode();
                            String copyTrxnServiceCode = ((String) strategy.copy(LocatorUtils.property(locator, "trxnServiceCode", sourceTrxnServiceCode), sourceTrxnServiceCode, (this.trxnServiceCode!= null)));
                            copy.setTrxnServiceCode(copyTrxnServiceCode);
                        } else {
                            if (trxnServiceCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.trxnServiceCode = null;
                            }
                        }
                    }
                    {
                        Boolean trxnServiceRefNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnServiceRefNumber!= null));
                        if (trxnServiceRefNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceTrxnServiceRefNumber;
                            sourceTrxnServiceRefNumber = this.getTrxnServiceRefNumber();
                            String copyTrxnServiceRefNumber = ((String) strategy.copy(LocatorUtils.property(locator, "trxnServiceRefNumber", sourceTrxnServiceRefNumber), sourceTrxnServiceRefNumber, (this.trxnServiceRefNumber!= null)));
                            copy.setTrxnServiceRefNumber(copyTrxnServiceRefNumber);
                        } else {
                            if (trxnServiceRefNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.trxnServiceRefNumber = null;
                            }
                        }
                    }
                    {
                        Boolean trxnAmountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                        if (trxnAmountShouldBeCopiedAndSet == Boolean.TRUE) {
                            double sourceTrxnAmount;
                            sourceTrxnAmount = this.getTrxnAmount();
                            double copyTrxnAmount = strategy.copy(LocatorUtils.property(locator, "trxnAmount", sourceTrxnAmount), sourceTrxnAmount, true);
                            copy.setTrxnAmount(copyTrxnAmount);
                        } else {
                            if (trxnAmountShouldBeCopiedAndSet == Boolean.FALSE) {
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
                        Boolean trxTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxType!= null));
                        if (trxTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceTrxType;
                            sourceTrxType = this.getTrxType();
                            String copyTrxType = ((String) strategy.copy(LocatorUtils.property(locator, "trxType", sourceTrxType), sourceTrxType, (this.trxType!= null)));
                            copy.setTrxType(copyTrxType);
                        } else {
                            if (trxTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.trxType = null;
                            }
                        }
                    }
                    {
                        Boolean trxSubTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxSubType!= null));
                        if (trxSubTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceTrxSubType;
                            sourceTrxSubType = this.getTrxSubType();
                            String copyTrxSubType = ((String) strategy.copy(LocatorUtils.property(locator, "trxSubType", sourceTrxSubType), sourceTrxSubType, (this.trxSubType!= null)));
                            copy.setTrxSubType(copyTrxSubType);
                        } else {
                            if (trxSubTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.trxSubType = null;
                            }
                        }
                    }
                    {
                        Boolean trxnStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnStatus!= null));
                        if (trxnStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceTrxnStatus;
                            sourceTrxnStatus = this.getTrxnStatus();
                            String copyTrxnStatus = ((String) strategy.copy(LocatorUtils.property(locator, "trxnStatus", sourceTrxnStatus), sourceTrxnStatus, (this.trxnStatus!= null)));
                            copy.setTrxnStatus(copyTrxnStatus);
                        } else {
                            if (trxnStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.trxnStatus = null;
                            }
                        }
                    }
                    {
                        Boolean drAcctShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.drAcct!= null));
                        if (drAcctShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceDRAcct;
                            sourceDRAcct = this.getDRAcct();
                            String copyDRAcct = ((String) strategy.copy(LocatorUtils.property(locator, "drAcct", sourceDRAcct), sourceDRAcct, (this.drAcct!= null)));
                            copy.setDRAcct(copyDRAcct);
                        } else {
                            if (drAcctShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.drAcct = null;
                            }
                        }
                    }
                    {
                        Boolean crAcctShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.crAcct!= null));
                        if (crAcctShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceCRAcct;
                            sourceCRAcct = this.getCRAcct();
                            String copyCRAcct = ((String) strategy.copy(LocatorUtils.property(locator, "crAcct", sourceCRAcct), sourceCRAcct, (this.crAcct!= null)));
                            copy.setCRAcct(copyCRAcct);
                        } else {
                            if (crAcctShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.crAcct = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new SearchTransactionsResponse.TrxnsData.TrxnData();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof SearchTransactionsResponse.TrxnsData.TrxnData) {
                    final SearchTransactionsResponse.TrxnsData.TrxnData target = this;
                    final SearchTransactionsResponse.TrxnsData.TrxnData leftObject = ((SearchTransactionsResponse.TrxnsData.TrxnData) left);
                    final SearchTransactionsResponse.TrxnsData.TrxnData rightObject = ((SearchTransactionsResponse.TrxnsData.TrxnData) right);
                    {
                        Boolean trxnIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnID!= null), (rightObject.trxnID!= null));
                        if (trxnIDShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsTrxnID;
                            lhsTrxnID = leftObject.getTrxnID();
                            String rhsTrxnID;
                            rhsTrxnID = rightObject.getTrxnID();
                            String mergedTrxnID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "trxnID", lhsTrxnID), LocatorUtils.property(rightLocator, "trxnID", rhsTrxnID), lhsTrxnID, rhsTrxnID, (leftObject.trxnID!= null), (rightObject.trxnID!= null)));
                            target.setTrxnID(mergedTrxnID);
                        } else {
                            if (trxnIDShouldBeMergedAndSet == Boolean.FALSE) {
                                target.trxnID = null;
                            }
                        }
                    }
                    {
                        Boolean clientIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.clientID!= null), (rightObject.clientID!= null));
                        if (clientIDShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsClientID;
                            lhsClientID = leftObject.getClientID();
                            String rhsClientID;
                            rhsClientID = rightObject.getClientID();
                            String mergedClientID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "clientID", lhsClientID), LocatorUtils.property(rightLocator, "clientID", rhsClientID), lhsClientID, rhsClientID, (leftObject.clientID!= null), (rightObject.clientID!= null)));
                            target.setClientID(mergedClientID);
                        } else {
                            if (clientIDShouldBeMergedAndSet == Boolean.FALSE) {
                                target.clientID = null;
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
                        Boolean trxnEfftDtShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnEfftDt!= null), (rightObject.trxnEfftDt!= null));
                        if (trxnEfftDtShouldBeMergedAndSet == Boolean.TRUE) {
                            XMLGregorianCalendar lhsTrxnEfftDt;
                            lhsTrxnEfftDt = leftObject.getTrxnEfftDt();
                            XMLGregorianCalendar rhsTrxnEfftDt;
                            rhsTrxnEfftDt = rightObject.getTrxnEfftDt();
                            XMLGregorianCalendar mergedTrxnEfftDt = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "trxnEfftDt", lhsTrxnEfftDt), LocatorUtils.property(rightLocator, "trxnEfftDt", rhsTrxnEfftDt), lhsTrxnEfftDt, rhsTrxnEfftDt, (leftObject.trxnEfftDt!= null), (rightObject.trxnEfftDt!= null)));
                            target.setTrxnEfftDt(mergedTrxnEfftDt);
                        } else {
                            if (trxnEfftDtShouldBeMergedAndSet == Boolean.FALSE) {
                                target.trxnEfftDt = null;
                            }
                        }
                    }
                    {
                        Boolean trxnServiceCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnServiceCode!= null), (rightObject.trxnServiceCode!= null));
                        if (trxnServiceCodeShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsTrxnServiceCode;
                            lhsTrxnServiceCode = leftObject.getTrxnServiceCode();
                            String rhsTrxnServiceCode;
                            rhsTrxnServiceCode = rightObject.getTrxnServiceCode();
                            String mergedTrxnServiceCode = ((String) strategy.merge(LocatorUtils.property(leftLocator, "trxnServiceCode", lhsTrxnServiceCode), LocatorUtils.property(rightLocator, "trxnServiceCode", rhsTrxnServiceCode), lhsTrxnServiceCode, rhsTrxnServiceCode, (leftObject.trxnServiceCode!= null), (rightObject.trxnServiceCode!= null)));
                            target.setTrxnServiceCode(mergedTrxnServiceCode);
                        } else {
                            if (trxnServiceCodeShouldBeMergedAndSet == Boolean.FALSE) {
                                target.trxnServiceCode = null;
                            }
                        }
                    }
                    {
                        Boolean trxnServiceRefNumberShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnServiceRefNumber!= null), (rightObject.trxnServiceRefNumber!= null));
                        if (trxnServiceRefNumberShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsTrxnServiceRefNumber;
                            lhsTrxnServiceRefNumber = leftObject.getTrxnServiceRefNumber();
                            String rhsTrxnServiceRefNumber;
                            rhsTrxnServiceRefNumber = rightObject.getTrxnServiceRefNumber();
                            String mergedTrxnServiceRefNumber = ((String) strategy.merge(LocatorUtils.property(leftLocator, "trxnServiceRefNumber", lhsTrxnServiceRefNumber), LocatorUtils.property(rightLocator, "trxnServiceRefNumber", rhsTrxnServiceRefNumber), lhsTrxnServiceRefNumber, rhsTrxnServiceRefNumber, (leftObject.trxnServiceRefNumber!= null), (rightObject.trxnServiceRefNumber!= null)));
                            target.setTrxnServiceRefNumber(mergedTrxnServiceRefNumber);
                        } else {
                            if (trxnServiceRefNumberShouldBeMergedAndSet == Boolean.FALSE) {
                                target.trxnServiceRefNumber = null;
                            }
                        }
                    }
                    {
                        Boolean trxnAmountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, true, true);
                        if (trxnAmountShouldBeMergedAndSet == Boolean.TRUE) {
                            double lhsTrxnAmount;
                            lhsTrxnAmount = leftObject.getTrxnAmount();
                            double rhsTrxnAmount;
                            rhsTrxnAmount = rightObject.getTrxnAmount();
                            double mergedTrxnAmount = ((double) strategy.merge(LocatorUtils.property(leftLocator, "trxnAmount", lhsTrxnAmount), LocatorUtils.property(rightLocator, "trxnAmount", rhsTrxnAmount), lhsTrxnAmount, rhsTrxnAmount, true, true));
                            target.setTrxnAmount(mergedTrxnAmount);
                        } else {
                            if (trxnAmountShouldBeMergedAndSet == Boolean.FALSE) {
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
                        Boolean trxTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxType!= null), (rightObject.trxType!= null));
                        if (trxTypeShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsTrxType;
                            lhsTrxType = leftObject.getTrxType();
                            String rhsTrxType;
                            rhsTrxType = rightObject.getTrxType();
                            String mergedTrxType = ((String) strategy.merge(LocatorUtils.property(leftLocator, "trxType", lhsTrxType), LocatorUtils.property(rightLocator, "trxType", rhsTrxType), lhsTrxType, rhsTrxType, (leftObject.trxType!= null), (rightObject.trxType!= null)));
                            target.setTrxType(mergedTrxType);
                        } else {
                            if (trxTypeShouldBeMergedAndSet == Boolean.FALSE) {
                                target.trxType = null;
                            }
                        }
                    }
                    {
                        Boolean trxSubTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxSubType!= null), (rightObject.trxSubType!= null));
                        if (trxSubTypeShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsTrxSubType;
                            lhsTrxSubType = leftObject.getTrxSubType();
                            String rhsTrxSubType;
                            rhsTrxSubType = rightObject.getTrxSubType();
                            String mergedTrxSubType = ((String) strategy.merge(LocatorUtils.property(leftLocator, "trxSubType", lhsTrxSubType), LocatorUtils.property(rightLocator, "trxSubType", rhsTrxSubType), lhsTrxSubType, rhsTrxSubType, (leftObject.trxSubType!= null), (rightObject.trxSubType!= null)));
                            target.setTrxSubType(mergedTrxSubType);
                        } else {
                            if (trxSubTypeShouldBeMergedAndSet == Boolean.FALSE) {
                                target.trxSubType = null;
                            }
                        }
                    }
                    {
                        Boolean trxnStatusShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnStatus!= null), (rightObject.trxnStatus!= null));
                        if (trxnStatusShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsTrxnStatus;
                            lhsTrxnStatus = leftObject.getTrxnStatus();
                            String rhsTrxnStatus;
                            rhsTrxnStatus = rightObject.getTrxnStatus();
                            String mergedTrxnStatus = ((String) strategy.merge(LocatorUtils.property(leftLocator, "trxnStatus", lhsTrxnStatus), LocatorUtils.property(rightLocator, "trxnStatus", rhsTrxnStatus), lhsTrxnStatus, rhsTrxnStatus, (leftObject.trxnStatus!= null), (rightObject.trxnStatus!= null)));
                            target.setTrxnStatus(mergedTrxnStatus);
                        } else {
                            if (trxnStatusShouldBeMergedAndSet == Boolean.FALSE) {
                                target.trxnStatus = null;
                            }
                        }
                    }
                    {
                        Boolean drAcctShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.drAcct!= null), (rightObject.drAcct!= null));
                        if (drAcctShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsDRAcct;
                            lhsDRAcct = leftObject.getDRAcct();
                            String rhsDRAcct;
                            rhsDRAcct = rightObject.getDRAcct();
                            String mergedDRAcct = ((String) strategy.merge(LocatorUtils.property(leftLocator, "drAcct", lhsDRAcct), LocatorUtils.property(rightLocator, "drAcct", rhsDRAcct), lhsDRAcct, rhsDRAcct, (leftObject.drAcct!= null), (rightObject.drAcct!= null)));
                            target.setDRAcct(mergedDRAcct);
                        } else {
                            if (drAcctShouldBeMergedAndSet == Boolean.FALSE) {
                                target.drAcct = null;
                            }
                        }
                    }
                    {
                        Boolean crAcctShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.crAcct!= null), (rightObject.crAcct!= null));
                        if (crAcctShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsCRAcct;
                            lhsCRAcct = leftObject.getCRAcct();
                            String rhsCRAcct;
                            rhsCRAcct = rightObject.getCRAcct();
                            String mergedCRAcct = ((String) strategy.merge(LocatorUtils.property(leftLocator, "crAcct", lhsCRAcct), LocatorUtils.property(rightLocator, "crAcct", rhsCRAcct), lhsCRAcct, rhsCRAcct, (leftObject.crAcct!= null), (rightObject.crAcct!= null)));
                            target.setCRAcct(mergedCRAcct);
                        } else {
                            if (crAcctShouldBeMergedAndSet == Boolean.FALSE) {
                                target.crAcct = null;
                            }
                        }
                    }
                }
            }

        }

    }

}
