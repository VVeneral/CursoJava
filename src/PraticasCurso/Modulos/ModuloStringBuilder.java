package PraticasCurso.Modulos;

public class ModuloStringBuilder {

    public static void main(String[] args) {

        // String em java é imutavel - uma vez criada, não muda. Quando fazemos "a" + "b" + "c". o java cria um objeto para cada um.
        // StringBuilder é um String mutável - você vai montando no mesmo objeto e só no final vira String.

        // Métodos mais usados:

//		 sb.append("texto");  --------  adiciona no final
//		 sb.insert(0, "inicio");  ----  insere numa posição
//		 sb.delete(0, 3);  -----------  remove trecho
//		 sb.reverse();  --------------  inverte
//		 sb.length();  ---------------  tamanho
//		 sb.toString();  -------------  converte para string


        //Exemplo simples

        StringBuilder sb = new StringBuilder();

        sb.append("Vinicius");
        sb.append(" e ");
        sb.append("Kelly");

        System.out.println(sb.toString());


        //##### Exemplo com loop #####

        // Com String normal - cria 10 obj na memória
        String resultado = "";

        for (int i = 1; i <= 10; i++) {
            resultado +=i + ", ";
        }
        System.out.println(resultado);

        // Com StringBuilder - cria 1 obj
        StringBuilder sb2 = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            sb2.append(i);
            sb2.append(", ");
        }
        System.out.println(sb2.toString());


        // no mercado de trabalho, o uso mais comum é montar queries, relatórios ou mensagem em loop.

        StringBuilder sb3 = new StringBuilder();
        sb3.append("SELECT * FROM pedidos WHERE ");

        Object filtrosStatus = null;
        Object filtroCliente = null;

        if (filtrosStatus != null) {
            sb3.append("cliente_id '").append(filtrosStatus).append("' AND ");
        }
        if (filtroCliente != null) {
            sb3.append("cliente_id = '").append(filtroCliente);
        }
        String query = sb3.toString();

    }
}














