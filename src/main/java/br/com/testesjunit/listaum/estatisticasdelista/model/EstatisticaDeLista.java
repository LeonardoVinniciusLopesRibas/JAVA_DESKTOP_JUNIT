package br.com.testesjunit.listaum.estatisticasdelista.model;

import java.util.Collections;
import java.util.List;

public class EstatisticaDeLista {

    public double calcularMedia(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode estar vazia.");
        }
        return numeros.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }

    public double calcularMediana(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode estar vazia.");
        }
        Collections.sort(numeros);
        int meio = numeros.size() / 2;
        if (numeros.size() % 2 == 0) {
            return (numeros.get(meio - 1) + numeros.get(meio)) / 2.0;
        } else {
            return numeros.get(meio);
        }
    }

    public double calcularDesvioPadrao(List<Double> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode estar vazia.");
        }
        double media = calcularMedia(numeros);
        double variancia = numeros.stream()
                .mapToDouble(num -> Math.pow(num - media, 2))
                .average().orElse(0.0);
        return Math.sqrt(variancia);
    }
}
