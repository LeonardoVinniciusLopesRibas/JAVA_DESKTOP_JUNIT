package br.com.testesjunit.listaum.processadordetexto.controller;

import br.com.testesjunit.listaum.processadordetexto.model.ProcessadorDeTexto;

public class ProcessadorDeTextoController {

    private ProcessadorDeTexto processador = new ProcessadorDeTexto();

    public String inverterPalavras(String frase) {
        return processador.inverterPalavras(frase);
    }

    public String substituirPalavras(String frase, String palavraAntiga, String palavraNova) {
        return processador.substituirPalavras(frase, palavraAntiga, palavraNova);
    }

    public int contarOcorrenciasDePalavra(String frase, String palavra) {
        return processador.contarOcorrenciasDePalavra(frase, palavra);
    }
}
