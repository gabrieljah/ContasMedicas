//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 01:07:43 PM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_statusLote complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_statusLote">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusProtocolo" minOccurs="0"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_protocolo"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_inteiro12"/>
 *         &lt;element name="dataEnvioLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="numeroFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_inteiro12" minOccurs="0"/>
 *         &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_statusProtocolo"/>
 *         &lt;element name="guias">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="detalheguiaMedica" maxOccurs="100" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *                             &lt;element name="procedimentosAnalisados">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacao" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="detalheguiaOdonto" maxOccurs="100" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
 *                             &lt;element name="procedimentosAnalisados">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacaoOdonto" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
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
@XmlType(name = "ct_statusLote", propOrder = {
    "statusProtocolo",
    "numeroProtocolo",
    "numeroLote",
    "dataEnvioLote",
    "numeroFatura",
    "valorProcessado",
    "valorLiberado",
    "valorGlosa",
    "status",
    "guias"
})
public class CtStatusLote {

    protected String statusProtocolo;
    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected BigInteger numeroLote;
    @XmlElement(required = true)
    protected XMLGregorianCalendar dataEnvioLote;
    protected BigInteger numeroFatura;
    protected BigDecimal valorProcessado;
    protected BigDecimal valorLiberado;
    protected BigDecimal valorGlosa;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected CtStatusLote.Guias guias;

    /**
     * Gets the value of the statusProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusProtocolo() {
        return statusProtocolo;
    }

    /**
     * Sets the value of the statusProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusProtocolo(String value) {
        this.statusProtocolo = value;
    }

    /**
     * Gets the value of the numeroProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Sets the value of the numeroProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocolo(String value) {
        this.numeroProtocolo = value;
    }

    /**
     * Gets the value of the numeroLote property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroLote() {
        return numeroLote;
    }

    /**
     * Sets the value of the numeroLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroLote(BigInteger value) {
        this.numeroLote = value;
    }

    /**
     * Gets the value of the dataEnvioLote property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEnvioLote() {
        return dataEnvioLote;
    }

    /**
     * Sets the value of the dataEnvioLote property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEnvioLote(XMLGregorianCalendar value) {
        this.dataEnvioLote = value;
    }

    /**
     * Gets the value of the numeroFatura property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroFatura() {
        return numeroFatura;
    }

    /**
     * Sets the value of the numeroFatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroFatura(BigInteger value) {
        this.numeroFatura = value;
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
     * Gets the value of the valorGlosa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosa() {
        return valorGlosa;
    }

    /**
     * Sets the value of the valorGlosa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosa(BigDecimal value) {
        this.valorGlosa = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the guias property.
     * 
     * @return
     *     possible object is
     *     {@link CtStatusLote.Guias }
     *     
     */
    public CtStatusLote.Guias getGuias() {
        return guias;
    }

