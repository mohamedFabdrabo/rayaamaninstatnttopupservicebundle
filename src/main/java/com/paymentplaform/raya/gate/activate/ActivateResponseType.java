
package com.paymentplaform.raya.gate.activate;

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
 * <p>Java class for ActivateResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivateResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Activate_Response" type="{http://raya.paymentplaform.com/gate/activate}Activate_Response"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivateResponseType", namespace = "http://raya.paymentplaform.com/gate/activate", propOrder = {
    "activateResponse"
})
public class ActivateResponseType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Activate_Response", required = true)
    protected ActivateResponse activateResponse;

    /**
     * Gets the value of the activateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ActivateResponse }
     *     
     */
    public ActivateResponse getActivateResponse() {
        return activateResponse;
    }

    /**
     * Sets the value of the activateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivateResponse }
     *     
     */
    public void setActivateResponse(ActivateResponse value) {
        this.activateResponse = value;
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
            ActivateResponse theActivateResponse;
            theActivateResponse = this.getActivateResponse();
            strategy.appendField(locator, this, "activateResponse", buffer, theActivateResponse, (this.activateResponse!= null));
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
        final ActivateResponseType that = ((ActivateResponseType) object);
        {
            ActivateResponse lhsActivateResponse;
            lhsActivateResponse = this.getActivateResponse();
            ActivateResponse rhsActivateResponse;
            rhsActivateResponse = that.getActivateResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activateResponse", lhsActivateResponse), LocatorUtils.property(thatLocator, "activateResponse", rhsActivateResponse), lhsActivateResponse, rhsActivateResponse, (this.activateResponse!= null), (that.activateResponse!= null))) {
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
            ActivateResponse theActivateResponse;
            theActivateResponse = this.getActivateResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activateResponse", theActivateResponse), currentHashCode, theActivateResponse, (this.activateResponse!= null));
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
        if (draftCopy instanceof ActivateResponseType) {
            final ActivateResponseType copy = ((ActivateResponseType) draftCopy);
            {
                Boolean activateResponseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activateResponse!= null));
                if (activateResponseShouldBeCopiedAndSet == Boolean.TRUE) {
                    ActivateResponse sourceActivateResponse;
                    sourceActivateResponse = this.getActivateResponse();
                    ActivateResponse copyActivateResponse = ((ActivateResponse) strategy.copy(LocatorUtils.property(locator, "activateResponse", sourceActivateResponse), sourceActivateResponse, (this.activateResponse!= null)));
                    copy.setActivateResponse(copyActivateResponse);
                } else {
                    if (activateResponseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activateResponse = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ActivateResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ActivateResponseType) {
            final ActivateResponseType target = this;
            final ActivateResponseType leftObject = ((ActivateResponseType) left);
            final ActivateResponseType rightObject = ((ActivateResponseType) right);
            {
                Boolean activateResponseShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.activateResponse!= null), (rightObject.activateResponse!= null));
                if (activateResponseShouldBeMergedAndSet == Boolean.TRUE) {
                    ActivateResponse lhsActivateResponse;
                    lhsActivateResponse = leftObject.getActivateResponse();
                    ActivateResponse rhsActivateResponse;
                    rhsActivateResponse = rightObject.getActivateResponse();
                    ActivateResponse mergedActivateResponse = ((ActivateResponse) strategy.merge(LocatorUtils.property(leftLocator, "activateResponse", lhsActivateResponse), LocatorUtils.property(rightLocator, "activateResponse", rhsActivateResponse), lhsActivateResponse, rhsActivateResponse, (leftObject.activateResponse!= null), (rightObject.activateResponse!= null)));
                    target.setActivateResponse(mergedActivateResponse);
                } else {
                    if (activateResponseShouldBeMergedAndSet == Boolean.FALSE) {
                        target.activateResponse = null;
                    }
                }
            }
        }
    }

}
