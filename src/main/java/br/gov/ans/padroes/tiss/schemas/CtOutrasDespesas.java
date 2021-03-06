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
 * <p>Java class for ct_outrasDespesas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_outrasDespesas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="despesa" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="identificadorDespesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
 *                   &lt;element name="tipoDespesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_outrasDespesas"/>
 *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="horaInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *                   &lt;element name="horaFinal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *                   &lt;element name="reducaoAcrescimo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_percentual" minOccurs="0"/>
 *                   &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
 *                   &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                   &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totalGeralOutrasDespesas" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_outrasDespesas", propOrder = {
    "despesa",
    "totalGeralOutrasDespesas"
})
public class CtOutrasDespesas {

    @XmlElement(required = true)
    protected List<CtOutrasDespesas.Despesa> despesa;
    protected BigDecimal totalGeralOutrasDespesas;

    /**
     * Gets the value of the despesa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the despesa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDespesa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtOutrasDespesas.Despesa }
     * 
     * 
     */
    public List<CtOutrasDespesas.Despesa> getDespesa() {
        if (despesa == null) {
            despesa = new ArrayList<CtOutrasDespesas.Despesa>();
        }
        return this.despesa;
    }

    /**
     * Gets the value of the totalGeralOutrasDespesas property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalGeralOutrasDespesas() {
        return totalGeralOutrasDespesas;
    }

    /**
     * Sets the value of the totalGeralOutrasDespesas property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalGeralOutrasDespesas(BigDecimal value) {
        this.totalGeralOutrasDespesas = value;
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
     *         &lt;element name="identificadorDespesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_tabela"/>
     *         &lt;element name="tipoDespesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_outrasDespesas"/>
     *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="horaInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
     *         &lt;element name="horaFinal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
     *         &lt;element name="reducaoAcrescimo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_percentual" minOccurs="0"/>
     *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_quantidade"/>
     *         &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
     *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_valorMonetario" minOccurs="0"/>
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
        "identificadorDespesa",
        "tipoDespesa",
        "dataRealizacao",
        "horaInicial",
        "horaFinal",
        "reducaoAcrescimo",
        "quantidade",
        "valorUnitario",
        "valorTotal"
    })
    public static class Despesa {

        @XmlElement(required = true)
        protected CtTabela identificadorDespesa;
        @XmlElement(required = true)
        protected String tipoDespesa;
        @XmlElement(required = true)
        protected String dataRealizacao;
        protected String horaInicial;
        protected String horaFinal;
        protected BigDecimal reducaoAcrescimo;
        @XmlElement(required = true)
        protected BigDecimal quantidade;
        protected BigDecimal valorUnitario;
        protected BigDecimal valorTotal;

        /**
         * Gets the value of the identificadorDespesa property.
         * 
         * @return
         *     possible object is
         *     {@link CtTabela }
         *     
         */
        public CtTabela getIdentificadorDespesa() {
            return identificadorDespesa;
        }

        /**
         * Sets the value of the identificadorDespesa property.
         * 
         * @param value
         *     allowed object is
         *     {@link CtTabela }
         *     
         */
        public void setIdentificadorDespesa(CtTabela value) {
            this.identificadorDespesa = value;
        }

        /**
         * Gets the value of the tipoDespesa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoDespesa() {
            return tipoDespesa;
        }

        /**
         * Sets the value of the tipoDespesa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoDespesa(String value) {
            this.tipoDespesa = value;
        }

        /**
         * Gets the value of the dataRealizacao property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getDataRealizacao() {
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
        public void setDataRealizacao(String value) {
            this.dataRealizacao = value;
        }

        /**
         * Gets the value of the horaInicial property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getHoraInicial() {
            return horaInicial;
        }

        /**
         * Sets the value of the horaInicial property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraInicial(String value) {
            this.horaInicial = value;
        }

        /**
         * Gets the value of the horaFinal property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public String getHoraFinal() {
            return horaFinal;
        }

        /**
         * Sets the value of the horaFinal property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraFinal(String value) {
            this.horaFinal = value;
        }

        /**
         * Gets the value of the reducaoAcrescimo property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getReducaoAcrescimo() {
            return reducaoAcrescimo;
        }

        /**
         * Sets the value of the reducaoAcrescimo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setReducaoAcrescimo(BigDecimal value) {
            this.reducaoAcrescimo = value;
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
         * Gets the value of the valorUnitario property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorUnitario() {
            return valorUnitario;
        }

        /**
         * Sets the value of the valorUnitario property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorUnitario(BigDecimal value) {
            this.valorUnitario = value;
        }

        /**
         * Gets the value of the valorTotal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorTotal() {
            return valorTotal;
        }

        /**
         * Sets the value of the valorTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorTotal(BigDecimal value) {
            this.valorTotal = value;
        }

    }

}
