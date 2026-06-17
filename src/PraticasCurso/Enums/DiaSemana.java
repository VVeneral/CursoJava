package PraticasCurso.Enums;

public enum DiaSemana {
    DOMINGO("Domingo"),
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira"),
    SABADO("Sábado");

    private String desc;

    DiaSemana(String desc) {
        this.desc = desc;
    }
    public String getDescricao() {
        return desc;
    }
}
