package Projetos.Entidades;

import Projetos.enums.UnidadeMedida;

import java.math.BigDecimal;

public class Produto {
    private String codigo;
    private String descricao;
    private UnidadeMedida unidadeMedida;
    private BigDecimal valorUnitario;

    //GETTER E SETTER
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("Código é obrigatório.");
        }
        codigo = codigo.strip().replaceAll("\\s+", " ").toUpperCase();

        if (codigo.length() < 5 || codigo.length() > 20) {
            throw new IllegalArgumentException("Código deve conter entre 5 e 20 caracteres.");
        }
        if (!codigo.matches("[A-Za-zÀ-ÿ0-9]+")) {
            throw new IllegalArgumentException("Código deve conter apenas números e letras.");
        }
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("A descrição é obrigatória.");
        }

        descricao = descricao.strip().replaceAll("\\s+", " ");

        if (descricao.length() < 3 || descricao.length() > 150) {
            throw new IllegalArgumentException("A descrição deve conter entre 3 e 150 caracteres.");
        }
        this.descricao = descricao;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        if (unidadeMedida == null) {
            throw new IllegalArgumentException("Unidade de medida é obrigatório.");
        }
        this.unidadeMedida = unidadeMedida;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        if (valorUnitario == null) {
            throw new IllegalArgumentException("O valor unitário é obrigatório.");
        }
        if (valorUnitario.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor unitário deve ser maior que zero.");
        }
        this.valorUnitario = valorUnitario;
    }
    @Override
    public String toString() {
        return "Produto: \n" + "Código: " + codigo + "\n"
                + "Descrição do Produto: " + descricao + "\n"
                + "Unidade de medida: " + unidadeMedida + "\n"
                + "Valor unitário: " + valorUnitario + "\n";

    }
}
