package PraticasCurso.Programas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import PraticasCurso.Entidades.Compra;
import PraticasCurso.Entidades.Comprador;
import PraticasCurso.Enums.StatusPagamento;
import PraticasCurso.Enums.TipoPagamento;

public class sistemaCompra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // comprador
        Comprador comprador = new Comprador();

        String nome;  // tratamento com matches para aceitar apenas letras e espaços, incluindo acentos
        do {
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
        } while (!nome.matches("[a-zA-ZÀ-ú ]+"));
        comprador.setNome(nome);

        String cpf; // tratamento com matches para aceitar apenas números, exatamente 11 dígitos
        do {
            System.out.println("Digite seu cpf: ");
            cpf = sc.nextLine();
        } while (!cpf.matches("[0-9]{11}"));
        comprador.setCpf(cpf);

        String email; // tratamento com matches para aceitar um formato de email válido
        do {
            System.out.println("Digite seu email: ");
            email = sc.nextLine();
        } while (!email.matches("[^@]+@[^@]+\\.[^@]+"));
        comprador.setEmail(email);

        //compra
        Compra compra = new Compra();

        compra.setComprador(comprador);

        TipoPagamento tipo = null; // tratamento para aceitar apenas os tipos de pagamento definidos no enum.
        do {
            System.out.println("Digite o Tipo de Pagamento: " +
                    "\nDinheiro." +
                    "\nCartão de débito." +
                    "\nCartão de crédito." +
                    "\nBoleto ou Pix.");
            String tipoStr = sc.nextLine();
            try {
                tipo = TipoPagamento.valueOf(tipoStr.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo inválido. Tente novamente.");
            }
        } while (tipo == null);
        compra.setTipoPagamento(tipo);

        LocalDateTime datahora = LocalDateTime.now();

        compra.setDatahora(datahora);

        StatusPagamento status = StatusPagamento.AGUARDANDO;
        compra.setStatusPagamento(status);

        List <Compra> compras = new ArrayList<>();
        compras.add(compra);

        System.out.println(compra.toString());

        sc.close();
    }
}