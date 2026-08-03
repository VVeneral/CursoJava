package PraticasCurso.NovosExercicios.Exeptions;

/**
 * EXCEPTION EM MÉTODOS
 */

public class ExemploExceptionEmMetodos {
    public static int calcularMedia(int totalNotas, int quantidadeAlunos) throws Exception {
        return totalNotas / quantidadeAlunos;
    }

    public static void main(String[] args) {
        int totalMedia = 10;
        int quantidadeAlunos = 0;

        try {
            int media = calcularMedia(totalMedia, quantidadeAlunos);
            System.out.println("Média de Alunos: " + media);
        } catch (Exception e) {
            System.out.println("Erro: Divisão por zero! " + e.getMessage());
        } finally {
            System.out.println("Fim do programa!");
        }
    }
}
