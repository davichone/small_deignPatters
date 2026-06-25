package structure_patterns.Proxy_2;

// 2. El Objeto Real (Hace el trabajo, pero es vulnerable)
public class ServidorBulcar implements Servidor {
    @Override
    public void conectar(String ipCliente, int puerto) {
        System.out.println("🟢 [Servidor] Conexión establecida con éxito. Transfiriendo datos a " + ipCliente);
    }
}