package PraticasCurso.NovosExercicios.POO;

public class AplicacaoCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        System.out.println(carro1.ExibirInfoCarro());
        System.out.println();

        Carro carro2 = new Carro("toyota", "Yaris");
        System.out.println(carro2.ExibirInfoCarro());
        System.out.println();

        Carro carro3 = new Carro("Honda", "Hr-v", 2021);
        System.out.println(carro3.ExibirInfoCarro());
        System.out.println();
    }
}
