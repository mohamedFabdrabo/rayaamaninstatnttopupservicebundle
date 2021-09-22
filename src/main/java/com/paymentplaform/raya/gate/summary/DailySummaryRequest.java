
package com.paymentplaform.raya.gate.summary;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for Daily_Summary_Request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Daily_Summary_Request"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RqUID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaxRec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Cursor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Requester"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RequesterPIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FinancialSummaryFromDt" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="FinancialSummaryToDt" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="DemandAccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "Daily_Summary_Request", namespace = "http://raya.paymentplaform.com/gate/summary", propOrder = {
    "rqUID",
    "maxRec",
    "cursor",
    "requester",
    "financialSummaryFromDt",
    "financialSummaryToDt",
    "demandAccountNo",
    "extraAttributes"
})
public class DailySummaryRequest implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MaxRec")
    protected Integer maxRec;
    @XmlElement(name = "Cursor")
    protected String cursor;
    @XmlElement(name = "Requester", required = true)
    protected DailySummaryRequest.Requester requester;
    @XmlElement(name = "FinancialSummaryFromDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar financialSummaryFromDt;
    @XmlElement(name = "FinancialSummaryToDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar financialSummaryToDt;
    @XmlElement(name = "DemandAccountNo", required = true)
    protected String demandAccountNo;
    @XmlElement(name = "ExtraAttributes")
    protected List<DailySummaryRequest.ExtraAttributes> extraAttributes;

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
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link DailySummaryRequest.Requester }
     *     
     */
    public DailySummaryRequest.Requester getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailySummaryRequest.Requester }
     *     
     */
    public void setRequester(DailySummaryRequest.Requester value) {
        this.requester = value;
    }

    /**
     * Gets the value of the financialSummaryFromDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinancialSummaryFromDt() {
        return financialSummaryFromDt;
    }

    /**
     * Sets the value of the financialSummaryFromDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinancialSummaryFromDt(XMLGregorianCalendar value) {
        this.financialSummaryFromDt = value;
    }

    /**
     * Gets the value of the financialSummaryToDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinancialSummaryToDt() {
        return financialSummaryToDt;
    }

    /**
     * Sets the value of the financialSummaryToDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinancialSummaryToDt(XMLGregorianCalendar value) {
        this.financialSummaryToDt = value;
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
     * {@link DailySummaryRequest.ExtraAttributes }
     * 
     * 
     */
    public List<DailySummaryRequest.ExtraAttributes> getExtraAttributes() {
        if (extraAttributes == null) {
            extraAttributes = new ArrayList<DailySummaryRequest.ExtraAttributes>();
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
            DailySummaryRequest.Requester theRequester;
            theRequester = this.getRequester();
            strategy.appendField(locator, this, "requester", buffer, theRequester, (this.requester!= null));
        }
        {
            XMLGregorianCalendar theFinancialSummaryFromDt;
            theFinancialSummaryFromDt = this.getFinancialSummaryFromDt();
            strategy.appendField(locator, this, "financialSummaryFromDt", buffer, theFinancialSummaryFromDt, (this.financialSummaryFromDt!= null));
        }
        {
            XMLGregorianCalendar theFinancialSummaryToDt;
            theFinancialSummaryToDt = this.getFinancialSummaryToDt();
            strategy.appendField(locator, this, "financialSummaryToDt", buffer, theFinancialSummaryToDt, (this.financialSummaryToDt!= null));
        }
        {
            String theDemandAccountNo;
            theDemandAccountNo = this.getDemandAccountNo();
            strategy.appendField(locator, this, "demandAccountNo", buffer, theDemandAccountNo, (this.demandAccountNo!= null));
        }
        {
            List<DailySummaryRequest.ExtraAttributes> theExtraAttributes;
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
        final DailySummaryRequest that = ((DailySummaryRequest) object);
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
            DailySummaryRequest.Requester lhsRequester;
            lhsRequester = this.getRequester();
            DailySummaryRequest.Requester rhsRequester;
            rhsRequester = that.getRequester();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requester", lhsRequester), LocatorUtils.property(thatLocator, "requester", rhsRequester), lhsRequester, rhsRequester, (this.requester!= null), (that.requester!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsFinancialSummaryFromDt;
            lhsFinancialSummaryFromDt = this.getFinancialSummaryFromDt();
            XMLGregorianCalendar rhsFinancialSummaryFromDt;
            rhsFinancialSummaryFromDt = that.getFinancialSummaryFromDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financialSummaryFromDt", lhsFinancialSummaryFromDt), LocatorUtils.property(thatLocator, "financialSummaryFromDt", rhsFinancialSummaryFromDt), lhsFinancialSummaryFromDt, rhsFinancialSummaryFromDt, (this.financialSummaryFromDt!= null), (that.financialSummaryFromDt!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsFinancialSummaryToDt;
            lhsFinancialSummaryToDt = this.getFinancialSummaryToDt();
            XMLGregorianCalendar rhsFinancialSummaryToDt;
            rhsFinancialSummaryToDt = that.getFinancialSummaryToDt();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "financialSummaryToDt", lhsFinancialSummaryToDt), LocatorUtils.property(thatLocator, "financialSummaryToDt", rhsFinancialSummaryToDt), lhsFinancialSummaryToDt, rhsFinancialSummaryToDt, (this.financialSummaryToDt!= null), (that.financialSummaryToDt!= null))) {
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
            List<DailySummaryRequest.ExtraAttributes> lhsExtraAttributes;
            lhsExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            List<DailySummaryRequest.ExtraAttributes> rhsExtraAttributes;
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
            DailySummaryRequest.Requester theRequester;
            theRequester = this.getRequester();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requester", theRequester), currentHashCode, theRequester, (this.requester!= null));
        }
        {
            XMLGregorianCalendar theFinancialSummaryFromDt;
            theFinancialSummaryFromDt = this.getFinancialSummaryFromDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financialSummaryFromDt", theFinancialSummaryFromDt), currentHashCode, theFinancialSummaryFromDt, (this.financialSummaryFromDt!= null));
        }
        {
            XMLGregorianCalendar theFinancialSummaryToDt;
            theFinancialSummaryToDt = this.getFinancialSummaryToDt();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "financialSummaryToDt", theFinancialSummaryToDt), currentHashCode, theFinancialSummaryToDt, (this.financialSummaryToDt!= null));
        }
        {
            String theDemandAccountNo;
            theDemandAccountNo = this.getDemandAccountNo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "demandAccountNo", theDemandAccountNo), currentHashCode, theDemandAccountNo, (this.demandAccountNo!= null));
        }
        {
            List<DailySummaryRequest.ExtraAttributes> theExtraAttributes;
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
        if (draftCopy instanceof DailySummaryRequest) {
            final DailySummaryRequest copy = ((DailySummaryRequest) draftCopy);
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
                Boolean requesterShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.requester!= null));
                if (requesterShouldBeCopiedAndSet == Boolean.TRUE) {
                    DailySummaryRequest.Requester sourceRequester;
                    sourceRequester = this.getRequester();
                    DailySummaryRequest.Requester copyRequester = ((DailySummaryRequest.Requester) strategy.copy(LocatorUtils.property(locator, "requester", sourceRequester), sourceRequester, (this.requester!= null)));
                    copy.setRequester(copyRequester);
                } else {
                    if (requesterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.requester = null;
                    }
                }
            }
            {
                Boolean financialSummaryFromDtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.financialSummaryFromDt!= null));
                if (financialSummaryFromDtShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceFinancialSummaryFromDt;
                    sourceFinancialSummaryFromDt = this.getFinancialSummaryFromDt();
                    XMLGregorianCalendar copyFinancialSummaryFromDt = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "financialSummaryFromDt", sourceFinancialSummaryFromDt), sourceFinancialSummaryFromDt, (this.financialSummaryFromDt!= null)));
                    copy.setFinancialSummaryFromDt(copyFinancialSummaryFromDt);
                } else {
                    if (financialSummaryFromDtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.financialSummaryFromDt = null;
                    }
                }
            }
            {
                Boolean financialSummaryToDtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.financialSummaryToDt!= null));
                if (financialSummaryToDtShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceFinancialSummaryToDt;
                    sourceFinancialSummaryToDt = this.getFinancialSummaryToDt();
                    XMLGregorianCalendar copyFinancialSummaryToDt = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "financialSummaryToDt", sourceFinancialSummaryToDt), sourceFinancialSummaryToDt, (this.financialSummaryToDt!= null)));
                    copy.setFinancialSummaryToDt(copyFinancialSummaryToDt);
                } else {
                    if (financialSummaryToDtShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.financialSummaryToDt = null;
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
                    List<DailySummaryRequest.ExtraAttributes> sourceExtraAttributes;
                    sourceExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
                    @SuppressWarnings("unchecked")
                    List<DailySummaryRequest.ExtraAttributes> copyExtraAttributes = ((List<DailySummaryRequest.ExtraAttributes> ) strategy.copy(LocatorUtils.property(locator, "extraAttributes", sourceExtraAttributes), sourceExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))));
                    copy.extraAttributes = null;
                    if (copyExtraAttributes!= null) {
                        List<DailySummaryRequest.ExtraAttributes> uniqueExtraAttributesl = copy.getExtraAttributes();
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
        return new DailySummaryRequest();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof DailySummaryRequest) {
            final DailySummaryRequest target = this;
            final DailySummaryRequest leftObject = ((DailySummaryRequest) left);
            final DailySummaryRequest rightObject = ((DailySummaryRequest) right);
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
                Boolean requesterShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.requester!= null), (rightObject.requester!= null));
                if (requesterShouldBeMergedAndSet == Boolean.TRUE) {
                    DailySummaryRequest.Requester lhsRequester;
                    lhsRequester = leftObject.getRequester();
                    DailySummaryRequest.Requester rhsRequester;
                    rhsRequester = rightObject.getRequester();
                    DailySummaryRequest.Requester mergedRequester = ((DailySummaryRequest.Requester) strategy.merge(LocatorUtils.property(leftLocator, "requester", lhsRequester), LocatorUtils.property(rightLocator, "requester", rhsRequester), lhsRequester, rhsRequester, (leftObject.requester!= null), (rightObject.requester!= null)));
                    target.setRequester(mergedRequester);
                } else {
                    if (requesterShouldBeMergedAndSet == Boolean.FALSE) {
                        target.requester = null;
                    }
                }
            }
            {
                Boolean financialSummaryFromDtShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.financialSummaryFromDt!= null), (rightObject.financialSummaryFromDt!= null));
                if (financialSummaryFromDtShouldBeMergedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar lhsFinancialSummaryFromDt;
                    lhsFinancialSummaryFromDt = leftObject.getFinancialSummaryFromDt();
                    XMLGregorianCalendar rhsFinancialSummaryFromDt;
                    rhsFinancialSummaryFromDt = rightObject.getFinancialSummaryFromDt();
                    XMLGregorianCalendar mergedFinancialSummaryFromDt = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "financialSummaryFromDt", lhsFinancialSummaryFromDt), LocatorUtils.property(rightLocator, "financialSummaryFromDt", rhsFinancialSummaryFromDt), lhsFinancialSummaryFromDt, rhsFinancialSummaryFromDt, (leftObject.financialSummaryFromDt!= null), (rightObject.financialSummaryFromDt!= null)));
                    target.setFinancialSummaryFromDt(mergedFinancialSummaryFromDt);
                } else {
                    if (financialSummaryFromDtShouldBeMergedAndSet == Boolean.FALSE) {
                        target.financialSummaryFromDt = null;
                    }
                }
            }
            {
                Boolean financialSummaryToDtShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.financialSummaryToDt!= null), (rightObject.financialSummaryToDt!= null));
                if (financialSummaryToDtShouldBeMergedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar lhsFinancialSummaryToDt;
                    lhsFinancialSummaryToDt = leftObject.getFinancialSummaryToDt();
                    XMLGregorianCalendar rhsFinancialSummaryToDt;
                    rhsFinancialSummaryToDt = rightObject.getFinancialSummaryToDt();
                    XMLGregorianCalendar mergedFinancialSummaryToDt = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "financialSummaryToDt", lhsFinancialSummaryToDt), LocatorUtils.property(rightLocator, "financialSummaryToDt", rhsFinancialSummaryToDt), lhsFinancialSummaryToDt, rhsFinancialSummaryToDt, (leftObject.financialSummaryToDt!= null), (rightObject.financialSummaryToDt!= null)));
                    target.setFinancialSummaryToDt(mergedFinancialSummaryToDt);
                } else {
                    if (financialSummaryToDtShouldBeMergedAndSet == Boolean.FALSE) {
                        target.financialSummaryToDt = null;
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
                    List<DailySummaryRequest.ExtraAttributes> lhsExtraAttributes;
                    lhsExtraAttributes = (((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty()))?leftObject.getExtraAttributes():null);
                    List<DailySummaryRequest.ExtraAttributes> rhsExtraAttributes;
                    rhsExtraAttributes = (((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))?rightObject.getExtraAttributes():null);
                    List<DailySummaryRequest.ExtraAttributes> mergedExtraAttributes = ((List<DailySummaryRequest.ExtraAttributes> ) strategy.merge(LocatorUtils.property(leftLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(rightLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))));
                    target.extraAttributes = null;
                    if (mergedExtraAttributes!= null) {
                        List<DailySummaryRequest.ExtraAttributes> uniqueExtraAttributesl = target.getExtraAttributes();
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

    public void setExtraAttributes(List<DailySummaryRequest.ExtraAttributes> value) {
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
            final DailySummaryRequest.ExtraAttributes that = ((DailySummaryRequest.ExtraAttributes) object);
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
            if (draftCopy instanceof DailySummaryRequest.ExtraAttributes) {
                final DailySummaryRequest.ExtraAttributes copy = ((DailySummaryRequest.ExtraAttributes) draftCopy);
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
            return new DailySummaryRequest.ExtraAttributes();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof DailySummaryRequest.ExtraAttributes) {
                final DailySummaryRequest.ExtraAttributes target = this;
                final DailySummaryRequest.ExtraAttributes leftObject = ((DailySummaryRequest.ExtraAttributes) left);
                final DailySummaryRequest.ExtraAttributes rightObject = ((DailySummaryRequest.ExtraAttributes) right);
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
     *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "userID",
        "accountNo",
        "requesterPIN"
    })
    public static class Requester implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "UserID")
        protected String userID;
        @XmlElement(name = "AccountNo")
        protected String accountNo;
        @XmlElement(name = "RequesterPIN", required = true)
        protected String requesterPIN;

        /**
         * Gets the value of the userID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserID() {
            return userID;
        }

        /**
         * Sets the value of the userID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserID(String value) {
            this.userID = value;
        }

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
                String theUserID;
                theUserID = this.getUserID();
                strategy.appendField(locator, this, "userID", buffer, theUserID, (this.userID!= null));
            }
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
            final DailySummaryRequest.Requester that = ((DailySummaryRequest.Requester) object);
            {
                String lhsUserID;
                lhsUserID = this.getUserID();
                String rhsUserID;
                rhsUserID = that.getUserID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "userID", lhsUserID), LocatorUtils.property(thatLocator, "userID", rhsUserID), lhsUserID, rhsUserID, (this.userID!= null), (that.userID!= null))) {
                    return false;
                }
            }
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
                String theUserID;
                theUserID = this.getUserID();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userID", theUserID), currentHashCode, theUserID, (this.userID!= null));
            }
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
            if (draftCopy instanceof DailySummaryRequest.Requester) {
                final DailySummaryRequest.Requester copy = ((DailySummaryRequest.Requester) draftCopy);
                {
                    Boolean userIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.userID!= null));
                    if (userIDShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceUserID;
                        sourceUserID = this.getUserID();
                        String copyUserID = ((String) strategy.copy(LocatorUtils.property(locator, "userID", sourceUserID), sourceUserID, (this.userID!= null)));
                        copy.setUserID(copyUserID);
                    } else {
                        if (userIDShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.userID = null;
                        }
                    }
                }
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
            return new DailySummaryRequest.Requester();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof DailySummaryRequest.Requester) {
                final DailySummaryRequest.Requester target = this;
                final DailySummaryRequest.Requester leftObject = ((DailySummaryRequest.Requester) left);
                final DailySummaryRequest.Requester rightObject = ((DailySummaryRequest.Requester) right);
                {
                    Boolean userIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.userID!= null), (rightObject.userID!= null));
                    if (userIDShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsUserID;
                        lhsUserID = leftObject.getUserID();
                        String rhsUserID;
                        rhsUserID = rightObject.getUserID();
                        String mergedUserID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "userID", lhsUserID), LocatorUtils.property(rightLocator, "userID", rhsUserID), lhsUserID, rhsUserID, (leftObject.userID!= null), (rightObject.userID!= null)));
                        target.setUserID(mergedUserID);
                    } else {
                        if (userIDShouldBeMergedAndSet == Boolean.FALSE) {
                            target.userID = null;
                        }
                    }
                }
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
