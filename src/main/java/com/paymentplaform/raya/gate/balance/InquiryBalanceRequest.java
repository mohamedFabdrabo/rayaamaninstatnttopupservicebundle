
package com.paymentplaform.raya.gate.balance;

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
 * <p>Java class for Inquiry_Balance_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Inquiry_Balance_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaxRec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cursor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequesterIdentifier"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="RequesterPIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TransactionSubType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DemandAccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtraAttributes" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="attributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="attributeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Inquiry_Balance_Request", namespace = "http://raya.paymentplaform.com/gate/balance", propOrder = {
    "rqUID",
    "maxRec",
    "cursor",
    "requesterIdentifier",
    "transactionSubType",
    "demandAccountNo",
    "extraAttributes"
})
public class InquiryBalanceRequest implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MaxRec")
    protected Integer maxRec;
    @XmlElement(name = "Cursor")
    protected String cursor;
    @XmlElement(name = "RequesterIdentifier", required = true)
    protected InquiryBalanceRequest.RequesterIdentifier requesterIdentifier;
    @XmlElement(name = "TransactionSubType", required = true)
    protected String transactionSubType;
    @XmlElement(name = "DemandAccountNo")
    protected String demandAccountNo;
    @XmlElement(name = "ExtraAttributes")
    protected List<InquiryBalanceRequest.ExtraAttributes> extraAttributes;

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
     * Gets the value of the requesterIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryBalanceRequest.RequesterIdentifier }
     *     
     */
    public InquiryBalanceRequest.RequesterIdentifier getRequesterIdentifier() {
        return requesterIdentifier;
    }

    /**
     * Sets the value of the requesterIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryBalanceRequest.RequesterIdentifier }
     *     
     */
    public void setRequesterIdentifier(InquiryBalanceRequest.RequesterIdentifier value) {
        this.requesterIdentifier = value;
    }

    /**
     * Gets the value of the transactionSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionSubType() {
        return transactionSubType;
    }

    /**
     * Sets the value of the transactionSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionSubType(String value) {
        this.transactionSubType = value;
    }

    /**
     * Gets the value of the demandAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemandAccountNo() {
        return demandAccountNo;
    }

    /**
     * Sets the value of the demandAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemandAccountNo(String value) {
        this.demandAccountNo = value;
    }

    /**
     * Gets the value of the extraAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InquiryBalanceRequest.ExtraAttributes }
     * 
     * 
     */
    public List<InquiryBalanceRequest.ExtraAttributes> getExtraAttributes() {
        if (extraAttributes == null) {
            extraAttributes = new ArrayList<InquiryBalanceRequest.ExtraAttributes>();
        }
        return this.extraAttributes;
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
            InquiryBalanceRequest.RequesterIdentifier theRequesterIdentifier;
            theRequesterIdentifier = this.getRequesterIdentifier();
            strategy.appendField(locator, this, "requesterIdentifier", buffer, theRequesterIdentifier, (this.requesterIdentifier!= null));
        }
        {
            String theTransactionSubType;
            theTransactionSubType = this.getTransactionSubType();
            strategy.appendField(locator, this, "transactionSubType", buffer, theTransactionSubType, (this.transactionSubType!= null));
        }
        {
            String theDemandAccountNo;
            theDemandAccountNo = this.getDemandAccountNo();
            strategy.appendField(locator, this, "demandAccountNo", buffer, theDemandAccountNo, (this.demandAccountNo!= null));
        }
        {
            List<InquiryBalanceRequest.ExtraAttributes> theExtraAttributes;
            theExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            strategy.appendField(locator, this, "extraAttributes", buffer, theExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
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
        final InquiryBalanceRequest that = ((InquiryBalanceRequest) object);
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
            InquiryBalanceRequest.RequesterIdentifier lhsRequesterIdentifier;
            lhsRequesterIdentifier = this.getRequesterIdentifier();
            InquiryBalanceRequest.RequesterIdentifier rhsRequesterIdentifier;
            rhsRequesterIdentifier = that.getRequesterIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requesterIdentifier", lhsRequesterIdentifier), LocatorUtils.property(thatLocator, "requesterIdentifier", rhsRequesterIdentifier), lhsRequesterIdentifier, rhsRequesterIdentifier, (this.requesterIdentifier!= null), (that.requesterIdentifier!= null))) {
                return false;
            }
        }
        {
            String lhsTransactionSubType;
            lhsTransactionSubType = this.getTransactionSubType();
            String rhsTransactionSubType;
            rhsTransactionSubType = that.getTransactionSubType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionSubType", lhsTransactionSubType), LocatorUtils.property(thatLocator, "transactionSubType", rhsTransactionSubType), lhsTransactionSubType, rhsTransactionSubType, (this.transactionSubType!= null), (that.transactionSubType!= null))) {
                return false;
            }
        }
        {
            String lhsDemandAccountNo;
            lhsDemandAccountNo = this.getDemandAccountNo();
            String rhsDemandAccountNo;
            rhsDemandAccountNo = that.getDemandAccountNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "demandAccountNo", lhsDemandAccountNo), LocatorUtils.property(thatLocator, "demandAccountNo", rhsDemandAccountNo), lhsDemandAccountNo, rhsDemandAccountNo, (this.demandAccountNo!= null), (that.demandAccountNo!= null))) {
                return false;
            }
        }
        {
            List<InquiryBalanceRequest.ExtraAttributes> lhsExtraAttributes;
            lhsExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            List<InquiryBalanceRequest.ExtraAttributes> rhsExtraAttributes;
            rhsExtraAttributes = (((that.extraAttributes!= null)&&(!that.extraAttributes.isEmpty()))?that.getExtraAttributes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(thatLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())), ((that.extraAttributes!= null)&&(!that.extraAttributes.isEmpty())))) {
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
            InquiryBalanceRequest.RequesterIdentifier theRequesterIdentifier;
            theRequesterIdentifier = this.getRequesterIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requesterIdentifier", theRequesterIdentifier), currentHashCode, theRequesterIdentifier, (this.requesterIdentifier!= null));
        }
        {
            String theTransactionSubType;
            theTransactionSubType = this.getTransactionSubType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionSubType", theTransactionSubType), currentHashCode, theTransactionSubType, (this.transactionSubType!= null));
        }
        {
            String theDemandAccountNo;
            theDemandAccountNo = this.getDemandAccountNo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "demandAccountNo", theDemandAccountNo), currentHashCode, theDemandAccountNo, (this.demandAccountNo!= null));
        }
        {
            List<InquiryBalanceRequest.ExtraAttributes> theExtraAttributes;
            theExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extraAttributes", theExtraAttributes), currentHashCode, theExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
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
        if (draftCopy instanceof InquiryBalanceRequest) {
            final InquiryBalanceRequest copy = ((InquiryBalanceRequest) draftCopy);
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
                Boolean requesterIdentifierShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.requesterIdentifier!= null));
                if (requesterIdentifierShouldBeCopiedAndSet == Boolean.TRUE) {
                    InquiryBalanceRequest.RequesterIdentifier sourceRequesterIdentifier;
                    sourceRequesterIdentifier = this.getRequesterIdentifier();
                    InquiryBalanceRequest.RequesterIdentifier copyRequesterIdentifier = ((InquiryBalanceRequest.RequesterIdentifier) strategy.copy(LocatorUtils.property(locator, "requesterIdentifier", sourceRequesterIdentifier), sourceRequesterIdentifier, (this.requesterIdentifier!= null)));
                    copy.setRequesterIdentifier(copyRequesterIdentifier);
                } else {
                    if (requesterIdentifierShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.requesterIdentifier = null;
                    }
                }
            }
            {
                Boolean transactionSubTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.transactionSubType!= null));
                if (transactionSubTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTransactionSubType;
                    sourceTransactionSubType = this.getTransactionSubType();
                    String copyTransactionSubType = ((String) strategy.copy(LocatorUtils.property(locator, "transactionSubType", sourceTransactionSubType), sourceTransactionSubType, (this.transactionSubType!= null)));
                    copy.setTransactionSubType(copyTransactionSubType);
                } else {
                    if (transactionSubTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.transactionSubType = null;
                    }
                }
            }
            {
                Boolean demandAccountNoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.demandAccountNo!= null));
                if (demandAccountNoShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceDemandAccountNo;
                    sourceDemandAccountNo = this.getDemandAccountNo();
                    String copyDemandAccountNo = ((String) strategy.copy(LocatorUtils.property(locator, "demandAccountNo", sourceDemandAccountNo), sourceDemandAccountNo, (this.demandAccountNo!= null)));
                    copy.setDemandAccountNo(copyDemandAccountNo);
                } else {
                    if (demandAccountNoShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.demandAccountNo = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<InquiryBalanceRequest.ExtraAttributes> sourceExtraAttributes;
                    sourceExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
                    @SuppressWarnings("unchecked")
                    List<InquiryBalanceRequest.ExtraAttributes> copyExtraAttributes = ((List<InquiryBalanceRequest.ExtraAttributes> ) strategy.copy(LocatorUtils.property(locator, "extraAttributes", sourceExtraAttributes), sourceExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))));
                    copy.extraAttributes = null;
                    if (copyExtraAttributes!= null) {
                        List<InquiryBalanceRequest.ExtraAttributes> uniqueExtraAttributesl = copy.getExtraAttributes();
                        uniqueExtraAttributesl.addAll(copyExtraAttributes);
                    }
                } else {
                    if (extraAttributesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.extraAttributes = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new InquiryBalanceRequest();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof InquiryBalanceRequest) {
            final InquiryBalanceRequest target = this;
            final InquiryBalanceRequest leftObject = ((InquiryBalanceRequest) left);
            final InquiryBalanceRequest rightObject = ((InquiryBalanceRequest) right);
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
                Boolean requesterIdentifierShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.requesterIdentifier!= null), (rightObject.requesterIdentifier!= null));
                if (requesterIdentifierShouldBeMergedAndSet == Boolean.TRUE) {
                    InquiryBalanceRequest.RequesterIdentifier lhsRequesterIdentifier;
                    lhsRequesterIdentifier = leftObject.getRequesterIdentifier();
                    InquiryBalanceRequest.RequesterIdentifier rhsRequesterIdentifier;
                    rhsRequesterIdentifier = rightObject.getRequesterIdentifier();
                    InquiryBalanceRequest.RequesterIdentifier mergedRequesterIdentifier = ((InquiryBalanceRequest.RequesterIdentifier) strategy.merge(LocatorUtils.property(leftLocator, "requesterIdentifier", lhsRequesterIdentifier), LocatorUtils.property(rightLocator, "requesterIdentifier", rhsRequesterIdentifier), lhsRequesterIdentifier, rhsRequesterIdentifier, (leftObject.requesterIdentifier!= null), (rightObject.requesterIdentifier!= null)));
                    target.setRequesterIdentifier(mergedRequesterIdentifier);
                } else {
                    if (requesterIdentifierShouldBeMergedAndSet == Boolean.FALSE) {
                        target.requesterIdentifier = null;
                    }
                }
            }
            {
                Boolean transactionSubTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.transactionSubType!= null), (rightObject.transactionSubType!= null));
                if (transactionSubTypeShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsTransactionSubType;
                    lhsTransactionSubType = leftObject.getTransactionSubType();
                    String rhsTransactionSubType;
                    rhsTransactionSubType = rightObject.getTransactionSubType();
                    String mergedTransactionSubType = ((String) strategy.merge(LocatorUtils.property(leftLocator, "transactionSubType", lhsTransactionSubType), LocatorUtils.property(rightLocator, "transactionSubType", rhsTransactionSubType), lhsTransactionSubType, rhsTransactionSubType, (leftObject.transactionSubType!= null), (rightObject.transactionSubType!= null)));
                    target.setTransactionSubType(mergedTransactionSubType);
                } else {
                    if (transactionSubTypeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.transactionSubType = null;
                    }
                }
            }
            {
                Boolean demandAccountNoShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.demandAccountNo!= null), (rightObject.demandAccountNo!= null));
                if (demandAccountNoShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsDemandAccountNo;
                    lhsDemandAccountNo = leftObject.getDemandAccountNo();
                    String rhsDemandAccountNo;
                    rhsDemandAccountNo = rightObject.getDemandAccountNo();
                    String mergedDemandAccountNo = ((String) strategy.merge(LocatorUtils.property(leftLocator, "demandAccountNo", lhsDemandAccountNo), LocatorUtils.property(rightLocator, "demandAccountNo", rhsDemandAccountNo), lhsDemandAccountNo, rhsDemandAccountNo, (leftObject.demandAccountNo!= null), (rightObject.demandAccountNo!= null)));
                    target.setDemandAccountNo(mergedDemandAccountNo);
                } else {
                    if (demandAccountNoShouldBeMergedAndSet == Boolean.FALSE) {
                        target.demandAccountNo = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeMergedAndSet == Boolean.TRUE) {
                    List<InquiryBalanceRequest.ExtraAttributes> lhsExtraAttributes;
                    lhsExtraAttributes = (((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty()))?leftObject.getExtraAttributes():null);
                    List<InquiryBalanceRequest.ExtraAttributes> rhsExtraAttributes;
                    rhsExtraAttributes = (((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))?rightObject.getExtraAttributes():null);
                    List<InquiryBalanceRequest.ExtraAttributes> mergedExtraAttributes = ((List<InquiryBalanceRequest.ExtraAttributes> ) strategy.merge(LocatorUtils.property(leftLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(rightLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))));
                    target.extraAttributes = null;
                    if (mergedExtraAttributes!= null) {
                        List<InquiryBalanceRequest.ExtraAttributes> uniqueExtraAttributesl = target.getExtraAttributes();
                        uniqueExtraAttributesl.addAll(mergedExtraAttributes);
                    }
                } else {
                    if (extraAttributesShouldBeMergedAndSet == Boolean.FALSE) {
                        target.extraAttributes = null;
                    }
                }
            }
        }
    }

    public void setExtraAttributes(List<InquiryBalanceRequest.ExtraAttributes> value) {
        this.extraAttributes = value;
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
     *         &lt;element name="attributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="attributeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "attributeName",
        "attributeValue"
    })
    public static class ExtraAttributes implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        protected String attributeName;
        protected String attributeValue;

        /**
         * Gets the value of the attributeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeName() {
            return attributeName;
        }

        /**
         * Sets the value of the attributeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeName(String value) {
            this.attributeName = value;
        }

        /**
         * Gets the value of the attributeValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttributeValue() {
            return attributeValue;
        }

        /**
         * Sets the value of the attributeValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttributeValue(String value) {
            this.attributeValue = value;
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
                String theAttributeName;
                theAttributeName = this.getAttributeName();
                strategy.appendField(locator, this, "attributeName", buffer, theAttributeName, (this.attributeName!= null));
            }
            {
                String theAttributeValue;
                theAttributeValue = this.getAttributeValue();
                strategy.appendField(locator, this, "attributeValue", buffer, theAttributeValue, (this.attributeValue!= null));
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
            final InquiryBalanceRequest.ExtraAttributes that = ((InquiryBalanceRequest.ExtraAttributes) object);
            {
                String lhsAttributeName;
                lhsAttributeName = this.getAttributeName();
                String rhsAttributeName;
                rhsAttributeName = that.getAttributeName();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "attributeName", lhsAttributeName), LocatorUtils.property(thatLocator, "attributeName", rhsAttributeName), lhsAttributeName, rhsAttributeName, (this.attributeName!= null), (that.attributeName!= null))) {
                    return false;
                }
            }
            {
                String lhsAttributeValue;
                lhsAttributeValue = this.getAttributeValue();
                String rhsAttributeValue;
                rhsAttributeValue = that.getAttributeValue();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "attributeValue", lhsAttributeValue), LocatorUtils.property(thatLocator, "attributeValue", rhsAttributeValue), lhsAttributeValue, rhsAttributeValue, (this.attributeValue!= null), (that.attributeValue!= null))) {
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
                String theAttributeName;
                theAttributeName = this.getAttributeName();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributeName", theAttributeName), currentHashCode, theAttributeName, (this.attributeName!= null));
            }
            {
                String theAttributeValue;
                theAttributeValue = this.getAttributeValue();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributeValue", theAttributeValue), currentHashCode, theAttributeValue, (this.attributeValue!= null));
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
            if (draftCopy instanceof InquiryBalanceRequest.ExtraAttributes) {
                final InquiryBalanceRequest.ExtraAttributes copy = ((InquiryBalanceRequest.ExtraAttributes) draftCopy);
                {
                    Boolean attributeNameShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.attributeName!= null));
                    if (attributeNameShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceAttributeName;
                        sourceAttributeName = this.getAttributeName();
                        String copyAttributeName = ((String) strategy.copy(LocatorUtils.property(locator, "attributeName", sourceAttributeName), sourceAttributeName, (this.attributeName!= null)));
                        copy.setAttributeName(copyAttributeName);
                    } else {
                        if (attributeNameShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.attributeName = null;
                        }
                    }
                }
                {
                    Boolean attributeValueShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.attributeValue!= null));
                    if (attributeValueShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceAttributeValue;
                        sourceAttributeValue = this.getAttributeValue();
                        String copyAttributeValue = ((String) strategy.copy(LocatorUtils.property(locator, "attributeValue", sourceAttributeValue), sourceAttributeValue, (this.attributeValue!= null)));
                        copy.setAttributeValue(copyAttributeValue);
                    } else {
                        if (attributeValueShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.attributeValue = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new InquiryBalanceRequest.ExtraAttributes();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InquiryBalanceRequest.ExtraAttributes) {
                final InquiryBalanceRequest.ExtraAttributes target = this;
                final InquiryBalanceRequest.ExtraAttributes leftObject = ((InquiryBalanceRequest.ExtraAttributes) left);
                final InquiryBalanceRequest.ExtraAttributes rightObject = ((InquiryBalanceRequest.ExtraAttributes) right);
                {
                    Boolean attributeNameShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.attributeName!= null), (rightObject.attributeName!= null));
                    if (attributeNameShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsAttributeName;
                        lhsAttributeName = leftObject.getAttributeName();
                        String rhsAttributeName;
                        rhsAttributeName = rightObject.getAttributeName();
                        String mergedAttributeName = ((String) strategy.merge(LocatorUtils.property(leftLocator, "attributeName", lhsAttributeName), LocatorUtils.property(rightLocator, "attributeName", rhsAttributeName), lhsAttributeName, rhsAttributeName, (leftObject.attributeName!= null), (rightObject.attributeName!= null)));
                        target.setAttributeName(mergedAttributeName);
                    } else {
                        if (attributeNameShouldBeMergedAndSet == Boolean.FALSE) {
                            target.attributeName = null;
                        }
                    }
                }
                {
                    Boolean attributeValueShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.attributeValue!= null), (rightObject.attributeValue!= null));
                    if (attributeValueShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsAttributeValue;
                        lhsAttributeValue = leftObject.getAttributeValue();
                        String rhsAttributeValue;
                        rhsAttributeValue = rightObject.getAttributeValue();
                        String mergedAttributeValue = ((String) strategy.merge(LocatorUtils.property(leftLocator, "attributeValue", lhsAttributeValue), LocatorUtils.property(rightLocator, "attributeValue", rhsAttributeValue), lhsAttributeValue, rhsAttributeValue, (leftObject.attributeValue!= null), (rightObject.attributeValue!= null)));
                        target.setAttributeValue(mergedAttributeValue);
                    } else {
                        if (attributeValueShouldBeMergedAndSet == Boolean.FALSE) {
                            target.attributeValue = null;
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
     *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="RequesterPIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "accountNo",
        "requesterPIN"
    })
    public static class RequesterIdentifier implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "AccountNo", required = true)
        protected String accountNo;
        @XmlElement(name = "RequesterPIN", required = true)
        protected String requesterPIN;

        /**
         * Gets the value of the accountNo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountNo() {
            return accountNo;
        }

        /**
         * Sets the value of the accountNo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountNo(String value) {
            this.accountNo = value;
        }

        /**
         * Gets the value of the requesterPIN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequesterPIN() {
            return requesterPIN;
        }

        /**
         * Sets the value of the requesterPIN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequesterPIN(String value) {
            this.requesterPIN = value;
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
                String theAccountNo;
                theAccountNo = this.getAccountNo();
                strategy.appendField(locator, this, "accountNo", buffer, theAccountNo, (this.accountNo!= null));
            }
            {
                String theRequesterPIN;
                theRequesterPIN = this.getRequesterPIN();
                strategy.appendField(locator, this, "requesterPIN", buffer, theRequesterPIN, (this.requesterPIN!= null));
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
            final InquiryBalanceRequest.RequesterIdentifier that = ((InquiryBalanceRequest.RequesterIdentifier) object);
            {
                String lhsAccountNo;
                lhsAccountNo = this.getAccountNo();
                String rhsAccountNo;
                rhsAccountNo = that.getAccountNo();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "accountNo", lhsAccountNo), LocatorUtils.property(thatLocator, "accountNo", rhsAccountNo), lhsAccountNo, rhsAccountNo, (this.accountNo!= null), (that.accountNo!= null))) {
                    return false;
                }
            }
            {
                String lhsRequesterPIN;
                lhsRequesterPIN = this.getRequesterPIN();
                String rhsRequesterPIN;
                rhsRequesterPIN = that.getRequesterPIN();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "requesterPIN", lhsRequesterPIN), LocatorUtils.property(thatLocator, "requesterPIN", rhsRequesterPIN), lhsRequesterPIN, rhsRequesterPIN, (this.requesterPIN!= null), (that.requesterPIN!= null))) {
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
                String theAccountNo;
                theAccountNo = this.getAccountNo();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "accountNo", theAccountNo), currentHashCode, theAccountNo, (this.accountNo!= null));
            }
            {
                String theRequesterPIN;
                theRequesterPIN = this.getRequesterPIN();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requesterPIN", theRequesterPIN), currentHashCode, theRequesterPIN, (this.requesterPIN!= null));
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
            if (draftCopy instanceof InquiryBalanceRequest.RequesterIdentifier) {
                final InquiryBalanceRequest.RequesterIdentifier copy = ((InquiryBalanceRequest.RequesterIdentifier) draftCopy);
                {
                    Boolean accountNoShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.accountNo!= null));
                    if (accountNoShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceAccountNo;
                        sourceAccountNo = this.getAccountNo();
                        String copyAccountNo = ((String) strategy.copy(LocatorUtils.property(locator, "accountNo", sourceAccountNo), sourceAccountNo, (this.accountNo!= null)));
                        copy.setAccountNo(copyAccountNo);
                    } else {
                        if (accountNoShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.accountNo = null;
                        }
                    }
                }
                {
                    Boolean requesterPINShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.requesterPIN!= null));
                    if (requesterPINShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceRequesterPIN;
                        sourceRequesterPIN = this.getRequesterPIN();
                        String copyRequesterPIN = ((String) strategy.copy(LocatorUtils.property(locator, "requesterPIN", sourceRequesterPIN), sourceRequesterPIN, (this.requesterPIN!= null)));
                        copy.setRequesterPIN(copyRequesterPIN);
                    } else {
                        if (requesterPINShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.requesterPIN = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new InquiryBalanceRequest.RequesterIdentifier();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof InquiryBalanceRequest.RequesterIdentifier) {
                final InquiryBalanceRequest.RequesterIdentifier target = this;
                final InquiryBalanceRequest.RequesterIdentifier leftObject = ((InquiryBalanceRequest.RequesterIdentifier) left);
                final InquiryBalanceRequest.RequesterIdentifier rightObject = ((InquiryBalanceRequest.RequesterIdentifier) right);
                {
                    Boolean accountNoShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.accountNo!= null), (rightObject.accountNo!= null));
                    if (accountNoShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsAccountNo;
                        lhsAccountNo = leftObject.getAccountNo();
                        String rhsAccountNo;
                        rhsAccountNo = rightObject.getAccountNo();
                        String mergedAccountNo = ((String) strategy.merge(LocatorUtils.property(leftLocator, "accountNo", lhsAccountNo), LocatorUtils.property(rightLocator, "accountNo", rhsAccountNo), lhsAccountNo, rhsAccountNo, (leftObject.accountNo!= null), (rightObject.accountNo!= null)));
                        target.setAccountNo(mergedAccountNo);
                    } else {
                        if (accountNoShouldBeMergedAndSet == Boolean.FALSE) {
                            target.accountNo = null;
                        }
                    }
                }
                {
                    Boolean requesterPINShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.requesterPIN!= null), (rightObject.requesterPIN!= null));
                    if (requesterPINShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsRequesterPIN;
                        lhsRequesterPIN = leftObject.getRequesterPIN();
                        String rhsRequesterPIN;
                        rhsRequesterPIN = rightObject.getRequesterPIN();
                        String mergedRequesterPIN = ((String) strategy.merge(LocatorUtils.property(leftLocator, "requesterPIN", lhsRequesterPIN), LocatorUtils.property(rightLocator, "requesterPIN", rhsRequesterPIN), lhsRequesterPIN, rhsRequesterPIN, (leftObject.requesterPIN!= null), (rightObject.requesterPIN!= null)));
                        target.setRequesterPIN(mergedRequesterPIN);
                    } else {
                        if (requesterPINShouldBeMergedAndSet == Boolean.FALSE) {
                            target.requesterPIN = null;
                        }
                    }
                }
            }
        }

    }

}
