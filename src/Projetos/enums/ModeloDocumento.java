package Projetos.enums;

public enum ModeloDocumento {
    NFE("55"),
    NFCE("65"),
    CTE("57");

    private final String codigo;

    ModeloDocumento(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
