//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.20 at 09:36:46 PM BST 
//


package pl.baczkowicz.spy.common.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConversionMethod"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Plain"/&gt;
 *     &lt;enumeration value="HexDecode"/&gt;
 *     &lt;enumeration value="HexEncode"/&gt;
 *     &lt;enumeration value="Base64Decode"/&gt;
 *     &lt;enumeration value="Base64Encode"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConversionMethod")
@XmlEnum
public enum ConversionMethod {

    @XmlEnumValue("Plain")
    PLAIN("Plain"),
    @XmlEnumValue("HexDecode")
    HEX_DECODE("HexDecode"),
    @XmlEnumValue("HexEncode")
    HEX_ENCODE("HexEncode"),
    @XmlEnumValue("Base64Decode")
    BASE_64_DECODE("Base64Decode"),
    @XmlEnumValue("Base64Encode")
    BASE_64_ENCODE("Base64Encode");
    private final String value;

    ConversionMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConversionMethod fromValue(String v) {
        for (ConversionMethod c: ConversionMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
