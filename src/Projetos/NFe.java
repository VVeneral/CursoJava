package Projetos;

import Projetos.enums.NaturezaOperacao;
import Projetos.enums.SituacaoNota;

/*
DocumentoFiscal
│
└── NFe
*/
public class NFe extends DocumentoFiscal {
    private String protocoloAutorizacao;
    private NaturezaOperacao naturezaOperacao;
    private String cfop;
    private String serie;
    private String modelo;

    @Override
    public  void emitir(){
        System.out.println("Transmitindo NFe para a SEFAZ...");
    }

    public String getProtocoloAutorizacao() {
        if (getStatus() == SituacaoNota.AUTORIZADA) {
            return protocoloAutorizacao;
        }
        return null;
    }
    public void setProtocoloAutorizacao(String protocoloAutorizacao) {
        if (protocoloAutorizacao == null
                || protocoloAutorizacao.isBlank()
                || !protocoloAutorizacao.matches("\\d{15}")) {

            throw new IllegalArgumentException("O protocolo deve possuir 15 digitos.");
        }
        this.protocoloAutorizacao = protocoloAutorizacao;
    }

    public NaturezaOperacao getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(NaturezaOperacao naturezaOperacao) {
        if (naturezaOperacao == null) {
            throw new IllegalArgumentException("A natureza da operação é obrigatória");
        }
        this.naturezaOperacao = naturezaOperacao;
    }
}
