package creational_patterns.Singleton;
// ❌ 2. Modifica este módulo para que use el Singleton en lugar de hacer 'new'
public class ModuloDespacho {
    
    public void despacharCamion(String placa) {
        
        AuditoriaLog.getInstance().registrarAlerta(placa);
        
        
    }
}