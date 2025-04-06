package ro.cts.clase;

public class PachetSpitalizare {
    private  String nume;
    private boolean hasPatRabatabil;
    private boolean hasMicDejunInclus;
    private boolean hasPapuciDeCamera;
    private boolean hasHalatInterior;

    public PachetSpitalizare(String nume,boolean hasPatRabatabil, boolean hasMicDejunInclus, boolean hasPapuciDeCamera, boolean hasHalatInterior) {
        this.nume = nume;
        this.hasPatRabatabil = hasPatRabatabil;
        this.hasMicDejunInclus = hasMicDejunInclus;
        this.hasPapuciDeCamera = hasPapuciDeCamera;
        this.hasHalatInterior = hasHalatInterior;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setHasPatRabatabil(boolean hasPatRabatabil) {
        this.hasPatRabatabil = hasPatRabatabil;
    }

    public void setHasMicDejunInclus(boolean hasMicDejunInclus) {
        this.hasMicDejunInclus = hasMicDejunInclus;
    }

    public void setHasPapuciDeCamera(boolean hasPapuciDeCamera) {
        this.hasPapuciDeCamera = hasPapuciDeCamera;
    }

    public void setHasHalatInterior(boolean hasHalatInterior) {
        this.hasHalatInterior = hasHalatInterior;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetSpitalizare{");
        sb.append("hasPatRabatabil=").append(hasPatRabatabil);
        sb.append(", hasMicDejunInclus=").append(hasMicDejunInclus);
        sb.append(", hasPapuciDeCamera=").append(hasPapuciDeCamera);
        sb.append(", hasHalatInterior=").append(hasHalatInterior);
        sb.append('}');
        return sb.toString();
    }
}
