package PraticasCurso.NovosExercicios.Exeptions;

/**
 * ARRAYINDEXOFBOUNDSEXCEPTION
 * Quando tentamos acessar um índice de matriz fora dos limites
 */

public class ExemploArrayIndexOfBoundsException {
    public static void main(String[] args) {

        try {
            int[] numeros = {1, 2, 3};

            System.out.println(numeros[4]);
        } catch (/*ArrayIndexOutOfBounds*/Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Programa finalizado com ou sem problemas!");
        }
    }
}
