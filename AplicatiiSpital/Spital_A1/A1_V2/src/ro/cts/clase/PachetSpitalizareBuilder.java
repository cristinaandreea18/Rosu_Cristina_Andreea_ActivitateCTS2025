package ro.cts.clase;

public class PachetSpitalizareBuilder implements  Builder {
    private boolean hasPatRabatabil;
    private boolean hasMicDejunInclus;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatInterior;

    public PachetSpitalizareBuilder(){
        this.hasPatRabatabil = false;
        this.hasMicDejunInclus = false;
        this.hasPapuciDeCamera = false;
        this.hasHalatInterior = false;
    }


    public PachetSpitalizareBuilder setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
        return this;
    }

    public PachetSpitalizareBuilder setHasMicDejunInclus(boolean hasMicDejunInclus) {
        this.hasMicDejunInclus = hasMicDejunInclus;
        return this;
    }

    public PachetSpitalizareBuilder setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        return this;
    }

    public PachetSpitalizareBuilder setHasHalatInterior(boolean hasHalatInterior) {
        this.hasHalatInterior = hasHalatInterior;
        return this;
    }

    @Override
    public PachetSpitalizare build(String nume) {
        return new PachetSpitalizare(hasPatRabatabil,hasMicDejunInclus,hasPapuciDeCamera,hasHalatInterior);
    }
}
