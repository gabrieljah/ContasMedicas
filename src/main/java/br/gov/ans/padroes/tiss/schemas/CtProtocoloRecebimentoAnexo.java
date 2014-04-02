//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 01:07:43 PM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_protocoloRecebimentoAnexo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloRecebimentoAnexo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="protocoloRecebimento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroProtocoloRecebimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_protocolo"/>
 *                   &lt;element name="dadosOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoFontePagadora"/>
 *                   &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
 *                   &lt;element name="dataEnvioAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12"/>
 *                   &lt;element name="quantidadeAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro"/>
 *                   &lt;element name="relacaoAnexo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" maxOccurs="100" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mensagemErro" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_observacao"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_protocoloRecebimentoAnexo", propOrder = {
    "protocoloRecebimento",
    "mensagemErro"
})
public class CtProtocoloRecebimentoAnexo {

    protected CtProtocoloRecebimentoAnexo.ProtocoloRecebimento protocoloRecebimento;
    protected String mensagemErro;

    /**
     * Gets the value of the protocoloRecebimento property.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloRecebimentoAnexo.ProtocoloRecebimento }
     *     
     */
    public CtProtocoloRecebimentoAnexo.ProtocoloRecebimento getProtocoloRecebimento() {
        return protocoloRecebimento;
    }

    /**
     * Sets the value of the protocoloRecebimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloRecebimentoAnexo.ProtocoloRecebimento }
     *     
     */
    public void setProtocoloRecebimento(CtProtocoloRecebimentoAnexo.ProtocoloRecebimento value) {
        this.protocoloRecebimento = value;
    }

    /**
     * Gets the value of the mensagemErro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagemErro() {
        return mensagemErro;
    }

    /**
     * Sets the value of the mensagemErro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagemErro(String value) {
        this.mensagemErro = value;
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
     *         &lt;element name="numeroProtocoloRecebimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_protocolo"/>
     *         &lt;element name="dadosOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identificacaoFontePagadora"/>
     *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratado"/>
     *         &lt;element name="dataEnvioAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricao12"/>
     *         &lt;element name="quantidadeAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro"/>
     *         &lt;element name="relacaoAnexo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" maxOccurs="100" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "numeroProtocoloRecebimento",
        "dadosOperadora",
        "dadosPrestador",
        "dataEnvioAnexo",
        "numeroLote",
        "quantidadeAnexo",
        "relacaoAnexo",
        "observacao"
    })
    public static class ProtocoloRecebimento {

        @XmlElement(required = true)
        protected String numeroProtocoloRecebimento;
        @XmlElement(required = true)
        protected CtIdentificacaoFontePagadora dadosOperadora;
        @XmlElement(required = true)
        protected CtContratado dadosPrestador;
        @XmlElement(required = true)
        protected XMLGregorianCalendar dataEnvioAnexo;
        @XmlElement(required = true)
        protected String numeroLote;
        @XmlElement(required = true)
        protected BigInteger quantidadeAnexo;
        @XmlElement(required = true)
        protected CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo relacaoAnexo;
        protected String observacao;

        /**
         * Gets the value of the numeroProtocoloRecebimento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroProtocoloRecebimento() {
            return numeroProtocoloRecebimento;
        }

        /**
         * Sets the value of the numeroProtocoloRecebimento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroProtocoloRecebimento(String value) {
            this.numeroProtocoloRecebimento = value;
        }

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
         * Gets the value of the dadosPrestador property.
         * 
         * @return
         *     possible object is
         *     {@link CtContratado }
         *     
         */
        public CtContratado getDadosPrestador() {
            return dadosPrestador;
        }

        /**
         * Sets the value of the dadosPrestador property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratado }
         *     
         */
        public void setDadosPrestador(CtContratado value) {
            this.dadosPrestador = value;
        }

        /**
         * Gets the value of the dataEnvioAnexo property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataEnvioAnexo() {
            return dataEnvioAnexo;
        }

        /**
         * Sets the value of the dataEnvioAnexo property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataEnvioAnexo(XMLGregorianCalendar value) {
            this.dataEnvioAnexo = value;
        }

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
         * Gets the value of the quantidadeAnexo property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantidadeAnexo() {
            return quantidadeAnexo;
        }

        /**
         * Sets the value of the quantidadeAnexo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantidadeAnexo(BigInteger value) {
            this.quantidadeAnexo = value;
        }

        /**
         * Gets the value of the relacaoAnexo property.
         * 
         * @return
         *     possible object is
         *     {@link CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo }
         *     
         */
        public CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo getRelacaoAnexo() {
            return relacaoAnexo;
        }

        /**
         * Sets the value of the relacaoAnexo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo }
         *     
         */
        public void setRelacaoAnexo(CtProtocoloRecebimentoAnexo.ProtocoloRecebimento.RelacaoAnexo value) {
            this.relacaoAnexo = value;
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
         *         &lt;element name="numeroGuiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroGuia" maxOccurs="100" minOccurs="0"/>
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
            "numeroGuiaPrincipal"
        })
        public static class RelacaoAnexo {

            protected List<String> numeroGuiaPrincipal;

            /**
             * Gets the value of the numeroGuiaPrincipal property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the numeroGuiaPrincipal property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNumeroGuiaPrincipal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getNumeroGuiaPrincipal() {
                if (numeroGuiaPrincipal == null) {
                    numeroGuiaPrincipal = new ArrayList<String>();
                }
                return this.numeroGuiaPrincipal;
            }

        }

    }

}
