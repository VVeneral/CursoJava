package PraticasCurso.Entidades;

public class Estudante {

    private Pessoa nome;
    private Double notaI;
    private Double notaII;
    private Double notaIII;

    public Estudante() {
    }

    public Estudante(Pessoa nome, Double notaI, Double notaII, Double notaIII) {
        setNome(nome);
        this.notaI = notaI;
        this.notaII = notaII;
        this.notaIII = notaIII;
    }

    public Pessoa getNome() { return nome; }
    public void setNome(Pessoa nome) {
        if (!nome.getNome().matches("[a-zA-ZÀ-ú ]+")) {
            throw new IllegalArgumentException("Nome deve conter apenas letras.");
        }
        this.nome = nome;
    }

    public Double getNotaI() { return notaI; }
    public void setNotaI(Double notaI) { this.notaI = notaI; }


    public Double getNotaII() { return notaII; }
    public void setNotaII(Double notaII) { this.notaII = notaII; }


    public Double getNotaIII() { return notaIII; }
    public void setNotaIII(Double notaIII) { this.notaIII = notaIII; }

    public double notaFinal() { return (notaI + notaII + notaIII) / 3.0; }

    public boolean reprovado() { return notaFinal() < 60.0; }

    public double notaFaltante() { return reprovado() ? 60.0 - notaFinal() : 0.0; }

}