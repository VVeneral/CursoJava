package Projetos;

import Projetos.Entidades.Cliente;
import Projetos.Entidades.Endereco;
import Projetos.Entidades.ItemNota;
import Projetos.Entidades.Produto;
import Projetos.enums.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        NFe nfe = new NFe();

        Produto produto = new Produto();
        ItemNota itemNota = new ItemNota();

        Produto produto2 = new Produto();
        ItemNota itemNota2 = new ItemNota();

        Produto produto3 = new Produto();
        ItemNota itemNota3 = new ItemNota();
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

        // ITEM 1
        //Produto
        produto.setCodigo("123456fg");
        produto.setDescricao("Arroz tio joão 5kg");
        produto.setUnidadeMedida(UnidadeMedida.PCT);
        produto.setValorUnitario(new BigDecimal("21.99"));
        // ItemNota
        itemNota.setProduto(produto);
        itemNota.setQuantidade(new BigDecimal("10"));
        itemNota.getProduto().getValorUnitario();
        //ITEM 2
        // Produto
        produto2.setCodigo("678910fg");
        produto2.setDescricao("Coca-cola Zero 2L");
        produto2.setUnidadeMedida(UnidadeMedida.LT);
        produto2.setValorUnitario(new BigDecimal("14.95"));
        // ItemNota
        itemNota2.setProduto(produto2);
        itemNota2.setQuantidade(new BigDecimal("120"));
        itemNota2.getProduto().getValorUnitario();
        //ITEM 3
        // Produto
        produto3.setCodigo("123456hh");
        produto3.setDescricao("Papel Higiénico 12 rolos - folha dupla");
        produto3.setUnidadeMedida(UnidadeMedida.PCT);
        produto3.setValorUnitario(new BigDecimal("16.19"));
        // ItemNota
        itemNota3.setProduto(produto3);
        itemNota3.setQuantidade(new BigDecimal("25"));
        itemNota3.getProduto().getValorUnitario();
        //NFe
        nfe.setProtocoloAutorizacao("autorizado");
        nfe.setNaturezaOperacao(NaturezaOperacao.VENDA);
        nfe.setDestinatario(cliente);
        nfe.setCfop(Cfop.COMPRA_COMERCIALIZACAO_DENTRO_ESTADO);
        nfe.setSerie("214");
        nfe.setModelo(ModeloDocumento.NFE);
        // Lista
        nfe.adicionarItem(itemNota);
        nfe.adicionarItem(itemNota2);
        nfe.adicionarItem(itemNota3);

        System.out.println(nfe);

    }
}
