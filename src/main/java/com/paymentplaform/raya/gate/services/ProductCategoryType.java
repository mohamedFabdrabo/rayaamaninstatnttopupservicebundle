
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
 *                   &lt;element name="productCategory_BL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="productCategory_SL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                   &lt;element name="serviceProduct" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="productDisplayNameAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="productDisplayNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="productPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="productUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="productDisplaySnippetAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="productDisplaySnippetEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="productLogoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="productSubcategory" type="{http://raya.paymentplaform.com/gate/services/}ProductCategoryType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductCategoryType", namespace = "http://raya.paymentplaform.com/gate/services/", propOrder = {
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
     *         &lt;element name="productCategory_BL" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="productCategory_SL" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *         &lt;element name="serviceProduct" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="productDisplayNameAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="productDisplayNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="productPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="productUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="productDisplaySnippetAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="productDisplaySnippetEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="productLogoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="productSubcategory" type="{http://raya.paymentplaform.com/gate/services/}ProductCategoryType" minOccurs="0"/&gt;
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
        "productCategoryBL",
        "productCategorySL",
        "serviceProducts",
        "productSubcategory"
    })
    public static class Category implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "productCategory_BL", required = true)
        protected String productCategoryBL;
        @XmlElement(name = "productCategory_SL", required = true)
        protected Object productCategorySL;
        @XmlElement(name = "serviceProduct", required = true)
        protected List<ProductCategoryType.Category.ServiceProduct> serviceProducts;
        protected ProductCategoryType productSubcategory;

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
         * {@link ProductCategoryType.Category.ServiceProduct }
         * 
         * 
         */
        public List<ProductCategoryType.Category.ServiceProduct> getServiceProducts() {
            if (serviceProducts == null) {
                serviceProducts = new ArrayList<ProductCategoryType.Category.ServiceProduct>();
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
                List<ProductCategoryType.Category.ServiceProduct> theServiceProducts;
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
                List<ProductCategoryType.Category.ServiceProduct> lhsServiceProducts;
                lhsServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
                List<ProductCategoryType.Category.ServiceProduct> rhsServiceProducts;
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
                List<ProductCategoryType.Category.ServiceProduct> theServiceProducts;
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
                        List<ProductCategoryType.Category.ServiceProduct> sourceServiceProducts;
                        sourceServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
                        @SuppressWarnings("unchecked")
                        List<ProductCategoryType.Category.ServiceProduct> copyServiceProducts = ((List<ProductCategoryType.Category.ServiceProduct> ) strategy.copy(LocatorUtils.property(locator, "serviceProducts", sourceServiceProducts), sourceServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))));
                        copy.serviceProducts = null;
                        if (copyServiceProducts!= null) {
                            List<ProductCategoryType.Category.ServiceProduct> uniqueServiceProductsl = copy.getServiceProducts();
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
                        List<ProductCategoryType.Category.ServiceProduct> lhsServiceProducts;
                        lhsServiceProducts = (((leftObject.serviceProducts!= null)&&(!leftObject.serviceProducts.isEmpty()))?leftObject.getServiceProducts():null);
                        List<ProductCategoryType.Category.ServiceProduct> rhsServiceProducts;
                        rhsServiceProducts = (((rightObject.serviceProducts!= null)&&(!rightObject.serviceProducts.isEmpty()))?rightObject.getServiceProducts():null);
                        List<ProductCategoryType.Category.ServiceProduct> mergedServiceProducts = ((List<ProductCategoryType.Category.ServiceProduct> ) strategy.merge(LocatorUtils.property(leftLocator, "serviceProducts", lhsServiceProducts), LocatorUtils.property(rightLocator, "serviceProducts", rhsServiceProducts), lhsServiceProducts, rhsServiceProducts, ((leftObject.serviceProducts!= null)&&(!leftObject.serviceProducts.isEmpty())), ((rightObject.serviceProducts!= null)&&(!rightObject.serviceProducts.isEmpty()))));
                        target.serviceProducts = null;
                        if (mergedServiceProducts!= null) {
                            List<ProductCategoryType.Category.ServiceProduct> uniqueServiceProductsl = target.getServiceProducts();
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

        public void setServiceProducts(List<ProductCategoryType.Category.ServiceProduct> value) {
            this.serviceProducts = value;
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
         *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="productDisplayNameAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="productDisplayNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="productPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="productUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="productDisplaySnippetAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="productDisplaySnippetEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="productLogoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "productID",
            "productDisplayNameAr",
            "productDisplayNameEn",
            "productPrice",
            "productUrl",
            "productDisplaySnippetAr",
            "productDisplaySnippetEn",
            "productLogoUrl"
        })
        public static class ServiceProduct implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            protected String productID;
            protected String productDisplayNameAr;
            protected String productDisplayNameEn;
            protected String productPrice;
            protected String productUrl;
            protected String productDisplaySnippetAr;
            protected String productDisplaySnippetEn;
            protected String productLogoUrl;

            /**
             * Gets the value of the productID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductID() {
                return productID;
            }

            /**
             * Sets the value of the productID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductID(String value) {
                this.productID = value;
            }

            /**
             * Gets the value of the productDisplayNameAr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductDisplayNameAr() {
                return productDisplayNameAr;
            }

            /**
             * Sets the value of the productDisplayNameAr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductDisplayNameAr(String value) {
                this.productDisplayNameAr = value;
            }

            /**
             * Gets the value of the productDisplayNameEn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductDisplayNameEn() {
                return productDisplayNameEn;
            }

            /**
             * Sets the value of the productDisplayNameEn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductDisplayNameEn(String value) {
                this.productDisplayNameEn = value;
            }

            /**
             * Gets the value of the productPrice property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductPrice() {
                return productPrice;
            }

            /**
             * Sets the value of the productPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductPrice(String value) {
                this.productPrice = value;
            }

            /**
             * Gets the value of the productUrl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductUrl() {
                return productUrl;
            }

            /**
             * Sets the value of the productUrl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductUrl(String value) {
                this.productUrl = value;
            }

            /**
             * Gets the value of the productDisplaySnippetAr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductDisplaySnippetAr() {
                return productDisplaySnippetAr;
            }

            /**
             * Sets the value of the productDisplaySnippetAr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductDisplaySnippetAr(String value) {
                this.productDisplaySnippetAr = value;
            }

            /**
             * Gets the value of the productDisplaySnippetEn property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductDisplaySnippetEn() {
                return productDisplaySnippetEn;
            }

            /**
             * Sets the value of the productDisplaySnippetEn property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductDisplaySnippetEn(String value) {
                this.productDisplaySnippetEn = value;
            }

            /**
             * Gets the value of the productLogoUrl property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProductLogoUrl() {
                return productLogoUrl;
            }

            /**
             * Sets the value of the productLogoUrl property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProductLogoUrl(String value) {
                this.productLogoUrl = value;
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
                    String theProductID;
                    theProductID = this.getProductID();
                    strategy.appendField(locator, this, "productID", buffer, theProductID, (this.productID!= null));
                }
                {
                    String theProductDisplayNameAr;
                    theProductDisplayNameAr = this.getProductDisplayNameAr();
                    strategy.appendField(locator, this, "productDisplayNameAr", buffer, theProductDisplayNameAr, (this.productDisplayNameAr!= null));
                }
                {
                    String theProductDisplayNameEn;
                    theProductDisplayNameEn = this.getProductDisplayNameEn();
                    strategy.appendField(locator, this, "productDisplayNameEn", buffer, theProductDisplayNameEn, (this.productDisplayNameEn!= null));
                }
                {
                    String theProductPrice;
                    theProductPrice = this.getProductPrice();
                    strategy.appendField(locator, this, "productPrice", buffer, theProductPrice, (this.productPrice!= null));
                }
                {
                    String theProductUrl;
                    theProductUrl = this.getProductUrl();
                    strategy.appendField(locator, this, "productUrl", buffer, theProductUrl, (this.productUrl!= null));
                }
                {
                    String theProductDisplaySnippetAr;
                    theProductDisplaySnippetAr = this.getProductDisplaySnippetAr();
                    strategy.appendField(locator, this, "productDisplaySnippetAr", buffer, theProductDisplaySnippetAr, (this.productDisplaySnippetAr!= null));
                }
                {
                    String theProductDisplaySnippetEn;
                    theProductDisplaySnippetEn = this.getProductDisplaySnippetEn();
                    strategy.appendField(locator, this, "productDisplaySnippetEn", buffer, theProductDisplaySnippetEn, (this.productDisplaySnippetEn!= null));
                }
                {
                    String theProductLogoUrl;
                    theProductLogoUrl = this.getProductLogoUrl();
                    strategy.appendField(locator, this, "productLogoUrl", buffer, theProductLogoUrl, (this.productLogoUrl!= null));
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
                final ProductCategoryType.Category.ServiceProduct that = ((ProductCategoryType.Category.ServiceProduct) object);
                {
                    String lhsProductID;
                    lhsProductID = this.getProductID();
                    String rhsProductID;
                    rhsProductID = that.getProductID();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "productID", lhsProductID), LocatorUtils.property(thatLocator, "productID", rhsProductID), lhsProductID, rhsProductID, (this.productID!= null), (that.productID!= null))) {
                        return false;
                    }
                }
                {
                    String lhsProductDisplayNameAr;
                    lhsProductDisplayNameAr = this.getProductDisplayNameAr();
                    String rhsProductDisplayNameAr;
                    rhsProductDisplayNameAr = that.getProductDisplayNameAr();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "productDisplayNameAr", lhsProductDisplayNameAr), LocatorUtils.property(thatLocator, "productDisplayNameAr", rhsProductDisplayNameAr), lhsProductDisplayNameAr, rhsProductDisplayNameAr, (this.productDisplayNameAr!= null), (that.productDisplayNameAr!= null))) {
                        return false;
                    }
                }
                {
                    String lhsProductDisplayNameEn;
                    lhsProductDisplayNameEn = this.getProductDisplayNameEn();
                    String rhsProductDisplayNameEn;
                    rhsProductDisplayNameEn = that.getProductDisplayNameEn();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "productDisplayNameEn", lhsProductDisplayNameEn), LocatorUtils.property(thatLocator, "productDisplayNameEn", rhsProductDisplayNameEn), lhsProductDisplayNameEn, rhsProductDisplayNameEn, (this.productDisplayNameEn!= null), (that.productDisplayNameEn!= null))) {
                        return false;
                    }
                }
                {
                    String lhsProductPrice;
                    lhsProductPrice = this.getProductPrice();
                    String rhsProductPrice;
                    rhsProductPrice = that.getProductPrice();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "productPrice", lhsProductPrice), LocatorUtils.property(thatLocator, "productPrice", rhsProductPrice), lhsProductPrice, rhsProductPrice, (this.productPrice!= null), (that.productPrice!= null))) {
                        return false;
                    }
                }
                {
                    String lhsProductUrl;
                    lhsProductUrl = this.getProductUrl();
                    String rhsProductUrl;
                    rhsProductUrl = that.getProductUrl();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "productUrl", lhsProductUrl), LocatorUtils.property(thatLocator, "productUrl", rhsProductUrl), lhsProductUrl, rhsProductUrl, (this.productUrl!= null), (that.productUrl!= null))) {
                        return false;
                    }
                }
                {
                    String lhsProductDisplaySnippetAr;
                    lhsProductDisplaySnippetAr = this.getProductDisplaySnippetAr();
                    String rhsProductDisplaySnippetAr;
                    rhsProductDisplaySnippetAr = that.getProductDisplaySnippetAr();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "productDisplaySnippetAr", lhsProductDisplaySnippetAr), LocatorUtils.property(thatLocator, "productDisplaySnippetAr", rhsProductDisplaySnippetAr), lhsProductDisplaySnippetAr, rhsProductDisplaySnippetAr, (this.productDisplaySnippetAr!= null), (that.productDisplaySnippetAr!= null))) {
                        return false;
                    }
                }
                {
                    String lhsProductDisplaySnippetEn;
                    lhsProductDisplaySnippetEn = this.getProductDisplaySnippetEn();
                    String rhsProductDisplaySnippetEn;
                    rhsProductDisplaySnippetEn = that.getProductDisplaySnippetEn();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "productDisplaySnippetEn", lhsProductDisplaySnippetEn), LocatorUtils.property(thatLocator, "productDisplaySnippetEn", rhsProductDisplaySnippetEn), lhsProductDisplaySnippetEn, rhsProductDisplaySnippetEn, (this.productDisplaySnippetEn!= null), (that.productDisplaySnippetEn!= null))) {
                        return false;
                    }
                }
                {
                    String lhsProductLogoUrl;
                    lhsProductLogoUrl = this.getProductLogoUrl();
                    String rhsProductLogoUrl;
                    rhsProductLogoUrl = that.getProductLogoUrl();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "productLogoUrl", lhsProductLogoUrl), LocatorUtils.property(thatLocator, "productLogoUrl", rhsProductLogoUrl), lhsProductLogoUrl, rhsProductLogoUrl, (this.productLogoUrl!= null), (that.productLogoUrl!= null))) {
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
                    String theProductID;
                    theProductID = this.getProductID();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productID", theProductID), currentHashCode, theProductID, (this.productID!= null));
                }
                {
                    String theProductDisplayNameAr;
                    theProductDisplayNameAr = this.getProductDisplayNameAr();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productDisplayNameAr", theProductDisplayNameAr), currentHashCode, theProductDisplayNameAr, (this.productDisplayNameAr!= null));
                }
                {
                    String theProductDisplayNameEn;
                    theProductDisplayNameEn = this.getProductDisplayNameEn();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productDisplayNameEn", theProductDisplayNameEn), currentHashCode, theProductDisplayNameEn, (this.productDisplayNameEn!= null));
                }
                {
                    String theProductPrice;
                    theProductPrice = this.getProductPrice();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productPrice", theProductPrice), currentHashCode, theProductPrice, (this.productPrice!= null));
                }
                {
                    String theProductUrl;
                    theProductUrl = this.getProductUrl();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productUrl", theProductUrl), currentHashCode, theProductUrl, (this.productUrl!= null));
                }
                {
                    String theProductDisplaySnippetAr;
                    theProductDisplaySnippetAr = this.getProductDisplaySnippetAr();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productDisplaySnippetAr", theProductDisplaySnippetAr), currentHashCode, theProductDisplaySnippetAr, (this.productDisplaySnippetAr!= null));
                }
                {
                    String theProductDisplaySnippetEn;
                    theProductDisplaySnippetEn = this.getProductDisplaySnippetEn();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productDisplaySnippetEn", theProductDisplaySnippetEn), currentHashCode, theProductDisplaySnippetEn, (this.productDisplaySnippetEn!= null));
                }
                {
                    String theProductLogoUrl;
                    theProductLogoUrl = this.getProductLogoUrl();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productLogoUrl", theProductLogoUrl), currentHashCode, theProductLogoUrl, (this.productLogoUrl!= null));
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
                if (draftCopy instanceof ProductCategoryType.Category.ServiceProduct) {
                    final ProductCategoryType.Category.ServiceProduct copy = ((ProductCategoryType.Category.ServiceProduct) draftCopy);
                    {
                        Boolean productIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productID!= null));
                        if (productIDShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceProductID;
                            sourceProductID = this.getProductID();
                            String copyProductID = ((String) strategy.copy(LocatorUtils.property(locator, "productID", sourceProductID), sourceProductID, (this.productID!= null)));
                            copy.setProductID(copyProductID);
                        } else {
                            if (productIDShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.productID = null;
                            }
                        }
                    }
                    {
                        Boolean productDisplayNameArShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productDisplayNameAr!= null));
                        if (productDisplayNameArShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceProductDisplayNameAr;
                            sourceProductDisplayNameAr = this.getProductDisplayNameAr();
                            String copyProductDisplayNameAr = ((String) strategy.copy(LocatorUtils.property(locator, "productDisplayNameAr", sourceProductDisplayNameAr), sourceProductDisplayNameAr, (this.productDisplayNameAr!= null)));
                            copy.setProductDisplayNameAr(copyProductDisplayNameAr);
                        } else {
                            if (productDisplayNameArShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.productDisplayNameAr = null;
                            }
                        }
                    }
                    {
                        Boolean productDisplayNameEnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productDisplayNameEn!= null));
                        if (productDisplayNameEnShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceProductDisplayNameEn;
                            sourceProductDisplayNameEn = this.getProductDisplayNameEn();
                            String copyProductDisplayNameEn = ((String) strategy.copy(LocatorUtils.property(locator, "productDisplayNameEn", sourceProductDisplayNameEn), sourceProductDisplayNameEn, (this.productDisplayNameEn!= null)));
                            copy.setProductDisplayNameEn(copyProductDisplayNameEn);
                        } else {
                            if (productDisplayNameEnShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.productDisplayNameEn = null;
                            }
                        }
                    }
                    {
                        Boolean productPriceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productPrice!= null));
                        if (productPriceShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceProductPrice;
                            sourceProductPrice = this.getProductPrice();
                            String copyProductPrice = ((String) strategy.copy(LocatorUtils.property(locator, "productPrice", sourceProductPrice), sourceProductPrice, (this.productPrice!= null)));
                            copy.setProductPrice(copyProductPrice);
                        } else {
                            if (productPriceShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.productPrice = null;
                            }
                        }
                    }
                    {
                        Boolean productUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productUrl!= null));
                        if (productUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceProductUrl;
                            sourceProductUrl = this.getProductUrl();
                            String copyProductUrl = ((String) strategy.copy(LocatorUtils.property(locator, "productUrl", sourceProductUrl), sourceProductUrl, (this.productUrl!= null)));
                            copy.setProductUrl(copyProductUrl);
                        } else {
                            if (productUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.productUrl = null;
                            }
                        }
                    }
                    {
                        Boolean productDisplaySnippetArShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productDisplaySnippetAr!= null));
                        if (productDisplaySnippetArShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceProductDisplaySnippetAr;
                            sourceProductDisplaySnippetAr = this.getProductDisplaySnippetAr();
                            String copyProductDisplaySnippetAr = ((String) strategy.copy(LocatorUtils.property(locator, "productDisplaySnippetAr", sourceProductDisplaySnippetAr), sourceProductDisplaySnippetAr, (this.productDisplaySnippetAr!= null)));
                            copy.setProductDisplaySnippetAr(copyProductDisplaySnippetAr);
                        } else {
                            if (productDisplaySnippetArShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.productDisplaySnippetAr = null;
                            }
                        }
                    }
                    {
                        Boolean productDisplaySnippetEnShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productDisplaySnippetEn!= null));
                        if (productDisplaySnippetEnShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceProductDisplaySnippetEn;
                            sourceProductDisplaySnippetEn = this.getProductDisplaySnippetEn();
                            String copyProductDisplaySnippetEn = ((String) strategy.copy(LocatorUtils.property(locator, "productDisplaySnippetEn", sourceProductDisplaySnippetEn), sourceProductDisplaySnippetEn, (this.productDisplaySnippetEn!= null)));
                            copy.setProductDisplaySnippetEn(copyProductDisplaySnippetEn);
                        } else {
                            if (productDisplaySnippetEnShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.productDisplaySnippetEn = null;
                            }
                        }
                    }
                    {
                        Boolean productLogoUrlShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productLogoUrl!= null));
                        if (productLogoUrlShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceProductLogoUrl;
                            sourceProductLogoUrl = this.getProductLogoUrl();
                            String copyProductLogoUrl = ((String) strategy.copy(LocatorUtils.property(locator, "productLogoUrl", sourceProductLogoUrl), sourceProductLogoUrl, (this.productLogoUrl!= null)));
                            copy.setProductLogoUrl(copyProductLogoUrl);
                        } else {
                            if (productLogoUrlShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.productLogoUrl = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new ProductCategoryType.Category.ServiceProduct();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ProductCategoryType.Category.ServiceProduct) {
                    final ProductCategoryType.Category.ServiceProduct target = this;
                    final ProductCategoryType.Category.ServiceProduct leftObject = ((ProductCategoryType.Category.ServiceProduct) left);
                    final ProductCategoryType.Category.ServiceProduct rightObject = ((ProductCategoryType.Category.ServiceProduct) right);
                    {
                        Boolean productIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productID!= null), (rightObject.productID!= null));
                        if (productIDShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsProductID;
                            lhsProductID = leftObject.getProductID();
                            String rhsProductID;
                            rhsProductID = rightObject.getProductID();
                            String mergedProductID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "productID", lhsProductID), LocatorUtils.property(rightLocator, "productID", rhsProductID), lhsProductID, rhsProductID, (leftObject.productID!= null), (rightObject.productID!= null)));
                            target.setProductID(mergedProductID);
                        } else {
                            if (productIDShouldBeMergedAndSet == Boolean.FALSE) {
                                target.productID = null;
                            }
                        }
                    }
                    {
                        Boolean productDisplayNameArShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productDisplayNameAr!= null), (rightObject.productDisplayNameAr!= null));
                        if (productDisplayNameArShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsProductDisplayNameAr;
                            lhsProductDisplayNameAr = leftObject.getProductDisplayNameAr();
                            String rhsProductDisplayNameAr;
                            rhsProductDisplayNameAr = rightObject.getProductDisplayNameAr();
                            String mergedProductDisplayNameAr = ((String) strategy.merge(LocatorUtils.property(leftLocator, "productDisplayNameAr", lhsProductDisplayNameAr), LocatorUtils.property(rightLocator, "productDisplayNameAr", rhsProductDisplayNameAr), lhsProductDisplayNameAr, rhsProductDisplayNameAr, (leftObject.productDisplayNameAr!= null), (rightObject.productDisplayNameAr!= null)));
                            target.setProductDisplayNameAr(mergedProductDisplayNameAr);
                        } else {
                            if (productDisplayNameArShouldBeMergedAndSet == Boolean.FALSE) {
                                target.productDisplayNameAr = null;
                            }
                        }
                    }
                    {
                        Boolean productDisplayNameEnShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productDisplayNameEn!= null), (rightObject.productDisplayNameEn!= null));
                        if (productDisplayNameEnShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsProductDisplayNameEn;
                            lhsProductDisplayNameEn = leftObject.getProductDisplayNameEn();
                            String rhsProductDisplayNameEn;
                            rhsProductDisplayNameEn = rightObject.getProductDisplayNameEn();
                            String mergedProductDisplayNameEn = ((String) strategy.merge(LocatorUtils.property(leftLocator, "productDisplayNameEn", lhsProductDisplayNameEn), LocatorUtils.property(rightLocator, "productDisplayNameEn", rhsProductDisplayNameEn), lhsProductDisplayNameEn, rhsProductDisplayNameEn, (leftObject.productDisplayNameEn!= null), (rightObject.productDisplayNameEn!= null)));
                            target.setProductDisplayNameEn(mergedProductDisplayNameEn);
                        } else {
                            if (productDisplayNameEnShouldBeMergedAndSet == Boolean.FALSE) {
                                target.productDisplayNameEn = null;
                            }
                        }
                    }
                    {
                        Boolean productPriceShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productPrice!= null), (rightObject.productPrice!= null));
                        if (productPriceShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsProductPrice;
                            lhsProductPrice = leftObject.getProductPrice();
                            String rhsProductPrice;
                            rhsProductPrice = rightObject.getProductPrice();
                            String mergedProductPrice = ((String) strategy.merge(LocatorUtils.property(leftLocator, "productPrice", lhsProductPrice), LocatorUtils.property(rightLocator, "productPrice", rhsProductPrice), lhsProductPrice, rhsProductPrice, (leftObject.productPrice!= null), (rightObject.productPrice!= null)));
                            target.setProductPrice(mergedProductPrice);
                        } else {
                            if (productPriceShouldBeMergedAndSet == Boolean.FALSE) {
                                target.productPrice = null;
                            }
                        }
                    }
                    {
                        Boolean productUrlShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productUrl!= null), (rightObject.productUrl!= null));
                        if (productUrlShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsProductUrl;
                            lhsProductUrl = leftObject.getProductUrl();
                            String rhsProductUrl;
                            rhsProductUrl = rightObject.getProductUrl();
                            String mergedProductUrl = ((String) strategy.merge(LocatorUtils.property(leftLocator, "productUrl", lhsProductUrl), LocatorUtils.property(rightLocator, "productUrl", rhsProductUrl), lhsProductUrl, rhsProductUrl, (leftObject.productUrl!= null), (rightObject.productUrl!= null)));
                            target.setProductUrl(mergedProductUrl);
                        } else {
                            if (productUrlShouldBeMergedAndSet == Boolean.FALSE) {
                                target.productUrl = null;
                            }
                        }
                    }
                    {
                        Boolean productDisplaySnippetArShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productDisplaySnippetAr!= null), (rightObject.productDisplaySnippetAr!= null));
                        if (productDisplaySnippetArShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsProductDisplaySnippetAr;
                            lhsProductDisplaySnippetAr = leftObject.getProductDisplaySnippetAr();
                            String rhsProductDisplaySnippetAr;
                            rhsProductDisplaySnippetAr = rightObject.getProductDisplaySnippetAr();
                            String mergedProductDisplaySnippetAr = ((String) strategy.merge(LocatorUtils.property(leftLocator, "productDisplaySnippetAr", lhsProductDisplaySnippetAr), LocatorUtils.property(rightLocator, "productDisplaySnippetAr", rhsProductDisplaySnippetAr), lhsProductDisplaySnippetAr, rhsProductDisplaySnippetAr, (leftObject.productDisplaySnippetAr!= null), (rightObject.productDisplaySnippetAr!= null)));
                            target.setProductDisplaySnippetAr(mergedProductDisplaySnippetAr);
                        } else {
                            if (productDisplaySnippetArShouldBeMergedAndSet == Boolean.FALSE) {
                                target.productDisplaySnippetAr = null;
                            }
                        }
                    }
                    {
                        Boolean productDisplaySnippetEnShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productDisplaySnippetEn!= null), (rightObject.productDisplaySnippetEn!= null));
                        if (productDisplaySnippetEnShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsProductDisplaySnippetEn;
                            lhsProductDisplaySnippetEn = leftObject.getProductDisplaySnippetEn();
                            String rhsProductDisplaySnippetEn;
                            rhsProductDisplaySnippetEn = rightObject.getProductDisplaySnippetEn();
                            String mergedProductDisplaySnippetEn = ((String) strategy.merge(LocatorUtils.property(leftLocator, "productDisplaySnippetEn", lhsProductDisplaySnippetEn), LocatorUtils.property(rightLocator, "productDisplaySnippetEn", rhsProductDisplaySnippetEn), lhsProductDisplaySnippetEn, rhsProductDisplaySnippetEn, (leftObject.productDisplaySnippetEn!= null), (rightObject.productDisplaySnippetEn!= null)));
                            target.setProductDisplaySnippetEn(mergedProductDisplaySnippetEn);
                        } else {
                            if (productDisplaySnippetEnShouldBeMergedAndSet == Boolean.FALSE) {
                                target.productDisplaySnippetEn = null;
                            }
                        }
                    }
                    {
                        Boolean productLogoUrlShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productLogoUrl!= null), (rightObject.productLogoUrl!= null));
                        if (productLogoUrlShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsProductLogoUrl;
                            lhsProductLogoUrl = leftObject.getProductLogoUrl();
                            String rhsProductLogoUrl;
                            rhsProductLogoUrl = rightObject.getProductLogoUrl();
                            String mergedProductLogoUrl = ((String) strategy.merge(LocatorUtils.property(leftLocator, "productLogoUrl", lhsProductLogoUrl), LocatorUtils.property(rightLocator, "productLogoUrl", rhsProductLogoUrl), lhsProductLogoUrl, rhsProductLogoUrl, (leftObject.productLogoUrl!= null), (rightObject.productLogoUrl!= null)));
                            target.setProductLogoUrl(mergedProductLogoUrl);
                        } else {
                            if (productLogoUrlShouldBeMergedAndSet == Boolean.FALSE) {
                                target.productLogoUrl = null;
                            }
                        }
                    }
                }
            }

        }

    }

}
