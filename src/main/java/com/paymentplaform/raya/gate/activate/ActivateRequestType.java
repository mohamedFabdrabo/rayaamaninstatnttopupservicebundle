
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
 * <p>Java class for ActivateRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivateRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Activate_Request" type="{http://raya.paymentplaform.com/gate/activate}Activate_Request"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivateRequestType", namespace = "http://raya.paymentplaform.com/gate/activate", propOrder = {
    "activateRequest"
})
public class ActivateRequestType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Activate_Request", required = true)
    protected ActivateRequest activateRequest;

    /**
     * Gets the value of the activateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ActivateRequest }
     *     
     */
    public ActivateRequest getActivateRequest() {
        return activateRequest;
    }

    /**
     * Sets the value of the activateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivateRequest }
     *     
     */
    public void setActivateRequest(ActivateRequest value) {
        this.activateRequest = value;
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
            ActivateRequest theActivateRequest;
            theActivateRequest = this.getActivateRequest();
            strategy.appendField(locator, this, "activateRequest", buffer, theActivateRequest, (this.activateRequest!= null));
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
        final ActivateRequestType that = ((ActivateRequestType) object);
        {
            ActivateRequest lhsActivateRequest;
            lhsActivateRequest = this.getActivateRequest();
            ActivateRequest rhsActivateRequest;
            rhsActivateRequest = that.getActivateRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "activateRequest", lhsActivateRequest), LocatorUtils.property(thatLocator, "activateRequest", rhsActivateRequest), lhsActivateRequest, rhsActivateRequest, (this.activateRequest!= null), (that.activateRequest!= null))) {
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
            ActivateRequest theActivateRequest;
            theActivateRequest = this.getActivateRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "activateRequest", theActivateRequest), currentHashCode, theActivateRequest, (this.activateRequest!= null));
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
        if (draftCopy instanceof ActivateRequestType) {
            final ActivateRequestType copy = ((ActivateRequestType) draftCopy);
            {
                Boolean activateRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.activateRequest!= null));
                if (activateRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    ActivateRequest sourceActivateRequest;
                    sourceActivateRequest = this.getActivateRequest();
                    ActivateRequest copyActivateRequest = ((ActivateRequest) strategy.copy(LocatorUtils.property(locator, "activateRequest", sourceActivateRequest), sourceActivateRequest, (this.activateRequest!= null)));
                    copy.setActivateRequest(copyActivateRequest);
                } else {
                    if (activateRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.activateRequest = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ActivateRequestType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ActivateRequestType) {
            final ActivateRequestType target = this;
            final ActivateRequestType leftObject = ((ActivateRequestType) left);
            final ActivateRequestType rightObject = ((ActivateRequestType) right);
            {
                Boolean activateRequestShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.activateRequest!= null), (rightObject.activateRequest!= null));
                if (activateRequestShouldBeMergedAndSet == Boolean.TRUE) {
                    ActivateRequest lhsActivateRequest;
                    lhsActivateRequest = leftObject.getActivateRequest();
                    ActivateRequest rhsActivateRequest;
                    rhsActivateRequest = rightObject.getActivateRequest();
                    ActivateRequest mergedActivateRequest = ((ActivateRequest) strategy.merge(LocatorUtils.property(leftLocator, "activateRequest", lhsActivateRequest), LocatorUtils.property(rightLocator, "activateRequest", rhsActivateRequest), lhsActivateRequest, rhsActivateRequest, (leftObject.activateRequest!= null), (rightObject.activateRequest!= null)));
                    target.setActivateRequest(mergedActivateRequest);
                } else {
                    if (activateRequestShouldBeMergedAndSet == Boolean.FALSE) {
                        target.activateRequest = null;
                    }
                }
            }
        }
    }

}
