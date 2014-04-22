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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@XmlRootElement(name = "ansTISS:dadosContratado")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "dadosContratado")
public class DadosContratado implements Serializable {

    private static final long serialVersionUID = 1L;
    @XmlTransient
    @Id
    @GeneratedValue
    @Column(name = "idDadosContratado")
    private Long idDadosContratado;

    @XmlElement(name = "ansTISS:identificacao")
    @ManyToOne(optional = false)
    @ForeignKey(name = "identificacao")
    @JoinColumn(name = "dadosContratadoIdentificacao", referencedColumnName = "idIdentificacao")
    private Identificacao identificacao = new Identificacao();

    @XmlElement(name = "ansTISS:nomeContratado")
    private String nomeContratado = new String();

    @XmlTransient
    @OneToMany(mappedBy = "dadosContratado", fetch = FetchType.LAZY)
    @ForeignKey(name = "consultadadosContratado")
    private List<GuiaConsulta> consulta;

    public Identificacao getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(Identificacao identificacao) {
        this.identificacao = identificacao;
    }

    public String getNomeContratado() {
        return nomeContratado;
    }

    public void setNomeContratado(String nomeContratado) {
        this.nomeContratado = nomeContratado;
    }

    public List<GuiaConsulta> getConsulta() {
        return consulta;
    }

    public void setConsulta(List<GuiaConsulta> consulta) {
        this.consulta = consulta;
    }

    public Long getIdDadosContratado() {
        return idDadosContratado;
    }

    public void setIdDadosContratado(Long idDadosContratado) {
        this.idDadosContratado = idDadosContratado;
    }

}
