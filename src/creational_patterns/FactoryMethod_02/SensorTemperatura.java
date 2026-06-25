package creational_patterns.FactoryMethod_02;

public class SensorTemperatura implements Sensor {

    @Override
    public void leerDato(String datito) {
        System.out.println("🌡️ CPU Package Temp: "+ datito);
    }
    
}
