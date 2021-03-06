//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 01:07:43 PM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_cancelaGuia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_cancelaGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *         &lt;element name="tipoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoGuia"/>
 *         &lt;element name="guia">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_cancelaGuia", propOrder = {
    "dadosPrestador",
    "tipoGuia",
    "guia",
    "observacao"
})
public class CtCancelaGuia {

    @XmlElement(required = true)
    protected CtContratado dadosPrestador;
    @XmlElement(required = true)
    protected String tipoGuia;
    @XmlElement(required = true)
    protected CtCancelaGuia.Guia guia;
    protected String observacao;

    /**
     * Gets the value of the dadosPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link CtContratado }
     *     
     */
    public CtContratado getDadosPrestador() {
        return dadosPrestador;
    }

    /**
     * Sets the value of the dadosPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratado }
     *     
     */
    public void setDadosPrestador(CtContratado value) {
        this.dadosPrestador = value;
    }

    /**
     * Gets the value of the tipoGuia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoGuia() {
        return tipoGuia;
    }

    /**
     * Sets the value of the tipoGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoGuia(String value) {
        this.tipoGuia = value;
    }

    /**
     * Gets the value of the guia property.
     * 
     * @return
     *     possible object is
     *     {@link CtCancelaGuia.Guia }
     *     
     */
    public CtCancelaGuia.Guia getGuia() {
        return guia;
    }

    /**
     * Sets the value of the guia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCancelaGuia.Guia }
     *     
     */
    public void setGuia(CtCancelaGuia.Guia value) {
        this.guia = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
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
     *         &lt;element name="dadosGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia" maxOccurs="unbounded"/>
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
    public static class Guia {

        @XmlElement(required = true)
        protected List<CtCabecalhoGuia> dadosGuia;

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
         * {@link CtCabecalhoGuia }
         * 
         * 
         */
        public List<CtCabecalhoGuia> getDadosGuia() {
            if (dadosGuia == null) {
                dadosGuia = new ArrayList<CtCabecalhoGuia>();
            }
            return this.dadosGuia;
        }

    }

}
