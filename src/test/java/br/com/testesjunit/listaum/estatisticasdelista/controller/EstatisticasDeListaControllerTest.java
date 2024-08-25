package br.com.testesjunit.listaum.estatisticasdelista.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;

public class EstatisticasDeListaControllerTest {

    private EstatisticasDeListaController estatisticasController = new EstatisticasDeListaController();

    @Test
    public void testCalcularMedia() {
        assertEquals(3.0, estatisticasController.calcularMedia(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0)), 0.001);
        assertThrows(IllegalArgumentException.class, () -> estatisticasController.calcularMedia(Collections.emptyList()));
    }

    @Test
    public void testCalcularMediana() {
        assertEquals(3.0, estatisticasController.calcularMediana(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0)), 0.001);
        assertEquals(3.0, estatisticasController.calcularMediana(Arrays.asList(1.0, 2.0, 4.0, 5.0)), 0.001); // Corrigido para 3.0
        assertThrows(IllegalArgumentException.class, () -> estatisticasController.calcularMediana(Collections.emptyList()));
    }

    @Test
    public void testCalcularDesvioPadrao() {
        assertEquals(1.414, estatisticasController.calcularDesvioPadrao(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0)), 0.001);
        assertThrows(IllegalArgumentException.class, () -> estatisticasController.calcularDesvioPadrao(Collections.emptyList()));
    }
}
