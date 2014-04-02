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
@Table(name = "sadt")
public class GuiaSADT implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "idSadt")
    private Long idSadt;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmissao;
    @Column(name = "nome_profissional_solicitante")
    private String nomeProfissionalSolicitante;
    @Column(name = "conselho_profissional")
    private String ConselhoProfissional;
    @Column(name = "uf")
    private String uf;
    @Column(name = "tipo_atendimento")
    private int tipoAtendimento;
    @Column(name = "tipo_saida")
    private int tipoSaida;
    @Column(name = "total_g_sadt")
    private double TotalGSadt;

    @OneToMany(mappedBy = "sadt")
    @Cascade(CascadeType.SAVE_UPDATE)
    private List<ProcedimentoItem> procedimentoItems;

    @OneToMany(mappedBy = "sadt", fetch = FetchType.LAZY)
    @ForeignKey(name = "retornoSadt")
    private List<Retorno> retornos;

    @ManyToOne(optional = false)
    @ForeignKey(name = "sadtLote")
    @JoinColumn(name = "lote", referencedColumnName = "idLote")
    private Lote lote;

    @ManyToOne(optional = false)
    @ForeignKey(name = "sadtBeneficiario")
    @JoinColumn(name = "beneficiario", referencedColumnName = "idBeneficiario")
    private Beneficiario beneficiario;

    @ManyToOne(optional = false)
    @ForeignKey(name = "sadtCbos")
    @JoinColumn(name = "cbos", referencedColumnName = "idCbos")
    private CBOS cbos;

    public Long getIdGuiaSadt() {
        return idSadt;
    }

    public void setIdGuiaSadt(Long idGuiaSadt) {
        this.idSadt = idGuiaSadt;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNomeProfissionalSolicitante() {
        return nomeProfissionalSolicitante;
    }

    public void setNomeProfissionalSolicitante(String nomeProfissionalSolicitante) {
        this.nomeProfissionalSolicitante = nomeProfissionalSolicitante;
    }

    public String getConselhoProfissional() {
        return ConselhoProfissional;
    }

    public void setConselhoProfissional(String ConselhoProfissional) {
        this.ConselhoProfissional = ConselhoProfissional;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(int tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public int getTipoSaida() {
        return tipoSaida;
    }

    public void setTipoSaida(int tipoSaida) {
        this.tipoSaida = tipoSaida;
    }

    public double getTotalGSadt() {
        return TotalGSadt;
    }

    public void setTotalGSadt(double TotalGSadt) {
        this.TotalGSadt = TotalGSadt;
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

    public CBOS getCbos() {
        return cbos;
    }

    public void setCbos(CBOS cbos) {
        this.cbos = cbos;
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

    public Long getIdSadt() {
        return idSadt;
    }

    public void setIdSadt(Long idSadt) {
        this.idSadt = idSadt;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.idSadt != null ? this.idSadt.hashCode() : 0);
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
        final GuiaSADT other = (GuiaSADT) obj;
        if (this.idSadt != other.idSadt && (this.idSadt == null || !this.idSadt.equals(other.idSadt))) {
            return false;
        }
        return true;
    }

}
