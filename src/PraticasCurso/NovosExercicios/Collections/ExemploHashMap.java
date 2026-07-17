package PraticasCurso.NovosExercicios.Collections;

/**
 * O QUE É:
 * Guarda pares de chave e valor.
 * Cada chave é unica e aponta para um valor.
 *
 * COMO USAR:
 * Map<String, Integer> ⇾ Tipo declarado.
 * HashMap<> ⇾ Como ele faz.
 *
 * QUANDO USAR:
 * Quando precisar associar uma coisa a outra rapidamente.
 * Se necessário manter a ordem de inserção, usasse: LinkedHashSet
 * Se necessaŕio ordenar alfabetico ou númerico, usasse: TreeSet.
 *
 * MÉTODOS MAIS USADOS:
 * idades.put("Carlos", 40); ______ adiciona ou atualiza
 * idades.get("Ana"); _____________ pega o valor da chave "Ana"
 * idades.remove("Bruno"); ________ remove pela chave
 * idades.containsKey("Ana"); _____ true/false, existe essa chave?
 * idades.containsValue(40); ______ true/false, existe esse valor?
 * idades.isEmpty(); ______________ true/false
 * idades.size(); _________________ quantidade de pares
 * idades.clear(); ________________ apaga tudo
 */
import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
    public static void main(String[] args) {
        Map<String, Integer> mapas = new HashMap<>();

        mapas.put("Kelly", 27);
        mapas.put("Vinicius", 31);
        mapas.put("Carolyne", 32);

        System.out.println("\n");
        // contando
        System.out.println("quantidade: " + mapas.size() + "\n");

        // Percorrendo mapa com for(chave e valor)
        for (Map.Entry<String, Integer> entry : mapas.entrySet()) {
            System.out.println("Nome: " + entry.getValue() + " - Idade: " + entry.getKey());
        }
        System.out.println("\n");
        // Percorrendo mapa com for(chave)
        for (String nome : mapas.keySet()) {
            System.out.println("Nome: " + nome);
        }
        System.out.println("\n");
        // Percorrendo mapa com for(valor)
        for (Integer idade : mapas.values()) {
            System.out.println("Idade: " + idade);
        }

        System.out.println("\n");
        // Verificando se mapa contém uma chave
        if (mapas.containsKey("Barbosa")) {
            System.out.println("Contém !\n");
        } else {
            System.out.println("Não contém\n");
        }

        // Adicionando maisd elementos
        mapas.put("Guilerme", 28);
        mapas.put("Vitoria", 13);

        // Percorrendo mapa com for após adiconar mais 2 elementos (chave e valor)
        for (Map.Entry<String, Integer> entry : mapas.entrySet()) {
            System.out.println("Nome: " + entry.getValue() + " - Idade: " + entry.getKey());
        }

        // Removendo elemento
        mapas.remove("Vinicius", 31);

        // Imprimindo mapas após remoção.
        System.out.println("\nMapas após rmeoção: " + mapas);

    }
}
