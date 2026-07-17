package Projetos.enums;

public enum NaturezaOperacao {

    VENDA("0001", "Venda"),
    DEVOLUCAO_VENDA("002", "Devolução de Venda"),
    TRANSFEWRENCIA("003", "Transferência"),
    BONIFICACAO("004", "Bonificação"),
    EXPORTACAO("005", "Exportação"),
    IMPORTACAO("006", "Importação");

    private final String codigo;
    private final String descricao;

    NaturezaOperacao(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getDescricao() {
        return descricao;
    }
}
