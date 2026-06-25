package structure_patterns.state;

public class Celular {

    private Estado estado;

    public Celular() {
        estado = new EstadoApagado();
    }

    //el celular no hace la accion, en su lugar, delega el proceso a la variable tipo interfas "estado".
    public void presionarBoton() {
        estado.presionarBoton(this);
    }

    // g s
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //

}
