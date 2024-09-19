// Interfaz Producto
interface Producto {
    void mostrarTipo();
}

// Clase concreta ProductoA
class ProductoA implements Producto {
    @Override
    public void mostrarTipo() {
        System.out.println("Soy el Producto A");
    }
}

// Clase concreta ProductoB
class ProductoB implements Producto {
    @Override
    public void mostrarTipo() {
        System.out.println("Soy el Producto B");
    }
}

// Fábrica que crea los productos
class FabricaDeProductos {
    // Método de fábrica que crea objetos dependiendo del tipo
    public Producto crearProducto(String tipo) {
        if (tipo.equalsIgnoreCase("A")) {
            return new ProductoA();
        } else if (tipo.equalsIgnoreCase("B")) {
            return new ProductoB();
        }
        return null; // Retorna null si no coincide con ningún tipo
    }
}

public class Factory {
    public static void main(String[] args) {
        // Crear la fábrica
        FabricaDeProductos fabrica = new FabricaDeProductos();
        
        // Crear productos usando la fábrica
        Producto producto1 = fabrica.crearProducto("A");
        Producto producto2 = fabrica.crearProducto("B");
        
        // Usar los productos
        if (producto1 != null) {
            producto1.mostrarTipo(); // Output: Soy el Producto A
        }
        if (producto2 != null) {
            producto2.mostrarTipo(); // Output: Soy el Producto B
        }
    }
}
/**El patrón de diseño Factory es un patrón creacional que proporciona una 
interfaz para crear objetos en una superclase, pero permite a las subclases 
alterar el tipo de objetos que se crearán. Este patrón es útil cuando tenemos varias clases que comparten una interfaz común, 
pero los detalles específicos de la creación de instancias pueden variar según la situación.
*/
/** Interfaz Producto: Define el contrato común que implementan todos los productos.
Clases concretas ProductoA y ProductoB: Implementan la interfaz Producto, y cada una tiene su propia lógica.
Clase FabricaDeProductos: Contiene el método crearProducto, que recibe un parámetro (en este caso, el tipo de producto) y devuelve una instancia del producto correspondiente.
Método crearProducto: Este es el "Factory Method", el cual decide qué tipo de producto crear dependiendo del parámetro recibido. */