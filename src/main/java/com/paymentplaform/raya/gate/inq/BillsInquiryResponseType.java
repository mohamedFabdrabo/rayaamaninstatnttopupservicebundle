
package com.paymentplaform.raya.gate.inq;

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
 * <p>Java class for BillsInquiryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillsInquiryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Bill_Inquiry_Response" type="{http://raya.paymentplaform.com/gate/inq}Bill_Inquiry_Response"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillsInquiryResponseType", namespace = "http://raya.paymentplaform.com/gate/inq", propOrder = {
    "billInquiryResponse"
})
public class BillsInquiryResponseType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Bill_Inquiry_Response", required = true)
    protected BillInquiryResponse billInquiryResponse;

    /**
     * Gets the value of the billInquiryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link BillInquiryResponse }
     *     
     */
    public BillInquiryResponse getBillInquiryResponse() {
        return billInquiryResponse;
    }

    /**
     * Sets the value of the billInquiryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillInquiryResponse }
     *     
     */
    public void setBillInquiryResponse(BillInquiryResponse value) {
        this.billInquiryResponse = value;
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
            BillInquiryResponse theBillInquiryResponse;
            theBillInquiryResponse = this.getBillInquiryResponse();
            strategy.appendField(locator, this, "billInquiryResponse", buffer, theBillInquiryResponse, (this.billInquiryResponse!= null));
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
        final BillsInquiryResponseType that = ((BillsInquiryResponseType) object);
        {
            BillInquiryResponse lhsBillInquiryResponse;
            lhsBillInquiryResponse = this.getBillInquiryResponse();
            BillInquiryResponse rhsBillInquiryResponse;
            rhsBillInquiryResponse = that.getBillInquiryResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billInquiryResponse", lhsBillInquiryResponse), LocatorUtils.property(thatLocator, "billInquiryResponse", rhsBillInquiryResponse), lhsBillInquiryResponse, rhsBillInquiryResponse, (this.billInquiryResponse!= null), (that.billInquiryResponse!= null))) {
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
            BillInquiryResponse theBillInquiryResponse;
            theBillInquiryResponse = this.getBillInquiryResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billInquiryResponse", theBillInquiryResponse), currentHashCode, theBillInquiryResponse, (this.billInquiryResponse!= null));
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
        if (draftCopy instanceof BillsInquiryResponseType) {
            final BillsInquiryResponseType copy = ((BillsInquiryResponseType) draftCopy);
            {
                Boolean billInquiryResponseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billInquiryResponse!= null));
                if (billInquiryResponseShouldBeCopiedAndSet == Boolean.TRUE) {
                    BillInquiryResponse sourceBillInquiryResponse;
                    sourceBillInquiryResponse = this.getBillInquiryResponse();
                    BillInquiryResponse copyBillInquiryResponse = ((BillInquiryResponse) strategy.copy(LocatorUtils.property(locator, "billInquiryResponse", sourceBillInquiryResponse), sourceBillInquiryResponse, (this.billInquiryResponse!= null)));
                    copy.setBillInquiryResponse(copyBillInquiryResponse);
                } else {
                    if (billInquiryResponseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billInquiryResponse = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BillsInquiryResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof BillsInquiryResponseType) {
            final BillsInquiryResponseType target = this;
            final BillsInquiryResponseType leftObject = ((BillsInquiryResponseType) left);
            final BillsInquiryResponseType rightObject = ((BillsInquiryResponseType) right);
            {
                Boolean billInquiryResponseShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.billInquiryResponse!= null), (rightObject.billInquiryResponse!= null));
                if (billInquiryResponseShouldBeMergedAndSet == Boolean.TRUE) {
                    BillInquiryResponse lhsBillInquiryResponse;
                    lhsBillInquiryResponse = leftObject.getBillInquiryResponse();
                    BillInquiryResponse rhsBillInquiryResponse;
                    rhsBillInquiryResponse = rightObject.getBillInquiryResponse();
                    BillInquiryResponse mergedBillInquiryResponse = ((BillInquiryResponse) strategy.merge(LocatorUtils.property(leftLocator, "billInquiryResponse", lhsBillInquiryResponse), LocatorUtils.property(rightLocator, "billInquiryResponse", rhsBillInquiryResponse), lhsBillInquiryResponse, rhsBillInquiryResponse, (leftObject.billInquiryResponse!= null), (rightObject.billInquiryResponse!= null)));
                    target.setBillInquiryResponse(mergedBillInquiryResponse);
                } else {
                    if (billInquiryResponseShouldBeMergedAndSet == Boolean.FALSE) {
                        target.billInquiryResponse = null;
                    }
                }
            }
        }
    }

}
