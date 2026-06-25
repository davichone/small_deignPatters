package creational_patterns.Singleton_02;

public class ModuloVentas {
    //inyectamos la dependencia por el constructor
    private ImpresoraTermica impresora;

    public ModuloVentas(ImpresoraTermica impresora){
        this.impresora=impresora;
    }


    public void cobrarFlete(double monto) {
        impresora.imprimirTicket("Boleta de Venta", "Total cobrado: S/." + monto);
    }
}