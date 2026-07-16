package PraticasCurso.NovosExercicios.Heranca.Exercicios;

import ProjetosIntegracaoNotas.enums.SituacaoNota;

import java.math.BigDecimal;
import java.time.LocalDate;

class AplicandoHenraca2 {
    public static void main(String[] args) {

        DocumentoFiscal documentoFiscal = new DocumentoFiscal();

        documentoFiscal.setNumero("00001001");
        documentoFiscal.setChaveDeAcesso("01234567890123456789012345678901234567890123");
        documentoFiscal.setDataEmissao(LocalDate.now());
        documentoFiscal.setDestinatario("Casa de manutenção agricola LTDA");
        documentoFiscal.setStatus(SituacaoNota.ENVIADA);
        documentoFiscal.setValorTotal(BigDecimal.valueOf(6500.75));

        System.out.println(documentoFiscal);
    }
}

