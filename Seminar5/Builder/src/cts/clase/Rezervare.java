package cts.clase;

public class Rezervare {
    private String nume;
    private boolean hasAsezareGeam;
    private boolean hasScauneErgonomice;
    private boolean hasDecorareMasa;
    private String genMuzica;

    protected Rezervare(String nume, boolean hasAsezareGeam, boolean hasScauneErgonomice, boolean hasDecorareMasa, String genMuzica) {
        this.nume = nume;
        this.hasAsezareGeam = hasAsezareGeam;
        this.hasScauneErgonomice = hasScauneErgonomice;
        this.hasDecorareMasa = hasDecorareMasa;
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", hasAsezareGeam=").append(hasAsezareGeam);
        sb.append(", hasScauneErgonomice=").append(hasScauneErgonomice);
        sb.append(", hasDecorareMasa=").append(hasDecorareMasa);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
