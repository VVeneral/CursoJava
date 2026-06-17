package PraticasCurso.Enums;

public enum TipoPagamento {
    DINHEIRO("Dinheiro"),
    DEBITO("Cartão de débito"),
    CREDITO("Cartão de crédito"),
    BOLETO("Boleto"),
    PIX("Pix");

    private String desc;

    TipoPagamento(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
        return desc;
    }
}
