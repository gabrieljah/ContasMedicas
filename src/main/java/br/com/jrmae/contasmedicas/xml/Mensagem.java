/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.xml;

import br.com.jrmae.contasmedicas.entities.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabriel
 */
@XmlRootElement(name = "ansTISS:mensagemTISS")
@XmlAccessorType(XmlAccessType.FIELD)
public class Mensagem implements Serializable{

    @XmlElement(name = "ansTISS:cabecalho")
    private Cabecalho cabecalho = new Cabecalho();
    @XmlElement(name = "ansTISS:prestadorParaOperadora")
    private PrestadorParaOperadora prestadorParaOperadora = new PrestadorParaOperadora();

    public Cabecalho getCabecalho() {
        return cabecalho;
    }

    public void setCabecalho(Cabecalho cabecalho) {
        this.cabecalho = cabecalho;
    }

    public PrestadorParaOperadora getPrestadorParaOperadora() {
        return prestadorParaOperadora;
    }

    public void setPrestadorParaOperadora(PrestadorParaOperadora prestadorParaOperadora) {
        this.prestadorParaOperadora = prestadorParaOperadora;
    }

}
