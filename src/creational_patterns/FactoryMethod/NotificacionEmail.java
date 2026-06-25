package creational_patterns.FactoryMethod;
public class NotificacionEmail implements Notificacion{
    public void enviar(String mensaje) { 
        
    }

    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado por Email: "+mensaje);
    }
}