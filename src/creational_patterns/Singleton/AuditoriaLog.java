package creational_patterns.Singleton;

// ❌ 1. Esta clase actual permite hacer 'new', lo cual rompe el sistema. ¡Hazla Singleton!
public class AuditoriaLog {

    // 1. static variable
    private static AuditoriaLog instance;

    // 2. private constructor
    private AuditoriaLog() {
        System.out.println("Abriendo archivo auditoria.txt en el disco duro...");
    }

    // 3. metodo que devuelve la instancia
    public static AuditoriaLog getInstance() {
        if (instance == null) {
            return instance = new AuditoriaLog();
        }

        return instance;
    }

    // *cualquier otro metodo*
    public void registrarAlerta(String mensaje) {
        System.out.println("[LOG GUARDADO]: " + mensaje);
    }
}
