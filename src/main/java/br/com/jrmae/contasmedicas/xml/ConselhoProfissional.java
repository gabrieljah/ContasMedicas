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
@XmlRootElement(name = "ansTISS:conselhoProfissional")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "conselhoProfissional")
public class ConselhoProfissional implements Serializable {

    private static final long serialVersionUID = 1L;
    @XmlTransient
    @Id
    @GeneratedValue
    @Column(name = "idConselhoProfissional")
    private Long idConselhoProfissional;

    @XmlElement(name = "ansTISS:siglaConselho")
    private String siglaConselho = new String();
    @XmlElement(name = "ansTISS:numeroConselho")
    private String numeroConselho = new String();
    @XmlElement(name = "ansTISS:ufConselho")
    private String ufConselho = new String();

    @XmlTransient
    @OneToMany(mappedBy = "conselhoProfissional", fetch = FetchType.LAZY)
    @ForeignKey(name = "profissionalExecutanteConselhoProfissional")
    private List<ProfissionalExecutante> profissionalExecutante;

    public String getSiglaConselho() {
        return siglaConselho;
    }

    public void setSiglaConselho(String siglaConselho) {
        this.siglaConselho = siglaConselho;
    }

    public String getNumeroConselho() {
        return numeroConselho;
    }

    public void setNumeroConselho(String numeroConselho) {
        this.numeroConselho = numeroConselho;
    }

    public String getUfConselho() {
        return ufConselho;
    }

    public void setUfConselho(String ufConselho) {
        this.ufConselho = ufConselho;
    }

    public Long getIdConselhoProfissional() {
        return idConselhoProfissional;
    }

    public void setIdConselhoProfissional(Long idConselhoProfissional) {
        this.idConselhoProfissional = idConselhoProfissional;
    }

    public List<ProfissionalExecutante> getProfissionalExecutante() {
        return profissionalExecutante;
    }

    public void setProfissionalExecutante(List<ProfissionalExecutante> profissionalExecutante) {
        this.profissionalExecutante = profissionalExecutante;
    }

}
