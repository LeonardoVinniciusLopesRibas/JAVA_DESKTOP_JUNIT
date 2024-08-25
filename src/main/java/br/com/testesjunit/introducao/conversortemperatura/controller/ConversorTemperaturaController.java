package br.com.testesjunit.introducao.conversortemperatura.controller;

import br.com.testesjunit.introducao.conversortemperatura.model.ConversorTemperatura;

public class ConversorTemperaturaController {

    private ConversorTemperatura conversor = new ConversorTemperatura();

    public double celsiusParaFahrenheit(double celsius) {
        return conversor.celsiusParaFahrenheit(celsius);
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return conversor.fahrenheitParaCelsius(fahrenheit);
    }

    public double celsiusParaKelvin(double celsius) {
        return conversor.celsiusParaKelvin(celsius);
    }
}
