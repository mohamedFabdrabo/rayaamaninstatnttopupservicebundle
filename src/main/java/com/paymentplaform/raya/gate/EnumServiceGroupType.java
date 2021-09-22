
package com.paymentplaform.raya.gate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.EnumValue;


/**
 * <p>Java class for EnumServiceGroupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumServiceGroupType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TLCM"/&gt;
 *     &lt;enumeration value="ELC"/&gt;
 *     &lt;enumeration value="INS"/&gt;
 *     &lt;enumeration value="TRV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumServiceGroupType", namespace = "http://raya.paymentplaform.com/gate")
@XmlEnum
public enum EnumServiceGroupType
    implements EnumValue<String>
{

    TLCM,
    ELC,
    INS,
    TRV;

    public String value() {
        return name();
    }

    public static EnumServiceGroupType fromValue(String v) {
        return valueOf(v);
    }

    public String enumValue() {
        return this.value();
    }

}
