package PraticasCurso.NovosExercicios.Arrays.Exercicios;

public class ArrayComNumerosPares {

    public static void main(String[] args) {
        int[] numeros;
        numeros = new int[6];

        numeros[0] = 2;
        numeros[1] = 4;
        numeros[2] = 6;
        numeros[3] = 8;
        numeros[4] = 10;
        numeros[5] = 12;

        for (int numero : numeros) {
            System.out.print(" " + numero);
        }
    }
}