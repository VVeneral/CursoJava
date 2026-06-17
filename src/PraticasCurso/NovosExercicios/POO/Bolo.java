package PraticasCurso.NovosExercicios.POO;

public class Bolo {

    int quantiadeAcucar;

    /**
     * Nesse exemplo de POO entendemos como funciona a classe:
     * Objeto ou instãncia é o Bolo.
     * classe é a receita.
     * variavel de instãncia é o atributo de objeto.     *
     */

    public static void main(String[] args) {
        Bolo boloDeMorango = new Bolo();
        boloDeMorango.quantiadeAcucar = 100;

        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.quantiadeAcucar = 60;

        System.out.println("Quantiade de açucar na receita: "
            + boloDeMorango.quantiadeAcucar + "g");
        System.out.println("Quantiade de açucar na receita: "
            + boloDeChocolate.quantiadeAcucar + "g");
    }
}
