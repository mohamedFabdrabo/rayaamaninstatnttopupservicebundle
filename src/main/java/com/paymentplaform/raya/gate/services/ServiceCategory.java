
package com.paymentplaform.raya.gate.services;

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
 * <p>Java class for ServiceCategory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCategory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceCategoryAr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceCategoryEn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="services" type="{http://raya.paymentplaform.com/gate/services/}ServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceSubCategories" type="{http://raya.paymentplaform.com/gate/services/}ServiceCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCategory", namespace = "http://raya.paymentplaform.com/gate/services/", propOrder = {
    "serviceCategoryAr",
    "serviceCategoryEn",
    "services",
    "serviceSubCategories"
})
public class ServiceCategory implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(required = true)
    protected String serviceCategoryAr;
    @XmlElement(required = true)
    protected String serviceCategoryEn;
    protected List<ServiceType> services;
    @XmlElement(name = "ServiceSubCategories")
    protected List<ServiceCategory> serviceSubCategories;

    /**
     * Gets the value of the serviceCategoryAr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategoryAr() {
        return serviceCategoryAr;
    }

    /**
     * Sets the value of the serviceCategoryAr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategoryAr(String value) {
        this.serviceCategoryAr = value;
    }

    /**
     * Gets the value of the serviceCategoryEn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCategoryEn() {
        return serviceCategoryEn;
    }

    /**
     * Sets the value of the serviceCategoryEn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCategoryEn(String value) {
        this.serviceCategoryEn = value;
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
     * Gets the value of the serviceSubCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceSubCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceSubCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCategory }
     * 
     * 
     */
    public List<ServiceCategory> getServiceSubCategories() {
        if (serviceSubCategories == null) {
            serviceSubCategories = new ArrayList<ServiceCategory>();
        }
        return this.serviceSubCategories;
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
            String theServiceCategoryAr;
            theServiceCategoryAr = this.getServiceCategoryAr();
            strategy.appendField(locator, this, "serviceCategoryAr", buffer, theServiceCategoryAr, (this.serviceCategoryAr!= null));
        }
        {
            String theServiceCategoryEn;
            theServiceCategoryEn = this.getServiceCategoryEn();
            strategy.appendField(locator, this, "serviceCategoryEn", buffer, theServiceCategoryEn, (this.serviceCategoryEn!= null));
        }
        {
            List<ServiceType> theServices;
            theServices = (((this.services!= null)&&(!this.services.isEmpty()))?this.getServices():null);
            strategy.appendField(locator, this, "services", buffer, theServices, ((this.services!= null)&&(!this.services.isEmpty())));
        }
        {
            List<ServiceCategory> theServiceSubCategories;
            theServiceSubCategories = (((this.serviceSubCategories!= null)&&(!this.serviceSubCategories.isEmpty()))?this.getServiceSubCategories():null);
            strategy.appendField(locator, this, "serviceSubCategories", buffer, theServiceSubCategories, ((this.serviceSubCategories!= null)&&(!this.serviceSubCategories.isEmpty())));
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
        final ServiceCategory that = ((ServiceCategory) object);
        {
            String lhsServiceCategoryAr;
            lhsServiceCategoryAr = this.getServiceCategoryAr();
            String rhsServiceCategoryAr;
            rhsServiceCategoryAr = that.getServiceCategoryAr();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCategoryAr", lhsServiceCategoryAr), LocatorUtils.property(thatLocator, "serviceCategoryAr", rhsServiceCategoryAr), lhsServiceCategoryAr, rhsServiceCategoryAr, (this.serviceCategoryAr!= null), (that.serviceCategoryAr!= null))) {
                return false;
            }
        }
        {
            String lhsServiceCategoryEn;
            lhsServiceCategoryEn = this.getServiceCategoryEn();
            String rhsServiceCategoryEn;
            rhsServiceCategoryEn = that.getServiceCategoryEn();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCategoryEn", lhsServiceCategoryEn), LocatorUtils.property(thatLocator, "serviceCategoryEn", rhsServiceCategoryEn), lhsServiceCategoryEn, rhsServiceCategoryEn, (this.serviceCategoryEn!= null), (that.serviceCategoryEn!= null))) {
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
            List<ServiceCategory> lhsServiceSubCategories;
            lhsServiceSubCategories = (((this.serviceSubCategories!= null)&&(!this.serviceSubCategories.isEmpty()))?this.getServiceSubCategories():null);
            List<ServiceCategory> rhsServiceSubCategories;
            rhsServiceSubCategories = (((that.serviceSubCategories!= null)&&(!that.serviceSubCategories.isEmpty()))?that.getServiceSubCategories():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceSubCategories", lhsServiceSubCategories), LocatorUtils.property(thatLocator, "serviceSubCategories", rhsServiceSubCategories), lhsServiceSubCategories, rhsServiceSubCategories, ((this.serviceSubCategories!= null)&&(!this.serviceSubCategories.isEmpty())), ((that.serviceSubCategories!= null)&&(!that.serviceSubCategories.isEmpty())))) {
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
            String theServiceCategoryAr;
            theServiceCategoryAr = this.getServiceCategoryAr();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceCategoryAr", theServiceCategoryAr), currentHashCode, theServiceCategoryAr, (this.serviceCategoryAr!= null));
        }
        {
            String theServiceCategoryEn;
            theServiceCategoryEn = this.getServiceCategoryEn();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceCategoryEn", theServiceCategoryEn), currentHashCode, theServiceCategoryEn, (this.serviceCategoryEn!= null));
        }
        {
            List<ServiceType> theServices;
            theServices = (((this.services!= null)&&(!this.services.isEmpty()))?this.getServices():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "services", theServices), currentHashCode, theServices, ((this.services!= null)&&(!this.services.isEmpty())));
        }
        {
            List<ServiceCategory> theServiceSubCategories;
            theServiceSubCategories = (((this.serviceSubCategories!= null)&&(!this.serviceSubCategories.isEmpty()))?this.getServiceSubCategories():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceSubCategories", theServiceSubCategories), currentHashCode, theServiceSubCategories, ((this.serviceSubCategories!= null)&&(!this.serviceSubCategories.isEmpty())));
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
        if (draftCopy instanceof ServiceCategory) {
            final ServiceCategory copy = ((ServiceCategory) draftCopy);
            {
                Boolean serviceCategoryArShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceCategoryAr!= null));
                if (serviceCategoryArShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceServiceCategoryAr;
                    sourceServiceCategoryAr = this.getServiceCategoryAr();
                    String copyServiceCategoryAr = ((String) strategy.copy(LocatorUtils.property(locator, "serviceCategoryAr", sourceServiceCategoryAr), sourceServiceCategoryAr, (this.serviceCategoryAr!= null)));
                    copy.setServiceCategoryAr(copyServiceCategoryAr);
                } else {
                    if (serviceCategoryArShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceCategoryAr = null;
                    }
                }
            }
            {
                Boolean serviceCategoryEnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceCategoryEn!= null));
                if (serviceCategoryEnShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceServiceCategoryEn;
                    sourceServiceCategoryEn = this.getServiceCategoryEn();
                    String copyServiceCategoryEn = ((String) strategy.copy(LocatorUtils.property(locator, "serviceCategoryEn", sourceServiceCategoryEn), sourceServiceCategoryEn, (this.serviceCategoryEn!= null)));
                    copy.setServiceCategoryEn(copyServiceCategoryEn);
                } else {
                    if (serviceCategoryEnShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceCategoryEn = null;
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
                Boolean serviceSubCategoriesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.serviceSubCategories!= null)&&(!this.serviceSubCategories.isEmpty())));
                if (serviceSubCategoriesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ServiceCategory> sourceServiceSubCategories;
                    sourceServiceSubCategories = (((this.serviceSubCategories!= null)&&(!this.serviceSubCategories.isEmpty()))?this.getServiceSubCategories():null);
                    @SuppressWarnings("unchecked")
                    List<ServiceCategory> copyServiceSubCategories = ((List<ServiceCategory> ) strategy.copy(LocatorUtils.property(locator, "serviceSubCategories", sourceServiceSubCategories), sourceServiceSubCategories, ((this.serviceSubCategories!= null)&&(!this.serviceSubCategories.isEmpty()))));
                    copy.serviceSubCategories = null;
                    if (copyServiceSubCategories!= null) {
                        List<ServiceCategory> uniqueServiceSubCategoriesl = copy.getServiceSubCategories();
                        uniqueServiceSubCategoriesl.addAll(copyServiceSubCategories);
                    }
                } else {
                    if (serviceSubCategoriesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceSubCategories = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ServiceCategory();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ServiceCategory) {
            final ServiceCategory target = this;
            final ServiceCategory leftObject = ((ServiceCategory) left);
            final ServiceCategory rightObject = ((ServiceCategory) right);
            {
                Boolean serviceCategoryArShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceCategoryAr!= null), (rightObject.serviceCategoryAr!= null));
                if (serviceCategoryArShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsServiceCategoryAr;
                    lhsServiceCategoryAr = leftObject.getServiceCategoryAr();
                    String rhsServiceCategoryAr;
                    rhsServiceCategoryAr = rightObject.getServiceCategoryAr();
                    String mergedServiceCategoryAr = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceCategoryAr", lhsServiceCategoryAr), LocatorUtils.property(rightLocator, "serviceCategoryAr", rhsServiceCategoryAr), lhsServiceCategoryAr, rhsServiceCategoryAr, (leftObject.serviceCategoryAr!= null), (rightObject.serviceCategoryAr!= null)));
                    target.setServiceCategoryAr(mergedServiceCategoryAr);
                } else {
                    if (serviceCategoryArShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceCategoryAr = null;
                    }
                }
            }
            {
                Boolean serviceCategoryEnShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceCategoryEn!= null), (rightObject.serviceCategoryEn!= null));
                if (serviceCategoryEnShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsServiceCategoryEn;
                    lhsServiceCategoryEn = leftObject.getServiceCategoryEn();
                    String rhsServiceCategoryEn;
                    rhsServiceCategoryEn = rightObject.getServiceCategoryEn();
                    String mergedServiceCategoryEn = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceCategoryEn", lhsServiceCategoryEn), LocatorUtils.property(rightLocator, "serviceCategoryEn", rhsServiceCategoryEn), lhsServiceCategoryEn, rhsServiceCategoryEn, (leftObject.serviceCategoryEn!= null), (rightObject.serviceCategoryEn!= null)));
                    target.setServiceCategoryEn(mergedServiceCategoryEn);
                } else {
                    if (serviceCategoryEnShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceCategoryEn = null;
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
                Boolean serviceSubCategoriesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.serviceSubCategories!= null)&&(!leftObject.serviceSubCategories.isEmpty())), ((rightObject.serviceSubCategories!= null)&&(!rightObject.serviceSubCategories.isEmpty())));
                if (serviceSubCategoriesShouldBeMergedAndSet == Boolean.TRUE) {
                    List<ServiceCategory> lhsServiceSubCategories;
                    lhsServiceSubCategories = (((leftObject.serviceSubCategories!= null)&&(!leftObject.serviceSubCategories.isEmpty()))?leftObject.getServiceSubCategories():null);
                    List<ServiceCategory> rhsServiceSubCategories;
                    rhsServiceSubCategories = (((rightObject.serviceSubCategories!= null)&&(!rightObject.serviceSubCategories.isEmpty()))?rightObject.getServiceSubCategories():null);
                    List<ServiceCategory> mergedServiceSubCategories = ((List<ServiceCategory> ) strategy.merge(LocatorUtils.property(leftLocator, "serviceSubCategories", lhsServiceSubCategories), LocatorUtils.property(rightLocator, "serviceSubCategories", rhsServiceSubCategories), lhsServiceSubCategories, rhsServiceSubCategories, ((leftObject.serviceSubCategories!= null)&&(!leftObject.serviceSubCategories.isEmpty())), ((rightObject.serviceSubCategories!= null)&&(!rightObject.serviceSubCategories.isEmpty()))));
                    target.serviceSubCategories = null;
                    if (mergedServiceSubCategories!= null) {
                        List<ServiceCategory> uniqueServiceSubCategoriesl = target.getServiceSubCategories();
                        uniqueServiceSubCategoriesl.addAll(mergedServiceSubCategories);
                    }
                } else {
                    if (serviceSubCategoriesShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceSubCategories = null;
                    }
                }
            }
        }
    }

    public void setServices(List<ServiceType> value) {
        this.services = value;
    }

    public void setServiceSubCategories(List<ServiceCategory> value) {
        this.serviceSubCategories = value;
    }

}
