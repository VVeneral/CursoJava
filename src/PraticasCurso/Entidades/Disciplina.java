package PraticasCurso.Entidades;

public class Disciplina {
    // 1 - atributos
    private String nome;
    private double nota;
    // 2 - construtor
    public Disciplina(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    // 3 - metodos
    public double getNota() { return nota; }
    public void setNota(double nota) { this.nota = nota; }

    @Override
    public String toString() {
        return nome + " - " + nota; // usar atributos e não valor fisico
    }
}
