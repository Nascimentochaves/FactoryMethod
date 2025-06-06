package testes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import baseSanduiches.*;
import baseOvo.*;
import basePaes.*;
import basePresuntos.*;
import baseQueijos.*;
import baseTomates.*;

public class SanduicheTeste {

    private Sanduiche sanduiche;

    @BeforeEach
    public void setUp() {
        sanduiche = new Sanduiche() {
            @Override
            public Pao criarPao() {
                return new PaoIntegral();
            }

            @Override
            public Queijo criarQueijo() {
                return new QueijoPrato();
            }

            @Override
            public Presunto criarPresunto() {
                return new PresuntoFrango();
            }

            @Override
            public Ovo criarOvo() {
                return new OvoCapoeira();
            }

            @Override
            public Tomate criarTomate() {
                return new TomateNormal();
            }
        };
    }

    @Test
    public void testMontaSanduiche() {
        String resultado = sanduiche.montarSanduiche();
        String esperado = String.format("Sanduiche montado com %s, %s, %s, %s e %s",
                "Pao integral",
                "Queijo prato",
                "Presunto de frango",
                "Ovo de capoeira",
                "Tomate normal");

        assertEquals(esperado, resultado);
    }

    @Test
    public void testMontagemNaoRetornaNulo() {
        String resultado = sanduiche.montarSanduiche();
        assertNotNull(resultado, "A montagem do sanduíche não deve ser nula.");
    }
}
