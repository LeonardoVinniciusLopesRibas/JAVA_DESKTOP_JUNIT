package br.com.testesjunit.listaum.gerenciadorcontas.controller;

import br.com.testesjunit.listaum.gerenciadorcontas.model.Conta;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeContas {

    private List<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarContaPorNumero(int numero) {
        return contas.stream()
                     .filter(conta -> conta.getNumero() == numero)
                     .findFirst()
                     .orElse(null);
    }

    public void transferir(int numeroContaOrigem, int numeroContaDestino, double valor) {
        Conta origem = buscarContaPorNumero(numeroContaOrigem);
        Conta destino = buscarContaPorNumero(numeroContaDestino);

        if (origem == null || destino == null) {
            throw new IllegalArgumentException("Conta de origem ou destino inexistente.");
        }

        origem.sacar(valor);
        destino.depositar(valor);
    }
}