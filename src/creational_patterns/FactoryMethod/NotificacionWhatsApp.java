package creational_patterns.FactoryMethod;public class NotificacionWhatsApp implements Notificacion{
    


    @Override
    public void enviarMensaje(String mensaje) {
       
        System.out.println("Mensaje enviado por WhastApp: "+mensaje);
    }
}