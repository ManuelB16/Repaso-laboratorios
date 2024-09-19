import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    AnimalFactory factory = new AnimalFactory();

    @Test
    public void testCrearPerro() {
        Animal perro = factory.crearAnimal("Perro");
        assertNotNull(perro);
        assertEquals("Guau", perro.sonido());
    }

    @Test
    public void testCrearGato() {
        Animal gato = factory.crearAnimal("Gato");
        assertNotNull(gato);
        assertEquals("Miau", gato.sonido());
    }

    @Test
    public void testCrearAnimalDesconocido() {
        Animal desconocido = factory.crearAnimal("Pez");
        assertNull(desconocido);
    }
}


/**
 * 
 * interface Animal {
    String sonido();
}

class Perro implements Animal {
    @Override
    public String sonido() {
        return "Guau";
    }
}

class Gato implements Animal {
    @Override
    public String sonido() {
        return "Miau";
    }
}

class AnimalFactory {
    public Animal crearAnimal(String tipo) {
        if (tipo.equalsIgnoreCase("Perro")) {
            return new Perro();
        } else if (tipo.equalsIgnoreCase("Gato")) {
            return new Gato();
        }
        return null;
    }
}
 */