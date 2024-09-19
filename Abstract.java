// Producto abstracto: Botón
interface Boton {
    void render();
}

// Botón concreto para Windows
class BotonWindows implements Boton {
    @Override
    public void render() {
        System.out.println("Renderizando un botón estilo Windows.");
    }
}

// Botón concreto para MacOS
class BotonMacOS implements Boton {
    @Override
    public void render() {
        System.out.println("Renderizando un botón estilo MacOS.");
    }
}

// Fábrica abstracta
interface GUIFactory {
    Boton crearBoton();
}

// Fábrica concreta para Windows
class WindowsFactory implements GUIFactory {
    @Override
    public Boton crearBoton() {
        return new BotonWindows();
    }
}

// Fábrica concreta para MacOS
class MacOSFactory implements GUIFactory {
    @Override
    public Boton crearBoton() {
        return new BotonMacOS();
    }
}

public class Aplicacion {
    private Boton boton;

    // Constructor que recibe una fábrica para crear el botón
    public Aplicacion(GUIFactory factory) {
        boton = factory.crearBoton();
    }

    public void render() {
        boton.render();  // Llama al método render del botón
    }
}

public class Abstract {
    public static void main(String[] args) {
        GUIFactory factory;

        // Cambia esto para seleccionar el sistema operativo
        String sistemaOperativo = "Windows";  // O "MacOS"

        if (sistemaOperativo.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacOSFactory();
        }

        // Crear la aplicación con la fábrica adecuada
        Aplicacion app = new Aplicacion(factory);
        app.render();  // Renderiza el botón correspondiente
    }
}

/** El patrón de diseño Abstract Factory es una extensión del patrón 
 * Factory. Este patrón proporciona una interfaz para crear familias de 
 * objetos relacionados o dependientes sin especificar sus clases 
 * concretas. En lugar de crear objetos individuales 
 * (como en Factory Method), Abstract Factory permite crear una 
 * familia completa de productos que deben ser usados juntos y que pueden ser de diferentes tipos. 
*/

/** Producto (Boton): Una interfaz que define cómo debe comportarse un botón.
Botón concreto: Hay dos implementaciones, una para Windows y otra para MacOS.
Fábrica abstracta (GUIFactory): Define el método para crear botones.
Fábrica concreta: Hay una fábrica para Windows y otra para MacOS, cada una crea su tipo de botón.
Cliente (Aplicacion): Usa la fábrica para crear y renderizar el botón sin saber qué tipo específico de botón está creando.*/