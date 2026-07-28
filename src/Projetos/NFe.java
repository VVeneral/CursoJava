package Projetos;

import Projetos.Entidades.Cliente;
import Projetos.enums.*;
import Projetos.Entidades.Endereco;

import java.util.Locale;

/*
DocumentoFiscal
│
└── NFe
*/
public class NFe extends DocumentoFiscal {
    private String protocoloAutorizacao;
    private NaturezaOperacao naturezaOperacao;
    private Cfop cfop;
    private String serie;
    private ModeloDocumento modelo;

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
                || protocoloAutorizacao.length() > 15) {

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

    public Cfop getCfop() {
        return cfop;
    }

    public void setCfop(Cfop cfop) {
        if (cfop == null) {
            throw new IllegalArgumentException("Cfop é obrigatório.");
        }
        this.cfop = cfop;
    }

    public Cfop definirCfop() {
        if (Uf.SC == getDestinatario().getEndereco().getUf()) {
            return Cfop.COMPRA_COMERCIALIZACAO_DENTRO_ESTADO;
        } else {
            return Cfop.COMPRA_COMERCIALIZACAO_FORA_ESTADO;
        }
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        if (serie == null || serie.isBlank()) {
            throw new IllegalArgumentException("Série é obrigatório.");
        }
        serie = serie.strip();

        if (serie.length() > 3) {
            throw new IllegalArgumentException("Série: Máximo de 0 a 3 números");
        }
        if (!serie.matches("\\d+")) {
            throw new IllegalArgumentException("Série: Deve conter apenas números.");
        }
        this.serie = serie;
    }

    public ModeloDocumento getModelo() {
        return modelo;
    }

    public void setModelo(ModeloDocumento modelo) {
        if (modelo == null) {
            throw new IllegalArgumentException("O modelo de documento é obrigatório");
        }
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Protocolo de Autortização: " + protocoloAutorizacao.toUpperCase() + "\n"
            + "Natureza da Operação: " + naturezaOperacao.getCodigo() + " - " + naturezaOperacao.getDescricao()  + "\n"
            + "Define Cfop: " + definirCfop().getCodigo() + " - " + definirCfop().getDescricao() + "\n"
            + "Cfop: " + cfop.getCodigo() + " - " + cfop.getDescricao() + "\n"
            + "Série: " + serie + "\n"
            + "Modelo: " + modelo.getCodigo() + "\n";
    }
}
