
package com.paymentplaform.raya.gate;

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
 * <p>Java class for ResponseHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Source" type="{http://raya.paymentplaform.com/gate}Source" minOccurs="0"/&gt;
 *         &lt;element name="ClientTSP" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="TermID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ChannelType" type="{http://raya.paymentplaform.com/gate}EnumChannelType"/&gt;
 *         &lt;element name="ClientSeqID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MsgCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WSDL_Ver" type="{http://raya.paymentplaform.com/gate}WSDL_Ver"/&gt;
 *         &lt;element name="ServerTSP" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Language" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseHeader", namespace = "http://raya.paymentplaform.com/gate", propOrder = {
    "source",
    "clientTSP",
    "termID",
    "channelType",
    "clientSeqID",
    "msgCode",
    "wsdlVer",
    "serverTSP",
    "language"
})
public class ResponseHeader implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "Source")
    protected Source source;
    @XmlElement(name = "ClientTSP", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar clientTSP;
    @XmlElement(name = "TermID", required = true)
    protected String termID;
    @XmlElement(name = "ChannelType", required = true)
    @XmlSchemaType(name = "string")
    protected EnumChannelType channelType;
    @XmlElement(name = "ClientSeqID", required = true)
    protected String clientSeqID;
    @XmlElement(name = "MsgCode", required = true)
    protected String msgCode;
    @XmlElement(name = "WSDL_Ver", required = true)
    protected String wsdlVer;
    @XmlElement(name = "ServerTSP", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serverTSP;
    @XmlElement(name = "Language", required = true)
    protected String language;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the clientTSP property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClientTSP() {
        return clientTSP;
    }

    /**
     * Sets the value of the clientTSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClientTSP(XMLGregorianCalendar value) {
        this.clientTSP = value;
    }

    /**
     * Gets the value of the termID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermID() {
        return termID;
    }

    /**
     * Sets the value of the termID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermID(String value) {
        this.termID = value;
    }

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link EnumChannelType }
     *     
     */
    public EnumChannelType getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumChannelType }
     *     
     */
    public void setChannelType(EnumChannelType value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the clientSeqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientSeqID() {
        return clientSeqID;
    }

    /**
     * Sets the value of the clientSeqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientSeqID(String value) {
        this.clientSeqID = value;
    }

    /**
     * Gets the value of the msgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgCode() {
        return msgCode;
    }

    /**
     * Sets the value of the msgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgCode(String value) {
        this.msgCode = value;
    }

    /**
     * Gets the value of the wsdlVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWSDLVer() {
        return wsdlVer;
    }

    /**
     * Sets the value of the wsdlVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWSDLVer(String value) {
        this.wsdlVer = value;
    }

    /**
     * Gets the value of the serverTSP property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServerTSP() {
        return serverTSP;
    }

    /**
     * Sets the value of the serverTSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServerTSP(XMLGregorianCalendar value) {
        this.serverTSP = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
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
            Source theSource;
            theSource = this.getSource();
            strategy.appendField(locator, this, "source", buffer, theSource, (this.source!= null));
        }
        {
            XMLGregorianCalendar theClientTSP;
            theClientTSP = this.getClientTSP();
            strategy.appendField(locator, this, "clientTSP", buffer, theClientTSP, (this.clientTSP!= null));
        }
        {
            String theTermID;
            theTermID = this.getTermID();
            strategy.appendField(locator, this, "termID", buffer, theTermID, (this.termID!= null));
        }
        {
            EnumChannelType theChannelType;
            theChannelType = this.getChannelType();
            strategy.appendField(locator, this, "channelType", buffer, theChannelType, (this.channelType!= null));
        }
        {
            String theClientSeqID;
            theClientSeqID = this.getClientSeqID();
            strategy.appendField(locator, this, "clientSeqID", buffer, theClientSeqID, (this.clientSeqID!= null));
        }
        {
            String theMsgCode;
            theMsgCode = this.getMsgCode();
            strategy.appendField(locator, this, "msgCode", buffer, theMsgCode, (this.msgCode!= null));
        }
        {
            String theWSDLVer;
            theWSDLVer = this.getWSDLVer();
            strategy.appendField(locator, this, "wsdlVer", buffer, theWSDLVer, (this.wsdlVer!= null));
        }
        {
            XMLGregorianCalendar theServerTSP;
            theServerTSP = this.getServerTSP();
            strategy.appendField(locator, this, "serverTSP", buffer, theServerTSP, (this.serverTSP!= null));
        }
        {
            String theLanguage;
            theLanguage = this.getLanguage();
            strategy.appendField(locator, this, "language", buffer, theLanguage, (this.language!= null));
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
        final ResponseHeader that = ((ResponseHeader) object);
        {
            Source lhsSource;
            lhsSource = this.getSource();
            Source rhsSource;
            rhsSource = that.getSource();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "source", lhsSource), LocatorUtils.property(thatLocator, "source", rhsSource), lhsSource, rhsSource, (this.source!= null), (that.source!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsClientTSP;
            lhsClientTSP = this.getClientTSP();
            XMLGregorianCalendar rhsClientTSP;
            rhsClientTSP = that.getClientTSP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientTSP", lhsClientTSP), LocatorUtils.property(thatLocator, "clientTSP", rhsClientTSP), lhsClientTSP, rhsClientTSP, (this.clientTSP!= null), (that.clientTSP!= null))) {
                return false;
            }
        }
        {
            String lhsTermID;
            lhsTermID = this.getTermID();
            String rhsTermID;
            rhsTermID = that.getTermID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "termID", lhsTermID), LocatorUtils.property(thatLocator, "termID", rhsTermID), lhsTermID, rhsTermID, (this.termID!= null), (that.termID!= null))) {
                return false;
            }
        }
        {
            EnumChannelType lhsChannelType;
            lhsChannelType = this.getChannelType();
            EnumChannelType rhsChannelType;
            rhsChannelType = that.getChannelType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "channelType", lhsChannelType), LocatorUtils.property(thatLocator, "channelType", rhsChannelType), lhsChannelType, rhsChannelType, (this.channelType!= null), (that.channelType!= null))) {
                return false;
            }
        }
        {
            String lhsClientSeqID;
            lhsClientSeqID = this.getClientSeqID();
            String rhsClientSeqID;
            rhsClientSeqID = that.getClientSeqID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "clientSeqID", lhsClientSeqID), LocatorUtils.property(thatLocator, "clientSeqID", rhsClientSeqID), lhsClientSeqID, rhsClientSeqID, (this.clientSeqID!= null), (that.clientSeqID!= null))) {
                return false;
            }
        }
        {
            String lhsMsgCode;
            lhsMsgCode = this.getMsgCode();
            String rhsMsgCode;
            rhsMsgCode = that.getMsgCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "msgCode", lhsMsgCode), LocatorUtils.property(thatLocator, "msgCode", rhsMsgCode), lhsMsgCode, rhsMsgCode, (this.msgCode!= null), (that.msgCode!= null))) {
                return false;
            }
        }
        {
            String lhsWSDLVer;
            lhsWSDLVer = this.getWSDLVer();
            String rhsWSDLVer;
            rhsWSDLVer = that.getWSDLVer();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wsdlVer", lhsWSDLVer), LocatorUtils.property(thatLocator, "wsdlVer", rhsWSDLVer), lhsWSDLVer, rhsWSDLVer, (this.wsdlVer!= null), (that.wsdlVer!= null))) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsServerTSP;
            lhsServerTSP = this.getServerTSP();
            XMLGregorianCalendar rhsServerTSP;
            rhsServerTSP = that.getServerTSP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serverTSP", lhsServerTSP), LocatorUtils.property(thatLocator, "serverTSP", rhsServerTSP), lhsServerTSP, rhsServerTSP, (this.serverTSP!= null), (that.serverTSP!= null))) {
                return false;
            }
        }
        {
            String lhsLanguage;
            lhsLanguage = this.getLanguage();
            String rhsLanguage;
            rhsLanguage = that.getLanguage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "language", lhsLanguage), LocatorUtils.property(thatLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage, (this.language!= null), (that.language!= null))) {
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
            Source theSource;
            theSource = this.getSource();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "source", theSource), currentHashCode, theSource, (this.source!= null));
        }
        {
            XMLGregorianCalendar theClientTSP;
            theClientTSP = this.getClientTSP();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientTSP", theClientTSP), currentHashCode, theClientTSP, (this.clientTSP!= null));
        }
        {
            String theTermID;
            theTermID = this.getTermID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "termID", theTermID), currentHashCode, theTermID, (this.termID!= null));
        }
        {
            EnumChannelType theChannelType;
            theChannelType = this.getChannelType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "channelType", theChannelType), currentHashCode, theChannelType, (this.channelType!= null));
        }
        {
            String theClientSeqID;
            theClientSeqID = this.getClientSeqID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "clientSeqID", theClientSeqID), currentHashCode, theClientSeqID, (this.clientSeqID!= null));
        }
        {
            String theMsgCode;
            theMsgCode = this.getMsgCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "msgCode", theMsgCode), currentHashCode, theMsgCode, (this.msgCode!= null));
        }
        {
            String theWSDLVer;
            theWSDLVer = this.getWSDLVer();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wsdlVer", theWSDLVer), currentHashCode, theWSDLVer, (this.wsdlVer!= null));
        }
        {
            XMLGregorianCalendar theServerTSP;
            theServerTSP = this.getServerTSP();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serverTSP", theServerTSP), currentHashCode, theServerTSP, (this.serverTSP!= null));
        }
        {
            String theLanguage;
            theLanguage = this.getLanguage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "language", theLanguage), currentHashCode, theLanguage, (this.language!= null));
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
        if (draftCopy instanceof ResponseHeader) {
            final ResponseHeader copy = ((ResponseHeader) draftCopy);
            {
                Boolean sourceShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.source!= null));
                if (sourceShouldBeCopiedAndSet == Boolean.TRUE) {
                    Source sourceSource;
                    sourceSource = this.getSource();
                    Source copySource = ((Source) strategy.copy(LocatorUtils.property(locator, "source", sourceSource), sourceSource, (this.source!= null)));
                    copy.setSource(copySource);
                } else {
                    if (sourceShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.source = null;
                    }
                }
            }
            {
                Boolean clientTSPShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.clientTSP!= null));
                if (clientTSPShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceClientTSP;
                    sourceClientTSP = this.getClientTSP();
                    XMLGregorianCalendar copyClientTSP = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "clientTSP", sourceClientTSP), sourceClientTSP, (this.clientTSP!= null)));
                    copy.setClientTSP(copyClientTSP);
                } else {
                    if (clientTSPShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.clientTSP = null;
                    }
                }
            }
            {
                Boolean termIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.termID!= null));
                if (termIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTermID;
                    sourceTermID = this.getTermID();
                    String copyTermID = ((String) strategy.copy(LocatorUtils.property(locator, "termID", sourceTermID), sourceTermID, (this.termID!= null)));
                    copy.setTermID(copyTermID);
                } else {
                    if (termIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.termID = null;
                    }
                }
            }
            {
                Boolean channelTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.channelType!= null));
                if (channelTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    EnumChannelType sourceChannelType;
                    sourceChannelType = this.getChannelType();
                    EnumChannelType copyChannelType = ((EnumChannelType) strategy.copy(LocatorUtils.property(locator, "channelType", sourceChannelType), sourceChannelType, (this.channelType!= null)));
                    copy.setChannelType(copyChannelType);
                } else {
                    if (channelTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.channelType = null;
                    }
                }
            }
            {
                Boolean clientSeqIDShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.clientSeqID!= null));
                if (clientSeqIDShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceClientSeqID;
                    sourceClientSeqID = this.getClientSeqID();
                    String copyClientSeqID = ((String) strategy.copy(LocatorUtils.property(locator, "clientSeqID", sourceClientSeqID), sourceClientSeqID, (this.clientSeqID!= null)));
                    copy.setClientSeqID(copyClientSeqID);
                } else {
                    if (clientSeqIDShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.clientSeqID = null;
                    }
                }
            }
            {
                Boolean msgCodeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.msgCode!= null));
                if (msgCodeShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceMsgCode;
                    sourceMsgCode = this.getMsgCode();
                    String copyMsgCode = ((String) strategy.copy(LocatorUtils.property(locator, "msgCode", sourceMsgCode), sourceMsgCode, (this.msgCode!= null)));
                    copy.setMsgCode(copyMsgCode);
                } else {
                    if (msgCodeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.msgCode = null;
                    }
                }
            }
            {
                Boolean wsdlVerShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.wsdlVer!= null));
                if (wsdlVerShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceWSDLVer;
                    sourceWSDLVer = this.getWSDLVer();
                    String copyWSDLVer = ((String) strategy.copy(LocatorUtils.property(locator, "wsdlVer", sourceWSDLVer), sourceWSDLVer, (this.wsdlVer!= null)));
                    copy.setWSDLVer(copyWSDLVer);
                } else {
                    if (wsdlVerShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.wsdlVer = null;
                    }
                }
            }
            {
                Boolean serverTSPShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.serverTSP!= null));
                if (serverTSPShouldBeCopiedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar sourceServerTSP;
                    sourceServerTSP = this.getServerTSP();
                    XMLGregorianCalendar copyServerTSP = ((XMLGregorianCalendar) strategy.copy(LocatorUtils.property(locator, "serverTSP", sourceServerTSP), sourceServerTSP, (this.serverTSP!= null)));
                    copy.setServerTSP(copyServerTSP);
                } else {
                    if (serverTSPShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.serverTSP = null;
                    }
                }
            }
            {
                Boolean languageShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, (this.language!= null));
                if (languageShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceLanguage;
                    sourceLanguage = this.getLanguage();
                    String copyLanguage = ((String) strategy.copy(LocatorUtils.property(locator, "language", sourceLanguage), sourceLanguage, (this.language!= null)));
                    copy.setLanguage(copyLanguage);
                } else {
                    if (languageShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.language = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new ResponseHeader();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        if (right instanceof ResponseHeader) {
            final ResponseHeader target = this;
            final ResponseHeader leftObject = ((ResponseHeader) left);
            final ResponseHeader rightObject = ((ResponseHeader) right);
            {
                Boolean sourceShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.source!= null), (rightObject.source!= null));
                if (sourceShouldBeMergedAndSet == Boolean.TRUE) {
                    Source lhsSource;
                    lhsSource = leftObject.getSource();
                    Source rhsSource;
                    rhsSource = rightObject.getSource();
                    Source mergedSource = ((Source) strategy.merge(LocatorUtils.property(leftLocator, "source", lhsSource), LocatorUtils.property(rightLocator, "source", rhsSource), lhsSource, rhsSource, (leftObject.source!= null), (rightObject.source!= null)));
                    target.setSource(mergedSource);
                } else {
                    if (sourceShouldBeMergedAndSet == Boolean.FALSE) {
                        target.source = null;
                    }
                }
            }
            {
                Boolean clientTSPShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.clientTSP!= null), (rightObject.clientTSP!= null));
                if (clientTSPShouldBeMergedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar lhsClientTSP;
                    lhsClientTSP = leftObject.getClientTSP();
                    XMLGregorianCalendar rhsClientTSP;
                    rhsClientTSP = rightObject.getClientTSP();
                    XMLGregorianCalendar mergedClientTSP = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "clientTSP", lhsClientTSP), LocatorUtils.property(rightLocator, "clientTSP", rhsClientTSP), lhsClientTSP, rhsClientTSP, (leftObject.clientTSP!= null), (rightObject.clientTSP!= null)));
                    target.setClientTSP(mergedClientTSP);
                } else {
                    if (clientTSPShouldBeMergedAndSet == Boolean.FALSE) {
                        target.clientTSP = null;
                    }
                }
            }
            {
                Boolean termIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.termID!= null), (rightObject.termID!= null));
                if (termIDShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsTermID;
                    lhsTermID = leftObject.getTermID();
                    String rhsTermID;
                    rhsTermID = rightObject.getTermID();
                    String mergedTermID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "termID", lhsTermID), LocatorUtils.property(rightLocator, "termID", rhsTermID), lhsTermID, rhsTermID, (leftObject.termID!= null), (rightObject.termID!= null)));
                    target.setTermID(mergedTermID);
                } else {
                    if (termIDShouldBeMergedAndSet == Boolean.FALSE) {
                        target.termID = null;
                    }
                }
            }
            {
                Boolean channelTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.channelType!= null), (rightObject.channelType!= null));
                if (channelTypeShouldBeMergedAndSet == Boolean.TRUE) {
                    EnumChannelType lhsChannelType;
                    lhsChannelType = leftObject.getChannelType();
                    EnumChannelType rhsChannelType;
                    rhsChannelType = rightObject.getChannelType();
                    EnumChannelType mergedChannelType = ((EnumChannelType) strategy.merge(LocatorUtils.property(leftLocator, "channelType", lhsChannelType), LocatorUtils.property(rightLocator, "channelType", rhsChannelType), lhsChannelType, rhsChannelType, (leftObject.channelType!= null), (rightObject.channelType!= null)));
                    target.setChannelType(mergedChannelType);
                } else {
                    if (channelTypeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.channelType = null;
                    }
                }
            }
            {
                Boolean clientSeqIDShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.clientSeqID!= null), (rightObject.clientSeqID!= null));
                if (clientSeqIDShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsClientSeqID;
                    lhsClientSeqID = leftObject.getClientSeqID();
                    String rhsClientSeqID;
                    rhsClientSeqID = rightObject.getClientSeqID();
                    String mergedClientSeqID = ((String) strategy.merge(LocatorUtils.property(leftLocator, "clientSeqID", lhsClientSeqID), LocatorUtils.property(rightLocator, "clientSeqID", rhsClientSeqID), lhsClientSeqID, rhsClientSeqID, (leftObject.clientSeqID!= null), (rightObject.clientSeqID!= null)));
                    target.setClientSeqID(mergedClientSeqID);
                } else {
                    if (clientSeqIDShouldBeMergedAndSet == Boolean.FALSE) {
                        target.clientSeqID = null;
                    }
                }
            }
            {
                Boolean msgCodeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.msgCode!= null), (rightObject.msgCode!= null));
                if (msgCodeShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsMsgCode;
                    lhsMsgCode = leftObject.getMsgCode();
                    String rhsMsgCode;
                    rhsMsgCode = rightObject.getMsgCode();
                    String mergedMsgCode = ((String) strategy.merge(LocatorUtils.property(leftLocator, "msgCode", lhsMsgCode), LocatorUtils.property(rightLocator, "msgCode", rhsMsgCode), lhsMsgCode, rhsMsgCode, (leftObject.msgCode!= null), (rightObject.msgCode!= null)));
                    target.setMsgCode(mergedMsgCode);
                } else {
                    if (msgCodeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.msgCode = null;
                    }
                }
            }
            {
                Boolean wsdlVerShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.wsdlVer!= null), (rightObject.wsdlVer!= null));
                if (wsdlVerShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsWSDLVer;
                    lhsWSDLVer = leftObject.getWSDLVer();
                    String rhsWSDLVer;
                    rhsWSDLVer = rightObject.getWSDLVer();
                    String mergedWSDLVer = ((String) strategy.merge(LocatorUtils.property(leftLocator, "wsdlVer", lhsWSDLVer), LocatorUtils.property(rightLocator, "wsdlVer", rhsWSDLVer), lhsWSDLVer, rhsWSDLVer, (leftObject.wsdlVer!= null), (rightObject.wsdlVer!= null)));
                    target.setWSDLVer(mergedWSDLVer);
                } else {
                    if (wsdlVerShouldBeMergedAndSet == Boolean.FALSE) {
                        target.wsdlVer = null;
                    }
                }
            }
            {
                Boolean serverTSPShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.serverTSP!= null), (rightObject.serverTSP!= null));
                if (serverTSPShouldBeMergedAndSet == Boolean.TRUE) {
                    XMLGregorianCalendar lhsServerTSP;
                    lhsServerTSP = leftObject.getServerTSP();
                    XMLGregorianCalendar rhsServerTSP;
                    rhsServerTSP = rightObject.getServerTSP();
                    XMLGregorianCalendar mergedServerTSP = ((XMLGregorianCalendar) strategy.merge(LocatorUtils.property(leftLocator, "serverTSP", lhsServerTSP), LocatorUtils.property(rightLocator, "serverTSP", rhsServerTSP), lhsServerTSP, rhsServerTSP, (leftObject.serverTSP!= null), (rightObject.serverTSP!= null)));
                    target.setServerTSP(mergedServerTSP);
                } else {
                    if (serverTSPShouldBeMergedAndSet == Boolean.FALSE) {
                        target.serverTSP = null;
                    }
                }
            }
            {
                Boolean languageShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, (leftObject.language!= null), (rightObject.language!= null));
                if (languageShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsLanguage;
                    lhsLanguage = leftObject.getLanguage();
                    String rhsLanguage;
                    rhsLanguage = rightObject.getLanguage();
                    String mergedLanguage = ((String) strategy.merge(LocatorUtils.property(leftLocator, "language", lhsLanguage), LocatorUtils.property(rightLocator, "language", rhsLanguage), lhsLanguage, rhsLanguage, (leftObject.language!= null), (rightObject.language!= null)));
                    target.setLanguage(mergedLanguage);
                } else {
                    if (languageShouldBeMergedAndSet == Boolean.FALSE) {
                        target.language = null;
                    }
                }
            }
        }
    }

}
