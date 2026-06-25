package mix_patterns.adapter_builder;

public class LegacyUserSystem {
 public String[] obtenerDatosUsuario(String id) {
 return new String[]{"Juan Pérez", "juan@email.com", "30"};
 }
}