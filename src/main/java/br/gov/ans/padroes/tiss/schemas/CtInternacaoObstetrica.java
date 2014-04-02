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


/**
 * <p>Java class for ct_internacaoObstetrica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ct_internacaoObstetrica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="emGestacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="aborto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="transtornoMaternoRelGravidez" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="complicacaoPeriodoPuerperio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="atendimentoRNSalaParto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="complicacaoNeonatal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="baixoPeso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="partoCesareo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="partoNormal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_simNao" minOccurs="0"/>
 *         &lt;element name="declaracoesNascidosVivos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_numeroDN" minOccurs="0"/>
 *         &lt;element name="qtdNascidosVivosTermo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro" minOccurs="0"/>
 *         &lt;element name="qtdNascidosMortos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro" minOccurs="0"/>
 *         &lt;element name="qtdVivosPrematuros" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numeroInteiro" minOccurs="0"/>
 *         &lt;element name="obitoMulher" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_obitoMulher" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_internacaoObstetrica", propOrder = {
    "emGestacao",
    "aborto",
    "transtornoMaternoRelGravidez",
    "complicacaoPeriodoPuerperio",
    "atendimentoRNSalaParto",
    "complicacaoNeonatal",
    "baixoPeso",
    "partoCesareo",
    "partoNormal",
    "declaracoesNascidosVivos",
    "qtdNascidosVivosTermo",
    "qtdNascidosMortos",
    "qtdVivosPrematuros",
    "obitoMulher"
})
public class CtInternacaoObstetrica {

    protected Boolean emGestacao;
    protected Boolean aborto;
    protected Boolean transtornoMaternoRelGravidez;
    protected Boolean complicacaoPeriodoPuerperio;
    protected Boolean atendimentoRNSalaParto;
    protected Boolean complicacaoNeonatal;
    protected Boolean baixoPeso;
    protected Boolean partoCesareo;
    protected Boolean partoNormal;
    protected CtNumeroDN declaracoesNascidosVivos;
    protected BigInteger qtdNascidosVivosTermo;
    protected BigInteger qtdNascidosMortos;
    protected BigInteger qtdVivosPrematuros;
    protected String obitoMulher;

    /**
     * Gets the value of the emGestacao property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEmGestacao() {
        return emGestacao;
    }

    /**
     * Sets the value of the emGestacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEmGestacao(Boolean value) {
        this.emGestacao = value;
    }

    /**
     * Gets the value of the aborto property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAborto() {
        return aborto;
    }

    /**
     * Sets the value of the aborto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAborto(Boolean value) {
        this.aborto = value;
    }

    /**
     * Gets the value of the transtornoMaternoRelGravidez property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTranstornoMaternoRelGravidez() {
        return transtornoMaternoRelGravidez;
    }

    /**
     * Sets the value of the transtornoMaternoRelGravidez property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTranstornoMaternoRelGravidez(Boolean value) {
        this.transtornoMaternoRelGravidez = value;
    }

    /**
     * Gets the value of the complicacaoPeriodoPuerperio property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplicacaoPeriodoPuerperio() {
        return complicacaoPeriodoPuerperio;
    }

    /**
     * Sets the value of the complicacaoPeriodoPuerperio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplicacaoPeriodoPuerperio(Boolean value) {
        this.complicacaoPeriodoPuerperio = value;
    }

    /**
     * Gets the value of the atendimentoRNSalaParto property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAtendimentoRNSalaParto() {
        return atendimentoRNSalaParto;
    }

    /**
     * Sets the value of the atendimentoRNSalaParto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAtendimentoRNSalaParto(Boolean value) {
        this.atendimentoRNSalaParto = value;
    }

    /**
     * Gets the value of the complicacaoNeonatal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isComplicacaoNeonatal() {
        return complicacaoNeonatal;
    }

    /**
     * Sets the value of the complicacaoNeonatal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setComplicacaoNeonatal(Boolean value) {
        this.complicacaoNeonatal = value;
    }

    /**
     * Gets the value of the baixoPeso property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBaixoPeso() {
        return baixoPeso;
    }

    /**
     * Sets the value of the baixoPeso property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBaixoPeso(Boolean value) {
        this.baixoPeso = value;
    }

    /**
     * Gets the value of the partoCesareo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartoCesareo() {
        return partoCesareo;
    }

    /**
     * Sets the value of the partoCesareo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartoCesareo(Boolean value) {
        this.partoCesareo = value;
    }

    /**
     * Gets the value of the partoNormal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartoNormal() {
        return partoNormal;
    }

    /**
     * Sets the value of the partoNormal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartoNormal(Boolean value) {
        this.partoNormal = value;
    }

    /**
     * Gets the value of the declaracoesNascidosVivos property.
     * 
     * @return
     *     possible object is
     *     {@link CtNumeroDN }
     *     
     */
    public CtNumeroDN getDeclaracoesNascidosVivos() {
        return declaracoesNascidosVivos;
    }

    /**
     * Sets the value of the declaracoesNascidosVivos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CtNumeroDN }
     *     
     */
    public void setDeclaracoesNascidosVivos(CtNumeroDN value) {
        this.declaracoesNascidosVivos = value;
    }

    /**
     * Gets the value of the qtdNascidosVivosTermo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdNascidosVivosTermo() {
        return qtdNascidosVivosTermo;
    }

    /**
     * Sets the value of the qtdNascidosVivosTermo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdNascidosVivosTermo(BigInteger value) {
        this.qtdNascidosVivosTermo = value;
    }

    /**
     * Gets the value of the qtdNascidosMortos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdNascidosMortos() {
        return qtdNascidosMortos;
    }

    /**
     * Sets the value of the qtdNascidosMortos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdNascidosMortos(BigInteger value) {
        this.qtdNascidosMortos = value;
    }

    /**
     * Gets the value of the qtdVivosPrematuros property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdVivosPrematuros() {
        return qtdVivosPrematuros;
    }

    /**
     * Sets the value of the qtdVivosPrematuros property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdVivosPrematuros(BigInteger value) {
        this.qtdVivosPrematuros = value;
    }

    /**
     * Gets the value of the obitoMulher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObitoMulher() {
        return obitoMulher;
    }

    /**
     * Sets the value of the obitoMulher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObitoMulher(String value) {
        this.obitoMulher = value;
    }

}
