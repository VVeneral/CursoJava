package PraticasCurso.NovosExercicios.Heranca.Exercicios;

import ProjetosIntegracaoNotas.enums.SituacaoNota;

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
public class DocumentoFiscal {
    private String numero;
    private String chaveDeAcesso;
    private LocalDate dataEmissao;
    private String destinatario;
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
        this.numero = numero;
    }

    public String getChaveDeAcesso() {
        return chaveDeAcesso;
    }
    public void setChaveDeAcesso(String chaveDeAcesso) {
        if (chaveDeAcesso == null || chaveDeAcesso.isEmpty() || !chaveDeAcesso.matches("\\d{44}")) {
            throw new IllegalArgumentException("A chave de acesso deve possuir 44 caracteres.");
        }
        this.chaveDeAcesso = chaveDeAcesso;
    }

    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        if (destinatario == null || destinatario.isBlank()) {
            throw new IllegalArgumentException("O destinatario deve ser preenchido.");
        }
        if (destinatario.length() > 150) {
            throw new IllegalArgumentException("Máximo de 150 caracteres.");
        }
        if (!destinatario.matches("[A-Za-zÀ-ÿ ]+")) {
            throw new IllegalArgumentException("o destinatario não pode conter números.");
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

    public SituacaoNota getStatus() {
        return status;
    }
    public void setStatus(SituacaoNota status) {
        if (status == null) {
            throw new IllegalArgumentException("O status deve ser preenchido.");
        }
        this.status = status;
    }

    @Override
    public String toString() {
        return "Numero: " + numero + "\n"
            + "Chave de acesso: " + chaveDeAcesso + "\n"
            + "Data de emissão: " + dataEmissao + "\n"
            + "Destinatario: " + destinatario + "\n"
            + "Status: " + status + "\n"
            + "Valor total: " + valorTotal + "\n";
    }
}
