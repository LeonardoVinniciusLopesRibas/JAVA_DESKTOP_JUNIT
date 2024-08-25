package br.com.testesjunit.listaum.calculadoraavancada.model;

public class CalculadoraAvancada {

    public double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public double raizQuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Não é possível calcular a raiz quadrada de um número negativo.");
        }
        return Math.sqrt(numero);
    }

    public double logaritmoNatural(double numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("O logaritmo natural só é definido para números positivos.");
        }
        return Math.log(numero);
    }
}
