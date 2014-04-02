/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.controller.cadastro;

import br.com.jrmae.contasmedicas.dao.HibernateDAO;
import br.com.jrmae.contasmedicas.dao.InterfaceDAO;
import br.com.jrmae.contasmedicas.entities.Procedimento;
import br.com.jrmae.contasmedicas.entities.Procedimento;
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
public class mbProcedimento implements Serializable {

    private static final long serialVersionUID = 1L;
    private Procedimento procedimento = new Procedimento();
    private List<Procedimento> procedimentos;
    private String parametroConsulta = new String();
    private String colunaParametro = new String();

    private InterfaceDAO<Procedimento> procedimentoDAO() {
        InterfaceDAO procedimentoDAO = new HibernateDAO(Procedimento.class, FacesContextUtil.getRequestSession());
        return procedimentoDAO;
    }

    public void limparProcedimento() {
        procedimento = new Procedimento();
        procedimentos = new ArrayList();
    }

    public void addProcedimento() {
        if ((this.procedimento.getIdProcedimento() == null) || (this.procedimento.getIdProcedimento().longValue() == 0L)) {
            insertProcedimento();
        } else {
            updateProcedimento();
        }
        limparProcedimento();
    }

    private void insertProcedimento() {
        procedimentoDAO().save(this.procedimento);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Gravação efetuada com sucesso", ""));
    }

    private void updateProcedimento() {
        procedimentoDAO().update(this.procedimento);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Atualização efetuada com sucesso", ""));
    }

    public void consultaProcedimento() {

        if (getParametroConsulta().isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Favor Preencher o campo", ""));

            this.procedimentos = new ArrayList();
            this.parametroConsulta = new String();
            this.colunaParametro = new String();
        } else {
            try {
                this.procedimentos = procedimentoDAO().getListbyCriteriaBuscaNome(colunaParametro, parametroConsulta);
                if (this.procedimentos.isEmpty()) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Não Foi possível localizar", ""));

                    this.parametroConsulta = new String();
                    this.colunaParametro = new String();
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Procedimentos Encontrados", ""));

                    this.parametroConsulta = new String();
                    this.colunaParametro = new String();
                }
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, e.getMessage(), ""));
            }
        }

    }

    private void deleteProcedimento() {
        procedimentoDAO().remove(this.procedimento);

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Remoção efetuada com sucesso", ""));
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public List<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(List<Procedimento> procedimentos) {
        this.procedimentos = procedimentos;
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
