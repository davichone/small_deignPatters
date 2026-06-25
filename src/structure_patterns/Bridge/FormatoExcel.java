package structure_patterns.Bridge;

public class FormatoExcel implements FormatoExportacion {
    @Override
    public void generarArchivo(String contenido) {
        System.out.println("📊 Generando hoja de Excel con celdas y fórmulas: [" + contenido + "]");
    }
}