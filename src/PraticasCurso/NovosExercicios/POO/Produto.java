package PraticasCurso.NovosExercicios.POO;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nomeinit, double precoInit, int quantidadeEmEstoqueInit) {
        nome = nomeinit;
        preco = precoInit;
        quantidadeEmEstoque = quantidadeEmEstoqueInit;
    }
    public String obterInfoProduto() {
        return "Nome do produto: " + nome
            + "\nPreço da unidade: R$" + preco
            + "\nQuantidade em estoque: " + quantidadeEmEstoque;
    }
}
