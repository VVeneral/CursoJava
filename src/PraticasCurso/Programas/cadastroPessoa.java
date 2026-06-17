package PraticasCurso.Programas;

import java.util.Locale;
import java.util.Scanner;

import PraticasCurso.Entidades.Pessoa;

public class cadastroPessoa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        System.out.print("===   CADASTRO DE PESSOA   ===\n");
        System.out.println("Digite seu nome: ");
        pessoa.setNome(sc.nextLine());

        System.out.println("Digite seu sobrenome: ");
        pessoa.setSobrenome(sc.nextLine());

        System.out.println("Digite seu ano de nascimento: ");
        pessoa.setAnoNascimento(sc.nextInt());

        System.out.println(pessoa);
        sc.close();
    }

}