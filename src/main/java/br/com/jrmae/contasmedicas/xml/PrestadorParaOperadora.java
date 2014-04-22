/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.xml;

import br.com.jrmae.contasmedicas.entities.Lote;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabriel
 */
@XmlRootElement(name = "ansTISS:prestadorParaOperadora")
@XmlAccessorType(XmlAccessType.FIELD)
public class PrestadorParaOperadora implements Serializable {


    @XmlElement(name = "ansTISS:loteGuias")
    private Lote lote = new Lote();

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }


}
