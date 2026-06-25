package creational_patterns.FactoryMethod_03;
public class LogisticaCombustible extends Logistica {

    @Override
    protected Transporte crearTransporte() {
        return new CamionCisterna();
    }
    
}
