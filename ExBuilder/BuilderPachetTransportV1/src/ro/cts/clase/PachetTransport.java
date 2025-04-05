package ro.cts.clase;

public class PachetTransport {
    private String nume;
    private boolean hasWifi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;

    protected PachetTransport(String nume,boolean hasWifi, boolean hasAnimale, boolean isFumator, boolean hasAC, boolean hasTV) {
        this.nume = nume;
        this.hasWifi = hasWifi;
        this.hasAnimale = hasAnimale;
        this.isFumator = isFumator;
        this.hasAC = hasAC;
        this.hasTV = hasTV;
    }

    protected void setNume(String nume) {
        this.nume = nume;
    }

    protected void setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    protected void setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
    }

    protected void setIsFumator(boolean fumator) {
        isFumator = fumator;
    }

    protected void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }

    protected void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTransport{");
        sb.append("nume=").append(nume);
        sb.append(", hasWifi=").append(hasWifi);
        sb.append(", hasAnimale=").append(hasAnimale);
        sb.append(", isFumator=").append(isFumator);
        sb.append(", hasAC=").append(hasAC);
        sb.append(", hasTV=").append(hasTV);
        sb.append('}');
        return sb.toString();
    }
}
