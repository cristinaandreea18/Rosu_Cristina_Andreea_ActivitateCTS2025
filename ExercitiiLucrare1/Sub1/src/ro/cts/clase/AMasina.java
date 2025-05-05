package ro.cts.clase;

public abstract class AMasina {
    protected String proprietar;
    protected int anFabricatie;
    //model,nrInmatriculare,nrLocuri


    public String getProprietar() {
        return proprietar;
    }

    public AMasina(String proprietar, int anFabricatie) {
        this.proprietar = proprietar;
        this.anFabricatie = anFabricatie;
    }

    public abstract void descriere();
}
