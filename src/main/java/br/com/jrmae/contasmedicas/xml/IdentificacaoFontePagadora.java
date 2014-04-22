/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.xml;

import br.com.jrmae.contasmedicas.entities.GuiaConsulta;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@XmlRootElement(name = "ansTISS:identificacaoFontePagadora")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "identificacaoFontePagadora")
public class IdentificacaoFontePagadora implements Serializable {

    private static final long serialVersionUID = 1L;
    @XmlTransient
    @Id
    @GeneratedValue
    @Column(name = "idIdentificacaoFontePagadora")
    private Long idIdentificacaoFontePagadora;

    @XmlElement(name = "ansTISS:registroANS")
    private String registroANS = new String();

    @XmlTransient
    @OneToMany(mappedBy = "identificacaoFontePagadora", fetch = FetchType.LAZY)
    @ForeignKey(name = "identificacaoGuiaIdentificacaoFontePagadora")
    private List<IdentificacaoGuia> identificacaoGuia;

    public String getRegistroANS() {
        return registroANS;
    }

    public void setRegistroANS(String registroANS) {
        this.registroANS = registroANS;
    }

    public Long getIdIdentificacaoFontePagadora() {
        return idIdentificacaoFontePagadora;
    }

    public void setIdIdentificacaoFontePagadora(Long idIdentificacaoFontePagadora) {
        this.idIdentificacaoFontePagadora = idIdentificacaoFontePagadora;
    }

    public List<IdentificacaoGuia> getIdentificacaoGuia() {
        return identificacaoGuia;
    }

    public void setIdentificacaoGuia(List<IdentificacaoGuia> identificacaoGuia) {
        this.identificacaoGuia = identificacaoGuia;
    }

}
