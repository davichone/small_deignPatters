package structure_patterns.Decorator;

public class MantenimientoBasico implements Mantenimiento {

    @Override
    public String obtenerDescripcion() {
        return "Revision general del camion(basico)";
    }

    @Override
    public double calcularCosto() {
        return 300.00;
    }
    
}
