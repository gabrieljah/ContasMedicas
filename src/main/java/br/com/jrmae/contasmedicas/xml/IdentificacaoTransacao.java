/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.xml;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabriel
 */
@XmlRootElement(name = "ansTISS:identificacaoTransacao")
@XmlAccessorType(XmlAccessType.FIELD)
public class IdentificacaoTransacao implements Serializable {

    @XmlElement(name = "ansTISS:tipoTransacao")
    private String tipoTransacao = new String();
    @XmlElement(name = "ansTISS:sequencialTransacao")
    private int sequencialTransacao;
    @XmlElement(name = "ansTISS:dataRegistroTransacao")
    private String dataRegistroTransacao;
    @XmlElement(name = "ansTISS:horaRegistroTransacao")
    private String horaRegistroTransacao;

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public int getSequencialTransacao() {
        return sequencialTransacao;
    }

    public void setSequencialTransacao(int sequencialTransacao) {
        this.sequencialTransacao = sequencialTransacao;
    }

    public String getDataRegistroTransacaoDate() {
        return dataRegistroTransacao;
    }

    public void setDataRegistroTransacaoDate(String dataRegistroTransacaoDate) {
        this.dataRegistroTransacao = dataRegistroTransacaoDate;
    }

    public String getHoraRegistroTransacaoDate() {
        return horaRegistroTransacao;
    }

    public void setHoraRegistroTransacaoDate(String horaRegistroTransacaoDate) {
        this.horaRegistroTransacao = horaRegistroTransacaoDate;
    }

}
