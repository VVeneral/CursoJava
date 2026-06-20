package PraticasCurso.NovosExercicios.Heranca;

public class TesteHeranca {
    public static void main(String[] args) {

        ExemploExtends.Funcionario func1 = new ExemploExtends.Funcionario();
        double horarioAtual = 17.30;

        double horarioInicio = 8;
        double horarioFinal = 18;

        func1.nome = "Joao";
        func1.idade = 32;
        func1.sexo = "Masculino";
        func1.salario = 4.800;
        func1.registro = 6;
        func1.cargo = "Torneiro";

        if (horarioAtual >= horarioInicio && horarioAtual <= horarioFinal) {
            func1.trabalhar();
        } else {
            func1.dormir();
        }

        System.out.println(func1.obterInfoFunc());

        System.out.println("\n"); // pular linha no terminal

        ExemploSobrescrita.Cachorro bilu = new ExemploSobrescrita.Cachorro();

        bilu.fazerSom();
    }
}
