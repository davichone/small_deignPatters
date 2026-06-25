package structure_patterns.Facade;

public class BombaAgua {
    public void encender() { System.out.println("💧 Bomba de agua ON"); }
    public void bombear(int litros) { System.out.println("   -> Bombeando " + litros + " litros de agua."); }
    public void apagar() { System.out.println("💧 Bomba de agua OFF"); }
}