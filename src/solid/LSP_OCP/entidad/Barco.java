package solid.LSP_OCP.entidad;

import solid.LSP_OCP.comportamiento.Navegable;

public class Barco extends VehiculoMotor implements Navegable{

    @Override
    public void iniciarViaje() {
        System.out.print("elevando las anclas");
    }

    @Override
    public void finalizarViaje() {
       System.out.print("soltando las anclas");
    }

    @Override
    public void conducir() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'conducir'");
    }
    
}