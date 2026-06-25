package structure_patterns.Bridge;
// --- LA IMPLEMENTACIÓN (El "Cómo" se exporta) ---

// 1. La Interfaz Implementadora
public interface FormatoExportacion {
    void generarArchivo(String contenido);
}