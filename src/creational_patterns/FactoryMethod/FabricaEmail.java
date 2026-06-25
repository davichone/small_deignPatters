package creational_patterns.FactoryMethod;

public class FabricaEmail extends FabricaNotificaciones{

    @Override
    protected Notificacion crearNotificacion() {
        return new NotificacionEmail();     //podemos retornar un NotificacionEmail, porque cumple con el contrato
                                            //interfaz
    }
    
}
