package structure_patterns.Adapter_02;

public class WhatsAppBusinessAPI {
    public void pushWhatsApp(String numeroInternacional, String texto, String prioridad) {
        System.out.println("🟢 [WhatsApp API] Enviando mensaje a " + numeroInternacional);
        System.out.println("   Prioridad: " + prioridad);
        System.out.println("   Contenido: " + texto);
    }
}