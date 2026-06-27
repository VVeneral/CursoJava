package PraticasCurso.NovosExercicios.POO;

/**
 * Modificadores de Acesso
 *
 * 1. public ----------------------------------------------- menos restritivo.
 *    - acessível de qualquer lugar
 *
 * 2. protected
 *    - acessível na própria classe
 *    - no mesmo pacote
 *    - nas subclasses
 *
 * 3. default (package-private)
 *    - acessível apenas dentro do mesmo pacote
 *
 *  4. private --------------------------------------------- mais restritivo
 *    - acessível apenas dentro da própria classe
 *
 *//////////////////////////////////////////////////////////////////////////////


/**
 * PUBLIC
 *
 * É o modificador menos restritivo.
 * Pode ser acessado de qualquer lugar do projeto.
 */
public class ModificadoresDeAcesso {
    public String modificadorAcesso;
        public void modifica () {
            System.out.println("Modificando");
        }
}


/**
 * PROTECTED
 *
 * Pode ser acessado:
 * - pela própria classe;
 * - por outras classes do mesmo pacote;
 * - pelas subclasses, mesmo em outros pacotes.
 *
 * É muito utilizado quando há herança.
 */
class Animais {
    protected void correm() {
        System.out.println("Correndo...");
    }
}
class Cachorro extends Animais {
    void teste() {
        correm(); // permitido
    }
}


/**
 * DEFAULT (package-private)
 *
 * Quando nenhum modificador é informado.
 * Pode ser acessado apenas por classes do mesmo pacote.
 */
class Crianca {
    String nome;
    void brincar() {
    }
}


/**
 * PRIVATE
 *
 * O mais restritivo,
 * Só pode ser acessado dentro da própria classe.
 */
class Gente {

    private String sexo;

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }
}

