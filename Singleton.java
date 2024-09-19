public class Singleton {
    // 1. Crear una instancia estática privada de la clase Singleton
    private static Singleton instanciaUnica;

    // 2. Constructor privado para evitar la creación de instancias fuera de la clase
    private Singleton() {
        // Aquí pueden ir otras inicializaciones si es necesario
    }

    // 3. Método público estático que devuelve la única instancia de la clase
    public static Singleton obtenerInstancia() {
        if (instanciaUnica == null) {
            // Crear la instancia solo si no existe
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    // Método de ejemplo
    public void mostrarMensaje() {
        System.out.println("Este es un Singleton!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Intentar obtener la instancia única del Singleton
        Singleton singleton = Singleton.obtenerInstancia();

        // Llamar a un método en la instancia
        singleton.mostrarMensaje();
    }
}

//El patrón de diseño Singleton asegura que una clase tenga una 
//única instancia y que ésta sea accesible de manera global. 
//Este patrón es útil cuando solo se necesita un objeto de una clase, 
//por ejemplo, para manejar conexiones a bases de datos o registros de eventos.
