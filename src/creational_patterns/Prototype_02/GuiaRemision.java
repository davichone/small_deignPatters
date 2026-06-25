package creational_patterns.Prototype_02;

public class GuiaRemision implements Prototipo {
    private String cliente;
    private String direccionDestino;
    private String conductor;

    // Constructor pesado (simula que tarda en traer datos de BD)
    public GuiaRemision(String cliente, String direccionDestino, String conductor) {
        this.cliente = cliente;
        this.direccionDestino = direccionDestino;
        this.conductor = conductor;
    }

    // TODO: 1. Sobrescribe el método clonar() de la interfaz. 
    // Debe retornar un "new GuiaRemision(...)" usando los atributos de la instancia actual.
    
    // Setter para cambiar el conductor en la copia
    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public void mostrarGuia() {
        System.out.println("Guía: Destino=" + direccionDestino + " | Conductor=" + conductor);
    }

    @Override
    public Prototipo clonar() {
        return new GuiaRemision(this.cliente, this.direccionDestino, this.conductor);
    }
}