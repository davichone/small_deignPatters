public class Estandar implements Servicio  {

    @Override
    public double calcularCostoFinal(double distancia, double precioPorKm) {
       double costoBase = distancia * precioPorKm;
       return costoBase + (costoBase * 0.18);
    }
    
  
}
