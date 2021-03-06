//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 01:07:43 PM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_cabecalhoGuia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_cabecalhoGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoFontePagadora">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                   &lt;element name="cnpjFontePagadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataEmissaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_cabecalhoGuia", propOrder = {
    "identificacaoFontePagadora",
    "dataEmissaoGuia",
    "numeroGuiaPrestador",
    "numeroGuiaOperadora"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtReciboCancelaGuia.GuiasCanceladas.DadosGuia.class
})
public class CtCabecalhoGuia {

    @XmlElement(required = true)
    protected CtCabecalhoGuia.IdentificacaoFontePagadora identificacaoFontePagadora;
    @XmlElement(required = true)
    protected String dataEmissaoGuia;
    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;

    /**
     * Gets the value of the identificacaoFontePagadora property.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoGuia.IdentificacaoFontePagadora }
     *     
     */
    public CtCabecalhoGuia.IdentificacaoFontePagadora getIdentificacaoFontePagadora() {
        return identificacaoFontePagadora;
    }

    /**
     * Sets the value of the identificacaoFontePagadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoGuia.IdentificacaoFontePagadora }
     *     
     */
    public void setIdentificacaoFontePagadora(CtCabecalhoGuia.IdentificacaoFontePagadora value) {
        this.identificacaoFontePagadora = value;
    }

    /**
     * Gets the value of the dataEmissaoGuia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public String getDataEmissaoGuia() {
        return dataEmissaoGuia;
    }

    /**
     * Sets the value of the dataEmissaoGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissaoGuia(String value) {
        this.dataEmissaoGuia = value;
    }

    /**
     * Gets the value of the numeroGuiaPrestador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrestador() {
        return numeroGuiaPrestador;
    }

    /**
     * Sets the value of the numeroGuiaPrestador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrestador(String value) {
        this.numeroGuiaPrestador = value;
    }

    /**
     * Gets the value of the numeroGuiaOperadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaOperadora() {
        return numeroGuiaOperadora;
    }

    /**
     * Sets the value of the numeroGuiaOperadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaOperadora(String value) {
        this.numeroGuiaOperadora = value;
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
     *       &lt;choice>
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
     *         &lt;element name="cnpjFontePagadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "registroANS",
        "cnpjFontePagadora"
    })
    public static class IdentificacaoFontePagadora {

        protected String registroANS;
        protected String cnpjFontePagadora;

        /**
         * Gets the value of the registroANS property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistroANS() {
            return registroANS;
        }

        /**
         * Sets the value of the registroANS property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistroANS(String value) {
            this.registroANS = value;
        }

        /**
         * Gets the value of the cnpjFontePagadora property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjFontePagadora() {
            return cnpjFontePagadora;
        }

        /**
         * Sets the value of the cnpjFontePagadora property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjFontePagadora(String value) {
            this.cnpjFontePagadora = value;
        }

    }

}
