package PraticasCurso.Entidades;

public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double novoSalario() {
        return salarioBruto - taxa;
    }

    public void calcularPorcentagem(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }
    public String toString () {
        return "ConstrutoresFuncionario: "+ nome +", $ " + String.format("%.2f", novoSalario());

    }

}