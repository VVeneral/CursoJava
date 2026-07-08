package PraticasCurso.NovosExercicios.Imutabilidade;

/**
 * ENUM
 *
 * Cria um conjunto fixo de constantes.
 * Evita Strings inválidas. Muito usado para representar estados.
 *
 * Exemplo:
 *
 * AGENDADO
 * EXECUTANDO
 * FINALIZADO
 * ERRO
 */

public class ExemploEnum {

public enum SituacaoNota {
    PENDENTE,
    ENVIADA,
    PROCESSANDO,
    ERRO,
    CANCELADA
}

    public static void main(String[] args) {

    SituacaoNota statusPagamento = SituacaoNota.ENVIADA;

        switch (statusPagamento) {
            case PENDENTE:
                System.out.println("Nota pendente");
                break;
            case ENVIADA:
                System.out.println("Enviada com sucesso");
                break;
            case PROCESSANDO:
                System.out.println("Processando. Aguarde!");
                break;
            case ERRO:
                System.out.println("Erro. tente novamente");
                break;
            case CANCELADA:
                System.out.println("Cancelada. tente novamente");
            break;
        }
    }
}
