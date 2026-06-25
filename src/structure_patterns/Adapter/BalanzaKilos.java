package structure_patterns.Adapter;
// 1. El estándar antiguo de Bulcar (El "Enchufe de pared")
// Todo el sistema ERP espera trabajar con esta interfaz.
public interface BalanzaKilos {
    double obtenerPeso(); 
}