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
@Table(name = "procedimento")
public class Procedimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "idProcedimento")
    private Long idProcedimento;
    @Column(name = "cod_Procedimento")
    private String codProcedimento;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "tabela")
    private int tabela;

    @OneToMany(mappedBy = "procedimento", fetch = FetchType.LAZY)
    @ForeignKey(name = "procedimentoItemProcedimento")
    private List<ProcedimentoItem> procedimentos;

    public Long getIdProcedimento() {
        return idProcedimento;
    }

    public void setIdProcedimento(Long idProcedimento) {
        this.idProcedimento = idProcedimento;
    }

    public String getCodProcedimento() {
        return codProcedimento;
    }

    public void setCodProcedimento(String codProcedimento) {
        this.codProcedimento = codProcedimento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTabela() {
        return tabela;
    }

    public void setTabela(int tabela) {
        this.tabela = tabela;
    }

    public List<ProcedimentoItem> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(List<ProcedimentoItem> procedimentos) {
        this.procedimentos = procedimentos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.idProcedimento != null ? this.idProcedimento.hashCode() : 0);
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
        final Procedimento other = (Procedimento) obj;
        if (this.idProcedimento != other.idProcedimento && (this.idProcedimento == null || !this.idProcedimento.equals(other.idProcedimento))) {
            return false;
        }
        return true;
    }

}
