package PraticasCurso.NovosExercicios.POO;

public class Personagem {
    private String nome;
    private int nivelDePoder;

    public Personagem(String nome, int nivelDePoder) {
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }

    public void tentarAumentarNivelDePoder(int nivel) {
        nivel += 10;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivelDePoder() {
        return nivelDePoder;
    }

}
