package PraticasCurso.NovosExercicios.Imutabilidade;

/**
 * FINAL
 *Variável final
 * - recebe um valor apenas uma vez.
 */

public class ExemploVariavelFinal {
    static void main() {
        // Pode ser usado por:
        // criação de nota fiscal.
        // cpfs/cnpjs
        final int idade = 31;
        System.out.println(idade);

        // idade = 30;
        // ERRO, pois a variavel idade é final
        System.out.println(idade);

        /**
         * No trabalho, essa situação pode aparecer:
         *
         * Imagine uma nota fiscal, onde a chave de acesso nunca deve mudar.
         * IMmagine um cadastro onde o cpf/cnpj também não pdoe sewr alterado.
         */
    }
}

