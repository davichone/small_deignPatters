public class Main {
    public static void main(String[] args) {

       Servicio tipoServicio = new Expres();
       CalculadoraFletes c = new CalculadoraFletes(tipoServicio);
       
       System.out.print("El costo final es: "+ c.calcularCostoFinal(10, 12));
    }
}
