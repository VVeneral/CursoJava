package PraticasCurso.NovosExercicios;

public class PrecedenciaOperadoresAtribuicao {
    public static void main(String [] args) {

        int numero = 5;

        System.out.println(++numero);  // pré-incremento:  imprime 6
        System.out.println(numero++);  // pós-incremento:  imprime 6, numero vira 7
        System.out.println(numero);    // imprime 7
        System.out.println(--numero);  // pré-decremento:  imprime 6
        System.out.println(numero--);  // pós-decremento:  imprime 6, numero vira 5
        System.out.println(numero);    // imprime 5
    }
}
