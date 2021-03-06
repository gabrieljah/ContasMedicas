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
 * <p>Java class for ct_comunicacaoBeneficiario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_comunicacaoBeneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="dataEvento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="tipoEvento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoEvento"/>
 *         &lt;choice>
 *           &lt;element name="motivoSaida" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_motivoSaida"/>
 *           &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoInternacao"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_comunicacaoBeneficiario", propOrder = {
    "beneficiario",
    "dataEvento",
    "tipoEvento",
    "motivoSaida",
    "tipoInternacao"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.MensagemTISS.PrestadorParaOperadora.ComunicacaoBeneficiario.class
})
public class CtComunicacaoBeneficiario {

    @XmlElement(required = true)
    protected CtBeneficiario beneficiario;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEvento;
    @XmlElement(required = true)
    protected StTipoEvento tipoEvento;
    protected String motivoSaida;
    protected String tipoInternacao;

    /**
     * Gets the value of the beneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiario }
     *     
     */
    public CtBeneficiario getBeneficiario() {
        return beneficiario;
    }

    /**
     * Sets the value of the beneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiario }
     *     
     */
    public void setBeneficiario(CtBeneficiario value) {
        this.beneficiario = value;
    }

    /**
     * Gets the value of the dataEvento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEvento() {
        return dataEvento;
    }

    /**
     * Sets the value of the dataEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEvento(XMLGregorianCalendar value) {
        this.dataEvento = value;
    }

    /**
     * Gets the value of the tipoEvento property.
     * 
     * @return
     *     possible object is
     *     {@link StTipoEvento }
     *     
     */
    public StTipoEvento getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Sets the value of the tipoEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link StTipoEvento }
     *     
     */
    public void setTipoEvento(StTipoEvento value) {
        this.tipoEvento = value;
    }

    /**
     * Gets the value of the motivoSaida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoSaida() {
        return motivoSaida;
    }

    /**
     * Sets the value of the motivoSaida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoSaida(String value) {
        this.motivoSaida = value;
    }

    /**
     * Gets the value of the tipoInternacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInternacao() {
        return tipoInternacao;
    }

    /**
     * Sets the value of the tipoInternacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInternacao(String value) {
        this.tipoInternacao = value;
    }

}
