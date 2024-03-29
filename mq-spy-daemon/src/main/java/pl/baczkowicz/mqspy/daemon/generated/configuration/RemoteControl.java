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
 * <p>Java class for RemoteControl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemoteControl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HttpListener" type="{http://baczkowicz.pl/mq-spy/daemon/configuration}HttpListener" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoteControl", propOrder = {
    "httpListener"
})
public class RemoteControl
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "HttpListener")
    protected HttpListener httpListener;

    /**
     * Gets the value of the httpListener property.
     * 
     * @return
     *     possible object is
     *     {@link HttpListener }
     *     
     */
    public HttpListener getHttpListener() {
        return httpListener;
    }

    /**
     * Sets the value of the httpListener property.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpListener }
     *     
     */
    public void setHttpListener(HttpListener value) {
        this.httpListener = value;
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
            HttpListener theHttpListener;
            theHttpListener = this.getHttpListener();
            strategy.appendField(locator, this, "httpListener", buffer, theHttpListener);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RemoteControl)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RemoteControl that = ((RemoteControl) object);
        {
            HttpListener lhsHttpListener;
            lhsHttpListener = this.getHttpListener();
            HttpListener rhsHttpListener;
            rhsHttpListener = that.getHttpListener();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "httpListener", lhsHttpListener), LocatorUtils.property(thatLocator, "httpListener", rhsHttpListener), lhsHttpListener, rhsHttpListener)) {
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
            HttpListener theHttpListener;
            theHttpListener = this.getHttpListener();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "httpListener", theHttpListener), currentHashCode, theHttpListener);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
