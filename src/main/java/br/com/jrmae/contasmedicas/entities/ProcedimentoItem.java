/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author gabriel
 */
@Entity
@Table(name = "procedimentoItem")
public class ProcedimentoItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "idProcedimentoItem")
    private Long idProcedimentoItem;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataItem;
    @Column(name = "quantidade")
    private int quantidade;
    @Column(name = "valor_total")
    private double valorTotal;

    @ManyToOne
    @JoinColumn(name = "sadt")
    private GuiaSADT sadt;

    @ManyToOne
    @JoinColumn(name = "honorario")
    private GuiaHonorario honorario;

    @ManyToOne(optional = false)
    @ForeignKey(name = "procedimentoItemProcedimento")
    @JoinColumn(name = "procedimento", referencedColumnName = "idProcedimento")
    private Procedimento procedimento;

    public Long getIdProcedimentoItem() {
        return idProcedimentoItem;
    }

    public void setIdProcedimentoItem(Long idProcedimentoItem) {
        this.idProcedimentoItem = idProcedimentoItem;
    }

    public Date getDataItem() {
        return dataItem;
    }

    public void setDataItem(Date dataItem) {
        this.dataItem = dataItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public GuiaSADT getSadt() {
        return sadt;
    }

    public void setSadt(GuiaSADT sadt) {
        this.sadt = sadt;
    }

    public GuiaHonorario getHonorario() {
        return honorario;
    }

    public void setHonorario(GuiaHonorario honorario) {
        this.honorario = honorario;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (this.idProcedimentoItem != null ? this.idProcedimentoItem.hashCode() : 0);
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
        final ProcedimentoItem other = (ProcedimentoItem) obj;
        if (this.idProcedimentoItem != other.idProcedimentoItem && (this.idProcedimentoItem == null || !this.idProcedimentoItem.equals(other.idProcedimentoItem))) {
            return false;
        }
        return true;
    }

}
