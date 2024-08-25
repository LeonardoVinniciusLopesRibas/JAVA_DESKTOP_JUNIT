package br.com.testesjunit.listaum.gerenciadordepedidos.model;

public class ItemPedido {

    private String nomeProduto;
    private double preco;
    private int quantidade;

    public ItemPedido(String nomeProduto, double preco, int quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double calcularTotal() {
        return preco * quantidade;
    }
}
