package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveRetornarPendenciaDetranAluguel() {
        Cliente cliente = new Cliente();
        Detran.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.alugarCarro());
    }

    @Test
    void deveRetornarPendenciaFinanceiroAluguel() {
        Cliente cliente = new Cliente();
        Financeiro.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.alugarCarro());
    }

    @Test
    void deveRetornarPendenciaSeguradoraAluguel() {
        Cliente cliente = new Cliente();
        Seguradora.getInstancia().addClientePendente(cliente);

        assertEquals(false, cliente.alugarCarro());
    }

    @Test
    void deveRetornarClienteSemPendenciaAluguel() {
        Cliente cliente = new Cliente();

        assertEquals(true, cliente.alugarCarro());
    }

}
