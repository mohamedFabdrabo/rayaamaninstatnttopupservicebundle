
package com.paymentplaform.raya.gate.balance;

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
 * <p>Java class for InquiryBalanceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InquiryBalanceRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Inquiry_Balance_Request" type="{http://raya.paymentplaform.com/gate/balance}Inquiry_Balance_Request"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InquiryBalanceRequestType", namespace = "", propOrder = {
    "inquiryBalanceRequest"
})
@XmlRootElement(name = "MessageBody", namespace = "")
public class MessageBody implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Inquiry_Balance_Request", required = true)
    protected InquiryBalanceRequest inquiryBalanceRequest;

    /**
     * Gets the value of the inquiryBalanceRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryBalanceRequest }
     *     
     */
    public InquiryBalanceRequest getInquiryBalanceRequest() {
        return inquiryBalanceRequest;
    }

    /**
     * Sets the value of the inquiryBalanceRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryBalanceRequest }
     *     
     */
    public void setInquiryBalanceRequest(InquiryBalanceRequest value) {
        this.inquiryBalanceRequest = value;
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
            InquiryBalanceRequest theInquiryBalanceRequest;
            theInquiryBalanceRequest = this.getInquiryBalanceRequest();
            strategy.appendField(locator, this, "inquiryBalanceRequest", buffer, theInquiryBalanceRequest, (this.inquiryBalanceRequest!= null));
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
            InquiryBalanceRequest lhsInquiryBalanceRequest;
            lhsInquiryBalanceRequest = this.getInquiryBalanceRequest();
            InquiryBalanceRequest rhsInquiryBalanceRequest;
            rhsInquiryBalanceRequest = that.getInquiryBalanceRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inquiryBalanceRequest", lhsInquiryBalanceRequest), LocatorUtils.property(thatLocator, "inquiryBalanceRequest", rhsInquiryBalanceRequest), lhsInquiryBalanceRequest, rhsInquiryBalanceRequest, (this.inquiryBalanceRequest!= null), (that.inquiryBalanceRequest!= null))) {
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
            InquiryBalanceRequest theInquiryBalanceRequest;
            theInquiryBalanceRequest = this.getInquiryBalanceRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inquiryBalanceRequest", theInquiryBalanceRequest), currentHashCode, theInquiryBalanceRequest, (this.inquiryBalanceRequest!= null));
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
                Boolean inquiryBalanceRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.inquiryBalanceRequest!= null));
                if (inquiryBalanceRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    InquiryBalanceRequest sourceInquiryBalanceRequest;
                    sourceInquiryBalanceRequest = this.getInquiryBalanceRequest();
                    InquiryBalanceRequest copyInquiryBalanceRequest = ((InquiryBalanceRequest) strategy.copy(LocatorUtils.property(locator, "inquiryBalanceRequest", sourceInquiryBalanceRequest), sourceInquiryBalanceRequest, (this.inquiryBalanceRequest!= null)));
                    copy.setInquiryBalanceRequest(copyInquiryBalanceRequest);
                } else {
                    if (inquiryBalanceRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.inquiryBalanceRequest = null;
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
                Boolean inquiryBalanceRequestShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.inquiryBalanceRequest!= null), (rightObject.inquiryBalanceRequest!= null));
                if (inquiryBalanceRequestShouldBeMergedAndSet == Boolean.TRUE) {
                    InquiryBalanceRequest lhsInquiryBalanceRequest;
                    lhsInquiryBalanceRequest = leftObject.getInquiryBalanceRequest();
                    InquiryBalanceRequest rhsInquiryBalanceRequest;
                    rhsInquiryBalanceRequest = rightObject.getInquiryBalanceRequest();
                    InquiryBalanceRequest mergedInquiryBalanceRequest = ((InquiryBalanceRequest) strategy.merge(LocatorUtils.property(leftLocator, "inquiryBalanceRequest", lhsInquiryBalanceRequest), LocatorUtils.property(rightLocator, "inquiryBalanceRequest", rhsInquiryBalanceRequest), lhsInquiryBalanceRequest, rhsInquiryBalanceRequest, (leftObject.inquiryBalanceRequest!= null), (rightObject.inquiryBalanceRequest!= null)));
                    target.setInquiryBalanceRequest(mergedInquiryBalanceRequest);
                } else {
                    if (inquiryBalanceRequestShouldBeMergedAndSet == Boolean.FALSE) {
                        target.inquiryBalanceRequest = null;
                    }
                }
            }
        }
    }

}
