package PraticasCurso.NovosExercicios.Heranca.Exercicios;

import ProjetosIntegracaoNotas.enums.SituacaoNota;

import java.math.BigDecimal;
import java.time.LocalDate;

class AplicandoHenraca2 {
    public static void main(String[] args) {

        NFe nfe = new NFe();

        nfe.setNumero("00001001");
        nfe.setChaveDeAcesso("01234567890123456789012345678901234567890123");
        nfe.setDataEmissao(LocalDate.now());
        nfe.setDestinatario("Casa de manutenção agricola LTDA");
        nfe.setStatus(SituacaoNota.ENVIADA);
        nfe.setValorTotal(BigDecimal.valueOf(6500.75));

        System.out.println(nfe);
    }
}

