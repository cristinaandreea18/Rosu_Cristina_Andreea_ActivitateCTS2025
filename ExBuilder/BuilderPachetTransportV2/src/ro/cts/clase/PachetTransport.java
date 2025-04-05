package ro.cts.clase;

public class PachetTransport {
    private String nume;
    private boolean hasWifi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;

    public PachetTransport(String nume, boolean hasWifi, boolean hasAnimale, boolean isFumator, boolean hasAC, boolean hasTV) {
        this.nume = nume;
        this.hasWifi = hasWifi;
        this.hasAnimale = hasAnimale;
        this.isFumator = isFumator;
        this.hasAC = hasAC;
        this.hasTV = hasTV;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTransport{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", hasWifi=").append(hasWifi);
        sb.append(", hasAnimale=").append(hasAnimale);
        sb.append(", isFumator=").append(isFumator);
        sb.append(", hasAC=").append(hasAC);
        sb.append(", hasTV=").append(hasTV);
        sb.append('}');
        return sb.toString();
    }
}
