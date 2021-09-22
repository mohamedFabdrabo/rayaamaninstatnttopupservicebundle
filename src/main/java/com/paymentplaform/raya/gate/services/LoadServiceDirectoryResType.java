
package com.paymentplaform.raya.gate.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.paymentplaform.raya.gate.Status;
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
import org.w3c.dom.Element;


/**
 * <p>Java class for LoadServiceDirectoryResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadServiceDirectoryResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://raya.paymentplaform.com/gate}Status"/&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceGroup"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ServiceGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="ServiceProvider" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SPCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="SPName_BL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="SPName_SL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Services" type="{http://raya.paymentplaform.com/gate/services/}ServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="ServiceCategories" type="{http://raya.paymentplaform.com/gate/services/}ServiceCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;any processContents='lax' namespace='RequestData' minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoadServiceDirectoryResType", namespace = "http://raya.paymentplaform.com/gate/services/", propOrder = {
    "status",
    "rqUID",
    "serviceGroup",
    "any"
})
public class LoadServiceDirectoryResType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "ServiceGroup", required = true)
    protected LoadServiceDirectoryResType.ServiceGroup serviceGroup;
    @XmlAnyElement
    protected Element any;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the rqUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqUID() {
        return rqUID;
    }

    /**
     * Sets the value of the rqUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRqUID(String value) {
        this.rqUID = value;
    }

    /**
     * Gets the value of the serviceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link LoadServiceDirectoryResType.ServiceGroup }
     *     
     */
    public LoadServiceDirectoryResType.ServiceGroup getServiceGroup() {
        return serviceGroup;
    }

    /**
     * Sets the value of the serviceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadServiceDirectoryResType.ServiceGroup }
     *     
     */
    public void setServiceGroup(LoadServiceDirectoryResType.ServiceGroup value) {
        this.serviceGroup = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     
     */
    public Element getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     
     */
    public void setAny(Element value) {
        this.any = value;
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
            Status theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus, (this.status!= null));
        }
        {
            String theRqUID;
            theRqUID = this.getRqUID();
            strategy.appendField(locator, this, "rqUID", buffer, theRqUID, (this.rqUID!= null));
        }
        {
            LoadServiceDirectoryResType.ServiceGroup theServiceGroup;
            theServiceGroup = this.getServiceGroup();
            strategy.appendField(locator, this, "serviceGroup", buffer, theServiceGroup, (this.serviceGroup!= null));
        }
        {
            Element theAny;
            theAny = this.getAny();
            strategy.appendField(locator, this, "any", buffer, theAny, (this.any!= null));
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
        final LoadServiceDirectoryResType that = ((LoadServiceDirectoryResType) object);
        {
            Status lhsStatus;
            lhsStatus = this.getStatus();
            Status rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, (this.status!= null), (that.status!= null))) {
                return false;
            }
        }
        {
            String lhsRqUID;
            lhsRqUID = this.getRqUID();
            String rhsRqUID;
            rhsRqUID = that.getRqUID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "rqUID", lhsRqUID), LocatorUtils.property(thatLocator, "rqUID", rhsRqUID), lhsRqUID, rhsRqUID, (this.rqUID!= null), (that.rqUID!= null))) {
                return false;
            }
        }
        {
            LoadServiceDirectoryResType.ServiceGroup lhsServiceGroup;
            lhsServiceGroup = this.getServiceGroup();
            LoadServiceDirectoryResType.ServiceGroup rhsServiceGroup;
            rhsServiceGroup = that.getServiceGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceGroup", lhsServiceGroup), LocatorUtils.property(thatLocator, "serviceGroup", rhsServiceGroup), lhsServiceGroup, rhsServiceGroup, (this.serviceGroup!= null), (that.serviceGroup!= null))) {
                return false;
            }
        }
        {
            Element lhsAny;
            lhsAny = this.getAny();
            Element rhsAny;
            rhsAny = that.getAny();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "any", lhsAny), LocatorUtils.property(thatLocator, "any", rhsAny), lhsAny, rhsAny, (this.any!= null), (that.any!= null))) {
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
            Status theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, (this.status!= null));
        }
        {
            String theRqUID;
            theRqUID = this.getRqUID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rqUID", theRqUID), currentHashCode, theRqUID, (this.rqUID!= null));
        }
        {
            LoadServiceDirectoryResType.ServiceGroup theServiceGroup;
            theServiceGroup = this.getServiceGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceGroup", theServiceGroup), currentHashCode, theServiceGroup, (this.serviceGroup!= null));
        }
        {
            Element theAny;
            theAny = this.getAny();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "any", theAny), currentHashCode, theAny, (this.any!= null));
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
        if (draftCopy instanceof LoadServiceDirectoryResType) {
            final LoadServiceDirectoryResType copy = ((LoadServiceDirectoryResType) draftCopy);
            {
                Boolean statusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.status!= null));
                if (statusShouldBeCopiedAndSet == Boolean.TRUE) {
                    Status sourceStatus;
                    sourceStatus = this.getStatus();
                    Status copyStatus = ((Status) strategy.copy(LocatorUtils.property(locator, "status", sourceStatus), sourceStatus, (this.status!= null)));
                    copy.setStatus(copyStatus);
                } else {
                    if (statusShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.status = null;
                    }
                }
            }
            {
                Boolean rqUIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.rqUID!= null));
                if (rqUIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRqUID;
                    sourceRqUID = this.getRqUID();
                    String copyRqUID = ((String) strategy.copy(LocatorUtils.property(locator, "rqUID", sourceRqUID), sourceRqUID, (this.rqUID!= null)));
                    copy.setRqUID(copyRqUID);
                } else {
                    if (rqUIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.rqUID = null;
                    }
                }
            }
            {
                Boolean serviceGroupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceGroup!= null));
                if (serviceGroupShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadServiceDirectoryResType.ServiceGroup sourceServiceGroup;
                    sourceServiceGroup = this.getServiceGroup();
                    LoadServiceDirectoryResType.ServiceGroup copyServiceGroup = ((LoadServiceDirectoryResType.ServiceGroup) strategy.copy(LocatorUtils.property(locator, "serviceGroup", sourceServiceGroup), sourceServiceGroup, (this.serviceGroup!= null)));
                    copy.setServiceGroup(copyServiceGroup);
                } else {
                    if (serviceGroupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceGroup = null;
                    }
                }
            }
            {
                Boolean anyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.any!= null));
                if (anyShouldBeCopiedAndSet == Boolean.TRUE) {
                    Element sourceAny;
                    sourceAny = this.getAny();
                    Element copyAny = ((Element) strategy.copy(LocatorUtils.property(locator, "any", sourceAny), sourceAny, (this.any!= null)));
                    copy.setAny(copyAny);
                } else {
                    if (anyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.any = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LoadServiceDirectoryResType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof LoadServiceDirectoryResType) {
            final LoadServiceDirectoryResType target = this;
            final LoadServiceDirectoryResType leftObject = ((LoadServiceDirectoryResType) left);
            final LoadServiceDirectoryResType rightObject = ((LoadServiceDirectoryResType) right);
            {
                Boolean statusShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.status!= null), (rightObject.status!= null));
                if (statusShouldBeMergedAndSet == Boolean.TRUE) {
                    Status lhsStatus;
                    lhsStatus = leftObject.getStatus();
                    Status rhsStatus;
                    rhsStatus = rightObject.getStatus();
                    Status mergedStatus = ((Status) strategy.merge(LocatorUtils.property(leftLocator, "status", lhsStatus), LocatorUtils.property(rightLocator, "status", rhsStatus), lhsStatus, rhsStatus, (leftObject.status!= null), (rightObject.status!= null)));
                    target.setStatus(mergedStatus);
                } else {
                    if (statusShouldBeMergedAndSet == Boolean.FALSE) {
                        target.status = null;
                    }
                }
            }
            {
                Boolean rqUIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.rqUID!= null), (rightObject.rqUID!= null));
                if (rqUIDShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsRqUID;
                    lhsRqUID = leftObject.getRqUID();
                    String rhsRqUID;
                    rhsRqUID = rightObject.getRqUID();
                    String mergedRqUID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "rqUID", lhsRqUID), LocatorUtils.property(rightLocator, "rqUID", rhsRqUID), lhsRqUID, rhsRqUID, (leftObject.rqUID!= null), (rightObject.rqUID!= null)));
                    target.setRqUID(mergedRqUID);
                } else {
                    if (rqUIDShouldBeMergedAndSet == Boolean.FALSE) {
                        target.rqUID = null;
                    }
                }
            }
            {
                Boolean serviceGroupShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceGroup!= null), (rightObject.serviceGroup!= null));
                if (serviceGroupShouldBeMergedAndSet == Boolean.TRUE) {
                    LoadServiceDirectoryResType.ServiceGroup lhsServiceGroup;
                    lhsServiceGroup = leftObject.getServiceGroup();
                    LoadServiceDirectoryResType.ServiceGroup rhsServiceGroup;
                    rhsServiceGroup = rightObject.getServiceGroup();
                    LoadServiceDirectoryResType.ServiceGroup mergedServiceGroup = ((LoadServiceDirectoryResType.ServiceGroup) strategy.merge(LocatorUtils.property(leftLocator, "serviceGroup", lhsServiceGroup), LocatorUtils.property(rightLocator, "serviceGroup", rhsServiceGroup), lhsServiceGroup, rhsServiceGroup, (leftObject.serviceGroup!= null), (rightObject.serviceGroup!= null)));
                    target.setServiceGroup(mergedServiceGroup);
                } else {
                    if (serviceGroupShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceGroup = null;
                    }
                }
            }
            {
                Boolean anyShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.any!= null), (rightObject.any!= null));
                if (anyShouldBeMergedAndSet == Boolean.TRUE) {
                    Element lhsAny;
                    lhsAny = leftObject.getAny();
                    Element rhsAny;
                    rhsAny = rightObject.getAny();
                    Element mergedAny = ((Element) strategy.merge(LocatorUtils.property(leftLocator, "any", lhsAny), LocatorUtils.property(rightLocator, "any", rhsAny), lhsAny, rhsAny, (leftObject.any!= null), (rightObject.any!= null)));
                    target.setAny(mergedAny);
                } else {
                    if (anyShouldBeMergedAndSet == Boolean.FALSE) {
                        target.any = null;
                    }
                }
            }
        }
    }


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
     *         &lt;element name="ServiceGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="ServiceProvider" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SPCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="SPName_BL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="SPName_SL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Services" type="{http://raya.paymentplaform.com/gate/services/}ServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="ServiceCategories" type="{http://raya.paymentplaform.com/gate/services/}ServiceCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "serviceGroupName",
        "serviceProviders"
    })
    public static class ServiceGroup implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "ServiceGroupName", required = true)
        protected String serviceGroupName;
        @XmlElement(name = "ServiceProvider", required = true)
        protected List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> serviceProviders;

        /**
         * Gets the value of the serviceGroupName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceGroupName() {
            return serviceGroupName;
        }

        /**
         * Sets the value of the serviceGroupName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceGroupName(String value) {
            this.serviceGroupName = value;
        }

        /**
         * Gets the value of the serviceProviders property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceProviders property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceProviders().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LoadServiceDirectoryResType.ServiceGroup.ServiceProvider }
         * 
         * 
         */
        public List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> getServiceProviders() {
            if (serviceProviders == null) {
                serviceProviders = new ArrayList<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider>();
            }
            return this.serviceProviders;
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
                String theServiceGroupName;
                theServiceGroupName = this.getServiceGroupName();
                strategy.appendField(locator, this, "serviceGroupName", buffer, theServiceGroupName, (this.serviceGroupName!= null));
            }
            {
                List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> theServiceProviders;
                theServiceProviders = (((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty()))?this.getServiceProviders():null);
                strategy.appendField(locator, this, "serviceProviders", buffer, theServiceProviders, ((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty())));
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
            final LoadServiceDirectoryResType.ServiceGroup that = ((LoadServiceDirectoryResType.ServiceGroup) object);
            {
                String lhsServiceGroupName;
                lhsServiceGroupName = this.getServiceGroupName();
                String rhsServiceGroupName;
                rhsServiceGroupName = that.getServiceGroupName();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceGroupName", lhsServiceGroupName), LocatorUtils.property(thatLocator, "serviceGroupName", rhsServiceGroupName), lhsServiceGroupName, rhsServiceGroupName, (this.serviceGroupName!= null), (that.serviceGroupName!= null))) {
                    return false;
                }
            }
            {
                List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> lhsServiceProviders;
                lhsServiceProviders = (((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty()))?this.getServiceProviders():null);
                List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> rhsServiceProviders;
                rhsServiceProviders = (((that.serviceProviders!= null)&&(!that.serviceProviders.isEmpty()))?that.getServiceProviders():null);
                if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceProviders", lhsServiceProviders), LocatorUtils.property(thatLocator, "serviceProviders", rhsServiceProviders), lhsServiceProviders, rhsServiceProviders, ((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty())), ((that.serviceProviders!= null)&&(!that.serviceProviders.isEmpty())))) {
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
                String theServiceGroupName;
                theServiceGroupName = this.getServiceGroupName();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceGroupName", theServiceGroupName), currentHashCode, theServiceGroupName, (this.serviceGroupName!= null));
            }
            {
                List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> theServiceProviders;
                theServiceProviders = (((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty()))?this.getServiceProviders():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceProviders", theServiceProviders), currentHashCode, theServiceProviders, ((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty())));
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
            if (draftCopy instanceof LoadServiceDirectoryResType.ServiceGroup) {
                final LoadServiceDirectoryResType.ServiceGroup copy = ((LoadServiceDirectoryResType.ServiceGroup) draftCopy);
                {
                    Boolean serviceGroupNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceGroupName!= null));
                    if (serviceGroupNameShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceServiceGroupName;
                        sourceServiceGroupName = this.getServiceGroupName();
                        String copyServiceGroupName = ((String) strategy.copy(LocatorUtils.property(locator, "serviceGroupName", sourceServiceGroupName), sourceServiceGroupName, (this.serviceGroupName!= null)));
                        copy.setServiceGroupName(copyServiceGroupName);
                    } else {
                        if (serviceGroupNameShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.serviceGroupName = null;
                        }
                    }
                }
                {
                    Boolean serviceProvidersShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty())));
                    if (serviceProvidersShouldBeCopiedAndSet == Boolean.TRUE) {
                        List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> sourceServiceProviders;
                        sourceServiceProviders = (((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty()))?this.getServiceProviders():null);
                        @SuppressWarnings("unchecked")
                        List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> copyServiceProviders = ((List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> ) strategy.copy(LocatorUtils.property(locator, "serviceProviders", sourceServiceProviders), sourceServiceProviders, ((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty()))));
                        copy.serviceProviders = null;
                        if (copyServiceProviders!= null) {
                            List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> uniqueServiceProvidersl = copy.getServiceProviders();
                            uniqueServiceProvidersl.addAll(copyServiceProviders);
                        }
                    } else {
                        if (serviceProvidersShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.serviceProviders = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new LoadServiceDirectoryResType.ServiceGroup();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof LoadServiceDirectoryResType.ServiceGroup) {
                final LoadServiceDirectoryResType.ServiceGroup target = this;
                final LoadServiceDirectoryResType.ServiceGroup leftObject = ((LoadServiceDirectoryResType.ServiceGroup) left);
                final LoadServiceDirectoryResType.ServiceGroup rightObject = ((LoadServiceDirectoryResType.ServiceGroup) right);
                {
                    Boolean serviceGroupNameShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceGroupName!= null), (rightObject.serviceGroupName!= null));
                    if (serviceGroupNameShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsServiceGroupName;
                        lhsServiceGroupName = leftObject.getServiceGroupName();
                        String rhsServiceGroupName;
                        rhsServiceGroupName = rightObject.getServiceGroupName();
                        String mergedServiceGroupName = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceGroupName", lhsServiceGroupName), LocatorUtils.property(rightLocator, "serviceGroupName", rhsServiceGroupName), lhsServiceGroupName, rhsServiceGroupName, (leftObject.serviceGroupName!= null), (rightObject.serviceGroupName!= null)));
                        target.setServiceGroupName(mergedServiceGroupName);
                    } else {
                        if (serviceGroupNameShouldBeMergedAndSet == Boolean.FALSE) {
                            target.serviceGroupName = null;
                        }
                    }
                }
                {
                    Boolean serviceProvidersShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.serviceProviders!= null)&&(!leftObject.serviceProviders.isEmpty())), ((rightObject.serviceProviders!= null)&&(!rightObject.serviceProviders.isEmpty())));
                    if (serviceProvidersShouldBeMergedAndSet == Boolean.TRUE) {
                        List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> lhsServiceProviders;
                        lhsServiceProviders = (((leftObject.serviceProviders!= null)&&(!leftObject.serviceProviders.isEmpty()))?leftObject.getServiceProviders():null);
                        List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> rhsServiceProviders;
                        rhsServiceProviders = (((rightObject.serviceProviders!= null)&&(!rightObject.serviceProviders.isEmpty()))?rightObject.getServiceProviders():null);
                        List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> mergedServiceProviders = ((List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> ) strategy.merge(LocatorUtils.property(leftLocator, "serviceProviders", lhsServiceProviders), LocatorUtils.property(rightLocator, "serviceProviders", rhsServiceProviders), lhsServiceProviders, rhsServiceProviders, ((leftObject.serviceProviders!= null)&&(!leftObject.serviceProviders.isEmpty())), ((rightObject.serviceProviders!= null)&&(!rightObject.serviceProviders.isEmpty()))));
                        target.serviceProviders = null;
                        if (mergedServiceProviders!= null) {
                            List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> uniqueServiceProvidersl = target.getServiceProviders();
                            uniqueServiceProvidersl.addAll(mergedServiceProviders);
                        }
                    } else {
                        if (serviceProvidersShouldBeMergedAndSet == Boolean.FALSE) {
                            target.serviceProviders = null;
                        }
                    }
                }
            }
        }

        public void setServiceProviders(List<LoadServiceDirectoryResType.ServiceGroup.ServiceProvider> value) {
            this.serviceProviders = value;
        }


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
         *         &lt;element name="SPCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="SPName_BL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="SPName_SL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Services" type="{http://raya.paymentplaform.com/gate/services/}ServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="ServiceCategories" type="{http://raya.paymentplaform.com/gate/services/}ServiceCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
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
            "spCode",
            "spNameBL",
            "spNameSL",
            "services",
            "serviceCategories"
        })
        public static class ServiceProvider implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            @XmlElement(name = "SPCode", required = true)
            protected String spCode;
            @XmlElement(name = "SPName_BL", required = true)
            protected String spNameBL;
            @XmlElement(name = "SPName_SL", required = true)
            protected String spNameSL;
            @XmlElement(name = "Services")
            protected List<ServiceType> services;
            @XmlElement(name = "ServiceCategories")
            protected List<ServiceCategory> serviceCategories;

            /**
             * Gets the value of the spCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPCode() {
                return spCode;
            }

            /**
             * Sets the value of the spCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPCode(String value) {
                this.spCode = value;
            }

            /**
             * Gets the value of the spNameBL property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNameBL() {
                return spNameBL;
            }

            /**
             * Sets the value of the spNameBL property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNameBL(String value) {
                this.spNameBL = value;
            }

            /**
             * Gets the value of the spNameSL property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSPNameSL() {
                return spNameSL;
            }

            /**
             * Sets the value of the spNameSL property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSPNameSL(String value) {
                this.spNameSL = value;
            }

            /**
             * Gets the value of the services property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the services property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServices().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ServiceType }
             * 
             * 
             */
            public List<ServiceType> getServices() {
                if (services == null) {
                    services = new ArrayList<ServiceType>();
                }
                return this.services;
            }

            /**
             * Gets the value of the serviceCategories property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceCategories property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceCategories().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ServiceCategory }
             * 
             * 
             */
            public List<ServiceCategory> getServiceCategories() {
                if (serviceCategories == null) {
                    serviceCategories = new ArrayList<ServiceCategory>();
                }
                return this.serviceCategories;
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
                    String theSPCode;
                    theSPCode = this.getSPCode();
                    strategy.appendField(locator, this, "spCode", buffer, theSPCode, (this.spCode!= null));
                }
                {
                    String theSPNameBL;
                    theSPNameBL = this.getSPNameBL();
                    strategy.appendField(locator, this, "spNameBL", buffer, theSPNameBL, (this.spNameBL!= null));
                }
                {
                    String theSPNameSL;
                    theSPNameSL = this.getSPNameSL();
                    strategy.appendField(locator, this, "spNameSL", buffer, theSPNameSL, (this.spNameSL!= null));
                }
                {
                    List<ServiceType> theServices;
                    theServices = (((this.services!= null)&&(!this.services.isEmpty()))?this.getServices():null);
                    strategy.appendField(locator, this, "services", buffer, theServices, ((this.services!= null)&&(!this.services.isEmpty())));
                }
                {
                    List<ServiceCategory> theServiceCategories;
                    theServiceCategories = (((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty()))?this.getServiceCategories():null);
                    strategy.appendField(locator, this, "serviceCategories", buffer, theServiceCategories, ((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty())));
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
                final LoadServiceDirectoryResType.ServiceGroup.ServiceProvider that = ((LoadServiceDirectoryResType.ServiceGroup.ServiceProvider) object);
                {
                    String lhsSPCode;
                    lhsSPCode = this.getSPCode();
                    String rhsSPCode;
                    rhsSPCode = that.getSPCode();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "spCode", lhsSPCode), LocatorUtils.property(thatLocator, "spCode", rhsSPCode), lhsSPCode, rhsSPCode, (this.spCode!= null), (that.spCode!= null))) {
                        return false;
                    }
                }
                {
                    String lhsSPNameBL;
                    lhsSPNameBL = this.getSPNameBL();
                    String rhsSPNameBL;
                    rhsSPNameBL = that.getSPNameBL();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "spNameBL", lhsSPNameBL), LocatorUtils.property(thatLocator, "spNameBL", rhsSPNameBL), lhsSPNameBL, rhsSPNameBL, (this.spNameBL!= null), (that.spNameBL!= null))) {
                        return false;
                    }
                }
                {
                    String lhsSPNameSL;
                    lhsSPNameSL = this.getSPNameSL();
                    String rhsSPNameSL;
                    rhsSPNameSL = that.getSPNameSL();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "spNameSL", lhsSPNameSL), LocatorUtils.property(thatLocator, "spNameSL", rhsSPNameSL), lhsSPNameSL, rhsSPNameSL, (this.spNameSL!= null), (that.spNameSL!= null))) {
                        return false;
                    }
                }
                {
                    List<ServiceType> lhsServices;
                    lhsServices = (((this.services!= null)&&(!this.services.isEmpty()))?this.getServices():null);
                    List<ServiceType> rhsServices;
                    rhsServices = (((that.services!= null)&&(!that.services.isEmpty()))?that.getServices():null);
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "services", lhsServices), LocatorUtils.property(thatLocator, "services", rhsServices), lhsServices, rhsServices, ((this.services!= null)&&(!this.services.isEmpty())), ((that.services!= null)&&(!that.services.isEmpty())))) {
                        return false;
                    }
                }
                {
                    List<ServiceCategory> lhsServiceCategories;
                    lhsServiceCategories = (((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty()))?this.getServiceCategories():null);
                    List<ServiceCategory> rhsServiceCategories;
                    rhsServiceCategories = (((that.serviceCategories!= null)&&(!that.serviceCategories.isEmpty()))?that.getServiceCategories():null);
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCategories", lhsServiceCategories), LocatorUtils.property(thatLocator, "serviceCategories", rhsServiceCategories), lhsServiceCategories, rhsServiceCategories, ((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty())), ((that.serviceCategories!= null)&&(!that.serviceCategories.isEmpty())))) {
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
                    String theSPCode;
                    theSPCode = this.getSPCode();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spCode", theSPCode), currentHashCode, theSPCode, (this.spCode!= null));
                }
                {
                    String theSPNameBL;
                    theSPNameBL = this.getSPNameBL();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spNameBL", theSPNameBL), currentHashCode, theSPNameBL, (this.spNameBL!= null));
                }
                {
                    String theSPNameSL;
                    theSPNameSL = this.getSPNameSL();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "spNameSL", theSPNameSL), currentHashCode, theSPNameSL, (this.spNameSL!= null));
                }
                {
                    List<ServiceType> theServices;
                    theServices = (((this.services!= null)&&(!this.services.isEmpty()))?this.getServices():null);
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "services", theServices), currentHashCode, theServices, ((this.services!= null)&&(!this.services.isEmpty())));
                }
                {
                    List<ServiceCategory> theServiceCategories;
                    theServiceCategories = (((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty()))?this.getServiceCategories():null);
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceCategories", theServiceCategories), currentHashCode, theServiceCategories, ((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty())));
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
                if (draftCopy instanceof LoadServiceDirectoryResType.ServiceGroup.ServiceProvider) {
                    final LoadServiceDirectoryResType.ServiceGroup.ServiceProvider copy = ((LoadServiceDirectoryResType.ServiceGroup.ServiceProvider) draftCopy);
                    {
                        Boolean spCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.spCode!= null));
                        if (spCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceSPCode;
                            sourceSPCode = this.getSPCode();
                            String copySPCode = ((String) strategy.copy(LocatorUtils.property(locator, "spCode", sourceSPCode), sourceSPCode, (this.spCode!= null)));
                            copy.setSPCode(copySPCode);
                        } else {
                            if (spCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.spCode = null;
                            }
                        }
                    }
                    {
                        Boolean spNameBLShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.spNameBL!= null));
                        if (spNameBLShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceSPNameBL;
                            sourceSPNameBL = this.getSPNameBL();
                            String copySPNameBL = ((String) strategy.copy(LocatorUtils.property(locator, "spNameBL", sourceSPNameBL), sourceSPNameBL, (this.spNameBL!= null)));
                            copy.setSPNameBL(copySPNameBL);
                        } else {
                            if (spNameBLShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.spNameBL = null;
                            }
                        }
                    }
                    {
                        Boolean spNameSLShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.spNameSL!= null));
                        if (spNameSLShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceSPNameSL;
                            sourceSPNameSL = this.getSPNameSL();
                            String copySPNameSL = ((String) strategy.copy(LocatorUtils.property(locator, "spNameSL", sourceSPNameSL), sourceSPNameSL, (this.spNameSL!= null)));
                            copy.setSPNameSL(copySPNameSL);
                        } else {
                            if (spNameSLShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.spNameSL = null;
                            }
                        }
                    }
                    {
                        Boolean servicesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.services!= null)&&(!this.services.isEmpty())));
                        if (servicesShouldBeCopiedAndSet == Boolean.TRUE) {
                            List<ServiceType> sourceServices;
                            sourceServices = (((this.services!= null)&&(!this.services.isEmpty()))?this.getServices():null);
                            @SuppressWarnings("unchecked")
                            List<ServiceType> copyServices = ((List<ServiceType> ) strategy.copy(LocatorUtils.property(locator, "services", sourceServices), sourceServices, ((this.services!= null)&&(!this.services.isEmpty()))));
                            copy.services = null;
                            if (copyServices!= null) {
                                List<ServiceType> uniqueServicesl = copy.getServices();
                                uniqueServicesl.addAll(copyServices);
                            }
                        } else {
                            if (servicesShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.services = null;
                            }
                        }
                    }
                    {
                        Boolean serviceCategoriesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty())));
                        if (serviceCategoriesShouldBeCopiedAndSet == Boolean.TRUE) {
                            List<ServiceCategory> sourceServiceCategories;
                            sourceServiceCategories = (((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty()))?this.getServiceCategories():null);
                            @SuppressWarnings("unchecked")
                            List<ServiceCategory> copyServiceCategories = ((List<ServiceCategory> ) strategy.copy(LocatorUtils.property(locator, "serviceCategories", sourceServiceCategories), sourceServiceCategories, ((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty()))));
                            copy.serviceCategories = null;
                            if (copyServiceCategories!= null) {
                                List<ServiceCategory> uniqueServiceCategoriesl = copy.getServiceCategories();
                                uniqueServiceCategoriesl.addAll(copyServiceCategories);
                            }
                        } else {
                            if (serviceCategoriesShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.serviceCategories = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new LoadServiceDirectoryResType.ServiceGroup.ServiceProvider();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof LoadServiceDirectoryResType.ServiceGroup.ServiceProvider) {
                    final LoadServiceDirectoryResType.ServiceGroup.ServiceProvider target = this;
                    final LoadServiceDirectoryResType.ServiceGroup.ServiceProvider leftObject = ((LoadServiceDirectoryResType.ServiceGroup.ServiceProvider) left);
                    final LoadServiceDirectoryResType.ServiceGroup.ServiceProvider rightObject = ((LoadServiceDirectoryResType.ServiceGroup.ServiceProvider) right);
                    {
                        Boolean spCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.spCode!= null), (rightObject.spCode!= null));
                        if (spCodeShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsSPCode;
                            lhsSPCode = leftObject.getSPCode();
                            String rhsSPCode;
                            rhsSPCode = rightObject.getSPCode();
                            String mergedSPCode = ((String) strategy.merge(LocatorUtils.property(leftLocator, "spCode", lhsSPCode), LocatorUtils.property(rightLocator, "spCode", rhsSPCode), lhsSPCode, rhsSPCode, (leftObject.spCode!= null), (rightObject.spCode!= null)));
                            target.setSPCode(mergedSPCode);
                        } else {
                            if (spCodeShouldBeMergedAndSet == Boolean.FALSE) {
                                target.spCode = null;
                            }
                        }
                    }
                    {
                        Boolean spNameBLShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.spNameBL!= null), (rightObject.spNameBL!= null));
                        if (spNameBLShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsSPNameBL;
                            lhsSPNameBL = leftObject.getSPNameBL();
                            String rhsSPNameBL;
                            rhsSPNameBL = rightObject.getSPNameBL();
                            String mergedSPNameBL = ((String) strategy.merge(LocatorUtils.property(leftLocator, "spNameBL", lhsSPNameBL), LocatorUtils.property(rightLocator, "spNameBL", rhsSPNameBL), lhsSPNameBL, rhsSPNameBL, (leftObject.spNameBL!= null), (rightObject.spNameBL!= null)));
                            target.setSPNameBL(mergedSPNameBL);
                        } else {
                            if (spNameBLShouldBeMergedAndSet == Boolean.FALSE) {
                                target.spNameBL = null;
                            }
                        }
                    }
                    {
                        Boolean spNameSLShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.spNameSL!= null), (rightObject.spNameSL!= null));
                        if (spNameSLShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsSPNameSL;
                            lhsSPNameSL = leftObject.getSPNameSL();
                            String rhsSPNameSL;
                            rhsSPNameSL = rightObject.getSPNameSL();
                            String mergedSPNameSL = ((String) strategy.merge(LocatorUtils.property(leftLocator, "spNameSL", lhsSPNameSL), LocatorUtils.property(rightLocator, "spNameSL", rhsSPNameSL), lhsSPNameSL, rhsSPNameSL, (leftObject.spNameSL!= null), (rightObject.spNameSL!= null)));
                            target.setSPNameSL(mergedSPNameSL);
                        } else {
                            if (spNameSLShouldBeMergedAndSet == Boolean.FALSE) {
                                target.spNameSL = null;
                            }
                        }
                    }
                    {
                        Boolean servicesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.services!= null)&&(!leftObject.services.isEmpty())), ((rightObject.services!= null)&&(!rightObject.services.isEmpty())));
                        if (servicesShouldBeMergedAndSet == Boolean.TRUE) {
                            List<ServiceType> lhsServices;
                            lhsServices = (((leftObject.services!= null)&&(!leftObject.services.isEmpty()))?leftObject.getServices():null);
                            List<ServiceType> rhsServices;
                            rhsServices = (((rightObject.services!= null)&&(!rightObject.services.isEmpty()))?rightObject.getServices():null);
                            List<ServiceType> mergedServices = ((List<ServiceType> ) strategy.merge(LocatorUtils.property(leftLocator, "services", lhsServices), LocatorUtils.property(rightLocator, "services", rhsServices), lhsServices, rhsServices, ((leftObject.services!= null)&&(!leftObject.services.isEmpty())), ((rightObject.services!= null)&&(!rightObject.services.isEmpty()))));
                            target.services = null;
                            if (mergedServices!= null) {
                                List<ServiceType> uniqueServicesl = target.getServices();
                                uniqueServicesl.addAll(mergedServices);
                            }
                        } else {
                            if (servicesShouldBeMergedAndSet == Boolean.FALSE) {
                                target.services = null;
                            }
                        }
                    }
                    {
                        Boolean serviceCategoriesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.serviceCategories!= null)&&(!leftObject.serviceCategories.isEmpty())), ((rightObject.serviceCategories!= null)&&(!rightObject.serviceCategories.isEmpty())));
                        if (serviceCategoriesShouldBeMergedAndSet == Boolean.TRUE) {
                            List<ServiceCategory> lhsServiceCategories;
                            lhsServiceCategories = (((leftObject.serviceCategories!= null)&&(!leftObject.serviceCategories.isEmpty()))?leftObject.getServiceCategories():null);
                            List<ServiceCategory> rhsServiceCategories;
                            rhsServiceCategories = (((rightObject.serviceCategories!= null)&&(!rightObject.serviceCategories.isEmpty()))?rightObject.getServiceCategories():null);
                            List<ServiceCategory> mergedServiceCategories = ((List<ServiceCategory> ) strategy.merge(LocatorUtils.property(leftLocator, "serviceCategories", lhsServiceCategories), LocatorUtils.property(rightLocator, "serviceCategories", rhsServiceCategories), lhsServiceCategories, rhsServiceCategories, ((leftObject.serviceCategories!= null)&&(!leftObject.serviceCategories.isEmpty())), ((rightObject.serviceCategories!= null)&&(!rightObject.serviceCategories.isEmpty()))));
                            target.serviceCategories = null;
                            if (mergedServiceCategories!= null) {
                                List<ServiceCategory> uniqueServiceCategoriesl = target.getServiceCategories();
                                uniqueServiceCategoriesl.addAll(mergedServiceCategories);
                            }
                        } else {
                            if (serviceCategoriesShouldBeMergedAndSet == Boolean.FALSE) {
                                target.serviceCategories = null;
                            }
                        }
                    }
                }
            }

            public void setServices(List<ServiceType> value) {
                this.services = value;
            }

            public void setServiceCategories(List<ServiceCategory> value) {
                this.serviceCategories = value;
            }

        }

    }

}
