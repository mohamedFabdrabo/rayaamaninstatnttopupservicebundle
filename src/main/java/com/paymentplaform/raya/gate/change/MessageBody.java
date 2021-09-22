
package com.paymentplaform.raya.gate.change;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for ChangeProfileRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeProfileRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Change_profile_Request" type="{http://raya.paymentplaform.com/gate/change}Change_profile_Request"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeProfileRequestType", namespace = "", propOrder = {
    "changeProfileRequest"
})
@XmlRootElement(name = "MessageBody", namespace = "")
public class MessageBody implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Change_profile_Request", required = true)
    protected ChangeProfileRequest changeProfileRequest;

    /**
     * Gets the value of the changeProfileRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeProfileRequest }
     *     
     */
    public ChangeProfileRequest getChangeProfileRequest() {
        return changeProfileRequest;
    }

    /**
     * Sets the value of the changeProfileRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeProfileRequest }
     *     
     */
    public void setChangeProfileRequest(ChangeProfileRequest value) {
        this.changeProfileRequest = value;
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
            ChangeProfileRequest theChangeProfileRequest;
            theChangeProfileRequest = this.getChangeProfileRequest();
            strategy.appendField(locator, this, "changeProfileRequest", buffer, theChangeProfileRequest, (this.changeProfileRequest!= null));
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
        final MessageBody that = ((MessageBody) object);
        {
            ChangeProfileRequest lhsChangeProfileRequest;
            lhsChangeProfileRequest = this.getChangeProfileRequest();
            ChangeProfileRequest rhsChangeProfileRequest;
            rhsChangeProfileRequest = that.getChangeProfileRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeProfileRequest", lhsChangeProfileRequest), LocatorUtils.property(thatLocator, "changeProfileRequest", rhsChangeProfileRequest), lhsChangeProfileRequest, rhsChangeProfileRequest, (this.changeProfileRequest!= null), (that.changeProfileRequest!= null))) {
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
            ChangeProfileRequest theChangeProfileRequest;
            theChangeProfileRequest = this.getChangeProfileRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeProfileRequest", theChangeProfileRequest), currentHashCode, theChangeProfileRequest, (this.changeProfileRequest!= null));
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
        if (draftCopy instanceof MessageBody) {
            final MessageBody copy = ((MessageBody) draftCopy);
            {
                Boolean changeProfileRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.changeProfileRequest!= null));
                if (changeProfileRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    ChangeProfileRequest sourceChangeProfileRequest;
                    sourceChangeProfileRequest = this.getChangeProfileRequest();
                    ChangeProfileRequest copyChangeProfileRequest = ((ChangeProfileRequest) strategy.copy(LocatorUtils.property(locator, "changeProfileRequest", sourceChangeProfileRequest), sourceChangeProfileRequest, (this.changeProfileRequest!= null)));
                    copy.setChangeProfileRequest(copyChangeProfileRequest);
                } else {
                    if (changeProfileRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.changeProfileRequest = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MessageBody();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof MessageBody) {
            final MessageBody target = this;
            final MessageBody leftObject = ((MessageBody) left);
            final MessageBody rightObject = ((MessageBody) right);
            {
                Boolean changeProfileRequestShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.changeProfileRequest!= null), (rightObject.changeProfileRequest!= null));
                if (changeProfileRequestShouldBeMergedAndSet == Boolean.TRUE) {
                    ChangeProfileRequest lhsChangeProfileRequest;
                    lhsChangeProfileRequest = leftObject.getChangeProfileRequest();
                    ChangeProfileRequest rhsChangeProfileRequest;
                    rhsChangeProfileRequest = rightObject.getChangeProfileRequest();
                    ChangeProfileRequest mergedChangeProfileRequest = ((ChangeProfileRequest) strategy.merge(LocatorUtils.property(leftLocator, "changeProfileRequest", lhsChangeProfileRequest), LocatorUtils.property(rightLocator, "changeProfileRequest", rhsChangeProfileRequest), lhsChangeProfileRequest, rhsChangeProfileRequest, (leftObject.changeProfileRequest!= null), (rightObject.changeProfileRequest!= null)));
                    target.setChangeProfileRequest(mergedChangeProfileRequest);
                } else {
                    if (changeProfileRequestShouldBeMergedAndSet == Boolean.FALSE) {
                        target.changeProfileRequest = null;
                    }
                }
            }
        }
    }

}
