/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@XmlRootElement(name = "ansTISS:beneficiario")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "beneficiario")
public class Beneficiario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @XmlTransient
    @Column(name = "idBeneficiario")
    private Long idBeneficiario;
    @XmlElement(name = "ansTISS:numeroCarteira")
    @Column(name = "carteirinha")
    private String carteirinha;
    @XmlElement(name = "ansTISS:nomeBeneficiario")
    @Column(name = "nome")
    private String nome;
    @XmlElement(name = "ansTISS:nomePlano")
    @Column(name = "plano")
    private String plano;
    @XmlElement(name = "ansTISS:validadeCarteira")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date validadeCarteirinha;
    @XmlTransient
    @Column(name = "convenio")
    private String Convenio;
    @XmlTransient
    @Column(name = "uf")
    private String uf;

    @XmlTransient
    @OneToMany(mappedBy = "beneficiario", fetch = FetchType.LAZY)
    @ForeignKey(name = "consultaBeneficiario")
    private List<GuiaConsulta> consulta;

    @XmlTransient
    @OneToMany(mappedBy = "beneficiario", fetch = FetchType.LAZY)
    @ForeignKey(name = "honorarioBeneficiario")
    private List<GuiaHonorario> honorarios;
    @XmlTransient
    @OneToMany(mappedBy = "beneficiario", fetch = FetchType.LAZY)
    @ForeignKey(name = "sadtBeneficiario")
    private List<GuiaSADT> sadts;

    public Long getIdBeneficiario() {
        return idBeneficiario;
    }

    public void setIdBeneficiario(Long idBeneficiario) {
        this.idBeneficiario = idBeneficiario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarteirinha() {
        return carteirinha;
    }

    public void setCarteirinha(String carteirinha) {
        this.carteirinha = carteirinha;
    }

    public Date getValidadeCarteirinha() {
        return validadeCarteirinha;
    }

    public void setValidadeCarteirinha(Date validadeCarteirinha) {
        try {
            SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
            this.validadeCarteirinha = dt1.parse(dt1.format(validadeCarteirinha));
        } catch (Exception e) {
        }
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getConvenio() {
        return Convenio;
    }

    public void setConvenio(String Convenio) {
        this.Convenio = Convenio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<GuiaConsulta> getConsultas() {
        return consulta;
    }

    public void setConsultas(List<GuiaConsulta> consultas) {
        this.consulta = consultas;
    }

    public List<GuiaHonorario> getHonorarios() {
        return honorarios;
    }

    public void setHonorarios(List<GuiaHonorario> honorarios) {
        this.honorarios = honorarios;
    }

    public List<GuiaSADT> getSadts() {
        return sadts;
    }

    public void setSadts(List<GuiaSADT> sadts) {
        this.sadts = sadts;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.idBeneficiario != null ? this.idBeneficiario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Beneficiario other = (Beneficiario) obj;
        if (this.idBeneficiario != other.idBeneficiario && (this.idBeneficiario == null || !this.idBeneficiario.equals(other.idBeneficiario))) {
            return false;
        }
        return true;
    }

}
