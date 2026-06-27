package PraticasCurso.NovosExercicios.Imutabilidade;

/**
 * MÉTODO FINAL
 *
 * - não pode ser sobrescrito pelas classes filhas.
 */
class Animal {
    public final void respirar() {  // Como a atributo respirar esta como final, o memso não pode sofre um o
                                    // verride ao seu chamado por uma classe filha.
        System.out.println("Animal respirando");
    }
}

public class ExemploMetodoFinal {
    public static void main(String[] args) {

        class Cachorro extends Animal {
//            @Override
//            public void respirar() {
//                System.out.println("Animal respirando");
//            }
        }
    }

    /**
     * Quando faz sentido?
     *
     * Imagine em um sistema ERP onde existe um método que valida chave de acesso.
     * Esse método precisa seguir a legislação e não pode ser alterado.
     */
}
