
package com.paymentplaform.raya.gate.activate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 * <p>Java class for Activate_Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Activate_Response"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://raya.paymentplaform.com/gate}Status"/&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AsynchUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IdentifierId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActivationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SecuredKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HashedPin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NationalId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActivateParameters" maxOccurs="unbounded" minOccurs="0"&gt;
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
@XmlType(name = "Activate_Response", namespace = "http://raya.paymentplaform.com/gate/activate", propOrder = {
    "status",
    "rqUIDsAndAsynchUIDs",
    "identifierId",
    "activationNumber",
    "serialNumber",
    "terminalId",
    "securedKey",
    "hashedPin",
    "nationalId",
    "activateParameters",
    "notifications",
    "any"
})
public class ActivateResponse implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElementRefs({
        @XmlElementRef(name = "AsynchUID", type = JAXBElement.class),
        @XmlElementRef(name = "RqUID", type = JAXBElement.class)
    })
    protected List<JAXBElement<String>> rqUIDsAndAsynchUIDs;
    @XmlElement(name = "IdentifierId", required = true)
    protected String identifierId;
    @XmlElement(name = "ActivationNumber", required = true)
    protected String activationNumber;
    @XmlElement(name = "SerialNumber", required = true)
    protected String serialNumber;
    @XmlElement(name = "TerminalId", required = true)
    protected String terminalId;
    @XmlElement(name = "SecuredKey", required = true)
    protected String securedKey;
    @XmlElement(name = "HashedPin", required = true)
    protected String hashedPin;
    @XmlElement(name = "NationalId", required = true)
    protected String nationalId;
    @XmlElement(name = "ActivateParameters")
    protected List<ActivateResponse.ActivateParameters> activateParameters;
    @XmlElement(required = true)
    protected ActivateResponse.Notifications notifications;
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
     * Gets the value of the rqUIDsAndAsynchUIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rqUIDsAndAsynchUIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRqUIDsAndAsynchUIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getRqUIDsAndAsynchUIDs() {
        if (rqUIDsAndAsynchUIDs == null) {
            rqUIDsAndAsynchUIDs = new ArrayList<JAXBElement<String>>();
        }
        return this.rqUIDsAndAsynchUIDs;
    }

    /**
     * Gets the value of the identifierId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierId() {
        return identifierId;
    }

    /**
     * Sets the value of the identifierId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierId(String value) {
        this.identifierId = value;
    }

    /**
     * Gets the value of the activationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationNumber() {
        return activationNumber;
    }

    /**
     * Sets the value of the activationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationNumber(String value) {
        this.activationNumber = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the securedKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuredKey() {
        return securedKey;
    }

    /**
     * Sets the value of the securedKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuredKey(String value) {
        this.securedKey = value;
    }

    /**
     * Gets the value of the hashedPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashedPin() {
        return hashedPin;
    }

    /**
     * Sets the value of the hashedPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashedPin(String value) {
        this.hashedPin = value;
    }

    /**
     * Gets the value of the nationalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalId() {
        return nationalId;
    }

    /**
     * Sets the value of the nationalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalId(String value) {
        this.nationalId = value;
    }

    /**
     * Gets the value of the activateParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activateParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivateParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivateResponse.ActivateParameters }
     * 
     * 
     */
    public List<ActivateResponse.ActivateParameters> getActivateParameters() {
        if (activateParameters == null) {
            activateParameters = new ArrayList<ActivateResponse.ActivateParameters>();
        }
        return this.activateParameters;
    }

    /**
     * Gets the value of the notifications property.
     * 
     * @return
     *     possible object is
     *     {@link ActivateResponse.Notifications }
     *     
     */
    public ActivateResponse.Notifications getNotifications() {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivateResponse.Notifications }
     *     
     */
    public void setNotifications(ActivateResponse.Notifications value) {
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
            List<JAXBElement<String>> theRqUIDsAndAsynchUIDs;
            theRqUIDsAndAsynchUIDs = (((this.rqUIDsAndAsynchUIDs!= null)&&(!this.rqUIDsAndAsynchUIDs.isEmpty()))?this.getRqUIDsAndAsynchUIDs():null);
            strategy.appendField(locator, this, "rqUIDsAndAsynchUIDs", buffer, theRqUIDsAndAsynchUIDs, ((this.rqUIDsAndAsynchUIDs!= null)&&(!this.rqUIDsAndAsynchUIDs.isEmpty())));
        }
        {
            String theIdentifierId;
            theIdentifierId = this.getIdentifierId();
            strategy.appendField(locator, this, "identifierId", buffer, theIdentifierId, (this.identifierId!= null));
        }
        {
            String theActivationNumber;
            theActivationNumber = this.getActivationNumber();
            strategy.appendField(locator, this, "activationNumber", buffer, theActivationNumber, (this.activationNumber!= null));
        }
        {
            String theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            strategy.appendField(locator, this, "serialNumber", buffer, theSerialNumber, (this.serialNumber!= null));
        }
        {
            String theTerminalId;
            theTerminalId = this.getTerminalId();
            strategy.appendField(locator, this, "terminalId", buffer, theTerminalId, (this.terminalId!= null));
        }
        {
            String theSecuredKey;
            theSecuredKey = this.getSecuredKey();
            strategy.appendField(locator, this, "securedKey", buffer, theSecuredKey, (this.securedKey!= null));
        }
        {
            String theHashedPin;
            theHashedPin = this.getHashedPin();
            strategy.appendField(locator, this, "hashedPin", buffer, theHashedPin, (this.hashedPin!= null));
        }
        {
            String theNationalId;
            theNationalId = this.getNationalId();
            strategy.appendField(locator, this, "nationalId", buffer, theNationalId, (this.nationalId!= null));
        }
        {
            List<ActivateResponse.ActivateParameters> theActivateParameters;
            theActivateParameters = (((this.activateParameters!= null)&&(!this.activateParameters.isEmpty()))?this.getActivateParameters():null);
            strategy.appendField(locator, this, "activateParameters", buffer, theActivateParameters, ((this.activateParameters!= null)&&(!this.activateParameters.isEmpty())));
        }
        {
            ActivateResponse.Notifications theNotifications;
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
        final ActivateResponse that = ((ActivateResponse) object);
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
            List<JAXBElement<String>> lhsRqUIDsAndAsynchUIDs;
            lhsRqUIDsAndAsynchUIDs = (((this.rqUIDsAndAsynchUIDs!= null)&&(!this.rqUIDsAndAsynchUIDs.isEmpty()))?this.getRqUIDsAndAsynchUIDs():null);
            List<JAXBElement<String>> rhsRqUIDsAndAsynchUIDs;
            rhsRqUIDsAndAsynchUIDs = (((that.rqUIDsAndAsynchUIDs!= null)&&(!that.rqUIDsAndAsynchUIDs.isEmpty()))?that.getRqUIDsAndAsynchUIDs():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rqUIDsAndAsynchUIDs", lhsRqUIDsAndAsynchUIDs), LocatorUtils.property(thatLocator, "rqUIDsAndAsynchUIDs", rhsRqUIDsAndAsynchUIDs), lhsRqUIDsAndAsynchUIDs, rhsRqUIDsAndAsynchUIDs, ((this.rqUIDsAndAsynchUIDs!= null)&&(!this.rqUIDsAndAsynchUIDs.isEmpty())), ((that.rqUIDsAndAsynchUIDs!= null)&&(!that.rqUIDsAndAsynchUIDs.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsIdentifierId;
            lhsIdentifierId = this.getIdentifierId();
            String rhsIdentifierId;
            rhsIdentifierId = that.getIdentifierId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifierId", lhsIdentifierId), LocatorUtils.property(thatLocator, "identifierId", rhsIdentifierId), lhsIdentifierId, rhsIdentifierId, (this.identifierId!= null), (that.identifierId!= null))) {
                return false;
            }
        }
        {
            String lhsActivationNumber;
            lhsActivationNumber = this.getActivationNumber();
            String rhsActivationNumber;
            rhsActivationNumber = that.getActivationNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activationNumber", lhsActivationNumber), LocatorUtils.property(thatLocator, "activationNumber", rhsActivationNumber), lhsActivationNumber, rhsActivationNumber, (this.activationNumber!= null), (that.activationNumber!= null))) {
                return false;
            }
        }
        {
            String lhsSerialNumber;
            lhsSerialNumber = this.getSerialNumber();
            String rhsSerialNumber;
            rhsSerialNumber = that.getSerialNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serialNumber", lhsSerialNumber), LocatorUtils.property(thatLocator, "serialNumber", rhsSerialNumber), lhsSerialNumber, rhsSerialNumber, (this.serialNumber!= null), (that.serialNumber!= null))) {
                return false;
            }
        }
        {
            String lhsTerminalId;
            lhsTerminalId = this.getTerminalId();
            String rhsTerminalId;
            rhsTerminalId = that.getTerminalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terminalId", lhsTerminalId), LocatorUtils.property(thatLocator, "terminalId", rhsTerminalId), lhsTerminalId, rhsTerminalId, (this.terminalId!= null), (that.terminalId!= null))) {
                return false;
            }
        }
        {
            String lhsSecuredKey;
            lhsSecuredKey = this.getSecuredKey();
            String rhsSecuredKey;
            rhsSecuredKey = that.getSecuredKey();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "securedKey", lhsSecuredKey), LocatorUtils.property(thatLocator, "securedKey", rhsSecuredKey), lhsSecuredKey, rhsSecuredKey, (this.securedKey!= null), (that.securedKey!= null))) {
                return false;
            }
        }
        {
            String lhsHashedPin;
            lhsHashedPin = this.getHashedPin();
            String rhsHashedPin;
            rhsHashedPin = that.getHashedPin();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hashedPin", lhsHashedPin), LocatorUtils.property(thatLocator, "hashedPin", rhsHashedPin), lhsHashedPin, rhsHashedPin, (this.hashedPin!= null), (that.hashedPin!= null))) {
                return false;
            }
        }
        {
            String lhsNationalId;
            lhsNationalId = this.getNationalId();
            String rhsNationalId;
            rhsNationalId = that.getNationalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nationalId", lhsNationalId), LocatorUtils.property(thatLocator, "nationalId", rhsNationalId), lhsNationalId, rhsNationalId, (this.nationalId!= null), (that.nationalId!= null))) {
                return false;
            }
        }
        {
            List<ActivateResponse.ActivateParameters> lhsActivateParameters;
            lhsActivateParameters = (((this.activateParameters!= null)&&(!this.activateParameters.isEmpty()))?this.getActivateParameters():null);
            List<ActivateResponse.ActivateParameters> rhsActivateParameters;
            rhsActivateParameters = (((that.activateParameters!= null)&&(!that.activateParameters.isEmpty()))?that.getActivateParameters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activateParameters", lhsActivateParameters), LocatorUtils.property(thatLocator, "activateParameters", rhsActivateParameters), lhsActivateParameters, rhsActivateParameters, ((this.activateParameters!= null)&&(!this.activateParameters.isEmpty())), ((that.activateParameters!= null)&&(!that.activateParameters.isEmpty())))) {
                return false;
            }
        }
        {
            ActivateResponse.Notifications lhsNotifications;
            lhsNotifications = this.getNotifications();
            ActivateResponse.Notifications rhsNotifications;
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
            List<JAXBElement<String>> theRqUIDsAndAsynchUIDs;
            theRqUIDsAndAsynchUIDs = (((this.rqUIDsAndAsynchUIDs!= null)&&(!this.rqUIDsAndAsynchUIDs.isEmpty()))?this.getRqUIDsAndAsynchUIDs():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rqUIDsAndAsynchUIDs", theRqUIDsAndAsynchUIDs), currentHashCode, theRqUIDsAndAsynchUIDs, ((this.rqUIDsAndAsynchUIDs!= null)&&(!this.rqUIDsAndAsynchUIDs.isEmpty())));
        }
        {
            String theIdentifierId;
            theIdentifierId = this.getIdentifierId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifierId", theIdentifierId), currentHashCode, theIdentifierId, (this.identifierId!= null));
        }
        {
            String theActivationNumber;
            theActivationNumber = this.getActivationNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activationNumber", theActivationNumber), currentHashCode, theActivationNumber, (this.activationNumber!= null));
        }
        {
            String theSerialNumber;
            theSerialNumber = this.getSerialNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serialNumber", theSerialNumber), currentHashCode, theSerialNumber, (this.serialNumber!= null));
        }
        {
            String theTerminalId;
            theTerminalId = this.getTerminalId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "terminalId", theTerminalId), currentHashCode, theTerminalId, (this.terminalId!= null));
        }
        {
            String theSecuredKey;
            theSecuredKey = this.getSecuredKey();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "securedKey", theSecuredKey), currentHashCode, theSecuredKey, (this.securedKey!= null));
        }
        {
            String theHashedPin;
            theHashedPin = this.getHashedPin();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hashedPin", theHashedPin), currentHashCode, theHashedPin, (this.hashedPin!= null));
        }
        {
            String theNationalId;
            theNationalId = this.getNationalId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nationalId", theNationalId), currentHashCode, theNationalId, (this.nationalId!= null));
        }
        {
            List<ActivateResponse.ActivateParameters> theActivateParameters;
            theActivateParameters = (((this.activateParameters!= null)&&(!this.activateParameters.isEmpty()))?this.getActivateParameters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activateParameters", theActivateParameters), currentHashCode, theActivateParameters, ((this.activateParameters!= null)&&(!this.activateParameters.isEmpty())));
        }
        {
            ActivateResponse.Notifications theNotifications;
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
        if (draftCopy instanceof ActivateResponse) {
            final ActivateResponse copy = ((ActivateResponse) draftCopy);
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
                Boolean rqUIDsAndAsynchUIDsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.rqUIDsAndAsynchUIDs!= null)&&(!this.rqUIDsAndAsynchUIDs.isEmpty())));
                if (rqUIDsAndAsynchUIDsShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<JAXBElement<String>> sourceRqUIDsAndAsynchUIDs;
                    sourceRqUIDsAndAsynchUIDs = (((this.rqUIDsAndAsynchUIDs!= null)&&(!this.rqUIDsAndAsynchUIDs.isEmpty()))?this.getRqUIDsAndAsynchUIDs():null);
                    @SuppressWarnings("unchecked")
                    List<JAXBElement<String>> copyRqUIDsAndAsynchUIDs = ((List<JAXBElement<String>> ) strategy.copy(LocatorUtils.property(locator, "rqUIDsAndAsynchUIDs", sourceRqUIDsAndAsynchUIDs), sourceRqUIDsAndAsynchUIDs, ((this.rqUIDsAndAsynchUIDs!= null)&&(!this.rqUIDsAndAsynchUIDs.isEmpty()))));
                    copy.rqUIDsAndAsynchUIDs = null;
                    if (copyRqUIDsAndAsynchUIDs!= null) {
                        List<JAXBElement<String>> uniqueRqUIDsAndAsynchUIDsl = copy.getRqUIDsAndAsynchUIDs();
                        uniqueRqUIDsAndAsynchUIDsl.addAll(copyRqUIDsAndAsynchUIDs);
                    }
                } else {
                    if (rqUIDsAndAsynchUIDsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rqUIDsAndAsynchUIDs = null;
                    }
                }
            }
            {
                Boolean identifierIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.identifierId!= null));
                if (identifierIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceIdentifierId;
                    sourceIdentifierId = this.getIdentifierId();
                    String copyIdentifierId = ((String) strategy.copy(LocatorUtils.property(locator, "identifierId", sourceIdentifierId), sourceIdentifierId, (this.identifierId!= null)));
                    copy.setIdentifierId(copyIdentifierId);
                } else {
                    if (identifierIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.identifierId = null;
                    }
                }
            }
            {
                Boolean activationNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activationNumber!= null));
                if (activationNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceActivationNumber;
                    sourceActivationNumber = this.getActivationNumber();
                    String copyActivationNumber = ((String) strategy.copy(LocatorUtils.property(locator, "activationNumber", sourceActivationNumber), sourceActivationNumber, (this.activationNumber!= null)));
                    copy.setActivationNumber(copyActivationNumber);
                } else {
                    if (activationNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activationNumber = null;
                    }
                }
            }
            {
                Boolean serialNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serialNumber!= null));
                if (serialNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSerialNumber;
                    sourceSerialNumber = this.getSerialNumber();
                    String copySerialNumber = ((String) strategy.copy(LocatorUtils.property(locator, "serialNumber", sourceSerialNumber), sourceSerialNumber, (this.serialNumber!= null)));
                    copy.setSerialNumber(copySerialNumber);
                } else {
                    if (serialNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serialNumber = null;
                    }
                }
            }
            {
                Boolean terminalIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.terminalId!= null));
                if (terminalIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTerminalId;
                    sourceTerminalId = this.getTerminalId();
                    String copyTerminalId = ((String) strategy.copy(LocatorUtils.property(locator, "terminalId", sourceTerminalId), sourceTerminalId, (this.terminalId!= null)));
                    copy.setTerminalId(copyTerminalId);
                } else {
                    if (terminalIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.terminalId = null;
                    }
                }
            }
            {
                Boolean securedKeyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.securedKey!= null));
                if (securedKeyShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceSecuredKey;
                    sourceSecuredKey = this.getSecuredKey();
                    String copySecuredKey = ((String) strategy.copy(LocatorUtils.property(locator, "securedKey", sourceSecuredKey), sourceSecuredKey, (this.securedKey!= null)));
                    copy.setSecuredKey(copySecuredKey);
                } else {
                    if (securedKeyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.securedKey = null;
                    }
                }
            }
            {
                Boolean hashedPinShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.hashedPin!= null));
                if (hashedPinShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHashedPin;
                    sourceHashedPin = this.getHashedPin();
                    String copyHashedPin = ((String) strategy.copy(LocatorUtils.property(locator, "hashedPin", sourceHashedPin), sourceHashedPin, (this.hashedPin!= null)));
                    copy.setHashedPin(copyHashedPin);
                } else {
                    if (hashedPinShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.hashedPin = null;
                    }
                }
            }
            {
                Boolean nationalIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.nationalId!= null));
                if (nationalIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceNationalId;
                    sourceNationalId = this.getNationalId();
                    String copyNationalId = ((String) strategy.copy(LocatorUtils.property(locator, "nationalId", sourceNationalId), sourceNationalId, (this.nationalId!= null)));
                    copy.setNationalId(copyNationalId);
                } else {
                    if (nationalIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.nationalId = null;
                    }
                }
            }
            {
                Boolean activateParametersShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.activateParameters!= null)&&(!this.activateParameters.isEmpty())));
                if (activateParametersShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ActivateResponse.ActivateParameters> sourceActivateParameters;
                    sourceActivateParameters = (((this.activateParameters!= null)&&(!this.activateParameters.isEmpty()))?this.getActivateParameters():null);
                    @SuppressWarnings("unchecked")
                    List<ActivateResponse.ActivateParameters> copyActivateParameters = ((List<ActivateResponse.ActivateParameters> ) strategy.copy(LocatorUtils.property(locator, "activateParameters", sourceActivateParameters), sourceActivateParameters, ((this.activateParameters!= null)&&(!this.activateParameters.isEmpty()))));
                    copy.activateParameters = null;
                    if (copyActivateParameters!= null) {
                        List<ActivateResponse.ActivateParameters> uniqueActivateParametersl = copy.getActivateParameters();
                        uniqueActivateParametersl.addAll(copyActivateParameters);
                    }
                } else {
                    if (activateParametersShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activateParameters = null;
                    }
                }
            }
            {
                Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.notifications!= null));
                if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                    ActivateResponse.Notifications sourceNotifications;
                    sourceNotifications = this.getNotifications();
                    ActivateResponse.Notifications copyNotifications = ((ActivateResponse.Notifications) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, (this.notifications!= null)));
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
        return new ActivateResponse();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ActivateResponse) {
            final ActivateResponse target = this;
            final ActivateResponse leftObject = ((ActivateResponse) left);
            final ActivateResponse rightObject = ((ActivateResponse) right);
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
                Boolean rqUIDsAndAsynchUIDsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.rqUIDsAndAsynchUIDs!= null)&&(!leftObject.rqUIDsAndAsynchUIDs.isEmpty())), ((rightObject.rqUIDsAndAsynchUIDs!= null)&&(!rightObject.rqUIDsAndAsynchUIDs.isEmpty())));
                if (rqUIDsAndAsynchUIDsShouldBeMergedAndSet == Boolean.TRUE) {
                    List<JAXBElement<String>> lhsRqUIDsAndAsynchUIDs;
                    lhsRqUIDsAndAsynchUIDs = (((leftObject.rqUIDsAndAsynchUIDs!= null)&&(!leftObject.rqUIDsAndAsynchUIDs.isEmpty()))?leftObject.getRqUIDsAndAsynchUIDs():null);
                    List<JAXBElement<String>> rhsRqUIDsAndAsynchUIDs;
                    rhsRqUIDsAndAsynchUIDs = (((rightObject.rqUIDsAndAsynchUIDs!= null)&&(!rightObject.rqUIDsAndAsynchUIDs.isEmpty()))?rightObject.getRqUIDsAndAsynchUIDs():null);
                    List<JAXBElement<String>> mergedRqUIDsAndAsynchUIDs = ((List<JAXBElement<String>> ) strategy.merge(LocatorUtils.property(leftLocator, "rqUIDsAndAsynchUIDs", lhsRqUIDsAndAsynchUIDs), LocatorUtils.property(rightLocator, "rqUIDsAndAsynchUIDs", rhsRqUIDsAndAsynchUIDs), lhsRqUIDsAndAsynchUIDs, rhsRqUIDsAndAsynchUIDs, ((leftObject.rqUIDsAndAsynchUIDs!= null)&&(!leftObject.rqUIDsAndAsynchUIDs.isEmpty())), ((rightObject.rqUIDsAndAsynchUIDs!= null)&&(!rightObject.rqUIDsAndAsynchUIDs.isEmpty()))));
                    target.rqUIDsAndAsynchUIDs = null;
                    if (mergedRqUIDsAndAsynchUIDs!= null) {
                        List<JAXBElement<String>> uniqueRqUIDsAndAsynchUIDsl = target.getRqUIDsAndAsynchUIDs();
                        uniqueRqUIDsAndAsynchUIDsl.addAll(mergedRqUIDsAndAsynchUIDs);
                    }
                } else {
                    if (rqUIDsAndAsynchUIDsShouldBeMergedAndSet == Boolean.FALSE) {
                        target.rqUIDsAndAsynchUIDs = null;
                    }
                }
            }
            {
                Boolean identifierIdShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.identifierId!= null), (rightObject.identifierId!= null));
                if (identifierIdShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsIdentifierId;
                    lhsIdentifierId = leftObject.getIdentifierId();
                    String rhsIdentifierId;
                    rhsIdentifierId = rightObject.getIdentifierId();
                    String mergedIdentifierId = ((String) strategy.merge(LocatorUtils.property(leftLocator, "identifierId", lhsIdentifierId), LocatorUtils.property(rightLocator, "identifierId", rhsIdentifierId), lhsIdentifierId, rhsIdentifierId, (leftObject.identifierId!= null), (rightObject.identifierId!= null)));
                    target.setIdentifierId(mergedIdentifierId);
                } else {
                    if (identifierIdShouldBeMergedAndSet == Boolean.FALSE) {
                        target.identifierId = null;
                    }
                }
            }
            {
                Boolean activationNumberShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.activationNumber!= null), (rightObject.activationNumber!= null));
                if (activationNumberShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsActivationNumber;
                    lhsActivationNumber = leftObject.getActivationNumber();
                    String rhsActivationNumber;
                    rhsActivationNumber = rightObject.getActivationNumber();
                    String mergedActivationNumber = ((String) strategy.merge(LocatorUtils.property(leftLocator, "activationNumber", lhsActivationNumber), LocatorUtils.property(rightLocator, "activationNumber", rhsActivationNumber), lhsActivationNumber, rhsActivationNumber, (leftObject.activationNumber!= null), (rightObject.activationNumber!= null)));
                    target.setActivationNumber(mergedActivationNumber);
                } else {
                    if (activationNumberShouldBeMergedAndSet == Boolean.FALSE) {
                        target.activationNumber = null;
                    }
                }
            }
            {
                Boolean serialNumberShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serialNumber!= null), (rightObject.serialNumber!= null));
                if (serialNumberShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsSerialNumber;
                    lhsSerialNumber = leftObject.getSerialNumber();
                    String rhsSerialNumber;
                    rhsSerialNumber = rightObject.getSerialNumber();
                    String mergedSerialNumber = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serialNumber", lhsSerialNumber), LocatorUtils.property(rightLocator, "serialNumber", rhsSerialNumber), lhsSerialNumber, rhsSerialNumber, (leftObject.serialNumber!= null), (rightObject.serialNumber!= null)));
                    target.setSerialNumber(mergedSerialNumber);
                } else {
                    if (serialNumberShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serialNumber = null;
                    }
                }
            }
            {
                Boolean terminalIdShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.terminalId!= null), (rightObject.terminalId!= null));
                if (terminalIdShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsTerminalId;
                    lhsTerminalId = leftObject.getTerminalId();
                    String rhsTerminalId;
                    rhsTerminalId = rightObject.getTerminalId();
                    String mergedTerminalId = ((String) strategy.merge(LocatorUtils.property(leftLocator, "terminalId", lhsTerminalId), LocatorUtils.property(rightLocator, "terminalId", rhsTerminalId), lhsTerminalId, rhsTerminalId, (leftObject.terminalId!= null), (rightObject.terminalId!= null)));
                    target.setTerminalId(mergedTerminalId);
                } else {
                    if (terminalIdShouldBeMergedAndSet == Boolean.FALSE) {
                        target.terminalId = null;
                    }
                }
            }
            {
                Boolean securedKeyShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.securedKey!= null), (rightObject.securedKey!= null));
                if (securedKeyShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsSecuredKey;
                    lhsSecuredKey = leftObject.getSecuredKey();
                    String rhsSecuredKey;
                    rhsSecuredKey = rightObject.getSecuredKey();
                    String mergedSecuredKey = ((String) strategy.merge(LocatorUtils.property(leftLocator, "securedKey", lhsSecuredKey), LocatorUtils.property(rightLocator, "securedKey", rhsSecuredKey), lhsSecuredKey, rhsSecuredKey, (leftObject.securedKey!= null), (rightObject.securedKey!= null)));
                    target.setSecuredKey(mergedSecuredKey);
                } else {
                    if (securedKeyShouldBeMergedAndSet == Boolean.FALSE) {
                        target.securedKey = null;
                    }
                }
            }
            {
                Boolean hashedPinShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.hashedPin!= null), (rightObject.hashedPin!= null));
                if (hashedPinShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsHashedPin;
                    lhsHashedPin = leftObject.getHashedPin();
                    String rhsHashedPin;
                    rhsHashedPin = rightObject.getHashedPin();
                    String mergedHashedPin = ((String) strategy.merge(LocatorUtils.property(leftLocator, "hashedPin", lhsHashedPin), LocatorUtils.property(rightLocator, "hashedPin", rhsHashedPin), lhsHashedPin, rhsHashedPin, (leftObject.hashedPin!= null), (rightObject.hashedPin!= null)));
                    target.setHashedPin(mergedHashedPin);
                } else {
                    if (hashedPinShouldBeMergedAndSet == Boolean.FALSE) {
                        target.hashedPin = null;
                    }
                }
            }
            {
                Boolean nationalIdShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.nationalId!= null), (rightObject.nationalId!= null));
                if (nationalIdShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsNationalId;
                    lhsNationalId = leftObject.getNationalId();
                    String rhsNationalId;
                    rhsNationalId = rightObject.getNationalId();
                    String mergedNationalId = ((String) strategy.merge(LocatorUtils.property(leftLocator, "nationalId", lhsNationalId), LocatorUtils.property(rightLocator, "nationalId", rhsNationalId), lhsNationalId, rhsNationalId, (leftObject.nationalId!= null), (rightObject.nationalId!= null)));
                    target.setNationalId(mergedNationalId);
                } else {
                    if (nationalIdShouldBeMergedAndSet == Boolean.FALSE) {
                        target.nationalId = null;
                    }
                }
            }
            {
                Boolean activateParametersShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.activateParameters!= null)&&(!leftObject.activateParameters.isEmpty())), ((rightObject.activateParameters!= null)&&(!rightObject.activateParameters.isEmpty())));
                if (activateParametersShouldBeMergedAndSet == Boolean.TRUE) {
                    List<ActivateResponse.ActivateParameters> lhsActivateParameters;
                    lhsActivateParameters = (((leftObject.activateParameters!= null)&&(!leftObject.activateParameters.isEmpty()))?leftObject.getActivateParameters():null);
                    List<ActivateResponse.ActivateParameters> rhsActivateParameters;
                    rhsActivateParameters = (((rightObject.activateParameters!= null)&&(!rightObject.activateParameters.isEmpty()))?rightObject.getActivateParameters():null);
                    List<ActivateResponse.ActivateParameters> mergedActivateParameters = ((List<ActivateResponse.ActivateParameters> ) strategy.merge(LocatorUtils.property(leftLocator, "activateParameters", lhsActivateParameters), LocatorUtils.property(rightLocator, "activateParameters", rhsActivateParameters), lhsActivateParameters, rhsActivateParameters, ((leftObject.activateParameters!= null)&&(!leftObject.activateParameters.isEmpty())), ((rightObject.activateParameters!= null)&&(!rightObject.activateParameters.isEmpty()))));
                    target.activateParameters = null;
                    if (mergedActivateParameters!= null) {
                        List<ActivateResponse.ActivateParameters> uniqueActivateParametersl = target.getActivateParameters();
                        uniqueActivateParametersl.addAll(mergedActivateParameters);
                    }
                } else {
                    if (activateParametersShouldBeMergedAndSet == Boolean.FALSE) {
                        target.activateParameters = null;
                    }
                }
            }
            {
                Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.notifications!= null), (rightObject.notifications!= null));
                if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                    ActivateResponse.Notifications lhsNotifications;
                    lhsNotifications = leftObject.getNotifications();
                    ActivateResponse.Notifications rhsNotifications;
                    rhsNotifications = rightObject.getNotifications();
                    ActivateResponse.Notifications mergedNotifications = ((ActivateResponse.Notifications) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, (leftObject.notifications!= null), (rightObject.notifications!= null)));
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

    public void setRqUIDsAndAsynchUIDs(List<JAXBElement<String>> value) {
        this.rqUIDsAndAsynchUIDs = value;
    }

    public void setActivateParameters(List<ActivateResponse.ActivateParameters> value) {
        this.activateParameters = value;
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
    public static class ActivateParameters implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
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
            final ActivateResponse.ActivateParameters that = ((ActivateResponse.ActivateParameters) object);
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
            if (draftCopy instanceof ActivateResponse.ActivateParameters) {
                final ActivateResponse.ActivateParameters copy = ((ActivateResponse.ActivateParameters) draftCopy);
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
            return new ActivateResponse.ActivateParameters();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ActivateResponse.ActivateParameters) {
                final ActivateResponse.ActivateParameters target = this;
                final ActivateResponse.ActivateParameters leftObject = ((ActivateResponse.ActivateParameters) left);
                final ActivateResponse.ActivateParameters rightObject = ((ActivateResponse.ActivateParameters) right);
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
        protected List<ActivateResponse.Notifications.Notification> notifications;

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
         * {@link ActivateResponse.Notifications.Notification }
         * 
         * 
         */
        public List<ActivateResponse.Notifications.Notification> getNotifications() {
            if (notifications == null) {
                notifications = new ArrayList<ActivateResponse.Notifications.Notification>();
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
                List<ActivateResponse.Notifications.Notification> theNotifications;
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
            final ActivateResponse.Notifications that = ((ActivateResponse.Notifications) object);
            {
                List<ActivateResponse.Notifications.Notification> lhsNotifications;
                lhsNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                List<ActivateResponse.Notifications.Notification> rhsNotifications;
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
                List<ActivateResponse.Notifications.Notification> theNotifications;
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
            if (draftCopy instanceof ActivateResponse.Notifications) {
                final ActivateResponse.Notifications copy = ((ActivateResponse.Notifications) draftCopy);
                {
                    Boolean notificationsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.notifications!= null)&&(!this.notifications.isEmpty())));
                    if (notificationsShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ActivateResponse.Notifications.Notification> sourceNotifications;
                        sourceNotifications = (((this.notifications!= null)&&(!this.notifications.isEmpty()))?this.getNotifications():null);
                        @SuppressWarnings("unchecked")
                        List<ActivateResponse.Notifications.Notification> copyNotifications = ((List<ActivateResponse.Notifications.Notification> ) strategy.copy(LocatorUtils.property(locator, "notifications", sourceNotifications), sourceNotifications, ((this.notifications!= null)&&(!this.notifications.isEmpty()))));
                        copy.notifications = null;
                        if (copyNotifications!= null) {
                            List<ActivateResponse.Notifications.Notification> uniqueNotificationsl = copy.getNotifications();
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
            return new ActivateResponse.Notifications();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ActivateResponse.Notifications) {
                final ActivateResponse.Notifications target = this;
                final ActivateResponse.Notifications leftObject = ((ActivateResponse.Notifications) left);
                final ActivateResponse.Notifications rightObject = ((ActivateResponse.Notifications) right);
                {
                    Boolean notificationsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty())));
                    if (notificationsShouldBeMergedAndSet == Boolean.TRUE) {
                        List<ActivateResponse.Notifications.Notification> lhsNotifications;
                        lhsNotifications = (((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty()))?leftObject.getNotifications():null);
                        List<ActivateResponse.Notifications.Notification> rhsNotifications;
                        rhsNotifications = (((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))?rightObject.getNotifications():null);
                        List<ActivateResponse.Notifications.Notification> mergedNotifications = ((List<ActivateResponse.Notifications.Notification> ) strategy.merge(LocatorUtils.property(leftLocator, "notifications", lhsNotifications), LocatorUtils.property(rightLocator, "notifications", rhsNotifications), lhsNotifications, rhsNotifications, ((leftObject.notifications!= null)&&(!leftObject.notifications.isEmpty())), ((rightObject.notifications!= null)&&(!rightObject.notifications.isEmpty()))));
                        target.notifications = null;
                        if (mergedNotifications!= null) {
                            List<ActivateResponse.Notifications.Notification> uniqueNotificationsl = target.getNotifications();
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

        public void setNotifications(List<ActivateResponse.Notifications.Notification> value) {
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
                final ActivateResponse.Notifications.Notification that = ((ActivateResponse.Notifications.Notification) object);
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
                if (draftCopy instanceof ActivateResponse.Notifications.Notification) {
                    final ActivateResponse.Notifications.Notification copy = ((ActivateResponse.Notifications.Notification) draftCopy);
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
                return new ActivateResponse.Notifications.Notification();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ActivateResponse.Notifications.Notification) {
                    final ActivateResponse.Notifications.Notification target = this;
                    final ActivateResponse.Notifications.Notification leftObject = ((ActivateResponse.Notifications.Notification) left);
                    final ActivateResponse.Notifications.Notification rightObject = ((ActivateResponse.Notifications.Notification) right);
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
