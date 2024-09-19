import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    public void testVentanaSimple() {
        Ventana ventana = new VentanaSimple();
        assertEquals("Dibujando una ventana simple.", ventana.dibujar());
    }

    @Test
    public void testVentanaConBorde() {
        Ventana ventanaConBorde = new BordeDecorador(new VentanaSimple());
        assertEquals("Dibujando una ventana simple. Añadiendo un borde a la ventana.", ventanaConBorde.dibujar());
    }
}

/**
 * 
 * interface Ventana {
    String dibujar();
}

class VentanaSimple implements Ventana {
    @Override
    public String dibujar() {
        return "Dibujando una ventana simple.";
    }
}

abstract class DecoradorVentana implements Ventana {
    protected Ventana ventanaDecorada;

    public DecoradorVentana(Ventana ventana) {
        this.ventanaDecorada = ventana;
    }

    @Override
    public String dibujar() {
        return ventanaDecorada.dibujar();
    }
}

class BordeDecorador extends DecoradorVentana {
    public BordeDecorador(Ventana ventana) {
        super(ventana);
    }

    @Override
    public String dibujar() {
        return super.dibujar() + " Añadiendo un borde a la ventana.";
    }
}
 */
