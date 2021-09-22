
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
 * <p>Java class for ServiceProviderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceProviderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SPCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SPName_BL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SPName_SL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Services" type="{http://raya.paymentplaform.com/gate/pagservice}ServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCategories" type="{http://raya.paymentplaform.com/gate/pagservice}ServiceCategory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceProviderType", namespace = "http://raya.paymentplaform.com/gate/pagservice", propOrder = {
    "id",
    "spCode",
    "spNameBL",
    "spNameSL",
    "services",
    "serviceCategories"
})
public class ServiceProviderType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "ID", required = true)
    protected String id;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

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
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID, (this.id!= null));
        }
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
        final ServiceProviderType that = ((ServiceProviderType) object);
        {
            String lhsID;
            lhsID = this.getID();
            String rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID, (this.id!= null), (that.id!= null))) {
                return false;
            }
        }
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
            String theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID, (this.id!= null));
        }
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
        if (draftCopy instanceof ServiceProviderType) {
            final ServiceProviderType copy = ((ServiceProviderType) draftCopy);
            {
                Boolean idShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.id!= null));
                if (idShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceID;
                    sourceID = this.getID();
                    String copyID = ((String) strategy.copy(LocatorUtils.property(locator, "id", sourceID), sourceID, (this.id!= null)));
                    copy.setID(copyID);
                } else {
                    if (idShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.id = null;
                    }
                }
            }
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
        return new ServiceProviderType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ServiceProviderType) {
            final ServiceProviderType target = this;
            final ServiceProviderType leftObject = ((ServiceProviderType) left);
            final ServiceProviderType rightObject = ((ServiceProviderType) right);
            {
                Boolean idShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.id!= null), (rightObject.id!= null));
                if (idShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsID;
                    lhsID = leftObject.getID();
                    String rhsID;
                    rhsID = rightObject.getID();
                    String mergedID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "id", lhsID), LocatorUtils.property(rightLocator, "id", rhsID), lhsID, rhsID, (leftObject.id!= null), (rightObject.id!= null)));
                    target.setID(mergedID);
                } else {
                    if (idShouldBeMergedAndSet == Boolean.FALSE) {
                        target.id = null;
                    }
                }
            }
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
