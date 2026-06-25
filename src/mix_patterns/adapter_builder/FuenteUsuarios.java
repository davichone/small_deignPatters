package mix_patterns.adapter_builder;



public interface FuenteUsuarios {
 UsuarioBuilder obtenerUsuario(String id);
 boolean usuarioExiste(String id);
}
