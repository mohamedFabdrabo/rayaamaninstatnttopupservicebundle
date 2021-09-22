
package com.paymentplaform.raya.gate.inq;

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
 * <p>Java class for BillsInquiryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillsInquiryRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bill_Inquiry_Request" type="{http://raya.paymentplaform.com/gate/inq}Bill_Inquiry_Request"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillsInquiryRequestType", namespace = "", propOrder = {
    "billInquiryRequest"
})
@XmlRootElement(name = "MessageBody", namespace = "")
public class MessageBody implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Bill_Inquiry_Request", required = true)
    protected BillInquiryRequest billInquiryRequest;

    /**
     * Gets the value of the billInquiryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BillInquiryRequest }
     *     
     */
    public BillInquiryRequest getBillInquiryRequest() {
        return billInquiryRequest;
    }

    /**
     * Sets the value of the billInquiryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillInquiryRequest }
     *     
     */
    public void setBillInquiryRequest(BillInquiryRequest value) {
        this.billInquiryRequest = value;
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
            BillInquiryRequest theBillInquiryRequest;
            theBillInquiryRequest = this.getBillInquiryRequest();
            strategy.appendField(locator, this, "billInquiryRequest", buffer, theBillInquiryRequest, (this.billInquiryRequest!= null));
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
            BillInquiryRequest lhsBillInquiryRequest;
            lhsBillInquiryRequest = this.getBillInquiryRequest();
            BillInquiryRequest rhsBillInquiryRequest;
            rhsBillInquiryRequest = that.getBillInquiryRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billInquiryRequest", lhsBillInquiryRequest), LocatorUtils.property(thatLocator, "billInquiryRequest", rhsBillInquiryRequest), lhsBillInquiryRequest, rhsBillInquiryRequest, (this.billInquiryRequest!= null), (that.billInquiryRequest!= null))) {
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
            BillInquiryRequest theBillInquiryRequest;
            theBillInquiryRequest = this.getBillInquiryRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billInquiryRequest", theBillInquiryRequest), currentHashCode, theBillInquiryRequest, (this.billInquiryRequest!= null));
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
                Boolean billInquiryRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billInquiryRequest!= null));
                if (billInquiryRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    BillInquiryRequest sourceBillInquiryRequest;
                    sourceBillInquiryRequest = this.getBillInquiryRequest();
                    BillInquiryRequest copyBillInquiryRequest = ((BillInquiryRequest) strategy.copy(LocatorUtils.property(locator, "billInquiryRequest", sourceBillInquiryRequest), sourceBillInquiryRequest, (this.billInquiryRequest!= null)));
                    copy.setBillInquiryRequest(copyBillInquiryRequest);
                } else {
                    if (billInquiryRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billInquiryRequest = null;
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
                Boolean billInquiryRequestShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.billInquiryRequest!= null), (rightObject.billInquiryRequest!= null));
                if (billInquiryRequestShouldBeMergedAndSet == Boolean.TRUE) {
                    BillInquiryRequest lhsBillInquiryRequest;
                    lhsBillInquiryRequest = leftObject.getBillInquiryRequest();
                    BillInquiryRequest rhsBillInquiryRequest;
                    rhsBillInquiryRequest = rightObject.getBillInquiryRequest();
                    BillInquiryRequest mergedBillInquiryRequest = ((BillInquiryRequest) strategy.merge(LocatorUtils.property(leftLocator, "billInquiryRequest", lhsBillInquiryRequest), LocatorUtils.property(rightLocator, "billInquiryRequest", rhsBillInquiryRequest), lhsBillInquiryRequest, rhsBillInquiryRequest, (leftObject.billInquiryRequest!= null), (rightObject.billInquiryRequest!= null)));
                    target.setBillInquiryRequest(mergedBillInquiryRequest);
                } else {
                    if (billInquiryRequestShouldBeMergedAndSet == Boolean.FALSE) {
                        target.billInquiryRequest = null;
                    }
                }
            }
        }
    }

}
