package structure_patterns.Facade;

public class TolvaCemento {
    public void abrirCompuerta() { System.out.println("⚙️ Compuerta de tolva ABIERTA"); }
    public void soltarCemento(int kilos) { System.out.println("   -> Cayendo " + kilos + " kg de cemento."); }
    public void cerrarCompuerta() { System.out.println("⚙️ Compuerta de tolva CERRADA"); }
}