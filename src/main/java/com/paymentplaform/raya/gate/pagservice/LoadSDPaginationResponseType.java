
package com.paymentplaform.raya.gate.pagservice;

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
 * <p>Java class for LoadSDPaginationResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadSDPaginationResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoadSDPaginationResponse" type="{http://raya.paymentplaform.com/gate/pagservice}LoadSDPaginationResType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadSDPaginationResponseType", namespace = "http://raya.paymentplaform.com/gate/pagservice", propOrder = {
    "loadSDPaginationResponse"
})
public class LoadSDPaginationResponseType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "LoadSDPaginationResponse", required = true)
    protected LoadSDPaginationResType loadSDPaginationResponse;

    /**
     * Gets the value of the loadSDPaginationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link LoadSDPaginationResType }
     *     
     */
    public LoadSDPaginationResType getLoadSDPaginationResponse() {
        return loadSDPaginationResponse;
    }

    /**
     * Sets the value of the loadSDPaginationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadSDPaginationResType }
     *     
     */
    public void setLoadSDPaginationResponse(LoadSDPaginationResType value) {
        this.loadSDPaginationResponse = value;
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
            LoadSDPaginationResType theLoadSDPaginationResponse;
            theLoadSDPaginationResponse = this.getLoadSDPaginationResponse();
            strategy.appendField(locator, this, "loadSDPaginationResponse", buffer, theLoadSDPaginationResponse, (this.loadSDPaginationResponse!= null));
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
        final LoadSDPaginationResponseType that = ((LoadSDPaginationResponseType) object);
        {
            LoadSDPaginationResType lhsLoadSDPaginationResponse;
            lhsLoadSDPaginationResponse = this.getLoadSDPaginationResponse();
            LoadSDPaginationResType rhsLoadSDPaginationResponse;
            rhsLoadSDPaginationResponse = that.getLoadSDPaginationResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loadSDPaginationResponse", lhsLoadSDPaginationResponse), LocatorUtils.property(thatLocator, "loadSDPaginationResponse", rhsLoadSDPaginationResponse), lhsLoadSDPaginationResponse, rhsLoadSDPaginationResponse, (this.loadSDPaginationResponse!= null), (that.loadSDPaginationResponse!= null))) {
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
            LoadSDPaginationResType theLoadSDPaginationResponse;
            theLoadSDPaginationResponse = this.getLoadSDPaginationResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loadSDPaginationResponse", theLoadSDPaginationResponse), currentHashCode, theLoadSDPaginationResponse, (this.loadSDPaginationResponse!= null));
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
        if (draftCopy instanceof LoadSDPaginationResponseType) {
            final LoadSDPaginationResponseType copy = ((LoadSDPaginationResponseType) draftCopy);
            {
                Boolean loadSDPaginationResponseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loadSDPaginationResponse!= null));
                if (loadSDPaginationResponseShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadSDPaginationResType sourceLoadSDPaginationResponse;
                    sourceLoadSDPaginationResponse = this.getLoadSDPaginationResponse();
                    LoadSDPaginationResType copyLoadSDPaginationResponse = ((LoadSDPaginationResType) strategy.copy(LocatorUtils.property(locator, "loadSDPaginationResponse", sourceLoadSDPaginationResponse), sourceLoadSDPaginationResponse, (this.loadSDPaginationResponse!= null)));
                    copy.setLoadSDPaginationResponse(copyLoadSDPaginationResponse);
                } else {
                    if (loadSDPaginationResponseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadSDPaginationResponse = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LoadSDPaginationResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof LoadSDPaginationResponseType) {
            final LoadSDPaginationResponseType target = this;
            final LoadSDPaginationResponseType leftObject = ((LoadSDPaginationResponseType) left);
            final LoadSDPaginationResponseType rightObject = ((LoadSDPaginationResponseType) right);
            {
                Boolean loadSDPaginationResponseShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.loadSDPaginationResponse!= null), (rightObject.loadSDPaginationResponse!= null));
                if (loadSDPaginationResponseShouldBeMergedAndSet == Boolean.TRUE) {
                    LoadSDPaginationResType lhsLoadSDPaginationResponse;
                    lhsLoadSDPaginationResponse = leftObject.getLoadSDPaginationResponse();
                    LoadSDPaginationResType rhsLoadSDPaginationResponse;
                    rhsLoadSDPaginationResponse = rightObject.getLoadSDPaginationResponse();
                    LoadSDPaginationResType mergedLoadSDPaginationResponse = ((LoadSDPaginationResType) strategy.merge(LocatorUtils.property(leftLocator, "loadSDPaginationResponse", lhsLoadSDPaginationResponse), LocatorUtils.property(rightLocator, "loadSDPaginationResponse", rhsLoadSDPaginationResponse), lhsLoadSDPaginationResponse, rhsLoadSDPaginationResponse, (leftObject.loadSDPaginationResponse!= null), (rightObject.loadSDPaginationResponse!= null)));
                    target.setLoadSDPaginationResponse(mergedLoadSDPaginationResponse);
                } else {
                    if (loadSDPaginationResponseShouldBeMergedAndSet == Boolean.FALSE) {
                        target.loadSDPaginationResponse = null;
                    }
                }
            }
        }
    }

}
