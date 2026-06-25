package structure_patterns.state;

public class EstadoApagado implements Estado {


    @Override
    public void presionarBoton(Celular celular) {
        System.out.println("Prendiendo Celular");
        //hace la transicion
        celular.setEstado(new EstadoPrendido());
    }
        
}
