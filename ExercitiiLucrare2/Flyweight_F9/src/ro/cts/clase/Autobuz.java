package ro.cts.clase;

public class Autobuz {
    private int numarAutobuz;
    private String modelAutobuz;
    private int anFabricatie;
    private int numarLocuri;

    public Autobuz(String modelAutobuz, int anFabricatie, int numarLocuri) {
        this.modelAutobuz = modelAutobuz;
        this.anFabricatie = anFabricatie;
        this.numarLocuri = numarLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", numarLocuri=").append(numarLocuri);
        sb.append('}');
        return sb.toString();
    }

}
