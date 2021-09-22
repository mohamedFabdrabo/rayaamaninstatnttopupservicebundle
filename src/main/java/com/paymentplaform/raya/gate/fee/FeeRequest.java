
package com.paymentplaform.raya.gate.fee;

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
 * <p>Java class for Fee_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fee_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AsynchUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TerminalId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FeeParameters" maxOccurs="unbounded" minOccurs="0"&gt;
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
@XmlType(name = "Fee_Request", namespace = "http://raya.paymentplaform.com/gate/fee", propOrder = {
    "rqUID",
    "asynchUID",
    "amount",
    "serviceCode",
    "terminalId",
    "feeParameters"
})
public class FeeRequest implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "AsynchUID", required = true)
    protected String asynchUID;
    @XmlElement(name = "Amount", required = true)
    protected String amount;
    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "TerminalId", required = true)
    protected String terminalId;
    @XmlElement(name = "FeeParameters")
    protected List<FeeRequest.FeeParameters> feeParameters;

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
     * Gets the value of the asynchUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsynchUID() {
        return asynchUID;
    }

    /**
     * Sets the value of the asynchUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsynchUID(String value) {
        this.asynchUID = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
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
     * Gets the value of the terminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * Sets the value of the terminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalId(String value) {
        this.terminalId = value;
    }

    /**
     * Gets the value of the feeParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeRequest.FeeParameters }
     * 
     * 
     */
    public List<FeeRequest.FeeParameters> getFeeParameters() {
        if (feeParameters == null) {
            feeParameters = new ArrayList<FeeRequest.FeeParameters>();
        }
        return this.feeParameters;
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
            String theAsynchUID;
            theAsynchUID = this.getAsynchUID();
            strategy.appendField(locator, this, "asynchUID", buffer, theAsynchUID, (this.asynchUID!= null));
        }
        {
            String theAmount;
            theAmount = this.getAmount();
            strategy.appendField(locator, this, "amount", buffer, theAmount, (this.amount!= null));
        }
        {
            String theServiceCode;
            theServiceCode = this.getServiceCode();
            strategy.appendField(locator, this, "serviceCode", buffer, theServiceCode, (this.serviceCode!= null));
        }
        {
            String theTerminalId;
            theTerminalId = this.getTerminalId();
            strategy.appendField(locator, this, "terminalId", buffer, theTerminalId, (this.terminalId!= null));
        }
        {
            List<FeeRequest.FeeParameters> theFeeParameters;
            theFeeParameters = (((this.feeParameters!= null)&&(!this.feeParameters.isEmpty()))?this.getFeeParameters():null);
            strategy.appendField(locator, this, "feeParameters", buffer, theFeeParameters, ((this.feeParameters!= null)&&(!this.feeParameters.isEmpty())));
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
        final FeeRequest that = ((FeeRequest) object);
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
            String lhsAsynchUID;
            lhsAsynchUID = this.getAsynchUID();
            String rhsAsynchUID;
            rhsAsynchUID = that.getAsynchUID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "asynchUID", lhsAsynchUID), LocatorUtils.property(thatLocator, "asynchUID", rhsAsynchUID), lhsAsynchUID, rhsAsynchUID, (this.asynchUID!= null), (that.asynchUID!= null))) {
                return false;
            }
        }
        {
            String lhsAmount;
            lhsAmount = this.getAmount();
            String rhsAmount;
            rhsAmount = that.getAmount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "amount", lhsAmount), LocatorUtils.property(thatLocator, "amount", rhsAmount), lhsAmount, rhsAmount, (this.amount!= null), (that.amount!= null))) {
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
            String lhsTerminalId;
            lhsTerminalId = this.getTerminalId();
            String rhsTerminalId;
            rhsTerminalId = that.getTerminalId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "terminalId", lhsTerminalId), LocatorUtils.property(thatLocator, "terminalId", rhsTerminalId), lhsTerminalId, rhsTerminalId, (this.terminalId!= null), (that.terminalId!= null))) {
                return false;
            }
        }
        {
            List<FeeRequest.FeeParameters> lhsFeeParameters;
            lhsFeeParameters = (((this.feeParameters!= null)&&(!this.feeParameters.isEmpty()))?this.getFeeParameters():null);
            List<FeeRequest.FeeParameters> rhsFeeParameters;
            rhsFeeParameters = (((that.feeParameters!= null)&&(!that.feeParameters.isEmpty()))?that.getFeeParameters():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "feeParameters", lhsFeeParameters), LocatorUtils.property(thatLocator, "feeParameters", rhsFeeParameters), lhsFeeParameters, rhsFeeParameters, ((this.feeParameters!= null)&&(!this.feeParameters.isEmpty())), ((that.feeParameters!= null)&&(!that.feeParameters.isEmpty())))) {
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
            String theAsynchUID;
            theAsynchUID = this.getAsynchUID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "asynchUID", theAsynchUID), currentHashCode, theAsynchUID, (this.asynchUID!= null));
        }
        {
            String theAmount;
            theAmount = this.getAmount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "amount", theAmount), currentHashCode, theAmount, (this.amount!= null));
        }
        {
            String theServiceCode;
            theServiceCode = this.getServiceCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceCode", theServiceCode), currentHashCode, theServiceCode, (this.serviceCode!= null));
        }
        {
            String theTerminalId;
            theTerminalId = this.getTerminalId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "terminalId", theTerminalId), currentHashCode, theTerminalId, (this.terminalId!= null));
        }
        {
            List<FeeRequest.FeeParameters> theFeeParameters;
            theFeeParameters = (((this.feeParameters!= null)&&(!this.feeParameters.isEmpty()))?this.getFeeParameters():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "feeParameters", theFeeParameters), currentHashCode, theFeeParameters, ((this.feeParameters!= null)&&(!this.feeParameters.isEmpty())));
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
        if (draftCopy instanceof FeeRequest) {
            final FeeRequest copy = ((FeeRequest) draftCopy);
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
                Boolean asynchUIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.asynchUID!= null));
                if (asynchUIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAsynchUID;
                    sourceAsynchUID = this.getAsynchUID();
                    String copyAsynchUID = ((String) strategy.copy(LocatorUtils.property(locator, "asynchUID", sourceAsynchUID), sourceAsynchUID, (this.asynchUID!= null)));
                    copy.setAsynchUID(copyAsynchUID);
                } else {
                    if (asynchUIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.asynchUID = null;
                    }
                }
            }
            {
                Boolean amountShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.amount!= null));
                if (amountShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceAmount;
                    sourceAmount = this.getAmount();
                    String copyAmount = ((String) strategy.copy(LocatorUtils.property(locator, "amount", sourceAmount), sourceAmount, (this.amount!= null)));
                    copy.setAmount(copyAmount);
                } else {
                    if (amountShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.amount = null;
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
                Boolean terminalIdShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.terminalId!= null));
                if (terminalIdShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTerminalId;
                    sourceTerminalId = this.getTerminalId();
                    String copyTerminalId = ((String) strategy.copy(LocatorUtils.property(locator, "terminalId", sourceTerminalId), sourceTerminalId, (this.terminalId!= null)));
                    copy.setTerminalId(copyTerminalId);
                } else {
                    if (terminalIdShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.terminalId = null;
                    }
                }
            }
            {
                Boolean feeParametersShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.feeParameters!= null)&&(!this.feeParameters.isEmpty())));
                if (feeParametersShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<FeeRequest.FeeParameters> sourceFeeParameters;
                    sourceFeeParameters = (((this.feeParameters!= null)&&(!this.feeParameters.isEmpty()))?this.getFeeParameters():null);
                    @SuppressWarnings("unchecked")
                    List<FeeRequest.FeeParameters> copyFeeParameters = ((List<FeeRequest.FeeParameters> ) strategy.copy(LocatorUtils.property(locator, "feeParameters", sourceFeeParameters), sourceFeeParameters, ((this.feeParameters!= null)&&(!this.feeParameters.isEmpty()))));
                    copy.feeParameters = null;
                    if (copyFeeParameters!= null) {
                        List<FeeRequest.FeeParameters> uniqueFeeParametersl = copy.getFeeParameters();
                        uniqueFeeParametersl.addAll(copyFeeParameters);
                    }
                } else {
                    if (feeParametersShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.feeParameters = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new FeeRequest();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof FeeRequest) {
            final FeeRequest target = this;
            final FeeRequest leftObject = ((FeeRequest) left);
            final FeeRequest rightObject = ((FeeRequest) right);
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
                Boolean asynchUIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.asynchUID!= null), (rightObject.asynchUID!= null));
                if (asynchUIDShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsAsynchUID;
                    lhsAsynchUID = leftObject.getAsynchUID();
                    String rhsAsynchUID;
                    rhsAsynchUID = rightObject.getAsynchUID();
                    String mergedAsynchUID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "asynchUID", lhsAsynchUID), LocatorUtils.property(rightLocator, "asynchUID", rhsAsynchUID), lhsAsynchUID, rhsAsynchUID, (leftObject.asynchUID!= null), (rightObject.asynchUID!= null)));
                    target.setAsynchUID(mergedAsynchUID);
                } else {
                    if (asynchUIDShouldBeMergedAndSet == Boolean.FALSE) {
                        target.asynchUID = null;
                    }
                }
            }
            {
                Boolean amountShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.amount!= null), (rightObject.amount!= null));
                if (amountShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsAmount;
                    lhsAmount = leftObject.getAmount();
                    String rhsAmount;
                    rhsAmount = rightObject.getAmount();
                    String mergedAmount = ((String) strategy.merge(LocatorUtils.property(leftLocator, "amount", lhsAmount), LocatorUtils.property(rightLocator, "amount", rhsAmount), lhsAmount, rhsAmount, (leftObject.amount!= null), (rightObject.amount!= null)));
                    target.setAmount(mergedAmount);
                } else {
                    if (amountShouldBeMergedAndSet == Boolean.FALSE) {
                        target.amount = null;
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
                Boolean terminalIdShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.terminalId!= null), (rightObject.terminalId!= null));
                if (terminalIdShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsTerminalId;
                    lhsTerminalId = leftObject.getTerminalId();
                    String rhsTerminalId;
                    rhsTerminalId = rightObject.getTerminalId();
                    String mergedTerminalId = ((String) strategy.merge(LocatorUtils.property(leftLocator, "terminalId", lhsTerminalId), LocatorUtils.property(rightLocator, "terminalId", rhsTerminalId), lhsTerminalId, rhsTerminalId, (leftObject.terminalId!= null), (rightObject.terminalId!= null)));
                    target.setTerminalId(mergedTerminalId);
                } else {
                    if (terminalIdShouldBeMergedAndSet == Boolean.FALSE) {
                        target.terminalId = null;
                    }
                }
            }
            {
                Boolean feeParametersShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.feeParameters!= null)&&(!leftObject.feeParameters.isEmpty())), ((rightObject.feeParameters!= null)&&(!rightObject.feeParameters.isEmpty())));
                if (feeParametersShouldBeMergedAndSet == Boolean.TRUE) {
                    List<FeeRequest.FeeParameters> lhsFeeParameters;
                    lhsFeeParameters = (((leftObject.feeParameters!= null)&&(!leftObject.feeParameters.isEmpty()))?leftObject.getFeeParameters():null);
                    List<FeeRequest.FeeParameters> rhsFeeParameters;
                    rhsFeeParameters = (((rightObject.feeParameters!= null)&&(!rightObject.feeParameters.isEmpty()))?rightObject.getFeeParameters():null);
                    List<FeeRequest.FeeParameters> mergedFeeParameters = ((List<FeeRequest.FeeParameters> ) strategy.merge(LocatorUtils.property(leftLocator, "feeParameters", lhsFeeParameters), LocatorUtils.property(rightLocator, "feeParameters", rhsFeeParameters), lhsFeeParameters, rhsFeeParameters, ((leftObject.feeParameters!= null)&&(!leftObject.feeParameters.isEmpty())), ((rightObject.feeParameters!= null)&&(!rightObject.feeParameters.isEmpty()))));
                    target.feeParameters = null;
                    if (mergedFeeParameters!= null) {
                        List<FeeRequest.FeeParameters> uniqueFeeParametersl = target.getFeeParameters();
                        uniqueFeeParametersl.addAll(mergedFeeParameters);
                    }
                } else {
                    if (feeParametersShouldBeMergedAndSet == Boolean.FALSE) {
                        target.feeParameters = null;
                    }
                }
            }
        }
    }

    public void setFeeParameters(List<FeeRequest.FeeParameters> value) {
        this.feeParameters = value;
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
    public static class FeeParameters implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
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
            final FeeRequest.FeeParameters that = ((FeeRequest.FeeParameters) object);
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
            if (draftCopy instanceof FeeRequest.FeeParameters) {
                final FeeRequest.FeeParameters copy = ((FeeRequest.FeeParameters) draftCopy);
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
            return new FeeRequest.FeeParameters();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof FeeRequest.FeeParameters) {
                final FeeRequest.FeeParameters target = this;
                final FeeRequest.FeeParameters leftObject = ((FeeRequest.FeeParameters) left);
                final FeeRequest.FeeParameters rightObject = ((FeeRequest.FeeParameters) right);
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
