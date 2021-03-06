/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.entities;

import br.com.jrmae.contasmedicas.xml.Guias;
import java.io.Serializable;
import java.text.DecimalFormat;
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
@XmlRootElement(name = "loteGuias")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "lote")
public class Lote implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @XmlTransient
    @Column(name = "idLote")
    private Long idLote;
    @XmlTransient
    @Column(name = "registro_ans")
    private String registroAns;
    @XmlTransient
    @Column(name = "Afiliado")
    private String afiliado;
    @XmlTransient
    @Column(name = "codigoAfiliado")
    private String codigoAfiliado;
    @XmlTransient
    @Column(name = "unidade")
    private String unidadeAfiliado;
    @XmlTransient
    @Column(name = "codigo_procedimento")
    private String codigoProcedimento;
    @XmlTransient
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEntrega;
    @XmlTransient
    @Column(name = "quantidade_servico_prestado")
    private int quantidadeServicoPrestado;
    @XmlTransient
    @Column(name = "valor_apresentado")
    private double valorApresentado;
    @XmlElement(name = "ansTISS:numeroLote")
    private String numeroLote = new String();
    @XmlElement(name = "ansTISS:guias")
    private Guias guias = new Guias();

    @XmlTransient
    @ManyToOne(optional = false)
    @ForeignKey(name = "lotePrestador")
    @JoinColumn(name = "prestador", referencedColumnName = "idPrestador")
    private Prestador prestador;

    @XmlElement(name = "guiaConsulta")
    @OneToMany(mappedBy = "lote", fetch = FetchType.LAZY)
    @ForeignKey(name = "consultaLote")
    private List<GuiaConsulta> consultas;

    @OneToMany(mappedBy = "lote", fetch = FetchType.LAZY)
    @ForeignKey(name = "honorarioLote")
    private List<GuiaHonorario> honorarios;

    @OneToMany(mappedBy = "lote", fetch = FetchType.LAZY)
    @ForeignKey(name = "sadtLote")
    private List<GuiaSADT> sadts;

    @XmlTransient
    @ManyToOne(optional = false)
    @ForeignKey(name = "loteImportacao")
    @JoinColumn(name = "importacao", referencedColumnName = "idImportacao")
    private Importacao importacao;

    public static String format(double x) {
        return String.format("%.2f", x);
    }

    public Long getIdLote() {
        return idLote;
    }

    public void setIdLote(Long idLote) {
        this.idLote = idLote;
    }

    public String getRegistroAns() {
        return registroAns;
    }

    public void setRegistroAns(String registroAns) {
        this.registroAns = registroAns;
    }

    public String getCodigoProcedimento() {
        return codigoProcedimento;
    }

    public void setCodigoProcedimento(String codigoProcedimento) {
        this.codigoProcedimento = codigoProcedimento;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public int getQuantidadeServicoPrestado() {
        return quantidadeServicoPrestado;
    }

    public void setQuantidadeServicoPrestado(int quantidadeServicoPrestado) {
        this.quantidadeServicoPrestado = quantidadeServicoPrestado;
    }

    public double getValorApresentado() {
        return valorApresentado;
    }

    public void setValorApresentado(double valorApresentado) {
        DecimalFormat df = new DecimalFormat("#,###.00");
        df.format(valorApresentado);
        this.valorApresentado = valorApresentado;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
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

    public List<GuiaSADT> getSadts() {
        return sadts;
    }

    public void setSadts(List<GuiaSADT> sadts) {
        this.sadts = sadts;
    }

    public Importacao getImportacao() {
        return importacao;
    }

    public void setImportacao(Importacao importacao) {
        this.importacao = importacao;
    }

    public String getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(String afiliado) {
        this.afiliado = afiliado;
    }

    public String getCodigoAfiliado() {
        return codigoAfiliado;
    }

    public void setCodigoAfiliado(String codigoAfiliado) {
        this.codigoAfiliado = codigoAfiliado;
    }

    public String getUnidadeAfiliado() {
        return unidadeAfiliado;
    }

    public void setUnidadeAfiliado(String unidadeAfiliado) {
        this.unidadeAfiliado = unidadeAfiliado;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Guias getGuias() {
        return guias;
    }

    public void setGuias(Guias guias) {
        this.guias = guias;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (this.idLote != null ? this.idLote.hashCode() : 0);
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
        final Lote other = (Lote) obj;
        if (this.idLote != other.idLote && (this.idLote == null || !this.idLote.equals(other.idLote))) {
            return false;
        }
        return true;
    }

}
