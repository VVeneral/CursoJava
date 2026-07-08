package PraticasCurso.NovosExercicios.Generics;

class Cliente {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}

class Pedido {
    private int numero;

    public Pedido (int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
}

public class ExemploObjectEInstanceOf {

    private Object registro;

    public void salvar(Object registro) {
        this.registro = registro;
    }
    public Object buscar() {
        return registro;
    }

    public static void main(String[] args) {
        /*
        Cliente c = new Cliente("Pedro");
        Pedido p = new Pedido(0261);

        System.out.println("Nome: " + c.getNome());
        System.out.println("Pedido: " + p.getNumero());
         */

        // PARA ARMAZENAR UM PEDIDO
        ExemploObjectEInstanceOf Pedido = new ExemploObjectEInstanceOf();
        Pedido.salvar(new Pedido(1001));

        // PARA ARMAZENAR O CLIENTE
        ExemploObjectEInstanceOf Cliente = new ExemploObjectEInstanceOf();
        Cliente.salvar(new Cliente("Vinicius"));

        if (Pedido.buscar() instanceof Pedido) {
            Pedido pedido = (Pedido) Pedido.buscar();
            System.out.println("Nº pedido: " + pedido.getNumero());
        }
        if (Cliente.buscar() instanceof Cliente) {
            Cliente cliente = (Cliente) Cliente.buscar();
            System.out.println("Nome: " + cliente.getNome());
        }
    }
}
