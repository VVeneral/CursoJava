package PraticasCurso.NovosExercicios;

public class ExercicioNotaAlunos {
    public static void main(String[] args) {

        System.out.println("\n---------  EXERCICIO 1  ---------");
        double nota1 = 5.5;
        double nota2 = 7.5;
        double mediaNota = (nota1 + nota2) / 2;
        String resultado;

        if (mediaNota >= 6.0) {
            resultado = "Aprovado";
        } else {
            resultado = "Reprovado";
        }
        System.out.println(resultado);

        System.out.println("\n---------  EXERCICIO 2  ---------");
        double nota3 = 5.5;
        double nota4 = 8.5;
        double mediaNota2 = (nota3 + nota4) / 2;

        int diasLetivos = 320;
        int diasFaltantes = 50;
        double frequencia = ((double)(diasLetivos - diasFaltantes) / diasLetivos) * 100;
        String resultado2;

        if (mediaNota2 >= 6.0 && frequencia < 80) {
            resultado = "Reprovado por falta. Frequência: " + frequencia + "%";
        } else if (mediaNota2 < 6.0 && frequencia >= 80) {
            resultado = "Reprovado por nota. Nota: " + mediaNota2;
        } else {
            resultado = "Aprovado";
        }
        System.out.println(resultado);
    }
}

