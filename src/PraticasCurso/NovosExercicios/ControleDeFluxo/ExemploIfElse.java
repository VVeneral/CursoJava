package PraticasCurso.NovosExercicios.ControleDeFluxo;

/**
 * IF
 *
 * É uma estrutura de decisão usada para executar um bloco de código.
 * Se a condição for verdadeira.
 *
 * ELSE
 *
 * Complementa o if.
 * Executa um bloco de código quando a condição do if for falsa.
 *
 * ELSE-IF
 *
 * Permite testar uma nova condição caso a condição anterior seja falsa.
 * Pode haver quantos else if forem necessários.
 */

public class ExemploIfElse {
    public static void main(String[] args) {
        boolean condicao = true;

        if (condicao = true) {
            System.out.println("Condicao verdadeira");
        } else {
            System.out.println("Condicao falha");
        }

        double peso = 27.5;
        double metadeDoPeso = 27.5;

        if (peso < metadeDoPeso) {
            System.out.println("Leve");
        } else if (peso == metadeDoPeso) {
            System.out.println("Peso igual");
        }  else {
            System.out.println("Pesado");
        }
    }

}
