package solid.LSP_OCP.entidad;

public abstract class VehiculoNoMotor {
    private String nroChasis;
    private int ruedas;
    public String getNroChasis() {
        return nroChasis;
    }
    public void setNroChasis(String nroChasis) {
        this.nroChasis = nroChasis;
    }
    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }



}