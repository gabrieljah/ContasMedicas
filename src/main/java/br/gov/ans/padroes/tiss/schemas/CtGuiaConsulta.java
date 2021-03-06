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
 * <p>Java class for ct_guiaConsulta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaConsulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *         &lt;element name="beneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="dadosContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *         &lt;element name="profissionalExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoProfissional"/>
 *         &lt;element name="hipoteseDiagnostica" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoAtendimento">
 *                 &lt;sequence>
 *                   &lt;element name="diagnosticoSecundario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticosSecundarios" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosAtendimento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_atendimentoConsulta">
 *               &lt;/extension>
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
@XmlType(name = "ct_guiaConsulta", propOrder = {
    "identificacaoGuia",
    "beneficiario",
    "dadosContratado",
    "profissionalExecutante",
    "hipoteseDiagnostica",
    "dadosAtendimento",
    "observacao"
})
public class CtGuiaConsulta {

    @XmlElement(required = true)
    protected CtCabecalhoGuia identificacaoGuia;
    @XmlElement(required = true)
    protected CtBeneficiario beneficiario;
    @XmlElement(required = true)
    protected CtContratado dadosContratado;
    @XmlElement(required = true)
    protected CtIdentificacaoProfissional profissionalExecutante;
    protected CtGuiaConsulta.HipoteseDiagnostica hipoteseDiagnostica;
    @XmlElement(required = true)
    protected CtGuiaConsulta.DadosAtendimento dadosAtendimento;
    protected String observacao;

    /**
     * Gets the value of the identificacaoGuia property.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public CtCabecalhoGuia getIdentificacaoGuia() {
        return identificacaoGuia;
    }

    /**
     * Sets the value of the identificacaoGuia property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public void setIdentificacaoGuia(CtCabecalhoGuia value) {
        this.identificacaoGuia = value;
    }

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
     * Gets the value of the dadosContratado property.
     * 
     * @return
     *     possible object is
     *     {@link CtContratado }
     *     
     */
    public CtContratado getDadosContratado() {
        return dadosContratado;
    }

    /**
     * Sets the value of the dadosContratado property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratado }
     *     
     */
    public void setDadosContratado(CtContratado value) {
        this.dadosContratado = value;
    }

    /**
     * Gets the value of the profissionalExecutante property.
     * 
     * @return
     *     possible object is
     *     {@link CtIdentificacaoProfissional }
     *     
     */
    public CtIdentificacaoProfissional getProfissionalExecutante() {
        return profissionalExecutante;
    }

    /**
     * Sets the value of the profissionalExecutante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtIdentificacaoProfissional }
     *     
     */
    public void setProfissionalExecutante(CtIdentificacaoProfissional value) {
        this.profissionalExecutante = value;
    }

    /**
     * Gets the value of the hipoteseDiagnostica property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaConsulta.HipoteseDiagnostica }
     *     
     */
    public CtGuiaConsulta.HipoteseDiagnostica getHipoteseDiagnostica() {
        return hipoteseDiagnostica;
    }

    /**
     * Sets the value of the hipoteseDiagnostica property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaConsulta.HipoteseDiagnostica }
     *     
     */
    public void setHipoteseDiagnostica(CtGuiaConsulta.HipoteseDiagnostica value) {
        this.hipoteseDiagnostica = value;
    }

    /**
     * Gets the value of the dadosAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaConsulta.DadosAtendimento }
     *     
     */
    public CtGuiaConsulta.DadosAtendimento getDadosAtendimento() {
        return dadosAtendimento;
    }

    /**
     * Sets the value of the dadosAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaConsulta.DadosAtendimento }
     *     
     */
    public void setDadosAtendimento(CtGuiaConsulta.DadosAtendimento value) {
        this.dadosAtendimento = value;
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
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_atendimentoConsulta">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DadosAtendimento
        extends CtAtendimentoConsulta
    {


    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoAtendimento">
     *       &lt;sequence>
     *         &lt;element name="diagnosticoSecundario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticosSecundarios" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "diagnosticoSecundario"
    })
    public static class HipoteseDiagnostica
        extends CtDiagnosticoAtendimento
    {

        protected CtDiagnosticosSecundarios diagnosticoSecundario;

        /**
         * Gets the value of the diagnosticoSecundario property.
         * 
         * @return
         *     possible object is
         *     {@link CtDiagnosticosSecundarios }
         *     
         */
        public CtDiagnosticosSecundarios getDiagnosticoSecundario() {
            return diagnosticoSecundario;
        }

        /**
         * Sets the value of the diagnosticoSecundario property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtDiagnosticosSecundarios }
         *     
         */
        public void setDiagnosticoSecundario(CtDiagnosticosSecundarios value) {
            this.diagnosticoSecundario = value;
        }

    }

}
