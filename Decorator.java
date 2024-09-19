// Componente abstracto
interface Ventana {
    void dibujar();  // Método para dibujar la ventana
}

// Componente concreto: una ventana simple
class VentanaSimple implements Ventana {
    @Override
    public void dibujar() {
        System.out.println("Dibujando una ventana simple.");
    }
}

// Decorador abstracto que implementa la misma interfaz que la ventana
abstract class DecoradorVentana implements Ventana {
    protected Ventana ventanaDecorada;

    public DecoradorVentana(Ventana ventana) {
        this.ventanaDecorada = ventana;
    }

    @Override
    public void dibujar() {
        ventanaDecorada.dibujar();  // Delegar el comportamiento a la ventana original
    }
}

// Decorador concreto que añade un borde
class BordeDecorador extends DecoradorVentana {
    public BordeDecorador(Ventana ventana) {
        super(ventana);
    }

    @Override
    public void dibujar() {
        super.dibujar();  // Dibuja la ventana original
        dibujarBorde();   // Añade el borde
    }

    private void dibujarBorde() {
        System.out.println("Añadiendo un borde a la ventana.");
    }
}

// Decorador concreto que añade una barra de desplazamiento
class BarraDesplazamientoDecorador extends DecoradorVentana {
    public BarraDesplazamientoDecorador(Ventana ventana) {
        super(ventana);
    }

    @Override
    public void dibujar() {
        super.dibujar();  // Dibuja la ventana original
        agregarBarraDesplazamiento();  // Añade la barra de desplazamiento
    }

    private void agregarBarraDesplazamiento() {
        System.out.println("Añadiendo una barra de desplazamiento a la ventana.");
    }
}

public class Decorator {
    public static void main(String[] args) {
        // Crear una ventana simple
        Ventana ventana = new VentanaSimple();

        // Decorar la ventana con un borde
        Ventana ventanaConBorde = new BordeDecorador(ventana);

        // Decorar la ventana con borde y barra de desplazamiento
        Ventana ventanaCompleta = new BarraDesplazamientoDecorador(ventanaConBorde);

        // Dibujar la ventana decorada
        ventanaCompleta.dibujar();
    }
}

/** 
 * El patrón de diseño Decorator permite añadir funcionalidad a un 
 * objeto de manera dinámica sin modificar su estructura original. 
 * Esto se logra envolviendo el objeto original con una nueva clase
 *  que aporta características adicionales.
 */

 /**
  * 
  Componente (Ventana): La interfaz común que tanto las ventanas simples como las decoradas deben implementar.
Componente concreto (VentanaSimple): La implementación básica de una ventana.
Decorador abstracto (DecoradorVentana): Clase base que extiende la funcionalidad de las ventanas.
Decoradores concretos (BordeDecorador, BarraDesplazamientoDecorador): Añaden nuevas funcionalidades (como bordes y barras de desplazamiento) sin modificar la estructura de la ventana original.
Cliente (Main): Combina las decoraciones de manera dinámica y flexible.
  */