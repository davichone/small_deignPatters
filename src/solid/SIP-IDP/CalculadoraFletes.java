public class CalculadoraFletes {
    private Servicio servicio;
    public CalculadoraFletes (Servicio servicio){
        this.servicio=servicio;

    }
    public double calcularCostoFinal(double distancia, double precioPorKm) {
      return this.servicio.calcularCostoFinal(distancia, precioPorKm);
        
    }
}