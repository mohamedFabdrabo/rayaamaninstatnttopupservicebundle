
package com.paymentplaform.raya.gate;

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
 * <p>Java class for Source complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Source"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BOrgCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BOrgPIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Source", namespace = "http://raya.paymentplaform.com/gate", propOrder = {
    "bOrgCode",
    "bOrgPIN"
})
public class Source implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "BOrgCode", required = true)
    protected String bOrgCode;
    @XmlElement(name = "BOrgPIN")
    protected String bOrgPIN;

    /**
     * Gets the value of the bOrgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOrgCode() {
        return bOrgCode;
    }

    /**
     * Sets the value of the bOrgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOrgCode(String value) {
        this.bOrgCode = value;
    }

    /**
     * Gets the value of the bOrgPIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBOrgPIN() {
        return bOrgPIN;
    }

    /**
     * Sets the value of the bOrgPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBOrgPIN(String value) {
        this.bOrgPIN = value;
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
            String theBOrgCode;
            theBOrgCode = this.getBOrgCode();
            strategy.appendField(locator, this, "bOrgCode", buffer, theBOrgCode, (this.bOrgCode!= null));
        }
        {
            String theBOrgPIN;
            theBOrgPIN = this.getBOrgPIN();
            strategy.appendField(locator, this, "bOrgPIN", buffer, theBOrgPIN, (this.bOrgPIN!= null));
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
        final Source that = ((Source) object);
        {
            String lhsBOrgCode;
            lhsBOrgCode = this.getBOrgCode();
            String rhsBOrgCode;
            rhsBOrgCode = that.getBOrgCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bOrgCode", lhsBOrgCode), LocatorUtils.property(thatLocator, "bOrgCode", rhsBOrgCode), lhsBOrgCode, rhsBOrgCode, (this.bOrgCode!= null), (that.bOrgCode!= null))) {
                return false;
            }
        }
        {
            String lhsBOrgPIN;
            lhsBOrgPIN = this.getBOrgPIN();
            String rhsBOrgPIN;
            rhsBOrgPIN = that.getBOrgPIN();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bOrgPIN", lhsBOrgPIN), LocatorUtils.property(thatLocator, "bOrgPIN", rhsBOrgPIN), lhsBOrgPIN, rhsBOrgPIN, (this.bOrgPIN!= null), (that.bOrgPIN!= null))) {
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
            String theBOrgCode;
            theBOrgCode = this.getBOrgCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bOrgCode", theBOrgCode), currentHashCode, theBOrgCode, (this.bOrgCode!= null));
        }
        {
            String theBOrgPIN;
            theBOrgPIN = this.getBOrgPIN();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bOrgPIN", theBOrgPIN), currentHashCode, theBOrgPIN, (this.bOrgPIN!= null));
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
        if (draftCopy instanceof Source) {
            final Source copy = ((Source) draftCopy);
            {
                Boolean bOrgCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bOrgCode!= null));
                if (bOrgCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBOrgCode;
                    sourceBOrgCode = this.getBOrgCode();
                    String copyBOrgCode = ((String) strategy.copy(LocatorUtils.property(locator, "bOrgCode", sourceBOrgCode), sourceBOrgCode, (this.bOrgCode!= null)));
                    copy.setBOrgCode(copyBOrgCode);
                } else {
                    if (bOrgCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bOrgCode = null;
                    }
                }
            }
            {
                Boolean bOrgPINShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.bOrgPIN!= null));
                if (bOrgPINShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBOrgPIN;
                    sourceBOrgPIN = this.getBOrgPIN();
                    String copyBOrgPIN = ((String) strategy.copy(LocatorUtils.property(locator, "bOrgPIN", sourceBOrgPIN), sourceBOrgPIN, (this.bOrgPIN!= null)));
                    copy.setBOrgPIN(copyBOrgPIN);
                } else {
                    if (bOrgPINShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.bOrgPIN = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Source();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof Source) {
            final Source target = this;
            final Source leftObject = ((Source) left);
            final Source rightObject = ((Source) right);
            {
                Boolean bOrgCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.bOrgCode!= null), (rightObject.bOrgCode!= null));
                if (bOrgCodeShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsBOrgCode;
                    lhsBOrgCode = leftObject.getBOrgCode();
                    String rhsBOrgCode;
                    rhsBOrgCode = rightObject.getBOrgCode();
                    String mergedBOrgCode = ((String) strategy.merge(LocatorUtils.property(leftLocator, "bOrgCode", lhsBOrgCode), LocatorUtils.property(rightLocator, "bOrgCode", rhsBOrgCode), lhsBOrgCode, rhsBOrgCode, (leftObject.bOrgCode!= null), (rightObject.bOrgCode!= null)));
                    target.setBOrgCode(mergedBOrgCode);
                } else {
                    if (bOrgCodeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.bOrgCode = null;
                    }
                }
            }
            {
                Boolean bOrgPINShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.bOrgPIN!= null), (rightObject.bOrgPIN!= null));
                if (bOrgPINShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsBOrgPIN;
                    lhsBOrgPIN = leftObject.getBOrgPIN();
                    String rhsBOrgPIN;
                    rhsBOrgPIN = rightObject.getBOrgPIN();
                    String mergedBOrgPIN = ((String) strategy.merge(LocatorUtils.property(leftLocator, "bOrgPIN", lhsBOrgPIN), LocatorUtils.property(rightLocator, "bOrgPIN", rhsBOrgPIN), lhsBOrgPIN, rhsBOrgPIN, (leftObject.bOrgPIN!= null), (rightObject.bOrgPIN!= null)));
                    target.setBOrgPIN(mergedBOrgPIN);
                } else {
                    if (bOrgPINShouldBeMergedAndSet == Boolean.FALSE) {
                        target.bOrgPIN = null;
                    }
                }
            }
        }
    }

}
