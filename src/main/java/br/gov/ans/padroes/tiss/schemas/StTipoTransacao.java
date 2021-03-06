//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.03 at 01:07:43 PM BRT 
//


package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for st_tipoTransacao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="st_tipoTransacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ENVIO_LOTE_GUIAS"/>
 *     &lt;enumeration value="SOLIC_DEMONSTRATIVO_RETORNO"/>
 *     &lt;enumeration value="SOLIC_STATUS_PROTOCOLO"/>
 *     &lt;enumeration value="SOLICITACAO_PROCEDIMENTOS"/>
 *     &lt;enumeration value="PROTOCOLO_RECEBIMENTO"/>
 *     &lt;enumeration value="SITUACAO_PROTOCOLO"/>
 *     &lt;enumeration value="RESPOSTA_SOLICITACAO"/>
 *     &lt;enumeration value="DEMONSTRATIVO_PAGAMENTO"/>
 *     &lt;enumeration value="DEMONSTRATIVO_ANALISE_CONTA"/>
 *     &lt;enumeration value="DEMONSTRATIVO_ODONTOLOGIA"/>
 *     &lt;enumeration value="CANCELAMENTO_GUIA_RECIBO"/>
 *     &lt;enumeration value="RE_APRESENTACAO_GUIA"/>
 *     &lt;enumeration value="CANCELA_GUIA"/>
 *     &lt;enumeration value="VERIFICA_ELEGIBILIDADE"/>
 *     &lt;enumeration value="SITUACAO_ELEGIBILIDADE"/>
 *     &lt;enumeration value="AUTORIZACAO_ODONTOLOGIA"/>
 *     &lt;enumeration value="SOLICITA_STATUS_AUTORIZACAO"/>
 *     &lt;enumeration value="STATUS_AUTORIZACAO"/>
 *     &lt;enumeration value="ENVIO_ANEXO"/>
 *     &lt;enumeration value="PROTOCOLO_RECEBIMENTO_ANEXO"/>
 *     &lt;enumeration value="COMUNICACAO_BENEFICIARIO"/>
 *     &lt;enumeration value="RECIBO_COMUNICACAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "st_tipoTransacao")
@XmlEnum
public enum StTipoTransacao {

    ENVIO_LOTE_GUIAS,
    SOLIC_DEMONSTRATIVO_RETORNO,
    SOLIC_STATUS_PROTOCOLO,
    SOLICITACAO_PROCEDIMENTOS,
    PROTOCOLO_RECEBIMENTO,
    SITUACAO_PROTOCOLO,
    RESPOSTA_SOLICITACAO,
    DEMONSTRATIVO_PAGAMENTO,
    DEMONSTRATIVO_ANALISE_CONTA,
    DEMONSTRATIVO_ODONTOLOGIA,
    CANCELAMENTO_GUIA_RECIBO,
    RE_APRESENTACAO_GUIA,
    CANCELA_GUIA,
    VERIFICA_ELEGIBILIDADE,
    SITUACAO_ELEGIBILIDADE,
    AUTORIZACAO_ODONTOLOGIA,
    SOLICITA_STATUS_AUTORIZACAO,
    STATUS_AUTORIZACAO,
    ENVIO_ANEXO,
    PROTOCOLO_RECEBIMENTO_ANEXO,
    COMUNICACAO_BENEFICIARIO,
    RECIBO_COMUNICACAO;

    public String value() {
        return name();
    }

    public static StTipoTransacao fromValue(String v) {
        return valueOf(v);
    }

}
