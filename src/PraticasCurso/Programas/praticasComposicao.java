package PraticasCurso.Programas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import PraticasCurso.Entidades.Endereco;
import PraticasCurso.Entidades.Pessoa;

public class praticasComposicao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        Endereco endereco = new Endereco();

        System.out.println("Digite o Nome: ");
        pessoa.setNome(sc.nextLine());

        System.out.println("Digite o Sobrenome: ");
        pessoa.setSobrenome(sc.nextLine());

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite o Ano de Nascimento: ");
        String anoStr = sc.nextLine();

        try { // tratamento de exceções
            // LocalDate.parse -> converte string para data usando formato definido no fmt
            LocalDate nascimento = LocalDate.parse(anoStr, fmt);
            pessoa.setAnoNascimento(nascimento.getYear()); // pega só o ano
        } catch (DateTimeParseException e) {
            System.out.println("Data inválida. Use o formato dd/MM/yyyy");
        }

        System.out.println("Digite o Rua: ");
        endereco.setRua(sc.nextLine());

        System.out.println("Digite o Bairro: ");
        endereco.setBairro(sc.nextLine());

        System.out.println("Digite o cidade: ");
        endereco.setCidade(sc.nextLine());

        System.out.println("Digite o Cep: ");
        endereco.setCep(sc.nextInt());

        pessoa.setEndereco(endereco);

        System.out.println(pessoa.toString());

        sc.close();

    }
}