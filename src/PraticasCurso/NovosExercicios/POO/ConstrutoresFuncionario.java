package PraticasCurso.NovosExercicios.POO;

// CONSTRUTOR - PODE SER USADO DAS DUAS FORMAS ABAIXO:
public class ConstrutoresFuncionario {
    String nome;
    String cargo;
    int idade;
//    // PRIMEIRA FORMA
//    public ConstrutoresFuncionario(String nomeInt, String cargoInt, int idadeInt) {
//        nome = nomeInt;
//        cargo = cargoInt;
//        idade = idadeInt;
//    }
    // SEGUNDA FORMA
    public ConstrutoresFuncionario() {
    }

    public static void main(String[] args) {
//// PRIMEIRA FORMA
//        ConstrutoresFuncionario funcionario = new ConstrutoresFuncionario("Maria", "Gerente", 43);
//
//        System.out.println("Nome do funcionario: " + funcionario.nome);
//        System.out.println("Cargo do funcionario: " + funcionario.cargo);
//        System.out.println("Idade do funcionario: " + funcionario.idade);

        // SEGUNDA FORMA
        ConstrutoresFuncionario funcionario1 = new ConstrutoresFuncionario();

        funcionario1.nome = "Inocencio";
        funcionario1.cargo = "Anjo estagiario na terra";
        funcionario1.idade = 31;

        ConstrutoresFuncionario funcionario2 = new ConstrutoresFuncionario();
        funcionario2.nome = "Kelly amor meu";
        funcionario2.cargo = "Gerente dos meus pensamentos";
        funcionario2.idade = 27;

        ConstrutoresFuncionario funcionario3 = new ConstrutoresFuncionario();
        funcionario3.nome = "Felizbino";
        funcionario3.cargo = "Atendente";
        funcionario3.idade = 42;

        System.out.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade + "\n");

        System.out.println("Nome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade + "\n");

        System.out.println("Nome: " + funcionario3.nome);
        System.out.println("Cargo: " + funcionario3.cargo);
        System.out.println("Idade: " + funcionario3.idade);
    }
}

