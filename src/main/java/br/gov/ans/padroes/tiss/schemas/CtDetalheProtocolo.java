//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 01:07:43 PM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_detalheProtocolo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_detalheProtocolo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_protocolo"/>
 *         &lt;element name="valorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="codigoGlosaProtocolo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                   &lt;element name="valorGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="guias">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosGuia" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "ct_detalheProtocolo", propOrder = {
    "numeroProtocolo",
    "valorProtocolo",
    "codigoGlosaProtocolo",
    "guias"
})
public class CtDetalheProtocolo {

    @XmlElement(required = true)
    protected String numeroProtocolo;
    protected BigDecimal valorProtocolo;
    protected CtDetalheProtocolo.CodigoGlosaProtocolo codigoGlosaProtocolo;
    @XmlElement(required = true)
    protected CtDetalheProtocolo.Guias guias;

    /**
     * Gets the value of the numeroProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Sets the value of the numeroProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocolo(String value) {
        this.numeroProtocolo = value;
    }

    /**
     * Gets the value of the valorProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProtocolo() {
        return valorProtocolo;
    }

    /**
     * Sets the value of the valorProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProtocolo(BigDecimal value) {
        this.valorProtocolo = value;
    }

    /**
     * Gets the value of the codigoGlosaProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link CtDetalheProtocolo.CodigoGlosaProtocolo }
     *     
     */
    public CtDetalheProtocolo.CodigoGlosaProtocolo getCodigoGlosaProtocolo() {
        return codigoGlosaProtocolo;
    }

    /**
     * Sets the value of the codigoGlosaProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDetalheProtocolo.CodigoGlosaProtocolo }
     *     
     */
    public void setCodigoGlosaProtocolo(CtDetalheProtocolo.CodigoGlosaProtocolo value) {
        this.codigoGlosaProtocolo = value;
    }

    /**
     * Gets the value of the guias property.
     * 
     * @return
     *     possible object is
     *     {@link CtDetalheProtocolo.Guias }
     *     
     */
    public CtDetalheProtocolo.Guias getGuias() {
        return guias;
    }

    /**
     * Sets the value of the guias property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDetalheProtocolo.Guias }
     *     
     */
    public void setGuias(CtDetalheProtocolo.Guias value) {
        this.guias = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
     *         &lt;element name="valorGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
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
        "motivoGlosa",
        "valorGlosaProtocolo"
    })
    public static class CodigoGlosaProtocolo {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> motivoGlosa;
        @XmlElement(required = true)
        protected BigDecimal valorGlosaProtocolo;

        /**
         * Gets the value of the motivoGlosa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoGlosa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoGlosa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoGlosa() {
            if (motivoGlosa == null) {
                motivoGlosa = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoGlosa;
        }

        /**
         * Gets the value of the valorGlosaProtocolo property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorGlosaProtocolo() {
            return valorGlosaProtocolo;
        }

        /**
         * Sets the value of the valorGlosaProtocolo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorGlosaProtocolo(BigDecimal value) {
            this.valorGlosaProtocolo = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dadosGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosGuia" maxOccurs="unbounded"/>
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
        "dadosGuia"
    })
    public static class Guias {

        @XmlElement(required = true)
        protected List<CtDadosGuia> dadosGuia;

        /**
         * Gets the value of the dadosGuia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dadosGuia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDadosGuia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDadosGuia }
         * 
         * 
         */
        public List<CtDadosGuia> getDadosGuia() {
            if (dadosGuia == null) {
                dadosGuia = new ArrayList<CtDadosGuia>();
            }
            return this.dadosGuia;
        }

    }

}
