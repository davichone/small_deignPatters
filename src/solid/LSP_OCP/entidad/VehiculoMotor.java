package solid.LSP_OCP.entidad;

public abstract class VehiculoMotor {
    private int cilindraje;
    private String nroChasis;
    private int tanqueCombustible;

    public void llenarCombustible(){
        this.tanqueCombustible =100;
        System.out.println("combustible lleno al 100%");
    }

     public abstract void conducir();

     public int getCilindraje() {
         return cilindraje;
     }

     public void setCilindraje(int cilindraje) {
         this.cilindraje = cilindraje;
     }

     public String getNroChasis() {
         return nroChasis;
     }

     public void setNroChasis(String nroChasis) {
         this.nroChasis = nroChasis;
     }

     public int getTanqueCombustible() {
         return tanqueCombustible;
     }

     public void setTanqueCombustible(int tanqueCombustible) {
         this.tanqueCombustible = tanqueCombustible;
     }


     

}