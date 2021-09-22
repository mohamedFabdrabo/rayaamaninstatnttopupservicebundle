
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
 * <p>Java class for LoadServiceDirectoryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadServiceDirectoryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LoadServiceDirectoryResponse" type="{http://raya.paymentplaform.com/gate/services/}LoadServiceDirectoryResType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadServiceDirectoryResponseType", namespace = "http://raya.paymentplaform.com/gate/services/", propOrder = {
    "loadServiceDirectoryResponse"
})
public class LoadServiceDirectoryResponseType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "LoadServiceDirectoryResponse", required = true)
    protected LoadServiceDirectoryResType loadServiceDirectoryResponse;

    /**
     * Gets the value of the loadServiceDirectoryResponse property.
     * 
     * @return
     *     possible object is
     *     {@link LoadServiceDirectoryResType }
     *     
     */
    public LoadServiceDirectoryResType getLoadServiceDirectoryResponse() {
        return loadServiceDirectoryResponse;
    }

    /**
     * Sets the value of the loadServiceDirectoryResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadServiceDirectoryResType }
     *     
     */
    public void setLoadServiceDirectoryResponse(LoadServiceDirectoryResType value) {
        this.loadServiceDirectoryResponse = value;
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
            LoadServiceDirectoryResType theLoadServiceDirectoryResponse;
            theLoadServiceDirectoryResponse = this.getLoadServiceDirectoryResponse();
            strategy.appendField(locator, this, "loadServiceDirectoryResponse", buffer, theLoadServiceDirectoryResponse, (this.loadServiceDirectoryResponse!= null));
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
        final LoadServiceDirectoryResponseType that = ((LoadServiceDirectoryResponseType) object);
        {
            LoadServiceDirectoryResType lhsLoadServiceDirectoryResponse;
            lhsLoadServiceDirectoryResponse = this.getLoadServiceDirectoryResponse();
            LoadServiceDirectoryResType rhsLoadServiceDirectoryResponse;
            rhsLoadServiceDirectoryResponse = that.getLoadServiceDirectoryResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "loadServiceDirectoryResponse", lhsLoadServiceDirectoryResponse), LocatorUtils.property(thatLocator, "loadServiceDirectoryResponse", rhsLoadServiceDirectoryResponse), lhsLoadServiceDirectoryResponse, rhsLoadServiceDirectoryResponse, (this.loadServiceDirectoryResponse!= null), (that.loadServiceDirectoryResponse!= null))) {
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
            LoadServiceDirectoryResType theLoadServiceDirectoryResponse;
            theLoadServiceDirectoryResponse = this.getLoadServiceDirectoryResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "loadServiceDirectoryResponse", theLoadServiceDirectoryResponse), currentHashCode, theLoadServiceDirectoryResponse, (this.loadServiceDirectoryResponse!= null));
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
        if (draftCopy instanceof LoadServiceDirectoryResponseType) {
            final LoadServiceDirectoryResponseType copy = ((LoadServiceDirectoryResponseType) draftCopy);
            {
                Boolean loadServiceDirectoryResponseShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.loadServiceDirectoryResponse!= null));
                if (loadServiceDirectoryResponseShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadServiceDirectoryResType sourceLoadServiceDirectoryResponse;
                    sourceLoadServiceDirectoryResponse = this.getLoadServiceDirectoryResponse();
                    LoadServiceDirectoryResType copyLoadServiceDirectoryResponse = ((LoadServiceDirectoryResType) strategy.copy(LocatorUtils.property(locator, "loadServiceDirectoryResponse", sourceLoadServiceDirectoryResponse), sourceLoadServiceDirectoryResponse, (this.loadServiceDirectoryResponse!= null)));
                    copy.setLoadServiceDirectoryResponse(copyLoadServiceDirectoryResponse);
                } else {
                    if (loadServiceDirectoryResponseShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.loadServiceDirectoryResponse = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LoadServiceDirectoryResponseType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof LoadServiceDirectoryResponseType) {
            final LoadServiceDirectoryResponseType target = this;
            final LoadServiceDirectoryResponseType leftObject = ((LoadServiceDirectoryResponseType) left);
            final LoadServiceDirectoryResponseType rightObject = ((LoadServiceDirectoryResponseType) right);
            {
                Boolean loadServiceDirectoryResponseShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.loadServiceDirectoryResponse!= null), (rightObject.loadServiceDirectoryResponse!= null));
                if (loadServiceDirectoryResponseShouldBeMergedAndSet == Boolean.TRUE) {
                    LoadServiceDirectoryResType lhsLoadServiceDirectoryResponse;
                    lhsLoadServiceDirectoryResponse = leftObject.getLoadServiceDirectoryResponse();
                    LoadServiceDirectoryResType rhsLoadServiceDirectoryResponse;
                    rhsLoadServiceDirectoryResponse = rightObject.getLoadServiceDirectoryResponse();
                    LoadServiceDirectoryResType mergedLoadServiceDirectoryResponse = ((LoadServiceDirectoryResType) strategy.merge(LocatorUtils.property(leftLocator, "loadServiceDirectoryResponse", lhsLoadServiceDirectoryResponse), LocatorUtils.property(rightLocator, "loadServiceDirectoryResponse", rhsLoadServiceDirectoryResponse), lhsLoadServiceDirectoryResponse, rhsLoadServiceDirectoryResponse, (leftObject.loadServiceDirectoryResponse!= null), (rightObject.loadServiceDirectoryResponse!= null)));
                    target.setLoadServiceDirectoryResponse(mergedLoadServiceDirectoryResponse);
                } else {
                    if (loadServiceDirectoryResponseShouldBeMergedAndSet == Boolean.FALSE) {
                        target.loadServiceDirectoryResponse = null;
                    }
                }
            }
        }
    }

}
