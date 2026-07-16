package PraticasCurso.NovosExercicios.ControleDeFluxo;

/**
 * IF
 *
 * É uma estrutura de decisão usada para executar um bloco de código se a condição for verdadeira.
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
        // EXEMPLO 1
        if (condicao = true) {
            System.out.println("Condicao verdadeira");
        } else {
            System.out.println("Condicao falha");
        }

        // EXEMPLO 2
        double peso = 27.5;
        double metadeDoPeso = 27.5;

        if (peso < metadeDoPeso) {
            System.out.println("Leve");
        } else if (peso == metadeDoPeso) {
            System.out.println("Peso igual");
        }  else {
            System.out.println("Pesado");
        }

        System.out.printf("\n");

        // EXEMPLO 3
        int idadeMinima = 18;
        int idadePessoa = 15;
        int idadeAcompanhante = 19;
        Boolean acompanhado = false;

        if (idadePessoa >= idadeMinima) {
            System.out.println("Pode entrar");
        } else if (idadePessoa <= idadeMinima && idadeAcompanhante >= idadeMinima && acompanhado == true) {
            System.out.println("Com acompanhante maior de idade. Pode entrar");
        } else {
            System.out.println("Sem acompanhante maior de idade ou acompanhando e menor de idade. " +
                                "Não pode entrar!.");
        }


    }
}
