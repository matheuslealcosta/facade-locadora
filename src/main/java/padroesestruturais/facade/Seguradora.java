package padroesestruturais.facade;

public class Seguradora extends Setor {

    private static Seguradora seguradora = new Seguradora();

    private Seguradora() {};

    public static Seguradora getInstancia() {
        return seguradora;
    }
}
