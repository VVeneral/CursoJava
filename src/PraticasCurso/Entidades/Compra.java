package PraticasCurso.Entidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import PraticasCurso.Enums.StatusPagamento;
import PraticasCurso.Enums.TipoPagamento;

public class Compra {
    private Comprador comprador;
    private LocalDateTime datahora;
    private TipoPagamento tipoPagamento;
    private StatusPagamento statusPagamento;

    public Comprador getComprador() {
        return comprador;
    }
    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public LocalDateTime getDatahora() {
        return datahora;
    }
    public void setDatahora(LocalDateTime datahora) {
        this.datahora = datahora;
    }
    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }
    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    public StatusPagamento getStatusPagamento() {
        return statusPagamento;
    }
    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String toString() {
        return "\n ===== DADOS DA COMPRA ====="
                + "\nComprador: " + getComprador().getNome()
                + "\nCPF: " + getComprador().getCpf()
                + "\nEmail: " + getComprador().getEmail()
                + "\nTipo de pagamento: " + getTipoPagamento().getDesc()
                + "\nStatus do pagamento: " + getStatusPagamento().getDescricao()
                + "\nData e hora da compra: " + fmt.format(getDatahora());
    }

}