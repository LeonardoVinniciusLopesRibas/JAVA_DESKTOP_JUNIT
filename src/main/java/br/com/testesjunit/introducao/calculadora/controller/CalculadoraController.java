package br.com.testesjunit.introducao.calculadora.controller;

import br.com.testesjunit.introducao.calculadora.model.Calculadora;

public class CalculadoraController {

    private Calculadora calculadora = new Calculadora();

    public int soma(int a, int b) {
        return calculadora.soma(a, b);
    }

    public int subtracao(int a, int b) {
        return calculadora.subtracao(a, b);
    }

    public int multiplicacao(int a, int b) {
        return calculadora.multiplicacao(a, b);
    }

    public int divisao(int a, int b) {
        return calculadora.divisao(a, b);
    }
}
