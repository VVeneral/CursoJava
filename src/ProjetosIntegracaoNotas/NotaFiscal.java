package ProjetosIntegracaoNotas;

public class NotaFiscal {
    public String cliente;
    public int numero;
    public int serie;
    public String chaveDeAcesso;
    public String naturezaDaOperacao;
    public String cnpj;
    public double valor;
    public String situacao;
    public int dataEmissao;
    public int totalNotasFiscais = 0;

    public NotaFiscal(
            String cliente, int numero, int serie, String chaveDeAcesso,
            String naturezaDaOperacao, String cnpj, double valor,
            String situacao, int dataEmissao) {

        this.cliente = cliente;
        this.numero = numero;
        this.serie = serie;
        this.chaveDeAcesso = chaveDeAcesso;
        this.naturezaDaOperacao = naturezaDaOperacao;
        this.cnpj = cnpj;
        this.valor = valor;
        this.situacao = situacao;
        this.dataEmissao = dataEmissao;
        totalNotasFiscais++;
    }

    public String toString() {
        return"===============  NOTA FISCAL  ===============\n"
            + "Cliente: " +  this.cliente + "\n"
            + "Cnpj: " +  this.cnpj + "\n"
            + "Série: " +  this.serie + "\n"
            + "Chave de acesso: \n" +  this.chaveDeAcesso + "\n"
            + "Natureza da Operação: \n" +  this.naturezaDaOperacao + "\n"
            + "Situação: " +  this.situacao + "\n"
            + "Data da emissão: " +  this.dataEmissao + "\n"
            + "=============================================";

    }

}
