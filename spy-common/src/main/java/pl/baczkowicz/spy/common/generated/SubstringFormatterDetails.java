//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.20 at 11:15:48 PM BST 
//


package pl.baczkowicz.spy.common.generated;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for SubstringFormatterDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstringFormatterDetails"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartTag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EndTag" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KeepTags" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstringFormatterDetails", propOrder = {
    "startTag",
    "endTag",
    "keepTags"
})
@XmlSeeAlso({
    SubstringConversionFormatterDetails.class,
    SubstringReplaceFormatterDetails.class,
    SubstringExtractFormatterDetails.class
})
public abstract class SubstringFormatterDetails implements Serializable, Cloneable, CopyTo, Equals, HashCode, ToString
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "StartTag", required = true)
    protected String startTag;
    @XmlElement(name = "EndTag", required = true)
    protected String endTag;
    @XmlElement(name = "KeepTags")
    protected boolean keepTags;

    /**
     * Default no-arg constructor
     * 
     */
    public SubstringFormatterDetails() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public SubstringFormatterDetails(final String startTag, final String endTag, final boolean keepTags) {
        this.startTag = startTag;
        this.endTag = endTag;
        this.keepTags = keepTags;
    }

    /**
     * Gets the value of the startTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartTag() {
        return startTag;
    }

    /**
     * Sets the value of the startTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTag(String value) {
        this.startTag = value;
    }

    /**
     * Gets the value of the endTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndTag() {
        return endTag;
    }

    /**
     * Sets the value of the endTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndTag(String value) {
        this.endTag = value;
    }

    /**
     * Gets the value of the keepTags property.
     * 
     */
    public boolean isKeepTags() {
        return keepTags;
    }

    /**
     * Sets the value of the keepTags property.
     * 
     */
    public void setKeepTags(boolean value) {
        this.keepTags = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            String theStartTag;
            theStartTag = this.getStartTag();
            strategy.appendField(locator, this, "startTag", buffer, theStartTag);
        }
        {
            String theEndTag;
            theEndTag = this.getEndTag();
            strategy.appendField(locator, this, "endTag", buffer, theEndTag);
        }
        {
            boolean theKeepTags;
            theKeepTags = this.isKeepTags();
            strategy.appendField(locator, this, "keepTags", buffer, theKeepTags);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SubstringFormatterDetails)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SubstringFormatterDetails that = ((SubstringFormatterDetails) object);
        {
            String lhsStartTag;
            lhsStartTag = this.getStartTag();
            String rhsStartTag;
            rhsStartTag = that.getStartTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startTag", lhsStartTag), LocatorUtils.property(thatLocator, "startTag", rhsStartTag), lhsStartTag, rhsStartTag)) {
                return false;
            }
        }
        {
            String lhsEndTag;
            lhsEndTag = this.getEndTag();
            String rhsEndTag;
            rhsEndTag = that.getEndTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endTag", lhsEndTag), LocatorUtils.property(thatLocator, "endTag", rhsEndTag), lhsEndTag, rhsEndTag)) {
                return false;
            }
        }
        {
            boolean lhsKeepTags;
            lhsKeepTags = this.isKeepTags();
            boolean rhsKeepTags;
            rhsKeepTags = that.isKeepTags();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "keepTags", lhsKeepTags), LocatorUtils.property(thatLocator, "keepTags", rhsKeepTags), lhsKeepTags, rhsKeepTags)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theStartTag;
            theStartTag = this.getStartTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startTag", theStartTag), currentHashCode, theStartTag);
        }
        {
            String theEndTag;
            theEndTag = this.getEndTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endTag", theEndTag), currentHashCode, theEndTag);
        }
        {
            boolean theKeepTags;
            theKeepTags = this.isKeepTags();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "keepTags", theKeepTags), currentHashCode, theKeepTags);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        if (null == target) {
            throw new IllegalArgumentException("Target argument must not be null for abstract copyable classes.");
        }
        if (target instanceof SubstringFormatterDetails) {
            final SubstringFormatterDetails copy = ((SubstringFormatterDetails) target);
            if (this.startTag!= null) {
                String sourceStartTag;
                sourceStartTag = this.getStartTag();
                String copyStartTag = ((String) strategy.copy(LocatorUtils.property(locator, "startTag", sourceStartTag), sourceStartTag));
                copy.setStartTag(copyStartTag);
            } else {
                copy.startTag = null;
            }
            if (this.endTag!= null) {
                String sourceEndTag;
                sourceEndTag = this.getEndTag();
                String copyEndTag = ((String) strategy.copy(LocatorUtils.property(locator, "endTag", sourceEndTag), sourceEndTag));
                copy.setEndTag(copyEndTag);
            } else {
                copy.endTag = null;
            }
            {
                boolean sourceKeepTags;
                sourceKeepTags = this.isKeepTags();
                boolean copyKeepTags = strategy.copy(LocatorUtils.property(locator, "keepTags", sourceKeepTags), sourceKeepTags);
                copy.setKeepTags(copyKeepTags);
            }
        }
        return target;
    }

}
