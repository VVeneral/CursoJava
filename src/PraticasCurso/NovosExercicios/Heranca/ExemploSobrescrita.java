package PraticasCurso.NovosExercicios.Heranca;

/*
* SOBRESCRITA (Overriding)
*
* A sobrescrita permite que uma subclasse altere o comportamento
* de um método herdado da superclasse
*
* A subclasse mantém o mesmo nome, retorno e parâmetros do método,
* mas implementa uma lógica diferente.
*
* quando o método é chamado em um objeto Cachorro,
* será executada a versão da classe Cachorro e não a da classe Animal.
*
* Principal vantagem:
* Permite que cada subclasse tenha um comportamento próprio,
* mesmo herdando o mesmo método da superclasse.
*/

class Animal {
    public void fazerSom() {
            System.out.println("Animal emite som...");
        }
}

class Cachorro extends Animal {
    public void fazerSom() {
        System.out.println("Cachorro emite som...");
    }
}

public class ExemploSobrescrita extends Cachorro {
    public static void main(String[] args) {
        Cachorro bilu = new Cachorro();
        bilu.fazerSom();
    }
}


