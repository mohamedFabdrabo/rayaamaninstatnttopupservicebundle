
package com.paymentplaform.raya.gate.rev;

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
 * <p>Java class for ReversePaymentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReversePaymentResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Reverse_Payment_Response" type="{http://raya.paymentplaform.com/gate/rev}Reverse_Payment_Response"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReversePaymentResponseType", namespace = "http://raya.paymentplaform.com/gate/rev", propOrder = {
    "reversePaymentResponse"
})
public class ReversePaymentResponseType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Reverse_Payment_Response", required = true)
    protected ReversePaymentResponse reversePaymentResponse;

    /**
     * Gets the value of the reversePaymentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ReversePaymentResponse }
     *     
     */
    public ReversePaymentResponse getReversePaymentResponse() {
        return reversePaymentResponse;
    }

    /**
     * Sets the value of the reversePaymentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversePaymentResponse }
     *     
     */
    public void setReversePaymentResponse(ReversePaymentResponse value) {
        this.reversePaymentResponse = value;
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
            ReversePaymentResponse theReversePaymentResponse;
            theReversePaymentResponse = this.getReversePaymentResponse();
            strategy.appendField(locator, this, "reversePaymentResponse", buffer, theReversePaymentResponse, (this.reversePaymentResponse!= null));
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
        final ReversePaymentResponseType that = ((ReversePaymentResponseType) object);
        {
            ReversePaymentResponse lhsReversePaymentResponse;
            lhsReversePaymentResponse = this.getReversePaymentResponse();
            ReversePaymentResponse rhsReversePaymentResponse;
            rhsReversePaymentResponse = that.getReversePaymentResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reversePaymentResponse", lhsReversePaymentResponse), LocatorUtils.property(thatLocator, "reversePaymentResponse", rhsReversePaymentResponse), lhsReversePaymentResponse, rhsReversePaymentResponse, (this.reversePaymentResponse!= null), (that.reversePaymentResponse!= null))) {
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
            ReversePaymentResponse theReversePaymentResponse;
            theReversePaymentResponse = this.getReversePaymentResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reversePaymentResponse", theReversePaymentResponse), currentHashCode, theReversePaymentResponse, (this.reversePaymentResponse!= null));
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
        if (draftCopy instanceof ReversePaymentResponseType) {
            final ReversePaymentResponseType copy = ((ReversePaymentResponseType) draftCopy);
            {
                Boolean reversePaymentResponseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.reversePaymentResponse!= null));
                if (reversePaymentResponseShouldBeCopiedAndSet == Boolean.TRUE) {
                    ReversePaymentResponse sourceReversePaymentResponse;
                    sourceReversePaymentResponse = this.getReversePaymentResponse();
                    ReversePaymentResponse copyReversePaymentResponse = ((ReversePaymentResponse) strategy.copy(LocatorUtils.property(locator, "reversePaymentResponse", sourceReversePaymentResponse), sourceReversePaymentResponse, (this.reversePaymentResponse!= null)));
                    copy.setReversePaymentResponse(copyReversePaymentResponse);
                } else {
                    if (reversePaymentResponseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.reversePaymentResponse = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ReversePaymentResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ReversePaymentResponseType) {
            final ReversePaymentResponseType target = this;
            final ReversePaymentResponseType leftObject = ((ReversePaymentResponseType) left);
            final ReversePaymentResponseType rightObject = ((ReversePaymentResponseType) right);
            {
                Boolean reversePaymentResponseShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.reversePaymentResponse!= null), (rightObject.reversePaymentResponse!= null));
                if (reversePaymentResponseShouldBeMergedAndSet == Boolean.TRUE) {
                    ReversePaymentResponse lhsReversePaymentResponse;
                    lhsReversePaymentResponse = leftObject.getReversePaymentResponse();
                    ReversePaymentResponse rhsReversePaymentResponse;
                    rhsReversePaymentResponse = rightObject.getReversePaymentResponse();
                    ReversePaymentResponse mergedReversePaymentResponse = ((ReversePaymentResponse) strategy.merge(LocatorUtils.property(leftLocator, "reversePaymentResponse", lhsReversePaymentResponse), LocatorUtils.property(rightLocator, "reversePaymentResponse", rhsReversePaymentResponse), lhsReversePaymentResponse, rhsReversePaymentResponse, (leftObject.reversePaymentResponse!= null), (rightObject.reversePaymentResponse!= null)));
                    target.setReversePaymentResponse(mergedReversePaymentResponse);
                } else {
                    if (reversePaymentResponseShouldBeMergedAndSet == Boolean.FALSE) {
                        target.reversePaymentResponse = null;
                    }
                }
            }
        }
    }

}
