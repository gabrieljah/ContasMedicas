package br.com.jrmae.contasmedicas.controller.guia;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.JasperExportManager;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parameters",
    "afiliado",
    "codigoAfiliacao",
    "unidadeAfiliado",
    "inicioPeriodoAtendimento",
    "finalPeriodoAtendimento",
    "tipoAtendimentoSaude",
    "tipoAtendimentoSaudeOutro",
    "tipoAtendimentoOdonto",
    "qtdeRxPeriapicalOdonto",
    "qtdeRxPanoramicaOdonto",
    "qtdeRxOclusalOdonto",
    "tipoCoberturaOdonto",
    "tipoEntrega",
    "dtEntrega",
    "nProtocolo",
    "qtdeSegurados",
    "qtdeServicosRealizados",
    "valorApresentado",
    "dtCredito"
})
@XmlRootElement(name = "capaLote")
public class CapaLote {
    
    protected Map<String, Object> parameters = new HashMap<String, Object>();
    
    protected String afiliado;
    protected String codigoAfiliacao;
    protected String unidadeAfiliado;
    protected String inicioPeriodoAtendimento;
    protected String finalPeriodoAtendimento;
    protected String tipoAtendimentoSaude;
    protected String tipoAtendimentoSaudeOutro;
    protected String tipoAtendimentoOdonto;
    protected String qtdeRxPeriapicalOdonto;
    protected String qtdeRxPanoramicaOdonto;
    protected String qtdeRxOclusalOdonto;
    protected String tipoCoberturaOdonto;
    protected String tipoEntrega;
    protected String dtEntrega;
    protected String nProtocolo;
    protected String qtdeSegurados;
    protected String qtdeServicosRealizados;
    protected String valorApresentado;
    protected String dtCredito;
    
    public CapaLote(){
        this.afiliado = "";
        this.codigoAfiliacao = "";
        this.unidadeAfiliado = "";
        this.inicioPeriodoAtendimento = "";
        this.finalPeriodoAtendimento = "";
        this.tipoAtendimentoSaude = "";
        this.tipoAtendimentoSaudeOutro = "";
        this.tipoAtendimentoOdonto = "";
        this.qtdeRxPeriapicalOdonto = "";
        this.qtdeRxPanoramicaOdonto = "";
        this.qtdeRxOclusalOdonto = "";
        this.tipoCoberturaOdonto = "";
        this.tipoEntrega = "";
        this.dtEntrega = "";
        this.nProtocolo = "";
        this.qtdeSegurados = "";
        this.qtdeServicosRealizados = "";
        this.valorApresentado = "";
        this.dtCredito = "";    
    }

    public CapaLote(String afiliado, String codigoAfiliacao, String unidadeAfiliado, 
                    String inicioPeriodoAtendimento, String finalPeriodoAtendimento, 
                    String tipoAtendimentoSaude, String tipoAtendimentoSaudeOutro, String tipoAtendimentoOdonto, 
                    String qtdeRxPeriapicalOdonto, String qtdeRxPanoramicaOdonto, 
                    String qtdeRxOclusalOdonto, String tipoCoberturaOdonto, String tipoEntrega, 
                    String dtEntrega, String nProtocolo, String qtdeSegurados, 
                    String qtdeServicosRealizados, String valorApresentado, String dtCredito) {
        this.afiliado = afiliado;
        this.codigoAfiliacao = codigoAfiliacao;
        this.unidadeAfiliado = unidadeAfiliado;
        this.inicioPeriodoAtendimento = inicioPeriodoAtendimento;
        this.finalPeriodoAtendimento = finalPeriodoAtendimento;
        this.tipoAtendimentoSaude = tipoAtendimentoSaude;
        this.tipoAtendimentoSaudeOutro = tipoAtendimentoSaudeOutro;
        this.tipoAtendimentoOdonto = tipoAtendimentoOdonto;
        this.qtdeRxPeriapicalOdonto = qtdeRxPeriapicalOdonto;
        this.qtdeRxPanoramicaOdonto = qtdeRxPanoramicaOdonto;
        this.qtdeRxOclusalOdonto = qtdeRxOclusalOdonto;
        this.tipoCoberturaOdonto = tipoCoberturaOdonto;
        this.tipoEntrega = tipoEntrega;
        this.dtEntrega = dtEntrega;
        this.nProtocolo = nProtocolo;
        this.qtdeSegurados = qtdeSegurados;
        this.qtdeServicosRealizados = qtdeServicosRealizados;
        this.valorApresentado = valorApresentado;
        this.dtCredito = dtCredito;
    }
    
    public void setParametros(){
        this.parameters.put("afiliado", this.afiliado + "");
        this.parameters.put("codigoAfiliacao", this.codigoAfiliacao + "");
        this.parameters.put("unidadeAfiliado", this.unidadeAfiliado + "");
        this.parameters.put("inicioPeriodoAtendimento", this.inicioPeriodoAtendimento + "");
        this.parameters.put("finalPeriodoAtendimento", this.finalPeriodoAtendimento + "");
        this.parameters.put("tipoAtendimentoSaude", this.tipoAtendimentoSaude + "");
        this.parameters.put("tipoAtendimentoSaudeOutro", this.tipoAtendimentoSaudeOutro + "");
        this.parameters.put("tipoAtendimentoOdonto", this.tipoAtendimentoOdonto + "");
        this.parameters.put("qtdeRxPeriapicalOdonto", this.qtdeRxPeriapicalOdonto + "");
        this.parameters.put("qtdeRxPanoramicaOdonto", this.qtdeRxPanoramicaOdonto + "");
        this.parameters.put("qtdeRxOclusalOdonto", this.qtdeRxOclusalOdonto + "");
        this.parameters.put("tipoCoberturaOdonto", this.tipoCoberturaOdonto + "");
        this.parameters.put("tipoEntrega", this.tipoEntrega + "");
        this.parameters.put("dtEntrega", this.dtEntrega + "");
        this.parameters.put("nProtocolo", this.nProtocolo + "");
        this.parameters.put("qtdeSegurados", this.qtdeSegurados + "");
        this.parameters.put("qtdeServicosRealizados", this.qtdeServicosRealizados + "");
        this.parameters.put("valorApresentado", this.valorApresentado + "");
        this.parameters.put("dtCredito", this.dtCredito + "");  
    }
    
