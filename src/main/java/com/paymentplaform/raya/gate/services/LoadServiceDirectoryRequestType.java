
package com.paymentplaform.raya.gate.services;

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
 * <p>Java class for LoadServiceDirectoryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadServiceDirectoryRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoadServiceDirectoryRequest" type="{http://raya.paymentplaform.com/gate/services/}LoadServiceDirectoryReqType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadServiceDirectoryRequestType", namespace = "", propOrder = {
    "loadServiceDirectoryRequest"
})
public class LoadServiceDirectoryRequestType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "LoadServiceDirectoryRequest", required = true)
    protected LoadServiceDirectoryReqType loadServiceDirectoryRequest;

    /**
     * Gets the value of the loadServiceDirectoryRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoadServiceDirectoryReqType }
     *     
     */
    public LoadServiceDirectoryReqType getLoadServiceDirectoryRequest() {
        return loadServiceDirectoryRequest;
    }

    /**
     * Sets the value of the loadServiceDirectoryRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadServiceDirectoryReqType }
     *     
     */
    public void setLoadServiceDirectoryRequest(LoadServiceDirectoryReqType value) {
        this.loadServiceDirectoryRequest = value;
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
            LoadServiceDirectoryReqType theLoadServiceDirectoryRequest;
            theLoadServiceDirectoryRequest = this.getLoadServiceDirectoryRequest();
            strategy.appendField(locator, this, "loadServiceDirectoryRequest", buffer, theLoadServiceDirectoryRequest, (this.loadServiceDirectoryRequest!= null));
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
        final LoadServiceDirectoryRequestType that = ((LoadServiceDirectoryRequestType) object);
        {
            LoadServiceDirectoryReqType lhsLoadServiceDirectoryRequest;
            lhsLoadServiceDirectoryRequest = this.getLoadServiceDirectoryRequest();
            LoadServiceDirectoryReqType rhsLoadServiceDirectoryRequest;
            rhsLoadServiceDirectoryRequest = that.getLoadServiceDirectoryRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loadServiceDirectoryRequest", lhsLoadServiceDirectoryRequest), LocatorUtils.property(thatLocator, "loadServiceDirectoryRequest", rhsLoadServiceDirectoryRequest), lhsLoadServiceDirectoryRequest, rhsLoadServiceDirectoryRequest, (this.loadServiceDirectoryRequest!= null), (that.loadServiceDirectoryRequest!= null))) {
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
            LoadServiceDirectoryReqType theLoadServiceDirectoryRequest;
            theLoadServiceDirectoryRequest = this.getLoadServiceDirectoryRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loadServiceDirectoryRequest", theLoadServiceDirectoryRequest), currentHashCode, theLoadServiceDirectoryRequest, (this.loadServiceDirectoryRequest!= null));
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
        if (draftCopy instanceof LoadServiceDirectoryRequestType) {
            final LoadServiceDirectoryRequestType copy = ((LoadServiceDirectoryRequestType) draftCopy);
            {
                Boolean loadServiceDirectoryRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loadServiceDirectoryRequest!= null));
                if (loadServiceDirectoryRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadServiceDirectoryReqType sourceLoadServiceDirectoryRequest;
                    sourceLoadServiceDirectoryRequest = this.getLoadServiceDirectoryRequest();
                    LoadServiceDirectoryReqType copyLoadServiceDirectoryRequest = ((LoadServiceDirectoryReqType) strategy.copy(LocatorUtils.property(locator, "loadServiceDirectoryRequest", sourceLoadServiceDirectoryRequest), sourceLoadServiceDirectoryRequest, (this.loadServiceDirectoryRequest!= null)));
                    copy.setLoadServiceDirectoryRequest(copyLoadServiceDirectoryRequest);
                } else {
                    if (loadServiceDirectoryRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadServiceDirectoryRequest = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LoadServiceDirectoryRequestType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof LoadServiceDirectoryRequestType) {
            final LoadServiceDirectoryRequestType target = this;
            final LoadServiceDirectoryRequestType leftObject = ((LoadServiceDirectoryRequestType) left);
            final LoadServiceDirectoryRequestType rightObject = ((LoadServiceDirectoryRequestType) right);
            {
                Boolean loadServiceDirectoryRequestShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.loadServiceDirectoryRequest!= null), (rightObject.loadServiceDirectoryRequest!= null));
                if (loadServiceDirectoryRequestShouldBeMergedAndSet == Boolean.TRUE) {
                    LoadServiceDirectoryReqType lhsLoadServiceDirectoryRequest;
                    lhsLoadServiceDirectoryRequest = leftObject.getLoadServiceDirectoryRequest();
                    LoadServiceDirectoryReqType rhsLoadServiceDirectoryRequest;
                    rhsLoadServiceDirectoryRequest = rightObject.getLoadServiceDirectoryRequest();
                    LoadServiceDirectoryReqType mergedLoadServiceDirectoryRequest = ((LoadServiceDirectoryReqType) strategy.merge(LocatorUtils.property(leftLocator, "loadServiceDirectoryRequest", lhsLoadServiceDirectoryRequest), LocatorUtils.property(rightLocator, "loadServiceDirectoryRequest", rhsLoadServiceDirectoryRequest), lhsLoadServiceDirectoryRequest, rhsLoadServiceDirectoryRequest, (leftObject.loadServiceDirectoryRequest!= null), (rightObject.loadServiceDirectoryRequest!= null)));
                    target.setLoadServiceDirectoryRequest(mergedLoadServiceDirectoryRequest);
                } else {
                    if (loadServiceDirectoryRequestShouldBeMergedAndSet == Boolean.FALSE) {
                        target.loadServiceDirectoryRequest = null;
                    }
                }
            }
        }
    }

}
