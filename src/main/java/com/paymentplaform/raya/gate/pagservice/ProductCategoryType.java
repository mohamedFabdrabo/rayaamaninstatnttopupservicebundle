
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
 * <p>Java class for ProductCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCategoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="category"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="productCategory_BL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="productCategory_SL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="serviceProduct" type="{http://raya.paymentplaform.com/gate/pagservice}serviceProductType" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="productSubcategory" type="{http://raya.paymentplaform.com/gate/pagservice}ProductCategoryType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductCategoryType", namespace = "http://raya.paymentplaform.com/gate/pagservice", propOrder = {
    "category"
})
public class ProductCategoryType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(required = true)
    protected ProductCategoryType.Category category;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link ProductCategoryType.Category }
     *     
     */
    public ProductCategoryType.Category getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductCategoryType.Category }
     *     
     */
    public void setCategory(ProductCategoryType.Category value) {
        this.category = value;
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
            ProductCategoryType.Category theCategory;
            theCategory = this.getCategory();
            strategy.appendField(locator, this, "category", buffer, theCategory, (this.category!= null));
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
        final ProductCategoryType that = ((ProductCategoryType) object);
        {
            ProductCategoryType.Category lhsCategory;
            lhsCategory = this.getCategory();
            ProductCategoryType.Category rhsCategory;
            rhsCategory = that.getCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "category", lhsCategory), LocatorUtils.property(thatLocator, "category", rhsCategory), lhsCategory, rhsCategory, (this.category!= null), (that.category!= null))) {
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
            ProductCategoryType.Category theCategory;
            theCategory = this.getCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "category", theCategory), currentHashCode, theCategory, (this.category!= null));
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
        if (draftCopy instanceof ProductCategoryType) {
            final ProductCategoryType copy = ((ProductCategoryType) draftCopy);
            {
                Boolean categoryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.category!= null));
                if (categoryShouldBeCopiedAndSet == Boolean.TRUE) {
                    ProductCategoryType.Category sourceCategory;
                    sourceCategory = this.getCategory();
                    ProductCategoryType.Category copyCategory = ((ProductCategoryType.Category) strategy.copy(LocatorUtils.property(locator, "category", sourceCategory), sourceCategory, (this.category!= null)));
                    copy.setCategory(copyCategory);
                } else {
                    if (categoryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.category = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ProductCategoryType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ProductCategoryType) {
            final ProductCategoryType target = this;
            final ProductCategoryType leftObject = ((ProductCategoryType) left);
            final ProductCategoryType rightObject = ((ProductCategoryType) right);
            {
                Boolean categoryShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.category!= null), (rightObject.category!= null));
                if (categoryShouldBeMergedAndSet == Boolean.TRUE) {
                    ProductCategoryType.Category lhsCategory;
                    lhsCategory = leftObject.getCategory();
                    ProductCategoryType.Category rhsCategory;
                    rhsCategory = rightObject.getCategory();
                    ProductCategoryType.Category mergedCategory = ((ProductCategoryType.Category) strategy.merge(LocatorUtils.property(leftLocator, "category", lhsCategory), LocatorUtils.property(rightLocator, "category", rhsCategory), lhsCategory, rhsCategory, (leftObject.category!= null), (rightObject.category!= null)));
                    target.setCategory(mergedCategory);
                } else {
                    if (categoryShouldBeMergedAndSet == Boolean.FALSE) {
                        target.category = null;
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
     *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="productCategory_BL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="productCategory_SL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="serviceProduct" type="{http://raya.paymentplaform.com/gate/pagservice}serviceProductType" maxOccurs="unbounded"/&gt;
     *         &lt;element name="productSubcategory" type="{http://raya.paymentplaform.com/gate/pagservice}ProductCategoryType" minOccurs="0"/&gt;
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
        "id",
        "productCategoryBL",
        "productCategorySL",
        "serviceProducts",
        "productSubcategory"
    })
    public static class Category implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "ID", required = true)
        protected String id;
        @XmlElement(name = "productCategory_BL", required = true)
        protected String productCategoryBL;
        @XmlElement(name = "productCategory_SL", required = true)
        protected Object productCategorySL;
        @XmlElement(name = "serviceProduct", required = true)
        protected List<ServiceProductType> serviceProducts;
        protected ProductCategoryType productSubcategory;

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
         * Gets the value of the productCategoryBL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductCategoryBL() {
            return productCategoryBL;
        }

        /**
         * Sets the value of the productCategoryBL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductCategoryBL(String value) {
            this.productCategoryBL = value;
        }

        /**
         * Gets the value of the productCategorySL property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getProductCategorySL() {
            return productCategorySL;
        }

        /**
         * Sets the value of the productCategorySL property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setProductCategorySL(Object value) {
            this.productCategorySL = value;
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
         * Gets the value of the productSubcategory property.
         * 
         * @return
         *     possible object is
         *     {@link ProductCategoryType }
         *     
         */
        public ProductCategoryType getProductSubcategory() {
            return productSubcategory;
        }

        /**
         * Sets the value of the productSubcategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProductCategoryType }
         *     
         */
        public void setProductSubcategory(ProductCategoryType value) {
            this.productSubcategory = value;
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
                String theProductCategoryBL;
                theProductCategoryBL = this.getProductCategoryBL();
                strategy.appendField(locator, this, "productCategoryBL", buffer, theProductCategoryBL, (this.productCategoryBL!= null));
            }
            {
                Object theProductCategorySL;
                theProductCategorySL = this.getProductCategorySL();
                strategy.appendField(locator, this, "productCategorySL", buffer, theProductCategorySL, (this.productCategorySL!= null));
            }
            {
                List<ServiceProductType> theServiceProducts;
                theServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
                strategy.appendField(locator, this, "serviceProducts", buffer, theServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty())));
            }
            {
                ProductCategoryType theProductSubcategory;
                theProductSubcategory = this.getProductSubcategory();
                strategy.appendField(locator, this, "productSubcategory", buffer, theProductSubcategory, (this.productSubcategory!= null));
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
            final ProductCategoryType.Category that = ((ProductCategoryType.Category) object);
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
                String lhsProductCategoryBL;
                lhsProductCategoryBL = this.getProductCategoryBL();
                String rhsProductCategoryBL;
                rhsProductCategoryBL = that.getProductCategoryBL();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "productCategoryBL", lhsProductCategoryBL), LocatorUtils.property(thatLocator, "productCategoryBL", rhsProductCategoryBL), lhsProductCategoryBL, rhsProductCategoryBL, (this.productCategoryBL!= null), (that.productCategoryBL!= null))) {
                    return false;
                }
            }
            {
                Object lhsProductCategorySL;
                lhsProductCategorySL = this.getProductCategorySL();
                Object rhsProductCategorySL;
                rhsProductCategorySL = that.getProductCategorySL();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "productCategorySL", lhsProductCategorySL), LocatorUtils.property(thatLocator, "productCategorySL", rhsProductCategorySL), lhsProductCategorySL, rhsProductCategorySL, (this.productCategorySL!= null), (that.productCategorySL!= null))) {
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
                ProductCategoryType lhsProductSubcategory;
                lhsProductSubcategory = this.getProductSubcategory();
                ProductCategoryType rhsProductSubcategory;
                rhsProductSubcategory = that.getProductSubcategory();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "productSubcategory", lhsProductSubcategory), LocatorUtils.property(thatLocator, "productSubcategory", rhsProductSubcategory), lhsProductSubcategory, rhsProductSubcategory, (this.productSubcategory!= null), (that.productSubcategory!= null))) {
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
                String theProductCategoryBL;
                theProductCategoryBL = this.getProductCategoryBL();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productCategoryBL", theProductCategoryBL), currentHashCode, theProductCategoryBL, (this.productCategoryBL!= null));
            }
            {
                Object theProductCategorySL;
                theProductCategorySL = this.getProductCategorySL();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productCategorySL", theProductCategorySL), currentHashCode, theProductCategorySL, (this.productCategorySL!= null));
            }
            {
                List<ServiceProductType> theServiceProducts;
                theServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceProducts", theServiceProducts), currentHashCode, theServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty())));
            }
            {
                ProductCategoryType theProductSubcategory;
                theProductSubcategory = this.getProductSubcategory();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productSubcategory", theProductSubcategory), currentHashCode, theProductSubcategory, (this.productSubcategory!= null));
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
            if (draftCopy instanceof ProductCategoryType.Category) {
                final ProductCategoryType.Category copy = ((ProductCategoryType.Category) draftCopy);
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
                    Boolean productCategoryBLShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productCategoryBL!= null));
                    if (productCategoryBLShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceProductCategoryBL;
                        sourceProductCategoryBL = this.getProductCategoryBL();
                        String copyProductCategoryBL = ((String) strategy.copy(LocatorUtils.property(locator, "productCategoryBL", sourceProductCategoryBL), sourceProductCategoryBL, (this.productCategoryBL!= null)));
                        copy.setProductCategoryBL(copyProductCategoryBL);
                    } else {
                        if (productCategoryBLShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.productCategoryBL = null;
                        }
                    }
                }
                {
                    Boolean productCategorySLShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productCategorySL!= null));
                    if (productCategorySLShouldBeCopiedAndSet == Boolean.TRUE) {
                        Object sourceProductCategorySL;
                        sourceProductCategorySL = this.getProductCategorySL();
                        Object copyProductCategorySL = ((Object) strategy.copy(LocatorUtils.property(locator, "productCategorySL", sourceProductCategorySL), sourceProductCategorySL, (this.productCategorySL!= null)));
                        copy.setProductCategorySL(copyProductCategorySL);
                    } else {
                        if (productCategorySLShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.productCategorySL = null;
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
                    Boolean productSubcategoryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productSubcategory!= null));
                    if (productSubcategoryShouldBeCopiedAndSet == Boolean.TRUE) {
                        ProductCategoryType sourceProductSubcategory;
                        sourceProductSubcategory = this.getProductSubcategory();
                        ProductCategoryType copyProductSubcategory = ((ProductCategoryType) strategy.copy(LocatorUtils.property(locator, "productSubcategory", sourceProductSubcategory), sourceProductSubcategory, (this.productSubcategory!= null)));
                        copy.setProductSubcategory(copyProductSubcategory);
                    } else {
                        if (productSubcategoryShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.productSubcategory = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ProductCategoryType.Category();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ProductCategoryType.Category) {
                final ProductCategoryType.Category target = this;
                final ProductCategoryType.Category leftObject = ((ProductCategoryType.Category) left);
                final ProductCategoryType.Category rightObject = ((ProductCategoryType.Category) right);
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
                    Boolean productCategoryBLShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productCategoryBL!= null), (rightObject.productCategoryBL!= null));
                    if (productCategoryBLShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsProductCategoryBL;
                        lhsProductCategoryBL = leftObject.getProductCategoryBL();
                        String rhsProductCategoryBL;
                        rhsProductCategoryBL = rightObject.getProductCategoryBL();
                        String mergedProductCategoryBL = ((String) strategy.merge(LocatorUtils.property(leftLocator, "productCategoryBL", lhsProductCategoryBL), LocatorUtils.property(rightLocator, "productCategoryBL", rhsProductCategoryBL), lhsProductCategoryBL, rhsProductCategoryBL, (leftObject.productCategoryBL!= null), (rightObject.productCategoryBL!= null)));
                        target.setProductCategoryBL(mergedProductCategoryBL);
                    } else {
                        if (productCategoryBLShouldBeMergedAndSet == Boolean.FALSE) {
                            target.productCategoryBL = null;
                        }
                    }
                }
                {
                    Boolean productCategorySLShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productCategorySL!= null), (rightObject.productCategorySL!= null));
                    if (productCategorySLShouldBeMergedAndSet == Boolean.TRUE) {
                        Object lhsProductCategorySL;
                        lhsProductCategorySL = leftObject.getProductCategorySL();
                        Object rhsProductCategorySL;
                        rhsProductCategorySL = rightObject.getProductCategorySL();
                        Object mergedProductCategorySL = ((Object) strategy.merge(LocatorUtils.property(leftLocator, "productCategorySL", lhsProductCategorySL), LocatorUtils.property(rightLocator, "productCategorySL", rhsProductCategorySL), lhsProductCategorySL, rhsProductCategorySL, (leftObject.productCategorySL!= null), (rightObject.productCategorySL!= null)));
                        target.setProductCategorySL(mergedProductCategorySL);
                    } else {
                        if (productCategorySLShouldBeMergedAndSet == Boolean.FALSE) {
                            target.productCategorySL = null;
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
                    Boolean productSubcategoryShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productSubcategory!= null), (rightObject.productSubcategory!= null));
                    if (productSubcategoryShouldBeMergedAndSet == Boolean.TRUE) {
                        ProductCategoryType lhsProductSubcategory;
                        lhsProductSubcategory = leftObject.getProductSubcategory();
                        ProductCategoryType rhsProductSubcategory;
                        rhsProductSubcategory = rightObject.getProductSubcategory();
                        ProductCategoryType mergedProductSubcategory = ((ProductCategoryType) strategy.merge(LocatorUtils.property(leftLocator, "productSubcategory", lhsProductSubcategory), LocatorUtils.property(rightLocator, "productSubcategory", rhsProductSubcategory), lhsProductSubcategory, rhsProductSubcategory, (leftObject.productSubcategory!= null), (rightObject.productSubcategory!= null)));
                        target.setProductSubcategory(mergedProductSubcategory);
                    } else {
                        if (productSubcategoryShouldBeMergedAndSet == Boolean.FALSE) {
                            target.productSubcategory = null;
                        }
                    }
                }
            }
        }

        public void setServiceProducts(List<ServiceProductType> value) {
            this.serviceProducts = value;
        }

    }

}
