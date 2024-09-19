import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    public void testSingletonUnicaInstancia() {
        Singleton instancia1 = Singleton.getInstancia();
        Singleton instancia2 = Singleton.getInstancia();
        
        // Ambas instancias deberían ser la misma
        assertSame(instancia1, instancia2);
    }

    @Test
    public void testNoEsNull() {
        Singleton instancia = Singleton.getInstancia();
        
        // La instancia no debe ser null
        assertNotNull(instancia);
    }
}

/**
 * 
 * public class Singleton {
    private static Singleton instancia;

    private Singleton() {}

    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
 */