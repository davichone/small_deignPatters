package solid.LSP_OCP.entidad;

import solid.LSP_OCP.comportamiento.Navegable;
import solid.LSP_OCP.comportamiento.Pedaleablee;

public class Bicicleta extends VehiculoNoMotor implements Navegable, Pedaleablee{

   

    @Override
    public void iniciarViaje() {
        System.out.print("iniciar ruta manual");
    }

    @Override
    public void finalizarViaje() {
       System.out.print("finalizar ruta manual");
    }

    @Override
    public void pedalear() {
        System.out.print("iniciar el pedaleo");
    }
    
}