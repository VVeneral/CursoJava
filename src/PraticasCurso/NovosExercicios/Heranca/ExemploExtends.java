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

public class ExemploExtends {
    static class SerHumano {
        String nome;
        int idade;
        String sexo;

        public void dormir() {
            System.out.println("Dormindo...");
        }
    }

    static class Funcionario extends SerHumano {
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

}

