
package com.paymentplaform.raya.gate.fee;

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
 * <p>Java class for FeeRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fee_Request" type="{http://raya.paymentplaform.com/gate/fee}Fee_Request"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeRequestType", namespace = "", propOrder = {
    "feeRequest"
})
@XmlRootElement(name = "MessageBody", namespace = "")
public class MessageBody implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Fee_Request", required = true)
    protected FeeRequest feeRequest;

    /**
     * Gets the value of the feeRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FeeRequest }
     *     
     */
    public FeeRequest getFeeRequest() {
        return feeRequest;
    }

    /**
     * Sets the value of the feeRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeRequest }
     *     
     */
    public void setFeeRequest(FeeRequest value) {
        this.feeRequest = value;
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
            FeeRequest theFeeRequest;
            theFeeRequest = this.getFeeRequest();
            strategy.appendField(locator, this, "feeRequest", buffer, theFeeRequest, (this.feeRequest!= null));
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
            FeeRequest lhsFeeRequest;
            lhsFeeRequest = this.getFeeRequest();
            FeeRequest rhsFeeRequest;
            rhsFeeRequest = that.getFeeRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feeRequest", lhsFeeRequest), LocatorUtils.property(thatLocator, "feeRequest", rhsFeeRequest), lhsFeeRequest, rhsFeeRequest, (this.feeRequest!= null), (that.feeRequest!= null))) {
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
            FeeRequest theFeeRequest;
            theFeeRequest = this.getFeeRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feeRequest", theFeeRequest), currentHashCode, theFeeRequest, (this.feeRequest!= null));
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
                Boolean feeRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.feeRequest!= null));
                if (feeRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeeRequest sourceFeeRequest;
                    sourceFeeRequest = this.getFeeRequest();
                    FeeRequest copyFeeRequest = ((FeeRequest) strategy.copy(LocatorUtils.property(locator, "feeRequest", sourceFeeRequest), sourceFeeRequest, (this.feeRequest!= null)));
                    copy.setFeeRequest(copyFeeRequest);
                } else {
                    if (feeRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.feeRequest = null;
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
                Boolean feeRequestShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.feeRequest!= null), (rightObject.feeRequest!= null));
                if (feeRequestShouldBeMergedAndSet == Boolean.TRUE) {
                    FeeRequest lhsFeeRequest;
                    lhsFeeRequest = leftObject.getFeeRequest();
                    FeeRequest rhsFeeRequest;
                    rhsFeeRequest = rightObject.getFeeRequest();
                    FeeRequest mergedFeeRequest = ((FeeRequest) strategy.merge(LocatorUtils.property(leftLocator, "feeRequest", lhsFeeRequest), LocatorUtils.property(rightLocator, "feeRequest", rhsFeeRequest), lhsFeeRequest, rhsFeeRequest, (leftObject.feeRequest!= null), (rightObject.feeRequest!= null)));
                    target.setFeeRequest(mergedFeeRequest);
                } else {
                    if (feeRequestShouldBeMergedAndSet == Boolean.FALSE) {
                        target.feeRequest = null;
                    }
                }
            }
        }
    }

}
