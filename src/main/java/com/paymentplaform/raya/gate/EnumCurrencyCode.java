
package com.paymentplaform.raya.gate;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.EnumValue;


/**
 * <p>Java class for EnumCurrencyCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumCurrencyCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EGP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EnumCurrencyCode", namespace = "http://raya.paymentplaform.com/gate")
@XmlEnum
public enum EnumCurrencyCode
    implements EnumValue<String>
{

    EGP;

    public String value() {
        return name();
    }

    public static EnumCurrencyCode fromValue(String v) {
        return valueOf(v);
    }

    public String enumValue() {
        return this.value();
    }

}
