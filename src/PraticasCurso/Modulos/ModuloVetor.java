package PraticasCurso.Modulos;

public class ModuloVetor {
    public static void main(String[] args) {

        //VETOR - Variavel que guarda varios valores do mesmo tipo, em sequência e tamanho fixo.

        // Declarar e criar
        String[] cidades = new String[10]; // 10 caixas vazias
        cidades[0] = "Maringá";
        cidades[1] = "Blumenau";
        cidades[2] = "Curitiba";
        cidades[3] = "Florianópolis";
        cidades[4] = "Pato branco";
        cidades[5] = "Itú";
        cidades[6] = "Penha";
        cidades[7] = "Prudentópolis";
        cidades[8] = "Rio branco";
        cidades[9] = "Loanda";
        System.out.println("----------------------------");

        //Declarar com valores
        String[] nomes = {"ana", "bia", "luiz", "josé", "joão"};
        System.out.println("----------------------------");

        //Acessar umna posição
        System.out.println(cidades[0]);
        System.out.println(nomes[2]);
        System.out.println("----------------------------");

        //Tamanho do vetor
        System.out.println(cidades.length);
        System.out.println(nomes.length);
        System.out.println("----------------------------");

        // Loop + vetor = imprime todas as cidades
        for (int i = 0; i < cidades.length; i++){
            System.out.println(cidades[i]);
        }
        System.out.println("----------------------------");

        // usando for each para verificar a lista.
        for (String obj : cidades) {
            System.out.println(obj);
        }
        System.out.println("----------------------------");

        // Imprimir nomes acima de 7 letras.
        for (String obj2 : cidades){
            if (obj2.length() > 7) {
                System.out.println(obj2);
            }
        }
    }
}