package creational_patterns.FactoryMethod;
public abstract class FabricaNotificaciones {


    protected abstract Notificacion crearNotificacion();


    public void procesarAlerta(String mensaje){
        System.out.println("Iniciando servicio..");
        System.out.println("Enviando Alerta...");
       


        Notificacion notificacion = crearNotificacion();
        notificacion.enviarMensaje(mensaje);

         System.out.println("Alerta enviada EXITOSAMENTE... =)");
    }
}
