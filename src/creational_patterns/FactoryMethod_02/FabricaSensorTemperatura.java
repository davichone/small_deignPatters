package creational_patterns.FactoryMethod_02;

public class FabricaSensorTemperatura extends LectorHardware{

    @Override
    protected Sensor crearSensor() {
       return new SensorTemperatura();
    }
    
}
