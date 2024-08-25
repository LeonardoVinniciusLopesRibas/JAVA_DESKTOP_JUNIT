package br.com.testesjunit.introducao.conversortemperatura.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaControllerTest {

    private ConversorTemperaturaController conversorController = new ConversorTemperaturaController();

    @Test
    public void testCelsiusParaFahrenheit() {
        assertEquals(32, conversorController.celsiusParaFahrenheit(0), 0.001);
        assertEquals(212, conversorController.celsiusParaFahrenheit(100), 0.001);
    }

    @Test
    public void testFahrenheitParaCelsius() {
        assertEquals(0, conversorController.fahrenheitParaCelsius(32), 0.001);
        assertEquals(100, conversorController.fahrenheitParaCelsius(212), 0.001);
    }

    @Test
    public void testCelsiusParaKelvin() {
        assertEquals(273.15, conversorController.celsiusParaKelvin(0), 0.001);
        assertEquals(373.15, conversorController.celsiusParaKelvin(100), 0.001);
    }
}
