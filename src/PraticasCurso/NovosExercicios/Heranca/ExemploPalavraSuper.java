package PraticasCurso.NovosExercicios.Heranca;

/*
 * SUPER
 *
 * Permite acessar membros da classe pai.
 *
 * Principais usos:
 *
 * 1 - Chamar o construtor da superclasse:
 *     super(...);
 *
 * 2 - Chamar um método da superclasse:
 *     super.metodo();
 *
 * Vantagem:
 * Reaproveitar código da classe pai sem duplicação.
 */

class Plantas {
    public String nome;
    public void produzirFrutos() {
        System.out.println("Produz frutos...");
    }
    Plantas(String nome) {
        this.nome = nome;
    }
}

class Cerejeira extends Plantas {
    public void produzirFrutos() {
        super.produzirFrutos();
        System.out.println("Produz cerejas...");
    }
    int quantidade;

    Cerejeira(String nome, int quantidade) {
        super(nome); //Chama construtor da superclasse planta
        this.quantidade = quantidade;
    }
}

public class ExemploPalavraSuper {
    public static void main(String[] args) {
        Cerejeira cerejas = new Cerejeira("Cerejeira", 5);
        System.out.println("Nome da planta: " + cerejas.nome);
        System.out.println("Nome da planta: " + cerejas.quantidade);
        cerejas.produzirFrutos();
    }
}