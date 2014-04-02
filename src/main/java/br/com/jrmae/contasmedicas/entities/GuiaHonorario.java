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
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author gabriel
 */
@Entity
@Table(name = "honorario")
public class GuiaHonorario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "idHonorario")
    private Long idHonorario;
    @Column(name = "numero_guia_solicitado_senha")
    private int NumeroGuiaSolicitadoSenha;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmissao;
    @Column(name = "conselho_profissional")
    private String conselhoProfissional;
    @Column(name = "numero_profissional")
    private String numeroProfissional;
    @Column(name = "uf")
    private String uf;
    @Column(name = "total_g_honorario")
    private double totalGHonorario;

    @OneToMany(mappedBy = "honorario")
    @Cascade(CascadeType.SAVE_UPDATE)
    private List<ProcedimentoItem> procedimentoItems;

    @OneToMany(mappedBy = "honorario", fetch = FetchType.LAZY)
    @ForeignKey(name = "retornoHonorario")
    private List<Retorno> retornos;

    @ManyToOne(optional = false)
    @ForeignKey(name = "honorarioLote")
    @JoinColumn(name = "lote", referencedColumnName = "idLote")
    private Lote lote;

    @ManyToOne(optional = false)
    @ForeignKey(name = "honorarioBeneficiario")
    @JoinColumn(name = "beneficiario", referencedColumnName = "idBeneficiario")
    private Beneficiario beneficiario;



    public Long getIdGuiaHonorario() {
        return idHonorario;
    }

    public void setIdGuiaHonorario(Long idGuiaHonorario) {
        this.idHonorario = idGuiaHonorario;
    }

    public int getNumeroGuiaSolicitadoSenha() {
        return NumeroGuiaSolicitadoSenha;
    }

    public void setNumeroGuiaSolicitadoSenha(int NumeroGuiaSolicitadoSenha) {
        this.NumeroGuiaSolicitadoSenha = NumeroGuiaSolicitadoSenha;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getConselhoProfissional() {
        return conselhoProfissional;
    }

    public void setConselhoProfissional(String conselhoProfissional) {
        this.conselhoProfissional = conselhoProfissional;
    }

    public String getNumeroProfissional() {
        return numeroProfissional;
    }

    public void setNumeroProfissional(String numeroProfissional) {
        this.numeroProfissional = numeroProfissional;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getTotalGHonorario() {
        return totalGHonorario;
    }

    public void setTotalGHonorario(double totalGHonorario) {
        this.totalGHonorario = totalGHonorario;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public List<Retorno> getRetornos() {
        return retornos;
    }

    public void setRetornos(List<Retorno> retornos) {
        this.retornos = retornos;
    }

    public List<ProcedimentoItem> getProcedimentoItems() {
        return procedimentoItems;
    }

    public void setProcedimentoItems(List<ProcedimentoItem> procedimentoItems) {
        this.procedimentoItems = procedimentoItems;
    }

    public Long getIdHonorario() {
        return idHonorario;
    }

    public void setIdHonorario(Long idHonorario) {
        this.idHonorario = idHonorario;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.idHonorario != null ? this.idHonorario.hashCode() : 0);
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
        final GuiaHonorario other = (GuiaHonorario) obj;
        if (this.idHonorario != other.idHonorario && (this.idHonorario == null || !this.idHonorario.equals(other.idHonorario))) {
            return false;
        }
        return true;
    }

}
