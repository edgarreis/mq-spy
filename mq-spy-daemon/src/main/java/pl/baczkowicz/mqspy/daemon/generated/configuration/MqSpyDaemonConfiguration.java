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
import pl.baczkowicz.spy.common.generated.Formatting;


/**
 * <p>Java class for MqSpyDaemonConfiguration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MqSpyDaemonConfiguration"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Connectivity" type="{http://baczkowicz.pl/mq-spy/daemon/configuration}Connectivity"/&gt;
 *         &lt;element name="RemoteControl" type="{http://baczkowicz.pl/mq-spy/daemon/configuration}RemoteControl" minOccurs="0"/&gt;
 *         &lt;element name="Formatting" type="{http://baczkowicz.pl/spy/common}Formatting" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MqSpyDaemonConfiguration", propOrder = {
    "connectivity",
    "remoteControl",
    "formatting"
})
public class MqSpyDaemonConfiguration
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Connectivity", required = true)
    protected Connectivity connectivity;
    @XmlElement(name = "RemoteControl")
    protected RemoteControl remoteControl;
    @XmlElement(name = "Formatting")
    protected Formatting formatting;

    /**
     * Gets the value of the connectivity property.
     * 
     * @return
     *     possible object is
     *     {@link Connectivity }
     *     
     */
    public Connectivity getConnectivity() {
        return connectivity;
    }

    /**
     * Sets the value of the connectivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Connectivity }
     *     
     */
    public void setConnectivity(Connectivity value) {
        this.connectivity = value;
    }

    /**
     * Gets the value of the remoteControl property.
     * 
     * @return
     *     possible object is
     *     {@link RemoteControl }
     *     
     */
    public RemoteControl getRemoteControl() {
        return remoteControl;
    }

    /**
     * Sets the value of the remoteControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemoteControl }
     *     
     */
    public void setRemoteControl(RemoteControl value) {
        this.remoteControl = value;
    }

    /**
     * Gets the value of the formatting property.
     * 
     * @return
     *     possible object is
     *     {@link Formatting }
     *     
     */
    public Formatting getFormatting() {
        return formatting;
    }

    /**
     * Sets the value of the formatting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Formatting }
     *     
     */
    public void setFormatting(Formatting value) {
        this.formatting = value;
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
            Connectivity theConnectivity;
            theConnectivity = this.getConnectivity();
            strategy.appendField(locator, this, "connectivity", buffer, theConnectivity);
        }
        {
            RemoteControl theRemoteControl;
            theRemoteControl = this.getRemoteControl();
            strategy.appendField(locator, this, "remoteControl", buffer, theRemoteControl);
        }
        {
            Formatting theFormatting;
            theFormatting = this.getFormatting();
            strategy.appendField(locator, this, "formatting", buffer, theFormatting);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MqSpyDaemonConfiguration)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final MqSpyDaemonConfiguration that = ((MqSpyDaemonConfiguration) object);
        {
            Connectivity lhsConnectivity;
            lhsConnectivity = this.getConnectivity();
            Connectivity rhsConnectivity;
            rhsConnectivity = that.getConnectivity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectivity", lhsConnectivity), LocatorUtils.property(thatLocator, "connectivity", rhsConnectivity), lhsConnectivity, rhsConnectivity)) {
                return false;
            }
        }
        {
            RemoteControl lhsRemoteControl;
            lhsRemoteControl = this.getRemoteControl();
            RemoteControl rhsRemoteControl;
            rhsRemoteControl = that.getRemoteControl();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remoteControl", lhsRemoteControl), LocatorUtils.property(thatLocator, "remoteControl", rhsRemoteControl), lhsRemoteControl, rhsRemoteControl)) {
                return false;
            }
        }
        {
            Formatting lhsFormatting;
            lhsFormatting = this.getFormatting();
            Formatting rhsFormatting;
            rhsFormatting = that.getFormatting();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "formatting", lhsFormatting), LocatorUtils.property(thatLocator, "formatting", rhsFormatting), lhsFormatting, rhsFormatting)) {
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
            Connectivity theConnectivity;
            theConnectivity = this.getConnectivity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectivity", theConnectivity), currentHashCode, theConnectivity);
        }
        {
            RemoteControl theRemoteControl;
            theRemoteControl = this.getRemoteControl();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remoteControl", theRemoteControl), currentHashCode, theRemoteControl);
        }
        {
            Formatting theFormatting;
            theFormatting = this.getFormatting();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "formatting", theFormatting), currentHashCode, theFormatting);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
