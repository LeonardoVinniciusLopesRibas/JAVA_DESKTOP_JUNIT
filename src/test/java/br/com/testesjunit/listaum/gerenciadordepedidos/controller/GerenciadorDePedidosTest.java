package br.com.testesjunit.listaum.gerenciadordepedidos.controller;

import br.com.testesjunit.listaum.gerenciadordepedidos.model.ItemPedido;
import br.com.testesjunit.listaum.gerenciadordepedidos.model.Pedido;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class GerenciadorDePedidosTest {

    private GerenciadorDePedidos gerenciador = new GerenciadorDePedidos();

    @Test
    public void testAdicionarPedido() {
        Pedido pedido = new Pedido(1, "João");
        gerenciador.adicionarPedido(pedido);
        assertEquals(1, gerenciador.listarPedidosPorCliente("João").size());
    }

    @Test
    public void testCalcularValorTotal() {
        Pedido pedido = new Pedido(1, "João");
        pedido.adicionarItem(new ItemPedido("Produto A", 10.0, 2));
        pedido.adicionarItem(new ItemPedido("Produto B", 20.0, 1));
        gerenciador.adicionarPedido(pedido);
        assertEquals(40.0, gerenciador.calcularValorTotal(1), 0.001);
    }

    @Test
    public void testListarPedidosPorCliente() {
        Pedido pedido1 = new Pedido(1, "João");
        Pedido pedido2 = new Pedido(2, "Maria");
        gerenciador.adicionarPedido(pedido1);
        gerenciador.adicionarPedido(pedido2);
        List<Pedido> pedidosJoao = gerenciador.listarPedidosPorCliente("João");
        assertEquals(1, pedidosJoao.size());
        assertEquals("João", pedidosJoao.get(0).getNomeCliente());
    }

    @Test
    public void testCalcularValorTotalPedidoInexistente() {
        assertThrows(IllegalArgumentException.class, () -> gerenciador.calcularValorTotal(99));
    }
}
