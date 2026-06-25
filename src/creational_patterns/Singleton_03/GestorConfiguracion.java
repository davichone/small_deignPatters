package creational_patterns.Singleton_03;


public class GestorConfiguracion {
    
    private String nombreEmpresa;
    private double impuestoIGV;
    private static GestorConfiguracion instanciaUnica;

    private GestorConfiguracion(String nombreEmpresa, double impuestoIGV ){
        this.impuestoIGV=impuestoIGV;
        this.nombreEmpresa=nombreEmpresa;
    }

    public static GestorConfiguracion obtenerInstanciaUnica(){
        if(instanciaUnica==null){
            instanciaUnica = new GestorConfiguracion("Bulcar", 12);
        }
        return instanciaUnica;
    }
    
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public double getImpuestoIGV() {
        return impuestoIGV;
    }
}