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
 * <p>Java class for ct_itemSolicitacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_itemSolicitacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoProcedimentos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
 *         &lt;element name="quantidadeSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
 *         &lt;element name="quantidadeAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade" minOccurs="0"/>
 *         &lt;element name="statusSolicitacaoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusSolicitacao"/>
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
@XmlType(name = "ct_itemSolicitacao", propOrder = {
    "identificacaoProcedimentos",
    "quantidadeSolicitada",
    "quantidadeAutorizada",
    "statusSolicitacaoProcedimento",
    "glosas",
    "observacao"
})
public class CtItemSolicitacao {

    @XmlElement(required = true)
    protected CtTabela identificacaoProcedimentos;
    @XmlElement(required = true)
    protected BigDecimal quantidadeSolicitada;
    protected BigDecimal quantidadeAutorizada;
    @XmlElement(required = true)
    protected String statusSolicitacaoProcedimento;
    protected CtItemSolicitacao.Glosas glosas;
    protected String observacao;

    /**
     * Gets the value of the identificacaoProcedimentos property.
     * 
     * @return
     *     possible object is
     *     {@link CtTabela }
     *     
     */
    public CtTabela getIdentificacaoProcedimentos() {
        return identificacaoProcedimentos;
    }

    /**
     * Sets the value of the identificacaoProcedimentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtTabela }
     *     
     */
    public void setIdentificacaoProcedimentos(CtTabela value) {
        this.identificacaoProcedimentos = value;
    }

    /**
     * Gets the value of the quantidadeSolicitada property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidadeSolicitada() {
        return quantidadeSolicitada;
    }

    /**
     * Sets the value of the quantidadeSolicitada property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidadeSolicitada(BigDecimal value) {
        this.quantidadeSolicitada = value;
    }

    /**
     * Gets the value of the quantidadeAutorizada property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidadeAutorizada() {
        return quantidadeAutorizada;
    }

    /**
     * Sets the value of the quantidadeAutorizada property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidadeAutorizada(BigDecimal value) {
        this.quantidadeAutorizada = value;
    }

    /**
     * Gets the value of the statusSolicitacaoProcedimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSolicitacaoProcedimento() {
        return statusSolicitacaoProcedimento;
    }

    /**
     * Sets the value of the statusSolicitacaoProcedimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSolicitacaoProcedimento(String value) {
        this.statusSolicitacaoProcedimento = value;
    }

    /**
     * Gets the value of the glosas property.
     * 
     * @return
     *     possible object is
     *     {@link CtItemSolicitacao.Glosas }
     *     
     */
    public CtItemSolicitacao.Glosas getGlosas() {
        return glosas;
    }

    /**
     * Sets the value of the glosas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtItemSolicitacao.Glosas }
     *     
     */
    public void setGlosas(CtItemSolicitacao.Glosas value) {
        this.glosas = value;
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
