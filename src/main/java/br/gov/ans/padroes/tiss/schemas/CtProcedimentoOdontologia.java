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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_procedimentoOdontologia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoOdontologia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="procedimentoOdonto" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
 *         &lt;element name="denteRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_denteRegiao" minOccurs="0"/>
 *         &lt;element name="face" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_face" minOccurs="0"/>
 *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidadeProcedimento" minOccurs="0"/>
 *         &lt;element name="quantidadeUS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="franquiaCoparticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoOdontologia", propOrder = {
    "procedimentoOdonto",
    "denteRegiao",
    "face",
    "quantidade",
    "quantidadeUS",
    "valor",
    "franquiaCoparticipacao"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.CtGuiaSolicitacaoOdonto.PlanoTratamento.ProcedimentoSolicitado.class,
    br.gov.ans.padroes.tiss.schemas.CtProcedimentoOdontoRevisao.ProcedimentoOdontologia.class,
    br.gov.ans.padroes.tiss.schemas.CtGuiaOdontologia.ProcedimentosExecutados.ProcedimentoExecutado.class
})
public class CtProcedimentoOdontologia {

    @XmlElement(required = true)
    protected CtTabela procedimentoOdonto;
    protected CtDenteRegiao denteRegiao;
    protected String face;
    protected BigDecimal quantidade;
    protected BigDecimal quantidadeUS;
    protected BigDecimal valor;
    protected BigDecimal franquiaCoparticipacao;

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
     * Gets the value of the quantidadeUS property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidadeUS() {
        return quantidadeUS;
    }

    /**
     * Sets the value of the quantidadeUS property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidadeUS(BigDecimal value) {
        this.quantidadeUS = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValor(BigDecimal value) {
        this.valor = value;
    }

    /**
     * Gets the value of the franquiaCoparticipacao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFranquiaCoparticipacao() {
        return franquiaCoparticipacao;
    }

    /**
     * Sets the value of the franquiaCoparticipacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFranquiaCoparticipacao(BigDecimal value) {
        this.franquiaCoparticipacao = value;
    }

}
