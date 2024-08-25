package br.com.testesjunit.introducao.validacaocpf.controller;

import br.com.testesjunit.introducao.validacaocpf.model.Cpf;
import br.com.testesjunit.introducao.validacaocpf.service.CpfService;
import javax.swing.JOptionPane;

public class CpfController {

    private CpfService cpfService = new CpfService();
    public boolean sendCpf(Cpf cpf){
        
        boolean valido = cpfService.validaCpf(cpf);
        
        if(valido){
            JOptionPane.showMessageDialog(null, "O cpf "+cpf+" é válido!");
            return valido;
        }else{
            JOptionPane.showMessageDialog(null, "O cpf "+cpf+" é inválido!");
            return valido;
        }
        
        
    }
    
}
