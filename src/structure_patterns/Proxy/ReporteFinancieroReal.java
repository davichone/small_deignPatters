
package structure_patterns.Proxy;
public class ReporteFinancieroReal implements ReporteFinanciero {

    public ReporteFinancieroReal() {
        System.out.println("⚙️ [Sistema] Conectando a PostgreSQL y calculando millones... (Esto tarda 5 segundos)");
    }

    @Override
    public void mostrarBalance() {
        System.out.println("💰 BALANCE GENERAL: La empresa tiene una liquidez de S/ 850,000.00");
    }
}