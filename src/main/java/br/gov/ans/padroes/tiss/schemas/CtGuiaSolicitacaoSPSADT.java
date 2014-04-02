//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 01:07:43 PM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_guiaSolicitacaoSP_SADT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaSolicitacaoSP_SADT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoGuiaSolicitacaoSADTSP" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoSolicitacao"/>
 *         &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" minOccurs="0"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario"/>
 *         &lt;element name="dadosSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitante"/>
 *         &lt;element name="prestadorExecutante" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="caraterSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_eletivaEmergencia"/>
 *         &lt;element name="dataHoraSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_dataHora"/>
 *         &lt;element name="Diagnostico" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnostico" minOccurs="0"/>
 *         &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_indicacaoClinica" minOccurs="0"/>
 *         &lt;element name="procedimentosSolicitados" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentosSolicitados"/>
 *         &lt;element name="opmSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_OPMSolicitadas" minOccurs="0"/>
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
@XmlType(name = "ct_guiaSolicitacaoSP_SADT", propOrder = {
    "identificacaoGuiaSolicitacaoSADTSP",
    "numeroGuiaPrincipal",
    "dadosBeneficiario",
    "dadosSolicitante",
    "prestadorExecutante",
    "caraterSolicitacao",
    "dataHoraSolicitacao",
    "diagnostico",
    "indicacaoClinica",
    "procedimentosSolicitados",
    "opmSolicitada",
    "observacao"
})
public class CtGuiaSolicitacaoSPSADT {

    @XmlElement(required = true)
    protected CtCabecalhoSolicitacao identificacaoGuiaSolicitacaoSADTSP;
    protected String numeroGuiaPrincipal;
    @XmlElement(required = true)
    protected CtBeneficiario dadosBeneficiario;
    @XmlElement(required = true)
    protected CtSolicitante dadosSolicitante;
    protected CtGuiaSolicitacaoSPSADT.PrestadorExecutante prestadorExecutante;
    @XmlElement(required = true)
    protected StEletivaEmergencia caraterSolicitacao;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataHoraSolicitacao;
    @XmlElementRef(name = "Diagnostico", namespace = "http://www.ans.gov.br/padroes/tiss/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<CtDiagnostico> diagnostico;
    @XmlElementRef(name = "indicacaoClinica", namespace = "http://www.ans.gov.br/padroes/tiss/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> indicacaoClinica;
    @XmlElement(required = true)
    protected CtProcedimentosSolicitados procedimentosSolicitados;
    protected CtOPMSolicitadas opmSolicitada;
    protected String observacao;

    /**
     * Gets the value of the identificacaoGuiaSolicitacaoSADTSP property.
     * 
     * @return
     *     possible object is
     *     {@link CtCabecalhoSolicitacao }
     *     
     */
    public CtCabecalhoSolicitacao getIdentificacaoGuiaSolicitacaoSADTSP() {
        return identificacaoGuiaSolicitacaoSADTSP;
    }

    /**
     * Sets the value of the identificacaoGuiaSolicitacaoSADTSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtCabecalhoSolicitacao }
     *     
     */
    public void setIdentificacaoGuiaSolicitacaoSADTSP(CtCabecalhoSolicitacao value) {
        this.identificacaoGuiaSolicitacaoSADTSP = value;
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
     * Gets the value of the dadosSolicitante property.
     * 
     * @return
     *     possible object is
     *     {@link CtSolicitante }
     *     
     */
    public CtSolicitante getDadosSolicitante() {
        return dadosSolicitante;
    }

    /**
     * Sets the value of the dadosSolicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSolicitante }
     *     
     */
    public void setDadosSolicitante(CtSolicitante value) {
        this.dadosSolicitante = value;
    }

    /**
     * Gets the value of the prestadorExecutante property.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaSolicitacaoSPSADT.PrestadorExecutante }
     *     
     */
    public CtGuiaSolicitacaoSPSADT.PrestadorExecutante getPrestadorExecutante() {
        return prestadorExecutante;
    }

    /**
     * Sets the value of the prestadorExecutante property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaSolicitacaoSPSADT.PrestadorExecutante }
     *     
     */
    public void setPrestadorExecutante(CtGuiaSolicitacaoSPSADT.PrestadorExecutante value) {
        this.prestadorExecutante = value;
    }

    /**
     * Gets the value of the caraterSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link StEletivaEmergencia }
     *     
     */
    public StEletivaEmergencia getCaraterSolicitacao() {
        return caraterSolicitacao;
    }

    /**
     * Sets the value of the caraterSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link StEletivaEmergencia }
     *     
     */
    public void setCaraterSolicitacao(StEletivaEmergencia value) {
        this.caraterSolicitacao = value;
    }

    /**
     * Gets the value of the dataHoraSolicitacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraSolicitacao() {
        return dataHoraSolicitacao;
    }

    /**
     * Sets the value of the dataHoraSolicitacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraSolicitacao(XMLGregorianCalendar value) {
        this.dataHoraSolicitacao = value;
    }

    /**
     * Gets the value of the diagnostico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CtDiagnostico }{@code >}
     *     
     */
    public JAXBElement<CtDiagnostico> getDiagnostico() {
        return diagnostico;
    }

    /**
     * Sets the value of the diagnostico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CtDiagnostico }{@code >}
     *     
     */
    public void setDiagnostico(JAXBElement<CtDiagnostico> value) {
        this.diagnostico = value;
    }

    /**
     * Gets the value of the indicacaoClinica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIndicacaoClinica() {
        return indicacaoClinica;
    }

    /**
     * Sets the value of the indicacaoClinica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIndicacaoClinica(JAXBElement<String> value) {
        this.indicacaoClinica = value;
    }

    /**
     * Gets the value of the procedimentosSolicitados property.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentosSolicitados }
     *     
     */
    public CtProcedimentosSolicitados getProcedimentosSolicitados() {
        return procedimentosSolicitados;
    }

    /**
     * Sets the value of the procedimentosSolicitados property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentosSolicitados }
     *     
     */
    public void setProcedimentosSolicitados(CtProcedimentosSolicitados value) {
        this.procedimentosSolicitados = value;
    }

    /**
     * Gets the value of the opmSolicitada property.
     * 
     * @return
     *     possible object is
     *     {@link CtOPMSolicitadas }
     *     
     */
    public CtOPMSolicitadas getOpmSolicitada() {
        return opmSolicitada;
    }

    /**
     * Sets the value of the opmSolicitada property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtOPMSolicitadas }
     *     
     */
    public void setOpmSolicitada(CtOPMSolicitadas value) {
        this.opmSolicitada = value;
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
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PrestadorExecutante
        extends CtContratado
    {


    }

}
