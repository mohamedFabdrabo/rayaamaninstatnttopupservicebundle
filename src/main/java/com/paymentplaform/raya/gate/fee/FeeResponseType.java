
package com.paymentplaform.raya.gate.fee;

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
 * <p>Java class for FeeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fee_Response" type="{http://raya.paymentplaform.com/gate/fee}Fee_Response"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeResponseType", namespace = "http://raya.paymentplaform.com/gate/fee", propOrder = {
    "feeResponse"
})
public class FeeResponseType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Fee_Response", required = true)
    protected FeeResponse feeResponse;

    /**
     * Gets the value of the feeResponse property.
     * 
     * @return
     *     possible object is
     *     {@link FeeResponse }
     *     
     */
    public FeeResponse getFeeResponse() {
        return feeResponse;
    }

    /**
     * Sets the value of the feeResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeResponse }
     *     
     */
    public void setFeeResponse(FeeResponse value) {
        this.feeResponse = value;
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
            FeeResponse theFeeResponse;
            theFeeResponse = this.getFeeResponse();
            strategy.appendField(locator, this, "feeResponse", buffer, theFeeResponse, (this.feeResponse!= null));
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
        final FeeResponseType that = ((FeeResponseType) object);
        {
            FeeResponse lhsFeeResponse;
            lhsFeeResponse = this.getFeeResponse();
            FeeResponse rhsFeeResponse;
            rhsFeeResponse = that.getFeeResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feeResponse", lhsFeeResponse), LocatorUtils.property(thatLocator, "feeResponse", rhsFeeResponse), lhsFeeResponse, rhsFeeResponse, (this.feeResponse!= null), (that.feeResponse!= null))) {
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
            FeeResponse theFeeResponse;
            theFeeResponse = this.getFeeResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feeResponse", theFeeResponse), currentHashCode, theFeeResponse, (this.feeResponse!= null));
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
        if (draftCopy instanceof FeeResponseType) {
            final FeeResponseType copy = ((FeeResponseType) draftCopy);
            {
                Boolean feeResponseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.feeResponse!= null));
                if (feeResponseShouldBeCopiedAndSet == Boolean.TRUE) {
                    FeeResponse sourceFeeResponse;
                    sourceFeeResponse = this.getFeeResponse();
                    FeeResponse copyFeeResponse = ((FeeResponse) strategy.copy(LocatorUtils.property(locator, "feeResponse", sourceFeeResponse), sourceFeeResponse, (this.feeResponse!= null)));
                    copy.setFeeResponse(copyFeeResponse);
                } else {
                    if (feeResponseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.feeResponse = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FeeResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof FeeResponseType) {
            final FeeResponseType target = this;
            final FeeResponseType leftObject = ((FeeResponseType) left);
            final FeeResponseType rightObject = ((FeeResponseType) right);
            {
                Boolean feeResponseShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.feeResponse!= null), (rightObject.feeResponse!= null));
                if (feeResponseShouldBeMergedAndSet == Boolean.TRUE) {
                    FeeResponse lhsFeeResponse;
                    lhsFeeResponse = leftObject.getFeeResponse();
                    FeeResponse rhsFeeResponse;
                    rhsFeeResponse = rightObject.getFeeResponse();
                    FeeResponse mergedFeeResponse = ((FeeResponse) strategy.merge(LocatorUtils.property(leftLocator, "feeResponse", lhsFeeResponse), LocatorUtils.property(rightLocator, "feeResponse", rhsFeeResponse), lhsFeeResponse, rhsFeeResponse, (leftObject.feeResponse!= null), (rightObject.feeResponse!= null)));
                    target.setFeeResponse(mergedFeeResponse);
                } else {
                    if (feeResponseShouldBeMergedAndSet == Boolean.FALSE) {
                        target.feeResponse = null;
                    }
                }
            }
        }
    }

}
