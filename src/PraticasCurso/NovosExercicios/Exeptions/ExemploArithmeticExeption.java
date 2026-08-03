package PraticasCurso.NovosExercicios.Exeptions;

/**
 * TRATAMENTO DE EXCEÇÕES
 * try  - Contém o código que pode causar a exeção.
 * catch - Lida com a exceção.
 * finally - Sempre é executado ndependente de ter ocorrido a exceção ou não.
 */
public class ExemploArithmeticExeption {
    public static void main(String[] args) {

        int totalNotas = (0);
        int quantidadeAlunos = 0;

        try {
            int media = totalNotas / quantidadeAlunos; // Divisão por zero.

            if (media >= 60) {
                System.out.println("Média dos Aluno: " + media + ". Aprovado!");
            } else {
                System.out.println("Média dos Aluno: " + media + ". Reprovado!");
            }

        } catch (/*Arithmetic*/Exception e) {
            System.out.println("Problema: Divisão por zero.");
        } finally {
            System.out.println("O programa terminou.");
        }
    }
}
