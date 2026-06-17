package PraticasCurso.NovosExercicios.POO;

public class Carro {
    private String marcaDoCarro;
    private String modeloDoCarro;
    private int anoDoCarro;

    public Carro() {
        this.marcaDoCarro = "Desconhecida";
        this.modeloDoCarro = "Desconhecido";
        this.anoDoCarro = 0;
    }
    public Carro(String marcaDoCarro, String modeloDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
    }
    public Carro(String marcaDoCarro, String modelo, int anoDoCarro) {
        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modelo;
        this.anoDoCarro = anoDoCarro;
    }

    public String ExibirInfoCarro() {
        return "Marca do carro: " + marcaDoCarro
                +"\nModelo do carro: " + modeloDoCarro
                +"\nAno do carro: " + anoDoCarro;
    }
}
