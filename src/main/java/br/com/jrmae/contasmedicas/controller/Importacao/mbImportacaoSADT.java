/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.controller.Importacao;

import br.com.jrmae.contasmedicas.dao.HibernateDAO;
import br.com.jrmae.contasmedicas.dao.InterfaceDAO;
import br.com.jrmae.contasmedicas.entities.Importacao;
import br.com.jrmae.contasmedicas.util.FacesContextUtil;
import br.com.jrmae.contasmedicas.util.formataCaminhoAnexo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author gabriel
 */
@ManagedBean
@SessionScoped
public class mbImportacaoSADT implements Serializable {

    private static final long serialVersionUID = 1L;
    Importacao importacao = new Importacao();

    private InterfaceDAO<Importacao> importacaoDAO() {
        InterfaceDAO importacaoDAO = new HibernateDAO(Importacao.class, FacesContextUtil.getRequestSession());
        return importacaoDAO;
    }

    //Aqui insere os dados no banco de dados
    public void inserirImportacao(String caminho) {
        importacao = new Importacao();
        Date dataImportacao = new Date();
        importacao.setDescricao("SADT");
        importacao.setStatus("1");
        importacao.setCaminho(caminho);
        importacao.setDataImportacao(dataImportacao);
        importacaoDAO().save(importacao);

        // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Informações Foram Salvas com Sucesso!", ""));
    }

    public void fileUploadAction(FileUploadEvent event) throws FileNotFoundException, IOException, InterruptedException {
        Date dataAtual = new Date();
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
        FacesContext aFacesContext = FacesContext.getCurrentInstance();
        ServletContext context = (ServletContext) aFacesContext.getExternalContext().getContext();

        String realPath = context.getRealPath("/");

        File file = new File(realPath + "/image_upload/SADT/" + dt1.format(dataAtual) + "/");
        file.mkdirs();
        inserirImportacao(realPath + "/image_upload/SADT/" + dt1.format(dataAtual) + "/" + event.getFile().getFileName());
        byte[] arquivo = event.getFile().getContents();
        FileOutputStream fos = new FileOutputStream(realPath + "/image_upload/SADT/" + dt1.format(dataAtual) + "/" + event.getFile().getFileName());
        fos.write(arquivo);
        fos.close();

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Importação Realizada com Sucesso!", ""));

    }

}
