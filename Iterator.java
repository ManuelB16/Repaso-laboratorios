// Interfaz del iterador
interface Iterador {
    boolean tieneSiguiente();  // Comprueba si hay más elementos
    Object siguiente();        // Devuelve el siguiente elemento
}

// Interfaz para la colección que retornará el iterador
interface ColeccionIterable {
    Iterador crearIterador();  // Crea un iterador para recorrer la colección
}

// Clase concreta que contiene una lista de nombres
class ColeccionNombres implements ColeccionIterable {
    private String[] nombres = {"Juan", "Ana", "Pedro", "Maria"};

    @Override
    public Iterador crearIterador() {
        return new IteradorNombre();
    }

    // Clase interna que implementa el iterador para esta colección
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

public class Iterator {
    public static void main(String[] args) {
        ColeccionNombres nombres = new ColeccionNombres();
        Iterador iterador = nombres.crearIterador();

        while (iterador.tieneSiguiente()) {
            System.out.println(iterador.siguiente());
        }
    }
}

/**
 * 
 * Interfaz Iterador: Define los métodos necesarios para recorrer la colección: tieneSiguiente() y siguiente().
Interfaz ColeccionIterable: Define un método para crear un iterador, crearIterador(), que las colecciones implementarán.
Clase ColeccionNombres: Es una implementación concreta de una colección que contiene un array de nombres y puede crear su propio iterador.
Clase interna IteradorNombre: Implementa los métodos necesarios para recorrer los elementos de la colección de nombres.
Cliente (Main): Usa el iterador para recorrer la colección de nombres sin preocuparse por cómo se almacenan o manejan internamente.
El patrón Iterator permite acceder a los elementos de una colección secuencialmente sin exponer su estructura subyacente, proporcionando un recorrido uniforme para diferentes tipos de colecciones.
 */