package br.com.testesjunit.listaum.calculadoraavancada.controller;

import br.com.testesjunit.listaum.calculadoraavancada.model.CalculadoraAvancada;

public class CalculadoraAvancadaController {

    private CalculadoraAvancada calculadora = new CalculadoraAvancada();

    public double potencia(double base, double expoente) {
        return calculadora.potencia(base, expoente);
    }

    public double raizQuadrada(double numero) {
        return calculadora.raizQuadrada(numero);
    }

    public double logaritmoNatural(double numero) {
        return calculadora.logaritmoNatural(numero);
    }
}
