/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.controller.cadastro;

import br.com.jrmae.contasmedicas.dao.HibernateDAO;
import br.com.jrmae.contasmedicas.dao.InterfaceDAO;
import br.com.jrmae.contasmedicas.entities.Beneficiario;
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
public class mbBeneficiario implements Serializable {

    private static final long serialVersionUID = 1L;
    private Beneficiario beneficiario = new Beneficiario();
    private List<Beneficiario> beneficiarios;
    private String parametroConsulta = new String();
    private String colunaParametro = new String();

    private InterfaceDAO<Beneficiario> beneficiarioDAO() {
        InterfaceDAO beneficiarioDAO = new HibernateDAO(Beneficiario.class, FacesContextUtil.getRequestSession());
        return beneficiarioDAO;
    }

    public void limparBeneficiario() {
        beneficiario = new Beneficiario();
        beneficiarios = new ArrayList();
    }

    public void addBeneficiario() {
        if ((this.beneficiario.getIdBeneficiario() == null) || (this.beneficiario.getIdBeneficiario().longValue() == 0L)) {
            insertBeneficiario();
        } else {
            updateBeneficiario();
        }
        limparBeneficiario();
    }

    private void insertBeneficiario() {
        beneficiarioDAO().save(this.beneficiario);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Gravação efetuada com sucesso", ""));
    }

    private void updateBeneficiario() {
        beneficiarioDAO().update(this.beneficiario);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Atualização efetuada com sucesso", ""));
    }

    public void consultaBeneficiario() {

        if (getParametroConsulta().isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Favor Preencher o campo", ""));

            this.beneficiarios = new ArrayList();
            this.parametroConsulta = new String();
            this.colunaParametro = new String();
        } else {
            try {
                this.beneficiarios = beneficiarioDAO().getListbyCriteriaBuscaNome(colunaParametro, parametroConsulta);
                if (this.beneficiarios.isEmpty()) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Não Foi possível localizar", ""));

                    this.parametroConsulta = new String();
                    this.colunaParametro = new String();
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Beneficiarios Encontrados", ""));

                    this.parametroConsulta = new String();
                    this.colunaParametro = new String();
                }
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, e.getMessage(), ""));
            }
        }

    }

    private void deleteBeneficiario() {
        beneficiarioDAO().remove(this.beneficiario);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Remoção efetuada com sucesso", ""));
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public List<Beneficiario> getBeneficiarios() {
        return beneficiarios;
    }

    public void setBeneficiarios(List<Beneficiario> beneficiarios) {
        this.beneficiarios = beneficiarios;
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
