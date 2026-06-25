package creational_patterns.FactoryMethod_03;

// 3. El Creador Abstracto (La base de la Fábrica)
public abstract class Logistica {
    
    // EL FACTORY METHOD: Las subclases decidirán qué retornar aquí
        protected abstract Transporte crearTransporte();

    // Método de negocio que usa el Factory Method
    public void planificaTransporte(){
        Transporte vehiculo = crearTransporte();
        System.out.println("📋 Planificando ruta y permisos...");
        vehiculo.entregar();
    }
}