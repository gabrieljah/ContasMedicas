//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 01:07:43 PM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ct_identificacaoPrestadorEquipe complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_identificacaoPrestadorEquipe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="cpf" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
 *         &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_codigoPrestadorNaOperadora"/>
 *         &lt;element name="conselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_conselhoProfissional"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_identificacaoPrestadorEquipe", propOrder = {
    "cpf",
    "codigoPrestadorNaOperadora",
    "conselhoProfissional"
})
public class CtIdentificacaoPrestadorEquipe {

    protected String cpf;
    protected String codigoPrestadorNaOperadora;
    protected CtConselhoProfissional conselhoProfissional;

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the codigoPrestadorNaOperadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPrestadorNaOperadora() {
        return codigoPrestadorNaOperadora;
    }

    /**
     * Sets the value of the codigoPrestadorNaOperadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPrestadorNaOperadora(String value) {
        this.codigoPrestadorNaOperadora = value;
    }

    /**
     * Gets the value of the conselhoProfissional property.
     * 
     * @return
     *     possible object is
     *     {@link CtConselhoProfissional }
     *     
     */
    public CtConselhoProfissional getConselhoProfissional() {
        return conselhoProfissional;
    }

    /**
     * Sets the value of the conselhoProfissional property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtConselhoProfissional }
     *     
     */
    public void setConselhoProfissional(CtConselhoProfissional value) {
        this.conselhoProfissional = value;
    }

}
