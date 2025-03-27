package cts.clase;

public class RezervareBuilder implements AbstractBuilder {
    private String nume;
    private boolean hasAsezareGeam;
    private boolean hasScauneErgonomice;
    private boolean hasDecorareMasa;
    private String genMuzica;

    @Override
    public Rezervare build(String nume) {
        return (new Rezervare(nume,hasAsezareGeam,hasScauneErgonomice,hasDecorareMasa,genMuzica));
    }

    public RezervareBuilder() {
        hasAsezareGeam = false;
        hasScauneErgonomice = false;
        hasDecorareMasa = false;
        genMuzica = "fara muzica";
    }

    public RezervareBuilder setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public RezervareBuilder setHasAsezareGeam(boolean hasAsezareGeam) {
        this.hasAsezareGeam = hasAsezareGeam;
        return this;
    }

    public RezervareBuilder setHasScauneErgonomice(boolean hasScauneErgonomice) {
        this.hasScauneErgonomice = hasScauneErgonomice;
        return this;
    }

    public RezervareBuilder setHasDecorareMasa(boolean hasDecorareMasa) {
        this.hasDecorareMasa = hasDecorareMasa;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }
}
