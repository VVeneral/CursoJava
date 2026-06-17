package PraticasCurso.NovosExercicios;

public class DiasNoMes {
    public static void main(String [] args) {

        String mes = "Fevereiro";
        String diasNoMes = switch(mes) {
            case "Janeiro","Março","Maio","Julho","Agosto","Outubro","Dezembro" -> "Meses com 31 dias";
            case "Abril","Junho","Setembro","Novembro" -> "Meses com 30 dias";
            case "Fevereiro" -> "Mês com 28 dias";
            default -> "Mês desconhecido";
        };
        System.out.println(diasNoMes);
    }
}
