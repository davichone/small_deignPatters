package creational_patterns.Prototype;

public class GuiaRemision implements Prototipo {
    private String numeroGuia;
    private String cliente;
    private String carga;
    private String placaCamion;

    // Constructor pesado
    public GuiaRemision(String numeroGuia, String cliente, String carga, String placaCamion) {
        System.out.println("⏳ Consultando SUNAT y base de datos Neon para validar cliente y placa...");
        this.numeroGuia = numeroGuia;
        this.cliente = cliente;
        this.carga = carga;
        this.placaCamion = placaCamion;
    }

    public GuiaRemision(){};


    //methods normales
    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public void imprimirGuia() {
        System.out.println("📄 [" + numeroGuia + "] Cliente: " + cliente + " | Carga: " + carga + " | Placa: " + placaCamion);
    }

    

    //metodo para clonar (reducir costo de inicializacion)

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public String getPlacaCamion() {
        return placaCamion;
    }

    public void setPlacaCamion(String placaCamion) {
        this.placaCamion = placaCamion;
    }

    @Override
    public GuiaRemision clonar(){
        System.out.println("Clonando receta existente... 🚀");
        GuiaRemision clon = new GuiaRemision();
        clon.setCarga(this.carga);
        clon.setCliente(this.cliente);
        clon.setNumeroGuia(this.numeroGuia);
        clon.setPlacaCamion(this.placaCamion);
        return clon;
    }

}