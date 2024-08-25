package br.com.testesjunit.listaum.gerenciadorcontas.controller;

import br.com.testesjunit.listaum.gerenciadorcontas.model.Conta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GerenciadorDeContasTest {

    private GerenciadorDeContas gerenciador = new GerenciadorDeContas();

    @Test
    public void testAdicionarConta() {
        Conta conta = new Conta(1, "João", 1000.0);
        gerenciador.adicionarConta(conta);
        assertEquals(conta, gerenciador.buscarContaPorNumero(1));
    }

    @Test
    public void testBuscarContaPorNumero() {
        Conta conta = new Conta(1, "Maria", 2000.0);
        gerenciador.adicionarConta(conta);
        assertNotNull(gerenciador.buscarContaPorNumero(1));
        assertNull(gerenciador.buscarContaPorNumero(99));
    }

    @Test
    public void testTransferir() {
        Conta conta1 = new Conta(1, "João", 1000.0);
        Conta conta2 = new Conta(2, "Maria", 2000.0);
        gerenciador.adicionarConta(conta1);
        gerenciador.adicionarConta(conta2);

        gerenciador.transferir(1, 2, 500.0);
        assertEquals(500.0, conta1.getSaldo());
        assertEquals(2500.0, conta2.getSaldo());

        assertThrows(IllegalArgumentException.class, () -> gerenciador.transferir(1, 2, 2000.0));
        assertThrows(IllegalArgumentException.class, () -> gerenciador.transferir(99, 2, 100.0));
    }
}
