package ro.cts.clase;

public class Rezervare {
    private String nume;
    private String data;
    private boolean hasAsezareLaGeam;
    private boolean hasScauneErgonomice;
    private boolean hasDecorareMasa;
    private boolean hasMuzicaAmbientala;
    private String genMuzica;


    public Rezervare(String nume, String data, boolean hasAsezareLaGeam, boolean hasScauneErgonomice, boolean hasDecorareMasa, boolean hasMuzicaAmbientala, String genMuzica) {
        this.nume = nume;
        this.data = data;
        this.hasAsezareLaGeam = hasAsezareLaGeam;
        this.hasScauneErgonomice = hasScauneErgonomice;
        this.hasDecorareMasa = hasDecorareMasa;
        this.hasMuzicaAmbientala = hasMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHasAsezareLaGeam(boolean hasAsezareLaGeam) {
        this.hasAsezareLaGeam = hasAsezareLaGeam;
    }

    public void setHasScauneErgonomice(boolean hasScauneErgonomice) {
        this.hasScauneErgonomice = hasScauneErgonomice;
    }

    public void setHasDecorareMasa(boolean hasDecorareMasa) {
        this.hasDecorareMasa = hasDecorareMasa;
    }

    public void setHasMuzicaAmbientala(boolean hasMuzicaAmbientala) {
        this.hasMuzicaAmbientala = hasMuzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append(", hasAsezareLaGeam=").append(hasAsezareLaGeam);
        sb.append(", hasScauneErgonomice=").append(hasScauneErgonomice);
        sb.append(", hasDecorareMasa=").append(hasDecorareMasa);
        sb.append(", hasMuzicaAmbientala=").append(hasMuzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
