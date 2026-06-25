package creational_patterns.FactoryMethod;
public class FabricaWhatsApp extends FabricaNotificaciones {
 
   

    @Override
    protected Notificacion crearNotificacion() {
    
        return new NotificacionWhatsApp();
    }

} 