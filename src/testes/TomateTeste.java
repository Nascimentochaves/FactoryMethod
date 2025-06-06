package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import baseTomates.*;

public class TomateTeste {

    @Test
    public void testTomatePadraoNome() {
        Tomate tomate = new TomateNormal();
        assertEquals("Tomate normal", tomate.getTipoTomate());
        assertNotEquals("Tomate cereja", tomate.getTipoTomate());
    }
}
