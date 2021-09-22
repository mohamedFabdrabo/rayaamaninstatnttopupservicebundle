
package com.paymentplaform.raya.gate.summary;

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
 * <p>Java class for Daily_Summary_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Daily_Summary_Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://raya.paymentplaform.com/gate}Status"/&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AsynchUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SummaryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Balances" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OpenBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="AvailBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="ClosingBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="OutStandingBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                   &lt;element name="DueBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TrxnsSummary"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TrxnSummary" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FinancialTrxType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TrxNature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *                             &lt;element name="Currency" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode"/&gt;
 *                             &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "Daily_Summary_Response", namespace = "http://raya.paymentplaform.com/gate/summary", propOrder = {
    "status",
    "rqUID",
    "asynchUID",
    "summaryDate",
    "balances",
    "trxnsSummary",
    "extraAttributes",
    "notifications",
    "any"
})
public class DailySummaryResponse implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsynchUID")
    protected String asynchUID;
    @XmlElement(name = "SummaryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar summaryDate;
    @XmlElement(name = "Balances")
    protected DailySummaryResponse.Balances balances;
    @XmlElement(name = "TrxnsSummary", required = true)
    protected DailySummaryResponse.TrxnsSummary trxnsSummary;
    @XmlElement(name = "ExtraAttributes")
    protected List<DailySummaryResponse.ExtraAttributes> extraAttributes;
    @XmlElement(required = true)
    protected DailySummaryResponse.Notifications notifications;
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
     * Gets the value of the summaryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSummaryDate() {
        return summaryDate;
    }

    /**
     * Sets the value of the summaryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSummaryDate(XMLGregorianCalendar value) {
        this.summaryDate = value;
    }

    /**
     * Gets the value of the balances property.
     * 
     * @return
     *     possible object is
     *     {@link DailySummaryResponse.Balances }
     *     
     */
    public DailySummaryResponse.Balances getBalances() {
        return balances;
    }

    /**
     * Sets the value of the balances property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailySummaryResponse.Balances }
     *     
     */
    public void setBalances(DailySummaryResponse.Balances value) {
        this.balances = value;
    }

    /**
     * Gets the value of the trxnsSummary property.
     * 
     * @return
     *     possible object is
     *     {@link DailySummaryResponse.TrxnsSummary }
     *     
     */
    public DailySummaryResponse.TrxnsSummary getTrxnsSummary() {
        return trxnsSummary;
    }

    /**
     * Sets the value of the trxnsSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailySummaryResponse.TrxnsSummary }
     *     
     */
    public void setTrxnsSummary(DailySummaryResponse.TrxnsSummary value) {
        this.trxnsSummary = value;
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
     * {@link DailySummaryResponse.ExtraAttributes }
     * 
     * 
     */
    public List<DailySummaryResponse.ExtraAttributes> getExtraAttributes() {
        if (extraAttributes == null) {
            extraAttributes = new ArrayList<DailySummaryResponse.ExtraAttributes>();
        }
        return this.extraAttributes;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link DailySummaryResponse.Notifications }
     *     
     */
    public DailySummaryResponse.Notifications getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailySummaryResponse.Notifications }
     *     
     */
    public void setNotifications(DailySummaryResponse.Notifications value) {
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
            XMLGregorianCalendar theSummaryDate;
            theSummaryDate = this.getSummaryDate();
            strategy.appendField(locator, this, "summaryDate", buffer, theSummaryDate, (this.summaryDate!= null));
        }
        {
            DailySummaryResponse.Balances theBalances;
            theBalances = this.getBalances();
            strategy.appendField(locator, this, "balances", buffer, theBalances, (this.balances!= null));
        }
        {
            DailySummaryResponse.TrxnsSummary theTrxnsSummary;
            theTrxnsSummary = this.getTrxnsSummary();
            strategy.appendField(locator, this, "trxnsSummary", buffer, theTrxnsSummary, (this.trxnsSummary!= null));
        }
        {
            List<DailySummaryResponse.ExtraAttributes> theExtraAttributes;
            theExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            strategy.appendField(locator, this, "extraAttributes", buffer, theExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
        }
        {
            DailySummaryResponse.Notifications theNotifications;
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
        final DailySummaryResponse that = ((DailySummaryResponse) object);
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
            XMLGregorianCalendar lhsSummaryDate;
            lhsSummaryDate = this.getSummaryDate();
            XMLGregorianCalendar rhsSummaryDate;
            rhsSummaryDate = that.getSummaryDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "summaryDate", lhsSummaryDate), LocatorUtils.property(thatLocator, "summaryDate", rhsSummaryDate), lhsSummaryDate, rhsSummaryDate, (this.summaryDate!= null), (that.summaryDate!= null))) {
                return false;
            }
        }
        {
            DailySummaryResponse.Balances lhsBalances;
            lhsBalances = this.getBalances();
            DailySummaryResponse.Balances rhsBalances;
            rhsBalances = that.getBalances();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "balances", lhsBalances), LocatorUtils.property(thatLocator, "balances", rhsBalances), lhsBalances, rhsBalances, (this.balances!= null), (that.balances!= null))) {
                return false;
            }
        }
        {
            DailySummaryResponse.TrxnsSummary lhsTrxnsSummary;
            lhsTrxnsSummary = this.getTrxnsSummary();
            DailySummaryResponse.TrxnsSummary rhsTrxnsSummary;
            rhsTrxnsSummary = that.getTrxnsSummary();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnsSummary", lhsTrxnsSummary), LocatorUtils.property(thatLocator, "trxnsSummary", rhsTrxnsSummary), lhsTrxnsSummary, rhsTrxnsSummary, (this.trxnsSummary!= null), (that.trxnsSummary!= null))) {
                return false;
            }
        }
        {
            List<DailySummaryResponse.ExtraAttributes> lhsExtraAttributes;
            lhsExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            List<DailySummaryResponse.ExtraAttributes> rhsExtraAttributes;
            rhsExtraAttributes = (((that.extraAttributes!= null)&&(!that.extraAttributes.isEmpty()))?that.getExtraAttributes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(thatLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())), ((that.extraAttributes!= null)&&(!that.extraAttributes.isEmpty())))) {
                return false;
            }
        }
        {
            DailySummaryResponse.Notifications lhsNotifications;
            lhsNotifications = this.getNotifications();
            DailySummaryResponse.Notifications rhsNotifications;
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
            XMLGregorianCalendar theSummaryDate;
            theSummaryDate = this.getSummaryDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "summaryDate", theSummaryDate), currentHashCode, theSummaryDate, (this.summaryDate!= null));
        }
        {
            DailySummaryResponse.Balances theBalances;
            theBalances = this.getBalances();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "balances", theBalances), currentHashCode, theBalances, (this.balances!= null));
        }
        {
            DailySummaryResponse.TrxnsSummary theTrxnsSummary;
            theTrxnsSummary = this.getTrxnsSummary();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnsSummary", theTrxnsSummary), currentHashCode, theTrxnsSummary, (this.trxnsSummary!= null));
        }
        {
            List<DailySummaryResponse.ExtraAttributes> theExtraAttributes;
            theExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extraAttributes", theExtraAttributes), currentHashCode, theExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
        }
        {
            DailySummaryResponse.Notifications theNotifications;
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
        if (draftCopy instanceof DailySummaryResponse) {
            final DailySummaryResponse copy = ((DailySummaryResponse) draftCopy);
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
                Boolean summaryDateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.summaryDate!= null));
                if (summaryDateShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceSummaryDate;
                    sourceSummaryDate = this.getSummaryDate();
                    XMLGregorianCalendar copySummaryDate = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "summaryDate", sourceSummaryDate), sourceSummaryDate, (this.summaryDate!= null)));
                    copy.setSummaryDate(copySummaryDate);
                } else {
                    if (summaryDateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.summaryDate = null;
                    }
                }
            }
            {
                Boolean balancesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.balances!= null));
                if (balancesShouldBeCopiedAndSet == Boolean.TRUE) {
                    DailySummaryResponse.Balances sourceBalances;
                    sourceBalances = this.getBalances();
                    DailySummaryResponse.Balances copyBalances = ((DailySummaryResponse.Balances) strategy.copy(LocatorUtils.property(locator, "balances", sourceBalances), sourceBalances, (this.balances!= null)));
                    copy.setBalances(copyBalances);
                } else {
                    if (balancesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.balances = null;
                    }
                }
            }
            {
                Boolean trxnsSummaryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxnsSummary!= null));
                if (trxnsSummaryShouldBeCopiedAndSet == Boolean.TRUE) {
                    DailySummaryResponse.TrxnsSummary sourceTrxnsSummary;
                    sourceTrxnsSummary = this.getTrxnsSummary();
                    DailySummaryResponse.TrxnsSummary copyTrxnsSummary = ((DailySummaryResponse.TrxnsSummary) strategy.copy(LocatorUtils.property(locator, "trxnsSummary", sourceTrxnsSummary), sourceTrxnsSummary, (this.trxnsSummary!= null)));
                    copy.setTrxnsSummary(copyTrxnsSummary);
                } else {
                    if (trxnsSummaryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trxnsSummary = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<DailySummaryResponse.ExtraAttributes> sourceExtraAttributes;
                    sourceExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
                    @SuppressWarnings("unchecked")
                    List<DailySummaryResponse.ExtraAttributes> copyExtraAttributes = ((List<DailySummaryResponse.ExtraAttributes> ) strategy.copy(LocatorUtils.property(locator, "extraAttributes", sourceExtraAttributes), sourceExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))));
                    copy.extraAttributes = null;
                    if (copyExtraAttributes!= null) {
                        List<DailySummaryResponse.ExtraAttributes> uniqueExtraAttributesl = copy.getExtraAttributes();
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
                    DailySummaryResponse.Notifications sourceNotifications;
                    sourceNotifications = this.getNotifications();
                    DailySummaryResponse.Notifications copyNotifications = ((DailySummaryResponse.Notifications) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, (this.notifications!= null)));
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
        return new DailySummaryResponse();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof DailySummaryResponse) {
            final DailySummaryResponse target = this;
            final DailySummaryResponse leftObject = ((DailySummaryResponse) left);
            final DailySummaryResponse rightObject = ((DailySummaryResponse) right);
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
                Boolean summaryDateShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.summaryDate!= null), (rightObject.summaryDate!= null));
                if (summaryDateShouldBeMergedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar lhsSummaryDate;
                    lhsSummaryDate = leftObject.getSummaryDate();
                    XMLGregorianCalendar rhsSummaryDate;
                    rhsSummaryDate = rightObject.getSummaryDate();
                    XMLGregorianCalendar mergedSummaryDate = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "summaryDate", lhsSummaryDate), LocatorUtils.property(rightLocator, "summaryDate", rhsSummaryDate), lhsSummaryDate, rhsSummaryDate, (leftObject.summaryDate!= null), (rightObject.summaryDate!= null)));
                    target.setSummaryDate(mergedSummaryDate);
                } else {
                    if (summaryDateShouldBeMergedAndSet == Boolean.FALSE) {
                        target.summaryDate = null;
                    }
                }
            }
            {
                Boolean balancesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.balances!= null), (rightObject.balances!= null));
                if (balancesShouldBeMergedAndSet == Boolean.TRUE) {
                    DailySummaryResponse.Balances lhsBalances;
                    lhsBalances = leftObject.getBalances();
                    DailySummaryResponse.Balances rhsBalances;
                    rhsBalances = rightObject.getBalances();
                    DailySummaryResponse.Balances mergedBalances = ((DailySummaryResponse.Balances) strategy.merge(LocatorUtils.property(leftLocator, "balances", lhsBalances), LocatorUtils.property(rightLocator, "balances", rhsBalances), lhsBalances, rhsBalances, (leftObject.balances!= null), (rightObject.balances!= null)));
                    target.setBalances(mergedBalances);
                } else {
                    if (balancesShouldBeMergedAndSet == Boolean.FALSE) {
                        target.balances = null;
                    }
                }
            }
            {
                Boolean trxnsSummaryShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxnsSummary!= null), (rightObject.trxnsSummary!= null));
                if (trxnsSummaryShouldBeMergedAndSet == Boolean.TRUE) {
                    DailySummaryResponse.TrxnsSummary lhsTrxnsSummary;
                    lhsTrxnsSummary = leftObject.getTrxnsSummary();
                    DailySummaryResponse.TrxnsSummary rhsTrxnsSummary;
                    rhsTrxnsSummary = rightObject.getTrxnsSummary();
                    DailySummaryResponse.TrxnsSummary mergedTrxnsSummary = ((DailySummaryResponse.TrxnsSummary) strategy.merge(LocatorUtils.property(leftLocator, "trxnsSummary", lhsTrxnsSummary), LocatorUtils.property(rightLocator, "trxnsSummary", rhsTrxnsSummary), lhsTrxnsSummary, rhsTrxnsSummary, (leftObject.trxnsSummary!= null), (rightObject.trxnsSummary!= null)));
                    target.setTrxnsSummary(mergedTrxnsSummary);
                } else {
                    if (trxnsSummaryShouldBeMergedAndSet == Boolean.FALSE) {
                        target.trxnsSummary = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeMergedAndSet == Boolean.TRUE) {
                    List<DailySummaryResponse.ExtraAttributes> lhsExtraAttributes;
                    lhsExtraAttributes = (((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty()))?leftObject.getExtraAttributes():null);
                    List<DailySummaryResponse.ExtraAttributes> rhsExtraAttributes;
                    rhsExtraAttributes = (((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))?rightObject.getExtraAttributes():null);
                    List<DailySummaryResponse.ExtraAttributes> mergedExtraAttributes = ((List<DailySummaryResponse.ExtraAttributes> ) strategy.merge(LocatorUtils.property(leftLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(rightLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))));
                    target.extraAttributes = null;
                    if (mergedExtraAttributes!= null) {
                        List<DailySummaryResponse.ExtraAttributes> uniqueExtraAttributesl = target.getExtraAttributes();
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
                    DailySummaryResponse.Notifications lhsNotifications;
                    lhsNotifications = leftObject.getNotifications();
                    DailySummaryResponse.Notifications rhsNotifications;
                    rhsNotifications = rightObject.getNotifications();
                    DailySummaryResponse.Notifications mergedNotifications = ((DailySummaryResponse.Notifications) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, (leftObject.notifications!= null), (rightObject.notifications!= null)));
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

    public void setExtraAttributes(List<DailySummaryResponse.ExtraAttributes> value) {
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
     *         &lt;element name="OpenBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="AvailBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
     *         &lt;element name="ClosingBalance" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
        "openBalance",
        "availBalance",
        "closingBalance",
        "outStandingBalance",
        "dueBalance"
    })
    public static class Balances implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "OpenBalance")
        protected Double openBalance;
        @XmlElement(name = "AvailBalance")
        protected Double availBalance;
        @XmlElement(name = "ClosingBalance")
        protected Double closingBalance;
        @XmlElement(name = "OutStandingBalance")
        protected Double outStandingBalance;
        @XmlElement(name = "DueBalance")
        protected Double dueBalance;

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
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getAvailBalance() {
            return availBalance;
        }

        /**
         * Sets the value of the availBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setAvailBalance(Double value) {
            this.availBalance = value;
        }

        /**
         * Gets the value of the closingBalance property.
         * 
         * @return
         *     possible object is
         *     {@link Double }
         *     
         */
        public Double getClosingBalance() {
            return closingBalance;
        }

        /**
         * Sets the value of the closingBalance property.
         * 
         * @param value
         *     allowed object is
         *     {@link Double }
         *     
         */
        public void setClosingBalance(Double value) {
            this.closingBalance = value;
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
                Double theOpenBalance;
                theOpenBalance = this.getOpenBalance();
                strategy.appendField(locator, this, "openBalance", buffer, theOpenBalance, (this.openBalance!= null));
            }
            {
                Double theAvailBalance;
                theAvailBalance = this.getAvailBalance();
                strategy.appendField(locator, this, "availBalance", buffer, theAvailBalance, (this.availBalance!= null));
            }
            {
                Double theClosingBalance;
                theClosingBalance = this.getClosingBalance();
                strategy.appendField(locator, this, "closingBalance", buffer, theClosingBalance, (this.closingBalance!= null));
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
            final DailySummaryResponse.Balances that = ((DailySummaryResponse.Balances) object);
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
                Double lhsAvailBalance;
                lhsAvailBalance = this.getAvailBalance();
                Double rhsAvailBalance;
                rhsAvailBalance = that.getAvailBalance();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "availBalance", lhsAvailBalance), LocatorUtils.property(thatLocator, "availBalance", rhsAvailBalance), lhsAvailBalance, rhsAvailBalance, (this.availBalance!= null), (that.availBalance!= null))) {
                    return false;
                }
            }
            {
                Double lhsClosingBalance;
                lhsClosingBalance = this.getClosingBalance();
                Double rhsClosingBalance;
                rhsClosingBalance = that.getClosingBalance();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "closingBalance", lhsClosingBalance), LocatorUtils.property(thatLocator, "closingBalance", rhsClosingBalance), lhsClosingBalance, rhsClosingBalance, (this.closingBalance!= null), (that.closingBalance!= null))) {
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
                Double theOpenBalance;
                theOpenBalance = this.getOpenBalance();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "openBalance", theOpenBalance), currentHashCode, theOpenBalance, (this.openBalance!= null));
            }
            {
                Double theAvailBalance;
                theAvailBalance = this.getAvailBalance();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "availBalance", theAvailBalance), currentHashCode, theAvailBalance, (this.availBalance!= null));
            }
            {
                Double theClosingBalance;
                theClosingBalance = this.getClosingBalance();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "closingBalance", theClosingBalance), currentHashCode, theClosingBalance, (this.closingBalance!= null));
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
            if (draftCopy instanceof DailySummaryResponse.Balances) {
                final DailySummaryResponse.Balances copy = ((DailySummaryResponse.Balances) draftCopy);
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
                    Boolean availBalanceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.availBalance!= null));
                    if (availBalanceShouldBeCopiedAndSet == Boolean.TRUE) {
                        Double sourceAvailBalance;
                        sourceAvailBalance = this.getAvailBalance();
                        Double copyAvailBalance = ((Double) strategy.copy(LocatorUtils.property(locator, "availBalance", sourceAvailBalance), sourceAvailBalance, (this.availBalance!= null)));
                        copy.setAvailBalance(copyAvailBalance);
                    } else {
                        if (availBalanceShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.availBalance = null;
                        }
                    }
                }
                {
                    Boolean closingBalanceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.closingBalance!= null));
                    if (closingBalanceShouldBeCopiedAndSet == Boolean.TRUE) {
                        Double sourceClosingBalance;
                        sourceClosingBalance = this.getClosingBalance();
                        Double copyClosingBalance = ((Double) strategy.copy(LocatorUtils.property(locator, "closingBalance", sourceClosingBalance), sourceClosingBalance, (this.closingBalance!= null)));
                        copy.setClosingBalance(copyClosingBalance);
                    } else {
                        if (closingBalanceShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.closingBalance = null;
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
            return new DailySummaryResponse.Balances();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof DailySummaryResponse.Balances) {
                final DailySummaryResponse.Balances target = this;
                final DailySummaryResponse.Balances leftObject = ((DailySummaryResponse.Balances) left);
                final DailySummaryResponse.Balances rightObject = ((DailySummaryResponse.Balances) right);
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
                    Boolean availBalanceShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.availBalance!= null), (rightObject.availBalance!= null));
                    if (availBalanceShouldBeMergedAndSet == Boolean.TRUE) {
                        Double lhsAvailBalance;
                        lhsAvailBalance = leftObject.getAvailBalance();
                        Double rhsAvailBalance;
                        rhsAvailBalance = rightObject.getAvailBalance();
                        Double mergedAvailBalance = ((Double) strategy.merge(LocatorUtils.property(leftLocator, "availBalance", lhsAvailBalance), LocatorUtils.property(rightLocator, "availBalance", rhsAvailBalance), lhsAvailBalance, rhsAvailBalance, (leftObject.availBalance!= null), (rightObject.availBalance!= null)));
                        target.setAvailBalance(mergedAvailBalance);
                    } else {
                        if (availBalanceShouldBeMergedAndSet == Boolean.FALSE) {
                            target.availBalance = null;
                        }
                    }
                }
                {
                    Boolean closingBalanceShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.closingBalance!= null), (rightObject.closingBalance!= null));
                    if (closingBalanceShouldBeMergedAndSet == Boolean.TRUE) {
                        Double lhsClosingBalance;
                        lhsClosingBalance = leftObject.getClosingBalance();
                        Double rhsClosingBalance;
                        rhsClosingBalance = rightObject.getClosingBalance();
                        Double mergedClosingBalance = ((Double) strategy.merge(LocatorUtils.property(leftLocator, "closingBalance", lhsClosingBalance), LocatorUtils.property(rightLocator, "closingBalance", rhsClosingBalance), lhsClosingBalance, rhsClosingBalance, (leftObject.closingBalance!= null), (rightObject.closingBalance!= null)));
                        target.setClosingBalance(mergedClosingBalance);
                    } else {
                        if (closingBalanceShouldBeMergedAndSet == Boolean.FALSE) {
                            target.closingBalance = null;
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
            final DailySummaryResponse.ExtraAttributes that = ((DailySummaryResponse.ExtraAttributes) object);
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
            if (draftCopy instanceof DailySummaryResponse.ExtraAttributes) {
                final DailySummaryResponse.ExtraAttributes copy = ((DailySummaryResponse.ExtraAttributes) draftCopy);
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
            return new DailySummaryResponse.ExtraAttributes();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof DailySummaryResponse.ExtraAttributes) {
                final DailySummaryResponse.ExtraAttributes target = this;
                final DailySummaryResponse.ExtraAttributes leftObject = ((DailySummaryResponse.ExtraAttributes) left);
                final DailySummaryResponse.ExtraAttributes rightObject = ((DailySummaryResponse.ExtraAttributes) right);
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
        protected List<DailySummaryResponse.Notifications.Notification> notifications;

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
         * {@link DailySummaryResponse.Notifications.Notification }
         * 
         * 
         */
        public List<DailySummaryResponse.Notifications.Notification> getNotifications() {
            if (notifications == null) {
                notifications = new ArrayList<DailySummaryResponse.Notifications.Notification>();
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
                List<DailySummaryResponse.Notifications.Notification> theNotifications;
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
            final DailySummaryResponse.Notifications that = ((DailySummaryResponse.Notifications) object);
            {
                List<DailySummaryResponse.Notifications.Notification> lhsNotifications;
                lhsNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                List<DailySummaryResponse.Notifications.Notification> rhsNotifications;
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
                List<DailySummaryResponse.Notifications.Notification> theNotifications;
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
            if (draftCopy instanceof DailySummaryResponse.Notifications) {
                final DailySummaryResponse.Notifications copy = ((DailySummaryResponse.Notifications) draftCopy);
                {
                    Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.notifications!= null)&&(!this.notifications.isEmpty())));
                    if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<DailySummaryResponse.Notifications.Notification> sourceNotifications;
                        sourceNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                        @SuppressWarnings("unchecked")
                        List<DailySummaryResponse.Notifications.Notification> copyNotifications = ((List<DailySummaryResponse.Notifications.Notification> ) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, ((this.notifications!= null)&&(!this.notifications.isEmpty()))));
                        copy.notifications = null;
                        if (copyNotifications!= null) {
                            List<DailySummaryResponse.Notifications.Notification> uniqueNotificationsl = copy.getNotifications();
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
            return new DailySummaryResponse.Notifications();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof DailySummaryResponse.Notifications) {
                final DailySummaryResponse.Notifications target = this;
                final DailySummaryResponse.Notifications leftObject = ((DailySummaryResponse.Notifications) left);
                final DailySummaryResponse.Notifications rightObject = ((DailySummaryResponse.Notifications) right);
                {
                    Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty())));
                    if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<DailySummaryResponse.Notifications.Notification> lhsNotifications;
                        lhsNotifications = (((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty()))?leftObject.getNotifications():null);
                        List<DailySummaryResponse.Notifications.Notification> rhsNotifications;
                        rhsNotifications = (((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))?rightObject.getNotifications():null);
                        List<DailySummaryResponse.Notifications.Notification> mergedNotifications = ((List<DailySummaryResponse.Notifications.Notification> ) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))));
                        target.notifications = null;
                        if (mergedNotifications!= null) {
                            List<DailySummaryResponse.Notifications.Notification> uniqueNotificationsl = target.getNotifications();
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

        public void setNotifications(List<DailySummaryResponse.Notifications.Notification> value) {
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
                final DailySummaryResponse.Notifications.Notification that = ((DailySummaryResponse.Notifications.Notification) object);
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
                if (draftCopy instanceof DailySummaryResponse.Notifications.Notification) {
                    final DailySummaryResponse.Notifications.Notification copy = ((DailySummaryResponse.Notifications.Notification) draftCopy);
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
                return new DailySummaryResponse.Notifications.Notification();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof DailySummaryResponse.Notifications.Notification) {
                    final DailySummaryResponse.Notifications.Notification target = this;
                    final DailySummaryResponse.Notifications.Notification leftObject = ((DailySummaryResponse.Notifications.Notification) left);
                    final DailySummaryResponse.Notifications.Notification rightObject = ((DailySummaryResponse.Notifications.Notification) right);
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
     *         &lt;element name="TrxnSummary" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FinancialTrxType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TrxNature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
     *                   &lt;element name="Currency" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode"/&gt;
     *                   &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
        "trxnSummaries"
    })
    public static class TrxnsSummary implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "TrxnSummary", required = true)
        protected List<DailySummaryResponse.TrxnsSummary.TrxnSummary> trxnSummaries;

        /**
         * Gets the value of the trxnSummaries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trxnSummaries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrxnSummaries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DailySummaryResponse.TrxnsSummary.TrxnSummary }
         * 
         * 
         */
        public List<DailySummaryResponse.TrxnsSummary.TrxnSummary> getTrxnSummaries() {
            if (trxnSummaries == null) {
                trxnSummaries = new ArrayList<DailySummaryResponse.TrxnsSummary.TrxnSummary>();
            }
            return this.trxnSummaries;
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
                List<DailySummaryResponse.TrxnsSummary.TrxnSummary> theTrxnSummaries;
                theTrxnSummaries = (((this.trxnSummaries!= null)&&(!this.trxnSummaries.isEmpty()))?this.getTrxnSummaries():null);
                strategy.appendField(locator, this, "trxnSummaries", buffer, theTrxnSummaries, ((this.trxnSummaries!= null)&&(!this.trxnSummaries.isEmpty())));
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
            final DailySummaryResponse.TrxnsSummary that = ((DailySummaryResponse.TrxnsSummary) object);
            {
                List<DailySummaryResponse.TrxnsSummary.TrxnSummary> lhsTrxnSummaries;
                lhsTrxnSummaries = (((this.trxnSummaries!= null)&&(!this.trxnSummaries.isEmpty()))?this.getTrxnSummaries():null);
                List<DailySummaryResponse.TrxnsSummary.TrxnSummary> rhsTrxnSummaries;
                rhsTrxnSummaries = (((that.trxnSummaries!= null)&&(!that.trxnSummaries.isEmpty()))?that.getTrxnSummaries():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "trxnSummaries", lhsTrxnSummaries), LocatorUtils.property(thatLocator, "trxnSummaries", rhsTrxnSummaries), lhsTrxnSummaries, rhsTrxnSummaries, ((this.trxnSummaries!= null)&&(!this.trxnSummaries.isEmpty())), ((that.trxnSummaries!= null)&&(!that.trxnSummaries.isEmpty())))) {
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
                List<DailySummaryResponse.TrxnsSummary.TrxnSummary> theTrxnSummaries;
                theTrxnSummaries = (((this.trxnSummaries!= null)&&(!this.trxnSummaries.isEmpty()))?this.getTrxnSummaries():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxnSummaries", theTrxnSummaries), currentHashCode, theTrxnSummaries, ((this.trxnSummaries!= null)&&(!this.trxnSummaries.isEmpty())));
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
            if (draftCopy instanceof DailySummaryResponse.TrxnsSummary) {
                final DailySummaryResponse.TrxnsSummary copy = ((DailySummaryResponse.TrxnsSummary) draftCopy);
                {
                    Boolean trxnSummariesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.trxnSummaries!= null)&&(!this.trxnSummaries.isEmpty())));
                    if (trxnSummariesShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<DailySummaryResponse.TrxnsSummary.TrxnSummary> sourceTrxnSummaries;
                        sourceTrxnSummaries = (((this.trxnSummaries!= null)&&(!this.trxnSummaries.isEmpty()))?this.getTrxnSummaries():null);
                        @SuppressWarnings("unchecked")
                        List<DailySummaryResponse.TrxnsSummary.TrxnSummary> copyTrxnSummaries = ((List<DailySummaryResponse.TrxnsSummary.TrxnSummary> ) strategy.copy(LocatorUtils.property(locator, "trxnSummaries", sourceTrxnSummaries), sourceTrxnSummaries, ((this.trxnSummaries!= null)&&(!this.trxnSummaries.isEmpty()))));
                        copy.trxnSummaries = null;
                        if (copyTrxnSummaries!= null) {
                            List<DailySummaryResponse.TrxnsSummary.TrxnSummary> uniqueTrxnSummariesl = copy.getTrxnSummaries();
                            uniqueTrxnSummariesl.addAll(copyTrxnSummaries);
                        }
                    } else {
                        if (trxnSummariesShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.trxnSummaries = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new DailySummaryResponse.TrxnsSummary();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof DailySummaryResponse.TrxnsSummary) {
                final DailySummaryResponse.TrxnsSummary target = this;
                final DailySummaryResponse.TrxnsSummary leftObject = ((DailySummaryResponse.TrxnsSummary) left);
                final DailySummaryResponse.TrxnsSummary rightObject = ((DailySummaryResponse.TrxnsSummary) right);
                {
                    Boolean trxnSummariesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.trxnSummaries!= null)&&(!leftObject.trxnSummaries.isEmpty())), ((rightObject.trxnSummaries!= null)&&(!rightObject.trxnSummaries.isEmpty())));
                    if (trxnSummariesShouldBeMergedAndSet == Boolean.TRUE) {
                        List<DailySummaryResponse.TrxnsSummary.TrxnSummary> lhsTrxnSummaries;
                        lhsTrxnSummaries = (((leftObject.trxnSummaries!= null)&&(!leftObject.trxnSummaries.isEmpty()))?leftObject.getTrxnSummaries():null);
                        List<DailySummaryResponse.TrxnsSummary.TrxnSummary> rhsTrxnSummaries;
                        rhsTrxnSummaries = (((rightObject.trxnSummaries!= null)&&(!rightObject.trxnSummaries.isEmpty()))?rightObject.getTrxnSummaries():null);
                        List<DailySummaryResponse.TrxnsSummary.TrxnSummary> mergedTrxnSummaries = ((List<DailySummaryResponse.TrxnsSummary.TrxnSummary> ) strategy.merge(LocatorUtils.property(leftLocator, "trxnSummaries", lhsTrxnSummaries), LocatorUtils.property(rightLocator, "trxnSummaries", rhsTrxnSummaries), lhsTrxnSummaries, rhsTrxnSummaries, ((leftObject.trxnSummaries!= null)&&(!leftObject.trxnSummaries.isEmpty())), ((rightObject.trxnSummaries!= null)&&(!rightObject.trxnSummaries.isEmpty()))));
                        target.trxnSummaries = null;
                        if (mergedTrxnSummaries!= null) {
                            List<DailySummaryResponse.TrxnsSummary.TrxnSummary> uniqueTrxnSummariesl = target.getTrxnSummaries();
                            uniqueTrxnSummariesl.addAll(mergedTrxnSummaries);
                        }
                    } else {
                        if (trxnSummariesShouldBeMergedAndSet == Boolean.FALSE) {
                            target.trxnSummaries = null;
                        }
                    }
                }
            }
        }

        public void setTrxnSummaries(List<DailySummaryResponse.TrxnsSummary.TrxnSummary> value) {
            this.trxnSummaries = value;
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
         *         &lt;element name="FinancialTrxType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TrxNature" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
         *         &lt;element name="Currency" type="{http://raya.paymentplaform.com/gate}EnumCurrencyCode"/&gt;
         *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TotalCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
            "financialTrxType",
            "trxNature",
            "totalAmount",
            "currency",
            "serviceCode",
            "totalCount"
        })
        public static class TrxnSummary implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            @XmlElement(name = "FinancialTrxType", required = true)
            protected String financialTrxType;
            @XmlElement(name = "TrxNature", required = true)
            protected String trxNature;
            @XmlElement(name = "TotalAmount")
            protected double totalAmount;
            @XmlElement(name = "Currency", required = true)
            @XmlSchemaType(name = "string")
            protected EnumCurrencyCode currency;
            @XmlElement(name = "ServiceCode", required = true)
            protected String serviceCode;
            @XmlElement(name = "TotalCount")
            protected int totalCount;

            /**
             * Gets the value of the financialTrxType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFinancialTrxType() {
                return financialTrxType;
            }

            /**
             * Sets the value of the financialTrxType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFinancialTrxType(String value) {
                this.financialTrxType = value;
            }

            /**
             * Gets the value of the trxNature property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTrxNature() {
                return trxNature;
            }

            /**
             * Sets the value of the trxNature property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTrxNature(String value) {
                this.trxNature = value;
            }

            /**
             * Gets the value of the totalAmount property.
             * 
             */
            public double getTotalAmount() {
                return totalAmount;
            }

            /**
             * Sets the value of the totalAmount property.
             * 
             */
            public void setTotalAmount(double value) {
                this.totalAmount = value;
            }

            /**
             * Gets the value of the currency property.
             * 
             * @return
             *     possible object is
             *     {@link EnumCurrencyCode }
             *     
             */
            public EnumCurrencyCode getCurrency() {
                return currency;
            }

            /**
             * Sets the value of the currency property.
             * 
             * @param value
             *     allowed object is
             *     {@link EnumCurrencyCode }
             *     
             */
            public void setCurrency(EnumCurrencyCode value) {
                this.currency = value;
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
             * Gets the value of the totalCount property.
             * 
             */
            public int getTotalCount() {
                return totalCount;
            }

            /**
             * Sets the value of the totalCount property.
             * 
             */
            public void setTotalCount(int value) {
                this.totalCount = value;
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
                    String theFinancialTrxType;
                    theFinancialTrxType = this.getFinancialTrxType();
                    strategy.appendField(locator, this, "financialTrxType", buffer, theFinancialTrxType, (this.financialTrxType!= null));
                }
                {
                    String theTrxNature;
                    theTrxNature = this.getTrxNature();
                    strategy.appendField(locator, this, "trxNature", buffer, theTrxNature, (this.trxNature!= null));
                }
                {
                    double theTotalAmount;
                    theTotalAmount = this.getTotalAmount();
                    strategy.appendField(locator, this, "totalAmount", buffer, theTotalAmount, true);
                }
                {
                    EnumCurrencyCode theCurrency;
                    theCurrency = this.getCurrency();
                    strategy.appendField(locator, this, "currency", buffer, theCurrency, (this.currency!= null));
                }
                {
                    String theServiceCode;
                    theServiceCode = this.getServiceCode();
                    strategy.appendField(locator, this, "serviceCode", buffer, theServiceCode, (this.serviceCode!= null));
                }
                {
                    int theTotalCount;
                    theTotalCount = this.getTotalCount();
                    strategy.appendField(locator, this, "totalCount", buffer, theTotalCount, true);
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
                final DailySummaryResponse.TrxnsSummary.TrxnSummary that = ((DailySummaryResponse.TrxnsSummary.TrxnSummary) object);
                {
                    String lhsFinancialTrxType;
                    lhsFinancialTrxType = this.getFinancialTrxType();
                    String rhsFinancialTrxType;
                    rhsFinancialTrxType = that.getFinancialTrxType();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "financialTrxType", lhsFinancialTrxType), LocatorUtils.property(thatLocator, "financialTrxType", rhsFinancialTrxType), lhsFinancialTrxType, rhsFinancialTrxType, (this.financialTrxType!= null), (that.financialTrxType!= null))) {
                        return false;
                    }
                }
                {
                    String lhsTrxNature;
                    lhsTrxNature = this.getTrxNature();
                    String rhsTrxNature;
                    rhsTrxNature = that.getTrxNature();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "trxNature", lhsTrxNature), LocatorUtils.property(thatLocator, "trxNature", rhsTrxNature), lhsTrxNature, rhsTrxNature, (this.trxNature!= null), (that.trxNature!= null))) {
                        return false;
                    }
                }
                {
                    double lhsTotalAmount;
                    lhsTotalAmount = this.getTotalAmount();
                    double rhsTotalAmount;
                    rhsTotalAmount = that.getTotalAmount();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "totalAmount", lhsTotalAmount), LocatorUtils.property(thatLocator, "totalAmount", rhsTotalAmount), lhsTotalAmount, rhsTotalAmount, true, true)) {
                        return false;
                    }
                }
                {
                    EnumCurrencyCode lhsCurrency;
                    lhsCurrency = this.getCurrency();
                    EnumCurrencyCode rhsCurrency;
                    rhsCurrency = that.getCurrency();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "currency", lhsCurrency), LocatorUtils.property(thatLocator, "currency", rhsCurrency), lhsCurrency, rhsCurrency, (this.currency!= null), (that.currency!= null))) {
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
                    int lhsTotalCount;
                    lhsTotalCount = this.getTotalCount();
                    int rhsTotalCount;
                    rhsTotalCount = that.getTotalCount();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "totalCount", lhsTotalCount), LocatorUtils.property(thatLocator, "totalCount", rhsTotalCount), lhsTotalCount, rhsTotalCount, true, true)) {
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
                    String theFinancialTrxType;
                    theFinancialTrxType = this.getFinancialTrxType();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financialTrxType", theFinancialTrxType), currentHashCode, theFinancialTrxType, (this.financialTrxType!= null));
                }
                {
                    String theTrxNature;
                    theTrxNature = this.getTrxNature();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxNature", theTrxNature), currentHashCode, theTrxNature, (this.trxNature!= null));
                }
                {
                    double theTotalAmount;
                    theTotalAmount = this.getTotalAmount();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalAmount", theTotalAmount), currentHashCode, theTotalAmount, true);
                }
                {
                    EnumCurrencyCode theCurrency;
                    theCurrency = this.getCurrency();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currency", theCurrency), currentHashCode, theCurrency, (this.currency!= null));
                }
                {
                    String theServiceCode;
                    theServiceCode = this.getServiceCode();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceCode", theServiceCode), currentHashCode, theServiceCode, (this.serviceCode!= null));
                }
                {
                    int theTotalCount;
                    theTotalCount = this.getTotalCount();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalCount", theTotalCount), currentHashCode, theTotalCount, true);
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
                if (draftCopy instanceof DailySummaryResponse.TrxnsSummary.TrxnSummary) {
                    final DailySummaryResponse.TrxnsSummary.TrxnSummary copy = ((DailySummaryResponse.TrxnsSummary.TrxnSummary) draftCopy);
                    {
                        Boolean financialTrxTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.financialTrxType!= null));
                        if (financialTrxTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceFinancialTrxType;
                            sourceFinancialTrxType = this.getFinancialTrxType();
                            String copyFinancialTrxType = ((String) strategy.copy(LocatorUtils.property(locator, "financialTrxType", sourceFinancialTrxType), sourceFinancialTrxType, (this.financialTrxType!= null)));
                            copy.setFinancialTrxType(copyFinancialTrxType);
                        } else {
                            if (financialTrxTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.financialTrxType = null;
                            }
                        }
                    }
                    {
                        Boolean trxNatureShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxNature!= null));
                        if (trxNatureShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceTrxNature;
                            sourceTrxNature = this.getTrxNature();
                            String copyTrxNature = ((String) strategy.copy(LocatorUtils.property(locator, "trxNature", sourceTrxNature), sourceTrxNature, (this.trxNature!= null)));
                            copy.setTrxNature(copyTrxNature);
                        } else {
                            if (trxNatureShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.trxNature = null;
                            }
                        }
                    }
                    {
                        Boolean totalAmountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                        if (totalAmountShouldBeCopiedAndSet == Boolean.TRUE) {
                            double sourceTotalAmount;
                            sourceTotalAmount = this.getTotalAmount();
                            double copyTotalAmount = strategy.copy(LocatorUtils.property(locator, "totalAmount", sourceTotalAmount), sourceTotalAmount, true);
                            copy.setTotalAmount(copyTotalAmount);
                        } else {
                            if (totalAmountShouldBeCopiedAndSet == Boolean.FALSE) {
                            }
                        }
                    }
                    {
                        Boolean currencyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currency!= null));
                        if (currencyShouldBeCopiedAndSet == Boolean.TRUE) {
                            EnumCurrencyCode sourceCurrency;
                            sourceCurrency = this.getCurrency();
                            EnumCurrencyCode copyCurrency = ((EnumCurrencyCode) strategy.copy(LocatorUtils.property(locator, "currency", sourceCurrency), sourceCurrency, (this.currency!= null)));
                            copy.setCurrency(copyCurrency);
                        } else {
                            if (currencyShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.currency = null;
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
                        Boolean totalCountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                        if (totalCountShouldBeCopiedAndSet == Boolean.TRUE) {
                            int sourceTotalCount;
                            sourceTotalCount = this.getTotalCount();
                            int copyTotalCount = strategy.copy(LocatorUtils.property(locator, "totalCount", sourceTotalCount), sourceTotalCount, true);
                            copy.setTotalCount(copyTotalCount);
                        } else {
                            if (totalCountShouldBeCopiedAndSet == Boolean.FALSE) {
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new DailySummaryResponse.TrxnsSummary.TrxnSummary();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof DailySummaryResponse.TrxnsSummary.TrxnSummary) {
                    final DailySummaryResponse.TrxnsSummary.TrxnSummary target = this;
                    final DailySummaryResponse.TrxnsSummary.TrxnSummary leftObject = ((DailySummaryResponse.TrxnsSummary.TrxnSummary) left);
                    final DailySummaryResponse.TrxnsSummary.TrxnSummary rightObject = ((DailySummaryResponse.TrxnsSummary.TrxnSummary) right);
                    {
                        Boolean financialTrxTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.financialTrxType!= null), (rightObject.financialTrxType!= null));
                        if (financialTrxTypeShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsFinancialTrxType;
                            lhsFinancialTrxType = leftObject.getFinancialTrxType();
                            String rhsFinancialTrxType;
                            rhsFinancialTrxType = rightObject.getFinancialTrxType();
                            String mergedFinancialTrxType = ((String) strategy.merge(LocatorUtils.property(leftLocator, "financialTrxType", lhsFinancialTrxType), LocatorUtils.property(rightLocator, "financialTrxType", rhsFinancialTrxType), lhsFinancialTrxType, rhsFinancialTrxType, (leftObject.financialTrxType!= null), (rightObject.financialTrxType!= null)));
                            target.setFinancialTrxType(mergedFinancialTrxType);
                        } else {
                            if (financialTrxTypeShouldBeMergedAndSet == Boolean.FALSE) {
                                target.financialTrxType = null;
                            }
                        }
                    }
                    {
                        Boolean trxNatureShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxNature!= null), (rightObject.trxNature!= null));
                        if (trxNatureShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsTrxNature;
                            lhsTrxNature = leftObject.getTrxNature();
                            String rhsTrxNature;
                            rhsTrxNature = rightObject.getTrxNature();
                            String mergedTrxNature = ((String) strategy.merge(LocatorUtils.property(leftLocator, "trxNature", lhsTrxNature), LocatorUtils.property(rightLocator, "trxNature", rhsTrxNature), lhsTrxNature, rhsTrxNature, (leftObject.trxNature!= null), (rightObject.trxNature!= null)));
                            target.setTrxNature(mergedTrxNature);
                        } else {
                            if (trxNatureShouldBeMergedAndSet == Boolean.FALSE) {
                                target.trxNature = null;
                            }
                        }
                    }
                    {
                        Boolean totalAmountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, true, true);
                        if (totalAmountShouldBeMergedAndSet == Boolean.TRUE) {
                            double lhsTotalAmount;
                            lhsTotalAmount = leftObject.getTotalAmount();
                            double rhsTotalAmount;
                            rhsTotalAmount = rightObject.getTotalAmount();
                            double mergedTotalAmount = ((double) strategy.merge(LocatorUtils.property(leftLocator, "totalAmount", lhsTotalAmount), LocatorUtils.property(rightLocator, "totalAmount", rhsTotalAmount), lhsTotalAmount, rhsTotalAmount, true, true));
                            target.setTotalAmount(mergedTotalAmount);
                        } else {
                            if (totalAmountShouldBeMergedAndSet == Boolean.FALSE) {
                            }
                        }
                    }
                    {
                        Boolean currencyShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.currency!= null), (rightObject.currency!= null));
                        if (currencyShouldBeMergedAndSet == Boolean.TRUE) {
                            EnumCurrencyCode lhsCurrency;
                            lhsCurrency = leftObject.getCurrency();
                            EnumCurrencyCode rhsCurrency;
                            rhsCurrency = rightObject.getCurrency();
                            EnumCurrencyCode mergedCurrency = ((EnumCurrencyCode) strategy.merge(LocatorUtils.property(leftLocator, "currency", lhsCurrency), LocatorUtils.property(rightLocator, "currency", rhsCurrency), lhsCurrency, rhsCurrency, (leftObject.currency!= null), (rightObject.currency!= null)));
                            target.setCurrency(mergedCurrency);
                        } else {
                            if (currencyShouldBeMergedAndSet == Boolean.FALSE) {
                                target.currency = null;
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
                        Boolean totalCountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, true, true);
                        if (totalCountShouldBeMergedAndSet == Boolean.TRUE) {
                            int lhsTotalCount;
                            lhsTotalCount = leftObject.getTotalCount();
                            int rhsTotalCount;
                            rhsTotalCount = rightObject.getTotalCount();
                            int mergedTotalCount = ((int) strategy.merge(LocatorUtils.property(leftLocator, "totalCount", lhsTotalCount), LocatorUtils.property(rightLocator, "totalCount", rhsTotalCount), lhsTotalCount, rhsTotalCount, true, true));
                            target.setTotalCount(mergedTotalCount);
                        } else {
                            if (totalCountShouldBeMergedAndSet == Boolean.FALSE) {
                            }
                        }
                    }
                }
            }

        }

    }

}
