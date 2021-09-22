
package com.paymentplaform.raya.gate.pagservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 * <p>Java class for ServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inquiryServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceName_BL" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="print" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ServiceName_SL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDescription_BL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDescription_SL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLabel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="footer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productCategories" type="{http://raya.paymentplaform.com/gate/pagservice}ProductCategoryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentParameters" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="parameterKey" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="mapping" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="mode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="serviceProducts" type="{http://raya.paymentplaform.com/gate/pagservice}serviceProductType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="VATTrailer" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="totalOnly" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", namespace = "http://raya.paymentplaform.com/gate/pagservice", propOrder = {
    "id",
    "serviceCode",
    "inquiryServiceCode",
    "serviceNameBL",
    "serviceNameSL",
    "serviceDescriptionBL",
    "serviceDescriptionSL",
    "trxType",
    "serviceLabel",
    "serviceLabel2",
    "uPrice",
    "footer",
    "productCategories",
    "paymentParameters",
    "serviceProducts"
})
public class ServiceType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(required = true)
    protected String serviceCode;
    protected String inquiryServiceCode;
    @XmlElement(name = "ServiceName_BL")
    protected ServiceType.ServiceNameBL serviceNameBL;
    @XmlElement(name = "ServiceName_SL")
    protected String serviceNameSL;
    @XmlElement(name = "ServiceDescription_BL")
    protected String serviceDescriptionBL;
    @XmlElement(name = "ServiceDescription_SL")
    protected String serviceDescriptionSL;
    @XmlElement(name = "TrxType")
    protected String trxType;
    @XmlElement(name = "ServiceLabel")
    protected String serviceLabel;
    @XmlElement(name = "ServiceLabel2")
    protected String serviceLabel2;
    @XmlElement(name = "UPrice")
    protected String uPrice;
    protected String footer;
    protected List<ProductCategoryType> productCategories;
    protected List<ServiceType.PaymentParameters> paymentParameters;
    protected List<ServiceProductType> serviceProducts;
    @XmlAttribute(name = "VATTrailer")
    protected String vatTrailer;
    @XmlAttribute(name = "totalOnly")
    protected String totalOnly;

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
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the inquiryServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInquiryServiceCode() {
        return inquiryServiceCode;
    }

    /**
     * Sets the value of the inquiryServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInquiryServiceCode(String value) {
        this.inquiryServiceCode = value;
    }

    /**
     * Gets the value of the serviceNameBL property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceType.ServiceNameBL }
     *     
     */
    public ServiceType.ServiceNameBL getServiceNameBL() {
        return serviceNameBL;
    }

    /**
     * Sets the value of the serviceNameBL property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType.ServiceNameBL }
     *     
     */
    public void setServiceNameBL(ServiceType.ServiceNameBL value) {
        this.serviceNameBL = value;
    }

    /**
     * Gets the value of the serviceNameSL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNameSL() {
        return serviceNameSL;
    }

    /**
     * Sets the value of the serviceNameSL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNameSL(String value) {
        this.serviceNameSL = value;
    }

    /**
     * Gets the value of the serviceDescriptionBL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescriptionBL() {
        return serviceDescriptionBL;
    }

    /**
     * Sets the value of the serviceDescriptionBL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescriptionBL(String value) {
        this.serviceDescriptionBL = value;
    }

    /**
     * Gets the value of the serviceDescriptionSL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDescriptionSL() {
        return serviceDescriptionSL;
    }

    /**
     * Sets the value of the serviceDescriptionSL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDescriptionSL(String value) {
        this.serviceDescriptionSL = value;
    }

    /**
     * Gets the value of the trxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxType() {
        return trxType;
    }

    /**
     * Sets the value of the trxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxType(String value) {
        this.trxType = value;
    }

    /**
     * Gets the value of the serviceLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLabel() {
        return serviceLabel;
    }

    /**
     * Sets the value of the serviceLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLabel(String value) {
        this.serviceLabel = value;
    }

    /**
     * Gets the value of the serviceLabel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLabel2() {
        return serviceLabel2;
    }

    /**
     * Sets the value of the serviceLabel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLabel2(String value) {
        this.serviceLabel2 = value;
    }

    /**
     * Gets the value of the uPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPrice() {
        return uPrice;
    }

    /**
     * Sets the value of the uPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPrice(String value) {
        this.uPrice = value;
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
     * Gets the value of the paymentParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType.PaymentParameters }
     * 
     * 
     */
    public List<ServiceType.PaymentParameters> getPaymentParameters() {
        if (paymentParameters == null) {
            paymentParameters = new ArrayList<ServiceType.PaymentParameters>();
        }
        return this.paymentParameters;
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
     * Gets the value of the vatTrailer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatTrailer() {
        return vatTrailer;
    }

    /**
     * Sets the value of the vatTrailer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatTrailer(String value) {
        this.vatTrailer = value;
    }

    /**
     * Gets the value of the totalOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalOnly() {
        return totalOnly;
    }

    /**
     * Sets the value of the totalOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalOnly(String value) {
        this.totalOnly = value;
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
            String theServiceCode;
            theServiceCode = this.getServiceCode();
            strategy.appendField(locator, this, "serviceCode", buffer, theServiceCode, (this.serviceCode!= null));
        }
        {
            String theInquiryServiceCode;
            theInquiryServiceCode = this.getInquiryServiceCode();
            strategy.appendField(locator, this, "inquiryServiceCode", buffer, theInquiryServiceCode, (this.inquiryServiceCode!= null));
        }
        {
            ServiceType.ServiceNameBL theServiceNameBL;
            theServiceNameBL = this.getServiceNameBL();
            strategy.appendField(locator, this, "serviceNameBL", buffer, theServiceNameBL, (this.serviceNameBL!= null));
        }
        {
            String theServiceNameSL;
            theServiceNameSL = this.getServiceNameSL();
            strategy.appendField(locator, this, "serviceNameSL", buffer, theServiceNameSL, (this.serviceNameSL!= null));
        }
        {
            String theServiceDescriptionBL;
            theServiceDescriptionBL = this.getServiceDescriptionBL();
            strategy.appendField(locator, this, "serviceDescriptionBL", buffer, theServiceDescriptionBL, (this.serviceDescriptionBL!= null));
        }
        {
            String theServiceDescriptionSL;
            theServiceDescriptionSL = this.getServiceDescriptionSL();
            strategy.appendField(locator, this, "serviceDescriptionSL", buffer, theServiceDescriptionSL, (this.serviceDescriptionSL!= null));
        }
        {
            String theTrxType;
            theTrxType = this.getTrxType();
            strategy.appendField(locator, this, "trxType", buffer, theTrxType, (this.trxType!= null));
        }
        {
            String theServiceLabel;
            theServiceLabel = this.getServiceLabel();
            strategy.appendField(locator, this, "serviceLabel", buffer, theServiceLabel, (this.serviceLabel!= null));
        }
        {
            String theServiceLabel2;
            theServiceLabel2 = this.getServiceLabel2();
            strategy.appendField(locator, this, "serviceLabel2", buffer, theServiceLabel2, (this.serviceLabel2 != null));
        }
        {
            String theUPrice;
            theUPrice = this.getUPrice();
            strategy.appendField(locator, this, "uPrice", buffer, theUPrice, (this.uPrice!= null));
        }
        {
            String theFooter;
            theFooter = this.getFooter();
            strategy.appendField(locator, this, "footer", buffer, theFooter, (this.footer!= null));
        }
        {
            List<ProductCategoryType> theProductCategories;
            theProductCategories = (((this.productCategories!= null)&&(!this.productCategories.isEmpty()))?this.getProductCategories():null);
            strategy.appendField(locator, this, "productCategories", buffer, theProductCategories, ((this.productCategories!= null)&&(!this.productCategories.isEmpty())));
        }
        {
            List<ServiceType.PaymentParameters> thePaymentParameters;
            thePaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
            strategy.appendField(locator, this, "paymentParameters", buffer, thePaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())));
        }
        {
            List<ServiceProductType> theServiceProducts;
            theServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
            strategy.appendField(locator, this, "serviceProducts", buffer, theServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty())));
        }
        {
            String theVATTrailer;
            theVATTrailer = this.getVatTrailer();
            strategy.appendField(locator, this, "vatTrailer", buffer, theVATTrailer, (this.vatTrailer!= null));
        }
        {
            String theTotalOnly;
            theTotalOnly = this.getTotalOnly();
            strategy.appendField(locator, this, "totalOnly", buffer, theTotalOnly, (this.totalOnly!= null));
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
        final ServiceType that = ((ServiceType) object);
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
            String lhsServiceCode;
            lhsServiceCode = this.getServiceCode();
            String rhsServiceCode;
            rhsServiceCode = that.getServiceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCode", lhsServiceCode), LocatorUtils.property(thatLocator, "serviceCode", rhsServiceCode), lhsServiceCode, rhsServiceCode, (this.serviceCode!= null), (that.serviceCode!= null))) {
                return false;
            }
        }
        {
            String lhsInquiryServiceCode;
            lhsInquiryServiceCode = this.getInquiryServiceCode();
            String rhsInquiryServiceCode;
            rhsInquiryServiceCode = that.getInquiryServiceCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inquiryServiceCode", lhsInquiryServiceCode), LocatorUtils.property(thatLocator, "inquiryServiceCode", rhsInquiryServiceCode), lhsInquiryServiceCode, rhsInquiryServiceCode, (this.inquiryServiceCode!= null), (that.inquiryServiceCode!= null))) {
                return false;
            }
        }
        {
            ServiceType.ServiceNameBL lhsServiceNameBL;
            lhsServiceNameBL = this.getServiceNameBL();
            ServiceType.ServiceNameBL rhsServiceNameBL;
            rhsServiceNameBL = that.getServiceNameBL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceNameBL", lhsServiceNameBL), LocatorUtils.property(thatLocator, "serviceNameBL", rhsServiceNameBL), lhsServiceNameBL, rhsServiceNameBL, (this.serviceNameBL!= null), (that.serviceNameBL!= null))) {
                return false;
            }
        }
        {
            String lhsServiceNameSL;
            lhsServiceNameSL = this.getServiceNameSL();
            String rhsServiceNameSL;
            rhsServiceNameSL = that.getServiceNameSL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceNameSL", lhsServiceNameSL), LocatorUtils.property(thatLocator, "serviceNameSL", rhsServiceNameSL), lhsServiceNameSL, rhsServiceNameSL, (this.serviceNameSL!= null), (that.serviceNameSL!= null))) {
                return false;
            }
        }
        {
            String lhsServiceDescriptionBL;
            lhsServiceDescriptionBL = this.getServiceDescriptionBL();
            String rhsServiceDescriptionBL;
            rhsServiceDescriptionBL = that.getServiceDescriptionBL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceDescriptionBL", lhsServiceDescriptionBL), LocatorUtils.property(thatLocator, "serviceDescriptionBL", rhsServiceDescriptionBL), lhsServiceDescriptionBL, rhsServiceDescriptionBL, (this.serviceDescriptionBL!= null), (that.serviceDescriptionBL!= null))) {
                return false;
            }
        }
        {
            String lhsServiceDescriptionSL;
            lhsServiceDescriptionSL = this.getServiceDescriptionSL();
            String rhsServiceDescriptionSL;
            rhsServiceDescriptionSL = that.getServiceDescriptionSL();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceDescriptionSL", lhsServiceDescriptionSL), LocatorUtils.property(thatLocator, "serviceDescriptionSL", rhsServiceDescriptionSL), lhsServiceDescriptionSL, rhsServiceDescriptionSL, (this.serviceDescriptionSL!= null), (that.serviceDescriptionSL!= null))) {
                return false;
            }
        }
        {
            String lhsTrxType;
            lhsTrxType = this.getTrxType();
            String rhsTrxType;
            rhsTrxType = that.getTrxType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "trxType", lhsTrxType), LocatorUtils.property(thatLocator, "trxType", rhsTrxType), lhsTrxType, rhsTrxType, (this.trxType!= null), (that.trxType!= null))) {
                return false;
            }
        }
        {
            String lhsServiceLabel;
            lhsServiceLabel = this.getServiceLabel();
            String rhsServiceLabel;
            rhsServiceLabel = that.getServiceLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceLabel", lhsServiceLabel), LocatorUtils.property(thatLocator, "serviceLabel", rhsServiceLabel), lhsServiceLabel, rhsServiceLabel, (this.serviceLabel!= null), (that.serviceLabel!= null))) {
                return false;
            }
        }
        {
            String lhsServiceLabel2;
            lhsServiceLabel2 = this.getServiceLabel2();
            String rhsServiceLabel2;
            rhsServiceLabel2 = that.getServiceLabel2();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceLabel2", lhsServiceLabel2), LocatorUtils.property(thatLocator, "serviceLabel2", rhsServiceLabel2), lhsServiceLabel2, rhsServiceLabel2, (this.serviceLabel2 != null), (that.serviceLabel2 != null))) {
                return false;
            }
        }
        {
            String lhsUPrice;
            lhsUPrice = this.getUPrice();
            String rhsUPrice;
            rhsUPrice = that.getUPrice();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uPrice", lhsUPrice), LocatorUtils.property(thatLocator, "uPrice", rhsUPrice), lhsUPrice, rhsUPrice, (this.uPrice!= null), (that.uPrice!= null))) {
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
            List<ServiceType.PaymentParameters> lhsPaymentParameters;
            lhsPaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
            List<ServiceType.PaymentParameters> rhsPaymentParameters;
            rhsPaymentParameters = (((that.paymentParameters!= null)&&(!that.paymentParameters.isEmpty()))?that.getPaymentParameters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentParameters", lhsPaymentParameters), LocatorUtils.property(thatLocator, "paymentParameters", rhsPaymentParameters), lhsPaymentParameters, rhsPaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())), ((that.paymentParameters!= null)&&(!that.paymentParameters.isEmpty())))) {
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
            String lhsVATTrailer;
            lhsVATTrailer = this.getVatTrailer();
            String rhsVATTrailer;
            rhsVATTrailer = that.getVatTrailer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vatTrailer", lhsVATTrailer), LocatorUtils.property(thatLocator, "vatTrailer", rhsVATTrailer), lhsVATTrailer, rhsVATTrailer, (this.vatTrailer!= null), (that.vatTrailer!= null))) {
                return false;
            }
        }
        {
            String lhsTotalOnly;
            lhsTotalOnly = this.getTotalOnly();
            String rhsTotalOnly;
            rhsTotalOnly = that.getTotalOnly();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalOnly", lhsTotalOnly), LocatorUtils.property(thatLocator, "totalOnly", rhsTotalOnly), lhsTotalOnly, rhsTotalOnly, (this.totalOnly!= null), (that.totalOnly!= null))) {
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
            String theServiceCode;
            theServiceCode = this.getServiceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceCode", theServiceCode), currentHashCode, theServiceCode, (this.serviceCode!= null));
        }
        {
            String theInquiryServiceCode;
            theInquiryServiceCode = this.getInquiryServiceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inquiryServiceCode", theInquiryServiceCode), currentHashCode, theInquiryServiceCode, (this.inquiryServiceCode!= null));
        }
        {
            ServiceType.ServiceNameBL theServiceNameBL;
            theServiceNameBL = this.getServiceNameBL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceNameBL", theServiceNameBL), currentHashCode, theServiceNameBL, (this.serviceNameBL!= null));
        }
        {
            String theServiceNameSL;
            theServiceNameSL = this.getServiceNameSL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceNameSL", theServiceNameSL), currentHashCode, theServiceNameSL, (this.serviceNameSL!= null));
        }
        {
            String theServiceDescriptionBL;
            theServiceDescriptionBL = this.getServiceDescriptionBL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceDescriptionBL", theServiceDescriptionBL), currentHashCode, theServiceDescriptionBL, (this.serviceDescriptionBL!= null));
        }
        {
            String theServiceDescriptionSL;
            theServiceDescriptionSL = this.getServiceDescriptionSL();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceDescriptionSL", theServiceDescriptionSL), currentHashCode, theServiceDescriptionSL, (this.serviceDescriptionSL!= null));
        }
        {
            String theTrxType;
            theTrxType = this.getTrxType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "trxType", theTrxType), currentHashCode, theTrxType, (this.trxType!= null));
        }
        {
            String theServiceLabel;
            theServiceLabel = this.getServiceLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceLabel", theServiceLabel), currentHashCode, theServiceLabel, (this.serviceLabel!= null));
        }
        {
            String theServiceLabel2;
            theServiceLabel2 = this.getServiceLabel2();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceLabel2", theServiceLabel2), currentHashCode, theServiceLabel2, (this.serviceLabel2 != null));
        }
        {
            String theUPrice;
            theUPrice = this.getUPrice();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uPrice", theUPrice), currentHashCode, theUPrice, (this.uPrice!= null));
        }
        {
            String theFooter;
            theFooter = this.getFooter();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "footer", theFooter), currentHashCode, theFooter, (this.footer!= null));
        }
        {
            List<ProductCategoryType> theProductCategories;
            theProductCategories = (((this.productCategories!= null)&&(!this.productCategories.isEmpty()))?this.getProductCategories():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productCategories", theProductCategories), currentHashCode, theProductCategories, ((this.productCategories!= null)&&(!this.productCategories.isEmpty())));
        }
        {
            List<ServiceType.PaymentParameters> thePaymentParameters;
            thePaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentParameters", thePaymentParameters), currentHashCode, thePaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())));
        }
        {
            List<ServiceProductType> theServiceProducts;
            theServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceProducts", theServiceProducts), currentHashCode, theServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty())));
        }
        {
            String theVATTrailer;
            theVATTrailer = this.getVatTrailer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vatTrailer", theVATTrailer), currentHashCode, theVATTrailer, (this.vatTrailer!= null));
        }
        {
            String theTotalOnly;
            theTotalOnly = this.getTotalOnly();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalOnly", theTotalOnly), currentHashCode, theTotalOnly, (this.totalOnly!= null));
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
        if (draftCopy instanceof ServiceType) {
            final ServiceType copy = ((ServiceType) draftCopy);
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
                Boolean serviceCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceCode!= null));
                if (serviceCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceServiceCode;
                    sourceServiceCode = this.getServiceCode();
                    String copyServiceCode = ((String) strategy.copy(LocatorUtils.property(locator, "serviceCode", sourceServiceCode), sourceServiceCode, (this.serviceCode!= null)));
                    copy.setServiceCode(copyServiceCode);
                } else {
                    if (serviceCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceCode = null;
                    }
                }
            }
            {
                Boolean inquiryServiceCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.inquiryServiceCode!= null));
                if (inquiryServiceCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceInquiryServiceCode;
                    sourceInquiryServiceCode = this.getInquiryServiceCode();
                    String copyInquiryServiceCode = ((String) strategy.copy(LocatorUtils.property(locator, "inquiryServiceCode", sourceInquiryServiceCode), sourceInquiryServiceCode, (this.inquiryServiceCode!= null)));
                    copy.setInquiryServiceCode(copyInquiryServiceCode);
                } else {
                    if (inquiryServiceCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.inquiryServiceCode = null;
                    }
                }
            }
            {
                Boolean serviceNameBLShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceNameBL!= null));
                if (serviceNameBLShouldBeCopiedAndSet == Boolean.TRUE) {
                    ServiceType.ServiceNameBL sourceServiceNameBL;
                    sourceServiceNameBL = this.getServiceNameBL();
                    ServiceType.ServiceNameBL copyServiceNameBL = ((ServiceType.ServiceNameBL) strategy.copy(LocatorUtils.property(locator, "serviceNameBL", sourceServiceNameBL), sourceServiceNameBL, (this.serviceNameBL!= null)));
                    copy.setServiceNameBL(copyServiceNameBL);
                } else {
                    if (serviceNameBLShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceNameBL = null;
                    }
                }
            }
            {
                Boolean serviceNameSLShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceNameSL!= null));
                if (serviceNameSLShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceServiceNameSL;
                    sourceServiceNameSL = this.getServiceNameSL();
                    String copyServiceNameSL = ((String) strategy.copy(LocatorUtils.property(locator, "serviceNameSL", sourceServiceNameSL), sourceServiceNameSL, (this.serviceNameSL!= null)));
                    copy.setServiceNameSL(copyServiceNameSL);
                } else {
                    if (serviceNameSLShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceNameSL = null;
                    }
                }
            }
            {
                Boolean serviceDescriptionBLShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceDescriptionBL!= null));
                if (serviceDescriptionBLShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceServiceDescriptionBL;
                    sourceServiceDescriptionBL = this.getServiceDescriptionBL();
                    String copyServiceDescriptionBL = ((String) strategy.copy(LocatorUtils.property(locator, "serviceDescriptionBL", sourceServiceDescriptionBL), sourceServiceDescriptionBL, (this.serviceDescriptionBL!= null)));
                    copy.setServiceDescriptionBL(copyServiceDescriptionBL);
                } else {
                    if (serviceDescriptionBLShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceDescriptionBL = null;
                    }
                }
            }
            {
                Boolean serviceDescriptionSLShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceDescriptionSL!= null));
                if (serviceDescriptionSLShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceServiceDescriptionSL;
                    sourceServiceDescriptionSL = this.getServiceDescriptionSL();
                    String copyServiceDescriptionSL = ((String) strategy.copy(LocatorUtils.property(locator, "serviceDescriptionSL", sourceServiceDescriptionSL), sourceServiceDescriptionSL, (this.serviceDescriptionSL!= null)));
                    copy.setServiceDescriptionSL(copyServiceDescriptionSL);
                } else {
                    if (serviceDescriptionSLShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceDescriptionSL = null;
                    }
                }
            }
            {
                Boolean trxTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.trxType!= null));
                if (trxTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTrxType;
                    sourceTrxType = this.getTrxType();
                    String copyTrxType = ((String) strategy.copy(LocatorUtils.property(locator, "trxType", sourceTrxType), sourceTrxType, (this.trxType!= null)));
                    copy.setTrxType(copyTrxType);
                } else {
                    if (trxTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.trxType = null;
                    }
                }
            }
            {
                Boolean serviceLabelShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceLabel!= null));
                if (serviceLabelShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceServiceLabel;
                    sourceServiceLabel = this.getServiceLabel();
                    String copyServiceLabel = ((String) strategy.copy(LocatorUtils.property(locator, "serviceLabel", sourceServiceLabel), sourceServiceLabel, (this.serviceLabel!= null)));
                    copy.setServiceLabel(copyServiceLabel);
                } else {
                    if (serviceLabelShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceLabel = null;
                    }
                }
            }
            {
                Boolean serviceLabel2ShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceLabel2 != null));
                if (serviceLabel2ShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceServiceLabel2;
                    sourceServiceLabel2 = this.getServiceLabel2();
                    String copyServiceLabel2 = ((String) strategy.copy(LocatorUtils.property(locator, "serviceLabel2", sourceServiceLabel2), sourceServiceLabel2, (this.serviceLabel2 != null)));
                    copy.setServiceLabel2(copyServiceLabel2);
                } else {
                    if (serviceLabel2ShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceLabel2 = null;
                    }
                }
            }
            {
                Boolean uPriceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.uPrice!= null));
                if (uPriceShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceUPrice;
                    sourceUPrice = this.getUPrice();
                    String copyUPrice = ((String) strategy.copy(LocatorUtils.property(locator, "uPrice", sourceUPrice), sourceUPrice, (this.uPrice!= null)));
                    copy.setUPrice(copyUPrice);
                } else {
                    if (uPriceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.uPrice = null;
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
                Boolean paymentParametersShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())));
                if (paymentParametersShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ServiceType.PaymentParameters> sourcePaymentParameters;
                    sourcePaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
                    @SuppressWarnings("unchecked")
                    List<ServiceType.PaymentParameters> copyPaymentParameters = ((List<ServiceType.PaymentParameters> ) strategy.copy(LocatorUtils.property(locator, "paymentParameters", sourcePaymentParameters), sourcePaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))));
                    copy.paymentParameters = null;
                    if (copyPaymentParameters!= null) {
                        List<ServiceType.PaymentParameters> uniquePaymentParametersl = copy.getPaymentParameters();
                        uniquePaymentParametersl.addAll(copyPaymentParameters);
                    }
                } else {
                    if (paymentParametersShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.paymentParameters = null;
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
                Boolean vatTrailerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.vatTrailer!= null));
                if (vatTrailerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceVATTrailer;
                    sourceVATTrailer = this.getVatTrailer();
                    String copyVATTrailer = ((String) strategy.copy(LocatorUtils.property(locator, "vatTrailer", sourceVATTrailer), sourceVATTrailer, (this.vatTrailer!= null)));
                    copy.setVatTrailer(copyVATTrailer);
                } else {
                    if (vatTrailerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.vatTrailer = null;
                    }
                }
            }
            {
                Boolean totalOnlyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.totalOnly!= null));
                if (totalOnlyShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTotalOnly;
                    sourceTotalOnly = this.getTotalOnly();
                    String copyTotalOnly = ((String) strategy.copy(LocatorUtils.property(locator, "totalOnly", sourceTotalOnly), sourceTotalOnly, (this.totalOnly!= null)));
                    copy.setTotalOnly(copyTotalOnly);
                } else {
                    if (totalOnlyShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.totalOnly = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ServiceType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ServiceType) {
            final ServiceType target = this;
            final ServiceType leftObject = ((ServiceType) left);
            final ServiceType rightObject = ((ServiceType) right);
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
                Boolean serviceCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceCode!= null), (rightObject.serviceCode!= null));
                if (serviceCodeShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsServiceCode;
                    lhsServiceCode = leftObject.getServiceCode();
                    String rhsServiceCode;
                    rhsServiceCode = rightObject.getServiceCode();
                    String mergedServiceCode = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceCode", lhsServiceCode), LocatorUtils.property(rightLocator, "serviceCode", rhsServiceCode), lhsServiceCode, rhsServiceCode, (leftObject.serviceCode!= null), (rightObject.serviceCode!= null)));
                    target.setServiceCode(mergedServiceCode);
                } else {
                    if (serviceCodeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceCode = null;
                    }
                }
            }
            {
                Boolean inquiryServiceCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.inquiryServiceCode!= null), (rightObject.inquiryServiceCode!= null));
                if (inquiryServiceCodeShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsInquiryServiceCode;
                    lhsInquiryServiceCode = leftObject.getInquiryServiceCode();
                    String rhsInquiryServiceCode;
                    rhsInquiryServiceCode = rightObject.getInquiryServiceCode();
                    String mergedInquiryServiceCode = ((String) strategy.merge(LocatorUtils.property(leftLocator, "inquiryServiceCode", lhsInquiryServiceCode), LocatorUtils.property(rightLocator, "inquiryServiceCode", rhsInquiryServiceCode), lhsInquiryServiceCode, rhsInquiryServiceCode, (leftObject.inquiryServiceCode!= null), (rightObject.inquiryServiceCode!= null)));
                    target.setInquiryServiceCode(mergedInquiryServiceCode);
                } else {
                    if (inquiryServiceCodeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.inquiryServiceCode = null;
                    }
                }
            }
            {
                Boolean serviceNameBLShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceNameBL!= null), (rightObject.serviceNameBL!= null));
                if (serviceNameBLShouldBeMergedAndSet == Boolean.TRUE) {
                    ServiceType.ServiceNameBL lhsServiceNameBL;
                    lhsServiceNameBL = leftObject.getServiceNameBL();
                    ServiceType.ServiceNameBL rhsServiceNameBL;
                    rhsServiceNameBL = rightObject.getServiceNameBL();
                    ServiceType.ServiceNameBL mergedServiceNameBL = ((ServiceType.ServiceNameBL) strategy.merge(LocatorUtils.property(leftLocator, "serviceNameBL", lhsServiceNameBL), LocatorUtils.property(rightLocator, "serviceNameBL", rhsServiceNameBL), lhsServiceNameBL, rhsServiceNameBL, (leftObject.serviceNameBL!= null), (rightObject.serviceNameBL!= null)));
                    target.setServiceNameBL(mergedServiceNameBL);
                } else {
                    if (serviceNameBLShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceNameBL = null;
                    }
                }
            }
            {
                Boolean serviceNameSLShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceNameSL!= null), (rightObject.serviceNameSL!= null));
                if (serviceNameSLShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsServiceNameSL;
                    lhsServiceNameSL = leftObject.getServiceNameSL();
                    String rhsServiceNameSL;
                    rhsServiceNameSL = rightObject.getServiceNameSL();
                    String mergedServiceNameSL = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceNameSL", lhsServiceNameSL), LocatorUtils.property(rightLocator, "serviceNameSL", rhsServiceNameSL), lhsServiceNameSL, rhsServiceNameSL, (leftObject.serviceNameSL!= null), (rightObject.serviceNameSL!= null)));
                    target.setServiceNameSL(mergedServiceNameSL);
                } else {
                    if (serviceNameSLShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceNameSL = null;
                    }
                }
            }
            {
                Boolean serviceDescriptionBLShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceDescriptionBL!= null), (rightObject.serviceDescriptionBL!= null));
                if (serviceDescriptionBLShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsServiceDescriptionBL;
                    lhsServiceDescriptionBL = leftObject.getServiceDescriptionBL();
                    String rhsServiceDescriptionBL;
                    rhsServiceDescriptionBL = rightObject.getServiceDescriptionBL();
                    String mergedServiceDescriptionBL = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceDescriptionBL", lhsServiceDescriptionBL), LocatorUtils.property(rightLocator, "serviceDescriptionBL", rhsServiceDescriptionBL), lhsServiceDescriptionBL, rhsServiceDescriptionBL, (leftObject.serviceDescriptionBL!= null), (rightObject.serviceDescriptionBL!= null)));
                    target.setServiceDescriptionBL(mergedServiceDescriptionBL);
                } else {
                    if (serviceDescriptionBLShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceDescriptionBL = null;
                    }
                }
            }
            {
                Boolean serviceDescriptionSLShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceDescriptionSL!= null), (rightObject.serviceDescriptionSL!= null));
                if (serviceDescriptionSLShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsServiceDescriptionSL;
                    lhsServiceDescriptionSL = leftObject.getServiceDescriptionSL();
                    String rhsServiceDescriptionSL;
                    rhsServiceDescriptionSL = rightObject.getServiceDescriptionSL();
                    String mergedServiceDescriptionSL = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceDescriptionSL", lhsServiceDescriptionSL), LocatorUtils.property(rightLocator, "serviceDescriptionSL", rhsServiceDescriptionSL), lhsServiceDescriptionSL, rhsServiceDescriptionSL, (leftObject.serviceDescriptionSL!= null), (rightObject.serviceDescriptionSL!= null)));
                    target.setServiceDescriptionSL(mergedServiceDescriptionSL);
                } else {
                    if (serviceDescriptionSLShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceDescriptionSL = null;
                    }
                }
            }
            {
                Boolean trxTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.trxType!= null), (rightObject.trxType!= null));
                if (trxTypeShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsTrxType;
                    lhsTrxType = leftObject.getTrxType();
                    String rhsTrxType;
                    rhsTrxType = rightObject.getTrxType();
                    String mergedTrxType = ((String) strategy.merge(LocatorUtils.property(leftLocator, "trxType", lhsTrxType), LocatorUtils.property(rightLocator, "trxType", rhsTrxType), lhsTrxType, rhsTrxType, (leftObject.trxType!= null), (rightObject.trxType!= null)));
                    target.setTrxType(mergedTrxType);
                } else {
                    if (trxTypeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.trxType = null;
                    }
                }
            }
            {
                Boolean serviceLabelShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceLabel!= null), (rightObject.serviceLabel!= null));
                if (serviceLabelShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsServiceLabel;
                    lhsServiceLabel = leftObject.getServiceLabel();
                    String rhsServiceLabel;
                    rhsServiceLabel = rightObject.getServiceLabel();
                    String mergedServiceLabel = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceLabel", lhsServiceLabel), LocatorUtils.property(rightLocator, "serviceLabel", rhsServiceLabel), lhsServiceLabel, rhsServiceLabel, (leftObject.serviceLabel!= null), (rightObject.serviceLabel!= null)));
                    target.setServiceLabel(mergedServiceLabel);
                } else {
                    if (serviceLabelShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceLabel = null;
                    }
                }
            }
            {
                Boolean serviceLabel2ShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceLabel2 != null), (rightObject.serviceLabel2 != null));
                if (serviceLabel2ShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsServiceLabel2;
                    lhsServiceLabel2 = leftObject.getServiceLabel2();
                    String rhsServiceLabel2;
                    rhsServiceLabel2 = rightObject.getServiceLabel2();
                    String mergedServiceLabel2 = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceLabel2", lhsServiceLabel2), LocatorUtils.property(rightLocator, "serviceLabel2", rhsServiceLabel2), lhsServiceLabel2, rhsServiceLabel2, (leftObject.serviceLabel2 != null), (rightObject.serviceLabel2 != null)));
                    target.setServiceLabel2(mergedServiceLabel2);
                } else {
                    if (serviceLabel2ShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceLabel2 = null;
                    }
                }
            }
            {
                Boolean uPriceShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.uPrice!= null), (rightObject.uPrice!= null));
                if (uPriceShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsUPrice;
                    lhsUPrice = leftObject.getUPrice();
                    String rhsUPrice;
                    rhsUPrice = rightObject.getUPrice();
                    String mergedUPrice = ((String) strategy.merge(LocatorUtils.property(leftLocator, "uPrice", lhsUPrice), LocatorUtils.property(rightLocator, "uPrice", rhsUPrice), lhsUPrice, rhsUPrice, (leftObject.uPrice!= null), (rightObject.uPrice!= null)));
                    target.setUPrice(mergedUPrice);
                } else {
                    if (uPriceShouldBeMergedAndSet == Boolean.FALSE) {
                        target.uPrice = null;
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
                Boolean paymentParametersShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.paymentParameters!= null)&&(!leftObject.paymentParameters.isEmpty())), ((rightObject.paymentParameters!= null)&&(!rightObject.paymentParameters.isEmpty())));
                if (paymentParametersShouldBeMergedAndSet == Boolean.TRUE) {
                    List<ServiceType.PaymentParameters> lhsPaymentParameters;
                    lhsPaymentParameters = (((leftObject.paymentParameters!= null)&&(!leftObject.paymentParameters.isEmpty()))?leftObject.getPaymentParameters():null);
                    List<ServiceType.PaymentParameters> rhsPaymentParameters;
                    rhsPaymentParameters = (((rightObject.paymentParameters!= null)&&(!rightObject.paymentParameters.isEmpty()))?rightObject.getPaymentParameters():null);
                    List<ServiceType.PaymentParameters> mergedPaymentParameters = ((List<ServiceType.PaymentParameters> ) strategy.merge(LocatorUtils.property(leftLocator, "paymentParameters", lhsPaymentParameters), LocatorUtils.property(rightLocator, "paymentParameters", rhsPaymentParameters), lhsPaymentParameters, rhsPaymentParameters, ((leftObject.paymentParameters!= null)&&(!leftObject.paymentParameters.isEmpty())), ((rightObject.paymentParameters!= null)&&(!rightObject.paymentParameters.isEmpty()))));
                    target.paymentParameters = null;
                    if (mergedPaymentParameters!= null) {
                        List<ServiceType.PaymentParameters> uniquePaymentParametersl = target.getPaymentParameters();
                        uniquePaymentParametersl.addAll(mergedPaymentParameters);
                    }
                } else {
                    if (paymentParametersShouldBeMergedAndSet == Boolean.FALSE) {
                        target.paymentParameters = null;
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
                Boolean vatTrailerShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.vatTrailer!= null), (rightObject.vatTrailer!= null));
                if (vatTrailerShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsVATTrailer;
                    lhsVATTrailer = leftObject.getVatTrailer();
                    String rhsVATTrailer;
                    rhsVATTrailer = rightObject.getVatTrailer();
                    String mergedVATTrailer = ((String) strategy.merge(LocatorUtils.property(leftLocator, "vatTrailer", lhsVATTrailer), LocatorUtils.property(rightLocator, "vatTrailer", rhsVATTrailer), lhsVATTrailer, rhsVATTrailer, (leftObject.vatTrailer!= null), (rightObject.vatTrailer!= null)));
                    target.setVatTrailer(mergedVATTrailer);
                } else {
                    if (vatTrailerShouldBeMergedAndSet == Boolean.FALSE) {
                        target.vatTrailer = null;
                    }
                }
            }
            {
                Boolean totalOnlyShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.totalOnly!= null), (rightObject.totalOnly!= null));
                if (totalOnlyShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsTotalOnly;
                    lhsTotalOnly = leftObject.getTotalOnly();
                    String rhsTotalOnly;
                    rhsTotalOnly = rightObject.getTotalOnly();
                    String mergedTotalOnly = ((String) strategy.merge(LocatorUtils.property(leftLocator, "totalOnly", lhsTotalOnly), LocatorUtils.property(rightLocator, "totalOnly", rhsTotalOnly), lhsTotalOnly, rhsTotalOnly, (leftObject.totalOnly!= null), (rightObject.totalOnly!= null)));
                    target.setTotalOnly(mergedTotalOnly);
                } else {
                    if (totalOnlyShouldBeMergedAndSet == Boolean.FALSE) {
                        target.totalOnly = null;
                    }
                }
            }
        }
    }

    public void setProductCategories(List<ProductCategoryType> value) {
        this.productCategories = value;
    }

    public void setPaymentParameters(List<ServiceType.PaymentParameters> value) {
        this.paymentParameters = value;
    }

    public void setServiceProducts(List<ServiceProductType> value) {
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
     *         &lt;element name="parameterKey" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="mapping" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="mode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "parameterKey"
    })
    public static class PaymentParameters implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        protected ServiceType.PaymentParameters.ParameterKey parameterKey;

        /**
         * Gets the value of the parameterKey property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceType.PaymentParameters.ParameterKey }
         *     
         */
        public ServiceType.PaymentParameters.ParameterKey getParameterKey() {
            return parameterKey;
        }

        /**
         * Sets the value of the parameterKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceType.PaymentParameters.ParameterKey }
         *     
         */
        public void setParameterKey(ServiceType.PaymentParameters.ParameterKey value) {
            this.parameterKey = value;
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
                ServiceType.PaymentParameters.ParameterKey theParameterKey;
                theParameterKey = this.getParameterKey();
                strategy.appendField(locator, this, "parameterKey", buffer, theParameterKey, (this.parameterKey!= null));
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
            final ServiceType.PaymentParameters that = ((ServiceType.PaymentParameters) object);
            {
                ServiceType.PaymentParameters.ParameterKey lhsParameterKey;
                lhsParameterKey = this.getParameterKey();
                ServiceType.PaymentParameters.ParameterKey rhsParameterKey;
                rhsParameterKey = that.getParameterKey();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "parameterKey", lhsParameterKey), LocatorUtils.property(thatLocator, "parameterKey", rhsParameterKey), lhsParameterKey, rhsParameterKey, (this.parameterKey!= null), (that.parameterKey!= null))) {
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
                ServiceType.PaymentParameters.ParameterKey theParameterKey;
                theParameterKey = this.getParameterKey();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameterKey", theParameterKey), currentHashCode, theParameterKey, (this.parameterKey!= null));
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
            if (draftCopy instanceof ServiceType.PaymentParameters) {
                final ServiceType.PaymentParameters copy = ((ServiceType.PaymentParameters) draftCopy);
                {
                    Boolean parameterKeyShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parameterKey!= null));
                    if (parameterKeyShouldBeCopiedAndSet == Boolean.TRUE) {
                        ServiceType.PaymentParameters.ParameterKey sourceParameterKey;
                        sourceParameterKey = this.getParameterKey();
                        ServiceType.PaymentParameters.ParameterKey copyParameterKey = ((ServiceType.PaymentParameters.ParameterKey) strategy.copy(LocatorUtils.property(locator, "parameterKey", sourceParameterKey), sourceParameterKey, (this.parameterKey!= null)));
                        copy.setParameterKey(copyParameterKey);
                    } else {
                        if (parameterKeyShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.parameterKey = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ServiceType.PaymentParameters();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ServiceType.PaymentParameters) {
                final ServiceType.PaymentParameters target = this;
                final ServiceType.PaymentParameters leftObject = ((ServiceType.PaymentParameters) left);
                final ServiceType.PaymentParameters rightObject = ((ServiceType.PaymentParameters) right);
                {
                    Boolean parameterKeyShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.parameterKey!= null), (rightObject.parameterKey!= null));
                    if (parameterKeyShouldBeMergedAndSet == Boolean.TRUE) {
                        ServiceType.PaymentParameters.ParameterKey lhsParameterKey;
                        lhsParameterKey = leftObject.getParameterKey();
                        ServiceType.PaymentParameters.ParameterKey rhsParameterKey;
                        rhsParameterKey = rightObject.getParameterKey();
                        ServiceType.PaymentParameters.ParameterKey mergedParameterKey = ((ServiceType.PaymentParameters.ParameterKey) strategy.merge(LocatorUtils.property(leftLocator, "parameterKey", lhsParameterKey), LocatorUtils.property(rightLocator, "parameterKey", rhsParameterKey), lhsParameterKey, rhsParameterKey, (leftObject.parameterKey!= null), (rightObject.parameterKey!= null)));
                        target.setParameterKey(mergedParameterKey);
                    } else {
                        if (parameterKeyShouldBeMergedAndSet == Boolean.FALSE) {
                            target.parameterKey = null;
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
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="mapping" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="mode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ParameterKey implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "mapping", required = true)
            protected String mapping;
            @XmlAttribute(name = "mode", required = true)
            protected String mode;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the mapping property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMapping() {
                return mapping;
            }

            /**
             * Sets the value of the mapping property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMapping(String value) {
                this.mapping = value;
            }

            /**
             * Gets the value of the mode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMode() {
                return mode;
            }

            /**
             * Sets the value of the mode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMode(String value) {
                this.mode = value;
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
                    String theValue;
                    theValue = this.getValue();
                    strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
                }
                {
                    String theMapping;
                    theMapping = this.getMapping();
                    strategy.appendField(locator, this, "mapping", buffer, theMapping, (this.mapping!= null));
                }
                {
                    String theMode;
                    theMode = this.getMode();
                    strategy.appendField(locator, this, "mode", buffer, theMode, (this.mode!= null));
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
                final ServiceType.PaymentParameters.ParameterKey that = ((ServiceType.PaymentParameters.ParameterKey) object);
                {
                    String lhsValue;
                    lhsValue = this.getValue();
                    String rhsValue;
                    rhsValue = that.getValue();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                        return false;
                    }
                }
                {
                    String lhsMapping;
                    lhsMapping = this.getMapping();
                    String rhsMapping;
                    rhsMapping = that.getMapping();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "mapping", lhsMapping), LocatorUtils.property(thatLocator, "mapping", rhsMapping), lhsMapping, rhsMapping, (this.mapping!= null), (that.mapping!= null))) {
                        return false;
                    }
                }
                {
                    String lhsMode;
                    lhsMode = this.getMode();
                    String rhsMode;
                    rhsMode = that.getMode();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "mode", lhsMode), LocatorUtils.property(thatLocator, "mode", rhsMode), lhsMode, rhsMode, (this.mode!= null), (that.mode!= null))) {
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
                    String theValue;
                    theValue = this.getValue();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, (this.value!= null));
                }
                {
                    String theMapping;
                    theMapping = this.getMapping();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mapping", theMapping), currentHashCode, theMapping, (this.mapping!= null));
                }
                {
                    String theMode;
                    theMode = this.getMode();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mode", theMode), currentHashCode, theMode, (this.mode!= null));
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
                if (draftCopy instanceof ServiceType.PaymentParameters.ParameterKey) {
                    final ServiceType.PaymentParameters.ParameterKey copy = ((ServiceType.PaymentParameters.ParameterKey) draftCopy);
                    {
                        Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                        if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceValue;
                            sourceValue = this.getValue();
                            String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                            copy.setValue(copyValue);
                        } else {
                            if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.value = null;
                            }
                        }
                    }
                    {
                        Boolean mappingShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mapping!= null));
                        if (mappingShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceMapping;
                            sourceMapping = this.getMapping();
                            String copyMapping = ((String) strategy.copy(LocatorUtils.property(locator, "mapping", sourceMapping), sourceMapping, (this.mapping!= null)));
                            copy.setMapping(copyMapping);
                        } else {
                            if (mappingShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.mapping = null;
                            }
                        }
                    }
                    {
                        Boolean modeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.mode!= null));
                        if (modeShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceMode;
                            sourceMode = this.getMode();
                            String copyMode = ((String) strategy.copy(LocatorUtils.property(locator, "mode", sourceMode), sourceMode, (this.mode!= null)));
                            copy.setMode(copyMode);
                        } else {
                            if (modeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.mode = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new ServiceType.PaymentParameters.ParameterKey();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ServiceType.PaymentParameters.ParameterKey) {
                    final ServiceType.PaymentParameters.ParameterKey target = this;
                    final ServiceType.PaymentParameters.ParameterKey leftObject = ((ServiceType.PaymentParameters.ParameterKey) left);
                    final ServiceType.PaymentParameters.ParameterKey rightObject = ((ServiceType.PaymentParameters.ParameterKey) right);
                    {
                        Boolean valueShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.value!= null), (rightObject.value!= null));
                        if (valueShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsValue;
                            lhsValue = leftObject.getValue();
                            String rhsValue;
                            rhsValue = rightObject.getValue();
                            String mergedValue = ((String) strategy.merge(LocatorUtils.property(leftLocator, "value", lhsValue), LocatorUtils.property(rightLocator, "value", rhsValue), lhsValue, rhsValue, (leftObject.value!= null), (rightObject.value!= null)));
                            target.setValue(mergedValue);
                        } else {
                            if (valueShouldBeMergedAndSet == Boolean.FALSE) {
                                target.value = null;
                            }
                        }
                    }
                    {
                        Boolean mappingShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.mapping!= null), (rightObject.mapping!= null));
                        if (mappingShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsMapping;
                            lhsMapping = leftObject.getMapping();
                            String rhsMapping;
                            rhsMapping = rightObject.getMapping();
                            String mergedMapping = ((String) strategy.merge(LocatorUtils.property(leftLocator, "mapping", lhsMapping), LocatorUtils.property(rightLocator, "mapping", rhsMapping), lhsMapping, rhsMapping, (leftObject.mapping!= null), (rightObject.mapping!= null)));
                            target.setMapping(mergedMapping);
                        } else {
                            if (mappingShouldBeMergedAndSet == Boolean.FALSE) {
                                target.mapping = null;
                            }
                        }
                    }
                    {
                        Boolean modeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.mode!= null), (rightObject.mode!= null));
                        if (modeShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsMode;
                            lhsMode = leftObject.getMode();
                            String rhsMode;
                            rhsMode = rightObject.getMode();
                            String mergedMode = ((String) strategy.merge(LocatorUtils.property(leftLocator, "mode", lhsMode), LocatorUtils.property(rightLocator, "mode", rhsMode), lhsMode, rhsMode, (leftObject.mode!= null), (rightObject.mode!= null)));
                            target.setMode(mergedMode);
                        } else {
                            if (modeShouldBeMergedAndSet == Boolean.FALSE) {
                                target.mode = null;
                            }
                        }
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="print" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ServiceNameBL implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "print")
        protected String print;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the print property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrint() {
            return print;
        }

        /**
         * Sets the value of the print property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrint(String value) {
            this.print = value;
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
                String theValue;
                theValue = this.getValue();
                strategy.appendField(locator, this, "value", buffer, theValue, (this.value!= null));
            }
            {
                String thePrint;
                thePrint = this.getPrint();
                strategy.appendField(locator, this, "print", buffer, thePrint, (this.print!= null));
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
            final ServiceType.ServiceNameBL that = ((ServiceType.ServiceNameBL) object);
            {
                String lhsValue;
                lhsValue = this.getValue();
                String rhsValue;
                rhsValue = that.getValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue, (this.value!= null), (that.value!= null))) {
                    return false;
                }
            }
            {
                String lhsPrint;
                lhsPrint = this.getPrint();
                String rhsPrint;
                rhsPrint = that.getPrint();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "print", lhsPrint), LocatorUtils.property(thatLocator, "print", rhsPrint), lhsPrint, rhsPrint, (this.print!= null), (that.print!= null))) {
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
                String theValue;
                theValue = this.getValue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue, (this.value!= null));
            }
            {
                String thePrint;
                thePrint = this.getPrint();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "print", thePrint), currentHashCode, thePrint, (this.print!= null));
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
            if (draftCopy instanceof ServiceType.ServiceNameBL) {
                final ServiceType.ServiceNameBL copy = ((ServiceType.ServiceNameBL) draftCopy);
                {
                    Boolean valueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.value!= null));
                    if (valueShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceValue;
                        sourceValue = this.getValue();
                        String copyValue = ((String) strategy.copy(LocatorUtils.property(locator, "value", sourceValue), sourceValue, (this.value!= null)));
                        copy.setValue(copyValue);
                    } else {
                        if (valueShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.value = null;
                        }
                    }
                }
                {
                    Boolean printShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.print!= null));
                    if (printShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourcePrint;
                        sourcePrint = this.getPrint();
                        String copyPrint = ((String) strategy.copy(LocatorUtils.property(locator, "print", sourcePrint), sourcePrint, (this.print!= null)));
                        copy.setPrint(copyPrint);
                    } else {
                        if (printShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.print = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ServiceType.ServiceNameBL();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ServiceType.ServiceNameBL) {
                final ServiceType.ServiceNameBL target = this;
                final ServiceType.ServiceNameBL leftObject = ((ServiceType.ServiceNameBL) left);
                final ServiceType.ServiceNameBL rightObject = ((ServiceType.ServiceNameBL) right);
                {
                    Boolean valueShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.value!= null), (rightObject.value!= null));
                    if (valueShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsValue;
                        lhsValue = leftObject.getValue();
                        String rhsValue;
                        rhsValue = rightObject.getValue();
                        String mergedValue = ((String) strategy.merge(LocatorUtils.property(leftLocator, "value", lhsValue), LocatorUtils.property(rightLocator, "value", rhsValue), lhsValue, rhsValue, (leftObject.value!= null), (rightObject.value!= null)));
                        target.setValue(mergedValue);
                    } else {
                        if (valueShouldBeMergedAndSet == Boolean.FALSE) {
                            target.value = null;
                        }
                    }
                }
                {
                    Boolean printShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.print!= null), (rightObject.print!= null));
                    if (printShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsPrint;
                        lhsPrint = leftObject.getPrint();
                        String rhsPrint;
                        rhsPrint = rightObject.getPrint();
                        String mergedPrint = ((String) strategy.merge(LocatorUtils.property(leftLocator, "print", lhsPrint), LocatorUtils.property(rightLocator, "print", rhsPrint), lhsPrint, rhsPrint, (leftObject.print!= null), (rightObject.print!= null)));
                        target.setPrint(mergedPrint);
                    } else {
                        if (printShouldBeMergedAndSet == Boolean.FALSE) {
                            target.print = null;
                        }
                    }
                }
            }
        }

    }

}
