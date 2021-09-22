
package com.paymentplaform.raya.gate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
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
import org.w3c.dom.Element;


/**
 * <p>Java class for detail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;anyAttribute processContents='lax'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detail", namespace = "http://raya.paymentplaform.com/gate", propOrder = {
    "anies"
})
public class Detail implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlAnyElement
    protected List<Element> anies;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the anies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * 
     * 
     */
    public List<Element> getAnies() {
        if (anies == null) {
            anies = new ArrayList<Element>();
        }
        return this.anies;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
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
            List<Element> theAnies;
            theAnies = (((this.anies!= null)&&(!this.anies.isEmpty()))?this.getAnies():null);
            strategy.appendField(locator, this, "anies", buffer, theAnies, ((this.anies!= null)&&(!this.anies.isEmpty())));
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
        final Detail that = ((Detail) object);
        {
            List<Element> lhsAnies;
            lhsAnies = (((this.anies!= null)&&(!this.anies.isEmpty()))?this.getAnies():null);
            List<Element> rhsAnies;
            rhsAnies = (((that.anies!= null)&&(!that.anies.isEmpty()))?that.getAnies():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "anies", lhsAnies), LocatorUtils.property(thatLocator, "anies", rhsAnies), lhsAnies, rhsAnies, ((this.anies!= null)&&(!this.anies.isEmpty())), ((that.anies!= null)&&(!that.anies.isEmpty())))) {
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
            List<Element> theAnies;
            theAnies = (((this.anies!= null)&&(!this.anies.isEmpty()))?this.getAnies():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "anies", theAnies), currentHashCode, theAnies, ((this.anies!= null)&&(!this.anies.isEmpty())));
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
        if (draftCopy instanceof Detail) {
            final Detail copy = ((Detail) draftCopy);
            {
                Boolean aniesShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, ((this.anies!= null)&&(!this.anies.isEmpty())));
                if (aniesShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<Element> sourceAnies;
                    sourceAnies = (((this.anies!= null)&&(!this.anies.isEmpty()))?this.getAnies():null);
                    @SuppressWarnings("unchecked")
                    List<Element> copyAnies = ((List<Element> ) strategy.copy(LocatorUtils.property(locator, "anies", sourceAnies), sourceAnies, ((this.anies!= null)&&(!this.anies.isEmpty()))));
                    copy.anies = null;
                    if (copyAnies!= null) {
                        List<Element> uniqueAniesl = copy.getAnies();
                        uniqueAniesl.addAll(copyAnies);
                    }
                } else {
                    if (aniesShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.anies = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Detail();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof Detail) {
            final Detail target = this;
            final Detail leftObject = ((Detail) left);
            final Detail rightObject = ((Detail) right);
            {
                Boolean aniesShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, ((leftObject.anies!= null)&&(!leftObject.anies.isEmpty())), ((rightObject.anies!= null)&&(!rightObject.anies.isEmpty())));
                if (aniesShouldBeMergedAndSet == Boolean.TRUE) {
                    List<Element> lhsAnies;
                    lhsAnies = (((leftObject.anies!= null)&&(!leftObject.anies.isEmpty()))?leftObject.getAnies():null);
                    List<Element> rhsAnies;
                    rhsAnies = (((rightObject.anies!= null)&&(!rightObject.anies.isEmpty()))?rightObject.getAnies():null);
                    List<Element> mergedAnies = ((List<Element> ) strategy.merge(LocatorUtils.property(leftLocator, "anies", lhsAnies), LocatorUtils.property(rightLocator, "anies", rhsAnies), lhsAnies, rhsAnies, ((leftObject.anies!= null)&&(!leftObject.anies.isEmpty())), ((rightObject.anies!= null)&&(!rightObject.anies.isEmpty()))));
                    target.anies = null;
                    if (mergedAnies!= null) {
                        List<Element> uniqueAniesl = target.getAnies();
                        uniqueAniesl.addAll(mergedAnies);
                    }
                } else {
                    if (aniesShouldBeMergedAndSet == Boolean.FALSE) {
                        target.anies = null;
                    }
                }
            }
        }
    }

    public void setAnies(List<Element> value) {
        this.anies = value;
    }

}
