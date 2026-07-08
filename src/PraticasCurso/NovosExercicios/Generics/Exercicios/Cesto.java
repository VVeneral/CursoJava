package PraticasCurso.NovosExercicios.Generics.Exercicios;

class Peixe {
    private String nome;
    private String tamanho;

    public Peixe(String nome,  String tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }
    public String getNome() {
        return nome;
    }
    public String getTamanho() {
        return tamanho;
    }
}

class Polvo {
    private String nome;
    private int tentaculos;

    public Polvo(String nome,  int tentaculos) {
        this.nome = nome;
        this.tentaculos = tentaculos;
    }

    public String getNome() {
        return nome;
    }
    public int getTentaculos() {
        return tentaculos;
    }
}

public class Cesto<T> {
    private T conteudo;

    public void guardar(T conteudo) {
        this.conteudo = conteudo;
    }
    public T pegar() {
        return conteudo;
    }

    public static void main (String[] args) {

        Cesto<Peixe> cestoDePeixe = new Cesto<>();
        Cesto<Polvo> cestoDePolvo = new Cesto<>();

        cestoDePeixe.guardar(new Peixe("Sardinha", "Pequeno"));
        Peixe peixe = cestoDePeixe.pegar();
        System.out.println("Nome do peixe: " + peixe.getNome());
        System.out.println("Tamanho do peixe: " + peixe.getTamanho());

        cestoDePolvo.guardar(new Polvo("Lula", 8));
        Polvo polvo = cestoDePolvo.pegar();
        System.out.println("\nNome do polvo: " + polvo.getNome());
        System.out.println("Qtd de tentaculos: " + polvo.getTentaculos());
    }
}
