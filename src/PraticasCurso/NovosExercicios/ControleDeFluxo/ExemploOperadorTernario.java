package PraticasCurso.NovosExercicios.ControleDeFluxo;

public class ExemploOperadorTernario {
    /**
     * OPERADOR TERNARIO
     *
     * É uma forma concisa de escrever uma instrução if-else em uma unica linha.
     * */
    public static void main(String[] args) {

        int numero = 20;

        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println(resultado);
    }
}
