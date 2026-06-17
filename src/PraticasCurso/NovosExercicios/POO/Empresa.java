package PraticasCurso.NovosExercicios.POO;

//Classe com construtor
public class Empresa {
    String nome;
    String ramo;
    int quantidadeFuncionario;
    int quantidadeCliente;

    Empresa(String nomeInit, String ramoInit, int quantidadeFuncionarioInit, int quantidadeClienteInt) {
        nome = nomeInit;
        ramo = ramoInit;
        quantidadeFuncionario = quantidadeFuncionarioInit;
        quantidadeCliente = quantidadeClienteInt;
    }

    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("Ferro&Aço", "Vergalhões", 112, 1678);
        Empresa empresa2 = new Empresa("Gelo Gelado", "Distribuição de gelo", 12, 87);

        System.out.println("Nome: " +  empresa1.nome);
        System.out.println("Ramo: " +   empresa1.ramo);
        System.out.println("qtd. Funcionarios: " + empresa1.quantidadeFuncionario);
        System.out.println("qtd. Cliente: " + empresa1.quantidadeCliente + "\n");
        
        System.out.println("Nome: " +  empresa2.nome);
        System.out.println("Ramo: " +   empresa2.ramo);
        System.out.println("qtd. Funcionarios: " + empresa2.quantidadeFuncionario);
        System.out.println("qtd. Cliente: " + empresa2.quantidadeCliente);

    }
}
