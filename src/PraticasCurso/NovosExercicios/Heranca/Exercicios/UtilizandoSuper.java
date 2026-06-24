package PraticasCurso.NovosExercicios.Heranca.Exercicios;

class Veiculo {
    public void acelerar() {
        System.out.println("Veiculo acelerando!");
    }
}

class Carro extends Veiculo {
    @Override
    public void acelerar() {
        super.acelerar();
        System.out.println("Carro acelerando!");
    }
}

public class UtilizandoSuper {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.acelerar();
    }
}
