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
@Table(name = "cbos")
public class CBOS implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "idCbos")
    private Integer idCbos;
    @Column(name = "cod_cbos")
    private String codCbos;
    @Column(name = "descricao")
    private String descricao;

    @OneToMany(mappedBy = "cbos", fetch = FetchType.LAZY)
    @ForeignKey(name = "consultaCbos")
    private List<GuiaConsulta> consultas;

    @OneToMany(mappedBy = "cbos", fetch = FetchType.LAZY)
    @ForeignKey(name = "sadtCbos")
    private List<GuiaSADT> sadts;
    
    public CBOS(){
        this.codCbos = new String();
    }

    public Integer getIdCbos() {
        return idCbos;
    }

    public void setIdCbos(Integer idCbos) {
        this.idCbos = idCbos;
    }

    public String getCodCbos() {
        return codCbos;
    }

    public void setCodCbos(String codCbos) {
        this.codCbos = codCbos;
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

    public List<GuiaSADT> getSadts() {
        return sadts;
    }

    public void setSadts(List<GuiaSADT> sadts) {
        this.sadts = sadts;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + (this.idCbos != null ? this.idCbos.hashCode() : 0);
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
        final CBOS other = (CBOS) obj;
        if (this.idCbos != other.idCbos && (this.idCbos == null || !this.idCbos.equals(other.idCbos))) {
            return false;
        }
        return true;
    }

}
