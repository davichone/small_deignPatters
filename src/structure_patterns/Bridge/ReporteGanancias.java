package structure_patterns.Bridge;

public class ReporteGanancias extends Reporte {

    public ReporteGanancias(FormatoExportacion formato) {
        super(formato);
    }

    @Override
    public void procesarYExportar() {
        String ganancias = "hoy se gano 200 soles";
        formato.generarArchivo("Reporte Ganancias -> " + ganancias);
    }

}
