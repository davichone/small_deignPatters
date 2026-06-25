package creational_patterns.FactoryMethod_02;

//creador abstracto
public abstract class LectorHardware {       // en esta clase usamos el Factory Method 
    
    protected abstract Sensor crearSensor();     //metodo abstracto



    //metodo central que implementara todas sus clases hijas
    public void registrarEstado(String datito){
        System.out.println("Iniciando Servicio");
        Sensor sensor = crearSensor();
        sensor.leerDato(datito);
         System.out.println("Mensaje enviado");

    }


}
