package ro.cts.clase;

public class Rezervare {
    private int numarMasa;
    private int numarPersoane;
    private int oraRezervare;

    public Rezervare(int numarMasa, int numarPersoane, int oraRezervare) {
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervare = oraRezervare;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public int getOraRezervare() {
        return oraRezervare;
    }
}
