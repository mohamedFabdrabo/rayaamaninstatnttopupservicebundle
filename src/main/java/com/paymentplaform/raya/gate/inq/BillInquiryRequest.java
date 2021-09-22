
package com.paymentplaform.raya.gate.inq;

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
 * <p>Java class for Bill_Inquiry_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bill_Inquiry_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaxRec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cursor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BillReferenceNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaymentParameters" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ParameterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ParameterValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Bill_Inquiry_Request", namespace = "http://raya.paymentplaform.com/gate/inq", propOrder = {
    "rqUID",
    "maxRec",
    "cursor",
    "serviceCode",
    "serviceReferenceNumber",
    "productCode",
    "billReferenceNumber",
    "paymentParameters"
})
public class BillInquiryRequest implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MaxRec")
    protected Integer maxRec;
    @XmlElement(name = "Cursor")
    protected String cursor;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "ServiceReferenceNumber", required = true)
    protected String serviceReferenceNumber;
    @XmlElement(name = "ProductCode")
    protected String productCode;
    @XmlElement(name = "BillReferenceNumber")
    protected String billReferenceNumber;
    @XmlElement(name = "PaymentParameters")
    protected List<BillInquiryRequest.PaymentParameters> paymentParameters;

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
     * Gets the value of the maxRec property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRec() {
        return maxRec;
    }

    /**
     * Sets the value of the maxRec property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRec(Integer value) {
        this.maxRec = value;
    }

    /**
     * Gets the value of the cursor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCursor() {
        return cursor;
    }

    /**
     * Sets the value of the cursor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCursor(String value) {
        this.cursor = value;
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
     * Gets the value of the serviceReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceReferenceNumber() {
        return serviceReferenceNumber;
    }

    /**
     * Sets the value of the serviceReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceReferenceNumber(String value) {
        this.serviceReferenceNumber = value;
    }

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the billReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillReferenceNumber() {
        return billReferenceNumber;
    }

    /**
     * Sets the value of the billReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillReferenceNumber(String value) {
        this.billReferenceNumber = value;
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
     * {@link BillInquiryRequest.PaymentParameters }
     * 
     * 
     */
    public List<BillInquiryRequest.PaymentParameters> getPaymentParameters() {
        if (paymentParameters == null) {
            paymentParameters = new ArrayList<BillInquiryRequest.PaymentParameters>();
        }
        return this.paymentParameters;
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
            String theRqUID;
            theRqUID = this.getRqUID();
            strategy.appendField(locator, this, "rqUID", buffer, theRqUID, (this.rqUID!= null));
        }
        {
            Integer theMaxRec;
            theMaxRec = this.getMaxRec();
            strategy.appendField(locator, this, "maxRec", buffer, theMaxRec, (this.maxRec!= null));
        }
        {
            String theCursor;
            theCursor = this.getCursor();
            strategy.appendField(locator, this, "cursor", buffer, theCursor, (this.cursor!= null));
        }
        {
            String theServiceCode;
            theServiceCode = this.getServiceCode();
            strategy.appendField(locator, this, "serviceCode", buffer, theServiceCode, (this.serviceCode!= null));
        }
        {
            String theServiceReferenceNumber;
            theServiceReferenceNumber = this.getServiceReferenceNumber();
            strategy.appendField(locator, this, "serviceReferenceNumber", buffer, theServiceReferenceNumber, (this.serviceReferenceNumber!= null));
        }
        {
            String theProductCode;
            theProductCode = this.getProductCode();
            strategy.appendField(locator, this, "productCode", buffer, theProductCode, (this.productCode!= null));
        }
        {
            String theBillReferenceNumber;
            theBillReferenceNumber = this.getBillReferenceNumber();
            strategy.appendField(locator, this, "billReferenceNumber", buffer, theBillReferenceNumber, (this.billReferenceNumber!= null));
        }
        {
            List<BillInquiryRequest.PaymentParameters> thePaymentParameters;
            thePaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
            strategy.appendField(locator, this, "paymentParameters", buffer, thePaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())));
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
        final BillInquiryRequest that = ((BillInquiryRequest) object);
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
            Integer lhsMaxRec;
            lhsMaxRec = this.getMaxRec();
            Integer rhsMaxRec;
            rhsMaxRec = that.getMaxRec();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "maxRec", lhsMaxRec), LocatorUtils.property(thatLocator, "maxRec", rhsMaxRec), lhsMaxRec, rhsMaxRec, (this.maxRec!= null), (that.maxRec!= null))) {
                return false;
            }
        }
        {
            String lhsCursor;
            lhsCursor = this.getCursor();
            String rhsCursor;
            rhsCursor = that.getCursor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cursor", lhsCursor), LocatorUtils.property(thatLocator, "cursor", rhsCursor), lhsCursor, rhsCursor, (this.cursor!= null), (that.cursor!= null))) {
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
            String lhsServiceReferenceNumber;
            lhsServiceReferenceNumber = this.getServiceReferenceNumber();
            String rhsServiceReferenceNumber;
            rhsServiceReferenceNumber = that.getServiceReferenceNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceReferenceNumber", lhsServiceReferenceNumber), LocatorUtils.property(thatLocator, "serviceReferenceNumber", rhsServiceReferenceNumber), lhsServiceReferenceNumber, rhsServiceReferenceNumber, (this.serviceReferenceNumber!= null), (that.serviceReferenceNumber!= null))) {
                return false;
            }
        }
        {
            String lhsProductCode;
            lhsProductCode = this.getProductCode();
            String rhsProductCode;
            rhsProductCode = that.getProductCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productCode", lhsProductCode), LocatorUtils.property(thatLocator, "productCode", rhsProductCode), lhsProductCode, rhsProductCode, (this.productCode!= null), (that.productCode!= null))) {
                return false;
            }
        }
        {
            String lhsBillReferenceNumber;
            lhsBillReferenceNumber = this.getBillReferenceNumber();
            String rhsBillReferenceNumber;
            rhsBillReferenceNumber = that.getBillReferenceNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billReferenceNumber", lhsBillReferenceNumber), LocatorUtils.property(thatLocator, "billReferenceNumber", rhsBillReferenceNumber), lhsBillReferenceNumber, rhsBillReferenceNumber, (this.billReferenceNumber!= null), (that.billReferenceNumber!= null))) {
                return false;
            }
        }
        {
            List<BillInquiryRequest.PaymentParameters> lhsPaymentParameters;
            lhsPaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
            List<BillInquiryRequest.PaymentParameters> rhsPaymentParameters;
            rhsPaymentParameters = (((that.paymentParameters!= null)&&(!that.paymentParameters.isEmpty()))?that.getPaymentParameters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "paymentParameters", lhsPaymentParameters), LocatorUtils.property(thatLocator, "paymentParameters", rhsPaymentParameters), lhsPaymentParameters, rhsPaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())), ((that.paymentParameters!= null)&&(!that.paymentParameters.isEmpty())))) {
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
            String theRqUID;
            theRqUID = this.getRqUID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "rqUID", theRqUID), currentHashCode, theRqUID, (this.rqUID!= null));
        }
        {
            Integer theMaxRec;
            theMaxRec = this.getMaxRec();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "maxRec", theMaxRec), currentHashCode, theMaxRec, (this.maxRec!= null));
        }
        {
            String theCursor;
            theCursor = this.getCursor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cursor", theCursor), currentHashCode, theCursor, (this.cursor!= null));
        }
        {
            String theServiceCode;
            theServiceCode = this.getServiceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceCode", theServiceCode), currentHashCode, theServiceCode, (this.serviceCode!= null));
        }
        {
            String theServiceReferenceNumber;
            theServiceReferenceNumber = this.getServiceReferenceNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceReferenceNumber", theServiceReferenceNumber), currentHashCode, theServiceReferenceNumber, (this.serviceReferenceNumber!= null));
        }
        {
            String theProductCode;
            theProductCode = this.getProductCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productCode", theProductCode), currentHashCode, theProductCode, (this.productCode!= null));
        }
        {
            String theBillReferenceNumber;
            theBillReferenceNumber = this.getBillReferenceNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billReferenceNumber", theBillReferenceNumber), currentHashCode, theBillReferenceNumber, (this.billReferenceNumber!= null));
        }
        {
            List<BillInquiryRequest.PaymentParameters> thePaymentParameters;
            thePaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "paymentParameters", thePaymentParameters), currentHashCode, thePaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())));
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
        if (draftCopy instanceof BillInquiryRequest) {
            final BillInquiryRequest copy = ((BillInquiryRequest) draftCopy);
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
                Boolean maxRecShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.maxRec!= null));
                if (maxRecShouldBeCopiedAndSet == Boolean.TRUE) {
                    Integer sourceMaxRec;
                    sourceMaxRec = this.getMaxRec();
                    Integer copyMaxRec = ((Integer) strategy.copy(LocatorUtils.property(locator, "maxRec", sourceMaxRec), sourceMaxRec, (this.maxRec!= null)));
                    copy.setMaxRec(copyMaxRec);
                } else {
                    if (maxRecShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.maxRec = null;
                    }
                }
            }
            {
                Boolean cursorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.cursor!= null));
                if (cursorShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceCursor;
                    sourceCursor = this.getCursor();
                    String copyCursor = ((String) strategy.copy(LocatorUtils.property(locator, "cursor", sourceCursor), sourceCursor, (this.cursor!= null)));
                    copy.setCursor(copyCursor);
                } else {
                    if (cursorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.cursor = null;
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
                Boolean serviceReferenceNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceReferenceNumber!= null));
                if (serviceReferenceNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceServiceReferenceNumber;
                    sourceServiceReferenceNumber = this.getServiceReferenceNumber();
                    String copyServiceReferenceNumber = ((String) strategy.copy(LocatorUtils.property(locator, "serviceReferenceNumber", sourceServiceReferenceNumber), sourceServiceReferenceNumber, (this.serviceReferenceNumber!= null)));
                    copy.setServiceReferenceNumber(copyServiceReferenceNumber);
                } else {
                    if (serviceReferenceNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceReferenceNumber = null;
                    }
                }
            }
            {
                Boolean productCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.productCode!= null));
                if (productCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceProductCode;
                    sourceProductCode = this.getProductCode();
                    String copyProductCode = ((String) strategy.copy(LocatorUtils.property(locator, "productCode", sourceProductCode), sourceProductCode, (this.productCode!= null)));
                    copy.setProductCode(copyProductCode);
                } else {
                    if (productCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.productCode = null;
                    }
                }
            }
            {
                Boolean billReferenceNumberShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.billReferenceNumber!= null));
                if (billReferenceNumberShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceBillReferenceNumber;
                    sourceBillReferenceNumber = this.getBillReferenceNumber();
                    String copyBillReferenceNumber = ((String) strategy.copy(LocatorUtils.property(locator, "billReferenceNumber", sourceBillReferenceNumber), sourceBillReferenceNumber, (this.billReferenceNumber!= null)));
                    copy.setBillReferenceNumber(copyBillReferenceNumber);
                } else {
                    if (billReferenceNumberShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.billReferenceNumber = null;
                    }
                }
            }
            {
                Boolean paymentParametersShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty())));
                if (paymentParametersShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<BillInquiryRequest.PaymentParameters> sourcePaymentParameters;
                    sourcePaymentParameters = (((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))?this.getPaymentParameters():null);
                    @SuppressWarnings("unchecked")
                    List<BillInquiryRequest.PaymentParameters> copyPaymentParameters = ((List<BillInquiryRequest.PaymentParameters> ) strategy.copy(LocatorUtils.property(locator, "paymentParameters", sourcePaymentParameters), sourcePaymentParameters, ((this.paymentParameters!= null)&&(!this.paymentParameters.isEmpty()))));
                    copy.paymentParameters = null;
                    if (copyPaymentParameters!= null) {
                        List<BillInquiryRequest.PaymentParameters> uniquePaymentParametersl = copy.getPaymentParameters();
                        uniquePaymentParametersl.addAll(copyPaymentParameters);
                    }
                } else {
                    if (paymentParametersShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.paymentParameters = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new BillInquiryRequest();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof BillInquiryRequest) {
            final BillInquiryRequest target = this;
            final BillInquiryRequest leftObject = ((BillInquiryRequest) left);
            final BillInquiryRequest rightObject = ((BillInquiryRequest) right);
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
                Boolean maxRecShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.maxRec!= null), (rightObject.maxRec!= null));
                if (maxRecShouldBeMergedAndSet == Boolean.TRUE) {
                    Integer lhsMaxRec;
                    lhsMaxRec = leftObject.getMaxRec();
                    Integer rhsMaxRec;
                    rhsMaxRec = rightObject.getMaxRec();
                    Integer mergedMaxRec = ((Integer) strategy.merge(LocatorUtils.property(leftLocator, "maxRec", lhsMaxRec), LocatorUtils.property(rightLocator, "maxRec", rhsMaxRec), lhsMaxRec, rhsMaxRec, (leftObject.maxRec!= null), (rightObject.maxRec!= null)));
                    target.setMaxRec(mergedMaxRec);
                } else {
                    if (maxRecShouldBeMergedAndSet == Boolean.FALSE) {
                        target.maxRec = null;
                    }
                }
            }
            {
                Boolean cursorShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.cursor!= null), (rightObject.cursor!= null));
                if (cursorShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsCursor;
                    lhsCursor = leftObject.getCursor();
                    String rhsCursor;
                    rhsCursor = rightObject.getCursor();
                    String mergedCursor = ((String) strategy.merge(LocatorUtils.property(leftLocator, "cursor", lhsCursor), LocatorUtils.property(rightLocator, "cursor", rhsCursor), lhsCursor, rhsCursor, (leftObject.cursor!= null), (rightObject.cursor!= null)));
                    target.setCursor(mergedCursor);
                } else {
                    if (cursorShouldBeMergedAndSet == Boolean.FALSE) {
                        target.cursor = null;
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
                Boolean serviceReferenceNumberShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceReferenceNumber!= null), (rightObject.serviceReferenceNumber!= null));
                if (serviceReferenceNumberShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsServiceReferenceNumber;
                    lhsServiceReferenceNumber = leftObject.getServiceReferenceNumber();
                    String rhsServiceReferenceNumber;
                    rhsServiceReferenceNumber = rightObject.getServiceReferenceNumber();
                    String mergedServiceReferenceNumber = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceReferenceNumber", lhsServiceReferenceNumber), LocatorUtils.property(rightLocator, "serviceReferenceNumber", rhsServiceReferenceNumber), lhsServiceReferenceNumber, rhsServiceReferenceNumber, (leftObject.serviceReferenceNumber!= null), (rightObject.serviceReferenceNumber!= null)));
                    target.setServiceReferenceNumber(mergedServiceReferenceNumber);
                } else {
                    if (serviceReferenceNumberShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceReferenceNumber = null;
                    }
                }
            }
            {
                Boolean productCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.productCode!= null), (rightObject.productCode!= null));
                if (productCodeShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsProductCode;
                    lhsProductCode = leftObject.getProductCode();
                    String rhsProductCode;
                    rhsProductCode = rightObject.getProductCode();
                    String mergedProductCode = ((String) strategy.merge(LocatorUtils.property(leftLocator, "productCode", lhsProductCode), LocatorUtils.property(rightLocator, "productCode", rhsProductCode), lhsProductCode, rhsProductCode, (leftObject.productCode!= null), (rightObject.productCode!= null)));
                    target.setProductCode(mergedProductCode);
                } else {
                    if (productCodeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.productCode = null;
                    }
                }
            }
            {
                Boolean billReferenceNumberShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.billReferenceNumber!= null), (rightObject.billReferenceNumber!= null));
                if (billReferenceNumberShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsBillReferenceNumber;
                    lhsBillReferenceNumber = leftObject.getBillReferenceNumber();
                    String rhsBillReferenceNumber;
                    rhsBillReferenceNumber = rightObject.getBillReferenceNumber();
                    String mergedBillReferenceNumber = ((String) strategy.merge(LocatorUtils.property(leftLocator, "billReferenceNumber", lhsBillReferenceNumber), LocatorUtils.property(rightLocator, "billReferenceNumber", rhsBillReferenceNumber), lhsBillReferenceNumber, rhsBillReferenceNumber, (leftObject.billReferenceNumber!= null), (rightObject.billReferenceNumber!= null)));
                    target.setBillReferenceNumber(mergedBillReferenceNumber);
                } else {
                    if (billReferenceNumberShouldBeMergedAndSet == Boolean.FALSE) {
                        target.billReferenceNumber = null;
                    }
                }
            }
            {
                Boolean paymentParametersShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.paymentParameters!= null)&&(!leftObject.paymentParameters.isEmpty())), ((rightObject.paymentParameters!= null)&&(!rightObject.paymentParameters.isEmpty())));
                if (paymentParametersShouldBeMergedAndSet == Boolean.TRUE) {
                    List<BillInquiryRequest.PaymentParameters> lhsPaymentParameters;
                    lhsPaymentParameters = (((leftObject.paymentParameters!= null)&&(!leftObject.paymentParameters.isEmpty()))?leftObject.getPaymentParameters():null);
                    List<BillInquiryRequest.PaymentParameters> rhsPaymentParameters;
                    rhsPaymentParameters = (((rightObject.paymentParameters!= null)&&(!rightObject.paymentParameters.isEmpty()))?rightObject.getPaymentParameters():null);
                    List<BillInquiryRequest.PaymentParameters> mergedPaymentParameters = ((List<BillInquiryRequest.PaymentParameters> ) strategy.merge(LocatorUtils.property(leftLocator, "paymentParameters", lhsPaymentParameters), LocatorUtils.property(rightLocator, "paymentParameters", rhsPaymentParameters), lhsPaymentParameters, rhsPaymentParameters, ((leftObject.paymentParameters!= null)&&(!leftObject.paymentParameters.isEmpty())), ((rightObject.paymentParameters!= null)&&(!rightObject.paymentParameters.isEmpty()))));
                    target.paymentParameters = null;
                    if (mergedPaymentParameters!= null) {
                        List<BillInquiryRequest.PaymentParameters> uniquePaymentParametersl = target.getPaymentParameters();
                        uniquePaymentParametersl.addAll(mergedPaymentParameters);
                    }
                } else {
                    if (paymentParametersShouldBeMergedAndSet == Boolean.FALSE) {
                        target.paymentParameters = null;
                    }
                }
            }
        }
    }

    public void setPaymentParameters(List<BillInquiryRequest.PaymentParameters> value) {
        this.paymentParameters = value;
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
     *         &lt;element name="ParameterKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ParameterValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "parameterKey",
        "parameterValue"
    })
    public static class PaymentParameters implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "ParameterKey")
        protected String parameterKey;
        @XmlElement(name = "ParameterValue")
        protected String parameterValue;

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

        /**
         * Gets the value of the parameterValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParameterValue() {
            return parameterValue;
        }

        /**
         * Sets the value of the parameterValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParameterValue(String value) {
            this.parameterValue = value;
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
            {
                String theParameterValue;
                theParameterValue = this.getParameterValue();
                strategy.appendField(locator, this, "parameterValue", buffer, theParameterValue, (this.parameterValue!= null));
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
            final BillInquiryRequest.PaymentParameters that = ((BillInquiryRequest.PaymentParameters) object);
            {
                String lhsParameterKey;
                lhsParameterKey = this.getParameterKey();
                String rhsParameterKey;
                rhsParameterKey = that.getParameterKey();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "parameterKey", lhsParameterKey), LocatorUtils.property(thatLocator, "parameterKey", rhsParameterKey), lhsParameterKey, rhsParameterKey, (this.parameterKey!= null), (that.parameterKey!= null))) {
                    return false;
                }
            }
            {
                String lhsParameterValue;
                lhsParameterValue = this.getParameterValue();
                String rhsParameterValue;
                rhsParameterValue = that.getParameterValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "parameterValue", lhsParameterValue), LocatorUtils.property(thatLocator, "parameterValue", rhsParameterValue), lhsParameterValue, rhsParameterValue, (this.parameterValue!= null), (that.parameterValue!= null))) {
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
            {
                String theParameterValue;
                theParameterValue = this.getParameterValue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parameterValue", theParameterValue), currentHashCode, theParameterValue, (this.parameterValue!= null));
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
            if (draftCopy instanceof BillInquiryRequest.PaymentParameters) {
                final BillInquiryRequest.PaymentParameters copy = ((BillInquiryRequest.PaymentParameters) draftCopy);
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
                {
                    Boolean parameterValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parameterValue!= null));
                    if (parameterValueShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceParameterValue;
                        sourceParameterValue = this.getParameterValue();
                        String copyParameterValue = ((String) strategy.copy(LocatorUtils.property(locator, "parameterValue", sourceParameterValue), sourceParameterValue, (this.parameterValue!= null)));
                        copy.setParameterValue(copyParameterValue);
                    } else {
                        if (parameterValueShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.parameterValue = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new BillInquiryRequest.PaymentParameters();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof BillInquiryRequest.PaymentParameters) {
                final BillInquiryRequest.PaymentParameters target = this;
                final BillInquiryRequest.PaymentParameters leftObject = ((BillInquiryRequest.PaymentParameters) left);
                final BillInquiryRequest.PaymentParameters rightObject = ((BillInquiryRequest.PaymentParameters) right);
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
                {
                    Boolean parameterValueShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.parameterValue!= null), (rightObject.parameterValue!= null));
                    if (parameterValueShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsParameterValue;
                        lhsParameterValue = leftObject.getParameterValue();
                        String rhsParameterValue;
                        rhsParameterValue = rightObject.getParameterValue();
                        String mergedParameterValue = ((String) strategy.merge(LocatorUtils.property(leftLocator, "parameterValue", lhsParameterValue), LocatorUtils.property(rightLocator, "parameterValue", rhsParameterValue), lhsParameterValue, rhsParameterValue, (leftObject.parameterValue!= null), (rightObject.parameterValue!= null)));
                        target.setParameterValue(mergedParameterValue);
                    } else {
                        if (parameterValueShouldBeMergedAndSet == Boolean.FALSE) {
                            target.parameterValue = null;
                        }
                    }
                }
            }
        }

    }

}
