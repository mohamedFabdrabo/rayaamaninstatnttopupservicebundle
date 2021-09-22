
package com.paymentplaform.raya.gate.pagservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 * <p>Java class for serviceProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceProductType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="voucherServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productDisplayNameAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productDisplayNameEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productDisplaySnippetAr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productDisplaySnippetEn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productLogoUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="footer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceProductType", namespace = "http://raya.paymentplaform.com/gate/pagservice", propOrder = {
    "productID",
    "voucherServiceCode",
    "productDisplayNameAr",
    "productDisplayNameEn",
    "productPrice",
    "productUrl",
    "productDisplaySnippetAr",
    "productDisplaySnippetEn",
    "productLogoUrl",
    "footer"
})
public class ServiceProductType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    protected String productID;
    protected String voucherServiceCode;
    protected String productDisplayNameAr;
    protected String productDisplayNameEn;
    protected String productPrice;
    protected String productUrl;
    protected String productDisplaySnippetAr;
    protected String productDisplaySnippetEn;
    protected String productLogoUrl;
    protected String footer;

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
     * Gets the value of the voucherServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherServiceCode() {
        return voucherServiceCode;
    }

    /**
     * Sets the value of the voucherServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherServiceCode(String value) {
        this.voucherServiceCode = value;
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

    /**
     * Gets the value of the footer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFooter() {
        return footer;
    }

    /**
     * Sets the value of the footer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFooter(String value) {
        this.footer = value;
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
            String theVoucherServiceCode;
            theVoucherServiceCode = this.getVoucherServiceCode();
            strategy.appendField(locator, this, "voucherServiceCode", buffer, theVoucherServiceCode, (this.voucherServiceCode!= null));
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
        {
            String theFooter;
            theFooter = this.getFooter();
            strategy.appendField(locator, this, "footer", buffer, theFooter, (this.footer!= null));
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
        final ServiceProductType that = ((ServiceProductType) object);
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
            String lhsVoucherServiceCode;
            lhsVoucherServiceCode = this.getVoucherServiceCode();
            String rhsVoucherServiceCode;
            rhsVoucherServiceCode = that.getVoucherServiceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "voucherServiceCode", lhsVoucherServiceCode), LocatorUtils.property(thatLocator, "voucherServiceCode", rhsVoucherServiceCode), lhsVoucherServiceCode, rhsVoucherServiceCode, (this.voucherServiceCode!= null), (that.voucherServiceCode!= null))) {
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
        {
            String lhsFooter;
            lhsFooter = this.getFooter();
            String rhsFooter;
            rhsFooter = that.getFooter();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "footer", lhsFooter), LocatorUtils.property(thatLocator, "footer", rhsFooter), lhsFooter, rhsFooter, (this.footer!= null), (that.footer!= null))) {
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
            String theVoucherServiceCode;
            theVoucherServiceCode = this.getVoucherServiceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "voucherServiceCode", theVoucherServiceCode), currentHashCode, theVoucherServiceCode, (this.voucherServiceCode!= null));
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
        {
            String theFooter;
            theFooter = this.getFooter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "footer", theFooter), currentHashCode, theFooter, (this.footer!= null));
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
        if (draftCopy instanceof ServiceProductType) {
            final ServiceProductType copy = ((ServiceProductType) draftCopy);
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
                Boolean voucherServiceCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.voucherServiceCode!= null));
                if (voucherServiceCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVoucherServiceCode;
                    sourceVoucherServiceCode = this.getVoucherServiceCode();
                    String copyVoucherServiceCode = ((String) strategy.copy(LocatorUtils.property(locator, "voucherServiceCode", sourceVoucherServiceCode), sourceVoucherServiceCode, (this.voucherServiceCode!= null)));
                    copy.setVoucherServiceCode(copyVoucherServiceCode);
                } else {
                    if (voucherServiceCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.voucherServiceCode = null;
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
            {
                Boolean footerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.footer!= null));
                if (footerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFooter;
                    sourceFooter = this.getFooter();
                    String copyFooter = ((String) strategy.copy(LocatorUtils.property(locator, "footer", sourceFooter), sourceFooter, (this.footer!= null)));
                    copy.setFooter(copyFooter);
                } else {
                    if (footerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.footer = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ServiceProductType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ServiceProductType) {
            final ServiceProductType target = this;
            final ServiceProductType leftObject = ((ServiceProductType) left);
            final ServiceProductType rightObject = ((ServiceProductType) right);
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
                Boolean voucherServiceCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.voucherServiceCode!= null), (rightObject.voucherServiceCode!= null));
                if (voucherServiceCodeShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsVoucherServiceCode;
                    lhsVoucherServiceCode = leftObject.getVoucherServiceCode();
                    String rhsVoucherServiceCode;
                    rhsVoucherServiceCode = rightObject.getVoucherServiceCode();
                    String mergedVoucherServiceCode = ((String) strategy.merge(LocatorUtils.property(leftLocator, "voucherServiceCode", lhsVoucherServiceCode), LocatorUtils.property(rightLocator, "voucherServiceCode", rhsVoucherServiceCode), lhsVoucherServiceCode, rhsVoucherServiceCode, (leftObject.voucherServiceCode!= null), (rightObject.voucherServiceCode!= null)));
                    target.setVoucherServiceCode(mergedVoucherServiceCode);
                } else {
                    if (voucherServiceCodeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.voucherServiceCode = null;
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
            {
                Boolean footerShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.footer!= null), (rightObject.footer!= null));
                if (footerShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsFooter;
                    lhsFooter = leftObject.getFooter();
                    String rhsFooter;
                    rhsFooter = rightObject.getFooter();
                    String mergedFooter = ((String) strategy.merge(LocatorUtils.property(leftLocator, "footer", lhsFooter), LocatorUtils.property(rightLocator, "footer", rhsFooter), lhsFooter, rhsFooter, (leftObject.footer!= null), (rightObject.footer!= null)));
                    target.setFooter(mergedFooter);
                } else {
                    if (footerShouldBeMergedAndSet == Boolean.FALSE) {
                        target.footer = null;
                    }
                }
            }
        }
    }

}
