package structure_patterns.Bridge;

// --- LA ABSTRACCIÓN (El "Qué" es el documento) ---

// 3. La Abstracción Base (Esta clase es el corazón del patrón)
public abstract class Reporte {
    // ESTE ES EL PUENTE: La abstracción contiene una referencia a la interfaz de
    // implementación
    protected FormatoExportacion formato;

    public Reporte(FormatoExportacion formato) {
        this.formato = formato;
    }

    // El método que las clases hijas deberán completar
    public abstract void procesarYExportar();
}