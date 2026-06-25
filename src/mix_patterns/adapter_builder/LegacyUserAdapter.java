package mix_patterns.adapter_builder;


public class LegacyUserAdapter implements FuenteUsuarios{
    private LegacyUserSystem legacyUserSystem;

    public LegacyUserAdapter(){}
    public LegacyUserAdapter(LegacyUserSystem legacyUserSystem){
        this.legacyUserSystem=legacyUserSystem;
    }

    @Override
    public UsuarioBuilder obtenerUsuario(String id) {
        String [] datos = legacyUserSystem.obtenerDatosUsuario(id);


        return new UsuarioBuilder().conNombre(datos[1])
                                    .conDireccion("Lima")
                                    .conEdad(Integer.parseInt(datos[3]))
                                    .conEmail(datos[2])
                                    .conTelefono("9194545454")
                                    .esPremium(true).builder();


      
    }

    @Override
    public boolean usuarioExiste(String id) {
       return true;
    }
     


}
