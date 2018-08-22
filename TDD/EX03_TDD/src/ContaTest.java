import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Conta conta;

    @BeforeEach
    public void setUp() throws Exception {
        conta = new Conta();
    }

    @Test
    public void testDepositar() {
        conta.depositar(100);
        assertEquals(100, conta.getSaldo());
    }

    @Test
    public void testSacar(){
        assertFalse(conta.sacar(100));
        conta.setSaldo(1500);
        assertTrue(conta.sacar(100));
        assertEquals(1400, conta.getSaldo());
    }
}
