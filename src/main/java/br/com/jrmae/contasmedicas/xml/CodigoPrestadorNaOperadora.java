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
@XmlRootElement(name = "ansTISS:codigoPrestadorNaOperadora")
@XmlAccessorType(XmlAccessType.FIELD)
public class CodigoPrestadorNaOperadora implements Serializable{
    @XmlElement(name = "ansTISS:codigoPrestadorNaOperadora")
    private String codigoPrestadorNaOperadora = new String();

    public String getCodigoPrestadorNaOperadora() {
        return codigoPrestadorNaOperadora;
    }

    public void setCodigoPrestadorNaOperadora(String codigoPrestadorNaOperadora) {
        this.codigoPrestadorNaOperadora = codigoPrestadorNaOperadora;
    }

}
