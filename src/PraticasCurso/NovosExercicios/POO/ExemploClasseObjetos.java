package PraticasCurso.NovosExercicios.POO;
/**
 * CLASSES E OBJETOS
 *
 * Uma classe é como uma receita de bolo.
 * Um objeto (instância) é o bolo feito a partir dessa receita.
 *
 * A classe define quais características (atributos) e comportamentos
 * (métodos) os objetos terão.
 *
 * Variáveis de instância (atributos) representam as características
 * particulares de cada objeto. Embora todos os objetos sejam criados
 * a partir da mesma classe, cada um pode possuir valores diferentes
 * para seus atributos.
 *
 * Exemplo:
 * A classe "Bolo" define que todo bolo possui sabor e peso.
 * Um objeto pode ser um bolo de chocolate com 2 kg,
 * enquanto outro pode ser um bolo de morango com 1 kg.
 */


class Bolo {
    int quantidadeAcucar = 0;
    String cobertura = "";
    String massa = "";
}

public class ExemploClasseObjetos {
    public  static void main(String[] args) {

        Bolo boloDeMorango = new Bolo();
        boloDeMorango.massa = "humida";
        boloDeMorango.quantidadeAcucar = 150;
        boloDeMorango.cobertura = "Morango";

        Bolo boloDeAvela = new Bolo();
        boloDeAvela.quantidadeAcucar = 100;
        boloDeAvela.cobertura = "Avelã";

        System.out.println(
                "Bolo sabor "
                + boloDeMorango.cobertura
                + ". Com "
                + boloDeMorango.quantidadeAcucar
                + "g de açucar"
                + " e massa "
                + boloDeMorango.massa);

        System.out.println(
                "Bolo sabor "
                + boloDeAvela.cobertura
                + ". Com "
                + boloDeAvela.quantidadeAcucar
                + "g de açucar.");

    }
}
