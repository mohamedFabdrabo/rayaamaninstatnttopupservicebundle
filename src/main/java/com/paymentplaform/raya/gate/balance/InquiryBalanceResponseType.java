
package com.paymentplaform.raya.gate.balance;

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
 * <p>Java class for InquiryBalanceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryBalanceResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Inquiry_Balance_Response" type="{http://raya.paymentplaform.com/gate/balance}Inquiry_Balance_Response"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryBalanceResponseType", namespace = "http://raya.paymentplaform.com/gate/balance", propOrder = {
    "inquiryBalanceResponse"
})
public class InquiryBalanceResponseType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Inquiry_Balance_Response", required = true)
    protected InquiryBalanceResponse inquiryBalanceResponse;

    /**
     * Gets the value of the inquiryBalanceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryBalanceResponse }
     *     
     */
    public InquiryBalanceResponse getInquiryBalanceResponse() {
        return inquiryBalanceResponse;
    }

    /**
     * Sets the value of the inquiryBalanceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryBalanceResponse }
     *     
     */
    public void setInquiryBalanceResponse(InquiryBalanceResponse value) {
        this.inquiryBalanceResponse = value;
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
            InquiryBalanceResponse theInquiryBalanceResponse;
            theInquiryBalanceResponse = this.getInquiryBalanceResponse();
            strategy.appendField(locator, this, "inquiryBalanceResponse", buffer, theInquiryBalanceResponse, (this.inquiryBalanceResponse!= null));
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
        final InquiryBalanceResponseType that = ((InquiryBalanceResponseType) object);
        {
            InquiryBalanceResponse lhsInquiryBalanceResponse;
            lhsInquiryBalanceResponse = this.getInquiryBalanceResponse();
            InquiryBalanceResponse rhsInquiryBalanceResponse;
            rhsInquiryBalanceResponse = that.getInquiryBalanceResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inquiryBalanceResponse", lhsInquiryBalanceResponse), LocatorUtils.property(thatLocator, "inquiryBalanceResponse", rhsInquiryBalanceResponse), lhsInquiryBalanceResponse, rhsInquiryBalanceResponse, (this.inquiryBalanceResponse!= null), (that.inquiryBalanceResponse!= null))) {
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
            InquiryBalanceResponse theInquiryBalanceResponse;
            theInquiryBalanceResponse = this.getInquiryBalanceResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inquiryBalanceResponse", theInquiryBalanceResponse), currentHashCode, theInquiryBalanceResponse, (this.inquiryBalanceResponse!= null));
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
        if (draftCopy instanceof InquiryBalanceResponseType) {
            final InquiryBalanceResponseType copy = ((InquiryBalanceResponseType) draftCopy);
            {
                Boolean inquiryBalanceResponseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.inquiryBalanceResponse!= null));
                if (inquiryBalanceResponseShouldBeCopiedAndSet == Boolean.TRUE) {
                    InquiryBalanceResponse sourceInquiryBalanceResponse;
                    sourceInquiryBalanceResponse = this.getInquiryBalanceResponse();
                    InquiryBalanceResponse copyInquiryBalanceResponse = ((InquiryBalanceResponse) strategy.copy(LocatorUtils.property(locator, "inquiryBalanceResponse", sourceInquiryBalanceResponse), sourceInquiryBalanceResponse, (this.inquiryBalanceResponse!= null)));
                    copy.setInquiryBalanceResponse(copyInquiryBalanceResponse);
                } else {
                    if (inquiryBalanceResponseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.inquiryBalanceResponse = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new InquiryBalanceResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof InquiryBalanceResponseType) {
            final InquiryBalanceResponseType target = this;
            final InquiryBalanceResponseType leftObject = ((InquiryBalanceResponseType) left);
            final InquiryBalanceResponseType rightObject = ((InquiryBalanceResponseType) right);
            {
                Boolean inquiryBalanceResponseShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.inquiryBalanceResponse!= null), (rightObject.inquiryBalanceResponse!= null));
                if (inquiryBalanceResponseShouldBeMergedAndSet == Boolean.TRUE) {
                    InquiryBalanceResponse lhsInquiryBalanceResponse;
                    lhsInquiryBalanceResponse = leftObject.getInquiryBalanceResponse();
                    InquiryBalanceResponse rhsInquiryBalanceResponse;
                    rhsInquiryBalanceResponse = rightObject.getInquiryBalanceResponse();
                    InquiryBalanceResponse mergedInquiryBalanceResponse = ((InquiryBalanceResponse) strategy.merge(LocatorUtils.property(leftLocator, "inquiryBalanceResponse", lhsInquiryBalanceResponse), LocatorUtils.property(rightLocator, "inquiryBalanceResponse", rhsInquiryBalanceResponse), lhsInquiryBalanceResponse, rhsInquiryBalanceResponse, (leftObject.inquiryBalanceResponse!= null), (rightObject.inquiryBalanceResponse!= null)));
                    target.setInquiryBalanceResponse(mergedInquiryBalanceResponse);
                } else {
                    if (inquiryBalanceResponseShouldBeMergedAndSet == Boolean.FALSE) {
                        target.inquiryBalanceResponse = null;
                    }
                }
            }
        }
    }

}
