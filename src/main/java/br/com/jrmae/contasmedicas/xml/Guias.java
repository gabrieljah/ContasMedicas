/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.xml;

import br.com.jrmae.contasmedicas.entities.GuiaConsulta;
import java.io.Serializable;
import java.util.List;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import org.hibernate.annotations.ForeignKey;

/**
 *
 * @author gabriel
 */
@XmlRootElement(name = "ansTISS:guias")
@XmlAccessorType(XmlAccessType.FIELD)
public class Guias implements Serializable {

    @XmlElement(name = "ansTISS:guiaFaturamento")
    GuiaFaturamento guiaFaturamento = new GuiaFaturamento();

    public GuiaFaturamento getGuiaFaturamento() {
        return guiaFaturamento;
    }

    public void setGuiaFaturamento(GuiaFaturamento guiaFaturamento) {
        this.guiaFaturamento = guiaFaturamento;
    }

}
