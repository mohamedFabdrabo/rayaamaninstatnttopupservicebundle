
package com.paymentplaform.raya.gate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.EnumValue;


/**
 * <p>Java class for EnumTransType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumTransType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INQ"/&gt;
 *     &lt;enumeration value="SRH"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="PAY"/&gt;
 *     &lt;enumeration value="TOPUP"/&gt;
 *     &lt;enumeration value="VOCH"/&gt;
 *     &lt;enumeration value="PAY"/&gt;
 *     &lt;enumeration value="TRF"/&gt;
 *     &lt;enumeration value="COLL"/&gt;
 *     &lt;enumeration value="COLL-MOB"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumTransType", namespace = "http://raya.paymentplaform.com/gate")
@XmlEnum
public enum EnumTransType
    implements EnumValue<String>
{

    INQ("INQ"),
    SRH("SRH"),
    PRC("PRC"),
    PAY("PAY"),
    TOPUP("TOPUP"),
    VOCH("VOCH"),
    TRF("TRF"),
    COLL("COLL"),
    @XmlEnumValue("COLL-MOB")
    COLL_MOB("COLL-MOB");
    private final String value;

    EnumTransType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumTransType fromValue(String v) {
        for (EnumTransType c: EnumTransType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String enumValue() {
        return this.value();
    }

}
