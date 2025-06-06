package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import basePaes.*;

public class PaoTeste {

    @Test
    public void testPaoIntegralNome() {
        Pao pao = new PaoIntegral();
        assertEquals("Pao integral", pao.getTipoPao());
        assertNotEquals("Pao frances", pao.getTipoPao());
    }

    @Test
    public void testPaoFrancesNome() {
        Pao pao = new PaoFrances();
        assertEquals("Pao frances", pao.getTipoPao());
        assertNotEquals("Pao bola", pao.getTipoPao());
    }

    @Test
    public void testPaoBolaNome() {
        Pao pao = new PaoBola();
        assertEquals("Pao bola", pao.getTipoPao());
        assertNotEquals("Pao integral", pao.getTipoPao());
    }
}
