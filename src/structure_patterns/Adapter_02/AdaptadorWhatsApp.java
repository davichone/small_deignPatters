package structure_patterns.Adapter_02;

public class AdaptadorWhatsApp implements SistemaSMS {
    private WhatsAppBusinessAPI whatsAppBusinessAPI;
    private final String codigoPeru = "+51"; // tiene como atributo la entidad nueva (codigo de tercero)
    private final String altaPrioridad = "ALTA";
    // private final String bajaPrioridad = "BAJA";

    public AdaptadorWhatsApp(WhatsAppBusinessAPI whatsAppBusinessAPI) {
        this.whatsAppBusinessAPI = whatsAppBusinessAPI; // inyectamos la dependencia por constructor
    }

    @Override
    public void enviarMensaje(String telefono, String mensaje) {
        telefono = codigoPeru + telefono;
        whatsAppBusinessAPI.pushWhatsApp(telefono, mensaje, altaPrioridad);
    }

}
