package structure_patterns.Decorator.decoradores;

import structure_patterns.Decorator.Mantenimiento;
import structure_patterns.Decorator.MantenimientoDecorador;

public class DecoradorAceite extends MantenimientoDecorador {

    // mi clase padre esta esperando recibir un objeto Mantenimiento para
    // inicializar
    public DecoradorAceite(Mantenimiento mantenimiento) {
        super(mantenimiento);
    }

    @Override
    public String obtenerDescripcion() {
        return mantenimientoEnvuelto.obtenerDescripcion() + "+ Cambio de Aceite";
    }

    @Override
    public double calcularCosto() {

        return mantenimientoEnvuelto.calcularCosto() + 150;
    }

}