    public void gerarRelatorio(String pathDestino) {
            try {
                    String path = "C:\\app_Porto\\reports\\capaLote.jasper";

                    FileInputStream fis = new FileInputStream (new File (path));
                    
                    JasperPrint print = JasperFillManager.fillReport(fis, this.parameters);
                    
//                    JRExporter exporter  =new JRPdfExporter();
//                    exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
//                    exporter.setParameter(JRExporterParameter.OUTPUT_STREAM, pathDestino);
//                    exporter.exportReport();
                    
                    JasperExportManager.exportReportToPdfFile(print, pathDestino);
            } catch (Exception erro) {
                    System.out.println("Erro ao gerar o relatório ["+ erro.toString() + "]");  //limar
                    System.out.println("Linha[" + erro.getStackTrace() + "]");
            }
    }
    
    public String getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(String afiliado) {
        this.afiliado = afiliado;
    }

    public String getCodigoAfiliacao() {
        return codigoAfiliacao;
    }

    public void setCodigoAfiliacao(String codigoAfiliacao) {
        this.codigoAfiliacao = codigoAfiliacao;
    }

    public String getUnidadeAfiliado() {
        return unidadeAfiliado;
    }

    public void setUnidadeAfiliado(String unidadeAfiliado) {
        this.unidadeAfiliado = unidadeAfiliado;
    }

    public String getInicioPeriodoAtendimento() {
        return inicioPeriodoAtendimento;
    }

    public void setInicioPeriodoAtendimento(String inicioPeriodoAtendimento) {
        this.inicioPeriodoAtendimento = inicioPeriodoAtendimento;
    }

    public String getFinalPeriodoAtendimento() {
        return finalPeriodoAtendimento;
    }

    public void setFinalPeriodoAtendimento(String finalPeriodoAtendimento) {
        this.finalPeriodoAtendimento = finalPeriodoAtendimento;
    }

    public String getTipoAtendimentoSaude() {
        return tipoAtendimentoSaude;
    }

    public void setTipoAtendimentoSaude(String tipoAtendimentoSaude) {
        this.tipoAtendimentoSaude = tipoAtendimentoSaude;
    }

    public String getTipoAtendimentoSaudeOutro() {
        return tipoAtendimentoSaudeOutro;
    }

    public void setTipoAtendimentoSaudeOutro(String tipoAtendimentoSaudeOutro) {
        this.tipoAtendimentoSaudeOutro = tipoAtendimentoSaudeOutro;
    }

    public String getTipoAtendimentoOdonto() {
        return tipoAtendimentoOdonto;
    }

    public void setTipoAtendimentoOdonto(String tipoAtendimentoOdonto) {
        this.tipoAtendimentoOdonto = tipoAtendimentoOdonto;
    }

    public String getQtdeRxPeriapicalOdonto() {
        return qtdeRxPeriapicalOdonto;
    }

    public void setQtdeRxPeriapicalOdonto(String qtdeRxPeriapicalOdonto) {
        this.qtdeRxPeriapicalOdonto = qtdeRxPeriapicalOdonto;
    }

    public String getQtdeRxPanoramicaOdonto() {
        return qtdeRxPanoramicaOdonto;
    }

    public void setQtdeRxPanoramicaOdonto(String qtdeRxPanoramicaOdonto) {
        this.qtdeRxPanoramicaOdonto = qtdeRxPanoramicaOdonto;
    }

    public String getQtdeRxOclusalOdonto() {
        return qtdeRxOclusalOdonto;
    }

    public void setQtdeRxOclusalOdonto(String qtdeRxOclusalOdonto) {
        this.qtdeRxOclusalOdonto = qtdeRxOclusalOdonto;
    }

    public String getTipoCoberturaOdonto() {
        return tipoCoberturaOdonto;
    }

    public void setTipoCoberturaOdonto(String tipoCoberturaOdonto) {
        this.tipoCoberturaOdonto = tipoCoberturaOdonto;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public String getDtEntrega() {
        return dtEntrega;
    }

    public void setDtEntrega(String dtEntrega) {
        this.dtEntrega = dtEntrega;
    }

    public String getnProtocolo() {
        return nProtocolo;
    }

    public void setnProtocolo(String nProtocolo) {
        this.nProtocolo = nProtocolo;
    }

    public String getQtdeSegurados() {
        return qtdeSegurados;
    }

    public void setQtdeSegurados(String qtdeSegurados) {
        this.qtdeSegurados = qtdeSegurados;
    }

    public String getQtdeServicosRealizados() {
        return qtdeServicosRealizados;
    }

    public void setQtdeServicosRealizados(String qtdeServicosRealizados) {
        this.qtdeServicosRealizados = qtdeServicosRealizados;
    }

    public String getValorApresentado() {
        return valorApresentado;
    }

    public void setValorApresentado(String valorApresentado) {
        this.valorApresentado = valorApresentado;
    }

    public String getDtCredito() {
        return dtCredito;
    }

    public void setDtCredito(String dtCredito) {
        this.dtCredito = dtCredito;
    }    
}
