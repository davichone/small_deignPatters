package creational_patterns.Abstract_Factory_02;

public class OperarioFActory implements EquipamientoFactory {

    @Override
    public Ropa crearRopa() {
        return new Mameluco();
    }

    @Override
    public Seguridad crearSeguridad() {
        return new Casco();
    }
    
}
