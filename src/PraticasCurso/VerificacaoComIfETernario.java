package PraticasCurso;

public class VerificacaoComIfETernario {
    public static void main(String[] args) {

        int a = 15;
        String resultado;

        if (a >= 15) {
            resultado = "Numero maior";
        } else {
            resultado = "Numero menor";
        }
        System.out.println(resultado);

        if (a / 2 == 0) {
            resultado = "Numero divisivel por 2";
        } else {
            resultado = "Numero não divisivel";
        }
            System.out.println(resultado);

        String b = ((a + 5) > 19) ? "Numero maior" : "Numero menor";
        System.out.println(b);

        Object obj = 111.5;
        if (obj instanceof Integer) {
            System.out.println(obj);
        } else {
            System.out.println("Não é objeto");
        }
    }
}
