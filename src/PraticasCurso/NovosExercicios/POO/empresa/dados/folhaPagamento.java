package PraticasCurso.NovosExercicios.POO.empresa.dados;

import PraticasCurso.NovosExercicios.POO.empresa.dados.Funcionario;

// Praticas sobre pacotes.

public class folhaPagamento {
    public static void main(String [] args) {

        Funcionario funcionario = new Funcionario("Vinicius", 6500.00);
        System.out.println(funcionario.obterInfo());

        funcionario.aumentarSalario(1500);
        System.out.println(funcionario.obterInfo());
    }
}
