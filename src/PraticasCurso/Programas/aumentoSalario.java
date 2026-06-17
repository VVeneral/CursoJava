package PraticasCurso.Programas;

import java.util.Locale;
import java.util.Scanner;

import PraticasCurso.Entidades.Funcionario;

public class aumentoSalario {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        funcionario.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: ");
        funcionario.taxa = sc.nextDouble();

        System.out.println(funcionario);
        System.out.println("Qual a porcentagem de aumento salarial: ");
        double porcentagem = sc.nextDouble();

        funcionario.calcularPorcentagem(porcentagem);

        System.out.println("Dados atualizados: " + funcionario);

        sc.close();
    }

}