package PraticasCurso.Programas;

import PraticasCurso.Entidades.Aluno;
import PraticasCurso.Entidades.Disciplina;

public class sistemaEscola {

    public static void main(String[] args) {

        Disciplina d1 = new Disciplina("Matemática", 8.5);
        Disciplina d2 = new Disciplina("Português", 7.0);
        Disciplina d3 = new Disciplina("História", 9.0);

        Aluno aluno = new Aluno("João");
        aluno.adicionarDisciplinas(d1);
        aluno.adicionarDisciplinas(d2);
        aluno.adicionarDisciplinas(d3);

        System.out.println(aluno);
    }
}