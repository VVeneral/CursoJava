package PraticasCurso.NovosExercicios.Generics.Exercicios;

public class Caixa<T> {

    private T[] elementos;

    public Caixa(int capacidade) {
        elementos = (T[]) new Object[capacidade];
    }
    public void adicionar(T elemento, int indice) {
    elementos[indice] = elemento;
    }

    public T obter(int indice) {
        return elementos[indice];
    }

    public static void main(String[] args) {

        Caixa<Double> precos = new Caixa<>(5);

        precos.adicionar(5.15, 0);
        precos.adicionar(2.75, 1);
        precos.adicionar(14.20, 2);
        precos.adicionar(2.56, 3);
        precos.adicionar(55.10, 4);

        System.out.println(precos.obter(0));
        System.out.println(precos.obter(1));
        System.out.println(precos.obter(2));
        System.out.println(precos.obter(3));
        System.out.println(precos.obter(4));

    }
}
