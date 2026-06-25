package creational_patterns.Singleton_02;

public class ImpresoraTermica {

    //instance global
    public static ImpresoraTermica instance;

    //constructor private
     private ImpresoraTermica() {
        System.out.println("🔌 Conectando al puerto USB de la impresora Epson...");
    }

    //obtain instance
    public static ImpresoraTermica getInstance(){
        if(instance==null){
            instance= new ImpresoraTermica();
        
        }
        return instance;
    }



    public void imprimirTicket(String documento, String contenido) {
        System.out.println("🖨️ Imprimiendo " + documento + ": " + contenido);
    }
}

   