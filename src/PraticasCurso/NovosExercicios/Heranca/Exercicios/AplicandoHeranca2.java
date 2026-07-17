package PraticasCurso.NovosExercicios.Heranca.Exercicios;

import Projetos.NFe;
import Projetos.enums.SituacaoNota;

import java.math.BigDecimal;
import java.time.LocalDate;

class AplicandoHenraca2 {
    public static void main(String[] args) {

        NFe nfe = new NFe();

        nfe.setNumero("00001001");
        nfe.setDataEmissao(LocalDate.now());
        nfe.setStatus(SituacaoNota.ENVIADA);
        nfe.setValorTotal(BigDecimal.valueOf(6500.75));

        System.out.println(nfe);
    }
}

