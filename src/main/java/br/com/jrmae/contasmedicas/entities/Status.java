/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author gabriel
 */
@Entity
@Table(name = "status")
public class Status implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "idStatus")
    private Long idStatus;
    @Column(name = "descricao")
    private String descricao;

    @OneToMany(mappedBy = "status", fetch = FetchType.LAZY)
    @ForeignKey(name = "ConsultaStatus")
    private List<GuiaConsulta> consultas;

    @OneToMany(mappedBy = "status", fetch = FetchType.LAZY)
    @ForeignKey(name = "HonorarioStatus")
    private List<GuiaHonorario> honorarios;

    @OneToMany(mappedBy = "status", fetch = FetchType.LAZY)
    @ForeignKey(name = "SadtStatus")
    private List<GuiaSADT> sadt;

    public Long getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Long idStatus) {
        this.idStatus = idStatus;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<GuiaConsulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<GuiaConsulta> consultas) {
        this.consultas = consultas;
    }

    public List<GuiaHonorario> getHonorarios() {
        return honorarios;
    }

    public void setHonorarios(List<GuiaHonorario> honorarios) {
        this.honorarios = honorarios;
    }

    public List<GuiaSADT> getSadt() {
        return sadt;
    }

    public void setSadt(List<GuiaSADT> sadt) {
        this.sadt = sadt;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + (this.idStatus != null ? this.idStatus.hashCode() : 0);
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
        final Status other = (Status) obj;
        if (this.idStatus != other.idStatus && (this.idStatus == null || !this.idStatus.equals(other.idStatus))) {
            return false;
        }
        return true;
    }
    

}
