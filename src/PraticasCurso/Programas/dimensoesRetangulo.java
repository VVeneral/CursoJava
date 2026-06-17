package PraticasCurso.Programas;

import java.util.Locale;
import java.util.Scanner;

import PraticasCurso.Entidades.Retangulo;

public class dimensoesRetangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo reta = new Retangulo();

        System.out.println("Digite a altura e largura do Retangulo: ");
        reta.altura = sc.nextDouble();
        reta.largura = sc.nextDouble();

        System.out.printf("Area: %.2f%n", reta.calcularArea());
        System.out.printf("Perimetro: %.2f%n", reta.calcularPerimetro());
        System.out.printf("Diagonal: %.2f%n", reta.diagonal());

        sc.close();
    }

}