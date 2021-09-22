
package com.paymentplaform.raya.gate.summary;

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
 * <p>Java class for DailySummaryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DailySummaryRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Daily_Summary_Request" type="{http://raya.paymentplaform.com/gate/summary}Daily_Summary_Request"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailySummaryRequestType", namespace = "", propOrder = {
    "dailySummaryRequest"
})
@XmlRootElement(name = "MessageBody", namespace = "")
public class MessageBody implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Daily_Summary_Request", required = true)
    protected DailySummaryRequest dailySummaryRequest;

    /**
     * Gets the value of the dailySummaryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DailySummaryRequest }
     *     
     */
    public DailySummaryRequest getDailySummaryRequest() {
        return dailySummaryRequest;
    }

    /**
     * Sets the value of the dailySummaryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailySummaryRequest }
     *     
     */
    public void setDailySummaryRequest(DailySummaryRequest value) {
        this.dailySummaryRequest = value;
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
            DailySummaryRequest theDailySummaryRequest;
            theDailySummaryRequest = this.getDailySummaryRequest();
            strategy.appendField(locator, this, "dailySummaryRequest", buffer, theDailySummaryRequest, (this.dailySummaryRequest!= null));
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
            DailySummaryRequest lhsDailySummaryRequest;
            lhsDailySummaryRequest = this.getDailySummaryRequest();
            DailySummaryRequest rhsDailySummaryRequest;
            rhsDailySummaryRequest = that.getDailySummaryRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dailySummaryRequest", lhsDailySummaryRequest), LocatorUtils.property(thatLocator, "dailySummaryRequest", rhsDailySummaryRequest), lhsDailySummaryRequest, rhsDailySummaryRequest, (this.dailySummaryRequest!= null), (that.dailySummaryRequest!= null))) {
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
            DailySummaryRequest theDailySummaryRequest;
            theDailySummaryRequest = this.getDailySummaryRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dailySummaryRequest", theDailySummaryRequest), currentHashCode, theDailySummaryRequest, (this.dailySummaryRequest!= null));
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
                Boolean dailySummaryRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dailySummaryRequest!= null));
                if (dailySummaryRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    DailySummaryRequest sourceDailySummaryRequest;
                    sourceDailySummaryRequest = this.getDailySummaryRequest();
                    DailySummaryRequest copyDailySummaryRequest = ((DailySummaryRequest) strategy.copy(LocatorUtils.property(locator, "dailySummaryRequest", sourceDailySummaryRequest), sourceDailySummaryRequest, (this.dailySummaryRequest!= null)));
                    copy.setDailySummaryRequest(copyDailySummaryRequest);
                } else {
                    if (dailySummaryRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dailySummaryRequest = null;
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
                Boolean dailySummaryRequestShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.dailySummaryRequest!= null), (rightObject.dailySummaryRequest!= null));
                if (dailySummaryRequestShouldBeMergedAndSet == Boolean.TRUE) {
                    DailySummaryRequest lhsDailySummaryRequest;
                    lhsDailySummaryRequest = leftObject.getDailySummaryRequest();
                    DailySummaryRequest rhsDailySummaryRequest;
                    rhsDailySummaryRequest = rightObject.getDailySummaryRequest();
                    DailySummaryRequest mergedDailySummaryRequest = ((DailySummaryRequest) strategy.merge(LocatorUtils.property(leftLocator, "dailySummaryRequest", lhsDailySummaryRequest), LocatorUtils.property(rightLocator, "dailySummaryRequest", rhsDailySummaryRequest), lhsDailySummaryRequest, rhsDailySummaryRequest, (leftObject.dailySummaryRequest!= null), (rightObject.dailySummaryRequest!= null)));
                    target.setDailySummaryRequest(mergedDailySummaryRequest);
                } else {
                    if (dailySummaryRequestShouldBeMergedAndSet == Boolean.FALSE) {
                        target.dailySummaryRequest = null;
                    }
                }
            }
        }
    }

}
