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
 * <p>Java class for ct_retornoElegibilidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_retornoElegibilidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoFontePagadora"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="respostaSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao"/>
 *         &lt;element name="motivoNegacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_retornoElegibilidade", propOrder = {
    "dadosOperadora",
    "dadosBeneficiario",
    "respostaSolicitacao",
    "motivoNegacao"
})
public class CtRetornoElegibilidade {

    @XmlElement(required = true)
    protected CtIdentificacaoFontePagadora dadosOperadora;
    @XmlElement(required = true)
    protected CtBeneficiario dadosBeneficiario;
    protected boolean respostaSolicitacao;
    protected CtMotivoGlosa motivoNegacao;

    /**
     * Gets the value of the dadosOperadora property.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoFontePagadora }
     *     
     */
    public CtIdentificacaoFontePagadora getDadosOperadora() {
        return dadosOperadora;
    }

    /**
     * Sets the value of the dadosOperadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoFontePagadora }
     *     
     */
    public void setDadosOperadora(CtIdentificacaoFontePagadora value) {
        this.dadosOperadora = value;
    }

    /**
     * Gets the value of the dadosBeneficiario property.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiario }
     *     
     */
    public CtBeneficiario getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Sets the value of the dadosBeneficiario property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiario }
     *     
     */
    public void setDadosBeneficiario(CtBeneficiario value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Gets the value of the respostaSolicitacao property.
     * 
     */
    public boolean isRespostaSolicitacao() {
        return respostaSolicitacao;
    }

    /**
     * Sets the value of the respostaSolicitacao property.
     * 
     */
    public void setRespostaSolicitacao(boolean value) {
        this.respostaSolicitacao = value;
    }

    /**
     * Gets the value of the motivoNegacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public CtMotivoGlosa getMotivoNegacao() {
        return motivoNegacao;
    }

    /**
     * Sets the value of the motivoNegacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public void setMotivoNegacao(CtMotivoGlosa value) {
        this.motivoNegacao = value;
    }

}
