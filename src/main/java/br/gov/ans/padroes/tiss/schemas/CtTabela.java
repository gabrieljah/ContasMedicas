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


/**
 * <p>Java class for ct_tabela complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_tabela">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_codigoTabela"/>
 *         &lt;element name="tipoTabela" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_tabela"/>
 *         &lt;element name="descricao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_descricaoTabela" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_tabela", propOrder = {
    "codigo",
    "tipoTabela",
    "descricao"
})
public class CtTabela {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String tipoTabela;
    @XmlElementRef(name = "descricao", namespace = "http://www.ans.gov.br/padroes/tiss/schemas", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descricao;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the tipoTabela property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTabela() {
        return tipoTabela;
    }

    /**
     * Sets the value of the tipoTabela property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTabela(String value) {
        this.tipoTabela = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescricao(JAXBElement<String> value) {
        this.descricao = value;
    }

}