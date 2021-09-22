
package com.paymentplaform.raya.gate.activate;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
 * <p>Java class for Activate_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Activate_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaxRec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cursor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IdentifierId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActivationNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HashedPin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NationalId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActivateParameters" maxOccurs="unbounded" minOccurs="0"&gt;
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
@XmlType(name = "Activate_Request", namespace = "http://raya.paymentplaform.com/gate/activate", propOrder = {
    "rqUID",
    "maxRec",
    "cursor",
    "identifierId",
    "activationNumber",
    "serialNumber",
    "terminalId",
    "hashedPin",
    "nationalId",
    "activateParameters"
})
public class ActivateRequest implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MaxRec")
    protected Integer maxRec;
    @XmlElement(name = "Cursor")
    protected String cursor;
    @XmlElement(name = "IdentifierId", required = true)
    protected String identifierId;
    @XmlElement(name = "ActivationNumber", required = true)
    protected String activationNumber;
    @XmlElement(name = "SerialNumber", required = true)
    protected String serialNumber;
    @XmlElement(name = "TerminalId", required = true)
    protected String terminalId;
    @XmlElement(name = "HashedPin", required = true)
    protected String hashedPin;
    @XmlElement(name = "NationalId", required = true)
    protected String nationalId;
    @XmlElement(name = "ActivateParameters")
    protected List<ActivateRequest.ActivateParameters> activateParameters;

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
     * {@link ActivateRequest.ActivateParameters }
     * 
     * 
     */
    public List<ActivateRequest.ActivateParameters> getActivateParameters() {
        if (activateParameters == null) {
            activateParameters = new ArrayList<ActivateRequest.ActivateParameters>();
        }
        return this.activateParameters;
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
            List<ActivateRequest.ActivateParameters> theActivateParameters;
            theActivateParameters = (((this.activateParameters!= null)&&(!this.activateParameters.isEmpty()))?this.getActivateParameters():null);
            strategy.appendField(locator, this, "activateParameters", buffer, theActivateParameters, ((this.activateParameters!= null)&&(!this.activateParameters.isEmpty())));
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
        final ActivateRequest that = ((ActivateRequest) object);
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
            List<ActivateRequest.ActivateParameters> lhsActivateParameters;
            lhsActivateParameters = (((this.activateParameters!= null)&&(!this.activateParameters.isEmpty()))?this.getActivateParameters():null);
            List<ActivateRequest.ActivateParameters> rhsActivateParameters;
            rhsActivateParameters = (((that.activateParameters!= null)&&(!that.activateParameters.isEmpty()))?that.getActivateParameters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activateParameters", lhsActivateParameters), LocatorUtils.property(thatLocator, "activateParameters", rhsActivateParameters), lhsActivateParameters, rhsActivateParameters, ((this.activateParameters!= null)&&(!this.activateParameters.isEmpty())), ((that.activateParameters!= null)&&(!that.activateParameters.isEmpty())))) {
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
            List<ActivateRequest.ActivateParameters> theActivateParameters;
            theActivateParameters = (((this.activateParameters!= null)&&(!this.activateParameters.isEmpty()))?this.getActivateParameters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activateParameters", theActivateParameters), currentHashCode, theActivateParameters, ((this.activateParameters!= null)&&(!this.activateParameters.isEmpty())));
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
        if (draftCopy instanceof ActivateRequest) {
            final ActivateRequest copy = ((ActivateRequest) draftCopy);
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
                    List<ActivateRequest.ActivateParameters> sourceActivateParameters;
                    sourceActivateParameters = (((this.activateParameters!= null)&&(!this.activateParameters.isEmpty()))?this.getActivateParameters():null);
                    @SuppressWarnings("unchecked")
                    List<ActivateRequest.ActivateParameters> copyActivateParameters = ((List<ActivateRequest.ActivateParameters> ) strategy.copy(LocatorUtils.property(locator, "activateParameters", sourceActivateParameters), sourceActivateParameters, ((this.activateParameters!= null)&&(!this.activateParameters.isEmpty()))));
                    copy.activateParameters = null;
                    if (copyActivateParameters!= null) {
                        List<ActivateRequest.ActivateParameters> uniqueActivateParametersl = copy.getActivateParameters();
                        uniqueActivateParametersl.addAll(copyActivateParameters);
                    }
                } else {
                    if (activateParametersShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activateParameters = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ActivateRequest();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ActivateRequest) {
            final ActivateRequest target = this;
            final ActivateRequest leftObject = ((ActivateRequest) left);
            final ActivateRequest rightObject = ((ActivateRequest) right);
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
                    List<ActivateRequest.ActivateParameters> lhsActivateParameters;
                    lhsActivateParameters = (((leftObject.activateParameters!= null)&&(!leftObject.activateParameters.isEmpty()))?leftObject.getActivateParameters():null);
                    List<ActivateRequest.ActivateParameters> rhsActivateParameters;
                    rhsActivateParameters = (((rightObject.activateParameters!= null)&&(!rightObject.activateParameters.isEmpty()))?rightObject.getActivateParameters():null);
                    List<ActivateRequest.ActivateParameters> mergedActivateParameters = ((List<ActivateRequest.ActivateParameters> ) strategy.merge(LocatorUtils.property(leftLocator, "activateParameters", lhsActivateParameters), LocatorUtils.property(rightLocator, "activateParameters", rhsActivateParameters), lhsActivateParameters, rhsActivateParameters, ((leftObject.activateParameters!= null)&&(!leftObject.activateParameters.isEmpty())), ((rightObject.activateParameters!= null)&&(!rightObject.activateParameters.isEmpty()))));
                    target.activateParameters = null;
                    if (mergedActivateParameters!= null) {
                        List<ActivateRequest.ActivateParameters> uniqueActivateParametersl = target.getActivateParameters();
                        uniqueActivateParametersl.addAll(mergedActivateParameters);
                    }
                } else {
                    if (activateParametersShouldBeMergedAndSet == Boolean.FALSE) {
                        target.activateParameters = null;
                    }
                }
            }
        }
    }

    public void setActivateParameters(List<ActivateRequest.ActivateParameters> value) {
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
    public static class ActivateParameters implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
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
            final ActivateRequest.ActivateParameters that = ((ActivateRequest.ActivateParameters) object);
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
            if (draftCopy instanceof ActivateRequest.ActivateParameters) {
                final ActivateRequest.ActivateParameters copy = ((ActivateRequest.ActivateParameters) draftCopy);
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
            return new ActivateRequest.ActivateParameters();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ActivateRequest.ActivateParameters) {
                final ActivateRequest.ActivateParameters target = this;
                final ActivateRequest.ActivateParameters leftObject = ((ActivateRequest.ActivateParameters) left);
                final ActivateRequest.ActivateParameters rightObject = ((ActivateRequest.ActivateParameters) right);
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
