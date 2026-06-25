package creational_patterns.FactoryMethod_02;
public class SensorVentilador implements Sensor {

    @Override
    public void leerDato(String datito) {
       System.out.println("❄️ Fan Speed: " +datito+ " RPM ");
    }
    
}
