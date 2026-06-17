package PraticasCurso.Enums;

public enum StatusPagamento {
    PAGO("Pagamento confirmado"),
    AGUARDANDO("Aguardando pagamento"),
    CANCELADO("Pagamento cancelado");

    private String descricao;

    StatusPagamento(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }
}