    /**
     * Sets the value of the guias property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtStatusLote.Guias }
     *     
     */
    public void setGuias(CtStatusLote.Guias value) {
        this.guias = value;
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
     *       &lt;choice>
     *         &lt;element name="detalheguiaMedica" maxOccurs="100" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
     *                   &lt;element name="procedimentosAnalisados">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacao" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="detalheguiaOdonto" maxOccurs="100" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
     *                   &lt;element name="procedimentosAnalisados">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacaoOdonto" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "detalheguiaMedica",
        "detalheguiaOdonto"
    })
    public static class Guias {

        protected List<CtStatusLote.Guias.DetalheguiaMedica> detalheguiaMedica;
        protected List<CtStatusLote.Guias.DetalheguiaOdonto> detalheguiaOdonto;

        /**
         * Gets the value of the detalheguiaMedica property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detalheguiaMedica property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalheguiaMedica().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtStatusLote.Guias.DetalheguiaMedica }
         * 
         * 
         */
        public List<CtStatusLote.Guias.DetalheguiaMedica> getDetalheguiaMedica() {
            if (detalheguiaMedica == null) {
                detalheguiaMedica = new ArrayList<CtStatusLote.Guias.DetalheguiaMedica>();
            }
            return this.detalheguiaMedica;
        }

        /**
         * Gets the value of the detalheguiaOdonto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detalheguiaOdonto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalheguiaOdonto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtStatusLote.Guias.DetalheguiaOdonto }
         * 
         * 
         */
        public List<CtStatusLote.Guias.DetalheguiaOdonto> getDetalheguiaOdonto() {
            if (detalheguiaOdonto == null) {
                detalheguiaOdonto = new ArrayList<CtStatusLote.Guias.DetalheguiaOdonto>();
            }
            return this.detalheguiaOdonto;
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
         *         &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
         *         &lt;element name="procedimentosAnalisados">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacao" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
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
            "identificacaoGuia",
            "procedimentosAnalisados"
        })
        public static class DetalheguiaMedica {

            @XmlElement(required = true)
            protected CtCabecalhoGuia identificacaoGuia;
            @XmlElement(required = true)
            protected CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados procedimentosAnalisados;

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
             * Gets the value of the procedimentosAnalisados property.
             * 
             * @return
             *     possible object is
             *     {@link CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados }
             *     
             */
            public CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados getProcedimentosAnalisados() {
                return procedimentosAnalisados;
            }

            /**
             * Sets the value of the procedimentosAnalisados property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados }
             *     
             */
            public void setProcedimentosAnalisados(CtStatusLote.Guias.DetalheguiaMedica.ProcedimentosAnalisados value) {
                this.procedimentosAnalisados = value;
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
             *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacao" maxOccurs="unbounded"/>
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
                "procedimento"
            })
            public static class ProcedimentosAnalisados {

                @XmlElement(required = true)
                protected List<CtItemSolicitacao> procedimento;

                /**
                 * Gets the value of the procedimento property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the procedimento property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcedimento().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtItemSolicitacao }
                 * 
                 * 
                 */
                public List<CtItemSolicitacao> getProcedimento() {
                    if (procedimento == null) {
                        procedimento = new ArrayList<CtItemSolicitacao>();
                    }
                    return this.procedimento;
                }

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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="identificacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_cabecalhoGuia"/>
         *         &lt;element name="procedimentosAnalisados">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacaoOdonto" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
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
            "identificacaoGuia",
            "procedimentosAnalisados"
        })
        public static class DetalheguiaOdonto {

            @XmlElement(required = true)
            protected CtCabecalhoGuia identificacaoGuia;
            @XmlElement(required = true)
            protected CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados procedimentosAnalisados;

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
             * Gets the value of the procedimentosAnalisados property.
             * 
             * @return
             *     possible object is
             *     {@link CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados }
             *     
             */
            public CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados getProcedimentosAnalisados() {
                return procedimentosAnalisados;
            }

            /**
             * Sets the value of the procedimentosAnalisados property.
             * 
             * @param value
             *     allowed object is
             *     {@link CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados }
             *     
             */
            public void setProcedimentosAnalisados(CtStatusLote.Guias.DetalheguiaOdonto.ProcedimentosAnalisados value) {
                this.procedimentosAnalisados = value;
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
             *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_itemSolicitacaoOdonto" maxOccurs="unbounded"/>
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
                "procedimento"
            })
            public static class ProcedimentosAnalisados {

                @XmlElement(required = true)
                protected List<CtItemSolicitacaoOdonto> procedimento;

                /**
                 * Gets the value of the procedimento property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the procedimento property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getProcedimento().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtItemSolicitacaoOdonto }
                 * 
                 * 
                 */
                public List<CtItemSolicitacaoOdonto> getProcedimento() {
                    if (procedimento == null) {
                        procedimento = new ArrayList<CtItemSolicitacaoOdonto>();
                    }
                    return this.procedimento;
                }

            }

        }

    }

}