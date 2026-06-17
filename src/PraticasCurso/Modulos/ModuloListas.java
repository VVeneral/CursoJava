package PraticasCurso.Modulos;

import java.util.ArrayList;
import java.util.List;

public class ModuloListas {
    public static void main(String[] args) {
        /*
        LISTAS:
        tamanho dinâmicos.
        pode adicionar ou remover elementos após criar.

        TIPOS DO QUE A LISTA VAI GUARDAR:
        List<String> nomes = new ArrayList<>();   // só aceita String
        List<Integer> idades = new ArrayList<>(); // só aceita número inteiro
        List<Double> precos = new ArrayList<>();  // só aceita decimal

        METODOS MAIS USADOS:
        List<String> nome = new ArrayList<>();

        ADICIONA:
        nomes.add("Ana");
        nomes.add("Carlos");

        ACESSA PELA POSIÇÃO
        nomes.get(0);

        TAMANHO > 3:
        nomes.size();

        REMOVE POR VALOR
        nomes.remove("Ana");

        REMOVE POR POSIÇÃO
        nomes.remove(0);

        VERIFICA SE EXISTE > true
        nomes.contains("Carlos");
        */

        List<String> nomesFemininos = new ArrayList<>();
        nomesFemininos.add("Kelly");
        nomesFemininos.add("Vitoria");
        nomesFemininos.add("Caroline");
        nomesFemininos.add("Heloisa");

        System.out.println(nomesFemininos.contains("Kelly")); // verifica se tem nome kelly, retorna true
        System.out.println(nomesFemininos.contains("Maria")); // retorna false
        System.out.println(nomesFemininos.get(1)); // acessa pela posição na lista
        nomesFemininos.set(3, "Berenice"); // substitui nome por berenice

        for (String mostrarNomesF : nomesFemininos) {
            System.out.println(mostrarNomesF);
        }

        System.out.println("\n-----------------------------------------------");
        // Criando lista  -  String
        List<String> capitais = new ArrayList<>();
        // Adicionado
        capitais.add("Florianópolis");
        capitais.add("Curitiba");
        capitais.add("Goiânia");
        // Imprimindo com for each
        for (String mostrarCapitais : capitais){
            System.out.println(mostrarCapitais);
        }
        System.out.println("Tamanho da lista: " + capitais.size());
        System.out.println("\n-----------------------------------------------");
        // Removendo
        capitais.remove(2);
        // Imprimindo depois de remover
        for (String mostrarCapitais : capitais){
            System.out.println(mostrarCapitais);
        }
        System.out.println("Tamanho da lista: " + capitais.size());
        System.out.println("\n-----------------------------------------------");
        //Criando lista  -  Integer
        List<Integer> numeros = new ArrayList<>();
        //add
        numeros.add(1995);
        numeros.add(1993);
        numeros.add(1998);
        numeros.add(2013);
        // Imprimindo com for each
        for (Integer numerosInteiros : numeros) {
            System.out.println(numerosInteiros);
        }

        System.out.println("Tamanho da lista: " + numeros.size());
    }
}