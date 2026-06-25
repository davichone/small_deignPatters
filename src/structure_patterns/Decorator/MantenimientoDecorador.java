package structure_patterns.Decorator;

public abstract class MantenimientoDecorador implements Mantenimiento {
    protected Mantenimiento mantenimientoEnvuelto;

    public MantenimientoDecorador(Mantenimiento mantenimiento){
        this.mantenimientoEnvuelto=mantenimiento;
    }

    @Override
    public String obtenerDescripcion(){
        return this.mantenimientoEnvuelto.obtenerDescripcion();
    }

    @Override
    public double calcularCosto(){
        return this.mantenimientoEnvuelto.calcularCosto();
    }
}
