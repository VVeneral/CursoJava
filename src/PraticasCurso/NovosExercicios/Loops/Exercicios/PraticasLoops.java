package PraticasCurso.NovosExercicios.Loops.Exercicios;

public class PraticasLoops {
    public static void main(String[] args) {

        // ExemploFor
        for (int i = 0; i < 5; i++) {
            System.out.println("laço ExemploFor: " + i);
        }

        System.out.println("\n");

        // ExemploWhile
        int j = 0;
        while (j < 10) {
            System.out.println("Laço while: " + j);
            j++;
        }

        System.out.println("\n");

        // Do-while
        int k = 15;
        do {
            System.out.println("Laço do-while: " + k);
            k++;
        } while (k < 10);

        System.out.println("\n##########  CONTROLE DE LOOP  ##########\n");

        // Controle de fluxo - break
        for (int y = 0; y < 10; y++) {
            if (y == 5) {
                break; // sai do loop quando y é igual a 5
            }
            System.out.println("Controle de fluxo com break: " + y);
        }
        System.out.println("\n");
        // Controle de fluxo - continue
        for (int x = 0; x < 10; x++) {
            if (x == 5) {
                continue; // pula a interação quando x é igual a 5
            }
            System.out.println("Controle de fluxo com continue: " + x);
        }

        System.out.println("\n##########  EXERCICIOS - LOOP  ##########\n");
        // ExemploFor
        int soma = 0;

        for (int z = 0; z <= 10; z++) {

            soma = soma + z;
        }
        System.out.println("Soma: " + soma);

        System.out.println("\n");
        // while
        int contadorDoces = 1;
        while (contadorDoces <= 3) {
            System.out.println("Pode comer doce seu gordo: " + contadorDoces);
            contadorDoces++;
        }

        System.out.println("\n");
        // do-while
        int num = 10;
        int soma2 = 0;
        int w = 1;

        do {
            soma2 = soma2 + w;
            w++;
        } while (w <= num);
        System.out.println("Soma: " + soma2);


        System.out.println("\n##########  EXERCICIOS - CONTINUE E BREAK  ##########\n");

        int codigoDeSaida = 2;
        int a = 3;
        int b = 7;
        int c = 10;
        // com brak
        for (int codCarteirinha = 1; codCarteirinha <= 10; codCarteirinha++) {
            if (codCarteirinha == codigoDeSaida) {
                break;
            }
        System.out.println("Codigo da carteirinha: " +  codCarteirinha + "\n");
        }
        // com continue
        for (int codCarteirinha = 1; codCarteirinha <= 10; codCarteirinha++) {
            if (codCarteirinha == a ||  codCarteirinha == b || codCarteirinha == c) {
                System.out.println("Codigo aceito!");
                continue;
            }
            System.out.println("Codigo da carteirinha: " +  codCarteirinha);
        }

    }
}
