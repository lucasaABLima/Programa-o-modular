import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    public void setUp() throws Exception{
        pessoa = new Pessoa();
    }

    @Test
    public void testeEMaiorDeIdade() {
        pessoa.setIdade(18);
        assertTrue(pessoa.eMaiorDeIdade());
        pessoa.setIdade(17);
        assertFalse(pessoa.eMaiorDeIdade());
    }
}