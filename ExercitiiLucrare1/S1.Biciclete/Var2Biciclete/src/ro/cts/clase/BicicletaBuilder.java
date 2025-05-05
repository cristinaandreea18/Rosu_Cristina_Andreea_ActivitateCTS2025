package ro.cts.clase;

public class BicicletaBuilder implements Builder {
    private String marca;
    private int nrViteze;
    private float diametruRoti;
    private String tipFrana;
    private boolean hasCascaProtectie;
    private boolean hasOchelari;

    //        bicicleta = new Bicicleta(marca,3,30,"jante",false,false);
    public BicicletaBuilder() {
        this.nrViteze = 3;
        this.diametruRoti = 30;
        this.tipFrana = "jante";
        this.hasCascaProtectie = false;
        this.hasOchelari = false;
    }

    public BicicletaBuilder setNrViteze(int value) {
        this.nrViteze = value;
        return this;
    }

    public BicicletaBuilder setDiametruRoti(float value) {
        this.diametruRoti = value;
        return this;
    }

    public BicicletaBuilder setTipFrana(String value) {
        this.tipFrana = value;
        return this;
    }

    public BicicletaBuilder setHasCascaProtectie(boolean value) {
        this.hasCascaProtectie = value;
        return this;
    }

    public BicicletaBuilder setHasOchelari(boolean value) {
        this.hasOchelari = value;
        return this;
    }

    @Override
    public Bicicleta build(String marca) {
        return (new Bicicleta(marca,nrViteze,diametruRoti,tipFrana,hasCascaProtectie,hasOchelari));
    }
}
