package br.com.testesjunit.listaum.gerenciadordepedidos.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id;
    private String nomeCliente;
    private List<ItemPedido> itens = new ArrayList<>();

    public Pedido(int id, String nomeCliente) {
        this.id = id;
        this.nomeCliente = nomeCliente;
    }

    public int getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }
}
