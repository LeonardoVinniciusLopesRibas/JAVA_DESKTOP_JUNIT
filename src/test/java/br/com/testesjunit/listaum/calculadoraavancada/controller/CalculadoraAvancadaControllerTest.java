package br.com.testesjunit.listaum.calculadoraavancada.controller;

import br.com.testesjunit.listaum.calculadoraavancada.controller.CalculadoraAvancadaController;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraAvancadaControllerTest {

    private CalculadoraAvancadaController calculadoraController = new CalculadoraAvancadaController();

    @Test
    public void testPotencia() {
        assertEquals(8.0, calculadoraController.potencia(2, 3), 0.001);
    }

    @Test
    public void testRaizQuadrada() {
        assertEquals(4.0, calculadoraController.raizQuadrada(16), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calculadoraController.raizQuadrada(-1));
    }

    @Test
    public void testLogaritmoNatural() {
        assertEquals(0.0, calculadoraController.logaritmoNatural(1), 0.001);
        assertThrows(IllegalArgumentException.class, () -> calculadoraController.logaritmoNatural(0));
        assertThrows(IllegalArgumentException.class, () -> calculadoraController.logaritmoNatural(-10));
    }
}
