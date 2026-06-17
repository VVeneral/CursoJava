package PraticasCurso.Entidades;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    // 1 - atributos
    private String nome;
    private List<Disciplina> disciplinas; // listade disciplinas.

    // 2 - construtor - recebe só nome, lista começa vazia.
    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>(); // inicia aqui, não adc nada
    }
    // 3 - metodos
    public void adicionarDisciplinas(Disciplina d) {
        this.disciplinas.add(d);
    }

    public double calcularMedia() {
        double soma = 0;
        for (Disciplina d : disciplinas) {
            soma = soma + d.getNota();
        }
        return soma / disciplinas.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Aluno: ").append(this.nome).append("\n");
        sb.append("Disciplinas: \n");
        for (Disciplina d : disciplinas) {
            sb.append(" ").append(d).append("\n");
        }
        sb.append("Média: ").append(this.calcularMedia());
        return sb.toString();
    }

}
