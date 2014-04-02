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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_procedimentoOdontoRealizado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoOdontoRealizado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimentoOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
 *         &lt;element name="denteRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_denteRegiao" minOccurs="0"/>
 *         &lt;element name="face" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_face" minOccurs="0"/>
 *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidadeProcedimento" minOccurs="0"/>
 *         &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *         &lt;element name="valorGlosaEstorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="glosas" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoOdontoRealizado", propOrder = {
    "procedimentoOdonto",
    "denteRegiao",
    "face",
    "dataRealizacao",
    "quantidade",
    "valorProcessado",
    "valorGlosaEstorno",
    "glosas",
    "valorLiberado"
})
public class CtProcedimentoOdontoRealizado {

    @XmlElement(required = true)
    protected CtTabela procedimentoOdonto;
    protected CtDenteRegiao denteRegiao;
    protected String face;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataRealizacao;
    protected BigDecimal quantidade;
    @XmlElement(required = true)
    protected BigDecimal valorProcessado;
    protected BigDecimal valorGlosaEstorno;
    protected CtProcedimentoOdontoRealizado.Glosas glosas;
    @XmlElement(required = true)
    protected BigDecimal valorLiberado;

    /**
     * Gets the value of the procedimentoOdonto property.
     * 
     * @return
     *     possible object is
     *     {@link CtTabela }
     *     
     */
    public CtTabela getProcedimentoOdonto() {
        return procedimentoOdonto;
    }

    /**
     * Sets the value of the procedimentoOdonto property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtTabela }
     *     
     */
    public void setProcedimentoOdonto(CtTabela value) {
        this.procedimentoOdonto = value;
    }

    /**
     * Gets the value of the denteRegiao property.
     * 
     * @return
     *     possible object is
     *     {@link CtDenteRegiao }
     *     
     */
    public CtDenteRegiao getDenteRegiao() {
        return denteRegiao;
    }

    /**
     * Sets the value of the denteRegiao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDenteRegiao }
     *     
     */
    public void setDenteRegiao(CtDenteRegiao value) {
        this.denteRegiao = value;
    }

    /**
     * Gets the value of the face property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFace() {
        return face;
    }

    /**
     * Sets the value of the face property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFace(String value) {
        this.face = value;
    }

    /**
     * Gets the value of the dataRealizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRealizacao() {
        return dataRealizacao;
    }

    /**
     * Sets the value of the dataRealizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRealizacao(XMLGregorianCalendar value) {
        this.dataRealizacao = value;
    }

    /**
     * Gets the value of the quantidade property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidade() {
        return quantidade;
    }

    /**
     * Sets the value of the quantidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidade(BigDecimal value) {
        this.quantidade = value;
    }

    /**
     * Gets the value of the valorProcessado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcessado() {
        return valorProcessado;
    }

    /**
     * Sets the value of the valorProcessado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcessado(BigDecimal value) {
        this.valorProcessado = value;
    }

    /**
     * Gets the value of the valorGlosaEstorno property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosaEstorno() {
        return valorGlosaEstorno;
    }

    /**
     * Sets the value of the valorGlosaEstorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosaEstorno(BigDecimal value) {
        this.valorGlosaEstorno = value;
    }

    /**
     * Gets the value of the glosas property.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoOdontoRealizado.Glosas }
     *     
     */
    public CtProcedimentoOdontoRealizado.Glosas getGlosas() {
        return glosas;
    }

    /**
     * Sets the value of the glosas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoOdontoRealizado.Glosas }
     *     
     */
    public void setGlosas(CtProcedimentoOdontoRealizado.Glosas value) {
        this.glosas = value;
    }

    /**
     * Gets the value of the valorLiberado property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiberado() {
        return valorLiberado;
    }

    /**
     * Sets the value of the valorLiberado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiberado(BigDecimal value) {
        this.valorLiberado = value;
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
        "motivoGlosa"
    })
    public static class Glosas {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> motivoGlosa;

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

    }

}
