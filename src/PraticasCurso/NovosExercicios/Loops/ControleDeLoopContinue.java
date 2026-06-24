package PraticasCurso.NovosExercicios.Loops;

public class ControleDeLoopContinue {
    public static void main(String[] args) {
        // CONTROLE DE LOOP com CONTINUE: Pula a interação atual e vai para a próxima.
        // Também usado com ExemploFor, ExemploWhile e Do-ExemploWhile
        // QUANDO USAR O CONTINUE:
        // - Ignorar valores inválidos.
        // - Pular linhas vazias.
        // - Ignorar pares ou impar.
        // - validar dados antes de processar.

        // ExemploFor com continue
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println(" 5 - Pula interação");
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\n");

        //ExemploWhile com continue
        int j = 1;
        while (j <= 10) {
            if (j == 6) {
                System.out.println(" 6 - Pula interação");
            }
            j++;
            System.out.println(j);
        }
        System.out.println("\n");

        // lista com continue

        String[] alunos = {"ana", "", "Maria", "Felipe", "José", ""};

        for (String aluno : alunos) {
            if (aluno.isEmpty()) {
                continue;
            }
            System.out.println(aluno);
        }
    }
}
