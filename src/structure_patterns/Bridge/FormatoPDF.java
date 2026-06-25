package structure_patterns.Bridge;

// 2. Las Implementaciones Concretas
public class FormatoPDF implements FormatoExportacion {
    @Override
    public void generarArchivo(String contenido) {
        System.out.println("📄 Generando PDF con diseño corporativo: [" + contenido + "]");
    }
}