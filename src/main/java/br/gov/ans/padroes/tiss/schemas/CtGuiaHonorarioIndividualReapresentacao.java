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
 * <p>Java class for ct_guiaHonorarioIndividualReapresentacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaHonorarioIndividualReapresentacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoGuiaHonorarioIndividual" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *         &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="contratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *         &lt;element name="contratadoExecutante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado">
 *                 &lt;sequence>
 *                   &lt;element name="identificacaoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante"/>
 *                   &lt;element name="posicaoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_posicaoProfissao"/>
 *                   &lt;element name="tipoAcomodacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoAcomodacao" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosExamesRealizados">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoRevisao">
 *                 &lt;sequence>
 *                   &lt;element name="totalGeralHonorario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                 &lt;/sequence>
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
@XmlType(name = "ct_guiaHonorarioIndividualReapresentacao", propOrder = {
    "identificacaoGuiaHonorarioIndividual",
    "numeroGuiaPrincipal",
    "dadosBeneficiario",
    "contratado",
    "contratadoExecutante",
    "procedimentosExamesRealizados",
    "observacao"
})
public class CtGuiaHonorarioIndividualReapresentacao {

    @XmlElement(required = true)
    protected CtCabecalhoGuia identificacaoGuiaHonorarioIndividual;
    @XmlElement(required = true)
    protected String numeroGuiaPrincipal;
    @XmlElement(required = true)
    protected CtBeneficiario dadosBeneficiario;
    @XmlElement(required = true)
    protected CtContratado contratado;
    @XmlElement(required = true)
    protected CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante contratadoExecutante;
    @XmlElement(required = true)
    protected CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados procedimentosExamesRealizados;
    protected String observacao;

    /**
     * Gets the value of the identificacaoGuiaHonorarioIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public CtCabecalhoGuia getIdentificacaoGuiaHonorarioIndividual() {
        return identificacaoGuiaHonorarioIndividual;
    }

    /**
     * Sets the value of the identificacaoGuiaHonorarioIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoGuia }
     *     
     */
    public void setIdentificacaoGuiaHonorarioIndividual(CtCabecalhoGuia value) {
        this.identificacaoGuiaHonorarioIndividual = value;
    }

    /**
     * Gets the value of the numeroGuiaPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrincipal() {
        return numeroGuiaPrincipal;
    }

    /**
     * Sets the value of the numeroGuiaPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrincipal(String value) {
        this.numeroGuiaPrincipal = value;
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
     * Gets the value of the contratado property.
     * 
     * @return
     *     possible object is
     *     {@link CtContratado }
     *     
     */
    public CtContratado getContratado() {
        return contratado;
    }

    /**
     * Sets the value of the contratado property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratado }
     *     
     */
    public void setContratado(CtContratado value) {
        this.contratado = value;
    }

    /**
     * Gets the value of the contratadoExecutante property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante }
     *     
     */
    public CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante getContratadoExecutante() {
        return contratadoExecutante;
    }

    /**
     * Sets the value of the contratadoExecutante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante }
     *     
     */
    public void setContratadoExecutante(CtGuiaHonorarioIndividualReapresentacao.ContratadoExecutante value) {
        this.contratadoExecutante = value;
    }

    /**
     * Gets the value of the procedimentosExamesRealizados property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados }
     *     
     */
    public CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados getProcedimentosExamesRealizados() {
        return procedimentosExamesRealizados;
    }

    /**
     * Sets the value of the procedimentosExamesRealizados property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados }
     *     
     */
    public void setProcedimentosExamesRealizados(CtGuiaHonorarioIndividualReapresentacao.ProcedimentosExamesRealizados value) {
        this.procedimentosExamesRealizados = value;
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
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado">
     *       &lt;sequence>
     *         &lt;element name="identificacaoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_profissionalExecutante"/>
     *         &lt;element name="posicaoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_posicaoProfissao"/>
     *         &lt;element name="tipoAcomodacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tipoAcomodacao" minOccurs="0"/>
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
        "identificacaoProfissional",
        "posicaoProfissional",
        "tipoAcomodacao"
    })
    public static class ContratadoExecutante
        extends CtContratado
    {

        @XmlElement(required = true)
        protected CtProfissionalExecutante identificacaoProfissional;
        @XmlElement(required = true)
        protected String posicaoProfissional;
        protected String tipoAcomodacao;

        /**
         * Gets the value of the identificacaoProfissional property.
         * 
         * @return
         *     possible object is
         *     {@link CtProfissionalExecutante }
         *     
         */
        public CtProfissionalExecutante getIdentificacaoProfissional() {
            return identificacaoProfissional;
        }

        /**
         * Sets the value of the identificacaoProfissional property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProfissionalExecutante }
         *     
         */
        public void setIdentificacaoProfissional(CtProfissionalExecutante value) {
            this.identificacaoProfissional = value;
        }

        /**
         * Gets the value of the posicaoProfissional property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPosicaoProfissional() {
            return posicaoProfissional;
        }

        /**
         * Sets the value of the posicaoProfissional property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPosicaoProfissional(String value) {
            this.posicaoProfissional = value;
        }

        /**
         * Gets the value of the tipoAcomodacao property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoAcomodacao() {
            return tipoAcomodacao;
        }

        /**
         * Sets the value of the tipoAcomodacao property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoAcomodacao(String value) {
            this.tipoAcomodacao = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoRevisao">
     *       &lt;sequence>
     *         &lt;element name="totalGeralHonorario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
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
        "totalGeralHonorario"
    })
    public static class ProcedimentosExamesRealizados
        extends CtProcedimentoRevisao
    {

        protected BigDecimal totalGeralHonorario;

        /**
         * Gets the value of the totalGeralHonorario property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalGeralHonorario() {
            return totalGeralHonorario;
        }

        /**
         * Sets the value of the totalGeralHonorario property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalGeralHonorario(BigDecimal value) {
            this.totalGeralHonorario = value;
        }

    }

}
