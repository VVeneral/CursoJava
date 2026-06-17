package PraticasCurso.NovosExercicios.POO;

public class Pessoa {
    public String nome;
    private int idade;
    protected String endereco;
    String telefone;

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String infoPessoa() {
        return "\nNome: " + nome
                + "\nIdade: " + idade + " anos"
                + "\nEndereço: " + endereco
                + "\nTelefone: " + telefone;
    }
}

