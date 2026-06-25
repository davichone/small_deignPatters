package creational_patterns.FactoryMethod_03;

public class LogisticaConcreto extends Logistica{

    @Override
    protected Transporte crearTransporte() {
        return new CamionsitoPlataforma();
    }
    
}
