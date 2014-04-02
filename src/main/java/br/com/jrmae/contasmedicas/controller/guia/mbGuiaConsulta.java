/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jrmae.contasmedicas.controller.guia;

import br.com.jrmae.contasmedicas.dao.HibernateDAO;
import br.com.jrmae.contasmedicas.dao.InterfaceDAO;
import br.com.jrmae.contasmedicas.entities.Beneficiario;
import br.com.jrmae.contasmedicas.entities.CBOS;
import br.com.jrmae.contasmedicas.entities.GuiaConsulta;
import br.com.jrmae.contasmedicas.entities.Importacao;
import br.com.jrmae.contasmedicas.entities.Lote;
import br.com.jrmae.contasmedicas.entities.Prestador;
import br.com.jrmae.contasmedicas.util.ANSPrefixMapper;
import br.com.jrmae.contasmedicas.util.FacesContextUtil;
import br.gov.ans.padroes.tiss.schemas.MensagemTISS;
import com.thoughtworks.xstream.XStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author gabriel
 */
@ManagedBean
@SessionScoped
public class mbGuiaConsulta implements Serializable {

    private static final long serialVersionUID = 1L;

    private Lote lote = new Lote();
    private Importacao importacao = new Importacao();
    private List<Importacao> importacoes;
    private List<Prestador> prestadors;
    private List<GuiaConsulta> guiasdeConsultas;
    private GuiaConsulta guiaConsulta = new GuiaConsulta();
    private Prestador prestador = new Prestador();
    private Beneficiario beneficiario = new Beneficiario();
    private String parametroConsulta = new String();
    private String colunaParametro = new String();
    private Long idPrestador;
    private String carteirinha = new String();
    private boolean desabilitaCampo = false;
    private CBOS cbos = new CBOS();
    XStream xstream = new XStream();

    public mbGuiaConsulta() {

    }

    //IMPLEMENTAÇÂO METODOS DAO
    private InterfaceDAO<Importacao> importacaoDAO() {
        InterfaceDAO importacaoDAO = new HibernateDAO(Importacao.class, FacesContextUtil.getRequestSession());
        return importacaoDAO;
    }

    private InterfaceDAO<Lote> loteDAO() {
        InterfaceDAO loteDAO = new HibernateDAO(Lote.class, FacesContextUtil.getRequestSession());
        return loteDAO;
    }

    private InterfaceDAO<GuiaConsulta> guiaConsultaDAO() {
        InterfaceDAO guiaConsultaDAO = new HibernateDAO(GuiaConsulta.class, FacesContextUtil.getRequestSession());
        return guiaConsultaDAO;
    }

    private InterfaceDAO<Prestador> prestadorDAO() {
        InterfaceDAO prestadorDAO = new HibernateDAO(Prestador.class, FacesContextUtil.getRequestSession());
        return prestadorDAO;
    }

    private InterfaceDAO<Beneficiario> beneficiarioDAO() {
        InterfaceDAO beneficiarioDAO = new HibernateDAO(Beneficiario.class, FacesContextUtil.getRequestSession());
        return beneficiarioDAO;
    }
    //FIM IMPLEMENTAÇÂO METODOS DAO

