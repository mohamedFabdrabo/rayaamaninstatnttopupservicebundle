
package com.paymentplaform.raya.gate.search;

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
 * <p>Java class for Search_Transactions_request complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Search_Transactions_request"&gt;
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
 *         &lt;element name="SearchParameters"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FromDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="ToDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="ServiceReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PmtStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="lastSuccessful" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "Search_Transactions_request", namespace = "http://raya.paymentplaform.com/gate/search", propOrder = {
    "rqUID",
    "maxRec",
    "cursor",
    "requester",
    "searchParameters",
    "extraAttributes"
})
public class SearchTransactionsRequest implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "RqUID", required = true)
    protected String rqUID;
    @XmlElement(name = "MaxRec")
    protected Integer maxRec;
    @XmlElement(name = "Cursor")
    protected String cursor;
    @XmlElement(name = "Requester", required = true)
    protected SearchTransactionsRequest.Requester requester;
    @XmlElement(name = "SearchParameters", required = true)
    protected SearchTransactionsRequest.SearchParameters searchParameters;
    @XmlElement(name = "ExtraAttributes")
    protected List<SearchTransactionsRequest.ExtraAttributes> extraAttributes;

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
     *     {@link SearchTransactionsRequest.Requester }
     *     
     */
    public SearchTransactionsRequest.Requester getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTransactionsRequest.Requester }
     *     
     */
    public void setRequester(SearchTransactionsRequest.Requester value) {
        this.requester = value;
    }

    /**
     * Gets the value of the searchParameters property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTransactionsRequest.SearchParameters }
     *     
     */
    public SearchTransactionsRequest.SearchParameters getSearchParameters() {
        return searchParameters;
    }

    /**
     * Sets the value of the searchParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTransactionsRequest.SearchParameters }
     *     
     */
    public void setSearchParameters(SearchTransactionsRequest.SearchParameters value) {
        this.searchParameters = value;
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
     * {@link SearchTransactionsRequest.ExtraAttributes }
     * 
     * 
     */
    public List<SearchTransactionsRequest.ExtraAttributes> getExtraAttributes() {
        if (extraAttributes == null) {
            extraAttributes = new ArrayList<SearchTransactionsRequest.ExtraAttributes>();
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
            SearchTransactionsRequest.Requester theRequester;
            theRequester = this.getRequester();
            strategy.appendField(locator, this, "requester", buffer, theRequester, (this.requester!= null));
        }
        {
            SearchTransactionsRequest.SearchParameters theSearchParameters;
            theSearchParameters = this.getSearchParameters();
            strategy.appendField(locator, this, "searchParameters", buffer, theSearchParameters, (this.searchParameters!= null));
        }
        {
            List<SearchTransactionsRequest.ExtraAttributes> theExtraAttributes;
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
        final SearchTransactionsRequest that = ((SearchTransactionsRequest) object);
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
            SearchTransactionsRequest.Requester lhsRequester;
            lhsRequester = this.getRequester();
            SearchTransactionsRequest.Requester rhsRequester;
            rhsRequester = that.getRequester();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requester", lhsRequester), LocatorUtils.property(thatLocator, "requester", rhsRequester), lhsRequester, rhsRequester, (this.requester!= null), (that.requester!= null))) {
                return false;
            }
        }
        {
            SearchTransactionsRequest.SearchParameters lhsSearchParameters;
            lhsSearchParameters = this.getSearchParameters();
            SearchTransactionsRequest.SearchParameters rhsSearchParameters;
            rhsSearchParameters = that.getSearchParameters();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchParameters", lhsSearchParameters), LocatorUtils.property(thatLocator, "searchParameters", rhsSearchParameters), lhsSearchParameters, rhsSearchParameters, (this.searchParameters!= null), (that.searchParameters!= null))) {
                return false;
            }
        }
        {
            List<SearchTransactionsRequest.ExtraAttributes> lhsExtraAttributes;
            lhsExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
            List<SearchTransactionsRequest.ExtraAttributes> rhsExtraAttributes;
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
            SearchTransactionsRequest.Requester theRequester;
            theRequester = this.getRequester();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requester", theRequester), currentHashCode, theRequester, (this.requester!= null));
        }
        {
            SearchTransactionsRequest.SearchParameters theSearchParameters;
            theSearchParameters = this.getSearchParameters();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchParameters", theSearchParameters), currentHashCode, theSearchParameters, (this.searchParameters!= null));
        }
        {
            List<SearchTransactionsRequest.ExtraAttributes> theExtraAttributes;
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
        if (draftCopy instanceof SearchTransactionsRequest) {
            final SearchTransactionsRequest copy = ((SearchTransactionsRequest) draftCopy);
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
                    SearchTransactionsRequest.Requester sourceRequester;
                    sourceRequester = this.getRequester();
                    SearchTransactionsRequest.Requester copyRequester = ((SearchTransactionsRequest.Requester) strategy.copy(LocatorUtils.property(locator, "requester", sourceRequester), sourceRequester, (this.requester!= null)));
                    copy.setRequester(copyRequester);
                } else {
                    if (requesterShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.requester = null;
                    }
                }
            }
            {
                Boolean searchParametersShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.searchParameters!= null));
                if (searchParametersShouldBeCopiedAndSet == Boolean.TRUE) {
                    SearchTransactionsRequest.SearchParameters sourceSearchParameters;
                    sourceSearchParameters = this.getSearchParameters();
                    SearchTransactionsRequest.SearchParameters copySearchParameters = ((SearchTransactionsRequest.SearchParameters) strategy.copy(LocatorUtils.property(locator, "searchParameters", sourceSearchParameters), sourceSearchParameters, (this.searchParameters!= null)));
                    copy.setSearchParameters(copySearchParameters);
                } else {
                    if (searchParametersShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.searchParameters = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<SearchTransactionsRequest.ExtraAttributes> sourceExtraAttributes;
                    sourceExtraAttributes = (((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))?this.getExtraAttributes():null);
                    @SuppressWarnings("unchecked")
                    List<SearchTransactionsRequest.ExtraAttributes> copyExtraAttributes = ((List<SearchTransactionsRequest.ExtraAttributes> ) strategy.copy(LocatorUtils.property(locator, "extraAttributes", sourceExtraAttributes), sourceExtraAttributes, ((this.extraAttributes!= null)&&(!this.extraAttributes.isEmpty()))));
                    copy.extraAttributes = null;
                    if (copyExtraAttributes!= null) {
                        List<SearchTransactionsRequest.ExtraAttributes> uniqueExtraAttributesl = copy.getExtraAttributes();
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
        return new SearchTransactionsRequest();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof SearchTransactionsRequest) {
            final SearchTransactionsRequest target = this;
            final SearchTransactionsRequest leftObject = ((SearchTransactionsRequest) left);
            final SearchTransactionsRequest rightObject = ((SearchTransactionsRequest) right);
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
                    SearchTransactionsRequest.Requester lhsRequester;
                    lhsRequester = leftObject.getRequester();
                    SearchTransactionsRequest.Requester rhsRequester;
                    rhsRequester = rightObject.getRequester();
                    SearchTransactionsRequest.Requester mergedRequester = ((SearchTransactionsRequest.Requester) strategy.merge(LocatorUtils.property(leftLocator, "requester", lhsRequester), LocatorUtils.property(rightLocator, "requester", rhsRequester), lhsRequester, rhsRequester, (leftObject.requester!= null), (rightObject.requester!= null)));
                    target.setRequester(mergedRequester);
                } else {
                    if (requesterShouldBeMergedAndSet == Boolean.FALSE) {
                        target.requester = null;
                    }
                }
            }
            {
                Boolean searchParametersShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.searchParameters!= null), (rightObject.searchParameters!= null));
                if (searchParametersShouldBeMergedAndSet == Boolean.TRUE) {
                    SearchTransactionsRequest.SearchParameters lhsSearchParameters;
                    lhsSearchParameters = leftObject.getSearchParameters();
                    SearchTransactionsRequest.SearchParameters rhsSearchParameters;
                    rhsSearchParameters = rightObject.getSearchParameters();
                    SearchTransactionsRequest.SearchParameters mergedSearchParameters = ((SearchTransactionsRequest.SearchParameters) strategy.merge(LocatorUtils.property(leftLocator, "searchParameters", lhsSearchParameters), LocatorUtils.property(rightLocator, "searchParameters", rhsSearchParameters), lhsSearchParameters, rhsSearchParameters, (leftObject.searchParameters!= null), (rightObject.searchParameters!= null)));
                    target.setSearchParameters(mergedSearchParameters);
                } else {
                    if (searchParametersShouldBeMergedAndSet == Boolean.FALSE) {
                        target.searchParameters = null;
                    }
                }
            }
            {
                Boolean extraAttributesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty())));
                if (extraAttributesShouldBeMergedAndSet == Boolean.TRUE) {
                    List<SearchTransactionsRequest.ExtraAttributes> lhsExtraAttributes;
                    lhsExtraAttributes = (((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty()))?leftObject.getExtraAttributes():null);
                    List<SearchTransactionsRequest.ExtraAttributes> rhsExtraAttributes;
                    rhsExtraAttributes = (((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))?rightObject.getExtraAttributes():null);
                    List<SearchTransactionsRequest.ExtraAttributes> mergedExtraAttributes = ((List<SearchTransactionsRequest.ExtraAttributes> ) strategy.merge(LocatorUtils.property(leftLocator, "extraAttributes", lhsExtraAttributes), LocatorUtils.property(rightLocator, "extraAttributes", rhsExtraAttributes), lhsExtraAttributes, rhsExtraAttributes, ((leftObject.extraAttributes!= null)&&(!leftObject.extraAttributes.isEmpty())), ((rightObject.extraAttributes!= null)&&(!rightObject.extraAttributes.isEmpty()))));
                    target.extraAttributes = null;
                    if (mergedExtraAttributes!= null) {
                        List<SearchTransactionsRequest.ExtraAttributes> uniqueExtraAttributesl = target.getExtraAttributes();
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

    public void setExtraAttributes(List<SearchTransactionsRequest.ExtraAttributes> value) {
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
            final SearchTransactionsRequest.ExtraAttributes that = ((SearchTransactionsRequest.ExtraAttributes) object);
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
            if (draftCopy instanceof SearchTransactionsRequest.ExtraAttributes) {
                final SearchTransactionsRequest.ExtraAttributes copy = ((SearchTransactionsRequest.ExtraAttributes) draftCopy);
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
            return new SearchTransactionsRequest.ExtraAttributes();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof SearchTransactionsRequest.ExtraAttributes) {
                final SearchTransactionsRequest.ExtraAttributes target = this;
                final SearchTransactionsRequest.ExtraAttributes leftObject = ((SearchTransactionsRequest.ExtraAttributes) left);
                final SearchTransactionsRequest.ExtraAttributes rightObject = ((SearchTransactionsRequest.ExtraAttributes) right);
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
            final SearchTransactionsRequest.Requester that = ((SearchTransactionsRequest.Requester) object);
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
            if (draftCopy instanceof SearchTransactionsRequest.Requester) {
                final SearchTransactionsRequest.Requester copy = ((SearchTransactionsRequest.Requester) draftCopy);
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
            return new SearchTransactionsRequest.Requester();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof SearchTransactionsRequest.Requester) {
                final SearchTransactionsRequest.Requester target = this;
                final SearchTransactionsRequest.Requester leftObject = ((SearchTransactionsRequest.Requester) left);
                final SearchTransactionsRequest.Requester rightObject = ((SearchTransactionsRequest.Requester) right);
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
     *         &lt;element name="FromDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="ToDt" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ServiceReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PmtStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="lastSuccessful" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "fromDt",
        "toDt",
        "serviceCode",
        "serviceReferenceNumber",
        "pmtStatus",
        "transactionID",
        "lastSuccessful"
    })
    public static class SearchParameters implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
    {

        @XmlElement(name = "FromDt")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar fromDt;
        @XmlElement(name = "ToDt")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar toDt;
        @XmlElement(name = "ServiceCode")
        protected String serviceCode;
        @XmlElement(name = "ServiceReferenceNumber")
        protected String serviceReferenceNumber;
        @XmlElement(name = "PmtStatus")
        protected String pmtStatus;
        @XmlElement(name = "TransactionID")
        protected String transactionID;
        protected String lastSuccessful;

        /**
         * Gets the value of the fromDt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFromDt() {
            return fromDt;
        }

        /**
         * Sets the value of the fromDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFromDt(XMLGregorianCalendar value) {
            this.fromDt = value;
        }

        /**
         * Gets the value of the toDt property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getToDt() {
            return toDt;
        }

        /**
         * Sets the value of the toDt property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setToDt(XMLGregorianCalendar value) {
            this.toDt = value;
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
         * Gets the value of the pmtStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPmtStatus() {
            return pmtStatus;
        }

        /**
         * Sets the value of the pmtStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPmtStatus(String value) {
            this.pmtStatus = value;
        }

        /**
         * Gets the value of the transactionID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionID() {
            return transactionID;
        }

        /**
         * Sets the value of the transactionID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionID(String value) {
            this.transactionID = value;
        }

        /**
         * Gets the value of the lastSuccessful property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastSuccessful() {
            return lastSuccessful;
        }

        /**
         * Sets the value of the lastSuccessful property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastSuccessful(String value) {
            this.lastSuccessful = value;
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
                XMLGregorianCalendar theFromDt;
                theFromDt = this.getFromDt();
                strategy.appendField(locator, this, "fromDt", buffer, theFromDt, (this.fromDt!= null));
            }
            {
                XMLGregorianCalendar theToDt;
                theToDt = this.getToDt();
                strategy.appendField(locator, this, "toDt", buffer, theToDt, (this.toDt!= null));
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
                String thePmtStatus;
                thePmtStatus = this.getPmtStatus();
                strategy.appendField(locator, this, "pmtStatus", buffer, thePmtStatus, (this.pmtStatus!= null));
            }
            {
                String theTransactionID;
                theTransactionID = this.getTransactionID();
                strategy.appendField(locator, this, "transactionID", buffer, theTransactionID, (this.transactionID!= null));
            }
            {
                String theLastSuccessful;
                theLastSuccessful = this.getLastSuccessful();
                strategy.appendField(locator, this, "lastSuccessful", buffer, theLastSuccessful, (this.lastSuccessful!= null));
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
            final SearchTransactionsRequest.SearchParameters that = ((SearchTransactionsRequest.SearchParameters) object);
            {
                XMLGregorianCalendar lhsFromDt;
                lhsFromDt = this.getFromDt();
                XMLGregorianCalendar rhsFromDt;
                rhsFromDt = that.getFromDt();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "fromDt", lhsFromDt), LocatorUtils.property(thatLocator, "fromDt", rhsFromDt), lhsFromDt, rhsFromDt, (this.fromDt!= null), (that.fromDt!= null))) {
                    return false;
                }
            }
            {
                XMLGregorianCalendar lhsToDt;
                lhsToDt = this.getToDt();
                XMLGregorianCalendar rhsToDt;
                rhsToDt = that.getToDt();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "toDt", lhsToDt), LocatorUtils.property(thatLocator, "toDt", rhsToDt), lhsToDt, rhsToDt, (this.toDt!= null), (that.toDt!= null))) {
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
                String lhsPmtStatus;
                lhsPmtStatus = this.getPmtStatus();
                String rhsPmtStatus;
                rhsPmtStatus = that.getPmtStatus();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "pmtStatus", lhsPmtStatus), LocatorUtils.property(thatLocator, "pmtStatus", rhsPmtStatus), lhsPmtStatus, rhsPmtStatus, (this.pmtStatus!= null), (that.pmtStatus!= null))) {
                    return false;
                }
            }
            {
                String lhsTransactionID;
                lhsTransactionID = this.getTransactionID();
                String rhsTransactionID;
                rhsTransactionID = that.getTransactionID();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "transactionID", lhsTransactionID), LocatorUtils.property(thatLocator, "transactionID", rhsTransactionID), lhsTransactionID, rhsTransactionID, (this.transactionID!= null), (that.transactionID!= null))) {
                    return false;
                }
            }
            {
                String lhsLastSuccessful;
                lhsLastSuccessful = this.getLastSuccessful();
                String rhsLastSuccessful;
                rhsLastSuccessful = that.getLastSuccessful();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "lastSuccessful", lhsLastSuccessful), LocatorUtils.property(thatLocator, "lastSuccessful", rhsLastSuccessful), lhsLastSuccessful, rhsLastSuccessful, (this.lastSuccessful!= null), (that.lastSuccessful!= null))) {
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
                XMLGregorianCalendar theFromDt;
                theFromDt = this.getFromDt();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fromDt", theFromDt), currentHashCode, theFromDt, (this.fromDt!= null));
            }
            {
                XMLGregorianCalendar theToDt;
                theToDt = this.getToDt();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "toDt", theToDt), currentHashCode, theToDt, (this.toDt!= null));
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
                String thePmtStatus;
                thePmtStatus = this.getPmtStatus();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pmtStatus", thePmtStatus), currentHashCode, thePmtStatus, (this.pmtStatus!= null));
            }
            {
                String theTransactionID;
                theTransactionID = this.getTransactionID();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transactionID", theTransactionID), currentHashCode, theTransactionID, (this.transactionID!= null));
            }
            {
                String theLastSuccessful;
                theLastSuccessful = this.getLastSuccessful();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lastSuccessful", theLastSuccessful), currentHashCode, theLastSuccessful, (this.lastSuccessful!= null));
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
            if (draftCopy instanceof SearchTransactionsRequest.SearchParameters) {
                final SearchTransactionsRequest.SearchParameters copy = ((SearchTransactionsRequest.SearchParameters) draftCopy);
                {
                    Boolean fromDtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.fromDt!= null));
                    if (fromDtShouldBeCopiedAndSet == Boolean.TRUE) {
                        XMLGregorianCalendar sourceFromDt;
                        sourceFromDt = this.getFromDt();
                        XMLGregorianCalendar copyFromDt = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "fromDt", sourceFromDt), sourceFromDt, (this.fromDt!= null)));
                        copy.setFromDt(copyFromDt);
                    } else {
                        if (fromDtShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.fromDt = null;
                        }
                    }
                }
                {
                    Boolean toDtShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.toDt!= null));
                    if (toDtShouldBeCopiedAndSet == Boolean.TRUE) {
                        XMLGregorianCalendar sourceToDt;
                        sourceToDt = this.getToDt();
                        XMLGregorianCalendar copyToDt = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "toDt", sourceToDt), sourceToDt, (this.toDt!= null)));
                        copy.setToDt(copyToDt);
                    } else {
                        if (toDtShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.toDt = null;
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
                    Boolean pmtStatusShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.pmtStatus!= null));
                    if (pmtStatusShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourcePmtStatus;
                        sourcePmtStatus = this.getPmtStatus();
                        String copyPmtStatus = ((String) strategy.copy(LocatorUtils.property(locator, "pmtStatus", sourcePmtStatus), sourcePmtStatus, (this.pmtStatus!= null)));
                        copy.setPmtStatus(copyPmtStatus);
                    } else {
                        if (pmtStatusShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.pmtStatus = null;
                        }
                    }
                }
                {
                    Boolean transactionIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.transactionID!= null));
                    if (transactionIDShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceTransactionID;
                        sourceTransactionID = this.getTransactionID();
                        String copyTransactionID = ((String) strategy.copy(LocatorUtils.property(locator, "transactionID", sourceTransactionID), sourceTransactionID, (this.transactionID!= null)));
                        copy.setTransactionID(copyTransactionID);
                    } else {
                        if (transactionIDShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.transactionID = null;
                        }
                    }
                }
                {
                    Boolean lastSuccessfulShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.lastSuccessful!= null));
                    if (lastSuccessfulShouldBeCopiedAndSet == Boolean.TRUE) {
                        String sourceLastSuccessful;
                        sourceLastSuccessful = this.getLastSuccessful();
                        String copyLastSuccessful = ((String) strategy.copy(LocatorUtils.property(locator, "lastSuccessful", sourceLastSuccessful), sourceLastSuccessful, (this.lastSuccessful!= null)));
                        copy.setLastSuccessful(copyLastSuccessful);
                    } else {
                        if (lastSuccessfulShouldBeCopiedAndSet == Boolean.FALSE) {
                            copy.lastSuccessful = null;
                        }
                    }
                }
            }
            return draftCopy;
        }

        public Object createNewInstance() {
            return new SearchTransactionsRequest.SearchParameters();
        }

        public void mergeFrom(Object left, Object right) {
            final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
            mergeFrom(null, null, left, right, strategy);
        }

        public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
            if (right instanceof SearchTransactionsRequest.SearchParameters) {
                final SearchTransactionsRequest.SearchParameters target = this;
                final SearchTransactionsRequest.SearchParameters leftObject = ((SearchTransactionsRequest.SearchParameters) left);
                final SearchTransactionsRequest.SearchParameters rightObject = ((SearchTransactionsRequest.SearchParameters) right);
                {
                    Boolean fromDtShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.fromDt!= null), (rightObject.fromDt!= null));
                    if (fromDtShouldBeMergedAndSet == Boolean.TRUE) {
                        XMLGregorianCalendar lhsFromDt;
                        lhsFromDt = leftObject.getFromDt();
                        XMLGregorianCalendar rhsFromDt;
                        rhsFromDt = rightObject.getFromDt();
                        XMLGregorianCalendar mergedFromDt = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "fromDt", lhsFromDt), LocatorUtils.property(rightLocator, "fromDt", rhsFromDt), lhsFromDt, rhsFromDt, (leftObject.fromDt!= null), (rightObject.fromDt!= null)));
                        target.setFromDt(mergedFromDt);
                    } else {
                        if (fromDtShouldBeMergedAndSet == Boolean.FALSE) {
                            target.fromDt = null;
                        }
                    }
                }
                {
                    Boolean toDtShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.toDt!= null), (rightObject.toDt!= null));
                    if (toDtShouldBeMergedAndSet == Boolean.TRUE) {
                        XMLGregorianCalendar lhsToDt;
                        lhsToDt = leftObject.getToDt();
                        XMLGregorianCalendar rhsToDt;
                        rhsToDt = rightObject.getToDt();
                        XMLGregorianCalendar mergedToDt = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "toDt", lhsToDt), LocatorUtils.property(rightLocator, "toDt", rhsToDt), lhsToDt, rhsToDt, (leftObject.toDt!= null), (rightObject.toDt!= null)));
                        target.setToDt(mergedToDt);
                    } else {
                        if (toDtShouldBeMergedAndSet == Boolean.FALSE) {
                            target.toDt = null;
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
                    Boolean pmtStatusShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.pmtStatus!= null), (rightObject.pmtStatus!= null));
                    if (pmtStatusShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsPmtStatus;
                        lhsPmtStatus = leftObject.getPmtStatus();
                        String rhsPmtStatus;
                        rhsPmtStatus = rightObject.getPmtStatus();
                        String mergedPmtStatus = ((String) strategy.merge(LocatorUtils.property(leftLocator, "pmtStatus", lhsPmtStatus), LocatorUtils.property(rightLocator, "pmtStatus", rhsPmtStatus), lhsPmtStatus, rhsPmtStatus, (leftObject.pmtStatus!= null), (rightObject.pmtStatus!= null)));
                        target.setPmtStatus(mergedPmtStatus);
                    } else {
                        if (pmtStatusShouldBeMergedAndSet == Boolean.FALSE) {
                            target.pmtStatus = null;
                        }
                    }
                }
                {
                    Boolean transactionIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.transactionID!= null), (rightObject.transactionID!= null));
                    if (transactionIDShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsTransactionID;
                        lhsTransactionID = leftObject.getTransactionID();
                        String rhsTransactionID;
                        rhsTransactionID = rightObject.getTransactionID();
                        String mergedTransactionID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "transactionID", lhsTransactionID), LocatorUtils.property(rightLocator, "transactionID", rhsTransactionID), lhsTransactionID, rhsTransactionID, (leftObject.transactionID!= null), (rightObject.transactionID!= null)));
                        target.setTransactionID(mergedTransactionID);
                    } else {
                        if (transactionIDShouldBeMergedAndSet == Boolean.FALSE) {
                            target.transactionID = null;
                        }
                    }
                }
                {
                    Boolean lastSuccessfulShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.lastSuccessful!= null), (rightObject.lastSuccessful!= null));
                    if (lastSuccessfulShouldBeMergedAndSet == Boolean.TRUE) {
                        String lhsLastSuccessful;
                        lhsLastSuccessful = leftObject.getLastSuccessful();
                        String rhsLastSuccessful;
                        rhsLastSuccessful = rightObject.getLastSuccessful();
                        String mergedLastSuccessful = ((String) strategy.merge(LocatorUtils.property(leftLocator, "lastSuccessful", lhsLastSuccessful), LocatorUtils.property(rightLocator, "lastSuccessful", rhsLastSuccessful), lhsLastSuccessful, rhsLastSuccessful, (leftObject.lastSuccessful!= null), (rightObject.lastSuccessful!= null)));
                        target.setLastSuccessful(mergedLastSuccessful);
                    } else {
                        if (lastSuccessfulShouldBeMergedAndSet == Boolean.FALSE) {
                            target.lastSuccessful = null;
                        }
                    }
                }
            }
        }

    }

}
