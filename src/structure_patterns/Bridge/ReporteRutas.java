package structure_patterns.Bridge;

// 4. Una Abstracción Refinada (Un tipo específico de reporte)
public class ReporteRutas extends Reporte {

    public ReporteRutas(FormatoExportacion formato) {
        super(formato);
    }

    @Override
    public void procesarYExportar() {
        String dataRutas = "Camión 1: Lima-Ica | Camión 2: Lima-Piura";
        // Usamos el puente para exportar
        formato.generarArchivo("Rutas del día -> " + dataRutas);
    }
}