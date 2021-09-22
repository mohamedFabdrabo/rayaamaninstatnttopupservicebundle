
package com.paymentplaform.raya.gate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.EnumValue;


/**
 * <p>Java class for EnumRsLangType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumRsLangType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ar-eg"/&gt;
 *     &lt;enumeration value="en-gb"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumRsLangType", namespace = "http://raya.paymentplaform.com/gate")
@XmlEnum
public enum EnumRsLangType
    implements EnumValue<String>
{

    @XmlEnumValue("ar-eg")
    AR_EG("ar-eg"),
    @XmlEnumValue("en-gb")
    EN_GB("en-gb");
    private final String value;

    EnumRsLangType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EnumRsLangType fromValue(String v) {
        for (EnumRsLangType c: EnumRsLangType.values()) {
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
