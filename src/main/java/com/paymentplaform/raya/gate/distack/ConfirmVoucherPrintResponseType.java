
package com.paymentplaform.raya.gate.distack;

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
 * <p>Java class for ConfirmVoucherPrintResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmVoucherPrintResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Confirm_Voucher_Print_Response" type="{http://raya.paymentplaform.com/gate/distack}Confirm_Voucher_Print_Response"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmVoucherPrintResponseType", namespace = "http://raya.paymentplaform.com/gate/distack", propOrder = {
    "confirmVoucherPrintResponse"
})
public class ConfirmVoucherPrintResponseType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Confirm_Voucher_Print_Response", required = true)
    protected ConfirmVoucherPrintResponse confirmVoucherPrintResponse;

    /**
     * Gets the value of the confirmVoucherPrintResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmVoucherPrintResponse }
     *     
     */
    public ConfirmVoucherPrintResponse getConfirmVoucherPrintResponse() {
        return confirmVoucherPrintResponse;
    }

    /**
     * Sets the value of the confirmVoucherPrintResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmVoucherPrintResponse }
     *     
     */
    public void setConfirmVoucherPrintResponse(ConfirmVoucherPrintResponse value) {
        this.confirmVoucherPrintResponse = value;
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
            ConfirmVoucherPrintResponse theConfirmVoucherPrintResponse;
            theConfirmVoucherPrintResponse = this.getConfirmVoucherPrintResponse();
            strategy.appendField(locator, this, "confirmVoucherPrintResponse", buffer, theConfirmVoucherPrintResponse, (this.confirmVoucherPrintResponse!= null));
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
        final ConfirmVoucherPrintResponseType that = ((ConfirmVoucherPrintResponseType) object);
        {
            ConfirmVoucherPrintResponse lhsConfirmVoucherPrintResponse;
            lhsConfirmVoucherPrintResponse = this.getConfirmVoucherPrintResponse();
            ConfirmVoucherPrintResponse rhsConfirmVoucherPrintResponse;
            rhsConfirmVoucherPrintResponse = that.getConfirmVoucherPrintResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "confirmVoucherPrintResponse", lhsConfirmVoucherPrintResponse), LocatorUtils.property(thatLocator, "confirmVoucherPrintResponse", rhsConfirmVoucherPrintResponse), lhsConfirmVoucherPrintResponse, rhsConfirmVoucherPrintResponse, (this.confirmVoucherPrintResponse!= null), (that.confirmVoucherPrintResponse!= null))) {
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
            ConfirmVoucherPrintResponse theConfirmVoucherPrintResponse;
            theConfirmVoucherPrintResponse = this.getConfirmVoucherPrintResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "confirmVoucherPrintResponse", theConfirmVoucherPrintResponse), currentHashCode, theConfirmVoucherPrintResponse, (this.confirmVoucherPrintResponse!= null));
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
        if (draftCopy instanceof ConfirmVoucherPrintResponseType) {
            final ConfirmVoucherPrintResponseType copy = ((ConfirmVoucherPrintResponseType) draftCopy);
            {
                Boolean confirmVoucherPrintResponseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.confirmVoucherPrintResponse!= null));
                if (confirmVoucherPrintResponseShouldBeCopiedAndSet == Boolean.TRUE) {
                    ConfirmVoucherPrintResponse sourceConfirmVoucherPrintResponse;
                    sourceConfirmVoucherPrintResponse = this.getConfirmVoucherPrintResponse();
                    ConfirmVoucherPrintResponse copyConfirmVoucherPrintResponse = ((ConfirmVoucherPrintResponse) strategy.copy(LocatorUtils.property(locator, "confirmVoucherPrintResponse", sourceConfirmVoucherPrintResponse), sourceConfirmVoucherPrintResponse, (this.confirmVoucherPrintResponse!= null)));
                    copy.setConfirmVoucherPrintResponse(copyConfirmVoucherPrintResponse);
                } else {
                    if (confirmVoucherPrintResponseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.confirmVoucherPrintResponse = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ConfirmVoucherPrintResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ConfirmVoucherPrintResponseType) {
            final ConfirmVoucherPrintResponseType target = this;
            final ConfirmVoucherPrintResponseType leftObject = ((ConfirmVoucherPrintResponseType) left);
            final ConfirmVoucherPrintResponseType rightObject = ((ConfirmVoucherPrintResponseType) right);
            {
                Boolean confirmVoucherPrintResponseShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.confirmVoucherPrintResponse!= null), (rightObject.confirmVoucherPrintResponse!= null));
                if (confirmVoucherPrintResponseShouldBeMergedAndSet == Boolean.TRUE) {
                    ConfirmVoucherPrintResponse lhsConfirmVoucherPrintResponse;
                    lhsConfirmVoucherPrintResponse = leftObject.getConfirmVoucherPrintResponse();
                    ConfirmVoucherPrintResponse rhsConfirmVoucherPrintResponse;
                    rhsConfirmVoucherPrintResponse = rightObject.getConfirmVoucherPrintResponse();
                    ConfirmVoucherPrintResponse mergedConfirmVoucherPrintResponse = ((ConfirmVoucherPrintResponse) strategy.merge(LocatorUtils.property(leftLocator, "confirmVoucherPrintResponse", lhsConfirmVoucherPrintResponse), LocatorUtils.property(rightLocator, "confirmVoucherPrintResponse", rhsConfirmVoucherPrintResponse), lhsConfirmVoucherPrintResponse, rhsConfirmVoucherPrintResponse, (leftObject.confirmVoucherPrintResponse!= null), (rightObject.confirmVoucherPrintResponse!= null)));
                    target.setConfirmVoucherPrintResponse(mergedConfirmVoucherPrintResponse);
                } else {
                    if (confirmVoucherPrintResponseShouldBeMergedAndSet == Boolean.FALSE) {
                        target.confirmVoucherPrintResponse = null;
                    }
                }
            }
        }
    }

}
