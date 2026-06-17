package PraticasCurso.NovosExercicios.POO;

public class AplicacaoLivro {
    public static void main (String[] args) {

        Livro livro1 = new Livro("A Sociedade do Anel", "J.R.R Tolkien", 1954, 49.78 );
        Livro livro2 = new Livro("As Duas Torres", "J.R.R Tolkien");
        Livro livro3 = new Livro();

        System.out.println(livro1.infoLivros());
        System.out.println(livro2.infoLivros());
        System.out.println(livro3.infoLivros());
    }
}
