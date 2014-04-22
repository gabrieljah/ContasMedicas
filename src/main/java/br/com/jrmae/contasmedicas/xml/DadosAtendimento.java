/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.xml;

import br.com.jrmae.contasmedicas.entities.GuiaConsulta;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
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
@XmlRootElement(name = "ansTISS:dadosAtendimento")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "dadosAtendimento")
public class DadosAtendimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @XmlTransient
    @Id
    @GeneratedValue
    @Column(name = "idDadosAtendimento")
    private Long idDadosAtendimento;
    @XmlElement(name = "ansTISS:dataAtendimento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataAtendimento = new Date();

    @XmlElement(name = "ansTISS:procedimento")
    @ManyToOne(optional = false)
    @ForeignKey(name = "dadosAtendimentoProcedimento")
    @JoinColumn(name = "procedimento", referencedColumnName = "idProcedimentoXml")
    private ProcedimentoXml procedimento = new ProcedimentoXml();

    @XmlElement(name = "ansTISS:tipoConsulta")
    private String tipoConsulta = new String();
    @XmlElement(name = "ansTISS:tipoSaida")
    private String tipoSaida = new String();

    @XmlTransient
    @OneToMany(mappedBy = "dadosAtendimento", fetch = FetchType.LAZY)
    @ForeignKey(name = "consultaDadosAtendimento")
    private List<GuiaConsulta> consulta;

    public Date getDataAtendimento() {
        return dataAtendimento;
    }

    public void setDataAtendimento(Date dataAtendimento) {
        this.dataAtendimento = dataAtendimento;
    }

    public ProcedimentoXml getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(ProcedimentoXml procedimento) {
        this.procedimento = procedimento;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getTipoSaida() {
        return tipoSaida;
    }

    public void setTipoSaida(String tipoSaida) {
        this.tipoSaida = tipoSaida;
    }

    public List<GuiaConsulta> getConsulta() {
        return consulta;
    }

    public void setConsulta(List<GuiaConsulta> consulta) {
        this.consulta = consulta;
    }

    public Long getIdDadosAtendimento() {
        return idDadosAtendimento;
    }

    public void setIdDadosAtendimento(Long idDadosAtendimento) {
        this.idDadosAtendimento = idDadosAtendimento;
    }

}
