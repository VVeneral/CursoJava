package PraticasCurso.NovosExercicios.POO;

public class AplicacaoPessoa {
    public static void main (String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Joao";
        pessoa.setIdade(15);
        pessoa.setEndereco("Rua dos Ypês");
        pessoa.setTelefone("(44)9988-75441");

        System.out.println(pessoa.infoPessoa());

    }
}
