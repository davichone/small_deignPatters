package creational_patterns.Abstract_Factory;


public class ModuloInventario  {
    
    private FactoryIU factoryIU; //variable de tipo interfaz


    public ModuloInventario (FactoryIU factoryIU){
        this.factoryIU=factoryIU;
    }

    public void renderizarVista() {
        System.out.println("Cargando módulo de inventario de bloques...");

        Boton btn = factoryIU.crearBoton();
        Tabla tbl = factoryIU.crearTabla();

        btn.dibujarBoton();
        tbl.dibujarTabla();
        
       
    }

  
}