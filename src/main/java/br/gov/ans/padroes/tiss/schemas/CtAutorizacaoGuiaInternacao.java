//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 01:07:43 PM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ct_autorizacaoGuiaInternacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_autorizacaoGuiaInternacao">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoGuia">
 *       &lt;sequence>
 *         &lt;element name="diasAutorizado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro" minOccurs="0"/>
 *         &lt;element name="dataProvavelAdmisHosp" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
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
@XmlType(name = "ct_autorizacaoGuiaInternacao", propOrder = {
    "diasAutorizado",
    "dataProvavelAdmisHosp",
    "tipoAcomodacao"
})
public class CtAutorizacaoGuiaInternacao
    extends CtAutorizacaoGuia
{

    protected BigInteger diasAutorizado;
    protected XMLGregorianCalendar dataProvavelAdmisHosp;
    protected String tipoAcomodacao;

    /**
     * Gets the value of the diasAutorizado property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiasAutorizado() {
        return diasAutorizado;
    }

    /**
     * Sets the value of the diasAutorizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiasAutorizado(BigInteger value) {
        this.diasAutorizado = value;
    }

    /**
     * Gets the value of the dataProvavelAdmisHosp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProvavelAdmisHosp() {
        return dataProvavelAdmisHosp;
    }

    /**
     * Sets the value of the dataProvavelAdmisHosp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProvavelAdmisHosp(XMLGregorianCalendar value) {
        this.dataProvavelAdmisHosp = value;
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
