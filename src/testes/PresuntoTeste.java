package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import basePresuntos.*;

public class PresuntoTeste {

    @Test
    public void testPresuntoFrangoNome() {
        Presunto presunto = new PresuntoFrango();
        assertEquals("Presunto de frango", presunto.getTipoPresunto());
        assertNotEquals("Presunto de peru", presunto.getTipoPresunto());
    }

    @Test
    public void testPresuntoPeruNome() {
        Presunto presunto = new PresuntoPeru();
        assertEquals("Presunto de peru", presunto.getTipoPresunto());
        assertNotEquals("Presunto de frango", presunto.getTipoPresunto());
    }
}
