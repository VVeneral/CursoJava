package PraticasCurso.NovosExercicios.Arrays.Exercicios;

import java.util.Arrays;

public class SomaDeNumeros {
    public static void main(String[] args) {

        int[] numeros = new int[1000];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println("Soma dos Numeros: " + soma);
    }
}
