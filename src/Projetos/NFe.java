package Projetos;

import Projetos.Entidades.ItemNota;
import Projetos.enums.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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

    private List<ItemNota> itens = new ArrayList<>();

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

    public void adicionarItem(ItemNota item) {
        itens.add(item);
    }

    public int quantidadeItens() {
        return itens.size();
    }


    public BigDecimal calcularValorTotal() {
        BigDecimal valorTotalNota = BigDecimal.ZERO;

        for (ItemNota itemNota : itens) {
            valorTotalNota = valorTotalNota.add(itemNota.calcularValorTotal());
        }
            return valorTotalNota;
    }

    public void removerItem(ItemNota item) {
        itens.remove(item);
    }

    public ItemNota removerItemPorCodigo(String codigo) {
        ItemNota nota = buscaItemPorCodigo(codigo);

        if (nota != null) {
            removerItem(nota);
        }
        return nota;
    }

    public ItemNota buscaItemPorCodigo(String codigo) {
        for (ItemNota itemNota : itens) {
            if (itemNota.getProduto().getCodigo().equals(codigo.toUpperCase())) {
                return itemNota;
            }
        }
        return null;
    }

    public ItemNota alterarQuantidadePorCodigo(String codigo, BigDecimal novaQuantidade) {
        ItemNota nota = buscaItemPorCodigo(codigo);

        if (nota != null) {
            nota.setQuantidade(novaQuantidade);
        }
        return nota;
    }

    @Override
    public String toString() {

        StringBuilder infoNfe = new StringBuilder();
        int contador = 1;

        infoNfe.append("\nProtocolo de Autortização: ").append(protocoloAutorizacao.toUpperCase()).append("\n");
        infoNfe.append("Natureza da Operação: ").append(naturezaOperacao.getCodigo())
                .append(" - ").append(naturezaOperacao.getDescricao()).append("\n");
        infoNfe.append("CFOP: ").append(cfop.getCodigo()).append(" - ").append(cfop.getDescricao()).append("\n");
        infoNfe.append("Série: ").append(serie).append("\n");
        infoNfe.append("Modelo: ").append(modelo.getCodigo()).append("\n");
        for ( ItemNota itemNota : itens) {
            infoNfe.append("\n----------  Item ").append(contador).append("  ----------\n");
            infoNfe.append("Descrição do Produto: ")
                    .append(itemNota.getProduto().getDescricao()).append("\n");
            infoNfe.append("Valor Unitário: ")
                    .append(itemNota.getProduto().getValorUnitario()).append("\n");
            infoNfe.append("Quantidade: ")
                    .append(itemNota.getQuantidade()).append("\n");
            infoNfe.append("Valor Total: ")
                    .append(itemNota.calcularValorTotal()).append("\n");

            contador++;
        }
        infoNfe.append("\n--------------------------------");
        infoNfe.append("\nQuantidade de itens na nota: ").append(quantidadeItens());
        infoNfe.append("\n--------------------------------");
        infoNfe.append("\nValor total da nota: R$ ").append(calcularValorTotal());

        return infoNfe.toString();
    }
}
