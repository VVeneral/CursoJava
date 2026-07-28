package Projetos.enums;

public enum SituacaoNota {
    // STATUS DE PAGAMENTO
    PENDENTE("Pendente"),
    PROCESSANDO("Processando."),
    INTEGRADA("Integrada."),
    ENVIADA("Enviada."),
    AUTORIZADA("Autorizada."),
    PAGO("Pago."),
    ERRO("Erro."),
    CANCELADA("Cancelado.");

    private final String descricao;

    SituacaoNota(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
