
package com.paymentplaform.raya.gate.pagservice;

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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageHeader" type="{http://raya.paymentplaform.com/gate/pagservice}RequestHeaderType"/&gt;
 *         &lt;element name="MessageBody" type="{http://raya.paymentplaform.com/gate/pagservice}LoadSDPaginationRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageHeader",
    "messageBody"
})
@XmlRootElement(name = "LoadSDPaginationReq", namespace = "http://raya.paymentplaform.com/gate/pagservice")
public class LoadSDPaginationReq implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "MessageHeader", required = true)
    protected RequestHeaderType messageHeader;
    @XmlElement(name = "MessageBody", required = true)
    protected LoadSDPaginationRequestType messageBody;

    /**
     * Gets the value of the messageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeaderType }
     *     
     */
    public RequestHeaderType getMessageHeader() {
        return messageHeader;
    }

    /**
     * Sets the value of the messageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeaderType }
     *     
     */
    public void setMessageHeader(RequestHeaderType value) {
        this.messageHeader = value;
    }

    /**
     * Gets the value of the messageBody property.
     * 
     * @return
     *     possible object is
     *     {@link LoadSDPaginationRequestType }
     *     
     */
    public LoadSDPaginationRequestType getMessageBody() {
        return messageBody;
    }

    /**
     * Sets the value of the messageBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadSDPaginationRequestType }
     *     
     */
    public void setMessageBody(LoadSDPaginationRequestType value) {
        this.messageBody = value;
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
            RequestHeaderType theMessageHeader;
            theMessageHeader = this.getMessageHeader();
            strategy.appendField(locator, this, "messageHeader", buffer, theMessageHeader, (this.messageHeader!= null));
        }
        {
            LoadSDPaginationRequestType theMessageBody;
            theMessageBody = this.getMessageBody();
            strategy.appendField(locator, this, "messageBody", buffer, theMessageBody, (this.messageBody!= null));
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
        final LoadSDPaginationReq that = ((LoadSDPaginationReq) object);
        {
            RequestHeaderType lhsMessageHeader;
            lhsMessageHeader = this.getMessageHeader();
            RequestHeaderType rhsMessageHeader;
            rhsMessageHeader = that.getMessageHeader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageHeader", lhsMessageHeader), LocatorUtils.property(thatLocator, "messageHeader", rhsMessageHeader), lhsMessageHeader, rhsMessageHeader, (this.messageHeader!= null), (that.messageHeader!= null))) {
                return false;
            }
        }
        {
            LoadSDPaginationRequestType lhsMessageBody;
            lhsMessageBody = this.getMessageBody();
            LoadSDPaginationRequestType rhsMessageBody;
            rhsMessageBody = that.getMessageBody();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "messageBody", lhsMessageBody), LocatorUtils.property(thatLocator, "messageBody", rhsMessageBody), lhsMessageBody, rhsMessageBody, (this.messageBody!= null), (that.messageBody!= null))) {
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
            RequestHeaderType theMessageHeader;
            theMessageHeader = this.getMessageHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageHeader", theMessageHeader), currentHashCode, theMessageHeader, (this.messageHeader!= null));
        }
        {
            LoadSDPaginationRequestType theMessageBody;
            theMessageBody = this.getMessageBody();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "messageBody", theMessageBody), currentHashCode, theMessageBody, (this.messageBody!= null));
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
        if (draftCopy instanceof LoadSDPaginationReq) {
            final LoadSDPaginationReq copy = ((LoadSDPaginationReq) draftCopy);
            {
                Boolean messageHeaderShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.messageHeader!= null));
                if (messageHeaderShouldBeCopiedAndSet == Boolean.TRUE) {
                    RequestHeaderType sourceMessageHeader;
                    sourceMessageHeader = this.getMessageHeader();
                    RequestHeaderType copyMessageHeader = ((RequestHeaderType) strategy.copy(LocatorUtils.property(locator, "messageHeader", sourceMessageHeader), sourceMessageHeader, (this.messageHeader!= null)));
                    copy.setMessageHeader(copyMessageHeader);
                } else {
                    if (messageHeaderShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.messageHeader = null;
                    }
                }
            }
            {
                Boolean messageBodyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.messageBody!= null));
                if (messageBodyShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadSDPaginationRequestType sourceMessageBody;
                    sourceMessageBody = this.getMessageBody();
                    LoadSDPaginationRequestType copyMessageBody = ((LoadSDPaginationRequestType) strategy.copy(LocatorUtils.property(locator, "messageBody", sourceMessageBody), sourceMessageBody, (this.messageBody!= null)));
                    copy.setMessageBody(copyMessageBody);
                } else {
                    if (messageBodyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.messageBody = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LoadSDPaginationReq();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof LoadSDPaginationReq) {
            final LoadSDPaginationReq target = this;
            final LoadSDPaginationReq leftObject = ((LoadSDPaginationReq) left);
            final LoadSDPaginationReq rightObject = ((LoadSDPaginationReq) right);
            {
                Boolean messageHeaderShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.messageHeader!= null), (rightObject.messageHeader!= null));
                if (messageHeaderShouldBeMergedAndSet == Boolean.TRUE) {
                    RequestHeaderType lhsMessageHeader;
                    lhsMessageHeader = leftObject.getMessageHeader();
                    RequestHeaderType rhsMessageHeader;
                    rhsMessageHeader = rightObject.getMessageHeader();
                    RequestHeaderType mergedMessageHeader = ((RequestHeaderType) strategy.merge(LocatorUtils.property(leftLocator, "messageHeader", lhsMessageHeader), LocatorUtils.property(rightLocator, "messageHeader", rhsMessageHeader), lhsMessageHeader, rhsMessageHeader, (leftObject.messageHeader!= null), (rightObject.messageHeader!= null)));
                    target.setMessageHeader(mergedMessageHeader);
                } else {
                    if (messageHeaderShouldBeMergedAndSet == Boolean.FALSE) {
                        target.messageHeader = null;
                    }
                }
            }
            {
                Boolean messageBodyShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.messageBody!= null), (rightObject.messageBody!= null));
                if (messageBodyShouldBeMergedAndSet == Boolean.TRUE) {
                    LoadSDPaginationRequestType lhsMessageBody;
                    lhsMessageBody = leftObject.getMessageBody();
                    LoadSDPaginationRequestType rhsMessageBody;
                    rhsMessageBody = rightObject.getMessageBody();
                    LoadSDPaginationRequestType mergedMessageBody = ((LoadSDPaginationRequestType) strategy.merge(LocatorUtils.property(leftLocator, "messageBody", lhsMessageBody), LocatorUtils.property(rightLocator, "messageBody", rhsMessageBody), lhsMessageBody, rhsMessageBody, (leftObject.messageBody!= null), (rightObject.messageBody!= null)));
                    target.setMessageBody(mergedMessageBody);
                } else {
                    if (messageBodyShouldBeMergedAndSet == Boolean.FALSE) {
                        target.messageBody = null;
                    }
                }
            }
        }
    }

}
