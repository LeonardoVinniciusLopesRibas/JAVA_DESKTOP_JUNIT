package br.com.testesjunit.listaum.estatisticasdelista.controller;

import br.com.testesjunit.listaum.estatisticasdelista.model.EstatisticaDeLista;

import java.util.List;

public class EstatisticasDeListaController {

    private EstatisticaDeLista estatisticas = new EstatisticaDeLista();

    public double calcularMedia(List<Double> numeros) {
        return estatisticas.calcularMedia(numeros);
    }

    public double calcularMediana(List<Double> numeros) {
        return estatisticas.calcularMediana(numeros);
    }

    public double calcularDesvioPadrao(List<Double> numeros) {
        return estatisticas.calcularDesvioPadrao(numeros);
    }
}
