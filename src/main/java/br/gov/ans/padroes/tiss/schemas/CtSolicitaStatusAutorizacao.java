//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 01:07:43 PM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_solicitaStatusAutorizacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_solicitaStatusAutorizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoAutorizacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="identificacaoSolicitacao" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoSolicitacao">
 *                           &lt;sequence>
 *                             &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoSolicitante"/>
 *                             &lt;element name="identificacaoBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataSolicitaStatus" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_dataHora"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_solicitaStatusAutorizacao", propOrder = {
    "identificacaoAutorizacao",
    "dataSolicitaStatus"
})
public class CtSolicitaStatusAutorizacao {

    @XmlElement(required = true)
    protected CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao identificacaoAutorizacao;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataSolicitaStatus;

    /**
     * Gets the value of the identificacaoAutorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao }
     *     
     */
    public CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao getIdentificacaoAutorizacao() {
        return identificacaoAutorizacao;
    }

    /**
     * Sets the value of the identificacaoAutorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao }
     *     
     */
    public void setIdentificacaoAutorizacao(CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao value) {
        this.identificacaoAutorizacao = value;
    }

    /**
     * Gets the value of the dataSolicitaStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSolicitaStatus() {
        return dataSolicitaStatus;
    }

    /**
     * Sets the value of the dataSolicitaStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSolicitaStatus(XMLGregorianCalendar value) {
        this.dataSolicitaStatus = value;
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
     *         &lt;element name="identificacaoSolicitacao" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoSolicitacao">
     *                 &lt;sequence>
     *                   &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoSolicitante"/>
     *                   &lt;element name="identificacaoBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
    @XmlType(name = "", propOrder = {
        "identificacaoSolicitacao"
    })
    public static class IdentificacaoAutorizacao {

        @XmlElement(required = true)
        protected List<CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao.IdentificacaoSolicitacao> identificacaoSolicitacao;

        /**
         * Gets the value of the identificacaoSolicitacao property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the identificacaoSolicitacao property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIdentificacaoSolicitacao().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao.IdentificacaoSolicitacao }
         * 
         * 
         */
        public List<CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao.IdentificacaoSolicitacao> getIdentificacaoSolicitacao() {
            if (identificacaoSolicitacao == null) {
                identificacaoSolicitacao = new ArrayList<CtSolicitaStatusAutorizacao.IdentificacaoAutorizacao.IdentificacaoSolicitacao>();
            }
            return this.identificacaoSolicitacao;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoSolicitacao">
         *       &lt;sequence>
         *         &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoSolicitante"/>
         *         &lt;element name="identificacaoBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiario" minOccurs="0"/>
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
            "profissionalSolicitante",
            "identificacaoBeneficiario"
        })
        public static class IdentificacaoSolicitacao
            extends CtCabecalhoSolicitacao
        {

            @XmlElement(required = true)
            protected CtContratadoSolicitante profissionalSolicitante;
            protected CtBeneficiario identificacaoBeneficiario;

            /**
             * Gets the value of the profissionalSolicitante property.
             * 
             * @return
             *     possible object is
             *     {@link CtContratadoSolicitante }
             *     
             */
            public CtContratadoSolicitante getProfissionalSolicitante() {
                return profissionalSolicitante;
            }

            /**
             * Sets the value of the profissionalSolicitante property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtContratadoSolicitante }
             *     
             */
            public void setProfissionalSolicitante(CtContratadoSolicitante value) {
                this.profissionalSolicitante = value;
            }

            /**
             * Gets the value of the identificacaoBeneficiario property.
             * 
             * @return
             *     possible object is
             *     {@link CtBeneficiario }
             *     
             */
            public CtBeneficiario getIdentificacaoBeneficiario() {
                return identificacaoBeneficiario;
            }

            /**
             * Sets the value of the identificacaoBeneficiario property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtBeneficiario }
             *     
             */
            public void setIdentificacaoBeneficiario(CtBeneficiario value) {
                this.identificacaoBeneficiario = value;
            }

        }

    }

}
