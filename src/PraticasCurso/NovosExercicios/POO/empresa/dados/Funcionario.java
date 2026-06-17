package PraticasCurso.NovosExercicios.POO.empresa.dados;


public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nomeInit, double salarioInit) {
        nome = nomeInit;
        salario = salarioInit;
    }
    public String obterInfo() {
        return "Nome: " + nome + "\nSalario: " + salario;
    }
    public void aumentarSalario(double aumento) {
        salario += aumento;
    }
    public void aumentoSalario(int porcentagem) {
        salario += salario + porcentagem / 100;
    }

}

