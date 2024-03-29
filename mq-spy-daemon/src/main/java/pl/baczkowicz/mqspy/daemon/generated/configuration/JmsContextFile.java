//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.31 at 11:26:52 PM GMT 
//


package pl.baczkowicz.mqspy.daemon.generated.configuration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for JmsContextFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JmsContextFile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContextFileLocation" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConnectionFactoryBean" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="JmsTemplateBean" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JmsContextFile", propOrder = {
    "contextFileLocation",
    "connectionFactoryBean",
    "jmsTemplateBean"
})
public class JmsContextFile
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ContextFileLocation", required = true)
    protected String contextFileLocation;
    @XmlElement(name = "ConnectionFactoryBean", required = true)
    protected String connectionFactoryBean;
    @XmlElement(name = "JmsTemplateBean")
    protected String jmsTemplateBean;

    /**
     * Gets the value of the contextFileLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextFileLocation() {
        return contextFileLocation;
    }

    /**
     * Sets the value of the contextFileLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextFileLocation(String value) {
        this.contextFileLocation = value;
    }

    /**
     * Gets the value of the connectionFactoryBean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionFactoryBean() {
        return connectionFactoryBean;
    }

    /**
     * Sets the value of the connectionFactoryBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionFactoryBean(String value) {
        this.connectionFactoryBean = value;
    }

    /**
     * Gets the value of the jmsTemplateBean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmsTemplateBean() {
        return jmsTemplateBean;
    }

    /**
     * Sets the value of the jmsTemplateBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmsTemplateBean(String value) {
        this.jmsTemplateBean = value;
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
            String theContextFileLocation;
            theContextFileLocation = this.getContextFileLocation();
            strategy.appendField(locator, this, "contextFileLocation", buffer, theContextFileLocation);
        }
        {
            String theConnectionFactoryBean;
            theConnectionFactoryBean = this.getConnectionFactoryBean();
            strategy.appendField(locator, this, "connectionFactoryBean", buffer, theConnectionFactoryBean);
        }
        {
            String theJmsTemplateBean;
            theJmsTemplateBean = this.getJmsTemplateBean();
            strategy.appendField(locator, this, "jmsTemplateBean", buffer, theJmsTemplateBean);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof JmsContextFile)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final JmsContextFile that = ((JmsContextFile) object);
        {
            String lhsContextFileLocation;
            lhsContextFileLocation = this.getContextFileLocation();
            String rhsContextFileLocation;
            rhsContextFileLocation = that.getContextFileLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contextFileLocation", lhsContextFileLocation), LocatorUtils.property(thatLocator, "contextFileLocation", rhsContextFileLocation), lhsContextFileLocation, rhsContextFileLocation)) {
                return false;
            }
        }
        {
            String lhsConnectionFactoryBean;
            lhsConnectionFactoryBean = this.getConnectionFactoryBean();
            String rhsConnectionFactoryBean;
            rhsConnectionFactoryBean = that.getConnectionFactoryBean();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionFactoryBean", lhsConnectionFactoryBean), LocatorUtils.property(thatLocator, "connectionFactoryBean", rhsConnectionFactoryBean), lhsConnectionFactoryBean, rhsConnectionFactoryBean)) {
                return false;
            }
        }
        {
            String lhsJmsTemplateBean;
            lhsJmsTemplateBean = this.getJmsTemplateBean();
            String rhsJmsTemplateBean;
            rhsJmsTemplateBean = that.getJmsTemplateBean();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "jmsTemplateBean", lhsJmsTemplateBean), LocatorUtils.property(thatLocator, "jmsTemplateBean", rhsJmsTemplateBean), lhsJmsTemplateBean, rhsJmsTemplateBean)) {
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
            String theContextFileLocation;
            theContextFileLocation = this.getContextFileLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contextFileLocation", theContextFileLocation), currentHashCode, theContextFileLocation);
        }
        {
            String theConnectionFactoryBean;
            theConnectionFactoryBean = this.getConnectionFactoryBean();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionFactoryBean", theConnectionFactoryBean), currentHashCode, theConnectionFactoryBean);
        }
        {
            String theJmsTemplateBean;
            theJmsTemplateBean = this.getJmsTemplateBean();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "jmsTemplateBean", theJmsTemplateBean), currentHashCode, theJmsTemplateBean);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
