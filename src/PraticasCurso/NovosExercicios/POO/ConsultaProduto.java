package PraticasCurso.NovosExercicios.POO;

public class ConsultaProduto {
    public static void main(String [] args) {

        Produto produto = new Produto(
            "Detergente",
            1.99,
            50);

        System.out.println(produto.obterInfoProduto());
    }
}
