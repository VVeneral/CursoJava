package PraticasCurso.NovosExercicios.Arrays;

public class ForEach {
    public static void main(String[] args) {
        // O QUE É UM FOR-EACH?

        // O for-each é uma forma melhorada de escrever um for, quando se quer ler os elementos.
        // FOR TRADICIONAL
        int[] numeros = {1, 2, 3, 4, 5};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ExemploFor tradicional: " + numeros[i]);
        }
        // ExemploFor: controla tudo.
        // Começa com 0
        // termina em length.
        // Incrementa i.
        // acessa [i].

        // FOR-EACH
        System.out.println("\n");

        for (int numero : numeros) {
            System.out.println("ExemploFor-each: " + numero);
        }
        // COMO SE LÊ: Para cada "numero" dentro de "numeros", faça...
        // primeira volta: 1
        // segunda volta: 2
        // terceira volta: 3...

        // QUANDO USAR FOR & FOR-EACH
        String[] nomes = {"Ana", "João", "Guto"};
        System.out.println("\n");

        // FOR: Usar quando precisar do indicie[i]
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }
        System.out.println("\n");
        //FOR-EACH: Usar quando só quer ler os elementos.
        for (String nome : nomes) {
            System.out.println("Nomes: " + nome);
        }
    }
}
