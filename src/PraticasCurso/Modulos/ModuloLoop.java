package PraticasCurso.Modulos;

public class ModuloLoop {
    public static void main(String[] args) {
        // imprime de 0 a 5
        for (int i = 0; i <= 5; i++) {    // for - quando sabe quantas vezes repetir
            System.out.println(i);
        }

        System.out.println(); // pular uma linha no terminal
        // imprime apenas pares de 2
        for (int a = 0; a <= 10; a++) {
            if (a % 2 == 0) {
                System.out.println(a);
            }
        }

        System.out.println();
        // soma numero de 1 a 10
        int total = 0;
        for (int b = 1; b <= 10; b++) {
            total = total + b;
        }
        System.out.println(total);

// - - - - - - - - - - WHILE - - - - - - - - - -

        System.out.println();
        // imprime -5 até 0
        int j = -5;
        while (j <= 0) {    // while - quando não sabe, repete até condição for verdade
            System.out.println(j);
            j++;
        }

        System.out.println();

        // imprime apenas pares de 2
        int k = 0;
        while (k <= 10) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        }

        System.out.println();

        // soma de 1 a 10
        int l = 1;
        int tot = 0;
        while (l <= 10) {
            tot = tot + l++;
        }System.out.println(tot);

    }
}