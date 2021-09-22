
package com.paymentplaform.raya.gate.distack;

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
 * <p>Java class for ConfirmVoucherPrintRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmVoucherPrintRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Confirm_Voucher_Print_Request" type="{http://raya.paymentplaform.com/gate/distack}Confirm_Voucher_Print_Request"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmVoucherPrintRequestType", namespace = "", propOrder = {
    "confirmVoucherPrintRequest"
})
@XmlRootElement(name = "MessageBody", namespace = "")
public class MessageBody implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Confirm_Voucher_Print_Request", required = true)
    protected ConfirmVoucherPrintRequest confirmVoucherPrintRequest;

    /**
     * Gets the value of the confirmVoucherPrintRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmVoucherPrintRequest }
     *     
     */
    public ConfirmVoucherPrintRequest getConfirmVoucherPrintRequest() {
        return confirmVoucherPrintRequest;
    }

    /**
     * Sets the value of the confirmVoucherPrintRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmVoucherPrintRequest }
     *     
     */
    public void setConfirmVoucherPrintRequest(ConfirmVoucherPrintRequest value) {
        this.confirmVoucherPrintRequest = value;
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
            ConfirmVoucherPrintRequest theConfirmVoucherPrintRequest;
            theConfirmVoucherPrintRequest = this.getConfirmVoucherPrintRequest();
            strategy.appendField(locator, this, "confirmVoucherPrintRequest", buffer, theConfirmVoucherPrintRequest, (this.confirmVoucherPrintRequest!= null));
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
            ConfirmVoucherPrintRequest lhsConfirmVoucherPrintRequest;
            lhsConfirmVoucherPrintRequest = this.getConfirmVoucherPrintRequest();
            ConfirmVoucherPrintRequest rhsConfirmVoucherPrintRequest;
            rhsConfirmVoucherPrintRequest = that.getConfirmVoucherPrintRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confirmVoucherPrintRequest", lhsConfirmVoucherPrintRequest), LocatorUtils.property(thatLocator, "confirmVoucherPrintRequest", rhsConfirmVoucherPrintRequest), lhsConfirmVoucherPrintRequest, rhsConfirmVoucherPrintRequest, (this.confirmVoucherPrintRequest!= null), (that.confirmVoucherPrintRequest!= null))) {
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
            ConfirmVoucherPrintRequest theConfirmVoucherPrintRequest;
            theConfirmVoucherPrintRequest = this.getConfirmVoucherPrintRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confirmVoucherPrintRequest", theConfirmVoucherPrintRequest), currentHashCode, theConfirmVoucherPrintRequest, (this.confirmVoucherPrintRequest!= null));
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
                Boolean confirmVoucherPrintRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.confirmVoucherPrintRequest!= null));
                if (confirmVoucherPrintRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    ConfirmVoucherPrintRequest sourceConfirmVoucherPrintRequest;
                    sourceConfirmVoucherPrintRequest = this.getConfirmVoucherPrintRequest();
                    ConfirmVoucherPrintRequest copyConfirmVoucherPrintRequest = ((ConfirmVoucherPrintRequest) strategy.copy(LocatorUtils.property(locator, "confirmVoucherPrintRequest", sourceConfirmVoucherPrintRequest), sourceConfirmVoucherPrintRequest, (this.confirmVoucherPrintRequest!= null)));
                    copy.setConfirmVoucherPrintRequest(copyConfirmVoucherPrintRequest);
                } else {
                    if (confirmVoucherPrintRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.confirmVoucherPrintRequest = null;
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
                Boolean confirmVoucherPrintRequestShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.confirmVoucherPrintRequest!= null), (rightObject.confirmVoucherPrintRequest!= null));
                if (confirmVoucherPrintRequestShouldBeMergedAndSet == Boolean.TRUE) {
                    ConfirmVoucherPrintRequest lhsConfirmVoucherPrintRequest;
                    lhsConfirmVoucherPrintRequest = leftObject.getConfirmVoucherPrintRequest();
                    ConfirmVoucherPrintRequest rhsConfirmVoucherPrintRequest;
                    rhsConfirmVoucherPrintRequest = rightObject.getConfirmVoucherPrintRequest();
                    ConfirmVoucherPrintRequest mergedConfirmVoucherPrintRequest = ((ConfirmVoucherPrintRequest) strategy.merge(LocatorUtils.property(leftLocator, "confirmVoucherPrintRequest", lhsConfirmVoucherPrintRequest), LocatorUtils.property(rightLocator, "confirmVoucherPrintRequest", rhsConfirmVoucherPrintRequest), lhsConfirmVoucherPrintRequest, rhsConfirmVoucherPrintRequest, (leftObject.confirmVoucherPrintRequest!= null), (rightObject.confirmVoucherPrintRequest!= null)));
                    target.setConfirmVoucherPrintRequest(mergedConfirmVoucherPrintRequest);
                } else {
                    if (confirmVoucherPrintRequestShouldBeMergedAndSet == Boolean.FALSE) {
                        target.confirmVoucherPrintRequest = null;
                    }
                }
            }
        }
    }

}
