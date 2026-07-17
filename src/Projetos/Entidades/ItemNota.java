package Projetos.Entidades;

import java.math.BigDecimal;

public class ItemNota {
    private Produto produto;
    private BigDecimal quantidade;
    private BigDecimal valorUnitario;
    private BigDecimal valorTotal;

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

    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        if (valorTotal == null) {
            throw new IllegalArgumentException("O valor total é obrigatório.");
        }
        if (valorTotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor total deve ser maior que zero.");
        }
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Item Nota: \n" + produto.toString() + "\n"
                + "Quantidade: " + quantidade + "\n"
                + "Valor unitário: " + valorUnitario + "\n"
                + "Valor total: " + valorTotal + "\n";
    }
}
