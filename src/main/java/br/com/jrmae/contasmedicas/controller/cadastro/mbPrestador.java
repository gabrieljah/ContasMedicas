/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.controller.cadastro;

import br.com.jrmae.contasmedicas.dao.HibernateDAO;
import br.com.jrmae.contasmedicas.dao.InterfaceDAO;
import br.com.jrmae.contasmedicas.entities.Prestador;
import br.com.jrmae.contasmedicas.util.FacesContextUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author gabriel
 */
@ManagedBean
@SessionScoped
public class mbPrestador implements Serializable {

    private static final long serialVersionUID = 1L;
    private Prestador prestador = new Prestador();
    private List<Prestador> prestadors;
    private String parametroConsulta = new String();
    private String colunaParametro = new String();

    private InterfaceDAO<Prestador> prestadorDAO() {
        InterfaceDAO prestadorDAO = new HibernateDAO(Prestador.class, FacesContextUtil.getRequestSession());
        return prestadorDAO;
    }

    public void limparPrestador() {
        prestador = new Prestador();
        prestadors = new ArrayList();
    }

    public void addPrestador() {
        if ((this.prestador.getIdPrestador() == null) || (this.prestador.getIdPrestador().longValue() == 0L)) {
            insertPrestador();
        } else {
            updatePrestador();
        }
        limparPrestador();
    }

    private void insertPrestador() {
        prestadorDAO().save(this.prestador);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Gravação efetuada com sucesso", ""));
    }

    private void updatePrestador() {
        prestadorDAO().update(this.prestador);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Atualização efetuada com sucesso", ""));
    }

    public void consultaPrestador() {

        if (getParametroConsulta().isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Favor Preencher o campo", ""));

            this.prestadors = new ArrayList();
            this.parametroConsulta = new String();
            this.colunaParametro = new String();
        } else {
            try {
                this.prestadors = prestadorDAO().getListbyCriteriaBuscaNome(colunaParametro, parametroConsulta);
                if (this.prestadors.isEmpty()) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Não Foi possível localizar", ""));

                    this.parametroConsulta = new String();
                    this.colunaParametro = new String();
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Prestadores Encontrados", ""));

                    this.parametroConsulta = new String();
                    this.colunaParametro = new String();
                }
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, e.getMessage(), ""));
            }
        }

    }

    private void deletePrestador() {
        prestadorDAO().remove(this.prestador);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Remoção efetuada com sucesso", ""));
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public List<Prestador> getPrestadors() {
        return prestadors;
    }

    public void setPrestadors(List<Prestador> prestadors) {
        this.prestadors = prestadors;
    }

    public String getParametroConsulta() {
        return parametroConsulta;
    }

    public void setParametroConsulta(String parametroConsulta) {
        this.parametroConsulta = parametroConsulta;
    }

    public String getColunaParametro() {
        return colunaParametro;
    }

    public void setColunaParametro(String colunaParametro) {
        this.colunaParametro = colunaParametro;
    }

}
