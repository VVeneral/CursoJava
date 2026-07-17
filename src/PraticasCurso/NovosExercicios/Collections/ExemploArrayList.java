package PraticasCurso.NovosExercicios.Collections;

/**
 * O QUE É:
 * Uma lista ordenada que permite repetição e acessa itens por posição(indice).
 *
 * COMO USAR:
 * List<String> ⇾ Tipo declarado.
 * ArrayList<> ⇾ Como ele faz.
 *
 * QUANDO USAR:
 * Quando a ordem importa ou pode ter repetição.
 *
 * MÉTODOS MAIS USADOS:
 * nomes.add("Carlos"); _______ adiciona no final.
 * nomes.add(1, "Diego"); _____ adiciona na posição 1.
 * nomes.get(0); ______________ pega o elemento da posição 0.
 * nomes.set(0, "Eduardo"); ___ substitui o elemento da posição 0.
 * nomes.remove("Ana"); _______ remove pelo valor.
 * nomes.remove(0); ___________ remove pela posição.
 * nomes.contains("Bruno"); ___ true/false, verifica se existe.
 * nomes.isEmpty(); ___________ true/false.
 * nomes.size(); ______________ quantidade de elementos.
 * nomes.clear(); _____________ apaga tudo.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args) {

        List<String> listas = new ArrayList<>();

        listas.add("objeto1");
        listas.add("objeto2");
        listas.add("objeto3");
        listas.add("objeto4");
        listas.add("objeto5");

        // Percorrendo lista com for:
        System.out.println("\n");
        for (String lista : listas) {
            System.out.println("Percorrendo lista com for: " + lista);
        }

        // Imprimindo lista
        System.out.println("\nLista: " + listas);
        System.out.println("Quantidade: " + listas.size());

        // Verificando se lista contém um elemento.
        if (listas.contains("objeto2")) {
            System.out.println("\nO objeto1 foi encontrado.");
        } else {
            System.out.println("\nNão contém");
        }

        // Adicionando todos os elementos de outra lista.
        List<String> listas2 = Arrays.asList("objeto6", "objeto7");
        listas.addAll(listas2);

        // Imprimindo lista, após addAll
        System.out.println("\nLista: " + listas);
        System.out.println("Quantidade: " + listas.size());

        // Removendo um elemento
        listas.remove("objeto7");

        // Imprimindo lista, após remove.
        System.out.println("\nLista: " + listas);
        System.out.println("Quantidade: " + listas.size());

        // Obtendo um elemento pelo índice
        String elemento = listas.get(3);
        System.out.println("Elemento do índice 3: " + elemento);

        // Limpando a lista
        listas.clear();

        // Imprimindo lista, após clear
        System.out.println("\nLista: " + listas);
    }
}
