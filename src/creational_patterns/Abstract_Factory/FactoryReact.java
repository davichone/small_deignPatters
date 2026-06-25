package creational_patterns.Abstract_Factory;

public class FactoryReact implements FactoryIU {

    @Override
    public Boton crearBoton() {
       return new BotonReact();
    }

    @Override
    public Tabla crearTabla() {
        return new TablaReact();
    }
    
}
