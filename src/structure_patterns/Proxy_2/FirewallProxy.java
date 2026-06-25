package structure_patterns.Proxy_2;

public class FirewallProxy implements Servidor {
    private ServidorBulcar servidorBulcar;

    public FirewallProxy() {
        this.servidorBulcar = new ServidorBulcar();
    }

    @Override
    public void conectar(String ipCliente, int puerto) {
        if (ipCliente.equalsIgnoreCase("192.168.1.50")) {
            System.err.println("🔴 [Firewall] IP maliciosa bloqueada.");
            return;
        }

        if (puerto != 443) {
            System.out.println("🔴 [Firewall] Tráfico bloqueado. Solo se permite puerto 443.");
            return;
        }
        this.servidorBulcar.conectar(ipCliente, puerto);
    }

}
