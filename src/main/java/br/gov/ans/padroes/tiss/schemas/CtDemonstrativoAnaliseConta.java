//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 01:07:43 PM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_demonstrativoAnaliseConta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_demonstrativoAnaliseConta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoFontePagadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoFontePagadora"/>
 *         &lt;element name="cabecalhoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoDemonstrativo"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *         &lt;element name="fatura">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosConta"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorProcessadoGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorLiberadoGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorGlosaGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_demonstrativoAnaliseConta", propOrder = {
    "identificacaoFontePagadora",
    "cabecalhoDemonstrativo",
    "dadosPrestador",
    "fatura",
    "valorProcessadoGeral",
    "valorLiberadoGeral",
    "valorGlosaGeral"
})
public class CtDemonstrativoAnaliseConta {

    @XmlElement(required = true)
    protected CtIdentificacaoFontePagadora identificacaoFontePagadora;
    @XmlElement(required = true)
    protected CtCabecalhoDemonstrativo cabecalhoDemonstrativo;
    @XmlElement(required = true)
    protected CtContratado dadosPrestador;
    @XmlElement(required = true)
    protected CtDemonstrativoAnaliseConta.Fatura fatura;
    @XmlElement(required = true)
    protected BigDecimal valorProcessadoGeral;
    @XmlElement(required = true)
    protected BigDecimal valorLiberadoGeral;
    protected BigDecimal valorGlosaGeral;

    /**
     * Gets the value of the identificacaoFontePagadora property.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoFontePagadora }
     *     
     */
    public CtIdentificacaoFontePagadora getIdentificacaoFontePagadora() {
        return identificacaoFontePagadora;
    }

    /**
     * Sets the value of the identificacaoFontePagadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoFontePagadora }
     *     
     */
    public void setIdentificacaoFontePagadora(CtIdentificacaoFontePagadora value) {
        this.identificacaoFontePagadora = value;
    }

    /**
     * Gets the value of the cabecalhoDemonstrativo property.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoDemonstrativo }
     *     
     */
    public CtCabecalhoDemonstrativo getCabecalhoDemonstrativo() {
        return cabecalhoDemonstrativo;
    }

    /**
     * Sets the value of the cabecalhoDemonstrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoDemonstrativo }
     *     
     */
    public void setCabecalhoDemonstrativo(CtCabecalhoDemonstrativo value) {
        this.cabecalhoDemonstrativo = value;
    }

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
     * Gets the value of the fatura property.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoAnaliseConta.Fatura }
     *     
     */
    public CtDemonstrativoAnaliseConta.Fatura getFatura() {
        return fatura;
    }

    /**
     * Sets the value of the fatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoAnaliseConta.Fatura }
     *     
     */
    public void setFatura(CtDemonstrativoAnaliseConta.Fatura value) {
        this.fatura = value;
    }

    /**
     * Gets the value of the valorProcessadoGeral property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcessadoGeral() {
        return valorProcessadoGeral;
    }

    /**
     * Sets the value of the valorProcessadoGeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcessadoGeral(BigDecimal value) {
        this.valorProcessadoGeral = value;
    }

    /**
     * Gets the value of the valorLiberadoGeral property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiberadoGeral() {
        return valorLiberadoGeral;
    }

    /**
     * Sets the value of the valorLiberadoGeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiberadoGeral(BigDecimal value) {
        this.valorLiberadoGeral = value;
    }

    /**
     * Gets the value of the valorGlosaGeral property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosaGeral() {
        return valorGlosaGeral;
    }

    /**
     * Sets the value of the valorGlosaGeral property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosaGeral(BigDecimal value) {
        this.valorGlosaGeral = value;
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
     *         &lt;element name="dadosFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosConta"/>
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
        "dadosFatura"
    })
    public static class Fatura {

        @XmlElement(required = true)
        protected CtDadosConta dadosFatura;

        /**
         * Gets the value of the dadosFatura property.
         * 
         * @return
         *     possible object is
         *     {@link CtDadosConta }
         *     
         */
        public CtDadosConta getDadosFatura() {
            return dadosFatura;
        }

        /**
         * Sets the value of the dadosFatura property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtDadosConta }
         *     
         */
        public void setDadosFatura(CtDadosConta value) {
            this.dadosFatura = value;
        }

    }

}