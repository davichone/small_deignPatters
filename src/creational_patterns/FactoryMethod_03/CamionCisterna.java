package creational_patterns.FactoryMethod_03;

public class CamionCisterna implements Transporte {
    @Override
    public void entregar() {
        System.out.println("🛢️ Entregando 5000 galones de combustible.");
    }
}