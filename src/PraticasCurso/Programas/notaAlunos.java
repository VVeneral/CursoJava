package PraticasCurso.Programas;

import java.util.Locale;
import java.util.Scanner;

import PraticasCurso.Entidades.Estudante;
import PraticasCurso.Entidades.Pessoa;

public class notaAlunos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estudante estudante = new Estudante();
        Pessoa pessoa = new Pessoa();

        System.out.print("Nome do Aluno: ");
        while (true) {
            try {
                pessoa.setNome(sc.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
        System.out.print("Nota I: ");
        estudante.setNotaI(sc.nextDouble());

        System.out.print("Nota II: ");
        estudante.setNotaII(sc.nextDouble());

        System.out.print("Nota III: ");
        estudante.setNotaIII(sc.nextDouble());

        System.out.printf("Nota final: %.2f%n", estudante.notaFinal());
        System.out.println("Nome: " + pessoa.getNome());

        if (estudante.reprovado()) {
            System.out.println("Reprovado");
            System.out.printf("%.2f pontos faltantes%n", estudante.notaFaltante());
        }
        sc.close();

    }

}