package PraticasCurso.NovosExercicios.ControleDeFluxo;

public class ExemploInstanceOf {
    /**
     * INSTANCEOF
     * Se um obj foi declarado como texto ou numeros, o instanceof verifica se é true ou false.
     * */
    public static void main(String[] args) {

        Object obj = "String";

        if (obj instanceof String) {
            System.out.println("Obj é um String");
        } else {
            System.out.println("Obj não é um String");
        }

        Object numero = 15;

        if (numero instanceof Integer) {
            System.out.println("Verdadeiro");
        }
    }
}
