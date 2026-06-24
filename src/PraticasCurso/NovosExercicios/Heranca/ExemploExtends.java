package PraticasCurso.NovosExercicios.Heranca;

/*
* HERNAÇA (extends)
*
* A herança permite que uma classe reutilize os atributos e métodos de outra.
* A classe que herda é chamada SUBCLASSE (classe filha).
* A classe que fornece os atributos e métodos é chamado de SUPERCLASSE (classe pai).
*
*  Sintaxe:
* class Funcionario extends SerHumano {}
* O Funcionario passa a possuir tudo que existe em SerHumano
* Além de poder criar os seus próprios métodos e atributos.
*
* A herança representa uma relação "É UM".
*
* Exemplo:
* Cachorro É UM Animal.
* Funcionario É UM SerHumano.
* Carro É UM veiculo.
*
* Principal vantagem:
* Evita repetir código e facilita a organização do sistema.
*
*/

class SerHumano {
    String nome;
    int idade;
    String sexo;

    public void dormir(){
            System.out.println("Dormindo...");
        }
}

class Funcionario extends SerHumano {
    Double salario;
    int registro;
    String cargo;

    public void trabalhar() {
            System.out.println("Trabalhando...");
        }
        public String obterInfoFunc() {
        return "Funcionario: " + nome
            + "\nIdade: " + idade
            + "\nSexo: " + sexo
            + "\nCargo: " + cargo
            + "\nRegistro: " + registro
            + "\nSalario: " + salario;
        }
    }

public class ExemploExtends {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario();
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
    }
}

