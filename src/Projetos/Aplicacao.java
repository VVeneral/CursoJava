package Projetos;

import Projetos.Entidades.Cliente;
import Projetos.Entidades.Endereco;
import Projetos.Entidades.ItemNota;
import Projetos.Entidades.Produto;
import Projetos.enums.*;

import java.math.BigDecimal;

public class Aplicacao {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        Produto produto = new Produto();
        ItemNota itemNota = new ItemNota();
        NFe nfe = new NFe();

        // Endereco
        endereco.setLogradouro("Rua max sheidemantel");
        endereco.setNumero("54");
        endereco.setBairro("Jardim Fortaleza");
        endereco.setCidade("Blumenau");
        endereco.setUf(Uf.SC);
        endereco.setCep("89055260");
        // Cliente
        cliente.setNome("Kelly   ");
        cliente.setCpfCnpj("01945898748");
        cliente.setEndereco(endereco);
        //Produto
        produto.setCodigo("123456fg");
        produto.setDescricao("Arroz tio joão 5kg");
        produto.setUnidadeMedida(UnidadeMedida.PCT);
        produto.setValorUnitario(new BigDecimal("21.99"));
        // ItemNota
        itemNota.setProduto(produto);
        itemNota.setQuantidade(new BigDecimal("10"));
        itemNota.getProduto().getValorUnitario();
        //NFe
        nfe.setProtocoloAutorizacao("autorizado");
        nfe.setNaturezaOperacao(NaturezaOperacao.BONIFICACAO);
        nfe.setDestinatario(cliente);
        nfe.setCfop(Cfop.COMPRA_COMERCIALIZACAO_DENTRO_ESTADO);
        nfe.setSerie("214");
        nfe.setModelo(ModeloDocumento.NFE);


        System.out.println(nfe);

    }
}
