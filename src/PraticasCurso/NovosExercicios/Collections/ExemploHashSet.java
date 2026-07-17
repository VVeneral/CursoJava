package PraticasCurso.NovosExercicios.Collections;

/**
 * O QUE É:
 * Conjunto de valores sem repetição e sem ordem garantida.
 * Ignora valor repetido, mantendo apenbas um.
 *
 * COMO USAR:
 * Set<String> ⇾ Tipo declarado.
 * HashSet<> ⇾ Como ele faz.
 *
 * QUANDO USAR:
 * Quando precisar garantir nã oter duplicadas.
 * Se necessário manter a ordem de inserção, usasse: LinkedHashSet
 * Se necessaŕio ordenar alfabetico ou númerico, usasse: TreeSet.
 *
 * MÉTODOS MAIS USADOS:
 * conjunto.add("Ana"); _______ adiciona.
 * nomes.remove("Ana"); _______ remove.
 * nomes.contains("Ana"); _____ true/false, verifica se existe.
 * nomes.isEmpty(); ___________ true/false, se está vazio.
 * nomes.size(); ______________ quantidade de elementos.
 * nomes.clear(); _____________ apaga tudo.
 */
import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();

        // Adicionando elementos
        nomes.add("Kelly");
        nomes.add("Divino");
        nomes.add("Berenice");
        nomes.add("Carolyne");
        nomes.add("Vinicius");
        nomes.add("Guilherme");
        nomes.add("Vitoria");
        nomes.add("Viviane");
        nomes.add("Agnaldo");

        // percorrendo todos os elementos com for:
        System.out.println("\n");
        for (String nome : nomes) {
            System.out.println("Percorrendo elementos com for: " + nome);
        }

        // Imprimindo nomes inteiro.
        System.out.println("\nConjunto: " + nomes);
        System.out.println("Conjunto: " + nomes.size());
        // Verificando se nomes contém um elemento.
        System.out.println("\nVerificando sem tem o nome 'Kelly': " + nomes.contains("Kelly"));
        // Removendo 2 elemento
        nomes.remove("Vinicius");
        // Imprimindo nomes inteiro.
        System.out.println("\nConjunto após remoção de 'Vinicius': " + nomes);
        System.out.println("Conjunto: " + nomes.size());
        // Tentando adicionar um elemento duplicado
        boolean elementoDuplicado = nomes.add("Kelly");
        System.out.println("\nO elemento foi a adicionado? " +  elementoDuplicado);
        // Limpando o nomes
        nomes.clear();
        // Imprimindo nomes inteiro.
        System.out.println("\nConjunto após limpeza: " + nomes);

        Set<Integer> idades = new HashSet<>();

        idades.add(27);
        idades.add(52);
        idades.add(47);
        idades.add(32);
        idades.add(31);
        idades.add(28);
        idades.add(13);
        idades.add(41);
        idades.add(48);

        // percorrendo todos os elementos com for:
        System.out.println("\n");
        for (Integer idade : idades) {
            System.out.println("Percorrendo elementos com for: " + idade);
        }

        // Imprimindo idades inteiro.
        System.out.println("\nIdades: " + idades);
        System.out.println("Idades: " + idades.size());

        TreeSet<Integer> numeros = new TreeSet();

        numeros.add(1);
        numeros.add(3);
        numeros.add(13);
        numeros.add(15);
        numeros.add(12);

        // Imprimindo numeros usando TreeSet.
        System.out.println("\nOrdenando numeros com TreeSet: " + numeros);

        LinkedHashSet<String> ordemInsert = new LinkedHashSet<>();

        ordemInsert.add("Ana");
        ordemInsert.add("Célia");
        ordemInsert.add("Daniel");
        ordemInsert.add("Abner");
        ordemInsert.add("Felipe");

        // Imprimindo ordemInsert usando LinkedHashSet.
        System.out.println("\nMantendo ordem de inserção com LinkedHashSet: " + ordemInsert);
    }
}
