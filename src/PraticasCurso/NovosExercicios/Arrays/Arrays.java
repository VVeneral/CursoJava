package PraticasCurso.NovosExercicios.Arrays;

public class Arrays {
    public static void main(String[] args) {

        // O QUE É UM ARRAY?
        // Método que guarda vários valores do mesmo tipo.

        // Criando
        int[] numeros;

        numeros = new int[3];
        Double[] decimais = new Double[4];
        // Preenchendo numeros
        numeros[0] = 8;
        numeros[1] = 14;
        numeros[2] = 6;
        // Preenchendo decimais
        decimais[0] = 5.5;
        decimais[1] = 6.1;
        decimais[2] = 15.15;
        decimais[3] = 1.02;
        // Lendo o valor - numeros
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2] + "\n");
        // Lendo o valor - decimais
        System.out.println(decimais[0]);
        System.out.println(decimais[1]);
        System.out.println(decimais[2]);
        System.out.println(decimais[3]);

        // OUTRA FORMA
        // Criando e preenchendo
        int[] numeros2 = {1, 5, 6};
        double[] decimais2 = {0.1, 1.5, 0.6};

        // Lendo o valor - numeros
        System.out.println("\n" + numeros2[0]);
        System.out.println(numeros2[1]);
        System.out.println(numeros2[2] + "\n");
        // Lendo o valor - decimais
        System.out.println(decimais2[0]);
        System.out.println(decimais2[1]);
        System.out.println(decimais2[2]);

    /*
    TODO ARRAY POSSUI:
    - Indices que começam com 0.
    - Tamanho acessado por length.
    */

     //Lendo listas com length

        System.out.println("\nLendo tamanho das listas numeros com length\n"
        + numeros.length);

    System.out.println("\nLendo tamanho das listas decimais com length\n"
        + decimais.length);

    }
}
