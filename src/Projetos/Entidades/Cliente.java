package Projetos.Entidades;

public class Cliente {
    private String nome;
    private String cpfCnpj;
    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("O nome deve ser preenchido.");
        }
        nome = nome.strip().replaceAll("\\s+", " ");;

        if (nome.isBlank()) {
            throw new IllegalArgumentException("O nome deve ser preenchido.");
        }
        if (nome.length() < 3) {
            throw new IllegalArgumentException("Mínimo de 3 caracteres.");
        }
        if (nome.length() > 150) {
            throw new IllegalArgumentException("Máximo de 100 caracteres.");
        }
        if (!nome.matches("[A-Za-zÀ-ÿ ]+")) {
            throw new IllegalArgumentException("O nome não pode conter números.");
        }
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        if (cpfCnpj == null || cpfCnpj.isBlank()) {
            throw new IllegalArgumentException("O CPF/CNPJ deve ser preenchido.");
        }
        if (cpfCnpj.length() != 11 && cpfCnpj.length() != 14) {
            throw new IllegalArgumentException("O CPF/CNPJ deve conter 11 ou 14 digitos.");
        }
        if (!cpfCnpj.matches("\\d+")) {
            throw new IllegalArgumentException("O CPF/CNPJ deve conter apenas números.");
        }
        this.cpfCnpj = cpfCnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {

        if (endereco == null) {
            throw new IllegalArgumentException("O endereço é obrigatório.");
        }
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente: \n" + "Nome: " + nome + "\n"
                + "CPF/CNPJ: " + cpfCnpj + "\n"
                + "\nEndereco: \n" + endereco.toString() + "\n";
    }
}


