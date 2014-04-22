/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.xml;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabriel
 */
@XmlRootElement(name = "ansTISS:identificacaoSoftwareGerador")
@XmlAccessorType(XmlAccessType.FIELD)
public class IdentificacaoSoftwareGerador implements Serializable {

    @XmlElement(name = "ansTISS:nomeAplicativo")
    private String nomeAplicativo = new String();
    @XmlElement(name = "ansTISS:versaoAplicativo")
    private String versaoAplicativo = new String();
    @XmlElement(name = "ansTISS:fabricanteAplicativo")
    private String fabricanteAplicativo = new String();

    public String getNomeAplicativo() {
        return nomeAplicativo;
    }

    public void setNomeAplicativo(String nomeAplicativo) {
        this.nomeAplicativo = nomeAplicativo;
    }

    public String getVersaoAplicativo() {
        return versaoAplicativo;
    }

    public void setVersaoAplicativo(String versaoAplicativo) {
        this.versaoAplicativo = versaoAplicativo;
    }

    public String getFabricanteAplicativo() {
        return fabricanteAplicativo;
    }

    public void setFabricanteAplicativo(String fabricanteAplicativo) {
        this.fabricanteAplicativo = fabricanteAplicativo;
    }

}
