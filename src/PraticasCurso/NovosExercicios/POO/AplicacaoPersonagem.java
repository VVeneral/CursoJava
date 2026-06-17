package PraticasCurso.NovosExercicios.POO;

public class AplicacaoPersonagem {
    public static void main(String[] args) {

        Personagem goku = new Personagem("Goku", 9000);

        System.out.println(goku.getNome());
        System.out.println(goku.getNivelDePoder());

        goku.tentarAumentarNivelDePoder(goku.getNivelDePoder());

        System.out.println(goku.getNivelDePoder());

    }
}
