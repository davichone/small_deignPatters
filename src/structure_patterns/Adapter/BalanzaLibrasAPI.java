package structure_patterns.Adapter;

// 2. La API moderna (El "Cargador con conector incompatible")
// Esta clase no se puede modificar.
public class BalanzaLibrasAPI {
    public double getWeightInPounds() {
        // Simula la lectura física del camión
        System.out.println("🇺🇸 [API Externa] Reading sensors... 10000 lbs.");
        return 10000.0;
    }
}