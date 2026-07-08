package PraticasCurso.NovosExercicios.Interfaces;

/**
 * INTERFACES
 *
 * Interface defina um contrato que as outras classes devem cumprimir
 * Não dita como uma tarefa devew ser feita, mas quais devem.
 *
 * " Qualquer classe que implementar essa ‘interface’ será obrigada a possuir determinados métodos. "
 *
 * EXEMPLO REAL
 *
 * Imagine um sistema que precisa importar notas de origens diferentes.
 * Em vez de criar uma classe importar notasp ara cara origem diferente, criaremos um contrato.
 *      importarNotas();
 */


public class ExemploInterfaces {

    interface ImportarNotas {
        void importar();
    }

    static class ImportarTmi implements ImportarNotas {

        @Override
        public void importar() {
            System.out.println("Importando notas");
        }
    }

    static class ImportarEmail implements ImportarNotas {

        @Override
        public void importar() {
            System.out.println("Importando e-mail");
        }
    }
    public static void main(String[] args) {
        ImportarEmail email = new ImportarEmail();
        ImportarTmi tmi = new ImportarTmi();

        email.importar();
        tmi.importar();

    }
}
