package creational_patterns.FactoryMethod_03;

public class CamionsitoPlataforma implements Transporte{

    @Override
    public void entregar() {
        System.out.println("🧱 Entregando 20 pallets de bloques de concreto.");
    }
    
}
