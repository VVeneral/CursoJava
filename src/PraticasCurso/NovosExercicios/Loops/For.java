package PraticasCurso.NovosExercicios.Loops;

public class For {
    public static void main(String[] args) {

        // LOOP - FOR: repete o ‘loop’, acrescentando i, até i atender a condição.
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("\n"); // pular linha no terminal

        // Pulando a cada dois
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("\n"); // pular linha no terminal

        // Contagem regressiva
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("\n"); // pular linha no terminal

        // Usando com Arrays
        int[] numeros = {1,2,3,4,5,};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Indicie " + i + ": numero " + numeros[i]);
        }
    }
}
