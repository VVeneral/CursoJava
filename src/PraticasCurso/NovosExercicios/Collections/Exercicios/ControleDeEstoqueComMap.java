package PraticasCurso.NovosExercicios.Collections.Exercicios;

import java.util.HashMap;
import java.util.Map;

public class ControleDeEstoqueComMap {
    public static void main(String[] args) {

        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("C001", 10);
        estoque.put("C002", 10);
        estoque.put("L001", 10);
        estoque.put("I001", 10);

        // Verificando quantidade
        String codigo = "C001";
        int quantidade = estoque.get(codigo);
        System.out.println("Codigo: " + codigo + " - Quantidade: " + quantidade);

        // Removendo quantidade
        String codigo2 = "C002";
        int quantidadeSubtraida = 5;

        int quantidadeAtual = estoque.get(codigo2);
        estoque.put(codigo2, quantidadeAtual - quantidadeSubtraida);

        System.out.println("Quantidade de C002 após remoção: " + estoque.get(codigo2));
    }

}
