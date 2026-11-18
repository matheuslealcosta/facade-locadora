package padroesestruturais.facade;

public class Cliente {

    public boolean alugarCarro() {
        return LocadoraFacade.verificarPendenciasAluguel(this);
    }
}
