package structure_patterns.Bridge_2;
public class RegistroVenta extends RegistroSistema {

    public RegistroVenta(AlmacenamientoDB tipoAlmacenamiento) {
        super(tipoAlmacenamiento);
    }

    @Override
    public void subirDATA() {
        int tamaño = 10;

        tipoAlmacenamiento.gauardarDATA(tamaño);
    }

}
