package PraticasCurso.Modulos;

public class ModuloMatriz {
    public static void main(String[] args) {
        // Declarar e criar
        int[][] matriz = new int[3][3]; // 3 linhas, 3 colunas
        //Declarar com valores
        int[][] matrizz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Acessar elemento
        System.out.println(matriz[0][0]); // linha 0, coluna 0 = 0
        System.out.println(matrizz[1][2]);// linha 1, coluna 2 = 6
        System.out.println("----------------------------------------\n");
        //Alterar elemento
        matriz[0][0] = 99;
        matrizz[1][1] = 99;
        System.out.println("Elemento alterado: "+matriz[0][0]); // linha 0, coluna 0 = 99
        System.out.println("Elemento alterado: "+matrizz[1][1]);// linha 1, coluna 1 = 99
        System.out.println("----------------------------------------\n");
        //Tamanho
        System.out.println(matriz.length); // linhas
        System.out.println(matrizz[0].length); // colunas
        System.out.println("----------------------------------------\n");
        // Percorrer com for
        // O for duplo é o padrão — o i controla a linha, o j controla a coluna.
        for (int i = 0; i < matrizz.length; i++) {
            for (int j = 0; j < matrizz[i].length; j++) {
                System.out.print(matrizz[i][j]);
            }
            System.out.println(); // pula linha após cada linha da matriz
        }
        System.out.println("----------------------------------------\n");
        double[][] notaAluno = {
                {7.5, 8.5, 6.2}, // aluno 1
                {5.6, 9.0, 8.1}  // aluno 2
        };
        for (int i = 0; i < notaAluno.length; i++) {
            for (int j = 0; j < notaAluno[i].length; j++) {
                System.out.print(notaAluno[i][j] + " ");
            }
            System.out.println();
        }System.out.println("\nNota aluno: " + notaAluno[1][2]);

        System.out.println("----------------------------------------\n");
        String[] times = {"Flamengo", "Santos", "Palmeiras", "Curitiba", "Gremio"};
        int[] pontos = {80, 70, 82, 55, 70};

        for (int x = 0; x < times.length; x++) {
            System.out.println(times[x]);
        }
        System.out.println("----------------------------------------");
        for (int y = 0; y < pontos.length; y++) {
            System.out.println(pontos[y]);
        }
        System.out.println("----------------------------------------\n");
        for (int i = 0; i < times.length; i ++) {
            System.out.println(times[i] + " " + pontos[i]);
        }
        System.out.println("----------------------------------------\n");
        int[][] intMatriz = {
                {02, 40, 12},
                {-30, -04, 80},
                {05, 95, 100}
        };
        for (int x = 0; x < intMatriz.length; x++) {
            for (int w = 0; w < intMatriz[x].length; w++) {
                if (intMatriz[x][w] > 5 ) {
                    System.out.println(intMatriz[x][w]);
                }
            }
        }
    }
}
