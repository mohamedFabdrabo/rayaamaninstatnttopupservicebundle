
package com.paymentplaform.raya.gate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;
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
 * <p>Java class for Fault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fault"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="faultcode" type="{http://www.w3.org/2001/XMLSchema}QName"/&gt;
 *         &lt;element name="faultstring" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="faultactor" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="detail" type="{http://raya.paymentplaform.com/gate}detail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fault", namespace = "http://raya.paymentplaform.com/gate", propOrder = {
    "faultcode",
    "faultstring",
    "faultactor",
    "detail"
})
@XmlRootElement(name = "Fault", namespace = "http://raya.paymentplaform.com/gate")
public class Fault implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(required = true)
    protected QName faultcode;
    @XmlElement(required = true)
    protected String faultstring;
    @XmlSchemaType(name = "anyURI")
    protected String faultactor;
    protected Detail detail;

    /**
     * Gets the value of the faultcode property.
     * 
     * @return
     *     possible object is
     *     {@link QName }
     *     
     */
    public QName getFaultcode() {
        return faultcode;
    }

    /**
     * Sets the value of the faultcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link QName }
     *     
     */
    public void setFaultcode(QName value) {
        this.faultcode = value;
    }

    /**
     * Gets the value of the faultstring property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultstring() {
        return faultstring;
    }

    /**
     * Sets the value of the faultstring property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultstring(String value) {
        this.faultstring = value;
    }

    /**
     * Gets the value of the faultactor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaultactor() {
        return faultactor;
    }

    /**
     * Sets the value of the faultactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaultactor(String value) {
        this.faultactor = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link Detail }
     *     
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Detail }
     *     
     */
    public void setDetail(Detail value) {
        this.detail = value;
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
            QName theFaultcode;
            theFaultcode = this.getFaultcode();
            strategy.appendField(locator, this, "faultcode", buffer, theFaultcode, (this.faultcode!= null));
        }
        {
            String theFaultstring;
            theFaultstring = this.getFaultstring();
            strategy.appendField(locator, this, "faultstring", buffer, theFaultstring, (this.faultstring!= null));
        }
        {
            String theFaultactor;
            theFaultactor = this.getFaultactor();
            strategy.appendField(locator, this, "faultactor", buffer, theFaultactor, (this.faultactor!= null));
        }
        {
            Detail theDetail;
            theDetail = this.getDetail();
            strategy.appendField(locator, this, "detail", buffer, theDetail, (this.detail!= null));
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
        final Fault that = ((Fault) object);
        {
            QName lhsFaultcode;
            lhsFaultcode = this.getFaultcode();
            QName rhsFaultcode;
            rhsFaultcode = that.getFaultcode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faultcode", lhsFaultcode), LocatorUtils.property(thatLocator, "faultcode", rhsFaultcode), lhsFaultcode, rhsFaultcode, (this.faultcode!= null), (that.faultcode!= null))) {
                return false;
            }
        }
        {
            String lhsFaultstring;
            lhsFaultstring = this.getFaultstring();
            String rhsFaultstring;
            rhsFaultstring = that.getFaultstring();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faultstring", lhsFaultstring), LocatorUtils.property(thatLocator, "faultstring", rhsFaultstring), lhsFaultstring, rhsFaultstring, (this.faultstring!= null), (that.faultstring!= null))) {
                return false;
            }
        }
        {
            String lhsFaultactor;
            lhsFaultactor = this.getFaultactor();
            String rhsFaultactor;
            rhsFaultactor = that.getFaultactor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "faultactor", lhsFaultactor), LocatorUtils.property(thatLocator, "faultactor", rhsFaultactor), lhsFaultactor, rhsFaultactor, (this.faultactor!= null), (that.faultactor!= null))) {
                return false;
            }
        }
        {
            Detail lhsDetail;
            lhsDetail = this.getDetail();
            Detail rhsDetail;
            rhsDetail = that.getDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "detail", lhsDetail), LocatorUtils.property(thatLocator, "detail", rhsDetail), lhsDetail, rhsDetail, (this.detail!= null), (that.detail!= null))) {
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
            QName theFaultcode;
            theFaultcode = this.getFaultcode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "faultcode", theFaultcode), currentHashCode, theFaultcode, (this.faultcode!= null));
        }
        {
            String theFaultstring;
            theFaultstring = this.getFaultstring();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "faultstring", theFaultstring), currentHashCode, theFaultstring, (this.faultstring!= null));
        }
        {
            String theFaultactor;
            theFaultactor = this.getFaultactor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "faultactor", theFaultactor), currentHashCode, theFaultactor, (this.faultactor!= null));
        }
        {
            Detail theDetail;
            theDetail = this.getDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "detail", theDetail), currentHashCode, theDetail, (this.detail!= null));
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
        if (draftCopy instanceof Fault) {
            final Fault copy = ((Fault) draftCopy);
            {
                Boolean faultcodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.faultcode!= null));
                if (faultcodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    QName sourceFaultcode;
                    sourceFaultcode = this.getFaultcode();
                    QName copyFaultcode = ((QName) strategy.copy(LocatorUtils.property(locator, "faultcode", sourceFaultcode), sourceFaultcode, (this.faultcode!= null)));
                    copy.setFaultcode(copyFaultcode);
                } else {
                    if (faultcodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.faultcode = null;
                    }
                }
            }
            {
                Boolean faultstringShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.faultstring!= null));
                if (faultstringShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFaultstring;
                    sourceFaultstring = this.getFaultstring();
                    String copyFaultstring = ((String) strategy.copy(LocatorUtils.property(locator, "faultstring", sourceFaultstring), sourceFaultstring, (this.faultstring!= null)));
                    copy.setFaultstring(copyFaultstring);
                } else {
                    if (faultstringShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.faultstring = null;
                    }
                }
            }
            {
                Boolean faultactorShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.faultactor!= null));
                if (faultactorShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceFaultactor;
                    sourceFaultactor = this.getFaultactor();
                    String copyFaultactor = ((String) strategy.copy(LocatorUtils.property(locator, "faultactor", sourceFaultactor), sourceFaultactor, (this.faultactor!= null)));
                    copy.setFaultactor(copyFaultactor);
                } else {
                    if (faultactorShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.faultactor = null;
                    }
                }
            }
            {
                Boolean detailShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.detail!= null));
                if (detailShouldBeCopiedAndSet == Boolean.TRUE) {
                    Detail sourceDetail;
                    sourceDetail = this.getDetail();
                    Detail copyDetail = ((Detail) strategy.copy(LocatorUtils.property(locator, "detail", sourceDetail), sourceDetail, (this.detail!= null)));
                    copy.setDetail(copyDetail);
                } else {
                    if (detailShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.detail = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Fault();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof Fault) {
            final Fault target = this;
            final Fault leftObject = ((Fault) left);
            final Fault rightObject = ((Fault) right);
            {
                Boolean faultcodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.faultcode!= null), (rightObject.faultcode!= null));
                if (faultcodeShouldBeMergedAndSet == Boolean.TRUE) {
                    QName lhsFaultcode;
                    lhsFaultcode = leftObject.getFaultcode();
                    QName rhsFaultcode;
                    rhsFaultcode = rightObject.getFaultcode();
                    QName mergedFaultcode = ((QName) strategy.merge(LocatorUtils.property(leftLocator, "faultcode", lhsFaultcode), LocatorUtils.property(rightLocator, "faultcode", rhsFaultcode), lhsFaultcode, rhsFaultcode, (leftObject.faultcode!= null), (rightObject.faultcode!= null)));
                    target.setFaultcode(mergedFaultcode);
                } else {
                    if (faultcodeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.faultcode = null;
                    }
                }
            }
            {
                Boolean faultstringShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.faultstring!= null), (rightObject.faultstring!= null));
                if (faultstringShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsFaultstring;
                    lhsFaultstring = leftObject.getFaultstring();
                    String rhsFaultstring;
                    rhsFaultstring = rightObject.getFaultstring();
                    String mergedFaultstring = ((String) strategy.merge(LocatorUtils.property(leftLocator, "faultstring", lhsFaultstring), LocatorUtils.property(rightLocator, "faultstring", rhsFaultstring), lhsFaultstring, rhsFaultstring, (leftObject.faultstring!= null), (rightObject.faultstring!= null)));
                    target.setFaultstring(mergedFaultstring);
                } else {
                    if (faultstringShouldBeMergedAndSet == Boolean.FALSE) {
                        target.faultstring = null;
                    }
                }
            }
            {
                Boolean faultactorShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.faultactor!= null), (rightObject.faultactor!= null));
                if (faultactorShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsFaultactor;
                    lhsFaultactor = leftObject.getFaultactor();
                    String rhsFaultactor;
                    rhsFaultactor = rightObject.getFaultactor();
                    String mergedFaultactor = ((String) strategy.merge(LocatorUtils.property(leftLocator, "faultactor", lhsFaultactor), LocatorUtils.property(rightLocator, "faultactor", rhsFaultactor), lhsFaultactor, rhsFaultactor, (leftObject.faultactor!= null), (rightObject.faultactor!= null)));
                    target.setFaultactor(mergedFaultactor);
                } else {
                    if (faultactorShouldBeMergedAndSet == Boolean.FALSE) {
                        target.faultactor = null;
                    }
                }
            }
            {
                Boolean detailShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.detail!= null), (rightObject.detail!= null));
                if (detailShouldBeMergedAndSet == Boolean.TRUE) {
                    Detail lhsDetail;
                    lhsDetail = leftObject.getDetail();
                    Detail rhsDetail;
                    rhsDetail = rightObject.getDetail();
                    Detail mergedDetail = ((Detail) strategy.merge(LocatorUtils.property(leftLocator, "detail", lhsDetail), LocatorUtils.property(rightLocator, "detail", rhsDetail), lhsDetail, rhsDetail, (leftObject.detail!= null), (rightObject.detail!= null)));
                    target.setDetail(mergedDetail);
                } else {
                    if (detailShouldBeMergedAndSet == Boolean.FALSE) {
                        target.detail = null;
                    }
                }
            }
        }
    }

}
