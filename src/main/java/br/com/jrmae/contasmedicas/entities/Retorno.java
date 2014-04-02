/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author gabriel
 */
@Entity
@Table(name = "retorno")
public class Retorno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "idRetorno")
    private Long idretorno;

    @ManyToOne(optional = false)
    @ForeignKey(name = "retornoUsuario")
    @JoinColumn(name = "usuario", referencedColumnName = "idUsuario")
    private Usuario usuario;

    @ManyToOne(optional = false)
    @ForeignKey(name = "retornoConsulta")
    @JoinColumn(name = "consulta", referencedColumnName = "idConsulta")
    private GuiaConsulta consulta;

    @ManyToOne(optional = false)
    @ForeignKey(name = "retornoHonorario")
    @JoinColumn(name = "honorario", referencedColumnName = "idHonorario")
    private GuiaHonorario honorario;

    @ManyToOne(optional = false)
    @ForeignKey(name = "retornoSadt")
    @JoinColumn(name = "sadt", referencedColumnName = "idSadt")
    private GuiaSADT sadt;

    public Long getIdretorno() {
        return idretorno;
    }

    public void setIdretorno(Long idretorno) {
        this.idretorno = idretorno;
    }

    public GuiaConsulta getConsulta() {
        return consulta;
    }

    public void setConsulta(GuiaConsulta consulta) {
        this.consulta = consulta;
    }

    public GuiaHonorario getHonorario() {
        return honorario;
    }

    public void setHonorario(GuiaHonorario honorario) {
        this.honorario = honorario;
    }

    public GuiaSADT getSadt() {
        return sadt;
    }

    public void setSadt(GuiaSADT sadt) {
        this.sadt = sadt;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.idretorno != null ? this.idretorno.hashCode() : 0);
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
        final Retorno other = (Retorno) obj;
        if (this.idretorno != other.idretorno && (this.idretorno == null || !this.idretorno.equals(other.idretorno))) {
            return false;
        }
        return true;
    }

}
