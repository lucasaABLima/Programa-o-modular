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
        d = new Data(1, 1, 2000);
        d.adicionaDias(1);
        assertEquals(2, d.getDia(), "Dias");
        assertEquals(1, d.getMes(), "Meses");
        assertEquals(2000, d.getAno(), "Anos");
    }

    @Test
    void testAdicionaDias_proximoMes() {
        d = new Data(1, 1, 2000);
        d.adicionaDias(31);
        assertEquals(1, d.getDia(), "Dias");
        assertEquals(2, d.getMes(), "Meses");
        assertEquals(2000, d.getAno(), "Anos");
    }

    @Test
    void testAdicionaDias_proximoAno() {
        d = new Data(20, 12, 2000);
        d.adicionaDias(12);
        assertEquals(1, d.getDia(), "Dias");
        assertEquals(1, d.getMes(), "Meses");
        assertEquals(2001, d.getAno(), "Anos");
    }

    @Test
    void testDiasNoMes() {
        d = new Data(1, 1, 2000);
        assertEquals(31, d.diasNoMes(), "Teste janeira");
        d.setMes(4);
        assertEquals(30, d.diasNoMes(), "Teste abril");
        d.setMes(2);
        assertEquals(29, d.diasNoMes(), "Teste fevereiro bisexto");
        d.setAno(2001);
        assertEquals(28, d.diasNoMes(), "Teste fevereiro não bisexto");
    }

    @Test
    void testDiaDaSemana() {
        d = new Data(1, 1, 2000);
        assertEquals("sábado", d.diaDaSemana());
    }

    @Test
    void testPorExtenso(){
        d = new Data(1, 1, 2000);
        assertEquals("1 de janeiro de 2000", d.porExtenso(), "Para janeiro");
        d.setMes(4);
        assertEquals("1 de abril de 2000", d.porExtenso(), "Para abril");
    }

}