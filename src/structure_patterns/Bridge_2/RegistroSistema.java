package structure_patterns.Bridge_2;

public abstract class RegistroSistema {
    protected AlmacenamientoDB tipoAlmacenamiento;

    protected RegistroSistema(AlmacenamientoDB tipoAlmacenamiento) {
        this.tipoAlmacenamiento = tipoAlmacenamiento;
    }

    public abstract void subirDATA();

}
