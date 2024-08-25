package br.com.testesjunit.listaum.gerenciadordepedidos.controller;

import br.com.testesjunit.listaum.gerenciadordepedidos.model.Pedido;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciadorDePedidos {

    private List<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public double calcularValorTotal(int idPedido) {
        Pedido pedido = pedidos.stream()
                .filter(p -> p.getId() == idPedido)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Pedido não encontrado."));
        return pedido.getItens().stream().mapToDouble(item -> item.calcularTotal()).sum();
    }

    public List<Pedido> listarPedidosPorCliente(String nomeCliente) {
        return pedidos.stream()
                .filter(p -> p.getNomeCliente().equalsIgnoreCase(nomeCliente))
                .collect(Collectors.toList());
    }
}
