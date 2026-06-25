package structure_patterns.Adapter;

public class AdaptadorBalanza implements BalanzaKilos {
    private BalanzaLibrasAPI balanzaLibrasAPI;
    private final double valorLibraEnKilo = 0.453592;

    public AdaptadorBalanza(BalanzaLibrasAPI balanzaLibrasAPI) {
        this.balanzaLibrasAPI = balanzaLibrasAPI;
    }

    @Override
    public double obtenerPeso() {
        return (valorLibraEnKilo * balanzaLibrasAPI.getWeightInPounds());
    }

}
