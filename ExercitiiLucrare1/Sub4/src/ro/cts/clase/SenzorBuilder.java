package ro.cts.clase;

public class SenzorBuilder implements Builder {
    private String oras;
    private boolean hasPM2_5;
    private boolean hasPM10;
    private boolean hasVOC;
    private boolean hasCO2;
    private boolean hasCO;
    private boolean hasMasurareTemperatura;
    private boolean hasIndiceUmiditate;

    public SenzorBuilder() {
        this.hasPM2_5 = false;
        this.hasPM10 = false;
        this.hasVOC = false;
        this.hasCO2 = false;
        this.hasCO = false;
        this.hasMasurareTemperatura = false;
        this.hasIndiceUmiditate = false;
    }

    public SenzorBuilder setHasPM2_5(boolean value){
        this.hasPM2_5 = value;
        return this;
    }

    public SenzorBuilder seHasPM10(boolean value){
        this.hasPM10 = value;
        return this;
    }

    public SenzorBuilder setHasVOC(boolean value){
        this.hasVOC = value;
        return this;
    }
    public SenzorBuilder setHasCO2(boolean value){
        this.hasCO2 = value;
        return this;
    }

    public SenzorBuilder setHasC0(boolean value){
        this.hasCO = value;
        return this;
    }

    public SenzorBuilder setHasMasurareTemperatura(boolean value){
        this.hasMasurareTemperatura = value;
        return this;
    }

    public SenzorBuilder setHasIndiceUmiditate(boolean value){
        this.hasIndiceUmiditate = value;
        return this;
    }

    @Override
    public Senzor build(String oras) {
        return new Senzor(oras,hasPM2_5,hasPM10,hasVOC,hasCO2,hasCO,hasMasurareTemperatura,hasIndiceUmiditate);
    }
}
