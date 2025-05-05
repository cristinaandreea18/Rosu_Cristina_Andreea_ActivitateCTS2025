package ro.cts.clase;

public class BicicletaBuilder implements Builder {
    private Bicicleta bicicleta;

    public BicicletaBuilder(String marca){
        bicicleta = new Bicicleta(marca,3,30,"jante",false,false);
    }

    public BicicletaBuilder setNrViteze(int value) {
        bicicleta.setNrViteze(value);
        return this;
    }

    public BicicletaBuilder setDiametruRoti(float value) {
        bicicleta.setDiametruRoti(value);
        return this;
    }

    public BicicletaBuilder setTipFrana(String value) {
        bicicleta.setTipFrana(value);
        return this;
    }

    public BicicletaBuilder setHasCascaProtectie(boolean value) {
        bicicleta.setHasCascaProtectie(value);
        return this;
    }

    public BicicletaBuilder setHasOchelari(boolean value) {
        bicicleta.setHasOchelari(value);
        return this;
    }

    @Override
    public Bicicleta build() {
        return bicicleta;
    }
}
