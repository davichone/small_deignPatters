package structure_patterns.Composite;

import java.util.ArrayList;

public class PaquetePromocional implements Cotizable {
    private ArrayList<Cotizable> lista = new ArrayList<>();

   

    public void agregarElemento(Cotizable elemento){
        lista.add(elemento);
    }


     @Override
    public double calcularPrecio() {
      
        double total =0;
        for (Cotizable dato : lista) {
            total+= dato.calcularPrecio();
        }
        return total;
    }

}
