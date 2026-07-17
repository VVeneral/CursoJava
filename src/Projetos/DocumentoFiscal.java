package Projetos;

import Projetos.Entidades.Cliente;
import Projetos.enums.SituacaoNota;

import java.math.BigDecimal;
import java.time.LocalDate;

/*
DocumentoFiscal
│
├── NFe
├── NFCe
├── NFSe
├── RPS
├── NotaAvulsa
├── CTe
└── MDFe
*/
public abstract class DocumentoFiscal {
    private String numero;
    private Cliente destinatario;
    private LocalDate dataEmissao;
    private SituacaoNota status;
    private BigDecimal valorTotal;

    //GETTER E SETTER
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        if (numero == null || !numero.matches("\\d{8}")) {
            throw new IllegalArgumentException("O numero deve ter 8 caracteres.");
        }
        if (!numero.matches("\\d+")) {
            throw new IllegalArgumentException("O número deve conter apenas números.");
        }
        this.numero = numero;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cliente destinatario) {
        if (destinatario == null) {
            throw new IllegalArgumentException("O destinatario deve ser preenchido.");
        }
        this.destinatario = destinatario;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        if (dataEmissao.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("A data de emissão é obrigatória.");
        }
        this.dataEmissao = dataEmissao;
    }

    public SituacaoNota getStatus() {
        return status;
    }

    public void setStatus(SituacaoNota status) {
        if (status == null) {
            throw new IllegalArgumentException("O status deve ser preenchido.");
        }
        this.status = status;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        if (valorTotal == null) {
            throw new IllegalArgumentException("o valor é obrtigatório.");
        }
        if (valorTotal.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("o valor não pode ser negativo.");
        }
        this.valorTotal = valorTotal;
    }


    public abstract void emitir();

    @Override
    public String toString() {
        return "Numero: " + numero + "\n"
            + "Data de emissão: " + dataEmissao + "\n"
            + "Destinatario: " + destinatario + "\n"
            + "Status: " + status + "\n"
            + "Valor total: " + valorTotal + "\n";
    }
}
