
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
 * <p>Java class for LoadSDPaginationReqType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoadSDPaginationReqType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="PAG"/&gt;
 *               &lt;enumeration value="NORM"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pagination" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="parentID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="parentType"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="PROV"/&gt;
 *                         &lt;enumeration value="SERVCAT"/&gt;
 *                         &lt;enumeration value="SERVSUBCAT"/&gt;
 *                         &lt;enumeration value="SERV"/&gt;
 *                         &lt;enumeration value="PRODCAT"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="queryType" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="SERVCAT"/&gt;
 *                         &lt;enumeration value="SERVSUBCAT"/&gt;
 *                         &lt;enumeration value="SERV"/&gt;
 *                         &lt;enumeration value="PRODCAT"/&gt;
 *                         &lt;enumeration value="PROD"/&gt;
 *                         &lt;enumeration value="DEFAULT"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="begin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="txnType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="TRANSFER"/&gt;
 *               &lt;enumeration value="PURCHASE"/&gt;
 *               &lt;enumeration value="PREPAID"/&gt;
 *               &lt;enumeration value="POSTPAID"/&gt;
 *               &lt;enumeration value="EVOUCHERS"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="serviceGroup" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="TELECOM"/&gt;
 *               &lt;enumeration value="CHARITY"/&gt;
 *               &lt;enumeration value="INSURANCE"/&gt;
 *               &lt;enumeration value="EDUCATION"/&gt;
 *               &lt;enumeration value="ALL"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "LoadSDPaginationReqType", namespace = "http://raya.paymentplaform.com/gate/pagservice", propOrder = {
    "mode",
    "pagination",
    "txnType",
    "serviceGroup",
    "extraAttributes"
})
public class LoadSDPaginationReqType implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(required = true)
    protected String mode;
    protected LoadSDPaginationReqType.Pagination pagination;
    protected String txnType;
    protected String serviceGroup;
    @XmlElement(name = "ExtraAttributes")
    protected List<LoadSDPaginationReqType.ExtraAttributes> extraAttributes;

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

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link LoadSDPaginationReqType.Pagination }
     *     
     */
    public LoadSDPaginationReqType.Pagination getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadSDPaginationReqType.Pagination }
     *     
     */
    public void setPagination(LoadSDPaginationReqType.Pagination value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the txnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnType() {
        return txnType;
    }

    /**
     * Sets the value of the txnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnType(String value) {
        this.txnType = value;
    }

    /**
     * Gets the value of the serviceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceGroup() {
        return serviceGroup;
    }

    /**
     * Sets the value of the serviceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceGroup(String value) {
        this.serviceGroup = value;
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
     * {@link LoadSDPaginationReqType.ExtraAttributes }
     * 
     * 
     */
    public List<LoadSDPaginationReqType.ExtraAttributes> getExtraAttributes() {
        if (extraAttributes == null) {
            extraAttributes = new ArrayList<LoadSDPaginationReqType.ExtraAttributes>();
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
            String theMode;
            theMode = this.getMode();
            strategy.appendField(locator, this, "mode", buffer, theMode, (this.mode!= null));
        }
        {
            LoadSDPaginationReqType.Pagination thePagination;
            thePagination = this.getPagination();
            strategy.appendField(locator, this, "pagination", buffer, thePagination, (this.pagination!= null));
        }
        {
            String theTxnType;
            theTxnType = this.getTxnType();
            strategy.appendField(locator, this, "txnType", buffer, theTxnType, (this.txnType!= null));
        }
        {
            String theServiceGroup;
            theServiceGroup = this.getServiceGroup();
            strategy.appendField(locator, this, "serviceGroup", buffer, theServiceGroup, (this.serviceGroup!= null));
        }
        {
            List<LoadSDPaginationReqType.ExtraAttributes> theExtraAttributes;
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
        final LoadSDPaginationReqType that = ((LoadSDPaginationReqType) object);
        {
            String lhsMode;
            lhsMode = this.getMode();
            String rhsMode;
            rhsMode = that.getMode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mode", lhsMode), LocatorUtils.property(thatLocator, "mode", rhsMode), lhsMode, rhsMode, (this.mode!= null), (that.mode!= null))) {
                return false;
            }
        }
        {
            LoadSDPaginationReqType.Pagination lhsPagination;
            lhsPagination = this.getPagination();
            LoadSDPaginationReqType.Pagination rhsPagination;
            rhsPagination = that.getPagination();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pagination", lhsPagination), LocatorUtils.property(thatLocator, "pagination", rhsPagination), lhsPagination, rhsPagination, (this.pagination!= null), (that.pagination!= null))) {
                return false;
            }
        }
        {
            String lhsTxnType;
            lhsTxnType = this.getTxnType();
            String rhsTxnType;
            rhsTxnType = that.getTxnType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "txnType", lhsTxnType), LocatorUtils.property(thatLocator, "txnType", rhsTxnType), lhsTxnType, rhsTxnType, (this.txnType!= null), (that.txnType!= null))) {
                return false;
            }
        }
        {
            String lhsServiceGroup;
            lhsServiceGroup = this.getServiceGroup();
            String rhsServiceGroup;
            rhsServiceGroup = that.getServiceGroup();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceGroup", lhsServiceGroup), LocatorUtils.property(thatLocator, "serviceGroup", rhsServiceGroup), lhsServiceGroup, rhsServiceGroup, (this.serviceGroup!= null), (that.serviceGroup!= null))) {
                return false;
            }
        }
        {
            List<LoadSDPaginationReqType.ExtraAttributes> lhsExtraAttributes;
            lhsExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            List<LoadSDPaginationReqType.ExtraAttributes> rhsExtraAttributes;
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
            String theMode;
            theMode = this.getMode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mode", theMode), currentHashCode, theMode, (this.mode!= null));
        }
        {
            LoadSDPaginationReqType.Pagination thePagination;
            thePagination = this.getPagination();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pagination", thePagination), currentHashCode, thePagination, (this.pagination!= null));
        }
        {
            String theTxnType;
            theTxnType = this.getTxnType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "txnType", theTxnType), currentHashCode, theTxnType, (this.txnType!= null));
        }
        {
            String theServiceGroup;
            theServiceGroup = this.getServiceGroup();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceGroup", theServiceGroup), currentHashCode, theServiceGroup, (this.serviceGroup!= null));
        }
        {
            List<LoadSDPaginationReqType.ExtraAttributes> theExtraAttributes;
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
        if (draftCopy instanceof LoadSDPaginationReqType) {
            final LoadSDPaginationReqType copy = ((LoadSDPaginationReqType) draftCopy);
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
            {
                Boolean paginationShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pagination!= null));
                if (paginationShouldBeCopiedAndSet == Boolean.TRUE) {
                    LoadSDPaginationReqType.Pagination sourcePagination;
                    sourcePagination = this.getPagination();
                    LoadSDPaginationReqType.Pagination copyPagination = ((LoadSDPaginationReqType.Pagination) strategy.copy(LocatorUtils.property(locator, "pagination", sourcePagination), sourcePagination, (this.pagination!= null)));
                    copy.setPagination(copyPagination);
                } else {
                    if (paginationShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.pagination = null;
                    }
                }
            }
            {
                Boolean txnTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.txnType!= null));
                if (txnTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTxnType;
                    sourceTxnType = this.getTxnType();
                    String copyTxnType = ((String) strategy.copy(LocatorUtils.property(locator, "txnType", sourceTxnType), sourceTxnType, (this.txnType!= null)));
                    copy.setTxnType(copyTxnType);
                } else {
                    if (txnTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.txnType = null;
                    }
                }
            }
            {
                Boolean serviceGroupShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serviceGroup!= null));
                if (serviceGroupShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceServiceGroup;
                    sourceServiceGroup = this.getServiceGroup();
                    String copyServiceGroup = ((String) strategy.copy(LocatorUtils.property(locator, "serviceGroup", sourceServiceGroup), sourceServiceGroup, (this.serviceGroup!= null)));
                    copy.setServiceGroup(copyServiceGroup);
                } else {
                    if (serviceGroupShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serviceGroup = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<LoadSDPaginationReqType.ExtraAttributes> sourceExtraAttributes;
                    sourceExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
                    @SuppressWarnings("unchecked")
                    List<LoadSDPaginationReqType.ExtraAttributes> copyExtraAttributes = ((List<LoadSDPaginationReqType.ExtraAttributes> ) strategy.copy(LocatorUtils.property(locator, "extraAttributes", sourceExtraAttributes), sourceExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))));
                    copy.extraAttributes = null;
                    if (copyExtraAttributes!= null) {
                        List<LoadSDPaginationReqType.ExtraAttributes> uniqueExtraAttributesl = copy.getExtraAttributes();
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
        return new LoadSDPaginationReqType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof LoadSDPaginationReqType) {
            final LoadSDPaginationReqType target = this;
            final LoadSDPaginationReqType leftObject = ((LoadSDPaginationReqType) left);
            final LoadSDPaginationReqType rightObject = ((LoadSDPaginationReqType) right);
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
            {
                Boolean paginationShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.pagination!= null), (rightObject.pagination!= null));
                if (paginationShouldBeMergedAndSet == Boolean.TRUE) {
                    LoadSDPaginationReqType.Pagination lhsPagination;
                    lhsPagination = leftObject.getPagination();
                    LoadSDPaginationReqType.Pagination rhsPagination;
                    rhsPagination = rightObject.getPagination();
                    LoadSDPaginationReqType.Pagination mergedPagination = ((LoadSDPaginationReqType.Pagination) strategy.merge(LocatorUtils.property(leftLocator, "pagination", lhsPagination), LocatorUtils.property(rightLocator, "pagination", rhsPagination), lhsPagination, rhsPagination, (leftObject.pagination!= null), (rightObject.pagination!= null)));
                    target.setPagination(mergedPagination);
                } else {
                    if (paginationShouldBeMergedAndSet == Boolean.FALSE) {
                        target.pagination = null;
                    }
                }
            }
            {
                Boolean txnTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.txnType!= null), (rightObject.txnType!= null));
                if (txnTypeShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsTxnType;
                    lhsTxnType = leftObject.getTxnType();
                    String rhsTxnType;
                    rhsTxnType = rightObject.getTxnType();
                    String mergedTxnType = ((String) strategy.merge(LocatorUtils.property(leftLocator, "txnType", lhsTxnType), LocatorUtils.property(rightLocator, "txnType", rhsTxnType), lhsTxnType, rhsTxnType, (leftObject.txnType!= null), (rightObject.txnType!= null)));
                    target.setTxnType(mergedTxnType);
                } else {
                    if (txnTypeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.txnType = null;
                    }
                }
            }
            {
                Boolean serviceGroupShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serviceGroup!= null), (rightObject.serviceGroup!= null));
                if (serviceGroupShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsServiceGroup;
                    lhsServiceGroup = leftObject.getServiceGroup();
                    String rhsServiceGroup;
                    rhsServiceGroup = rightObject.getServiceGroup();
                    String mergedServiceGroup = ((String) strategy.merge(LocatorUtils.property(leftLocator, "serviceGroup", lhsServiceGroup), LocatorUtils.property(rightLocator, "serviceGroup", rhsServiceGroup), lhsServiceGroup, rhsServiceGroup, (leftObject.serviceGroup!= null), (rightObject.serviceGroup!= null)));
                    target.setServiceGroup(mergedServiceGroup);
                } else {
                    if (serviceGroupShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serviceGroup = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeMergedAndSet == Boolean.TRUE) {
                    List<LoadSDPaginationReqType.ExtraAttributes> lhsExtraAttributes;
                    lhsExtraAttributes = (((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty()))?leftObject.getExtraAttributes():null);
                    List<LoadSDPaginationReqType.ExtraAttributes> rhsExtraAttributes;
                    rhsExtraAttributes = (((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))?rightObject.getExtraAttributes():null);
                    List<LoadSDPaginationReqType.ExtraAttributes> mergedExtraAttributes = ((List<LoadSDPaginationReqType.ExtraAttributes> ) strategy.merge(LocatorUtils.property(leftLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(rightLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))));
                    target.extraAttributes = null;
                    if (mergedExtraAttributes!= null) {
                        List<LoadSDPaginationReqType.ExtraAttributes> uniqueExtraAttributesl = target.getExtraAttributes();
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

    public void setExtraAttributes(List<LoadSDPaginationReqType.ExtraAttributes> value) {
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
            final LoadSDPaginationReqType.ExtraAttributes that = ((LoadSDPaginationReqType.ExtraAttributes) object);
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
            if (draftCopy instanceof LoadSDPaginationReqType.ExtraAttributes) {
                final LoadSDPaginationReqType.ExtraAttributes copy = ((LoadSDPaginationReqType.ExtraAttributes) draftCopy);
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
            return new LoadSDPaginationReqType.ExtraAttributes();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof LoadSDPaginationReqType.ExtraAttributes) {
                final LoadSDPaginationReqType.ExtraAttributes target = this;
                final LoadSDPaginationReqType.ExtraAttributes leftObject = ((LoadSDPaginationReqType.ExtraAttributes) left);
                final LoadSDPaginationReqType.ExtraAttributes rightObject = ((LoadSDPaginationReqType.ExtraAttributes) right);
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
     *         &lt;element name="parentID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="parentType"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="PROV"/&gt;
     *               &lt;enumeration value="SERVCAT"/&gt;
     *               &lt;enumeration value="SERVSUBCAT"/&gt;
     *               &lt;enumeration value="SERV"/&gt;
     *               &lt;enumeration value="PRODCAT"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="queryType" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="SERVCAT"/&gt;
     *               &lt;enumeration value="SERVSUBCAT"/&gt;
     *               &lt;enumeration value="SERV"/&gt;
     *               &lt;enumeration value="PRODCAT"/&gt;
     *               &lt;enumeration value="PROD"/&gt;
     *               &lt;enumeration value="DEFAULT"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="begin" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
        "parentID",
        "parentType",
        "queryType",
        "begin",
        "size"
    })
    public static class Pagination implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(required = true)
        protected String parentID;
        @XmlElement(required = true)
        protected String parentType;
        protected String queryType;
        protected Integer begin;
        protected Integer size;

        /**
         * Gets the value of the parentID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentID() {
            return parentID;
        }

        /**
         * Sets the value of the parentID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentID(String value) {
            this.parentID = value;
        }

        /**
         * Gets the value of the parentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentType() {
            return parentType;
        }

        /**
         * Sets the value of the parentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentType(String value) {
            this.parentType = value;
        }

        /**
         * Gets the value of the queryType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueryType() {
            return queryType;
        }

        /**
         * Sets the value of the queryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueryType(String value) {
            this.queryType = value;
        }

        /**
         * Gets the value of the begin property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBegin() {
            return begin;
        }

        /**
         * Sets the value of the begin property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBegin(Integer value) {
            this.begin = value;
        }

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSize(Integer value) {
            this.size = value;
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
                String theParentID;
                theParentID = this.getParentID();
                strategy.appendField(locator, this, "parentID", buffer, theParentID, (this.parentID!= null));
            }
            {
                String theParentType;
                theParentType = this.getParentType();
                strategy.appendField(locator, this, "parentType", buffer, theParentType, (this.parentType!= null));
            }
            {
                String theQueryType;
                theQueryType = this.getQueryType();
                strategy.appendField(locator, this, "queryType", buffer, theQueryType, (this.queryType!= null));
            }
            {
                Integer theBegin;
                theBegin = this.getBegin();
                strategy.appendField(locator, this, "begin", buffer, theBegin, (this.begin!= null));
            }
            {
                Integer theSize;
                theSize = this.getSize();
                strategy.appendField(locator, this, "size", buffer, theSize, (this.size!= null));
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
            final LoadSDPaginationReqType.Pagination that = ((LoadSDPaginationReqType.Pagination) object);
            {
                String lhsParentID;
                lhsParentID = this.getParentID();
                String rhsParentID;
                rhsParentID = that.getParentID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "parentID", lhsParentID), LocatorUtils.property(thatLocator, "parentID", rhsParentID), lhsParentID, rhsParentID, (this.parentID!= null), (that.parentID!= null))) {
                    return false;
                }
            }
            {
                String lhsParentType;
                lhsParentType = this.getParentType();
                String rhsParentType;
                rhsParentType = that.getParentType();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "parentType", lhsParentType), LocatorUtils.property(thatLocator, "parentType", rhsParentType), lhsParentType, rhsParentType, (this.parentType!= null), (that.parentType!= null))) {
                    return false;
                }
            }
            {
                String lhsQueryType;
                lhsQueryType = this.getQueryType();
                String rhsQueryType;
                rhsQueryType = that.getQueryType();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "queryType", lhsQueryType), LocatorUtils.property(thatLocator, "queryType", rhsQueryType), lhsQueryType, rhsQueryType, (this.queryType!= null), (that.queryType!= null))) {
                    return false;
                }
            }
            {
                Integer lhsBegin;
                lhsBegin = this.getBegin();
                Integer rhsBegin;
                rhsBegin = that.getBegin();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "begin", lhsBegin), LocatorUtils.property(thatLocator, "begin", rhsBegin), lhsBegin, rhsBegin, (this.begin!= null), (that.begin!= null))) {
                    return false;
                }
            }
            {
                Integer lhsSize;
                lhsSize = this.getSize();
                Integer rhsSize;
                rhsSize = that.getSize();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "size", lhsSize), LocatorUtils.property(thatLocator, "size", rhsSize), lhsSize, rhsSize, (this.size!= null), (that.size!= null))) {
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
                String theParentID;
                theParentID = this.getParentID();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentID", theParentID), currentHashCode, theParentID, (this.parentID!= null));
            }
            {
                String theParentType;
                theParentType = this.getParentType();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentType", theParentType), currentHashCode, theParentType, (this.parentType!= null));
            }
            {
                String theQueryType;
                theQueryType = this.getQueryType();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "queryType", theQueryType), currentHashCode, theQueryType, (this.queryType!= null));
            }
            {
                Integer theBegin;
                theBegin = this.getBegin();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "begin", theBegin), currentHashCode, theBegin, (this.begin!= null));
            }
            {
                Integer theSize;
                theSize = this.getSize();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "size", theSize), currentHashCode, theSize, (this.size!= null));
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
            if (draftCopy instanceof LoadSDPaginationReqType.Pagination) {
                final LoadSDPaginationReqType.Pagination copy = ((LoadSDPaginationReqType.Pagination) draftCopy);
                {
                    Boolean parentIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parentID!= null));
                    if (parentIDShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceParentID;
                        sourceParentID = this.getParentID();
                        String copyParentID = ((String) strategy.copy(LocatorUtils.property(locator, "parentID", sourceParentID), sourceParentID, (this.parentID!= null)));
                        copy.setParentID(copyParentID);
                    } else {
                        if (parentIDShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.parentID = null;
                        }
                    }
                }
                {
                    Boolean parentTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.parentType!= null));
                    if (parentTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceParentType;
                        sourceParentType = this.getParentType();
                        String copyParentType = ((String) strategy.copy(LocatorUtils.property(locator, "parentType", sourceParentType), sourceParentType, (this.parentType!= null)));
                        copy.setParentType(copyParentType);
                    } else {
                        if (parentTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.parentType = null;
                        }
                    }
                }
                {
                    Boolean queryTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.queryType!= null));
                    if (queryTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceQueryType;
                        sourceQueryType = this.getQueryType();
                        String copyQueryType = ((String) strategy.copy(LocatorUtils.property(locator, "queryType", sourceQueryType), sourceQueryType, (this.queryType!= null)));
                        copy.setQueryType(copyQueryType);
                    } else {
                        if (queryTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.queryType = null;
                        }
                    }
                }
                {
                    Boolean beginShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.begin!= null));
                    if (beginShouldBeCopiedAndSet == Boolean.TRUE) {
                        Integer sourceBegin;
                        sourceBegin = this.getBegin();
                        Integer copyBegin = ((Integer) strategy.copy(LocatorUtils.property(locator, "begin", sourceBegin), sourceBegin, (this.begin!= null)));
                        copy.setBegin(copyBegin);
                    } else {
                        if (beginShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.begin = null;
                        }
                    }
                }
                {
                    Boolean sizeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.size!= null));
                    if (sizeShouldBeCopiedAndSet == Boolean.TRUE) {
                        Integer sourceSize;
                        sourceSize = this.getSize();
                        Integer copySize = ((Integer) strategy.copy(LocatorUtils.property(locator, "size", sourceSize), sourceSize, (this.size!= null)));
                        copy.setSize(copySize);
                    } else {
                        if (sizeShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.size = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new LoadSDPaginationReqType.Pagination();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof LoadSDPaginationReqType.Pagination) {
                final LoadSDPaginationReqType.Pagination target = this;
                final LoadSDPaginationReqType.Pagination leftObject = ((LoadSDPaginationReqType.Pagination) left);
                final LoadSDPaginationReqType.Pagination rightObject = ((LoadSDPaginationReqType.Pagination) right);
                {
                    Boolean parentIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.parentID!= null), (rightObject.parentID!= null));
                    if (parentIDShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsParentID;
                        lhsParentID = leftObject.getParentID();
                        String rhsParentID;
                        rhsParentID = rightObject.getParentID();
                        String mergedParentID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "parentID", lhsParentID), LocatorUtils.property(rightLocator, "parentID", rhsParentID), lhsParentID, rhsParentID, (leftObject.parentID!= null), (rightObject.parentID!= null)));
                        target.setParentID(mergedParentID);
                    } else {
                        if (parentIDShouldBeMergedAndSet == Boolean.FALSE) {
                            target.parentID = null;
                        }
                    }
                }
                {
                    Boolean parentTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.parentType!= null), (rightObject.parentType!= null));
                    if (parentTypeShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsParentType;
                        lhsParentType = leftObject.getParentType();
                        String rhsParentType;
                        rhsParentType = rightObject.getParentType();
                        String mergedParentType = ((String) strategy.merge(LocatorUtils.property(leftLocator, "parentType", lhsParentType), LocatorUtils.property(rightLocator, "parentType", rhsParentType), lhsParentType, rhsParentType, (leftObject.parentType!= null), (rightObject.parentType!= null)));
                        target.setParentType(mergedParentType);
                    } else {
                        if (parentTypeShouldBeMergedAndSet == Boolean.FALSE) {
                            target.parentType = null;
                        }
                    }
                }
                {
                    Boolean queryTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.queryType!= null), (rightObject.queryType!= null));
                    if (queryTypeShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsQueryType;
                        lhsQueryType = leftObject.getQueryType();
                        String rhsQueryType;
                        rhsQueryType = rightObject.getQueryType();
                        String mergedQueryType = ((String) strategy.merge(LocatorUtils.property(leftLocator, "queryType", lhsQueryType), LocatorUtils.property(rightLocator, "queryType", rhsQueryType), lhsQueryType, rhsQueryType, (leftObject.queryType!= null), (rightObject.queryType!= null)));
                        target.setQueryType(mergedQueryType);
                    } else {
                        if (queryTypeShouldBeMergedAndSet == Boolean.FALSE) {
                            target.queryType = null;
                        }
                    }
                }
                {
                    Boolean beginShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.begin!= null), (rightObject.begin!= null));
                    if (beginShouldBeMergedAndSet == Boolean.TRUE) {
                        Integer lhsBegin;
                        lhsBegin = leftObject.getBegin();
                        Integer rhsBegin;
                        rhsBegin = rightObject.getBegin();
                        Integer mergedBegin = ((Integer) strategy.merge(LocatorUtils.property(leftLocator, "begin", lhsBegin), LocatorUtils.property(rightLocator, "begin", rhsBegin), lhsBegin, rhsBegin, (leftObject.begin!= null), (rightObject.begin!= null)));
                        target.setBegin(mergedBegin);
                    } else {
                        if (beginShouldBeMergedAndSet == Boolean.FALSE) {
                            target.begin = null;
                        }
                    }
                }
                {
                    Boolean sizeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.size!= null), (rightObject.size!= null));
                    if (sizeShouldBeMergedAndSet == Boolean.TRUE) {
                        Integer lhsSize;
                        lhsSize = leftObject.getSize();
                        Integer rhsSize;
                        rhsSize = rightObject.getSize();
                        Integer mergedSize = ((Integer) strategy.merge(LocatorUtils.property(leftLocator, "size", lhsSize), LocatorUtils.property(rightLocator, "size", rhsSize), lhsSize, rhsSize, (leftObject.size!= null), (rightObject.size!= null)));
                        target.setSize(mergedSize);
                    } else {
                        if (sizeShouldBeMergedAndSet == Boolean.FALSE) {
                            target.size = null;
                        }
                    }
                }
            }
        }

    }

}
