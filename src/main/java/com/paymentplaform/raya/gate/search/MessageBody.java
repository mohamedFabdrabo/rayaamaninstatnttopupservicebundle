
package com.paymentplaform.raya.gate.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for SearchTransactionsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchTransactionsRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Search_Transactions_request" type="{http://raya.paymentplaform.com/gate/search}Search_Transactions_request"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchTransactionsRequestType", namespace = "", propOrder = {
    "searchTransactionsRequest"
})
@XmlRootElement(name = "MessageBody", namespace = "")
public class MessageBody implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Search_Transactions_request", required = true)
    protected SearchTransactionsRequest searchTransactionsRequest;

    /**
     * Gets the value of the searchTransactionsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SearchTransactionsRequest }
     *     
     */
    public SearchTransactionsRequest getSearchTransactionsRequest() {
        return searchTransactionsRequest;
    }

    /**
     * Sets the value of the searchTransactionsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchTransactionsRequest }
     *     
     */
    public void setSearchTransactionsRequest(SearchTransactionsRequest value) {
        this.searchTransactionsRequest = value;
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
            SearchTransactionsRequest theSearchTransactionsRequest;
            theSearchTransactionsRequest = this.getSearchTransactionsRequest();
            strategy.appendField(locator, this, "searchTransactionsRequest", buffer, theSearchTransactionsRequest, (this.searchTransactionsRequest!= null));
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
        final MessageBody that = ((MessageBody) object);
        {
            SearchTransactionsRequest lhsSearchTransactionsRequest;
            lhsSearchTransactionsRequest = this.getSearchTransactionsRequest();
            SearchTransactionsRequest rhsSearchTransactionsRequest;
            rhsSearchTransactionsRequest = that.getSearchTransactionsRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "searchTransactionsRequest", lhsSearchTransactionsRequest), LocatorUtils.property(thatLocator, "searchTransactionsRequest", rhsSearchTransactionsRequest), lhsSearchTransactionsRequest, rhsSearchTransactionsRequest, (this.searchTransactionsRequest!= null), (that.searchTransactionsRequest!= null))) {
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
            SearchTransactionsRequest theSearchTransactionsRequest;
            theSearchTransactionsRequest = this.getSearchTransactionsRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "searchTransactionsRequest", theSearchTransactionsRequest), currentHashCode, theSearchTransactionsRequest, (this.searchTransactionsRequest!= null));
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
        if (draftCopy instanceof MessageBody) {
            final MessageBody copy = ((MessageBody) draftCopy);
            {
                Boolean searchTransactionsRequestShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.searchTransactionsRequest!= null));
                if (searchTransactionsRequestShouldBeCopiedAndSet == Boolean.TRUE) {
                    SearchTransactionsRequest sourceSearchTransactionsRequest;
                    sourceSearchTransactionsRequest = this.getSearchTransactionsRequest();
                    SearchTransactionsRequest copySearchTransactionsRequest = ((SearchTransactionsRequest) strategy.copy(LocatorUtils.property(locator, "searchTransactionsRequest", sourceSearchTransactionsRequest), sourceSearchTransactionsRequest, (this.searchTransactionsRequest!= null)));
                    copy.setSearchTransactionsRequest(copySearchTransactionsRequest);
                } else {
                    if (searchTransactionsRequestShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.searchTransactionsRequest = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new MessageBody();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof MessageBody) {
            final MessageBody target = this;
            final MessageBody leftObject = ((MessageBody) left);
            final MessageBody rightObject = ((MessageBody) right);
            {
                Boolean searchTransactionsRequestShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.searchTransactionsRequest!= null), (rightObject.searchTransactionsRequest!= null));
                if (searchTransactionsRequestShouldBeMergedAndSet == Boolean.TRUE) {
                    SearchTransactionsRequest lhsSearchTransactionsRequest;
                    lhsSearchTransactionsRequest = leftObject.getSearchTransactionsRequest();
                    SearchTransactionsRequest rhsSearchTransactionsRequest;
                    rhsSearchTransactionsRequest = rightObject.getSearchTransactionsRequest();
                    SearchTransactionsRequest mergedSearchTransactionsRequest = ((SearchTransactionsRequest) strategy.merge(LocatorUtils.property(leftLocator, "searchTransactionsRequest", lhsSearchTransactionsRequest), LocatorUtils.property(rightLocator, "searchTransactionsRequest", rhsSearchTransactionsRequest), lhsSearchTransactionsRequest, rhsSearchTransactionsRequest, (leftObject.searchTransactionsRequest!= null), (rightObject.searchTransactionsRequest!= null)));
                    target.setSearchTransactionsRequest(mergedSearchTransactionsRequest);
                } else {
                    if (searchTransactionsRequestShouldBeMergedAndSet == Boolean.FALSE) {
                        target.searchTransactionsRequest = null;
                    }
                }
            }
        }
    }

}
