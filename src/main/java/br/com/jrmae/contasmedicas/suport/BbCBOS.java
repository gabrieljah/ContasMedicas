/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.suport;

import br.com.jrmae.contasmedicas.dao.HibernateDAO;
import br.com.jrmae.contasmedicas.dao.InterfaceDAO;
import br.com.jrmae.contasmedicas.entities.CBOS;
import br.com.jrmae.contasmedicas.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author gabriel
 */
@ManagedBean(name = "bbCBOS")
@SessionScoped
public class BbCBOS implements Serializable {

    private static final long serialVersionUID = 1L;

    public List<CBOS> getCboses() {
        InterfaceDAO getCboses = new HibernateDAO(CBOS.class, FacesContextUtil.getRequestSession());
        return getCboses.getEntities();
    }

}
