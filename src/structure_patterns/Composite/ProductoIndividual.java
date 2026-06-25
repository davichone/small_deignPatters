package structure_patterns.Composite;
// Esta clase representa a los elementos individuales (No tienen hijos)
public class ProductoIndividual implements Cotizable {
    // private String nombre;
    private double precio;

    public ProductoIndividual(String nombre, double precio) {
        /* this.nombre = nombre; */
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        // Como es una hoja, su precio total es simplemente su propio precio base
        return this.precio;
    }
}
