
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
 * <p>Java class for ServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="inquiryServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceName_BL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceName_SL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDescription_BL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDescription_SL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLabel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productCategories" type="{http://raya.paymentplaform.com/gate/services/}ProductCategoryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="paymentParameters" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="parameterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="serviceProducts" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="voucherServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *         &lt;element name="serviceCharges" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="charge"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ChargeType" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="SURCHARGE"/&gt;
 *                                   &lt;enumeration value="VAT"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="fixedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="percentageAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="tierFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="tierTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", namespace = "http://raya.paymentplaform.com/gate/services/", propOrder = {
    "serviceCode",
    "inquiryServiceCode",
    "serviceNameBL",
    "serviceNameSL",
    "serviceDescriptionBL",
    "serviceDescriptionSL",
    "trxType",
    "serviceLabel",
    "serviceLabel2",
    "productCategories",
    "paymentParameters",
    "serviceProducts",
    "serviceCharges"
})
public class ServiceType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(required = true)
    protected String serviceCode;
    protected String inquiryServiceCode;
    @XmlElement(name = "ServiceName_BL")
    protected String serviceNameBL;
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
    protected List<ProductCategoryType> productCategories;
    protected List<ServiceType.PaymentParameters> paymentParameters;
    protected List<ServiceType.ServiceProducts> serviceProducts;
    protected List<ServiceType.ServiceCharges> serviceCharges;

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
     *     {@link String }
     *     
     */
    public String getServiceNameBL() {
        return serviceNameBL;
    }

    /**
     * Sets the value of the serviceNameBL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNameBL(String value) {
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
     * {@link ServiceType.ServiceProducts }
     * 
     * 
     */
    public List<ServiceType.ServiceProducts> getServiceProducts() {
        if (serviceProducts == null) {
            serviceProducts = new ArrayList<ServiceType.ServiceProducts>();
        }
        return this.serviceProducts;
    }

    /**
     * Gets the value of the serviceCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType.ServiceCharges }
     * 
     * 
     */
    public List<ServiceType.ServiceCharges> getServiceCharges() {
        if (serviceCharges == null) {
            serviceCharges = new ArrayList<ServiceType.ServiceCharges>();
        }
        return this.serviceCharges;
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
            String theServiceNameBL;
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
            List<ServiceType.ServiceProducts> theServiceProducts;
            theServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
            strategy.appendField(locator, this, "serviceProducts", buffer, theServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty())));
        }
        {
            List<ServiceType.ServiceCharges> theServiceCharges;
            theServiceCharges = (((this.serviceCharges!= null)&&(!this.serviceCharges.isEmpty()))?this.getServiceCharges():null);
            strategy.appendField(locator, this, "serviceCharges", buffer, theServiceCharges, ((this.serviceCharges!= null)&&(!this.serviceCharges.isEmpty())));
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
            String lhsServiceNameBL;
            lhsServiceNameBL = this.getServiceNameBL();
            String rhsServiceNameBL;
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
            List<ServiceType.ServiceProducts> lhsServiceProducts;
            lhsServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
            List<ServiceType.ServiceProducts> rhsServiceProducts;
            rhsServiceProducts = (((that.serviceProducts!= null)&&(!that.serviceProducts.isEmpty()))?that.getServiceProducts():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceProducts", lhsServiceProducts), LocatorUtils.property(thatLocator, "serviceProducts", rhsServiceProducts), lhsServiceProducts, rhsServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty())), ((that.serviceProducts!= null)&&(!that.serviceProducts.isEmpty())))) {
                return false;
            }
        }
        {
            List<ServiceType.ServiceCharges> lhsServiceCharges;
            lhsServiceCharges = (((this.serviceCharges!= null)&&(!this.serviceCharges.isEmpty()))?this.getServiceCharges():null);
            List<ServiceType.ServiceCharges> rhsServiceCharges;
            rhsServiceCharges = (((that.serviceCharges!= null)&&(!that.serviceCharges.isEmpty()))?that.getServiceCharges():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceCharges", lhsServiceCharges), LocatorUtils.property(thatLocator, "serviceCharges", rhsServiceCharges), lhsServiceCharges, rhsServiceCharges, ((this.serviceCharges!= null)&&(!this.serviceCharges.isEmpty())), ((that.serviceCharges!= null)&&(!that.serviceCharges.isEmpty())))) {
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
            String theServiceNameBL;
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
            List<ServiceType.ServiceProducts> theServiceProducts;
            theServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceProducts", theServiceProducts), currentHashCode, theServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty())));
        }
        {
            List<ServiceType.ServiceCharges> theServiceCharges;
            theServiceCharges = (((this.serviceCharges!= null)&&(!this.serviceCharges.isEmpty()))?this.getServiceCharges():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceCharges", theServiceCharges), currentHashCode, theServiceCharges, ((this.serviceCharges!= null)&&(!this.serviceCharges.isEmpty())));
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
                    String sourceServiceNameBL;
                    sourceServiceNameBL = this.getServiceNameBL();
                    String copyServiceNameBL = ((String) strategy.copy(LocatorUtils.property(locator, "serviceNameBL", sourceServiceNameBL), sourceServiceNameBL, (this.serviceNameBL!= null)));
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
                    List<ServiceType.ServiceProducts> sourceServiceProducts;
                    sourceServiceProducts = (((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))?this.getServiceProducts():null);
                    @SuppressWarnings("unchecked")
                    List<ServiceType.ServiceProducts> copyServiceProducts = ((List<ServiceType.ServiceProducts> ) strategy.copy(LocatorUtils.property(locator, "serviceProducts", sourceServiceProducts), sourceServiceProducts, ((this.serviceProducts!= null)&&(!this.serviceProducts.isEmpty()))));
                    copy.serviceProducts = null;
                    if (copyServiceProducts!= null) {
                        List<ServiceType.ServiceProducts> uniqueServiceProductsl = copy.getServiceProducts();
                        uniqueServiceProductsl.addAll(copyServiceProducts);
                    }
                } else {
                    if (serviceProductsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceProducts = null;
                    }
                }
            }
            {
                Boolean serviceChargesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.serviceCharges!= null)&&(!this.serviceCharges.isEmpty())));
                if (serviceChargesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<ServiceType.ServiceCharges> sourceServiceCharges;
                    sourceServiceCharges = (((this.serviceCharges!= null)&&(!this.serviceCharges.isEmpty()))?this.getServiceCharges():null);
                    @SuppressWarnings("unchecked")
                    List<ServiceType.ServiceCharges> copyServiceCharges = ((List<ServiceType.ServiceCharges> ) strategy.copy(LocatorUtils.property(locator, "serviceCharges", sourceServiceCharges), sourceServiceCharges, ((this.serviceCharges!= null)&&(!this.serviceCharges.isEmpty()))));
                    copy.serviceCharges = null;
                    if (copyServiceCharges!= null) {
                        List<ServiceType.ServiceCharges> uniqueServiceChargesl = copy.getServiceCharges();
                        uniqueServiceChargesl.addAll(copyServiceCharges);
                    }
                } else {
                    if (serviceChargesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceCharges = null;
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
                    String lhsServiceNameBL;
                    lhsServiceNameBL = leftObject.getServiceNameBL();
                    String rhsServiceNameBL;
                    rhsServiceNameBL = rightObject.getServiceNameBL();
                    String mergedServiceNameBL = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceNameBL", lhsServiceNameBL), LocatorUtils.property(rightLocator, "serviceNameBL", rhsServiceNameBL), lhsServiceNameBL, rhsServiceNameBL, (leftObject.serviceNameBL!= null), (rightObject.serviceNameBL!= null)));
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
                    List<ServiceType.ServiceProducts> lhsServiceProducts;
                    lhsServiceProducts = (((leftObject.serviceProducts!= null)&&(!leftObject.serviceProducts.isEmpty()))?leftObject.getServiceProducts():null);
                    List<ServiceType.ServiceProducts> rhsServiceProducts;
                    rhsServiceProducts = (((rightObject.serviceProducts!= null)&&(!rightObject.serviceProducts.isEmpty()))?rightObject.getServiceProducts():null);
                    List<ServiceType.ServiceProducts> mergedServiceProducts = ((List<ServiceType.ServiceProducts> ) strategy.merge(LocatorUtils.property(leftLocator, "serviceProducts", lhsServiceProducts), LocatorUtils.property(rightLocator, "serviceProducts", rhsServiceProducts), lhsServiceProducts, rhsServiceProducts, ((leftObject.serviceProducts!= null)&&(!leftObject.serviceProducts.isEmpty())), ((rightObject.serviceProducts!= null)&&(!rightObject.serviceProducts.isEmpty()))));
                    target.serviceProducts = null;
                    if (mergedServiceProducts!= null) {
                        List<ServiceType.ServiceProducts> uniqueServiceProductsl = target.getServiceProducts();
                        uniqueServiceProductsl.addAll(mergedServiceProducts);
                    }
                } else {
                    if (serviceProductsShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceProducts = null;
                    }
                }
            }
            {
                Boolean serviceChargesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.serviceCharges!= null)&&(!leftObject.serviceCharges.isEmpty())), ((rightObject.serviceCharges!= null)&&(!rightObject.serviceCharges.isEmpty())));
                if (serviceChargesShouldBeMergedAndSet == Boolean.TRUE) {
                    List<ServiceType.ServiceCharges> lhsServiceCharges;
                    lhsServiceCharges = (((leftObject.serviceCharges!= null)&&(!leftObject.serviceCharges.isEmpty()))?leftObject.getServiceCharges():null);
                    List<ServiceType.ServiceCharges> rhsServiceCharges;
                    rhsServiceCharges = (((rightObject.serviceCharges!= null)&&(!rightObject.serviceCharges.isEmpty()))?rightObject.getServiceCharges():null);
                    List<ServiceType.ServiceCharges> mergedServiceCharges = ((List<ServiceType.ServiceCharges> ) strategy.merge(LocatorUtils.property(leftLocator, "serviceCharges", lhsServiceCharges), LocatorUtils.property(rightLocator, "serviceCharges", rhsServiceCharges), lhsServiceCharges, rhsServiceCharges, ((leftObject.serviceCharges!= null)&&(!leftObject.serviceCharges.isEmpty())), ((rightObject.serviceCharges!= null)&&(!rightObject.serviceCharges.isEmpty()))));
                    target.serviceCharges = null;
                    if (mergedServiceCharges!= null) {
                        List<ServiceType.ServiceCharges> uniqueServiceChargesl = target.getServiceCharges();
                        uniqueServiceChargesl.addAll(mergedServiceCharges);
                    }
                } else {
                    if (serviceChargesShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceCharges = null;
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

    public void setServiceProducts(List<ServiceType.ServiceProducts> value) {
        this.serviceProducts = value;
    }

    public void setServiceCharges(List<ServiceType.ServiceCharges> value) {
        this.serviceCharges = value;
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
     *         &lt;element name="parameterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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

        protected String parameterKey;

        /**
         * Gets the value of the parameterKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParameterKey() {
            return parameterKey;
        }

        /**
         * Sets the value of the parameterKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParameterKey(String value) {
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
                String theParameterKey;
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
                String lhsParameterKey;
                lhsParameterKey = this.getParameterKey();
                String rhsParameterKey;
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
                String theParameterKey;
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
                        String sourceParameterKey;
                        sourceParameterKey = this.getParameterKey();
                        String copyParameterKey = ((String) strategy.copy(LocatorUtils.property(locator, "parameterKey", sourceParameterKey), sourceParameterKey, (this.parameterKey!= null)));
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
                        String lhsParameterKey;
                        lhsParameterKey = leftObject.getParameterKey();
                        String rhsParameterKey;
                        rhsParameterKey = rightObject.getParameterKey();
                        String mergedParameterKey = ((String) strategy.merge(LocatorUtils.property(leftLocator, "parameterKey", lhsParameterKey), LocatorUtils.property(rightLocator, "parameterKey", rhsParameterKey), lhsParameterKey, rhsParameterKey, (leftObject.parameterKey!= null), (rightObject.parameterKey!= null)));
                        target.setParameterKey(mergedParameterKey);
                    } else {
                        if (parameterKeyShouldBeMergedAndSet == Boolean.FALSE) {
                            target.parameterKey = null;
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="charge"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ChargeType" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="SURCHARGE"/&gt;
     *                         &lt;enumeration value="VAT"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="fixedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="percentageAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="tierFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="tierTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "charge"
    })
    public static class ServiceCharges implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(required = true)
        protected ServiceType.ServiceCharges.Charge charge;

        /**
         * Gets the value of the charge property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceType.ServiceCharges.Charge }
         *     
         */
        public ServiceType.ServiceCharges.Charge getCharge() {
            return charge;
        }

        /**
         * Sets the value of the charge property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceType.ServiceCharges.Charge }
         *     
         */
        public void setCharge(ServiceType.ServiceCharges.Charge value) {
            this.charge = value;
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
                ServiceType.ServiceCharges.Charge theCharge;
                theCharge = this.getCharge();
                strategy.appendField(locator, this, "charge", buffer, theCharge, (this.charge!= null));
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
            final ServiceType.ServiceCharges that = ((ServiceType.ServiceCharges) object);
            {
                ServiceType.ServiceCharges.Charge lhsCharge;
                lhsCharge = this.getCharge();
                ServiceType.ServiceCharges.Charge rhsCharge;
                rhsCharge = that.getCharge();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "charge", lhsCharge), LocatorUtils.property(thatLocator, "charge", rhsCharge), lhsCharge, rhsCharge, (this.charge!= null), (that.charge!= null))) {
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
                ServiceType.ServiceCharges.Charge theCharge;
                theCharge = this.getCharge();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "charge", theCharge), currentHashCode, theCharge, (this.charge!= null));
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
            if (draftCopy instanceof ServiceType.ServiceCharges) {
                final ServiceType.ServiceCharges copy = ((ServiceType.ServiceCharges) draftCopy);
                {
                    Boolean chargeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.charge!= null));
                    if (chargeShouldBeCopiedAndSet == Boolean.TRUE) {
                        ServiceType.ServiceCharges.Charge sourceCharge;
                        sourceCharge = this.getCharge();
                        ServiceType.ServiceCharges.Charge copyCharge = ((ServiceType.ServiceCharges.Charge) strategy.copy(LocatorUtils.property(locator, "charge", sourceCharge), sourceCharge, (this.charge!= null)));
                        copy.setCharge(copyCharge);
                    } else {
                        if (chargeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.charge = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ServiceType.ServiceCharges();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ServiceType.ServiceCharges) {
                final ServiceType.ServiceCharges target = this;
                final ServiceType.ServiceCharges leftObject = ((ServiceType.ServiceCharges) left);
                final ServiceType.ServiceCharges rightObject = ((ServiceType.ServiceCharges) right);
                {
                    Boolean chargeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.charge!= null), (rightObject.charge!= null));
                    if (chargeShouldBeMergedAndSet == Boolean.TRUE) {
                        ServiceType.ServiceCharges.Charge lhsCharge;
                        lhsCharge = leftObject.getCharge();
                        ServiceType.ServiceCharges.Charge rhsCharge;
                        rhsCharge = rightObject.getCharge();
                        ServiceType.ServiceCharges.Charge mergedCharge = ((ServiceType.ServiceCharges.Charge) strategy.merge(LocatorUtils.property(leftLocator, "charge", lhsCharge), LocatorUtils.property(rightLocator, "charge", rhsCharge), lhsCharge, rhsCharge, (leftObject.charge!= null), (rightObject.charge!= null)));
                        target.setCharge(mergedCharge);
                    } else {
                        if (chargeShouldBeMergedAndSet == Boolean.FALSE) {
                            target.charge = null;
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
         *         &lt;element name="ChargeType" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="SURCHARGE"/&gt;
         *               &lt;enumeration value="VAT"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="fixedAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="percentageAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="tierFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="tierTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
            "chargeType",
            "fixedAmount",
            "percentageAmount",
            "tierFrom",
            "tierTo",
            "minimum",
            "maximum"
        })
        public static class Charge implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
        {

            @XmlElement(name = "ChargeType")
            protected String chargeType;
            protected String fixedAmount;
            protected String percentageAmount;
            protected String tierFrom;
            protected String tierTo;
            protected String minimum;
            protected String maximum;

            /**
             * Gets the value of the chargeType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChargeType() {
                return chargeType;
            }

            /**
             * Sets the value of the chargeType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChargeType(String value) {
                this.chargeType = value;
            }

            /**
             * Gets the value of the fixedAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFixedAmount() {
                return fixedAmount;
            }

            /**
             * Sets the value of the fixedAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFixedAmount(String value) {
                this.fixedAmount = value;
            }

            /**
             * Gets the value of the percentageAmount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPercentageAmount() {
                return percentageAmount;
            }

            /**
             * Sets the value of the percentageAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPercentageAmount(String value) {
                this.percentageAmount = value;
            }

            /**
             * Gets the value of the tierFrom property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTierFrom() {
                return tierFrom;
            }

            /**
             * Sets the value of the tierFrom property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTierFrom(String value) {
                this.tierFrom = value;
            }

            /**
             * Gets the value of the tierTo property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTierTo() {
                return tierTo;
            }

            /**
             * Sets the value of the tierTo property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTierTo(String value) {
                this.tierTo = value;
            }

            /**
             * Gets the value of the minimum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinimum() {
                return minimum;
            }

            /**
             * Sets the value of the minimum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinimum(String value) {
                this.minimum = value;
            }

            /**
             * Gets the value of the maximum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaximum() {
                return maximum;
            }

            /**
             * Sets the value of the maximum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaximum(String value) {
                this.maximum = value;
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
                    String theChargeType;
                    theChargeType = this.getChargeType();
                    strategy.appendField(locator, this, "chargeType", buffer, theChargeType, (this.chargeType!= null));
                }
                {
                    String theFixedAmount;
                    theFixedAmount = this.getFixedAmount();
                    strategy.appendField(locator, this, "fixedAmount", buffer, theFixedAmount, (this.fixedAmount!= null));
                }
                {
                    String thePercentageAmount;
                    thePercentageAmount = this.getPercentageAmount();
                    strategy.appendField(locator, this, "percentageAmount", buffer, thePercentageAmount, (this.percentageAmount!= null));
                }
                {
                    String theTierFrom;
                    theTierFrom = this.getTierFrom();
                    strategy.appendField(locator, this, "tierFrom", buffer, theTierFrom, (this.tierFrom!= null));
                }
                {
                    String theTierTo;
                    theTierTo = this.getTierTo();
                    strategy.appendField(locator, this, "tierTo", buffer, theTierTo, (this.tierTo!= null));
                }
                {
                    String theMinimum;
                    theMinimum = this.getMinimum();
                    strategy.appendField(locator, this, "minimum", buffer, theMinimum, (this.minimum!= null));
                }
                {
                    String theMaximum;
                    theMaximum = this.getMaximum();
                    strategy.appendField(locator, this, "maximum", buffer, theMaximum, (this.maximum!= null));
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
                final ServiceType.ServiceCharges.Charge that = ((ServiceType.ServiceCharges.Charge) object);
                {
                    String lhsChargeType;
                    lhsChargeType = this.getChargeType();
                    String rhsChargeType;
                    rhsChargeType = that.getChargeType();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "chargeType", lhsChargeType), LocatorUtils.property(thatLocator, "chargeType", rhsChargeType), lhsChargeType, rhsChargeType, (this.chargeType!= null), (that.chargeType!= null))) {
                        return false;
                    }
                }
                {
                    String lhsFixedAmount;
                    lhsFixedAmount = this.getFixedAmount();
                    String rhsFixedAmount;
                    rhsFixedAmount = that.getFixedAmount();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "fixedAmount", lhsFixedAmount), LocatorUtils.property(thatLocator, "fixedAmount", rhsFixedAmount), lhsFixedAmount, rhsFixedAmount, (this.fixedAmount!= null), (that.fixedAmount!= null))) {
                        return false;
                    }
                }
                {
                    String lhsPercentageAmount;
                    lhsPercentageAmount = this.getPercentageAmount();
                    String rhsPercentageAmount;
                    rhsPercentageAmount = that.getPercentageAmount();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "percentageAmount", lhsPercentageAmount), LocatorUtils.property(thatLocator, "percentageAmount", rhsPercentageAmount), lhsPercentageAmount, rhsPercentageAmount, (this.percentageAmount!= null), (that.percentageAmount!= null))) {
                        return false;
                    }
                }
                {
                    String lhsTierFrom;
                    lhsTierFrom = this.getTierFrom();
                    String rhsTierFrom;
                    rhsTierFrom = that.getTierFrom();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "tierFrom", lhsTierFrom), LocatorUtils.property(thatLocator, "tierFrom", rhsTierFrom), lhsTierFrom, rhsTierFrom, (this.tierFrom!= null), (that.tierFrom!= null))) {
                        return false;
                    }
                }
                {
                    String lhsTierTo;
                    lhsTierTo = this.getTierTo();
                    String rhsTierTo;
                    rhsTierTo = that.getTierTo();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "tierTo", lhsTierTo), LocatorUtils.property(thatLocator, "tierTo", rhsTierTo), lhsTierTo, rhsTierTo, (this.tierTo!= null), (that.tierTo!= null))) {
                        return false;
                    }
                }
                {
                    String lhsMinimum;
                    lhsMinimum = this.getMinimum();
                    String rhsMinimum;
                    rhsMinimum = that.getMinimum();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "minimum", lhsMinimum), LocatorUtils.property(thatLocator, "minimum", rhsMinimum), lhsMinimum, rhsMinimum, (this.minimum!= null), (that.minimum!= null))) {
                        return false;
                    }
                }
                {
                    String lhsMaximum;
                    lhsMaximum = this.getMaximum();
                    String rhsMaximum;
                    rhsMaximum = that.getMaximum();
                    if (!strategy.equals(LocatorUtils.property(thisLocator, "maximum", lhsMaximum), LocatorUtils.property(thatLocator, "maximum", rhsMaximum), lhsMaximum, rhsMaximum, (this.maximum!= null), (that.maximum!= null))) {
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
                    String theChargeType;
                    theChargeType = this.getChargeType();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "chargeType", theChargeType), currentHashCode, theChargeType, (this.chargeType!= null));
                }
                {
                    String theFixedAmount;
                    theFixedAmount = this.getFixedAmount();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fixedAmount", theFixedAmount), currentHashCode, theFixedAmount, (this.fixedAmount!= null));
                }
                {
                    String thePercentageAmount;
                    thePercentageAmount = this.getPercentageAmount();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "percentageAmount", thePercentageAmount), currentHashCode, thePercentageAmount, (this.percentageAmount!= null));
                }
                {
                    String theTierFrom;
                    theTierFrom = this.getTierFrom();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tierFrom", theTierFrom), currentHashCode, theTierFrom, (this.tierFrom!= null));
                }
                {
                    String theTierTo;
                    theTierTo = this.getTierTo();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "tierTo", theTierTo), currentHashCode, theTierTo, (this.tierTo!= null));
                }
                {
                    String theMinimum;
                    theMinimum = this.getMinimum();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "minimum", theMinimum), currentHashCode, theMinimum, (this.minimum!= null));
                }
                {
                    String theMaximum;
                    theMaximum = this.getMaximum();
                    currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maximum", theMaximum), currentHashCode, theMaximum, (this.maximum!= null));
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
                if (draftCopy instanceof ServiceType.ServiceCharges.Charge) {
                    final ServiceType.ServiceCharges.Charge copy = ((ServiceType.ServiceCharges.Charge) draftCopy);
                    {
                        Boolean chargeTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.chargeType!= null));
                        if (chargeTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceChargeType;
                            sourceChargeType = this.getChargeType();
                            String copyChargeType = ((String) strategy.copy(LocatorUtils.property(locator, "chargeType", sourceChargeType), sourceChargeType, (this.chargeType!= null)));
                            copy.setChargeType(copyChargeType);
                        } else {
                            if (chargeTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.chargeType = null;
                            }
                        }
                    }
                    {
                        Boolean fixedAmountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fixedAmount!= null));
                        if (fixedAmountShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceFixedAmount;
                            sourceFixedAmount = this.getFixedAmount();
                            String copyFixedAmount = ((String) strategy.copy(LocatorUtils.property(locator, "fixedAmount", sourceFixedAmount), sourceFixedAmount, (this.fixedAmount!= null)));
                            copy.setFixedAmount(copyFixedAmount);
                        } else {
                            if (fixedAmountShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.fixedAmount = null;
                            }
                        }
                    }
                    {
                        Boolean percentageAmountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.percentageAmount!= null));
                        if (percentageAmountShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourcePercentageAmount;
                            sourcePercentageAmount = this.getPercentageAmount();
                            String copyPercentageAmount = ((String) strategy.copy(LocatorUtils.property(locator, "percentageAmount", sourcePercentageAmount), sourcePercentageAmount, (this.percentageAmount!= null)));
                            copy.setPercentageAmount(copyPercentageAmount);
                        } else {
                            if (percentageAmountShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.percentageAmount = null;
                            }
                        }
                    }
                    {
                        Boolean tierFromShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierFrom!= null));
                        if (tierFromShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceTierFrom;
                            sourceTierFrom = this.getTierFrom();
                            String copyTierFrom = ((String) strategy.copy(LocatorUtils.property(locator, "tierFrom", sourceTierFrom), sourceTierFrom, (this.tierFrom!= null)));
                            copy.setTierFrom(copyTierFrom);
                        } else {
                            if (tierFromShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.tierFrom = null;
                            }
                        }
                    }
                    {
                        Boolean tierToShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.tierTo!= null));
                        if (tierToShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceTierTo;
                            sourceTierTo = this.getTierTo();
                            String copyTierTo = ((String) strategy.copy(LocatorUtils.property(locator, "tierTo", sourceTierTo), sourceTierTo, (this.tierTo!= null)));
                            copy.setTierTo(copyTierTo);
                        } else {
                            if (tierToShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.tierTo = null;
                            }
                        }
                    }
                    {
                        Boolean minimumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.minimum!= null));
                        if (minimumShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceMinimum;
                            sourceMinimum = this.getMinimum();
                            String copyMinimum = ((String) strategy.copy(LocatorUtils.property(locator, "minimum", sourceMinimum), sourceMinimum, (this.minimum!= null)));
                            copy.setMinimum(copyMinimum);
                        } else {
                            if (minimumShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.minimum = null;
                            }
                        }
                    }
                    {
                        Boolean maximumShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maximum!= null));
                        if (maximumShouldBeCopiedAndSet == Boolean.TRUE) {
                            String sourceMaximum;
                            sourceMaximum = this.getMaximum();
                            String copyMaximum = ((String) strategy.copy(LocatorUtils.property(locator, "maximum", sourceMaximum), sourceMaximum, (this.maximum!= null)));
                            copy.setMaximum(copyMaximum);
                        } else {
                            if (maximumShouldBeCopiedAndSet == Boolean.FALSE) {
                                copy.maximum = null;
                            }
                        }
                    }
                }
                return draftCopy;
            }

            public Object createNewInstance() {
                return new ServiceType.ServiceCharges.Charge();
            }

            public void mergeFrom(Object left, Object right) {
                final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
                mergeFrom(null, null, left, right, strategy);
            }

            public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
                if (right instanceof ServiceType.ServiceCharges.Charge) {
                    final ServiceType.ServiceCharges.Charge target = this;
                    final ServiceType.ServiceCharges.Charge leftObject = ((ServiceType.ServiceCharges.Charge) left);
                    final ServiceType.ServiceCharges.Charge rightObject = ((ServiceType.ServiceCharges.Charge) right);
                    {
                        Boolean chargeTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.chargeType!= null), (rightObject.chargeType!= null));
                        if (chargeTypeShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsChargeType;
                            lhsChargeType = leftObject.getChargeType();
                            String rhsChargeType;
                            rhsChargeType = rightObject.getChargeType();
                            String mergedChargeType = ((String) strategy.merge(LocatorUtils.property(leftLocator, "chargeType", lhsChargeType), LocatorUtils.property(rightLocator, "chargeType", rhsChargeType), lhsChargeType, rhsChargeType, (leftObject.chargeType!= null), (rightObject.chargeType!= null)));
                            target.setChargeType(mergedChargeType);
                        } else {
                            if (chargeTypeShouldBeMergedAndSet == Boolean.FALSE) {
                                target.chargeType = null;
                            }
                        }
                    }
                    {
                        Boolean fixedAmountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.fixedAmount!= null), (rightObject.fixedAmount!= null));
                        if (fixedAmountShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsFixedAmount;
                            lhsFixedAmount = leftObject.getFixedAmount();
                            String rhsFixedAmount;
                            rhsFixedAmount = rightObject.getFixedAmount();
                            String mergedFixedAmount = ((String) strategy.merge(LocatorUtils.property(leftLocator, "fixedAmount", lhsFixedAmount), LocatorUtils.property(rightLocator, "fixedAmount", rhsFixedAmount), lhsFixedAmount, rhsFixedAmount, (leftObject.fixedAmount!= null), (rightObject.fixedAmount!= null)));
                            target.setFixedAmount(mergedFixedAmount);
                        } else {
                            if (fixedAmountShouldBeMergedAndSet == Boolean.FALSE) {
                                target.fixedAmount = null;
                            }
                        }
                    }
                    {
                        Boolean percentageAmountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.percentageAmount!= null), (rightObject.percentageAmount!= null));
                        if (percentageAmountShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsPercentageAmount;
                            lhsPercentageAmount = leftObject.getPercentageAmount();
                            String rhsPercentageAmount;
                            rhsPercentageAmount = rightObject.getPercentageAmount();
                            String mergedPercentageAmount = ((String) strategy.merge(LocatorUtils.property(leftLocator, "percentageAmount", lhsPercentageAmount), LocatorUtils.property(rightLocator, "percentageAmount", rhsPercentageAmount), lhsPercentageAmount, rhsPercentageAmount, (leftObject.percentageAmount!= null), (rightObject.percentageAmount!= null)));
                            target.setPercentageAmount(mergedPercentageAmount);
                        } else {
                            if (percentageAmountShouldBeMergedAndSet == Boolean.FALSE) {
                                target.percentageAmount = null;
                            }
                        }
                    }
                    {
                        Boolean tierFromShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.tierFrom!= null), (rightObject.tierFrom!= null));
                        if (tierFromShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsTierFrom;
                            lhsTierFrom = leftObject.getTierFrom();
                            String rhsTierFrom;
                            rhsTierFrom = rightObject.getTierFrom();
                            String mergedTierFrom = ((String) strategy.merge(LocatorUtils.property(leftLocator, "tierFrom", lhsTierFrom), LocatorUtils.property(rightLocator, "tierFrom", rhsTierFrom), lhsTierFrom, rhsTierFrom, (leftObject.tierFrom!= null), (rightObject.tierFrom!= null)));
                            target.setTierFrom(mergedTierFrom);
                        } else {
                            if (tierFromShouldBeMergedAndSet == Boolean.FALSE) {
                                target.tierFrom = null;
                            }
                        }
                    }
                    {
                        Boolean tierToShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.tierTo!= null), (rightObject.tierTo!= null));
                        if (tierToShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsTierTo;
                            lhsTierTo = leftObject.getTierTo();
                            String rhsTierTo;
                            rhsTierTo = rightObject.getTierTo();
                            String mergedTierTo = ((String) strategy.merge(LocatorUtils.property(leftLocator, "tierTo", lhsTierTo), LocatorUtils.property(rightLocator, "tierTo", rhsTierTo), lhsTierTo, rhsTierTo, (leftObject.tierTo!= null), (rightObject.tierTo!= null)));
                            target.setTierTo(mergedTierTo);
                        } else {
                            if (tierToShouldBeMergedAndSet == Boolean.FALSE) {
                                target.tierTo = null;
                            }
                        }
                    }
                    {
                        Boolean minimumShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.minimum!= null), (rightObject.minimum!= null));
                        if (minimumShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsMinimum;
                            lhsMinimum = leftObject.getMinimum();
                            String rhsMinimum;
                            rhsMinimum = rightObject.getMinimum();
                            String mergedMinimum = ((String) strategy.merge(LocatorUtils.property(leftLocator, "minimum", lhsMinimum), LocatorUtils.property(rightLocator, "minimum", rhsMinimum), lhsMinimum, rhsMinimum, (leftObject.minimum!= null), (rightObject.minimum!= null)));
                            target.setMinimum(mergedMinimum);
                        } else {
                            if (minimumShouldBeMergedAndSet == Boolean.FALSE) {
                                target.minimum = null;
                            }
                        }
                    }
                    {
                        Boolean maximumShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.maximum!= null), (rightObject.maximum!= null));
                        if (maximumShouldBeMergedAndSet == Boolean.TRUE) {
                            String lhsMaximum;
                            lhsMaximum = leftObject.getMaximum();
                            String rhsMaximum;
                            rhsMaximum = rightObject.getMaximum();
                            String mergedMaximum = ((String) strategy.merge(LocatorUtils.property(leftLocator, "maximum", lhsMaximum), LocatorUtils.property(rightLocator, "maximum", rhsMaximum), lhsMaximum, rhsMaximum, (leftObject.maximum!= null), (rightObject.maximum!= null)));
                            target.setMaximum(mergedMaximum);
                        } else {
                            if (maximumShouldBeMergedAndSet == Boolean.FALSE) {
                                target.maximum = null;
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
        "voucherServiceCode",
        "productDisplayNameAr",
        "productDisplayNameEn",
        "productPrice",
        "productUrl",
        "productDisplaySnippetAr",
        "productDisplaySnippetEn",
        "productLogoUrl"
    })
    public static class ServiceProducts implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
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
            return buffer;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final ServiceType.ServiceProducts that = ((ServiceType.ServiceProducts) object);
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
            if (draftCopy instanceof ServiceType.ServiceProducts) {
                final ServiceType.ServiceProducts copy = ((ServiceType.ServiceProducts) draftCopy);
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
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new ServiceType.ServiceProducts();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof ServiceType.ServiceProducts) {
                final ServiceType.ServiceProducts target = this;
                final ServiceType.ServiceProducts leftObject = ((ServiceType.ServiceProducts) left);
                final ServiceType.ServiceProducts rightObject = ((ServiceType.ServiceProducts) right);
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
            }
        }

    }

}
