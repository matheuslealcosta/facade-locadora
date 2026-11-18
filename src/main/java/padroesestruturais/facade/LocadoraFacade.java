package padroesestruturais.facade;

public class LocadoraFacade {

    public static boolean verificarPendenciasAluguel(Cliente cliente) {
        if (Detran.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Financeiro.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        if (Seguradora.getInstancia().verificarClienteComPendencia(cliente)) {
            return false;
        }
        return true;
    }
}
