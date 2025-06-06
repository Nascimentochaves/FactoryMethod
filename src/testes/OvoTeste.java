package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import baseOvo.*;

public class OvoTeste {

    @Test
    public void testOvoCaipiraNome() {
        Ovo ovo = new OvoCapoeira();
        assertEquals("Ovo de capoeira", ovo.getTipoOvo());
        assertNotEquals("Ovo de granja", ovo.getTipoOvo());
    }

    @Test
    public void testOvoGranjaNome() {
        Ovo ovo = new OvoGranja();
        assertEquals("Ovo de granja", ovo.getTipoOvo());
        assertNotEquals("Ovo capoeira", ovo.getTipoOvo());
    }
}
