//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.08 at 09:56:18 PM CEST 
//


package de.nrw.hbz.deepzoomer.zoomify;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="WIDTH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HEIGHT" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NUMTILES" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NUMIMAGES" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VERSION" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TILESIZE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "IMAGE_PROPERTIES")
public class IMAGEPROPERTIES {

    @XmlAttribute(name = "WIDTH")
    protected String width;
    @XmlAttribute(name = "HEIGHT")
    protected String height;
    @XmlAttribute(name = "NUMTILES")
    protected String numtiles;
    @XmlAttribute(name = "NUMIMAGES")
    protected String numimages;
    @XmlAttribute(name = "VERSION")
    protected String version;
    @XmlAttribute(name = "TILESIZE")
    protected String tilesize;

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWIDTH() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWIDTH(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHEIGHT() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHEIGHT(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the numtiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMTILES() {
        return numtiles;
    }

    /**
     * Sets the value of the numtiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMTILES(String value) {
        this.numtiles = value;
    }

    /**
     * Gets the value of the numimages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMIMAGES() {
        return numimages;
    }

    /**
     * Sets the value of the numimages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMIMAGES(String value) {
        this.numimages = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVERSION() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVERSION(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the tilesize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTILESIZE() {
        return tilesize;
    }

    /**
     * Sets the value of the tilesize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTILESIZE(String value) {
        this.tilesize = value;
    }

}
