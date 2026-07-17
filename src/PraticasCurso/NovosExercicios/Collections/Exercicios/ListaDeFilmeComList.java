package PraticasCurso.NovosExercicios.Collections.Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ListaDeFilmeComList {
    public static void main(String[] args) {

        List<String> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add("Pinóquio");
        listaDeFilmes.add("Lula - Filho do Brasil");
        listaDeFilmes.add("Dark Horse");
        listaDeFilmes.add("Frida");
        listaDeFilmes.add("Cazuza");

        // Imprimindo lista de filmes com for
        for (String filme : listaDeFilmes) {
            System.out.println("Lista de Filmes: " + filme);
        }

        // Verificando se tem filme
        String contemFilme = "Frida 2";
        if (listaDeFilmes.contains(contemFilme)) {
            System.out.println("Contém o filme: " + contemFilme);
        } else {
            System.out.println(" Não ontém o filme desejado.");

        }
    }
}
