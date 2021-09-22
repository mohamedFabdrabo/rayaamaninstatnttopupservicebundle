
package com.paymentplaform.raya.gate;

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
 * <p>Java class for ResponseHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResponseHeader" type="{http://raya.paymentplaform.com/gate}ResponseHeader"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHeaderType", namespace = "http://raya.paymentplaform.com/gate", propOrder = {
    "responseHeader"
})
public class ResponseHeaderType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "ResponseHeader", required = true)
    protected ResponseHeader responseHeader;

    /**
     * Gets the value of the responseHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseHeader }
     *     
     */
    public ResponseHeader getResponseHeader() {
        return responseHeader;
    }

    /**
     * Sets the value of the responseHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseHeader }
     *     
     */
    public void setResponseHeader(ResponseHeader value) {
        this.responseHeader = value;
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
            ResponseHeader theResponseHeader;
            theResponseHeader = this.getResponseHeader();
            strategy.appendField(locator, this, "responseHeader", buffer, theResponseHeader, (this.responseHeader!= null));
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
        final ResponseHeaderType that = ((ResponseHeaderType) object);
        {
            ResponseHeader lhsResponseHeader;
            lhsResponseHeader = this.getResponseHeader();
            ResponseHeader rhsResponseHeader;
            rhsResponseHeader = that.getResponseHeader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "responseHeader", lhsResponseHeader), LocatorUtils.property(thatLocator, "responseHeader", rhsResponseHeader), lhsResponseHeader, rhsResponseHeader, (this.responseHeader!= null), (that.responseHeader!= null))) {
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
            ResponseHeader theResponseHeader;
            theResponseHeader = this.getResponseHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "responseHeader", theResponseHeader), currentHashCode, theResponseHeader, (this.responseHeader!= null));
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
        if (draftCopy instanceof ResponseHeaderType) {
            final ResponseHeaderType copy = ((ResponseHeaderType) draftCopy);
            {
                Boolean responseHeaderShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.responseHeader!= null));
                if (responseHeaderShouldBeCopiedAndSet == Boolean.TRUE) {
                    ResponseHeader sourceResponseHeader;
                    sourceResponseHeader = this.getResponseHeader();
                    ResponseHeader copyResponseHeader = ((ResponseHeader) strategy.copy(LocatorUtils.property(locator, "responseHeader", sourceResponseHeader), sourceResponseHeader, (this.responseHeader!= null)));
                    copy.setResponseHeader(copyResponseHeader);
                } else {
                    if (responseHeaderShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.responseHeader = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ResponseHeaderType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ResponseHeaderType) {
            final ResponseHeaderType target = this;
            final ResponseHeaderType leftObject = ((ResponseHeaderType) left);
            final ResponseHeaderType rightObject = ((ResponseHeaderType) right);
            {
                Boolean responseHeaderShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.responseHeader!= null), (rightObject.responseHeader!= null));
                if (responseHeaderShouldBeMergedAndSet == Boolean.TRUE) {
                    ResponseHeader lhsResponseHeader;
                    lhsResponseHeader = leftObject.getResponseHeader();
                    ResponseHeader rhsResponseHeader;
                    rhsResponseHeader = rightObject.getResponseHeader();
                    ResponseHeader mergedResponseHeader = ((ResponseHeader) strategy.merge(LocatorUtils.property(leftLocator, "responseHeader", lhsResponseHeader), LocatorUtils.property(rightLocator, "responseHeader", rhsResponseHeader), lhsResponseHeader, rhsResponseHeader, (leftObject.responseHeader!= null), (rightObject.responseHeader!= null)));
                    target.setResponseHeader(mergedResponseHeader);
                } else {
                    if (responseHeaderShouldBeMergedAndSet == Boolean.FALSE) {
                        target.responseHeader = null;
                    }
                }
            }
        }
    }

}
