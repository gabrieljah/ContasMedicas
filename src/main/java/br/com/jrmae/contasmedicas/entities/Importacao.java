/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.entities;

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
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author gabriel
 */
@Entity
@Table(name = "importacao")
public class Importacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "idImportacao")
    private Long idImportacao;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "caminho")
    private String caminho;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataImportacao;
    @Column(name = "status")
    private String status;
    @OneToMany(mappedBy = "importacao", fetch = FetchType.LAZY)
    @ForeignKey(name = "loteImportacao")
    private List<Lote> lotes;

    public Long getIdImportacao() {
        return idImportacao;
    }

    public void setIdImportacao(Long idImportacao) {
        this.idImportacao = idImportacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }

    public Date getDataImportacao() {
        return dataImportacao;
    }

    public void setDataImportacao(Date dataImportacao) {
        this.dataImportacao = dataImportacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.idImportacao != null ? this.idImportacao.hashCode() : 0);
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
        final Importacao other = (Importacao) obj;
        if (this.idImportacao != other.idImportacao && (this.idImportacao == null || !this.idImportacao.equals(other.idImportacao))) {
            return false;
        }
        return true;
    }

}
