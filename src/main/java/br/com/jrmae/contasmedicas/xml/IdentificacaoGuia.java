/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.xml;

import br.com.jrmae.contasmedicas.entities.GuiaConsulta;
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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author gabriel
 */
@XmlRootElement(name = "ansTISS:identificacaoGuia")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "identificacaoGuia")
public class IdentificacaoGuia implements Serializable {

    private static final long serialVersionUID = 1L;
    @XmlTransient
    @Id
    @GeneratedValue
    @Column(name = "idIdentificacaoGuia")
    private Long idIdentificacaoGuia;

    @XmlElement(name = "ansTISS:identificacaoFontePagadora")
    @ManyToOne(optional = false)
    @ForeignKey(name = "identificacaoGuiaIdentificacaoFontePagadora")
    @JoinColumn(name = "identificacaoFontePagadora", referencedColumnName = "idIdentificacaoFontePagadora")
    IdentificacaoFontePagadora identificacaoFontePagadora;

    @XmlElement(name = "ansTISS:dataEmissaoGuia")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmissaoGuia = new Date();
    @XmlElement(name = "ansTISS:numeroGuiaPrestador")
    private String numeroGuiaPrestador = new String();

    @XmlTransient
    @OneToMany(mappedBy = "dadosContratado", fetch = FetchType.LAZY)
    @ForeignKey(name = "consultaDadosContratado")
    private List<GuiaConsulta> consulta;

    public IdentificacaoFontePagadora getIdentificacaoFontePagadora() {
        return identificacaoFontePagadora;
    }

    public void setIdentificacaoFontePagadora(IdentificacaoFontePagadora identificacaoFontePagadora) {
        this.identificacaoFontePagadora = identificacaoFontePagadora;
    }

    public Date getDataEmissaoGuia() {
        return dataEmissaoGuia;
    }

    public void setDataEmissaoGuia(Date dataEmissaoGuia) {
        this.dataEmissaoGuia = dataEmissaoGuia;
    }

    public String getNumeroGuiaPrestador() {
        return numeroGuiaPrestador;
    }

    public void setNumeroGuiaPrestador(String numeroGuiaPrestador) {
        this.numeroGuiaPrestador = numeroGuiaPrestador;
    }

    public Long getIdIdentificacaoGuia() {
        return idIdentificacaoGuia;
    }

    public void setIdIdentificacaoGuia(Long idIdentificacaoGuia) {
        this.idIdentificacaoGuia = idIdentificacaoGuia;
    }

    public List<GuiaConsulta> getConsulta() {
        return consulta;
    }

    public void setConsulta(List<GuiaConsulta> consulta) {
        this.consulta = consulta;
    }

}
