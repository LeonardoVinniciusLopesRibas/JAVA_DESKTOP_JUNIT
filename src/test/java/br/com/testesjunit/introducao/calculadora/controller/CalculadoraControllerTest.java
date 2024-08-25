package br.com.testesjunit.introducao.calculadora.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraControllerTest {

    private CalculadoraController calculadoraController = new CalculadoraController();

    @Test
    public void testSoma() {
        assertEquals(5, calculadoraController.soma(2, 3));
        assertEquals(0, calculadoraController.soma(-2, 2));
    }

    @Test
    public void testSubtracao() {
        assertEquals(1, calculadoraController.subtracao(3, 2));
        assertEquals(-4, calculadoraController.subtracao(-2, 2));
    }

    @Test
    public void testMultiplicacao() {
        assertEquals(6, calculadoraController.multiplicacao(2, 3));
        assertEquals(0, calculadoraController.multiplicacao(0, 10));
    }

    @Test
    public void testDivisao() {
        assertEquals(2, calculadoraController.divisao(6, 3));
        assertThrows(IllegalArgumentException.class, () -> calculadoraController.divisao(1, 0));
    }
}
