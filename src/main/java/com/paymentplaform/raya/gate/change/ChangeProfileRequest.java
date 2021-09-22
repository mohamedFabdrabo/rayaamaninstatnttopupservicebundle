
package com.paymentplaform.raya.gate.change;

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
 * <p>Java class for Change_profile_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Change_profile_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaxRec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cursor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Requester"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RequesterPIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *                             &lt;element name="IsHashed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="CurrentValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="NewValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="ExtraAttributes" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="attributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="attributeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Change_profile_Request", namespace = "http://raya.paymentplaform.com/gate/change", propOrder = {
    "rqUID",
    "maxRec",
    "cursor",
    "requester",
    "profileUpdates"
})
public class ChangeProfileRequest implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MaxRec")
    protected Integer maxRec;
    @XmlElement(name = "Cursor")
    protected String cursor;
    @XmlElement(name = "Requester", required = true)
    protected ChangeProfileRequest.Requester requester;
    @XmlElement(name = "ProfileUpdates", required = true)
    protected ChangeProfileRequest.ProfileUpdates profileUpdates;

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
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeProfileRequest.Requester }
     *     
     */
    public ChangeProfileRequest.Requester getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeProfileRequest.Requester }
     *     
     */
    public void setRequester(ChangeProfileRequest.Requester value) {
        this.requester = value;
    }

    /**
     * Gets the value of the profileUpdates property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeProfileRequest.ProfileUpdates }
     *     
     */
    public ChangeProfileRequest.ProfileUpdates getProfileUpdates() {
        return profileUpdates;
    }

    /**
     * Sets the value of the profileUpdates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeProfileRequest.ProfileUpdates }
     *     
     */
    public void setProfileUpdates(ChangeProfileRequest.ProfileUpdates value) {
        this.profileUpdates = value;
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
            ChangeProfileRequest.Requester theRequester;
            theRequester = this.getRequester();
            strategy.appendField(locator, this, "requester", buffer, theRequester, (this.requester!= null));
        }
        {
            ChangeProfileRequest.ProfileUpdates theProfileUpdates;
            theProfileUpdates = this.getProfileUpdates();
            strategy.appendField(locator, this, "profileUpdates", buffer, theProfileUpdates, (this.profileUpdates!= null));
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
        final ChangeProfileRequest that = ((ChangeProfileRequest) object);
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
            ChangeProfileRequest.Requester lhsRequester;
            lhsRequester = this.getRequester();
            ChangeProfileRequest.Requester rhsRequester;
            rhsRequester = that.getRequester();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requester", lhsRequester), LocatorUtils.property(thatLocator, "requester", rhsRequester), lhsRequester, rhsRequester, (this.requester!= null), (that.requester!= null))) {
                return false;
            }
        }
        {
            ChangeProfileRequest.ProfileUpdates lhsProfileUpdates;
            lhsProfileUpdates = this.getProfileUpdates();
            ChangeProfileRequest.ProfileUpdates rhsProfileUpdates;
            rhsProfileUpdates = that.getProfileUpdates();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "profileUpdates", lhsProfileUpdates), LocatorUtils.property(thatLocator, "profileUpdates", rhsProfileUpdates), lhsProfileUpdates, rhsProfileUpdates, (this.profileUpdates!= null), (that.profileUpdates!= null))) {
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
            ChangeProfileRequest.Requester theRequester;
            theRequester = this.getRequester();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requester", theRequester), currentHashCode, theRequester, (this.requester!= null));
        }
        {
            ChangeProfileRequest.ProfileUpdates theProfileUpdates;
            theProfileUpdates = this.getProfileUpdates();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "profileUpdates", theProfileUpdates), currentHashCode, theProfileUpdates, (this.profileUpdates!= null));
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
        if (draftCopy instanceof ChangeProfileRequest) {
            final ChangeProfileRequest copy = ((ChangeProfileRequest) draftCopy);
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
                Boolean requesterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.requester!= null));
                if (requesterShouldBeCopiedAndSet == Boolean.TRUE) {
                    ChangeProfileRequest.Requester sourceRequester;
                    sourceRequester = this.getRequester();
                    ChangeProfileRequest.Requester copyRequester = ((ChangeProfileRequest.Requester) strategy.copy(LocatorUtils.property(locator, "requester", sourceRequester), sourceRequester, (this.requester!= null)));
                    copy.setRequester(copyRequester);
                } else {
                    if (requesterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.requester = null;
                    }
                }
            }
            {
                Boolean profileUpdatesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.profileUpdates!= null));
                if (profileUpdatesShouldBeCopiedAndSet == Boolean.TRUE) {
                    ChangeProfileRequest.ProfileUpdates sourceProfileUpdates;
                    sourceProfileUpdates = this.getProfileUpdates();
                    ChangeProfileRequest.ProfileUpdates copyProfileUpdates = ((ChangeProfileRequest.ProfileUpdates) strategy.copy(LocatorUtils.property(locator, "profileUpdates", sourceProfileUpdates), sourceProfileUpdates, (this.profileUpdates!= null)));
                    copy.setProfileUpdates(copyProfileUpdates);
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
        return new ChangeProfileRequest();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ChangeProfileRequest) {
            final ChangeProfileRequest target = this;
            final ChangeProfileRequest leftObject = ((ChangeProfileRequest) left);
            final ChangeProfileRequest rightObject = ((ChangeProfileRequest) right);
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
                Boolean requesterShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.requester!= null), (rightObject.requester!= null));
                if (requesterShouldBeMergedAndSet == Boolean.TRUE) {
                    ChangeProfileRequest.Requester lhsRequester;
                    lhsRequester = leftObject.getRequester();
                    ChangeProfileRequest.Requester rhsRequester;
                    rhsRequester = rightObject.getRequester();
                    ChangeProfileRequest.Requester mergedRequester = ((ChangeProfileRequest.Requester) strategy.merge(LocatorUtils.property(leftLocator, "requester", lhsRequester), LocatorUtils.property(rightLocator, "requester", rhsRequester), lhsRequester, rhsRequester, (leftObject.requester!= null), (rightObject.requester!= null)));
                    target.setRequester(mergedRequester);
                } else {
                    if (requesterShouldBeMergedAndSet == Boolean.FALSE) {
                        target.requester = null;
                    }
                }
            }
            {
                Boolean profileUpdatesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.profileUpdates!= null), (rightObject.profileUpdates!= null));
                if (profileUpdatesShouldBeMergedAndSet == Boolean.TRUE) {
                    ChangeProfileRequest.ProfileUpdates lhsProfileUpdates;
                    lhsProfileUpdates = leftObject.getProfileUpdates();
                    ChangeProfileRequest.ProfileUpdates rhsProfileUpdates;
                    rhsProfileUpdates = rightObject.getProfileUpdates();
                    ChangeProfileRequest.ProfileUpdates mergedProfileUpdates = ((ChangeProfileRequest.ProfileUpdates) strategy.merge(LocatorUtils.property(leftLocator, "profileUpdates", lhsProfileUpdates), LocatorUtils.property(rightLocator, "profileUpdates", rhsProfileUpdates), lhsProfileUpdates, rhsProfileUpdates, (leftObject.profileUpdates!= null), (rightObject.profileUpdates!= null)));
                    target.setProfileUpdates(mergedProfileUpdates);
                } else {
                    if (profileUpdatesShouldBeMergedAndSet == Boolean.FALSE) {
                        target.profileUpdates = null;
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
     *                   &lt;element name="IsHashed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="CurrentValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="NewValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "profileUpdates",
        "extraAttributes"
    })
    public static class ProfileUpdates implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "ProfileUpdate", required = true)
        protected List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> profileUpdates;
        @XmlElement(name = "ExtraAttributes")
        protected List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> extraAttributes;

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
         * {@link ChangeProfileRequest.ProfileUpdates.ProfileUpdate }
         * 
         * 
         */
        public List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> getProfileUpdates() {
            if (profileUpdates == null) {
                profileUpdates = new ArrayList<ChangeProfileRequest.ProfileUpdates.ProfileUpdate>();
            }
            return this.profileUpdates;
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
         * {@link ChangeProfileRequest.ProfileUpdates.ExtraAttributes }
         * 
         * 
         */
        public List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> getExtraAttributes() {
            if (extraAttributes == null) {
                extraAttributes = new ArrayList<ChangeProfileRequest.ProfileUpdates.ExtraAttributes>();
            }
            return this.extraAttributes;
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
                List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> theProfileUpdates;
                theProfileUpdates = (((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty()))?this.getProfileUpdates():null);
                strategy.appendField(locator, this, "profileUpdates", buffer, theProfileUpdates, ((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty())));
            }
            {
                List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> theExtraAttributes;
                theExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
                strategy.appendField(locator, this, "extraAttributes", buffer, theExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
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
            final ChangeProfileRequest.ProfileUpdates that = ((ChangeProfileRequest.ProfileUpdates) object);
            {
                List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> lhsProfileUpdates;
                lhsProfileUpdates = (((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty()))?this.getProfileUpdates():null);
                List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> rhsProfileUpdates;
                rhsProfileUpdates = (((that.profileUpdates!= null)&&(!that.profileUpdates.isEmpty()))?that.getProfileUpdates():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "profileUpdates", lhsProfileUpdates), LocatorUtils.property(thatLocator, "profileUpdates", rhsProfileUpdates), lhsProfileUpdates, rhsProfileUpdates, ((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty())), ((that.profileUpdates!= null)&&(!that.profileUpdates.isEmpty())))) {
                    return false;
                }
            }
            {
                List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> lhsExtraAttributes;
                lhsExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
                List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> rhsExtraAttributes;
                rhsExtraAttributes = (((that.extraAttributes!= null)&&(!that.extraAttributes.isEmpty()))?that.getExtraAttributes():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(thatLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())), ((that.extraAttributes!= null)&&(!that.extraAttributes.isEmpty())))) {
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
                List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> theProfileUpdates;
                theProfileUpdates = (((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty()))?this.getProfileUpdates():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "profileUpdates", theProfileUpdates), currentHashCode, theProfileUpdates, ((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty())));
            }
            {
                List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> theExtraAttributes;
                theExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extraAttributes", theExtraAttributes), currentHashCode, theExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
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
            if (draftCopy instanceof ChangeProfileRequest.ProfileUpdates) {
                final ChangeProfileRequest.ProfileUpdates copy = ((ChangeProfileRequest.ProfileUpdates) draftCopy);
                {
                    Boolean profileUpdatesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty())));
                    if (profileUpdatesShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> sourceProfileUpdates;
                        sourceProfileUpdates = (((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty()))?this.getProfileUpdates():null);
                        @SuppressWarnings("unchecked")
                        List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> copyProfileUpdates = ((List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> ) strategy.copy(LocatorUtils.property(locator, "profileUpdates", sourceProfileUpdates), sourceProfileUpdates, ((this.profileUpdates!= null)&&(!this.profileUpdates.isEmpty()))));
                        copy.profileUpdates = null;
                        if (copyProfileUpdates!= null) {
                            List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> uniqueProfileUpdatesl = copy.getProfileUpdates();
                            uniqueProfileUpdatesl.addAll(copyProfileUpdates);
                        }
                    } else {
                        if (profileUpdatesShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.profileUpdates = null;
                        }
                    }
                }
                {
                    Boolean extraAttributesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
                    if (extraAttributesShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> sourceExtraAttributes;
                        sourceExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
                        @SuppressWarnings("unchecked")
                        List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> copyExtraAttributes = ((List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> ) strategy.copy(LocatorUtils.property(locator, "extraAttributes", sourceExtraAttributes), sourceExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))));
                        copy.extraAttributes = null;
                        if (copyExtraAttributes!= null) {
                            List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> uniqueExtraAttributesl = copy.getExtraAttributes();
                            uniqueExtraAttributesl.addAll(copyExtraAttributes);
                        }
                    } else {
                        if (extraAttributesShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.extraAttributes = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ChangeProfileRequest.ProfileUpdates();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ChangeProfileRequest.ProfileUpdates) {
                final ChangeProfileRequest.ProfileUpdates target = this;
                final ChangeProfileRequest.ProfileUpdates leftObject = ((ChangeProfileRequest.ProfileUpdates) left);
                final ChangeProfileRequest.ProfileUpdates rightObject = ((ChangeProfileRequest.ProfileUpdates) right);
                {
                    Boolean profileUpdatesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.profileUpdates!= null)&&(!leftObject.profileUpdates.isEmpty())), ((rightObject.profileUpdates!= null)&&(!rightObject.profileUpdates.isEmpty())));
                    if (profileUpdatesShouldBeMergedAndSet == Boolean.TRUE) {
                        List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> lhsProfileUpdates;
                        lhsProfileUpdates = (((leftObject.profileUpdates!= null)&&(!leftObject.profileUpdates.isEmpty()))?leftObject.getProfileUpdates():null);
                        List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> rhsProfileUpdates;
                        rhsProfileUpdates = (((rightObject.profileUpdates!= null)&&(!rightObject.profileUpdates.isEmpty()))?rightObject.getProfileUpdates():null);
                        List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> mergedProfileUpdates = ((List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> ) strategy.merge(LocatorUtils.property(leftLocator, "profileUpdates", lhsProfileUpdates), LocatorUtils.property(rightLocator, "profileUpdates", rhsProfileUpdates), lhsProfileUpdates, rhsProfileUpdates, ((leftObject.profileUpdates!= null)&&(!leftObject.profileUpdates.isEmpty())), ((rightObject.profileUpdates!= null)&&(!rightObject.profileUpdates.isEmpty()))));
                        target.profileUpdates = null;
                        if (mergedProfileUpdates!= null) {
                            List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> uniqueProfileUpdatesl = target.getProfileUpdates();
                            uniqueProfileUpdatesl.addAll(mergedProfileUpdates);
                        }
                    } else {
                        if (profileUpdatesShouldBeMergedAndSet == Boolean.FALSE) {
                            target.profileUpdates = null;
                        }
                    }
                }
                {
                    Boolean extraAttributesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty())));
                    if (extraAttributesShouldBeMergedAndSet == Boolean.TRUE) {
                        List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> lhsExtraAttributes;
                        lhsExtraAttributes = (((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty()))?leftObject.getExtraAttributes():null);
                        List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> rhsExtraAttributes;
                        rhsExtraAttributes = (((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))?rightObject.getExtraAttributes():null);
                        List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> mergedExtraAttributes = ((List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> ) strategy.merge(LocatorUtils.property(leftLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(rightLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))));
                        target.extraAttributes = null;
                        if (mergedExtraAttributes!= null) {
                            List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> uniqueExtraAttributesl = target.getExtraAttributes();
                            uniqueExtraAttributesl.addAll(mergedExtraAttributes);
                        }
                    } else {
                        if (extraAttributesShouldBeMergedAndSet == Boolean.FALSE) {
                            target.extraAttributes = null;
                        }
                    }
                }
            }
        }

        public void setProfileUpdates(List<ChangeProfileRequest.ProfileUpdates.ProfileUpdate> value) {
            this.profileUpdates = value;
        }

        public void setExtraAttributes(List<ChangeProfileRequest.ProfileUpdates.ExtraAttributes> value) {
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
                final ChangeProfileRequest.ProfileUpdates.ExtraAttributes that = ((ChangeProfileRequest.ProfileUpdates.ExtraAttributes) object);
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
                if (draftCopy instanceof ChangeProfileRequest.ProfileUpdates.ExtraAttributes) {
                    final ChangeProfileRequest.ProfileUpdates.ExtraAttributes copy = ((ChangeProfileRequest.ProfileUpdates.ExtraAttributes) draftCopy);
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
                return new ChangeProfileRequest.ProfileUpdates.ExtraAttributes();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ChangeProfileRequest.ProfileUpdates.ExtraAttributes) {
                    final ChangeProfileRequest.ProfileUpdates.ExtraAttributes target = this;
                    final ChangeProfileRequest.ProfileUpdates.ExtraAttributes leftObject = ((ChangeProfileRequest.ProfileUpdates.ExtraAttributes) left);
                    final ChangeProfileRequest.ProfileUpdates.ExtraAttributes rightObject = ((ChangeProfileRequest.ProfileUpdates.ExtraAttributes) right);
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
         *         &lt;element name="DemandAccount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ProfileElement" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="IsHashed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="CurrentValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="NewValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
            "profileElement",
            "isHashed",
            "currentValue",
            "newValue"
        })
        public static class ProfileUpdate implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            @XmlElement(name = "DemandAccount", required = true)
            protected String demandAccount;
            @XmlElement(name = "ProfileElement", required = true)
            protected String profileElement;
            @XmlElement(name = "IsHashed")
            protected boolean isHashed;
            @XmlElement(name = "CurrentValue", required = true)
            protected String currentValue;
            @XmlElement(name = "NewValue", required = true)
            protected String newValue;

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

            /**
             * Gets the value of the isHashed property.
             * 
             */
            public boolean isIsHashed() {
                return isHashed;
            }

            /**
             * Sets the value of the isHashed property.
             * 
             */
            public void setIsHashed(boolean value) {
                this.isHashed = value;
            }

            /**
             * Gets the value of the currentValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrentValue() {
                return currentValue;
            }

            /**
             * Sets the value of the currentValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrentValue(String value) {
                this.currentValue = value;
            }

            /**
             * Gets the value of the newValue property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewValue() {
                return newValue;
            }

            /**
             * Sets the value of the newValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewValue(String value) {
                this.newValue = value;
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
                {
                    boolean theIsHashed;
                    theIsHashed = this.isIsHashed();
                    strategy.appendField(locator, this, "isHashed", buffer, theIsHashed, true);
                }
                {
                    String theCurrentValue;
                    theCurrentValue = this.getCurrentValue();
                    strategy.appendField(locator, this, "currentValue", buffer, theCurrentValue, (this.currentValue!= null));
                }
                {
                    String theNewValue;
                    theNewValue = this.getNewValue();
                    strategy.appendField(locator, this, "newValue", buffer, theNewValue, (this.newValue!= null));
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
                final ChangeProfileRequest.ProfileUpdates.ProfileUpdate that = ((ChangeProfileRequest.ProfileUpdates.ProfileUpdate) object);
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
                {
                    boolean lhsIsHashed;
                    lhsIsHashed = this.isIsHashed();
                    boolean rhsIsHashed;
                    rhsIsHashed = that.isIsHashed();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "isHashed", lhsIsHashed), LocatorUtils.property(thatLocator, "isHashed", rhsIsHashed), lhsIsHashed, rhsIsHashed, true, true)) {
                        return false;
                    }
                }
                {
                    String lhsCurrentValue;
                    lhsCurrentValue = this.getCurrentValue();
                    String rhsCurrentValue;
                    rhsCurrentValue = that.getCurrentValue();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "currentValue", lhsCurrentValue), LocatorUtils.property(thatLocator, "currentValue", rhsCurrentValue), lhsCurrentValue, rhsCurrentValue, (this.currentValue!= null), (that.currentValue!= null))) {
                        return false;
                    }
                }
                {
                    String lhsNewValue;
                    lhsNewValue = this.getNewValue();
                    String rhsNewValue;
                    rhsNewValue = that.getNewValue();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "newValue", lhsNewValue), LocatorUtils.property(thatLocator, "newValue", rhsNewValue), lhsNewValue, rhsNewValue, (this.newValue!= null), (that.newValue!= null))) {
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
                {
                    boolean theIsHashed;
                    theIsHashed = this.isIsHashed();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isHashed", theIsHashed), currentHashCode, theIsHashed, true);
                }
                {
                    String theCurrentValue;
                    theCurrentValue = this.getCurrentValue();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentValue", theCurrentValue), currentHashCode, theCurrentValue, (this.currentValue!= null));
                }
                {
                    String theNewValue;
                    theNewValue = this.getNewValue();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "newValue", theNewValue), currentHashCode, theNewValue, (this.newValue!= null));
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
                if (draftCopy instanceof ChangeProfileRequest.ProfileUpdates.ProfileUpdate) {
                    final ChangeProfileRequest.ProfileUpdates.ProfileUpdate copy = ((ChangeProfileRequest.ProfileUpdates.ProfileUpdate) draftCopy);
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
                    {
                        Boolean isHashedShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                        if (isHashedShouldBeCopiedAndSet == Boolean.TRUE) {
                            boolean sourceIsHashed;
                            sourceIsHashed = this.isIsHashed();
                            boolean copyIsHashed = strategy.copy(LocatorUtils.property(locator, "isHashed", sourceIsHashed), sourceIsHashed, true);
                            copy.setIsHashed(copyIsHashed);
                        } else {
                            if (isHashedShouldBeCopiedAndSet == Boolean.FALSE) {
                            }
                        }
                    }
                    {
                        Boolean currentValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.currentValue!= null));
                        if (currentValueShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceCurrentValue;
                            sourceCurrentValue = this.getCurrentValue();
                            String copyCurrentValue = ((String) strategy.copy(LocatorUtils.property(locator, "currentValue", sourceCurrentValue), sourceCurrentValue, (this.currentValue!= null)));
                            copy.setCurrentValue(copyCurrentValue);
                        } else {
                            if (currentValueShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.currentValue = null;
                            }
                        }
                    }
                    {
                        Boolean newValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.newValue!= null));
                        if (newValueShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceNewValue;
                            sourceNewValue = this.getNewValue();
                            String copyNewValue = ((String) strategy.copy(LocatorUtils.property(locator, "newValue", sourceNewValue), sourceNewValue, (this.newValue!= null)));
                            copy.setNewValue(copyNewValue);
                        } else {
                            if (newValueShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.newValue = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new ChangeProfileRequest.ProfileUpdates.ProfileUpdate();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ChangeProfileRequest.ProfileUpdates.ProfileUpdate) {
                    final ChangeProfileRequest.ProfileUpdates.ProfileUpdate target = this;
                    final ChangeProfileRequest.ProfileUpdates.ProfileUpdate leftObject = ((ChangeProfileRequest.ProfileUpdates.ProfileUpdate) left);
                    final ChangeProfileRequest.ProfileUpdates.ProfileUpdate rightObject = ((ChangeProfileRequest.ProfileUpdates.ProfileUpdate) right);
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
                    {
                        Boolean isHashedShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, true, true);
                        if (isHashedShouldBeMergedAndSet == Boolean.TRUE) {
                            boolean lhsIsHashed;
                            lhsIsHashed = leftObject.isIsHashed();
                            boolean rhsIsHashed;
                            rhsIsHashed = rightObject.isIsHashed();
                            boolean mergedIsHashed = ((boolean) strategy.merge(LocatorUtils.property(leftLocator, "isHashed", lhsIsHashed), LocatorUtils.property(rightLocator, "isHashed", rhsIsHashed), lhsIsHashed, rhsIsHashed, true, true));
                            target.setIsHashed(mergedIsHashed);
                        } else {
                            if (isHashedShouldBeMergedAndSet == Boolean.FALSE) {
                            }
                        }
                    }
                    {
                        Boolean currentValueShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.currentValue!= null), (rightObject.currentValue!= null));
                        if (currentValueShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsCurrentValue;
                            lhsCurrentValue = leftObject.getCurrentValue();
                            String rhsCurrentValue;
                            rhsCurrentValue = rightObject.getCurrentValue();
                            String mergedCurrentValue = ((String) strategy.merge(LocatorUtils.property(leftLocator, "currentValue", lhsCurrentValue), LocatorUtils.property(rightLocator, "currentValue", rhsCurrentValue), lhsCurrentValue, rhsCurrentValue, (leftObject.currentValue!= null), (rightObject.currentValue!= null)));
                            target.setCurrentValue(mergedCurrentValue);
                        } else {
                            if (currentValueShouldBeMergedAndSet == Boolean.FALSE) {
                                target.currentValue = null;
                            }
                        }
                    }
                    {
                        Boolean newValueShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.newValue!= null), (rightObject.newValue!= null));
                        if (newValueShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsNewValue;
                            lhsNewValue = leftObject.getNewValue();
                            String rhsNewValue;
                            rhsNewValue = rightObject.getNewValue();
                            String mergedNewValue = ((String) strategy.merge(LocatorUtils.property(leftLocator, "newValue", lhsNewValue), LocatorUtils.property(rightLocator, "newValue", rhsNewValue), lhsNewValue, rhsNewValue, (leftObject.newValue!= null), (rightObject.newValue!= null)));
                            target.setNewValue(mergedNewValue);
                        } else {
                            if (newValueShouldBeMergedAndSet == Boolean.FALSE) {
                                target.newValue = null;
                            }
                        }
                    }
                }
            }

            public boolean getIsHashed() {
                return isIsHashed();
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
     *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RequesterPIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "userID",
        "accountNo",
        "requesterPIN"
    })
    public static class Requester implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "UserID")
        protected String userID;
        @XmlElement(name = "AccountNo")
        protected String accountNo;
        @XmlElement(name = "RequesterPIN", required = true)
        protected String requesterPIN;

        /**
         * Gets the value of the userID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserID() {
            return userID;
        }

        /**
         * Sets the value of the userID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserID(String value) {
            this.userID = value;
        }

        /**
         * Gets the value of the accountNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountNo() {
            return accountNo;
        }

        /**
         * Sets the value of the accountNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountNo(String value) {
            this.accountNo = value;
        }

        /**
         * Gets the value of the requesterPIN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequesterPIN() {
            return requesterPIN;
        }

        /**
         * Sets the value of the requesterPIN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequesterPIN(String value) {
            this.requesterPIN = value;
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
                String theUserID;
                theUserID = this.getUserID();
                strategy.appendField(locator, this, "userID", buffer, theUserID, (this.userID!= null));
            }
            {
                String theAccountNo;
                theAccountNo = this.getAccountNo();
                strategy.appendField(locator, this, "accountNo", buffer, theAccountNo, (this.accountNo!= null));
            }
            {
                String theRequesterPIN;
                theRequesterPIN = this.getRequesterPIN();
                strategy.appendField(locator, this, "requesterPIN", buffer, theRequesterPIN, (this.requesterPIN!= null));
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
            final ChangeProfileRequest.Requester that = ((ChangeProfileRequest.Requester) object);
            {
                String lhsUserID;
                lhsUserID = this.getUserID();
                String rhsUserID;
                rhsUserID = that.getUserID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "userID", lhsUserID), LocatorUtils.property(thatLocator, "userID", rhsUserID), lhsUserID, rhsUserID, (this.userID!= null), (that.userID!= null))) {
                    return false;
                }
            }
            {
                String lhsAccountNo;
                lhsAccountNo = this.getAccountNo();
                String rhsAccountNo;
                rhsAccountNo = that.getAccountNo();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "accountNo", lhsAccountNo), LocatorUtils.property(thatLocator, "accountNo", rhsAccountNo), lhsAccountNo, rhsAccountNo, (this.accountNo!= null), (that.accountNo!= null))) {
                    return false;
                }
            }
            {
                String lhsRequesterPIN;
                lhsRequesterPIN = this.getRequesterPIN();
                String rhsRequesterPIN;
                rhsRequesterPIN = that.getRequesterPIN();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "requesterPIN", lhsRequesterPIN), LocatorUtils.property(thatLocator, "requesterPIN", rhsRequesterPIN), lhsRequesterPIN, rhsRequesterPIN, (this.requesterPIN!= null), (that.requesterPIN!= null))) {
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
                String theUserID;
                theUserID = this.getUserID();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userID", theUserID), currentHashCode, theUserID, (this.userID!= null));
            }
            {
                String theAccountNo;
                theAccountNo = this.getAccountNo();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountNo", theAccountNo), currentHashCode, theAccountNo, (this.accountNo!= null));
            }
            {
                String theRequesterPIN;
                theRequesterPIN = this.getRequesterPIN();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requesterPIN", theRequesterPIN), currentHashCode, theRequesterPIN, (this.requesterPIN!= null));
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
            if (draftCopy instanceof ChangeProfileRequest.Requester) {
                final ChangeProfileRequest.Requester copy = ((ChangeProfileRequest.Requester) draftCopy);
                {
                    Boolean userIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.userID!= null));
                    if (userIDShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceUserID;
                        sourceUserID = this.getUserID();
                        String copyUserID = ((String) strategy.copy(LocatorUtils.property(locator, "userID", sourceUserID), sourceUserID, (this.userID!= null)));
                        copy.setUserID(copyUserID);
                    } else {
                        if (userIDShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.userID = null;
                        }
                    }
                }
                {
                    Boolean accountNoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.accountNo!= null));
                    if (accountNoShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceAccountNo;
                        sourceAccountNo = this.getAccountNo();
                        String copyAccountNo = ((String) strategy.copy(LocatorUtils.property(locator, "accountNo", sourceAccountNo), sourceAccountNo, (this.accountNo!= null)));
                        copy.setAccountNo(copyAccountNo);
                    } else {
                        if (accountNoShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.accountNo = null;
                        }
                    }
                }
                {
                    Boolean requesterPINShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.requesterPIN!= null));
                    if (requesterPINShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceRequesterPIN;
                        sourceRequesterPIN = this.getRequesterPIN();
                        String copyRequesterPIN = ((String) strategy.copy(LocatorUtils.property(locator, "requesterPIN", sourceRequesterPIN), sourceRequesterPIN, (this.requesterPIN!= null)));
                        copy.setRequesterPIN(copyRequesterPIN);
                    } else {
                        if (requesterPINShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.requesterPIN = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ChangeProfileRequest.Requester();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ChangeProfileRequest.Requester) {
                final ChangeProfileRequest.Requester target = this;
                final ChangeProfileRequest.Requester leftObject = ((ChangeProfileRequest.Requester) left);
                final ChangeProfileRequest.Requester rightObject = ((ChangeProfileRequest.Requester) right);
                {
                    Boolean userIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.userID!= null), (rightObject.userID!= null));
                    if (userIDShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsUserID;
                        lhsUserID = leftObject.getUserID();
                        String rhsUserID;
                        rhsUserID = rightObject.getUserID();
                        String mergedUserID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "userID", lhsUserID), LocatorUtils.property(rightLocator, "userID", rhsUserID), lhsUserID, rhsUserID, (leftObject.userID!= null), (rightObject.userID!= null)));
                        target.setUserID(mergedUserID);
                    } else {
                        if (userIDShouldBeMergedAndSet == Boolean.FALSE) {
                            target.userID = null;
                        }
                    }
                }
                {
                    Boolean accountNoShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.accountNo!= null), (rightObject.accountNo!= null));
                    if (accountNoShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsAccountNo;
                        lhsAccountNo = leftObject.getAccountNo();
                        String rhsAccountNo;
                        rhsAccountNo = rightObject.getAccountNo();
                        String mergedAccountNo = ((String) strategy.merge(LocatorUtils.property(leftLocator, "accountNo", lhsAccountNo), LocatorUtils.property(rightLocator, "accountNo", rhsAccountNo), lhsAccountNo, rhsAccountNo, (leftObject.accountNo!= null), (rightObject.accountNo!= null)));
                        target.setAccountNo(mergedAccountNo);
                    } else {
                        if (accountNoShouldBeMergedAndSet == Boolean.FALSE) {
                            target.accountNo = null;
                        }
                    }
                }
                {
                    Boolean requesterPINShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.requesterPIN!= null), (rightObject.requesterPIN!= null));
                    if (requesterPINShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsRequesterPIN;
                        lhsRequesterPIN = leftObject.getRequesterPIN();
                        String rhsRequesterPIN;
                        rhsRequesterPIN = rightObject.getRequesterPIN();
                        String mergedRequesterPIN = ((String) strategy.merge(LocatorUtils.property(leftLocator, "requesterPIN", lhsRequesterPIN), LocatorUtils.property(rightLocator, "requesterPIN", rhsRequesterPIN), lhsRequesterPIN, rhsRequesterPIN, (leftObject.requesterPIN!= null), (rightObject.requesterPIN!= null)));
                        target.setRequesterPIN(mergedRequesterPIN);
                    } else {
                        if (requesterPINShouldBeMergedAndSet == Boolean.FALSE) {
                            target.requesterPIN = null;
                        }
                    }
                }
            }
        }

    }

}
