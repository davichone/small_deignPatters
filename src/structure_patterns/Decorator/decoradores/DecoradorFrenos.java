package structure_patterns.Decorator.decoradores;

import structure_patterns.Decorator.Mantenimiento;
import structure_patterns.Decorator.MantenimientoDecorador;
public class DecoradorFrenos extends MantenimientoDecorador {

    public DecoradorFrenos(Mantenimiento mantenimiento) {
        super(mantenimiento);
        
    }
    
    @Override
    public String obtenerDescripcion(){
        return mantenimientoEnvuelto.obtenerDescripcion() + "+ Reparacio de Frenos";
    }

    @Override
    public double calcularCosto(){
        
        return mantenimientoEnvuelto.calcularCosto() + 400;
    }
}