    //METODO DE BUSCA
    public void buscarBeneficiario() {
        if (getCarteirinha().isEmpty()) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Favor Preencher o campo", ""));
            this.carteirinha = new String();
        } else {
            try {
                beneficiario = beneficiarioDAO().getUniqueResultBeneficiario(carteirinha);
                if (getCarteirinha().isEmpty()) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Não Foi possível localizar", ""));
                    this.carteirinha = new String();
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Beneficiario Encontrado", ""));
                    this.carteirinha = new String();
                }
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, e.getMessage(), ""));
            }
        }
    }

    public void buscarPrestador() {
        if (getIdPrestador() == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Favor Preencher o campo", ""));
            this.idPrestador = null;
        } else {
            try {
                prestador = prestadorDAO().getUniqueResultPrestador(idPrestador);
                if (this.idPrestador == null) {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Não Foi possível localizar", ""));
                    this.idPrestador = null;
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Prestador Encontrado", ""));
                    this.idPrestador = null;
                }

            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, e.getMessage(), ""));

            }
        }
    }

    //CARREGAR PAGINAS
    public String formConsulta() {
        guiaConsulta = new GuiaConsulta();
        lote = new Lote();
        cbos = new CBOS();
        beneficiario = new Beneficiario();
        prestador = new Prestador();
        desabilitaCampo = false;
        return "/restrict/guia/validacao/form/formconsulta.faces";
    }

    public String formTabelaConsulta() {
        carregarTabela();
        return "/restrict/guia/validacao/guiaconsulta.faces";
    }

    //CARREGAR TABELAS
    public void carregarTabela() {
        importacoes = importacaoDAO().getEntities();
    }

    //INSERÇÔES
    public void salvarCapa() {
        lote.setAfiliado(getPrestador().getNome());
        lote.setCodigoAfiliado(getPrestador().getCpfCnpj());
        lote.setImportacao(importacao);
        lote.setPrestador(prestador);
        loteDAO().save(lote);
        desabilitaCampo = true;
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Gravação efetuada com sucesso", ""));
    }

    public void salvarGuia() {
        guiaConsulta.setValidadeCarteira(getBeneficiario().getValidadeCarteirinha());
        guiaConsulta.setNumeroCarteira(getBeneficiario().getCarteirinha());
        guiaConsulta.setCodigoOperadorCNPJ(getPrestador().getCpfCnpj());
        guiaConsulta.setPlano(getBeneficiario().getPlano());
        guiaConsulta.setNomeContratado(getPrestador().getNome());
        guiaConsulta.setNomeBeneficiario(getBeneficiario().getNome());
        guiaConsulta.setLote(lote);
        guiaConsulta.setBeneficiario(beneficiario);
        guiaConsultaDAO().save(guiaConsulta);
        beneficiario = new Beneficiario();
        guiaConsulta = new GuiaConsulta();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Gravação efetuada com sucesso", ""));

    }

    public String finalizarLote() throws FileNotFoundException, JAXBException {
        //instancia context
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();
        FacesContext aFacesContext = FacesContext.getCurrentInstance();
        ServletContext context = (ServletContext) aFacesContext.getExternalContext().getContext();
        //gera data para criação de pasta
        Date dataAtual = new Date();
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        //cria pasta xml/consulta/dataAtual
        String realPath = context.getRealPath("/");
        File file = new File(realPath + "/xml/Consulta/" + dt1.format(dataAtual) + "/");
        file.mkdirs();
        //faz busca das guias que existe no lote e insere no Array de lote
        guiasdeConsultas = guiaConsultaDAO().getListLoteComGuia(lote.getIdLote());
        lote.setConsultas(new ArrayList<GuiaConsulta>(guiasdeConsultas));

        //Gerando o XML
        JAXBContext jaxbContext;
        jaxbContext = JAXBContext.newInstance(Lote.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new ANSPrefixMapper());
        marshaller.setProperty("com.sun.xml.bind.xmlDeclaration", Boolean.TRUE);
        marshaller.setProperty(marshaller.JAXB_ENCODING, "ISO-8859-1");
        marshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.ans.gov.br/padroes/tiss/schemas/");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

//        JAXBContext jaxbContext = JAXBContext.newInstance(Lote.class);
//        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
//        jaxbMarshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new ANSPrefixMapper());
//        jaxbMarshaller.setProperty("com.sun.xml.bind.xmlDeclaration", Boolean.TRUE);
//        jaxbMarshaller.setProperty(jaxbMarshaller.JAXB_ENCODING, "ISO-8859-1");
//        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        //Marshal the employees list in file
        marshaller.marshal(lote, new File(realPath + "/xml/Consulta/" + dt1.format(dataAtual) + "/" + importacao.getCaminho() + ".xml"));

        //Limpando as coisas
        guiaConsulta = new GuiaConsulta();
        lote = new Lote();
        beneficiario = new Beneficiario();
        prestador = new Prestador();
        desabilitaCampo = false;
        importacao.setStatus("2");
        importacaoDAO().merge(importacao);
        importacao = new Importacao();

        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, " Lote Finalizado com Sucesso!", ""));

        return formTabelaConsulta();
    }

    //GETTERS AND SETTERS
    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public Importacao getImportacao() {
        return importacao;
    }

    public void setImportacao(Importacao importacao) {
        this.importacao = importacao;
    }

    public List<Importacao> getImportacoes() {
        importacoes = importacaoDAO().getListbyCriteriaStatusEntrada("1");
        return importacoes;
    }

    public void setImportacoes(List<Importacao> importacoes) {
        this.importacoes = importacoes;
    }

    public GuiaConsulta getGuiaConsulta() {
        return guiaConsulta;
    }

    public void setGuiaConsulta(GuiaConsulta guiaConsulta) {
        this.guiaConsulta = guiaConsulta;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getColunaParametro() {
        return colunaParametro;
    }

    public void setColunaParametro(String colunaParametro) {
        this.colunaParametro = colunaParametro;
    }

    public String getParametroConsulta() {
        return parametroConsulta;
    }

    public void setParametroConsulta(String parametroConsulta) {
        this.parametroConsulta = parametroConsulta;
    }

    public List<Prestador> getPrestadors() {
        return prestadors;
    }

    public void setPrestadors(List<Prestador> prestadors) {
        this.prestadors = prestadors;
    }

    public Long getIdPrestador() {
        return idPrestador;
    }

    public void setIdPrestador(Long idPrestador) {
        this.idPrestador = idPrestador;
    }

    public String getCarteirinha() {
        return carteirinha;
    }

    public void setCarteirinha(String carteirinha) {
        this.carteirinha = carteirinha;
    }

    public boolean isDesabilitaCampo() {
        return desabilitaCampo;
    }

    public void setDesabilitaCampo(boolean desabilitaCampo) {
        this.desabilitaCampo = desabilitaCampo;
    }

    public CBOS getCbos() {
        return cbos;
    }

    public void setCbos(CBOS cbos) {
        this.cbos = cbos;
    }

    public List<GuiaConsulta> getGuiasdeConsultas() {
        return guiasdeConsultas;
    }

    public void setGuiasdeConsultas(List<GuiaConsulta> guiasdeConsultas) {
        this.guiasdeConsultas = guiasdeConsultas;
    }

}
