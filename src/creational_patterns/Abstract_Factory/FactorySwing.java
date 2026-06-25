package creational_patterns.Abstract_Factory;

public class FactorySwing implements FactoryIU{

    @Override
    public Boton crearBoton() {
        return new BotonSwing();
    }

    @Override
    public Tabla crearTabla() {
       return new TablaSwing();
    }
    
}
