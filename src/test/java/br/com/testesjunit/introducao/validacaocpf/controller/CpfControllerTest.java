package br.com.testesjunit.introducao.validacaocpf.controller;

import br.com.testesjunit.introducao.validacaocpf.model.Cpf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CpfControllerTest {
    
    private CpfController cpfController;
    
    public CpfControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        cpfController = new CpfController();
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sendCpf method, of class CpfController.
     */
    @Test
    public void testSendCpf() {
        assertEquals(true, cpfController.sendCpf(new Cpf("09408168909")));
        assertEquals(false, cpfController.sendCpf(new Cpf("12312312312")));
        assertEquals(false, cpfController.sendCpf(new Cpf("")));
        assertEquals(false, cpfController.sendCpf(new Cpf("2323233")));
        assertEquals(true, cpfController.sendCpf(new Cpf("04689939918")));
    }
    
}
