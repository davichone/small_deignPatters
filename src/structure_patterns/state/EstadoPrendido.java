package structure_patterns.state;

public class EstadoPrendido implements Estado {

    @Override
    public void presionarBoton(Celular celular) {
        System.out.println("Apagando Celular");

        //hago la transcicion del estado
        celular.setEstado(new EstadoApagado());
    }
    
}
