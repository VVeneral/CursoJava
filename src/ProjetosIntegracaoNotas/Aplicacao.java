package ProjetosIntegracaoNotas;

import ProjetosIntegracaoNotas.enums.SituacaoNota;

public class Aplicacao {
    public static void main(String[] args) {

        NotaFiscal notaFiscal1 = new NotaFiscal(
            "Car locações",
            "100123",
            "001",
            "4126066481573400010155001001001236000250645",
            "VENDA DE MERCADORIA ADIQUIRIDA",
            "64815734000101",
            1500.67,
            SituacaoNota.ENVIADA,
            "2026-06-19"
        );

        NotaFiscal notaFiscal2 = new NotaFiscal(
            "Tubos inotex",
            "100124",
            "001",
            "4126064604267600014955001001001246000250745",
            "VENDA DE MERCADORIA ADIQUIRIDA",
            "46042676000149",
            2357.15,
            SituacaoNota.ERRO,
            "2026-06-19"
        );

        System.out.println(notaFiscal1);
        System.out.println("\n");
        System.out.println(notaFiscal2);
    }
}
