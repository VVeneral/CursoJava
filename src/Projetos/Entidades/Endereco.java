package Projetos.Entidades;

import Projetos.enums.Uf;

public class Endereco {
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private Uf uf;
    private String cep;

    public void setLogradouro(String logradouro) {
        if (logradouro == null || logradouro.isBlank()) {
            throw new IllegalArgumentException("O logradouro deve ser preenchido.");
        }
        logradouro = logradouro.strip().replaceAll("\\s+", " ");

        if (logradouro.length() > 150) {
            throw new IllegalArgumentException("Logradouro: Máximo de 150 caracteres.");
        }
        if (!logradouro.matches("[A-Za-zÀ-ÿ ]+")) {
            throw new IllegalArgumentException("Logradouro não pode conter números.");
        }
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("O número de endereço deve ser preenchido.");
        }
        if (numero.length() > 10) {
            throw new IllegalArgumentException("Número: Máximo de 10 números");
        }
        if (!numero.matches("\\d+")) {
            throw new IllegalArgumentException("O número deve conter apenas números.");
        }
        this.numero = numero;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        if (bairro == null || bairro.isBlank()) {
            throw new IllegalArgumentException("O logradouro deve ser preenchido.");
        }
        if (bairro.length() > 150) {
            throw new IllegalArgumentException("Máximo de 150 caracteres.");
        }
        if (!bairro.matches("[A-Za-zÀ-ÿ ]+")) {
            throw new IllegalArgumentException("Bairro não pode conter números.");
        }
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade == null || cidade.isBlank()) {
            throw new IllegalArgumentException("Cidade deve ser preenchido.");
        }
        if (cidade.length() > 150) {
            throw new IllegalArgumentException("Máximo de 100 caracteres.");
        }
        if (!cidade.matches("[A-Za-zÀ-ÿ ]+")) {
            throw new IllegalArgumentException("Cidade não pode conter números.");
        }
        this.cidade = cidade;
    }

    public Uf getUf() {
        return uf;
    }

    public void setUf(Uf uf) {
        if (uf == null) {
            throw new IllegalArgumentException("A UF é obrigatória");
        }
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if (cep == null || cep.isBlank()) {
            throw new IllegalArgumentException("O CEP é obrigatório");
        }
        if (cep.length() != 8) {
            throw new IllegalArgumentException("O CEP deve conter 8 números.");
        }
        if (!cep.matches("\\d+")) {
            throw new IllegalArgumentException("O CEP deve conter apenas números.");
        }
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Logradouro: " + logradouro + "\n"
            + "Numero: " + numero + "\n"
            + "Bairro: " + bairro + "\n"
            + "Cidade: " + cidade + "\n"
            + "Estado: " + uf + "\n"
            + "CEP: " + cep + "\n";
    }
}
