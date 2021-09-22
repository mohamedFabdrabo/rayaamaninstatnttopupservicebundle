
package com.paymentplaform.raya.gate.activate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.paymentplaform.raya.gate.RequestHeader;
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
 * <p>Java class for RequestHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestHeader" type="{http://raya.paymentplaform.com/gate}RequestHeader"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeaderType", namespace = "http://raya.paymentplaform.com/gate/activate", propOrder = {
    "requestHeader"
})
@XmlRootElement(name = "MessageHeader", namespace = "http://raya.paymentplaform.com/gate/activate")
public class MessageHeader implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "RequestHeader", required = true)
    protected RequestHeader requestHeader;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeader }
     *     
     */
    public RequestHeader getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeader }
     *     
     */
    public void setRequestHeader(RequestHeader value) {
        this.requestHeader = value;
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
            RequestHeader theRequestHeader;
            theRequestHeader = this.getRequestHeader();
            strategy.appendField(locator, this, "requestHeader", buffer, theRequestHeader, (this.requestHeader!= null));
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
        final MessageHeader that = ((MessageHeader) object);
        {
            RequestHeader lhsRequestHeader;
            lhsRequestHeader = this.getRequestHeader();
            RequestHeader rhsRequestHeader;
            rhsRequestHeader = that.getRequestHeader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requestHeader", lhsRequestHeader), LocatorUtils.property(thatLocator, "requestHeader", rhsRequestHeader), lhsRequestHeader, rhsRequestHeader, (this.requestHeader!= null), (that.requestHeader!= null))) {
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
            RequestHeader theRequestHeader;
            theRequestHeader = this.getRequestHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requestHeader", theRequestHeader), currentHashCode, theRequestHeader, (this.requestHeader!= null));
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
        if (draftCopy instanceof MessageHeader) {
            final MessageHeader copy = ((MessageHeader) draftCopy);
            {
                Boolean requestHeaderShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.requestHeader!= null));
                if (requestHeaderShouldBeCopiedAndSet == Boolean.TRUE) {
                    RequestHeader sourceRequestHeader;
                    sourceRequestHeader = this.getRequestHeader();
                    RequestHeader copyRequestHeader = ((RequestHeader) strategy.copy(LocatorUtils.property(locator, "requestHeader", sourceRequestHeader), sourceRequestHeader, (this.requestHeader!= null)));
                    copy.setRequestHeader(copyRequestHeader);
                } else {
                    if (requestHeaderShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.requestHeader = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MessageHeader();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof MessageHeader) {
            final MessageHeader target = this;
            final MessageHeader leftObject = ((MessageHeader) left);
            final MessageHeader rightObject = ((MessageHeader) right);
            {
                Boolean requestHeaderShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.requestHeader!= null), (rightObject.requestHeader!= null));
                if (requestHeaderShouldBeMergedAndSet == Boolean.TRUE) {
                    RequestHeader lhsRequestHeader;
                    lhsRequestHeader = leftObject.getRequestHeader();
                    RequestHeader rhsRequestHeader;
                    rhsRequestHeader = rightObject.getRequestHeader();
                    RequestHeader mergedRequestHeader = ((RequestHeader) strategy.merge(LocatorUtils.property(leftLocator, "requestHeader", lhsRequestHeader), LocatorUtils.property(rightLocator, "requestHeader", rhsRequestHeader), lhsRequestHeader, rhsRequestHeader, (leftObject.requestHeader!= null), (rightObject.requestHeader!= null)));
                    target.setRequestHeader(mergedRequestHeader);
                } else {
                    if (requestHeaderShouldBeMergedAndSet == Boolean.FALSE) {
                        target.requestHeader = null;
                    }
                }
            }
        }
    }

}
