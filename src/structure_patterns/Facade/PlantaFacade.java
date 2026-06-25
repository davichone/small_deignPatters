package structure_patterns.Facade;

public class PlantaFacade {
    private BombaAgua bombaAgua;
    private Mezcladora mezcladora;
    private TolvaCemento tolvaCemento;

    public PlantaFacade(){
        this.bombaAgua= new BombaAgua();
        this.mezcladora = new Mezcladora();
        this.tolvaCemento = new TolvaCemento();
    }

    public void prepararMezcla(int litrosAgua, int kilosCemento){
        bombaAgua.encender();
        bombaAgua.bombear(litrosAgua);
         bombaAgua.apagar();
        tolvaCemento.abrirCompuerta();
        tolvaCemento.soltarCemento(kilosCemento);
        tolvaCemento.cerrarCompuerta();
        mezcladora.iniciarGiro();
        mezcladora.detener();
       
    }
    
}
