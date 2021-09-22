
package com.paymentplaform.raya.gate.rev;

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
 * <p>Java class for ReversePaymentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReversePaymentRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Reverse_Payment_Request" type="{http://raya.paymentplaform.com/gate/rev}Reverse_Payment_Request"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversePaymentRequestType", namespace = "", propOrder = {
    "reversePaymentRequest"
})
@XmlRootElement(name = "MessageBody", namespace = "")
public class MessageBody implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Reverse_Payment_Request", required = true)
    protected ReversePaymentRequest reversePaymentRequest;

    /**
     * Gets the value of the reversePaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ReversePaymentRequest }
     *     
     */
    public ReversePaymentRequest getReversePaymentRequest() {
        return reversePaymentRequest;
    }

    /**
     * Sets the value of the reversePaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversePaymentRequest }
     *     
     */
    public void setReversePaymentRequest(ReversePaymentRequest value) {
        this.reversePaymentRequest = value;
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
            ReversePaymentRequest theReversePaymentRequest;
            theReversePaymentRequest = this.getReversePaymentRequest();
            strategy.appendField(locator, this, "reversePaymentRequest", buffer, theReversePaymentRequest, (this.reversePaymentRequest!= null));
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
            ReversePaymentRequest lhsReversePaymentRequest;
            lhsReversePaymentRequest = this.getReversePaymentRequest();
            ReversePaymentRequest rhsReversePaymentRequest;
            rhsReversePaymentRequest = that.getReversePaymentRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reversePaymentRequest", lhsReversePaymentRequest), LocatorUtils.property(thatLocator, "reversePaymentRequest", rhsReversePaymentRequest), lhsReversePaymentRequest, rhsReversePaymentRequest, (this.reversePaymentRequest!= null), (that.reversePaymentRequest!= null))) {
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
            ReversePaymentRequest theReversePaymentRequest;
            theReversePaymentRequest = this.getReversePaymentRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reversePaymentRequest", theReversePaymentRequest), currentHashCode, theReversePaymentRequest, (this.reversePaymentRequest!= null));
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
                Boolean reversePaymentRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.reversePaymentRequest!= null));
                if (reversePaymentRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReversePaymentRequest sourceReversePaymentRequest;
                    sourceReversePaymentRequest = this.getReversePaymentRequest();
                    ReversePaymentRequest copyReversePaymentRequest = ((ReversePaymentRequest) strategy.copy(LocatorUtils.property(locator, "reversePaymentRequest", sourceReversePaymentRequest), sourceReversePaymentRequest, (this.reversePaymentRequest!= null)));
                    copy.setReversePaymentRequest(copyReversePaymentRequest);
                } else {
                    if (reversePaymentRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.reversePaymentRequest = null;
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
                Boolean reversePaymentRequestShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.reversePaymentRequest!= null), (rightObject.reversePaymentRequest!= null));
                if (reversePaymentRequestShouldBeMergedAndSet == Boolean.TRUE) {
                    ReversePaymentRequest lhsReversePaymentRequest;
                    lhsReversePaymentRequest = leftObject.getReversePaymentRequest();
                    ReversePaymentRequest rhsReversePaymentRequest;
                    rhsReversePaymentRequest = rightObject.getReversePaymentRequest();
                    ReversePaymentRequest mergedReversePaymentRequest = ((ReversePaymentRequest) strategy.merge(LocatorUtils.property(leftLocator, "reversePaymentRequest", lhsReversePaymentRequest), LocatorUtils.property(rightLocator, "reversePaymentRequest", rhsReversePaymentRequest), lhsReversePaymentRequest, rhsReversePaymentRequest, (leftObject.reversePaymentRequest!= null), (rightObject.reversePaymentRequest!= null)));
                    target.setReversePaymentRequest(mergedReversePaymentRequest);
                } else {
                    if (reversePaymentRequestShouldBeMergedAndSet == Boolean.FALSE) {
                        target.reversePaymentRequest = null;
                    }
                }
            }
        }
    }

}
