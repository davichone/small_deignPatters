package creational_patterns.Singleton_02;

public class ModuloDespacho {
    private ImpresoraTermica impresora;

    
   

    public ModuloDespacho(ImpresoraTermica impresora){
        this.impresora=impresora;
    }

    public void generarGuiaRemision(String placa) {
     
        impresora.imprimirTicket("Guía de Remisión", "Autorizado para salida: Camión " + placa);
    }
}