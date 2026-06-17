package PraticasCurso.NovosExercicios.POO;

public class ConcessionariaCarros {
    // Atributos de Instâcia (cada carro tem o seu)
    public String marca;
    public String modelo;
    public String cor;

    // Atributo estático (pertence à concessionária inteira)
    public static int totalVendidos  = 0;

    // Construtor
    public ConcessionariaCarros(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        totalVendidos++; // a cada venda, incrementa.
    }

    // Método de instância (depende do objeto)
    public void exibirDetalhes() {
        System.out.println(marca + " " + modelo + " " + cor);
    }
    // método estático (não depende de nenhum carro específico)
    public static void exibirTotalVendidos() {
        System.out.println("total vendidos: " + totalVendidos);
    }
}


