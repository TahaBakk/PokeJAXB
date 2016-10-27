
package mypackage;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for PokemonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PokemonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nombre" type="{}NombreType"/>
 *         &lt;element name="PV">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="130"/>
 *               &lt;enumeration value="80"/>
 *               &lt;enumeration value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Ataque1">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Danza del Fuego"/>
 *               &lt;enumeration value="Doblebofetón"/>
 *               &lt;enumeration value="Hipnosis"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Ataque2">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Patada Llameante"/>
 *               &lt;enumeration value="CaraTriste"/>
 *               &lt;enumeration value="Come Sueños"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Etapa">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Fase 2"/>
 *               &lt;enumeration value="Básico"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PokemonType", propOrder = {
    "nombre",
    "Classe",
    "pv",
    "ataque1",
    "ataque2",
    "etapa"
})
public class PokemonType {

    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlAttribute(name = "Classe")
    protected String Classe;
    @XmlElement(name = "PV", required = true)
    protected String pv;
    @XmlElement(name = "Ataque1", required = true)
    protected String ataque1;
    @XmlElement(name = "Ataque2", required = true)
    protected String ataque2;
    @XmlElement(name = "Etapa", required = true)
    protected String etapa;

    public String getClasse() {return Classe;}

    /**
     * Sets the value of the nombre property.
     *
     * @param value
     *     allowed object is
     *     {@link NombreType }
     *
     */
    public void setClasse(String value) {
        this.Classe = value;
    }

    /**
     * Gets the value of the pv property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link NombreType }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link NombreType }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the pv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPV() {
        return pv;
    }

    /**
     * Sets the value of the pv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPV(String value) {
        this.pv = value;
    }

    /**
     * Gets the value of the ataque1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtaque1() {
        return ataque1;
    }

    /**
     * Sets the value of the ataque1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtaque1(String value) {
        this.ataque1 = value;
    }

    /**
     * Gets the value of the ataque2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAtaque2() {
        return ataque2;
    }

    /**
     * Sets the value of the ataque2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAtaque2(String value) {
        this.ataque2 = value;
    }

    /**
     * Gets the value of the etapa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtapa() {
        return etapa;
    }

    /**
     * Sets the value of the etapa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtapa(String value) {
        this.etapa = value;
    }

}
