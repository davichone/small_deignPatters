public class Expres implements Servicio {

    @Override
    public double calcularCostoFinal(double distancia, double precioPorKm) {
        double costoBase = distancia * precioPorKm;
        double recargo = costoBase * 0.30;
            return (costoBase + recargo) * 1.18;
    }

   
    
}
