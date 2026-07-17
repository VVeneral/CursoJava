package PraticasCurso.NovosExercicios.Collections;

/**
 *
 */

import java.util.HashSet;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        // Adicionando elementos
        conjunto.add("Kelly");
        conjunto.add("Divino");
        conjunto.add("Berenice");
        conjunto.add("Carolyne");
        conjunto.add("Vinicius");
        conjunto.add("Guilherme");
        conjunto.add("Vitoria");
        conjunto.add("Viviane");
        conjunto.add("Agnaldo");

        // Imprimindo conjunto inteiro.
        System.out.println("\nConjunto: " + conjunto);

        // Verificando se conjunto contém um elemento.
        System.out.println("\nVerificando sem tem o nome 'Kelly': " + conjunto.contains("Kelly"));

        // Removendo 2 elemento
        conjunto.remove("Vinicius");

        // Imprimindo conjunto inteiro.
        System.out.println("\nConjunto após remoção de 'Vinicius': " + conjunto);

        // Tentando adicionar um elemento duplicado
        boolean elementoDuplicado = conjunto.add("Kelly");
        System.out.println("O elemento foi a adicionado? " +  elementoDuplicado);

        // Limpando o conjunto
        conjunto.clear();

        // Imprimindo conjunto inteiro.
        System.out.println("\nConjunto após limpeza: " + conjunto);
    }
}
