/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.xml;

import br.com.jrmae.contasmedicas.entities.GuiaConsulta;
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gabriel
 */

@XmlRootElement(name = "ansTISS:guiaFaturamento")
@XmlAccessorType(XmlAccessType.FIELD)
public class GuiaFaturamento implements Serializable {

    @XmlElement(name = "ansTISS:guiaConsulta")
    private List<GuiaConsulta> consultas;

    public List<GuiaConsulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<GuiaConsulta> consultas) {
        this.consultas = consultas;
    }
    
    
}
