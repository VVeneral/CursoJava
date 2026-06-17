package PraticasCurso.Modulos;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;


public class ModuloDataHora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        /*
        data-hora local -> Qualquer data sem fuso hórario, ex: aniversário, emissão de documentos.
        data-hora global -> Data com fuso hórario, momento que significa
        a mesma coisa para qualquer lugar no mundo
        */

        // LocalDate - só data, sem hora:
        LocalDate hoje = LocalDate.now();
        LocalDate nascimento = LocalDate.of(1995, 1, 20);
        System.out.println(hoje);
        System.out.println(nascimento);
        System.out.println("----------------------------------------"+"\n----------------------------------------");

        //LocalDateTime - data + hora, sem fuso:
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime evento = LocalDateTime.of(2026, 8, 27, 20, 0);
        System.out.println(agora);
        System.out.println(evento);
        System.out.println("----------------------------------------"+"\n----------------------------------------");

        //Instant - data-hora global com fuso (UTC):
        Instant agoraII = Instant.now();
        Instant instant = Instant.parse("2026-04-14T22:00:00Z");
        System.out.println(agoraII);
        System.out.println(instant);
        System.out.println("----------------------------------------"+"\n----------------------------------------");

        //Formatar para exibir:
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(fmt.format(LocalDate.now()));
        System.out.println("----------------------------------------"+"\n----------------------------------------");

        //Calcular diferença:
        LocalDate inicio = LocalDate.of(2025, 4, 14);
        LocalDate fim = LocalDate.of(2026, 4, 14);
        long dias = ChronoUnit.DAYS.between(inicio, fim);
        System.out.println(dias);
        System.out.println("----------------------------------------"+"\n----------------------------------------");

        System.out.println("\n-----   EXERCICIO   -----");

        // Formatação
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(fmt2.format(LocalDateTime.now()));
        System.out.println("----------------------------------------"+"\n----------------------------------------");

        //Calculando dia
        LocalDate hoje2 = LocalDate.now();
        LocalDate aniversario = LocalDate.of(2026, 8, 27);
        long x = ChronoUnit.DAYS.between(hoje2, aniversario );
        System.out.println("Faltam " + x + " dias para o aniversário.");
    }
}