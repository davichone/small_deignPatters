package structure_patterns.Bridge;

public class ReporteRRHH extends Reporte {

    private double gasto = 0;

    public ReporteRRHH(FormatoExportacion formato) {
        super(formato);
    }

    public void setGastoPlanilla(double gasto) {
        this.gasto = gasto;
        System.out.println("gasto agregado");
    }

    @Override
    public void procesarYExportar() {
        if (this.gasto <= 0) {
            System.out.println("falta agregar el gasto");
            return;
        }

        formato.generarArchivo("Total de gasto Planilla:" + this.gasto);

    }

}
