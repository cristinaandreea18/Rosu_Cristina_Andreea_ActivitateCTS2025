package ro.cts.clase;

public class PachetSpitalizareBuilder implements Builder {
    public PachetSpitalizare pachetSpitalizare;

    public PachetSpitalizareBuilder(String nume) {
        pachetSpitalizare = new PachetSpitalizare(nume,false,false,false,false);
    }

    public PachetSpitalizareBuilder setHasPatRabatabil(boolean value){
        pachetSpitalizare.setHasPatRabatabil(value);
        return this;
    }

    public PachetSpitalizareBuilder setHasMicDejunInclus(boolean value){
        pachetSpitalizare.setHasMicDejunInclus(value);
        return this;
    }

    public PachetSpitalizareBuilder setHasPapuciDeCamera(boolean value){
        pachetSpitalizare.setHasPapuciDeCamera(value);
        return this;
    }

    public PachetSpitalizareBuilder setHasHalatInterior(boolean value){
        pachetSpitalizare.setHasHalatInterior(value);
        return this;
    }

    @Override
    public PachetSpitalizare build() {
        return pachetSpitalizare;
    }
}
