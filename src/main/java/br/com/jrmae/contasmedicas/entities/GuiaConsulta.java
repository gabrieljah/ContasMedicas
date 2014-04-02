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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.ForeignKey;
import org.springframework.context.annotation.Primary;

/**
 *
 * @author gabriel
 */
@XmlRootElement(name = "Guia")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "consulta")
public class GuiaConsulta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "idConsulta")
    @XmlTransient
    private Long idConsulta;

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmissaoGuia;
    @Column(name = "numeroCarteira")
    private String numeroCarteira;
    @Column(name = "plano")
    private String plano;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date validadeCarteira;
    @Column(name = "nomeBeneficiario")
    private String nomeBeneficiario;
    @Column(name = "codigoOperador")
    private String codigoOperadorCNPJ;
    @Column(name = "nomeContratado")
    private String nomeContratado;
    @Column(name = "conselho_profissional")
    private String conselhoProfissional;
    @Column(name = "numero_Profissional")
    private String numeroProfissional;
    @Column(name = "uf")
    private String uf;
    @Column(name = "cbos")
    private String cbos;

    @Column(name = "tipo_consulta")
    private String tipoConsulta;
    @Column(name = "tipo_saida")
    private String tipoSaida;

    @OneToMany(mappedBy = "consulta", fetch = FetchType.LAZY)
    @ForeignKey(name = "retornoConsulta")
    private List<Retorno> retornos;
    @XmlTransient
    @ManyToOne(optional = false)
    @ForeignKey(name = "consultaLote")
    @JoinColumn(name = "lote", referencedColumnName = "idLote")
    private Lote lote;

    @XmlTransient
    @ManyToOne(optional = false)
    @ForeignKey(name = "consultaBeneficiario")
    @JoinColumn(name = "beneficiario", referencedColumnName = "idBeneficiario")
    private Beneficiario beneficiario;

    public GuiaConsulta() {

    }

    public Long getIdGuiaConsulta() {
        return idConsulta;
    }

    public void setIdGuiaConsulta(Long idGuiaConsulta) {
        this.idConsulta = idGuiaConsulta;
    }

    public Date getDataEmissaoGuia() {
        return dataEmissaoGuia;
    }

    public void setDataEmissaoGuia(Date dataEmissaoGuia) {
        this.dataEmissaoGuia = dataEmissaoGuia;
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

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }

    public String getTipoSaida() {
        return tipoSaida;
    }

    public void setTipoSaida(String tipoSaida) {
        this.tipoSaida = tipoSaida;
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

    public Long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getCbos() {
        return cbos;
    }

    public void setCbos(String cbos) {
        this.cbos = cbos;
    }

    public String getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(String numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public Date getValidadeCarteira() {
        return validadeCarteira;
    }

    public void setValidadeCarteira(Date validadeCarteira) {
        this.validadeCarteira = validadeCarteira;
    }

    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    public void setNomeBeneficiario(String nomeBeneficiario) {
        this.nomeBeneficiario = nomeBeneficiario;
    }

    public String getCodigoOperadorCNPJ() {
        return codigoOperadorCNPJ;
    }

    public void setCodigoOperadorCNPJ(String codigoOperadorCNPJ) {
        this.codigoOperadorCNPJ = codigoOperadorCNPJ;
    }

    public String getNomeContratado() {
        return nomeContratado;
    }

    public void setNomeContratado(String nomeContratado) {
        this.nomeContratado = nomeContratado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (this.idConsulta != null ? this.idConsulta.hashCode() : 0);
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
        final GuiaConsulta other = (GuiaConsulta) obj;
        if (this.idConsulta != other.idConsulta && (this.idConsulta == null || !this.idConsulta.equals(other.idConsulta))) {
            return false;
        }
        return true;
    }

}
