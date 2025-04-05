package ro.cts.clase;

public class BuilderPachetTransport implements Builder {
    private String nume;
    private boolean hasWifi;
    private boolean hasAnimale;
    private boolean isFumator;
    private boolean hasAC;
    private boolean hasTV;
    @Override
    public PachetTransport build(String nume) {
        return new PachetTransport(nume,hasWifi,hasAnimale,isFumator,hasAC,hasTV);
    }

    public BuilderPachetTransport(){
        hasWifi = false;
        hasAnimale = false;
        isFumator = false;
        hasAC = false;
        hasTV = false;
    }

    public BuilderPachetTransport setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public BuilderPachetTransport setHasWifi(boolean hasWifi) {
        this.hasWifi = hasWifi;
        return this;
    }

    public BuilderPachetTransport setHasAnimale(boolean hasAnimale) {
        this.hasAnimale = hasAnimale;
        return this;
    }

    public BuilderPachetTransport setFumator(boolean fumator) {
        isFumator = fumator;
        return this;
    }

    public BuilderPachetTransport setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
        return this;
    }

    public BuilderPachetTransport setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
        return this;
    }
}
