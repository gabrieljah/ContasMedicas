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
@XmlRootElement(name = "ansTISS:profissionalExecutante")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "profissionalExecutante")
public class ProfissionalExecutante implements Serializable {

    private static final long serialVersionUID = 1L;
    @XmlTransient
    @Id
    @GeneratedValue
    @Column(name = "idProfissionalExecutante")
    private Long idProfissionalExecutante;
  
    @XmlElement(name = "ansTISS:conselhoProfissional")
    @ManyToOne(optional = false)
    @ForeignKey(name = "profissionalExecutanteConselhoProfissional")
    @JoinColumn(name = "conselhoProfissional", referencedColumnName = "idConselhoProfissional")
    private ConselhoProfissional conselhoProfissional;
  
    @XmlElement(name = "ansTISS:cbos")
    private String cbos = new String();

    @XmlTransient
    @OneToMany(mappedBy = "profissionalExecutante", fetch = FetchType.LAZY)
    @ForeignKey(name = "consultaProfissionalExecutante")
    private List<GuiaConsulta> consulta;

    public ConselhoProfissional getConselhoProfissional() {
        return conselhoProfissional;
    }

    public void setConselhoProfissional(ConselhoProfissional conselhoProfissional) {
        this.conselhoProfissional = conselhoProfissional;
    }

    public String getCbos() {
        return cbos;
    }

    public void setCbos(String cbos) {
        this.cbos = cbos;
    }

    public List<GuiaConsulta> getConsulta() {
        return consulta;
    }

    public void setConsulta(List<GuiaConsulta> consulta) {
        this.consulta = consulta;
    }

    public Long getIdIdentificacaoGuia() {
        return idProfissionalExecutante;
    }

    public void setIdIdentificacaoGuia(Long idIdentificacaoGuia) {
        this.idProfissionalExecutante = idIdentificacaoGuia;
    }

    public Long getIdProfissionalExecutante() {
        return idProfissionalExecutante;
    }

    public void setIdProfissionalExecutante(Long idProfissionalExecutante) {
        this.idProfissionalExecutante = idProfissionalExecutante;
    }

}
