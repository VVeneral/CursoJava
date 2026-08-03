package PraticasCurso.NovosExercicios.Exeptions;

/**
 * NULLPOINTEREXCEPTION
 * Ocorre quando tentamos usar um objeto quando não foi inicializado. Apenas foi declarado, mas não existe.
 */

public class ExemploNullPointerExeception {
    public static void main(String[] args) {

        String nome = null;

        try {
            int tamanhoNome = nome.length(); // Tentando acessar objeto nulo.
            System.out.println("Tamanho do nome: " + tamanhoNome);
        } catch (/*NullPointer*/Exception e ) {
            System.out.println("Erro: A variável 'nome' está nula!");
        } finally {
            System.out.println("Fim do programa!");
        }
    }
}
