
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
 * <p>Java class for InitPaymentResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitPaymentResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Init_Payment_Response" type="{http://raya.paymentplaform.com/gate/init}Init_Payment_Response"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitPaymentResponseType", namespace = "http://raya.paymentplaform.com/gate/init", propOrder = {
    "initPaymentResponse"
})
public class InitPaymentResponseType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Init_Payment_Response", required = true)
    protected InitPaymentResponse initPaymentResponse;

    /**
     * Gets the value of the initPaymentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link InitPaymentResponse }
     *     
     */
    public InitPaymentResponse getInitPaymentResponse() {
        return initPaymentResponse;
    }

    /**
     * Sets the value of the initPaymentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitPaymentResponse }
     *     
     */
    public void setInitPaymentResponse(InitPaymentResponse value) {
        this.initPaymentResponse = value;
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
            InitPaymentResponse theInitPaymentResponse;
            theInitPaymentResponse = this.getInitPaymentResponse();
            strategy.appendField(locator, this, "initPaymentResponse", buffer, theInitPaymentResponse, (this.initPaymentResponse!= null));
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
        final InitPaymentResponseType that = ((InitPaymentResponseType) object);
        {
            InitPaymentResponse lhsInitPaymentResponse;
            lhsInitPaymentResponse = this.getInitPaymentResponse();
            InitPaymentResponse rhsInitPaymentResponse;
            rhsInitPaymentResponse = that.getInitPaymentResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "initPaymentResponse", lhsInitPaymentResponse), LocatorUtils.property(thatLocator, "initPaymentResponse", rhsInitPaymentResponse), lhsInitPaymentResponse, rhsInitPaymentResponse, (this.initPaymentResponse!= null), (that.initPaymentResponse!= null))) {
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
            InitPaymentResponse theInitPaymentResponse;
            theInitPaymentResponse = this.getInitPaymentResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "initPaymentResponse", theInitPaymentResponse), currentHashCode, theInitPaymentResponse, (this.initPaymentResponse!= null));
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
        if (draftCopy instanceof InitPaymentResponseType) {
            final InitPaymentResponseType copy = ((InitPaymentResponseType) draftCopy);
            {
                Boolean initPaymentResponseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.initPaymentResponse!= null));
                if (initPaymentResponseShouldBeCopiedAndSet == Boolean.TRUE) {
                    InitPaymentResponse sourceInitPaymentResponse;
                    sourceInitPaymentResponse = this.getInitPaymentResponse();
                    InitPaymentResponse copyInitPaymentResponse = ((InitPaymentResponse) strategy.copy(LocatorUtils.property(locator, "initPaymentResponse", sourceInitPaymentResponse), sourceInitPaymentResponse, (this.initPaymentResponse!= null)));
                    copy.setInitPaymentResponse(copyInitPaymentResponse);
                } else {
                    if (initPaymentResponseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.initPaymentResponse = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new InitPaymentResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof InitPaymentResponseType) {
            final InitPaymentResponseType target = this;
            final InitPaymentResponseType leftObject = ((InitPaymentResponseType) left);
            final InitPaymentResponseType rightObject = ((InitPaymentResponseType) right);
            {
                Boolean initPaymentResponseShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.initPaymentResponse!= null), (rightObject.initPaymentResponse!= null));
                if (initPaymentResponseShouldBeMergedAndSet == Boolean.TRUE) {
                    InitPaymentResponse lhsInitPaymentResponse;
                    lhsInitPaymentResponse = leftObject.getInitPaymentResponse();
                    InitPaymentResponse rhsInitPaymentResponse;
                    rhsInitPaymentResponse = rightObject.getInitPaymentResponse();
                    InitPaymentResponse mergedInitPaymentResponse = ((InitPaymentResponse) strategy.merge(LocatorUtils.property(leftLocator, "initPaymentResponse", lhsInitPaymentResponse), LocatorUtils.property(rightLocator, "initPaymentResponse", rhsInitPaymentResponse), lhsInitPaymentResponse, rhsInitPaymentResponse, (leftObject.initPaymentResponse!= null), (rightObject.initPaymentResponse!= null)));
                    target.setInitPaymentResponse(mergedInitPaymentResponse);
                } else {
                    if (initPaymentResponseShouldBeMergedAndSet == Boolean.FALSE) {
                        target.initPaymentResponse = null;
                    }
                }
            }
        }
    }

}
