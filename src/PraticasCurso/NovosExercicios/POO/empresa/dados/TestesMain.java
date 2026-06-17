package PraticasCurso.NovosExercicios.POO.empresa.dados;

import PraticasCurso.NovosExercicios.POO.ConcessionariaCarros;

public class TestesMain {
    public static void main(String[] args) {

        ConcessionariaCarros c1 = new ConcessionariaCarros("Toyota", "Yaris", "Branco");
        ConcessionariaCarros c2 = new ConcessionariaCarros("Honda", "Civic", "Preto");
        ConcessionariaCarros c3 = new ConcessionariaCarros("Hyundai", "Hb20", "Cinza");
        ConcessionariaCarros c4 = new ConcessionariaCarros("Chevrolete", "Sonic", "Branco");
        ConcessionariaCarros c5 = new ConcessionariaCarros("Volkswagem", "Gol", "Azul Marinho");

        // Método de instância - cada carro exibe os seus dados
        c1.exibirDetalhes();
        c2.exibirDetalhes();
        c3.exibirDetalhes();
        c4.exibirDetalhes();
        c5.exibirDetalhes();

        // Método estático - pertence a classe, não a um carro(objeto)
        ConcessionariaCarros.exibirTotalVendidos();
    }
}
