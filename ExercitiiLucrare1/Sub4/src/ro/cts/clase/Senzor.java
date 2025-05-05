package ro.cts.clase;

public class Senzor implements AbstractAirQualityReport {
    private String oras;
    private boolean hasPM2_5;
    private boolean hasPM10;
    private boolean hasVOC;
    private boolean hasCO2;
    private boolean hasCO;
    private boolean hasMasurareTemperatura;
    private boolean hasIndiceUmiditate;

    public Senzor(String oras, boolean hasPM2_5, boolean hasPM10, boolean hasVOC, boolean hasCO2, boolean hasCO, boolean hasMasurareTemperatura, boolean hasIndiceUmiditate) {
        this.oras = oras;
        this.hasPM2_5 = hasPM2_5;
        this.hasPM10 = hasPM10;
        this.hasVOC = hasVOC;
        this.hasCO2 = hasCO2;
        this.hasCO = hasCO;
        this.hasMasurareTemperatura = hasMasurareTemperatura;
        this.hasIndiceUmiditate = hasIndiceUmiditate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Senzor{");
        sb.append("hasPM2_5=").append(hasPM2_5);
        sb.append(", hasPM10=").append(hasPM10);
        sb.append(", hasVOC=").append(hasVOC);
        sb.append(", hasCO2=").append(hasCO2);
        sb.append(", hasCO=").append(hasCO);
        sb.append(", hasMasurareTemperatura=").append(hasMasurareTemperatura);
        sb.append(", hasIndiceUmiditate=").append(hasIndiceUmiditate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void prezintaSituatie() {
        System.out.println("Senzorul din orasul "+oras+" este capabil sa execute masuratori pentru diversi indici");
    }
}
