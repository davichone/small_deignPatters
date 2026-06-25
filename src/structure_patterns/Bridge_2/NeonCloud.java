package structure_patterns.Bridge_2;


public class NeonCloud implements AlmacenamientoDB {

    @Override
    public void gauardarDATA(int tamaño) {
        System.out.println("Guardando en la NUBE -> NEON CLOUD: " + tamaño);
    }

}
