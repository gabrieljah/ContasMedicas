/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.xml;

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
@XmlRootElement(name = "ansTISS:identificacao")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "identificacao")
public class Identificacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @XmlTransient
    @Id
    @GeneratedValue
    @Column(name = "idIdentificacao")
    private Long identificacao;

    @XmlElement(name = "ansTISS:codigoPrestadorNaOperadora")
    private String codigoPrestadorNaOperadora = new String();

    @XmlTransient
    @OneToMany(mappedBy = "identificacao", fetch = FetchType.LAZY)
    @ForeignKey(name = "dadosContratadoIdentificacao")
    private List<DadosContratado> dadosContratado;

    public String getCodigoPrestadorNaOperadora() {
        return codigoPrestadorNaOperadora;
    }

    public void setCodigoPrestadorNaOperadora(String codigoPrestadorNaOperadora) {
        this.codigoPrestadorNaOperadora = codigoPrestadorNaOperadora;
    }

    public Long getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(Long identificacao) {
        this.identificacao = identificacao;
    }

    public List<DadosContratado> getDadosContratado() {
        return dadosContratado;
    }

    public void setDadosContratado(List<DadosContratado> dadosContratado) {
        this.dadosContratado = dadosContratado;
    }

}
