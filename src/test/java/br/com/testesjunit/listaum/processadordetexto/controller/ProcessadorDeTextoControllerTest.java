package br.com.testesjunit.listaum.processadordetexto.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProcessadorDeTextoControllerTest {

    private ProcessadorDeTextoController processadorController = new ProcessadorDeTextoController();

    @Test
    public void testInverterPalavras() {
        assertEquals("mundo olá", processadorController.inverterPalavras("olá mundo"));
        assertEquals("", processadorController.inverterPalavras(""));
        assertNull(processadorController.inverterPalavras(null));
    }

    @Test
    public void testSubstituirPalavras() {
        assertEquals("olá universo", processadorController.substituirPalavras("olá mundo", "mundo", "universo"));
        assertEquals("olá mundo", processadorController.substituirPalavras("olá mundo", "planeta", "universo"));
        assertNull(processadorController.substituirPalavras(null, "mundo", "universo"));
    }

    @Test
    public void testContarOcorrenciasDePalavra() {
        assertEquals(2, processadorController.contarOcorrenciasDePalavra("olá mundo olá", "olá"));
        assertEquals(0, processadorController.contarOcorrenciasDePalavra("olá mundo", "universo"));
        assertEquals(0, processadorController.contarOcorrenciasDePalavra("", "olá"));
        assertEquals(0, processadorController.contarOcorrenciasDePalavra(null, "olá"));
    }
}
