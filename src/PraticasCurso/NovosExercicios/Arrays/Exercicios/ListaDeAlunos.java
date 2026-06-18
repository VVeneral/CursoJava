package PraticasCurso.NovosExercicios.Arrays.Exercicios;

public class ListaDeAlunos {
    public static void main(String[] args) {

        double[] notas = {8.0, 7.5, 9.9, 6.8, 5.2, 4.7, 7.1, 6.9, 8.0, 6.2};
        for( int i = 0; i < notas.length; i++) {
            System.out.print(" Nota " + notas[i] + " -");
        }
    }
}
