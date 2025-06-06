package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import baseQueijos.*;

public class QueijoTeste {

    @Test
    public void testQueijoPratoNome() {
        Queijo queijo = new QueijoPrato();
        assertEquals("Queijo prato", queijo.getTipoQueijo());
        assertNotEquals("Queijo mussarela", queijo.getTipoQueijo());
    }

    @Test
    public void testQueijoMussarelaNome() {
        Queijo queijo = new QueijoMussarela();
        assertEquals("Queijo mussarela", queijo.getTipoQueijo());
        assertNotEquals("Queijo cheddar", queijo.getTipoQueijo());
    }

    @Test
    public void testQueijoCheddarNome() {
        Queijo queijo = new QueijoCheddar();
        assertEquals("Queijo cheddar", queijo.getTipoQueijo());
        assertNotEquals("Queijo prato", queijo.getTipoQueijo());
    }
}
