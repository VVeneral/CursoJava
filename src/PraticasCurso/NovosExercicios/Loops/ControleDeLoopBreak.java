package PraticasCurso.NovosExercicios.Loops;

public class ControleDeLoopBreak {
    public static void main(String[] args) {
        // CONTROLE DE LOOP com BREAK: Palavra que interrompe imediatamente um loop.
        // Usado com For, While e Do-While
        // QUANDO USAR O BREAK:
        // - Encontrou elemento procurado.
        // - Usuario digitou "sair".
        // - Ocorreu um erro.
        // - Atingiu uma condição especial.

        // For com break
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                System.out.println("Break interrompeu");
                break;
            }
            System.out.println(i);
        }
        System.out.println("\n");

        // Econtrar número em uma lista
        int[] numeros = {51,13,15,0,48,31,27,5,6,19};

        for (int numero : numeros) {
            if (numero == 15) {
                System.out.println("Encontrei: " + numero);
                break;
            }
        }
        System.out.println("\n");

        //Swith com break
        int opcao = 2;

        switch (opcao) {
            case 1:
                System.out.println("Cadastrar");
                break;
            case 2:
                System.out.println("Consultar");
                break;
            case 3:
                System.out.println("Remover");
                break;
        }
    }
}
