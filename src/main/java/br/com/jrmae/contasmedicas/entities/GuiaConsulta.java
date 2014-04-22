/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.entities;

import br.com.jrmae.contasmedicas.xml.DadosAtendimento;
import br.com.jrmae.contasmedicas.xml.DadosContratado;
import br.com.jrmae.contasmedicas.xml.IdentificacaoGuia;
import br.com.jrmae.contasmedicas.xml.ProfissionalExecutante;
import java.io.Serializable;
import java.text.SimpleDateFormat;
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
import javax.persistence.Transient;
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
@XmlRootElement(name = "guiaConsulta")
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
    @XmlTransient
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmissaoGuia;
    @Column(name = "numeroCarteira")
    @XmlTransient
    private String numeroCarteira;
    @Column(name = "plano")
    @XmlTransient
    private String plano;
    @XmlTransient
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date validadeCarteira;
    @Column(name = "nomeBeneficiario")
    @XmlTransient
    private String nomeBeneficiario;
    @Column(name = "codigoOperador")
    @XmlTransient
    private String codigoOperadorCNPJ;
    @Column(name = "nomeContratado")
    @XmlTransient
    private String nomeContratado;
    @Column(name = "conselho_profissional")
    @XmlTransient
    private String conselhoProfissional;
    @Column(name = "numero_Profissional")
    @XmlTransient
    private String numeroProfissional;
    @Column(name = "uf")
    @XmlTransient
    private String uf;
    @Column(name = "cbos")
    @XmlTransient
    private String cbos;
    @XmlTransient
    @Column(name = "tipo_consulta")
    private String tipoConsulta;
    @XmlTransient
    @Column(name = "tipo_saida")
    private String tipoSaida;

    @XmlElement(name = "ansTISS:identificacaoGuia")
    @ManyToOne(optional = false)
    @ForeignKey(name = "consultaIdentificacaoGuia")
    @JoinColumn(name = "identificacaoGuia", referencedColumnName = "idIdentificacaoGuia")
    private IdentificacaoGuia identificacaoGuia;

    @XmlElement(name = "ansTISS:beneficiario")
    @ManyToOne(optional = false)
    @ForeignKey(name = "consultaBeneficiario")
    @JoinColumn(name = "beneficiario", referencedColumnName = "idBeneficiario")
    private Beneficiario beneficiario;

    @XmlElement(name = "ansTISS:dadosContratado")
    @ManyToOne(optional = false)
    @ForeignKey(name = "consultaDadosContratado")
    @JoinColumn(name = "dadosContratado", referencedColumnName = "idDadosContratado")
    private DadosContratado dadosContratado;

    @XmlElement(name = "ansTISS:profissionalExecutante")
    @ManyToOne(optional = false)
    @ForeignKey(name = "consultaProfissionalExecutante")
    @JoinColumn(name = "profissionalExecutante", referencedColumnName = "idProfissionalExecutante")
    private ProfissionalExecutante profissionalExecutante;

    @XmlElement(name = "ansTISS:dadosAtendimento")
    @ManyToOne(optional = false)
    @ForeignKey(name = "consultaDadosAtendimento")
    @JoinColumn(name = "dadosAtendimento", referencedColumnName = "idDadosAtendimento")
    private DadosAtendimento dadosAtendimento;

    @OneToMany(mappedBy = "consulta", fetch = FetchType.LAZY)
    @ForeignKey(name = "retornoConsulta")
    private List<Retorno> retornos;

    @XmlTransient
    @ManyToOne(optional = false)
    @ForeignKey(name = "consultaLote")
    @JoinColumn(name = "lote", referencedColumnName = "idLote")
    private Lote lote;

    public GuiaConsulta() {
        this.profissionalExecutante = new ProfissionalExecutante();

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
        try {
            SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
            this.validadeCarteira = dt1.parse(dt1.format(validadeCarteira));
        } catch (Exception e) {
        }

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

    public IdentificacaoGuia getIdentificacaoGuia() {
        return identificacaoGuia;
    }

    public void setIdentificacaoGuia(IdentificacaoGuia identificacaoGuia) {
        this.identificacaoGuia = identificacaoGuia;
    }

    public DadosContratado getDadosContratado() {
        return dadosContratado;
    }

    public void setDadosContratado(DadosContratado dadosContratado) {
        this.dadosContratado = dadosContratado;
    }

    public ProfissionalExecutante getProfissionalExecutante() {
        return profissionalExecutante;
    }

    public void setProfissionalExecutante(ProfissionalExecutante profissionalExecutante) {
        this.profissionalExecutante = profissionalExecutante;
    }

    public DadosAtendimento getDadosAtendimento() {
        return dadosAtendimento;
    }

    public void setDadosAtendimento(DadosAtendimento dadosAtendimento) {
        this.dadosAtendimento = dadosAtendimento;
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
