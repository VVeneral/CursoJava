package PraticasCurso.NovosExercicios.Generics;


class CLiente2 {
    private String nome;

    public CLiente2(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}

class Pedido2 {
    private int numero;

    public Pedido2(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
}

public class ExemploGenerics<T> {
    private T registro;

    public void guardar(T registro) {
        this.registro = registro;
    }
    public T pegar() {
        return registro;
    }

    public static void main(String[] args) {

        //Caixa de pedido
        ExemploGenerics<Pedido2> caixaPedido = new ExemploGenerics<>();
        ExemploGenerics<CLiente2> caixaCliente = new ExemploGenerics<>();

        caixaPedido.guardar(new Pedido2(433434));
        Pedido2 pedido = caixaPedido.pegar();
        System.out.println("Pedido cliente: " + pedido.getNumero());

        caixaCliente.guardar(new CLiente2("Lanches lanchosos"));
        CLiente2 cliente = caixaCliente.pegar();
        System.out.println("Nome cliente: " + cliente.getNome());
    }
}
