package padroesestruturais.facade;

public class Detran extends Setor {

    private static Detran detran = new Detran();

    private Detran() {};

    public static Detran getInstancia() {
        return detran;
    }
}
