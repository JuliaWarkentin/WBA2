//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.14 um 08:25:16 PM CEST 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}rezeptname"/>
 *         &lt;element ref="{}bild" maxOccurs="unbounded"/>
 *         &lt;element ref="{}zutat" maxOccurs="unbounded"/>
 *         &lt;element ref="{}zubereitung"/>
 *         &lt;element ref="{}kommentar" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rezeptname",
    "bild",
    "zutat",
    "zubereitung",
    "kommentar"
})
@XmlRootElement(name = "rezept")
public class Rezept {

    @XmlElement(required = true)
    protected Rezeptname rezeptname;
    @XmlElement(required = true)
    protected List<Bild> bild;
    @XmlElement(required = true)
    protected List<Zutat> zutat;
    @XmlElement(required = true)
    protected Zubereitung zubereitung;
    protected List<Kommentar> kommentar;

    /**
     * Ruft den Wert der rezeptname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rezeptname }
     *     
     */
    public Rezeptname getRezeptname() {
        return rezeptname;
    }

    /**
     * Legt den Wert der rezeptname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rezeptname }
     *     
     */
    public void setRezeptname(Rezeptname value) {
        this.rezeptname = value;
    }

    /**
     * Gets the value of the bild property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bild property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bild }
     * 
     * 
     */
    public List<Bild> getBild() {
        if (bild == null) {
            bild = new ArrayList<Bild>();
        }
        return this.bild;
    }

    /**
     * Gets the value of the zutat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zutat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZutat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zutat }
     * 
     * 
     */
    public List<Zutat> getZutat() {
        if (zutat == null) {
            zutat = new ArrayList<Zutat>();
        }
        return this.zutat;
    }

    /**
     * Ruft den Wert der zubereitung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Zubereitung }
     *     
     */
    public Zubereitung getZubereitung() {
        return zubereitung;
    }

    /**
     * Legt den Wert der zubereitung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Zubereitung }
     *     
     */
    public void setZubereitung(Zubereitung value) {
        this.zubereitung = value;
    }

    /**
     * Gets the value of the kommentar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kommentar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKommentar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Kommentar }
     * 
     * 
     */
    public List<Kommentar> getKommentar() {
        if (kommentar == null) {
            kommentar = new ArrayList<Kommentar>();
        }
        return this.kommentar;
    }

}
