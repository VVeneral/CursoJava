package Projetos.Entidades;

import Projetos.enums.UnidadeMedida;

import java.math.BigDecimal;

public class ItemNota {
    private Produto produto;
    private BigDecimal quantidade;

    // GETTER E SETTER
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto é obrigatório.");
        }
        this.produto = produto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(BigDecimal quantidade) {
        if (quantidade == null) {
            throw new IllegalArgumentException("A quantidade é obrigatória.");
        }
        if (quantidade.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero.");
        }
        this.quantidade = quantidade;
    }

    public BigDecimal calcularValorTotal() {
        return quantidade.multiply( produto.getValorUnitario());
    }

    @Override
    public String toString() {
        return "Item da Nota: \n"
                + "Código: " + produto.getCodigo() + "\n"
                + "Descrição: " + produto.getDescricao() + "\n"
                + "Quantidade: " + quantidade + " " + produto.getUnidadeMedida() + "\n"
                + "Valor unitário: " + produto.getValorUnitario() + "\n"
                + "Valor total: " + calcularValorTotal() + "\n";
    }
}
