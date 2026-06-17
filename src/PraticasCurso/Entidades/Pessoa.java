package PraticasCurso.Entidades;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int anoNascimento;
    private Endereco endereco;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String nomeCompleto() {
        return nome + " " + sobrenome;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDADOS DO CADASTRADO: ");
        sb.append("\nNome completo: " + nomeCompleto());
        sb.append("\nAno nascimento: " + getAnoNascimento());
        sb.append("\nRua: " + getEndereco().getRua());
        sb.append("\nBairro: " + getEndereco().getBairro());
        sb.append("\nCidade: " + getEndereco().getCidade());
        sb.append("\nCep: " + getEndereco().getCep());
        return sb.toString();

    }
}






