package creational_patterns.Builder;

public class CamionDeDespacho {
    private int capacidaDeCarga; 
    private String conductor;
    private boolean GPS ;
    private boolean SistemaRefrigeracion;

    public CamionDeDespacho(int capacidaDeCarga, String conductor, boolean gPS, boolean sistemaRefrigeracion) {
        this.capacidaDeCarga = capacidaDeCarga;
        this.conductor = conductor;
        GPS = gPS;
        SistemaRefrigeracion = sistemaRefrigeracion;
    }

    public CamionDeDespacho(){
        
    }

    public CamionDeDespacho conCapacidad(int capacidaDeCarga){
        this.capacidaDeCarga=capacidaDeCarga;
        return this;
    }

    public CamionDeDespacho conConductor(String conductor){
        this.conductor=conductor;
        return this;
    }
    
    public CamionDeDespacho conGPS(boolean GPS){
    this.GPS = GPS;
    return this;
    }

    public CamionDeDespacho conSisRefg(boolean SistemaRefrigeracion){
        this.SistemaRefrigeracion =SistemaRefrigeracion;
        return this;
    }

    public CamionDeDespacho builder(){
        return new CamionDeDespacho(capacidaDeCarga, conductor, GPS, SistemaRefrigeracion);
    }

    @Override
    public String toString(){
        return "Capacidad de carga: "+ this.capacidaDeCarga+"\nConductor: "+this.conductor+"\nGPS? : "+this.GPS+"\nSistema Ref? : "+this.SistemaRefrigeracion;
    }
}
