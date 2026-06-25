package structure_patterns.Proxy;

public class ReporteFinancieroProxy implements ReporteFinanciero {
    private String usuario;
    private ReporteFinancieroReal reporteFinancieroReal;

    public ReporteFinancieroProxy(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void mostrarBalance() {
        if (this.usuario.equalsIgnoreCase("dueño")) {
            if (reporteFinancieroReal == null) {
                this.reporteFinancieroReal = new ReporteFinancieroReal();
            }
            this.reporteFinancieroReal.mostrarBalance(); // el proxy solo es el cadenero
        } else {
            System.out.println(" !ACCESO DENEGADO!");
        }
    }

}
