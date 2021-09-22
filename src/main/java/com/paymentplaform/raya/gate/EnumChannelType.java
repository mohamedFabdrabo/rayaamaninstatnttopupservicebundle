
package com.paymentplaform.raya.gate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.EnumValue;


/**
 * <p>Java class for EnumChannelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumChannelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ATM"/&gt;
 *     &lt;enumeration value="IVR"/&gt;
 *     &lt;enumeration value="KSK"/&gt;
 *     &lt;enumeration value="INT"/&gt;
 *     &lt;enumeration value="MOB"/&gt;
 *     &lt;enumeration value="PTL"/&gt;
 *     &lt;enumeration value="BTL"/&gt;
 *     &lt;enumeration value="POS"/&gt;
 *     &lt;enumeration value="CAM"/&gt;
 *     &lt;enumeration value="CCC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumChannelType", namespace = "http://raya.paymentplaform.com/gate")
@XmlEnum
public enum EnumChannelType
    implements EnumValue<String>
{

    ATM,
    IVR,
    KSK,
    INT,
    MOB,
    PTL,
    BTL,
    POS,
    CAM,
    CCC;

    public String value() {
        return name();
    }

    public static EnumChannelType fromValue(String v) {
        return valueOf(v);
    }

    public String enumValue() {
        return this.value();
    }

}
