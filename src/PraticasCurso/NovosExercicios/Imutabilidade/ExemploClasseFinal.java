package PraticasCurso.NovosExercicios.Imutabilidade;

/**
 * CLASSE FINAL
 *
 * - Não pode ser herdada.
 */

public final class ExemploClasseFinal {
    public static void main(String[] args) {

//        class NovoExemploClasseFinal extends ExemploClasseFinal {
//
//        }

        // ERRO
    }

    /**
     * Quando isso é usado?
     *
     * Quando o desenvolvedor quer impedir alterações na lógica daquela classe.
     * A própria classe String é final.
     *
     * Por quê?
     *
     * Imagine se alguém pudesse fazer:
     *
     * class MinhaString extends String {
     * }
     */
}
