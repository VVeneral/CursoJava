package PraticasCurso.NovosExercicios.POO;

public class SalaDeAula {
    private static int totalAlunos = 0;

    public static void adicionarAluno() {
        totalAlunos++;
    }

    public static void exibirTotalAlunos() {
        System.out.println("Total de alunos: " + totalAlunos);
    }
}


