
package com.paymentplaform.raya.gate.change;

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
 * <p>Java class for ChangeProfileResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeProfileResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Change_profile_Response" type="{http://raya.paymentplaform.com/gate/change}Change_profile_Response"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeProfileResponseType", namespace = "http://raya.paymentplaform.com/gate/change", propOrder = {
    "changeProfileResponse"
})
public class ChangeProfileResponseType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Change_profile_Response", required = true)
    protected ChangeProfileResponse changeProfileResponse;

    /**
     * Gets the value of the changeProfileResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeProfileResponse }
     *     
     */
    public ChangeProfileResponse getChangeProfileResponse() {
        return changeProfileResponse;
    }

    /**
     * Sets the value of the changeProfileResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeProfileResponse }
     *     
     */
    public void setChangeProfileResponse(ChangeProfileResponse value) {
        this.changeProfileResponse = value;
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
            ChangeProfileResponse theChangeProfileResponse;
            theChangeProfileResponse = this.getChangeProfileResponse();
            strategy.appendField(locator, this, "changeProfileResponse", buffer, theChangeProfileResponse, (this.changeProfileResponse!= null));
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
        final ChangeProfileResponseType that = ((ChangeProfileResponseType) object);
        {
            ChangeProfileResponse lhsChangeProfileResponse;
            lhsChangeProfileResponse = this.getChangeProfileResponse();
            ChangeProfileResponse rhsChangeProfileResponse;
            rhsChangeProfileResponse = that.getChangeProfileResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeProfileResponse", lhsChangeProfileResponse), LocatorUtils.property(thatLocator, "changeProfileResponse", rhsChangeProfileResponse), lhsChangeProfileResponse, rhsChangeProfileResponse, (this.changeProfileResponse!= null), (that.changeProfileResponse!= null))) {
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
            ChangeProfileResponse theChangeProfileResponse;
            theChangeProfileResponse = this.getChangeProfileResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeProfileResponse", theChangeProfileResponse), currentHashCode, theChangeProfileResponse, (this.changeProfileResponse!= null));
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
        if (draftCopy instanceof ChangeProfileResponseType) {
            final ChangeProfileResponseType copy = ((ChangeProfileResponseType) draftCopy);
            {
                Boolean changeProfileResponseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.changeProfileResponse!= null));
                if (changeProfileResponseShouldBeCopiedAndSet == Boolean.TRUE) {
                    ChangeProfileResponse sourceChangeProfileResponse;
                    sourceChangeProfileResponse = this.getChangeProfileResponse();
                    ChangeProfileResponse copyChangeProfileResponse = ((ChangeProfileResponse) strategy.copy(LocatorUtils.property(locator, "changeProfileResponse", sourceChangeProfileResponse), sourceChangeProfileResponse, (this.changeProfileResponse!= null)));
                    copy.setChangeProfileResponse(copyChangeProfileResponse);
                } else {
                    if (changeProfileResponseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.changeProfileResponse = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ChangeProfileResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ChangeProfileResponseType) {
            final ChangeProfileResponseType target = this;
            final ChangeProfileResponseType leftObject = ((ChangeProfileResponseType) left);
            final ChangeProfileResponseType rightObject = ((ChangeProfileResponseType) right);
            {
                Boolean changeProfileResponseShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.changeProfileResponse!= null), (rightObject.changeProfileResponse!= null));
                if (changeProfileResponseShouldBeMergedAndSet == Boolean.TRUE) {
                    ChangeProfileResponse lhsChangeProfileResponse;
                    lhsChangeProfileResponse = leftObject.getChangeProfileResponse();
                    ChangeProfileResponse rhsChangeProfileResponse;
                    rhsChangeProfileResponse = rightObject.getChangeProfileResponse();
                    ChangeProfileResponse mergedChangeProfileResponse = ((ChangeProfileResponse) strategy.merge(LocatorUtils.property(leftLocator, "changeProfileResponse", lhsChangeProfileResponse), LocatorUtils.property(rightLocator, "changeProfileResponse", rhsChangeProfileResponse), lhsChangeProfileResponse, rhsChangeProfileResponse, (leftObject.changeProfileResponse!= null), (rightObject.changeProfileResponse!= null)));
                    target.setChangeProfileResponse(mergedChangeProfileResponse);
                } else {
                    if (changeProfileResponseShouldBeMergedAndSet == Boolean.FALSE) {
                        target.changeProfileResponse = null;
                    }
                }
            }
        }
    }

}
