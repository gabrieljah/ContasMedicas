/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.xml;

import br.com.jrmae.contasmedicas.entities.GuiaConsulta;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author gabriel
 */

@XmlRootElement(name = "ansTISS:procedimento")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "procedimentoXml")
public class ProcedimentoXml implements Serializable {

    private static final long serialVersionUID = 1L;
    @XmlTransient
    @Id
    @GeneratedValue
    @Column(name = "idProcedimentoXml")
    private Long idProcedimentoXml;

    @XmlElement(name = "ansTISS:codigoTabela")
    private String codigoTabela = new String();
    @XmlElement(name = "ansTISS:codigoProcedimento")
    private String codigoProcedimento = new String();

    @XmlTransient
    @OneToMany(mappedBy = "procedimento", fetch = FetchType.LAZY)
    @ForeignKey(name = "dadosAtendimentoProcedimento")
    private List<DadosAtendimento> dadosAtendimento;

    public String getCodigoTabela() {
        return codigoTabela;
    }

    public void setCodigoTabela(String codigoTabela) {
        this.codigoTabela = codigoTabela;
    }

    public String getCodigoProcedimento() {
        return codigoProcedimento;
    }

    public void setCodigoProcedimento(String codigoProcedimento) {
        this.codigoProcedimento = codigoProcedimento;
    }

    public Long getIdProcedimentoXml() {
        return idProcedimentoXml;
    }

    public void setIdProcedimentoXml(Long idProcedimentoXml) {
        this.idProcedimentoXml = idProcedimentoXml;
    }

    public List<DadosAtendimento> getDadosAtendimento() {
        return dadosAtendimento;
    }

    public void setDadosAtendimento(List<DadosAtendimento> dadosAtendimento) {
        this.dadosAtendimento = dadosAtendimento;
    }

}
