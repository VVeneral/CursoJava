package PraticasCurso.NovosExercicios.Loops;

public class While {
    public static void main(String[] args) {

        // LOOP - WHILE: Usado quando não sabe quantas vezes vai repeter.

        // contando de 1 a 5
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println("\n");

        // Contador regressivo
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }
        System.out.println("\n");

        // Contador a cada dois
        int k = 0;
        while (k <= 10) {
            System.out.println(k);
            k += 2;
        }
        System.out.println("\n");

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int x = 0;
        while (x < numeros.length) {
            System.out.println("Indicie " + x + ": numero " +numeros[x]);
            x++;
        }



    }
}
