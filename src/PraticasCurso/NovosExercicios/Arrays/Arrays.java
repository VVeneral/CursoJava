package PraticasCurso.NovosExercicios.Arrays;

public class Arrays {
    public static void main(String[] args) {

        // O QUE É UM ARRAY?
        // Método que guarda vários valores do mesmo tipo.

        // Criando
        int[] numeros;

        numeros = new int[3];
        // Preenchendo
        numeros[0] = 8;
        numeros[1] = 14;
        numeros[2] = 6;
        // Lendo o valor
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);

        // OUTRA FORMA
        // Criando e preenchendo
        double[] numeros2 = {0.1, 1.5, 0.6};
        // Lendo o valor
        System.out.println("\n" + numeros2[0]);
        System.out.println(numeros2[1]);
        System.out.println(numeros2[2]);
        // Alterando valores
        numeros2[0] = 1.15;
        // Lendo valor atualizado
        System.out.println("\nAlterando indice [0] de 0.1 para 1.15\n" + numeros2[0]);
        System.out.println(numeros2[1]);
        System.out.println(numeros2[2]);

    // TODO ARRAY POSSUI:
    // - Indicies que começam com 0.
    // - Tamanho acessado por length.

    // Lendo listas com length
    System.out.println("\nLendo tamanho das listas com length\n"
            + numeros.length);
    System.out.println(numeros2.length);
    }

}
