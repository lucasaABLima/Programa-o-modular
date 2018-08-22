import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversorTest {

    Conversor conv;

    @BeforeEach
    public void setUp() throws Exception {
        conv = new Conversor();
    }

    @Test
    public void testConverterPesparaMetros() {
        assertEquals(3, conv.converterPesParaMetros(10));
    }

    @Test
    public void testConverterPesparaPolegadas() {
        assertEquals(120, conv.converterPesParaPolegadas(10));
    }

    @Test
    public void testConverterPesparaCentimetros() {
        assertEquals(305, conv.converterPesParaCentimetros(10));
    }

    @Test
    public void testConverterPolegadasparaMetros() {
        assertEquals(3, conv.converterPolegadasParaMetros(100));
    }

    @Test
    public void testConverterPolegadasparaPes() {
        assertEquals(1, conv.converterPolegadasParaPes(10));
    }

    @Test
    public void testConverterPolegadasparaCentimetros() {
        assertEquals(25, conv.converterPolegadasParaCentimetros(10));
    }

    @Test
    public void testConverterMetrosParaPes() {
        assertEquals(33, conv.converterMetrosParaPes(10));
    }

    @Test
    public void testConverterMetrosParaPolegadas() {
        assertEquals(394, conv.converterMetrosParaPolegadas(10));
    }

    @Test
    public void testConverterMetrosParaCentimetros() {
        assertEquals(1000, conv.converterMetrosParaCentimetros(10));
    }

    @Test
    public void testConverterCentimetrosParaPes() {
        assertEquals(3, conv.converterCentimetrosParaPes(100));
    }

    @Test
    public void testConverterCentimetrosParaPolegadas() {
        assertEquals(39, conv.converterCentimetrosParaPolegadas(100));
    }

    @Test
    public void testConverterCentimetrosParaMetros() {
        assertEquals(1, conv.converterCentimetrosParaMetros(100));
    }

}