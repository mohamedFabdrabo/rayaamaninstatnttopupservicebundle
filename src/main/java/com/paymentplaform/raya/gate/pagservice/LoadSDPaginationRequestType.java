
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
 * <p>Java class for LoadSDPaginationRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadSDPaginationRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoadSDPaginationRequest" type="{http://raya.paymentplaform.com/gate/pagservice}LoadSDPaginationReqType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadSDPaginationRequestType", namespace = "", propOrder = {
    "loadSDPaginationRequest"
})
public class LoadSDPaginationRequestType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "LoadSDPaginationRequest", required = true)
    protected LoadSDPaginationReqType loadSDPaginationRequest;

    /**
     * Gets the value of the loadSDPaginationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoadSDPaginationReqType }
     *     
     */
    public LoadSDPaginationReqType getLoadSDPaginationRequest() {
        return loadSDPaginationRequest;
    }

    /**
     * Sets the value of the loadSDPaginationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadSDPaginationReqType }
     *     
     */
    public void setLoadSDPaginationRequest(LoadSDPaginationReqType value) {
        this.loadSDPaginationRequest = value;
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
            LoadSDPaginationReqType theLoadSDPaginationRequest;
            theLoadSDPaginationRequest = this.getLoadSDPaginationRequest();
            strategy.appendField(locator, this, "loadSDPaginationRequest", buffer, theLoadSDPaginationRequest, (this.loadSDPaginationRequest!= null));
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
        final LoadSDPaginationRequestType that = ((LoadSDPaginationRequestType) object);
        {
            LoadSDPaginationReqType lhsLoadSDPaginationRequest;
            lhsLoadSDPaginationRequest = this.getLoadSDPaginationRequest();
            LoadSDPaginationReqType rhsLoadSDPaginationRequest;
            rhsLoadSDPaginationRequest = that.getLoadSDPaginationRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loadSDPaginationRequest", lhsLoadSDPaginationRequest), LocatorUtils.property(thatLocator, "loadSDPaginationRequest", rhsLoadSDPaginationRequest), lhsLoadSDPaginationRequest, rhsLoadSDPaginationRequest, (this.loadSDPaginationRequest!= null), (that.loadSDPaginationRequest!= null))) {
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
            LoadSDPaginationReqType theLoadSDPaginationRequest;
            theLoadSDPaginationRequest = this.getLoadSDPaginationRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loadSDPaginationRequest", theLoadSDPaginationRequest), currentHashCode, theLoadSDPaginationRequest, (this.loadSDPaginationRequest!= null));
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
        if (draftCopy instanceof LoadSDPaginationRequestType) {
            final LoadSDPaginationRequestType copy = ((LoadSDPaginationRequestType) draftCopy);
            {
                Boolean loadSDPaginationRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loadSDPaginationRequest!= null));
                if (loadSDPaginationRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadSDPaginationReqType sourceLoadSDPaginationRequest;
                    sourceLoadSDPaginationRequest = this.getLoadSDPaginationRequest();
                    LoadSDPaginationReqType copyLoadSDPaginationRequest = ((LoadSDPaginationReqType) strategy.copy(LocatorUtils.property(locator, "loadSDPaginationRequest", sourceLoadSDPaginationRequest), sourceLoadSDPaginationRequest, (this.loadSDPaginationRequest!= null)));
                    copy.setLoadSDPaginationRequest(copyLoadSDPaginationRequest);
                } else {
                    if (loadSDPaginationRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadSDPaginationRequest = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LoadSDPaginationRequestType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof LoadSDPaginationRequestType) {
            final LoadSDPaginationRequestType target = this;
            final LoadSDPaginationRequestType leftObject = ((LoadSDPaginationRequestType) left);
            final LoadSDPaginationRequestType rightObject = ((LoadSDPaginationRequestType) right);
            {
                Boolean loadSDPaginationRequestShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.loadSDPaginationRequest!= null), (rightObject.loadSDPaginationRequest!= null));
                if (loadSDPaginationRequestShouldBeMergedAndSet == Boolean.TRUE) {
                    LoadSDPaginationReqType lhsLoadSDPaginationRequest;
                    lhsLoadSDPaginationRequest = leftObject.getLoadSDPaginationRequest();
                    LoadSDPaginationReqType rhsLoadSDPaginationRequest;
                    rhsLoadSDPaginationRequest = rightObject.getLoadSDPaginationRequest();
                    LoadSDPaginationReqType mergedLoadSDPaginationRequest = ((LoadSDPaginationReqType) strategy.merge(LocatorUtils.property(leftLocator, "loadSDPaginationRequest", lhsLoadSDPaginationRequest), LocatorUtils.property(rightLocator, "loadSDPaginationRequest", rhsLoadSDPaginationRequest), lhsLoadSDPaginationRequest, rhsLoadSDPaginationRequest, (leftObject.loadSDPaginationRequest!= null), (rightObject.loadSDPaginationRequest!= null)));
                    target.setLoadSDPaginationRequest(mergedLoadSDPaginationRequest);
                } else {
                    if (loadSDPaginationRequestShouldBeMergedAndSet == Boolean.FALSE) {
                        target.loadSDPaginationRequest = null;
                    }
                }
            }
        }
    }

}
