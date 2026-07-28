package Projetos.enums;

public enum Cfop {
    VENDA_DENTRO_ESTADO("5102", "Venda de mercadoria dentro do estado."),
    VENDA_FORA_ESTADO("6102", "Venda de mercadoria fora do estado."),
    COMPRA_COMERCIALIZACAO_DENTRO_ESTADO("1102", "Compra para comercialização dentro do estado."),
    COMPRA_COMERCIALIZACAO_FORA_ESTADO("2102", "Compra para comercialização fora do estado."),
    DEVOLUCAO_DENTRO_ESTADO("1202", "Devolução de venda dentro do estado."),
    DEVOLUCAO_FORA_ESTADO("2202", "Devolução de venda fora do estado.");

    private final String codigo;
    private final String descricao;

    Cfop(String codigo, String descricao) {
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
