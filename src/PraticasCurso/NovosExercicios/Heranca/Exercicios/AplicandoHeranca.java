package PraticasCurso.NovosExercicios.Heranca.Exercicios;


class Funcionario{

    private String nome;
    private Double salario;

    public Double ganhoAnual(){
        return salario * 12;
    }
    public void addAumento(double aumento){
        this.salario += aumento;
    }

    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

class Assistente extends Funcionario{
    @Override
    public Double ganhoAnual() {
        return super.ganhoAnual() + 1000;
    }
}

public class AplicandoHeranca {
    public static void main(String[] args) {
        Assistente assistente = new Assistente();

        assistente.setNome("Vinicius");
        assistente.setSalario(3600.0);
        assistente.addAumento(500);

        System.out.println("Nome da Assistente: " + assistente.getNome());
        System.out.println("Salário: " + assistente.ganhoAnual());
    }
}
