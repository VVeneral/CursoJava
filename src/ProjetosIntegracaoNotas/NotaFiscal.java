package ProjetosIntegracaoNotas;

import ProjetosIntegracaoNotas.enums.SituacaoNota;

public class NotaFiscal {
    private String cliente;
    private String numero;
    private String serie;
    private String chaveDeAcesso;
    private String naturezaDaOperacao;
    private String cnpj;
    private double valor;
//    public String situacao;
    private SituacaoNota situacao;
    private String dataEmissao;

    public NotaFiscal(
        String cliente, String numero, String serie, String chaveDeAcesso,
        String naturezaDaOperacao, String cnpj, double valor,
        SituacaoNota situacao, String dataEmissao) {

        this.cliente = cliente;
        this.numero = numero;
        this.serie = serie;
        this.chaveDeAcesso = chaveDeAcesso;
        this.naturezaDaOperacao = naturezaDaOperacao;
        this.cnpj = cnpj;
        this.valor = valor;
        this.situacao = situacao;
        this.dataEmissao = dataEmissao;
    }

    public String toString() {
        return"===============  NOTA FISCAL  ===============\n"
            + "Cliente: " +  this.cliente + "\n"
            + "Cnpj: " +  this.cnpj + "\n"
            + "Série: " +  this.serie + "\n"
            + "Chave de acesso: \n" +  this.chaveDeAcesso + "\n"
            + "Natureza da Operação: \n" +  this.naturezaDaOperacao + "\n"
            + "Situação: " + situacao + "\n"
            + "Data da emissão: " +  this.dataEmissao + "\n"
            + "=============================================";

    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getChaveDeAcesso() {
        return chaveDeAcesso;
    }

    public void setChaveDeAcesso(String chaveDeAcesso) {
        this.chaveDeAcesso = chaveDeAcesso;
    }

    public String getNaturezaDaOperacao() {
        return naturezaDaOperacao;
    }

    public void setNaturezaDaOperacao(String naturezaDaOperacao) {
        this.naturezaDaOperacao = naturezaDaOperacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public SituacaoNota getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoNota situacao) {
        this.situacao = situacao;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

}
