import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTest {

    public static Data d;

    @Test
    void testEAnoBisexto() {
        d = new Data(1, 1, 2016);
        assertTrue(d.eAnoBisexto(), "Caso o ano seja bisexto");
        d.setAno(2018);
        assertFalse(d.eAnoBisexto(), "Caso o ano não seja bisexto");
    }

    @Test
    void testProximoDia() {
        d = new Data(1, 1, 2000);
        d.proximoDia();
        assertEquals(2, d.getDia());
    }
    @Test
    void testProximoDia_proximoMes() {
        d = new Data(31, 1, 2000);
        d.proximoDia();
        assertEquals(1, d.getDia());
        assertEquals(2, d.getMes());
    }
    @Test
    void testProximoDia_proximoAno() {
        d = new Data(31, 12, 2000);
        d.proximoDia();
        assertEquals(1, d.getDia());
        assertEquals(1, d.getMes());
        assertEquals(
                2001, d.getAno());
    }

    @Test
    void testAdicionaDias() {
        d = new Data(18, 8, 2018);
        d.adicionaDias(2);
        assertEquals(20, d.getDia());
    }

    @Test
    void testDiasNoMes() {
        d = new Data(18, 8, 2018);
        int dias = d.diasNoMes(d.getMes());
        assertNotNull(dias);
        if (d.getMes() == 2) {
            if (d.eAnoBisexto()) {
                assertEquals(dias, 29);
            } else {
                assertEquals(dias, 28);
            }
        } else {
            if (d.getMes() == 1 || d.getMes() == 3 || d.getMes() == 5 || d.getMes() == 7 || d.getMes() == 8 || d.getMes() == 10 || d.getMes() == 12) {
                assertEquals(dias, 31);
            } else {
                assertEquals(dias, 30);
            }
        }
    }

    @Test
    void testDiaDaSemana(){
        d = new Data(19, 8, 2018);
        assertEquals("domingo", d.diaDaSemana());
    }

}