package creational_patterns.Abstract_Factory_02;

public class ConductorFactory implements EquipamientoFactory {

    @Override
    public Ropa crearRopa() {
        return new CamisaRuta();
    }

    @Override
    public Seguridad crearSeguridad() {
        return new LentesSol();
    }
    
}
