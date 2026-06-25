public class Fragil implements Servicio {

    @Override
    public double calcularCostoFinal(double distancia, double precioPorKm) {
       double costoBase = distancia * precioPorKm;
        return (costoBase + 150) * 1.18;
    }
    
}
