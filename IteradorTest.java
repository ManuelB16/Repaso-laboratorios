import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IteradorTest {

    @Test
    public void testIteradorNombres() {
        ColeccionNombres nombres = new ColeccionNombres();
        Iterador iterador = nombres.crearIterador();
        
        assertTrue(iterador.tieneSiguiente());
        assertEquals("Juan", iterador.siguiente());
        assertEquals("Ana", iterador.siguiente());
        assertEquals("Pedro", iterador.siguiente());
        assertEquals("Maria", iterador.siguiente());
        assertFalse(iterador.tieneSiguiente());
    }
}

/**
 * 
 * interface Iterador {
    boolean tieneSiguiente();
    Object siguiente();
}

interface ColeccionIterable {
    Iterador crearIterador();
}

class ColeccionNombres implements ColeccionIterable {
    private String[] nombres = {"Juan", "Ana", "Pedro", "Maria"};

    @Override
    public Iterador crearIterador() {
        return new IteradorNombre();
    }

    private class IteradorNombre implements Iterador {
        int indice = 0;

        @Override
        public boolean tieneSiguiente() {
            return indice < nombres.length;
        }

        @Override
        public Object siguiente() {
            if (this.tieneSiguiente()) {
                return nombres[indice++];
            }
            return null;
        }
    }
}

 */
