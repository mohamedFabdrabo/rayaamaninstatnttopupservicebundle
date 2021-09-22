
package com.paymentplaform.raya.gate.summary;

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
 * <p>Java class for DailySummaryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DailySummaryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Daily_Summary_Response" type="{http://raya.paymentplaform.com/gate/summary}Daily_Summary_Response"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailySummaryResponseType", namespace = "http://raya.paymentplaform.com/gate/summary", propOrder = {
    "dailySummaryResponse"
})
public class DailySummaryResponseType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Daily_Summary_Response", required = true)
    protected DailySummaryResponse dailySummaryResponse;

    /**
     * Gets the value of the dailySummaryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DailySummaryResponse }
     *     
     */
    public DailySummaryResponse getDailySummaryResponse() {
        return dailySummaryResponse;
    }

    /**
     * Sets the value of the dailySummaryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailySummaryResponse }
     *     
     */
    public void setDailySummaryResponse(DailySummaryResponse value) {
        this.dailySummaryResponse = value;
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
            DailySummaryResponse theDailySummaryResponse;
            theDailySummaryResponse = this.getDailySummaryResponse();
            strategy.appendField(locator, this, "dailySummaryResponse", buffer, theDailySummaryResponse, (this.dailySummaryResponse!= null));
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
        final DailySummaryResponseType that = ((DailySummaryResponseType) object);
        {
            DailySummaryResponse lhsDailySummaryResponse;
            lhsDailySummaryResponse = this.getDailySummaryResponse();
            DailySummaryResponse rhsDailySummaryResponse;
            rhsDailySummaryResponse = that.getDailySummaryResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dailySummaryResponse", lhsDailySummaryResponse), LocatorUtils.property(thatLocator, "dailySummaryResponse", rhsDailySummaryResponse), lhsDailySummaryResponse, rhsDailySummaryResponse, (this.dailySummaryResponse!= null), (that.dailySummaryResponse!= null))) {
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
            DailySummaryResponse theDailySummaryResponse;
            theDailySummaryResponse = this.getDailySummaryResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dailySummaryResponse", theDailySummaryResponse), currentHashCode, theDailySummaryResponse, (this.dailySummaryResponse!= null));
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
        if (draftCopy instanceof DailySummaryResponseType) {
            final DailySummaryResponseType copy = ((DailySummaryResponseType) draftCopy);
            {
                Boolean dailySummaryResponseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.dailySummaryResponse!= null));
                if (dailySummaryResponseShouldBeCopiedAndSet == Boolean.TRUE) {
                    DailySummaryResponse sourceDailySummaryResponse;
                    sourceDailySummaryResponse = this.getDailySummaryResponse();
                    DailySummaryResponse copyDailySummaryResponse = ((DailySummaryResponse) strategy.copy(LocatorUtils.property(locator, "dailySummaryResponse", sourceDailySummaryResponse), sourceDailySummaryResponse, (this.dailySummaryResponse!= null)));
                    copy.setDailySummaryResponse(copyDailySummaryResponse);
                } else {
                    if (dailySummaryResponseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.dailySummaryResponse = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new DailySummaryResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof DailySummaryResponseType) {
            final DailySummaryResponseType target = this;
            final DailySummaryResponseType leftObject = ((DailySummaryResponseType) left);
            final DailySummaryResponseType rightObject = ((DailySummaryResponseType) right);
            {
                Boolean dailySummaryResponseShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.dailySummaryResponse!= null), (rightObject.dailySummaryResponse!= null));
                if (dailySummaryResponseShouldBeMergedAndSet == Boolean.TRUE) {
                    DailySummaryResponse lhsDailySummaryResponse;
                    lhsDailySummaryResponse = leftObject.getDailySummaryResponse();
                    DailySummaryResponse rhsDailySummaryResponse;
                    rhsDailySummaryResponse = rightObject.getDailySummaryResponse();
                    DailySummaryResponse mergedDailySummaryResponse = ((DailySummaryResponse) strategy.merge(LocatorUtils.property(leftLocator, "dailySummaryResponse", lhsDailySummaryResponse), LocatorUtils.property(rightLocator, "dailySummaryResponse", rhsDailySummaryResponse), lhsDailySummaryResponse, rhsDailySummaryResponse, (leftObject.dailySummaryResponse!= null), (rightObject.dailySummaryResponse!= null)));
                    target.setDailySummaryResponse(mergedDailySummaryResponse);
                } else {
                    if (dailySummaryResponseShouldBeMergedAndSet == Boolean.FALSE) {
                        target.dailySummaryResponse = null;
                    }
                }
            }
        }
    }

}
