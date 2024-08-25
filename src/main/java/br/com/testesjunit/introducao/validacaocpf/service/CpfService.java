package br.com.testesjunit.introducao.validacaocpf.service;

import br.com.testesjunit.introducao.validacaocpf.model.Cpf;

public class CpfService {

    public boolean validaCpf(Cpf cpf) {
        if (cpf == null || cpf.getCpf() == null || cpf.getCpf().isEmpty()) {
            return false;
        }

        String cpfSemFormatacao = cpf.getCpf().replaceAll("[^\\d]", "");

        if (cpfSemFormatacao.length() != 11) {
            return false;
        }
        
        if (cpfSemFormatacao.matches("(\\d)\\1{10}")) {
            return false;
        }

        int[] digitos = new int[11];
        for (int i = 0; i < 11; i++) {
            digitos[i] = Integer.parseInt(cpfSemFormatacao.substring(i, i + 1));
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += digitos[i] * (10 - i);
        }
        int primeiroDigitoVerificador = 11 - (soma % 11);
        if (primeiroDigitoVerificador >= 10) {
            primeiroDigitoVerificador = 0;
        }

        if (digitos[9] != primeiroDigitoVerificador) {
            return false;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += digitos[i] * (11 - i);
        }
        int segundoDigitoVerificador = 11 - (soma % 11);
        if (segundoDigitoVerificador >= 10) {
            segundoDigitoVerificador = 0;
        }

        return digitos[10] == segundoDigitoVerificador;
    }
}
