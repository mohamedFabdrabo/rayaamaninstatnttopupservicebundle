
package com.paymentplaform.raya.gate.pagservice;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for ServiceGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceProvider" type="{http://raya.paymentplaform.com/gate/pagservice}ServiceProviderType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceGroupType", namespace = "http://raya.paymentplaform.com/gate/pagservice", propOrder = {
    "serviceGroupName",
    "serviceProviders"
})
public class ServiceGroupType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "ServiceGroupName", required = true)
    protected String serviceGroupName;
    @XmlElement(name = "ServiceProvider", required = true)
    protected List<ServiceProviderType> serviceProviders;

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
     * {@link ServiceProviderType }
     * 
     * 
     */
    public List<ServiceProviderType> getServiceProviders() {
        if (serviceProviders == null) {
            serviceProviders = new ArrayList<ServiceProviderType>();
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
            List<ServiceProviderType> theServiceProviders;
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
        final ServiceGroupType that = ((ServiceGroupType) object);
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
            List<ServiceProviderType> lhsServiceProviders;
            lhsServiceProviders = (((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty()))?this.getServiceProviders():null);
            List<ServiceProviderType> rhsServiceProviders;
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
            List<ServiceProviderType> theServiceProviders;
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
        if (draftCopy instanceof ServiceGroupType) {
            final ServiceGroupType copy = ((ServiceGroupType) draftCopy);
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
                    List<ServiceProviderType> sourceServiceProviders;
                    sourceServiceProviders = (((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty()))?this.getServiceProviders():null);
                    @SuppressWarnings("unchecked")
                    List<ServiceProviderType> copyServiceProviders = ((List<ServiceProviderType> ) strategy.copy(LocatorUtils.property(locator, "serviceProviders", sourceServiceProviders), sourceServiceProviders, ((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty()))));
                    copy.serviceProviders = null;
                    if (copyServiceProviders!= null) {
                        List<ServiceProviderType> uniqueServiceProvidersl = copy.getServiceProviders();
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
        return new ServiceGroupType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ServiceGroupType) {
            final ServiceGroupType target = this;
            final ServiceGroupType leftObject = ((ServiceGroupType) left);
            final ServiceGroupType rightObject = ((ServiceGroupType) right);
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
                    List<ServiceProviderType> lhsServiceProviders;
                    lhsServiceProviders = (((leftObject.serviceProviders!= null)&&(!leftObject.serviceProviders.isEmpty()))?leftObject.getServiceProviders():null);
                    List<ServiceProviderType> rhsServiceProviders;
                    rhsServiceProviders = (((rightObject.serviceProviders!= null)&&(!rightObject.serviceProviders.isEmpty()))?rightObject.getServiceProviders():null);
                    List<ServiceProviderType> mergedServiceProviders = ((List<ServiceProviderType> ) strategy.merge(LocatorUtils.property(leftLocator, "serviceProviders", lhsServiceProviders), LocatorUtils.property(rightLocator, "serviceProviders", rhsServiceProviders), lhsServiceProviders, rhsServiceProviders, ((leftObject.serviceProviders!= null)&&(!leftObject.serviceProviders.isEmpty())), ((rightObject.serviceProviders!= null)&&(!rightObject.serviceProviders.isEmpty()))));
                    target.serviceProviders = null;
                    if (mergedServiceProviders!= null) {
                        List<ServiceProviderType> uniqueServiceProvidersl = target.getServiceProviders();
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

    public void setServiceProviders(List<ServiceProviderType> value) {
        this.serviceProviders = value;
    }

}
