package PraticasCurso.NovosExercicios;

public class VerificacaoSwitchCase {
    public static void main(String[] args) {

        //Switch case - Expressão
        int dia = 8;

        switch (dia) {
            case 1 -> System.out.println("Segunda");
            case 2 -> System.out.println("Terça");
            case 3 -> System.out.println("Quarta");
            case 4 -> System.out.println("Quinta");
            case 5 -> System.out.println("Sexta");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Desconhecido");
        }

        //Switch case - Inicialização de variavel
        String dia2 = "terça";

        String diasDaSemana = switch(dia2) {
            case "segunda", "terça", "quarta", "quinta", "sexta" -> "Dia utíl";
            case "sábado", "domingo" -> "Final de semana";
            default -> "Desconhecido";
        };
        System.out.println(diasDaSemana);

        // EXERCICIOS
        int nivel = 5;

        switch (nivel) {
            case 1 -> System.out.println("Muito insatisfeito");
            case 2 -> System.out.println("Insatisfeito");
            case 3 -> System.out.println("Neutro");
            case 4 -> System.out.println("Satisfeito");
            case 5 -> System.out.println("Muito satisfeito");
            default -> System.out.println("Opção inválida, escolher entre 1 a 5");
        }
    }
}
