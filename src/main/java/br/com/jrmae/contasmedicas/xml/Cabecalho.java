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
@XmlRootElement(name = "ansTISS:cabecalho")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cabecalho implements Serializable {

    @XmlElement(name = "ansTISS:identificacaoTransacao")
    private IdentificacaoTransacao identificacaoTransacao = new IdentificacaoTransacao();
    @XmlElement(name = "ansTISS:origem")
    private Origem origem = new Origem();
    @XmlElement(name = "ansTISS:destino")
    private Destino destino = new Destino();
    @XmlElement(name = "ansTISS:versaoPadrao")
    private String versaoPadrao = new String();
    @XmlElement(name = "ansTISS:identificacaoSoftwareGerador")
    private IdentificacaoSoftwareGerador identificacaoSoftwareGerador = new IdentificacaoSoftwareGerador();

    public IdentificacaoTransacao getIdentificacaoTransacao() {
        return identificacaoTransacao;
    }

    public void setIdentificacaoTransacao(IdentificacaoTransacao identificacaoTransacao) {
        this.identificacaoTransacao = identificacaoTransacao;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public String getVersaoPadrao() {
        return versaoPadrao;
    }

    public void setVersaoPadrao(String versaoPadrao) {
        this.versaoPadrao = versaoPadrao;
    }

    public IdentificacaoSoftwareGerador getIdentificacaoSoftwareGerador() {
        return identificacaoSoftwareGerador;
    }

    public void setIdentificacaoSoftwareGerador(IdentificacaoSoftwareGerador identificacaoSoftwareGerador) {
        this.identificacaoSoftwareGerador = identificacaoSoftwareGerador;
    }

}
