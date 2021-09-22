
package com.paymentplaform.raya.gate.init;

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
 * <p>Java class for InitPaymentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitPaymentRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Init_Payment_Request" type="{http://raya.paymentplaform.com/gate/init}Init_Payment_Request"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitPaymentRequestType", namespace = "http://raya.paymentplaform.com/gate/init", propOrder = {
    "initPaymentRequest"
})
public class InitPaymentRequestType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Init_Payment_Request", required = true)
    protected InitPaymentRequest initPaymentRequest;

    /**
     * Gets the value of the initPaymentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link InitPaymentRequest }
     *     
     */
    public InitPaymentRequest getInitPaymentRequest() {
        return initPaymentRequest;
    }

    /**
     * Sets the value of the initPaymentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitPaymentRequest }
     *     
     */
    public void setInitPaymentRequest(InitPaymentRequest value) {
        this.initPaymentRequest = value;
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
            InitPaymentRequest theInitPaymentRequest;
            theInitPaymentRequest = this.getInitPaymentRequest();
            strategy.appendField(locator, this, "initPaymentRequest", buffer, theInitPaymentRequest, (this.initPaymentRequest!= null));
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
        final InitPaymentRequestType that = ((InitPaymentRequestType) object);
        {
            InitPaymentRequest lhsInitPaymentRequest;
            lhsInitPaymentRequest = this.getInitPaymentRequest();
            InitPaymentRequest rhsInitPaymentRequest;
            rhsInitPaymentRequest = that.getInitPaymentRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "initPaymentRequest", lhsInitPaymentRequest), LocatorUtils.property(thatLocator, "initPaymentRequest", rhsInitPaymentRequest), lhsInitPaymentRequest, rhsInitPaymentRequest, (this.initPaymentRequest!= null), (that.initPaymentRequest!= null))) {
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
            InitPaymentRequest theInitPaymentRequest;
            theInitPaymentRequest = this.getInitPaymentRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "initPaymentRequest", theInitPaymentRequest), currentHashCode, theInitPaymentRequest, (this.initPaymentRequest!= null));
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
        if (draftCopy instanceof InitPaymentRequestType) {
            final InitPaymentRequestType copy = ((InitPaymentRequestType) draftCopy);
            {
                Boolean initPaymentRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.initPaymentRequest!= null));
                if (initPaymentRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    InitPaymentRequest sourceInitPaymentRequest;
                    sourceInitPaymentRequest = this.getInitPaymentRequest();
                    InitPaymentRequest copyInitPaymentRequest = ((InitPaymentRequest) strategy.copy(LocatorUtils.property(locator, "initPaymentRequest", sourceInitPaymentRequest), sourceInitPaymentRequest, (this.initPaymentRequest!= null)));
                    copy.setInitPaymentRequest(copyInitPaymentRequest);
                } else {
                    if (initPaymentRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.initPaymentRequest = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new InitPaymentRequestType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof InitPaymentRequestType) {
            final InitPaymentRequestType target = this;
            final InitPaymentRequestType leftObject = ((InitPaymentRequestType) left);
            final InitPaymentRequestType rightObject = ((InitPaymentRequestType) right);
            {
                Boolean initPaymentRequestShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.initPaymentRequest!= null), (rightObject.initPaymentRequest!= null));
                if (initPaymentRequestShouldBeMergedAndSet == Boolean.TRUE) {
                    InitPaymentRequest lhsInitPaymentRequest;
                    lhsInitPaymentRequest = leftObject.getInitPaymentRequest();
                    InitPaymentRequest rhsInitPaymentRequest;
                    rhsInitPaymentRequest = rightObject.getInitPaymentRequest();
                    InitPaymentRequest mergedInitPaymentRequest = ((InitPaymentRequest) strategy.merge(LocatorUtils.property(leftLocator, "initPaymentRequest", lhsInitPaymentRequest), LocatorUtils.property(rightLocator, "initPaymentRequest", rhsInitPaymentRequest), lhsInitPaymentRequest, rhsInitPaymentRequest, (leftObject.initPaymentRequest!= null), (rightObject.initPaymentRequest!= null)));
                    target.setInitPaymentRequest(mergedInitPaymentRequest);
                } else {
                    if (initPaymentRequestShouldBeMergedAndSet == Boolean.FALSE) {
                        target.initPaymentRequest = null;
                    }
                }
            }
        }
    }

}
