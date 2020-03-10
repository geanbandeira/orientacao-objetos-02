package exercicios;

import exercicios.Conta;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaTeste {
    private Conta conta1;

    @BeforeEach
    public void beforeEach() {
        conta1 = new Conta();
        conta1.setNumero(1);
        conta1.setSaldo(500.00);
        conta1.setLimite(1000.00);
    }

    @AfterEach
    public void afterEach() {
        conta1 = null;
    }

    @Test
    public void criarObjetoConta() {
        assertNotNull(conta1);
    }

    @Test
    public void presencaAtributos() {
        assertNotNull(conta1.getNumero());
        assertNotNull(conta1.getSaldo());
        assertNotNull(conta1.getLimite());
    }

    @Test
    public void metodoDepositar() {
        conta1.depositar(100.00);
        assertEquals(conta1.getSaldo(), 600.00);
    }
  
    @Test
    public void metodoSetNumero() {
        assertEquals(conta1.getNumero(), 1);
    }

    @Test
    public void metodoDepositarValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.depositar(-200.0));
        assertEquals("Valor deve ser positivo", exception.getMessage());
    }

    @Test
    public void metodoSacar() {
        conta1.sacar(100.00);
        assertEquals(conta1.getSaldo(), 400.00);
    }

    @Test
    public void metodoSacarValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.sacar(-200.0));
        assertEquals("Valor deve ser positivo", exception.getMessage());

    }

    @Test
    public void metodoSacarSaldoInsuficiente(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.sacar(3000.00));
        assertEquals("Saldo menor que limite", exception.getMessage());
    }

    @Test
    public void metodoTransferir(){
        Conta conta2 = new Conta();
        conta2.setSaldo(500.00);
        conta2.setNumero(2);
        conta1.transferir(conta2, 100.00);
      
        assertEquals(conta1.getSaldo(), 400.00);
        assertEquals(conta2.getSaldo(), 600.00);
    }

    @Test
    public void metodoSetLimite() {
        assertEquals(conta1.getLimite(), 1000.00);}

    @Test
    public void metodoGetLimite() {
        assertEquals(conta1.getLimite(), 1000.00);
    }
  
  @Test
    public void metodoTransferirValorInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.sacar(-200.00));
        assertEquals("Valor deve ser positivo", exception.getMessage());}

    @Test
    public void metodoTransferirSaldoInsuficiente() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta1.sacar(3000.00));
        assertEquals("Saldo menor que limite", exception.getMessage());
    }

}
