package PraticasCurso.NovosExercicios.Exeptions;

/**
 * LANÇANDO EXCEPTION PROPOSITALMENTE
 * é possível lançar um exception propositalmente com o 'throw' quando
 * precisa indicar que ocorreu um erro em uma condição especifica
 * durante a execução do programa.
 */

public class ExemploExceptionProposital {
    public static void main(String[] args) {

        int idade = 18;

        if (idade < 18) {
            throw new RuntimeException("Idade deve ser 18 anos ou mais!");
        }
        System.out.println("Idade valida!: " + idade + " anos");
    }
}
