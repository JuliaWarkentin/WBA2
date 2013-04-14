//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.14 um 08:25:16 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType> 
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="zubereitungstext" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}string" default="keine Angabe" />
 *       &lt;attribute name="schwierigkeitsgrad" type="{}schwierigkeitsgradtyp" />
 *       &lt;attribute name="brennwertpp" type="{http://www.w3.org/2001/XMLSchema}string" default="keine Angabe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "zubereitungstext"
})
@XmlRootElement(name = "zubereitung")
public class Zubereitung {

    @XmlElement(required = true)
    protected String zubereitungstext;
    @XmlAttribute(name = "arbeitszeit")
    protected String arbeitszeit;
    @XmlAttribute(name = "schwierigkeitsgrad")
    protected String schwierigkeitsgrad;
    @XmlAttribute(name = "brennwertpp")
    protected String brennwertpp;

    /**
     * Ruft den Wert der zubereitungstext-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZubereitungstext() {
        return zubereitungstext;
    }

    /**
     * Legt den Wert der zubereitungstext-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZubereitungstext(String value) {
        this.zubereitungstext = value;
    }

    /**
     * Ruft den Wert der arbeitszeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArbeitszeit() {
        if (arbeitszeit == null) {
            return "keine Angabe";
        } else {
            return arbeitszeit;
        }
    }

    /**
     * Legt den Wert der arbeitszeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArbeitszeit(String value) {
        this.arbeitszeit = value;
    }

    /**
     * Ruft den Wert der schwierigkeitsgrad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchwierigkeitsgrad() {
        return schwierigkeitsgrad;
    }

    /**
     * Legt den Wert der schwierigkeitsgrad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchwierigkeitsgrad(String value) {
        this.schwierigkeitsgrad = value;
    }

    /**
     * Ruft den Wert der brennwertpp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrennwertpp() {
        if (brennwertpp == null) {
            return "keine Angabe";
        } else {
            return brennwertpp;
        }
    }

    /**
     * Legt den Wert der brennwertpp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrennwertpp(String value) {
        this.brennwertpp = value;
    }

}
