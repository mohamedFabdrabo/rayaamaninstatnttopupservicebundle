
package com.paymentplaform.raya.gate.pagservice;

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
 * <p>Java class for LoadSDPaginationResType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadSDPaginationResType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://raya.paymentplaform.com/gate}Status"/&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="more" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ServiceGroup" type="{http://raya.paymentplaform.com/gate/pagservice}ServiceGroupType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceProvider" type="{http://raya.paymentplaform.com/gate/pagservice}ServiceProviderType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCategories" type="{http://raya.paymentplaform.com/gate/pagservice}ServiceCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Services" type="{http://raya.paymentplaform.com/gate/pagservice}ServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="productCategories" type="{http://raya.paymentplaform.com/gate/pagservice}ProductCategoryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="serviceProduct" type="{http://raya.paymentplaform.com/gate/pagservice}serviceProductType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "LoadSDPaginationResType", namespace = "http://raya.paymentplaform.com/gate/pagservice", propOrder = {
    "status",
    "rqUID",
    "more",
    "serviceGroup",
    "serviceProviders",
    "serviceCategories",
    "services",
    "productCategories",
    "serviceProducts",
    "any"
})
public class LoadSDPaginationResType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Status", required = true)
    protected Status status;
    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    protected int more;
    @XmlElement(name = "ServiceGroup")
    protected ServiceGroupType serviceGroup;
    @XmlElement(name = "ServiceProvider")
    protected List<ServiceProviderType> serviceProviders;
    @XmlElement(name = "ServiceCategories")
    protected List<ServiceCategory> serviceCategories;
    @XmlElement(name = "Services")
    protected List<ServiceType> services;
    protected List<ProductCategoryType> productCategories;
    @XmlElement(name = "serviceProduct")
    protected List<ServiceProductType> serviceProducts;
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
     * Gets the value of the more property.
     * 
     */
    public int getMore() {
        return more;
    }

    /**
     * Sets the value of the more property.
     * 
     */
    public void setMore(int value) {
        this.more = value;
    }

    /**
     * Gets the value of the serviceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceGroupType }
     *     
     */
    public ServiceGroupType getServiceGroup() {
        return serviceGroup;
    }

    /**
     * Sets the value of the serviceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceGroupType }
     *     
     */
    public void setServiceGroup(ServiceGroupType value) {
        this.serviceGroup = value;
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
     * Gets the value of the productCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductCategoryType }
     * 
     * 
     */
    public List<ProductCategoryType> getProductCategories() {
        if (productCategories == null) {
            productCategories = new ArrayList<ProductCategoryType>();
        }
        return this.productCategories;
    }

    /**
     * Gets the value of the serviceProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceProductType }
     * 
     * 
     */
    public List<ServiceProductType> getServiceProducts() {
        if (serviceProducts == null) {
            serviceProducts = new ArrayList<ServiceProductType>();
        }
        return this.serviceProducts;
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
            int theMore;
            theMore = this.getMore();
            strategy.appendField(locator, this, "more", buffer, theMore, true);
        }
        {
            ServiceGroupType theServiceGroup;
            theServiceGroup = this.getServiceGroup();
            strategy.appendField(locator, this, "serviceGroup", buffer, theServiceGroup, (this.serviceGroup!= null));
        }
        {
            List<ServiceProviderType> theServiceProviders;
            theServiceProviders = (((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty()))?this.getServiceProviders():null);
            strategy.appendField(locator, this, "serviceProviders", buffer, theServiceProviders, ((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty())));
        }
        {
            List<ServiceCategory> theServiceCategories;
            theServiceCategories = (((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty()))?this.getServiceCategories():null);
            strategy.appendField(locator, this, "serviceCategories", buffer, theServiceCategories, ((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty())));
        }
        {
            List<ServiceType> theServices;
            theServices = (((this.services!= null)&&(!this.services.isEmpty()))?this.getServices():null);
            strategy.appendField(locator, this, "services", buffer, theServices, ((this.services!= null)&&(!this.services.isEmpty())));
        }
        {
            List<ProductCategoryType> theProductCategories;
            theProductCategories = (((this.productCategories!= null)&&(!this.productCategories.isEmpty()))?this.getProductCategories():null);
            strategy.appendField(locator, this, "productCategories", buffer, theProductCategories, ((this.productCategories!= null)&&(!this.productCategories.isEmpty())));
        }
        {
            List<ServiceProductType> theServiceProducts;
            theServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
            strategy.appendField(locator, this, "serviceProducts", buffer, theServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty())));
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
        final LoadSDPaginationResType that = ((LoadSDPaginationResType) object);
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
            int lhsMore;
            lhsMore = this.getMore();
            int rhsMore;
            rhsMore = that.getMore();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "more", lhsMore), LocatorUtils.property(thatLocator, "more", rhsMore), lhsMore, rhsMore, true, true)) {
                return false;
            }
        }
        {
            ServiceGroupType lhsServiceGroup;
            lhsServiceGroup = this.getServiceGroup();
            ServiceGroupType rhsServiceGroup;
            rhsServiceGroup = that.getServiceGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceGroup", lhsServiceGroup), LocatorUtils.property(thatLocator, "serviceGroup", rhsServiceGroup), lhsServiceGroup, rhsServiceGroup, (this.serviceGroup!= null), (that.serviceGroup!= null))) {
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
        {
            List<ServiceCategory> lhsServiceCategories;
            lhsServiceCategories = (((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty()))?this.getServiceCategories():null);
            List<ServiceCategory> rhsServiceCategories;
            rhsServiceCategories = (((that.serviceCategories!= null)&&(!that.serviceCategories.isEmpty()))?that.getServiceCategories():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCategories", lhsServiceCategories), LocatorUtils.property(thatLocator, "serviceCategories", rhsServiceCategories), lhsServiceCategories, rhsServiceCategories, ((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty())), ((that.serviceCategories!= null)&&(!that.serviceCategories.isEmpty())))) {
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
            List<ProductCategoryType> lhsProductCategories;
            lhsProductCategories = (((this.productCategories!= null)&&(!this.productCategories.isEmpty()))?this.getProductCategories():null);
            List<ProductCategoryType> rhsProductCategories;
            rhsProductCategories = (((that.productCategories!= null)&&(!that.productCategories.isEmpty()))?that.getProductCategories():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productCategories", lhsProductCategories), LocatorUtils.property(thatLocator, "productCategories", rhsProductCategories), lhsProductCategories, rhsProductCategories, ((this.productCategories!= null)&&(!this.productCategories.isEmpty())), ((that.productCategories!= null)&&(!that.productCategories.isEmpty())))) {
                return false;
            }
        }
        {
            List<ServiceProductType> lhsServiceProducts;
            lhsServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
            List<ServiceProductType> rhsServiceProducts;
            rhsServiceProducts = (((that.serviceProducts!= null)&&(!that.serviceProducts.isEmpty()))?that.getServiceProducts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceProducts", lhsServiceProducts), LocatorUtils.property(thatLocator, "serviceProducts", rhsServiceProducts), lhsServiceProducts, rhsServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty())), ((that.serviceProducts!= null)&&(!that.serviceProducts.isEmpty())))) {
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
            int theMore;
            theMore = this.getMore();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "more", theMore), currentHashCode, theMore, true);
        }
        {
            ServiceGroupType theServiceGroup;
            theServiceGroup = this.getServiceGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceGroup", theServiceGroup), currentHashCode, theServiceGroup, (this.serviceGroup!= null));
        }
        {
            List<ServiceProviderType> theServiceProviders;
            theServiceProviders = (((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty()))?this.getServiceProviders():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceProviders", theServiceProviders), currentHashCode, theServiceProviders, ((this.serviceProviders!= null)&&(!this.serviceProviders.isEmpty())));
        }
        {
            List<ServiceCategory> theServiceCategories;
            theServiceCategories = (((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty()))?this.getServiceCategories():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceCategories", theServiceCategories), currentHashCode, theServiceCategories, ((this.serviceCategories!= null)&&(!this.serviceCategories.isEmpty())));
        }
        {
            List<ServiceType> theServices;
            theServices = (((this.services!= null)&&(!this.services.isEmpty()))?this.getServices():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "services", theServices), currentHashCode, theServices, ((this.services!= null)&&(!this.services.isEmpty())));
        }
        {
            List<ProductCategoryType> theProductCategories;
            theProductCategories = (((this.productCategories!= null)&&(!this.productCategories.isEmpty()))?this.getProductCategories():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productCategories", theProductCategories), currentHashCode, theProductCategories, ((this.productCategories!= null)&&(!this.productCategories.isEmpty())));
        }
        {
            List<ServiceProductType> theServiceProducts;
            theServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceProducts", theServiceProducts), currentHashCode, theServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty())));
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
        if (draftCopy instanceof LoadSDPaginationResType) {
            final LoadSDPaginationResType copy = ((LoadSDPaginationResType) draftCopy);
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
                Boolean moreShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, true);
                if (moreShouldBeCopiedAndSet == Boolean.TRUE) {
                    int sourceMore;
                    sourceMore = this.getMore();
                    int copyMore = strategy.copy(LocatorUtils.property(locator, "more", sourceMore), sourceMore, true);
                    copy.setMore(copyMore);
                } else {
                    if (moreShouldBeCopiedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean serviceGroupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceGroup!= null));
                if (serviceGroupShouldBeCopiedAndSet == Boolean.TRUE) {
                    ServiceGroupType sourceServiceGroup;
                    sourceServiceGroup = this.getServiceGroup();
                    ServiceGroupType copyServiceGroup = ((ServiceGroupType) strategy.copy(LocatorUtils.property(locator, "serviceGroup", sourceServiceGroup), sourceServiceGroup, (this.serviceGroup!= null)));
                    copy.setServiceGroup(copyServiceGroup);
                } else {
                    if (serviceGroupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceGroup = null;
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
                Boolean productCategoriesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.productCategories!= null)&&(!this.productCategories.isEmpty())));
                if (productCategoriesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ProductCategoryType> sourceProductCategories;
                    sourceProductCategories = (((this.productCategories!= null)&&(!this.productCategories.isEmpty()))?this.getProductCategories():null);
                    @SuppressWarnings("unchecked")
                    List<ProductCategoryType> copyProductCategories = ((List<ProductCategoryType> ) strategy.copy(LocatorUtils.property(locator, "productCategories", sourceProductCategories), sourceProductCategories, ((this.productCategories!= null)&&(!this.productCategories.isEmpty()))));
                    copy.productCategories = null;
                    if (copyProductCategories!= null) {
                        List<ProductCategoryType> uniqueProductCategoriesl = copy.getProductCategories();
                        uniqueProductCategoriesl.addAll(copyProductCategories);
                    }
                } else {
                    if (productCategoriesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.productCategories = null;
                    }
                }
            }
            {
                Boolean serviceProductsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty())));
                if (serviceProductsShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ServiceProductType> sourceServiceProducts;
                    sourceServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
                    @SuppressWarnings("unchecked")
                    List<ServiceProductType> copyServiceProducts = ((List<ServiceProductType> ) strategy.copy(LocatorUtils.property(locator, "serviceProducts", sourceServiceProducts), sourceServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))));
                    copy.serviceProducts = null;
                    if (copyServiceProducts!= null) {
                        List<ServiceProductType> uniqueServiceProductsl = copy.getServiceProducts();
                        uniqueServiceProductsl.addAll(copyServiceProducts);
                    }
                } else {
                    if (serviceProductsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceProducts = null;
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
        return new LoadSDPaginationResType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof LoadSDPaginationResType) {
            final LoadSDPaginationResType target = this;
            final LoadSDPaginationResType leftObject = ((LoadSDPaginationResType) left);
            final LoadSDPaginationResType rightObject = ((LoadSDPaginationResType) right);
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
                Boolean moreShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, true, true);
                if (moreShouldBeMergedAndSet == Boolean.TRUE) {
                    int lhsMore;
                    lhsMore = leftObject.getMore();
                    int rhsMore;
                    rhsMore = rightObject.getMore();
                    int mergedMore = ((int) strategy.merge(LocatorUtils.property(leftLocator, "more", lhsMore), LocatorUtils.property(rightLocator, "more", rhsMore), lhsMore, rhsMore, true, true));
                    target.setMore(mergedMore);
                } else {
                    if (moreShouldBeMergedAndSet == Boolean.FALSE) {
                    }
                }
            }
            {
                Boolean serviceGroupShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceGroup!= null), (rightObject.serviceGroup!= null));
                if (serviceGroupShouldBeMergedAndSet == Boolean.TRUE) {
                    ServiceGroupType lhsServiceGroup;
                    lhsServiceGroup = leftObject.getServiceGroup();
                    ServiceGroupType rhsServiceGroup;
                    rhsServiceGroup = rightObject.getServiceGroup();
                    ServiceGroupType mergedServiceGroup = ((ServiceGroupType) strategy.merge(LocatorUtils.property(leftLocator, "serviceGroup", lhsServiceGroup), LocatorUtils.property(rightLocator, "serviceGroup", rhsServiceGroup), lhsServiceGroup, rhsServiceGroup, (leftObject.serviceGroup!= null), (rightObject.serviceGroup!= null)));
                    target.setServiceGroup(mergedServiceGroup);
                } else {
                    if (serviceGroupShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceGroup = null;
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
                Boolean productCategoriesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.productCategories!= null)&&(!leftObject.productCategories.isEmpty())), ((rightObject.productCategories!= null)&&(!rightObject.productCategories.isEmpty())));
                if (productCategoriesShouldBeMergedAndSet == Boolean.TRUE) {
                    List<ProductCategoryType> lhsProductCategories;
                    lhsProductCategories = (((leftObject.productCategories!= null)&&(!leftObject.productCategories.isEmpty()))?leftObject.getProductCategories():null);
                    List<ProductCategoryType> rhsProductCategories;
                    rhsProductCategories = (((rightObject.productCategories!= null)&&(!rightObject.productCategories.isEmpty()))?rightObject.getProductCategories():null);
                    List<ProductCategoryType> mergedProductCategories = ((List<ProductCategoryType> ) strategy.merge(LocatorUtils.property(leftLocator, "productCategories", lhsProductCategories), LocatorUtils.property(rightLocator, "productCategories", rhsProductCategories), lhsProductCategories, rhsProductCategories, ((leftObject.productCategories!= null)&&(!leftObject.productCategories.isEmpty())), ((rightObject.productCategories!= null)&&(!rightObject.productCategories.isEmpty()))));
                    target.productCategories = null;
                    if (mergedProductCategories!= null) {
                        List<ProductCategoryType> uniqueProductCategoriesl = target.getProductCategories();
                        uniqueProductCategoriesl.addAll(mergedProductCategories);
                    }
                } else {
                    if (productCategoriesShouldBeMergedAndSet == Boolean.FALSE) {
                        target.productCategories = null;
                    }
                }
            }
            {
                Boolean serviceProductsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.serviceProducts!= null)&&(!leftObject.serviceProducts.isEmpty())), ((rightObject.serviceProducts!= null)&&(!rightObject.serviceProducts.isEmpty())));
                if (serviceProductsShouldBeMergedAndSet == Boolean.TRUE) {
                    List<ServiceProductType> lhsServiceProducts;
                    lhsServiceProducts = (((leftObject.serviceProducts!= null)&&(!leftObject.serviceProducts.isEmpty()))?leftObject.getServiceProducts():null);
                    List<ServiceProductType> rhsServiceProducts;
                    rhsServiceProducts = (((rightObject.serviceProducts!= null)&&(!rightObject.serviceProducts.isEmpty()))?rightObject.getServiceProducts():null);
                    List<ServiceProductType> mergedServiceProducts = ((List<ServiceProductType> ) strategy.merge(LocatorUtils.property(leftLocator, "serviceProducts", lhsServiceProducts), LocatorUtils.property(rightLocator, "serviceProducts", rhsServiceProducts), lhsServiceProducts, rhsServiceProducts, ((leftObject.serviceProducts!= null)&&(!leftObject.serviceProducts.isEmpty())), ((rightObject.serviceProducts!= null)&&(!rightObject.serviceProducts.isEmpty()))));
                    target.serviceProducts = null;
                    if (mergedServiceProducts!= null) {
                        List<ServiceProductType> uniqueServiceProductsl = target.getServiceProducts();
                        uniqueServiceProductsl.addAll(mergedServiceProducts);
                    }
                } else {
                    if (serviceProductsShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceProducts = null;
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

    public void setServiceProviders(List<ServiceProviderType> value) {
        this.serviceProviders = value;
    }

    public void setServiceCategories(List<ServiceCategory> value) {
        this.serviceCategories = value;
    }

    public void setServices(List<ServiceType> value) {
        this.services = value;
    }

    public void setProductCategories(List<ProductCategoryType> value) {
        this.productCategories = value;
    }

    public void setServiceProducts(List<ServiceProductType> value) {
        this.serviceProducts = value;
    }

}
