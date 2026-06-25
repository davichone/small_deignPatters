package creational_patterns.FactoryMethod_02;
public class FabricaSensorVentilador extends LectorHardware {

    @Override
    protected Sensor crearSensor() {
        return new SensorVentilador();
    }
    
}
