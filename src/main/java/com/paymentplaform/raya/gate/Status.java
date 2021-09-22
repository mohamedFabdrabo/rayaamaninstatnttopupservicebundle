
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
 * <p>Java class for Status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Status"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Status", namespace = "http://raya.paymentplaform.com/gate", propOrder = {
    "responseCode",
    "responseDesc"
})
public class Status implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "ResponseCode", required = true)
    protected String responseCode;
    @XmlElement(name = "ResponseDesc")
    protected String responseDesc;

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the responseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDesc() {
        return responseDesc;
    }

    /**
     * Sets the value of the responseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDesc(String value) {
        this.responseDesc = value;
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
            String theResponseCode;
            theResponseCode = this.getResponseCode();
            strategy.appendField(locator, this, "responseCode", buffer, theResponseCode, (this.responseCode!= null));
        }
        {
            String theResponseDesc;
            theResponseDesc = this.getResponseDesc();
            strategy.appendField(locator, this, "responseDesc", buffer, theResponseDesc, (this.responseDesc!= null));
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
        final Status that = ((Status) object);
        {
            String lhsResponseCode;
            lhsResponseCode = this.getResponseCode();
            String rhsResponseCode;
            rhsResponseCode = that.getResponseCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseCode", lhsResponseCode), LocatorUtils.property(thatLocator, "responseCode", rhsResponseCode), lhsResponseCode, rhsResponseCode, (this.responseCode!= null), (that.responseCode!= null))) {
                return false;
            }
        }
        {
            String lhsResponseDesc;
            lhsResponseDesc = this.getResponseDesc();
            String rhsResponseDesc;
            rhsResponseDesc = that.getResponseDesc();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseDesc", lhsResponseDesc), LocatorUtils.property(thatLocator, "responseDesc", rhsResponseDesc), lhsResponseDesc, rhsResponseDesc, (this.responseDesc!= null), (that.responseDesc!= null))) {
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
            String theResponseCode;
            theResponseCode = this.getResponseCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseCode", theResponseCode), currentHashCode, theResponseCode, (this.responseCode!= null));
        }
        {
            String theResponseDesc;
            theResponseDesc = this.getResponseDesc();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseDesc", theResponseDesc), currentHashCode, theResponseDesc, (this.responseDesc!= null));
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
        if (draftCopy instanceof Status) {
            final Status copy = ((Status) draftCopy);
            {
                Boolean responseCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.responseCode!= null));
                if (responseCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceResponseCode;
                    sourceResponseCode = this.getResponseCode();
                    String copyResponseCode = ((String) strategy.copy(LocatorUtils.property(locator, "responseCode", sourceResponseCode), sourceResponseCode, (this.responseCode!= null)));
                    copy.setResponseCode(copyResponseCode);
                } else {
                    if (responseCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.responseCode = null;
                    }
                }
            }
            {
                Boolean responseDescShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.responseDesc!= null));
                if (responseDescShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceResponseDesc;
                    sourceResponseDesc = this.getResponseDesc();
                    String copyResponseDesc = ((String) strategy.copy(LocatorUtils.property(locator, "responseDesc", sourceResponseDesc), sourceResponseDesc, (this.responseDesc!= null)));
                    copy.setResponseDesc(copyResponseDesc);
                } else {
                    if (responseDescShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.responseDesc = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Status();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof Status) {
            final Status target = this;
            final Status leftObject = ((Status) left);
            final Status rightObject = ((Status) right);
            {
                Boolean responseCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.responseCode!= null), (rightObject.responseCode!= null));
                if (responseCodeShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsResponseCode;
                    lhsResponseCode = leftObject.getResponseCode();
                    String rhsResponseCode;
                    rhsResponseCode = rightObject.getResponseCode();
                    String mergedResponseCode = ((String) strategy.merge(LocatorUtils.property(leftLocator, "responseCode", lhsResponseCode), LocatorUtils.property(rightLocator, "responseCode", rhsResponseCode), lhsResponseCode, rhsResponseCode, (leftObject.responseCode!= null), (rightObject.responseCode!= null)));
                    target.setResponseCode(mergedResponseCode);
                } else {
                    if (responseCodeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.responseCode = null;
                    }
                }
            }
            {
                Boolean responseDescShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.responseDesc!= null), (rightObject.responseDesc!= null));
                if (responseDescShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsResponseDesc;
                    lhsResponseDesc = leftObject.getResponseDesc();
                    String rhsResponseDesc;
                    rhsResponseDesc = rightObject.getResponseDesc();
                    String mergedResponseDesc = ((String) strategy.merge(LocatorUtils.property(leftLocator, "responseDesc", lhsResponseDesc), LocatorUtils.property(rightLocator, "responseDesc", rhsResponseDesc), lhsResponseDesc, rhsResponseDesc, (leftObject.responseDesc!= null), (rightObject.responseDesc!= null)));
                    target.setResponseDesc(mergedResponseDesc);
                } else {
                    if (responseDescShouldBeMergedAndSet == Boolean.FALSE) {
                        target.responseDesc = null;
                    }
                }
            }
        }
    }

}
