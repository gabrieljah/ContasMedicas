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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_loteAnexo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_loteAnexo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12"/>
 *         &lt;element name="anexoGuia">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="anexoSituacaoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoSituacaoInicial"/>
 *                 &lt;/choice>
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
@XmlType(name = "ct_loteAnexo", propOrder = {
    "numeroLote",
    "anexoGuia"
})
public class CtLoteAnexo {

    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected CtLoteAnexo.AnexoGuia anexoGuia;

    /**
     * Gets the value of the numeroLote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLote() {
        return numeroLote;
    }

    /**
     * Sets the value of the numeroLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLote(String value) {
        this.numeroLote = value;
    }

    /**
     * Gets the value of the anexoGuia property.
     * 
     * @return
     *     possible object is
     *     {@link CtLoteAnexo.AnexoGuia }
     *     
     */
    public CtLoteAnexo.AnexoGuia getAnexoGuia() {
        return anexoGuia;
    }

    /**
     * Sets the value of the anexoGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtLoteAnexo.AnexoGuia }
     *     
     */
    public void setAnexoGuia(CtLoteAnexo.AnexoGuia value) {
        this.anexoGuia = value;
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
     *         &lt;element name="anexoSituacaoInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoSituacaoInicial"/>
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
        "anexoSituacaoInicial"
    })
    public static class AnexoGuia {

        protected CtAnexoSituacaoInicial anexoSituacaoInicial;

        /**
         * Gets the value of the anexoSituacaoInicial property.
         * 
         * @return
         *     possible object is
         *     {@link CtAnexoSituacaoInicial }
         *     
         */
        public CtAnexoSituacaoInicial getAnexoSituacaoInicial() {
            return anexoSituacaoInicial;
        }

        /**
         * Sets the value of the anexoSituacaoInicial property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtAnexoSituacaoInicial }
         *     
         */
        public void setAnexoSituacaoInicial(CtAnexoSituacaoInicial value) {
            this.anexoSituacaoInicial = value;
        }

    }

}