package ro.cts.clase;

public class Pacient {
    private String nume;
    private int durataSpitalizare;
    private String numarAsigurareMedicala;

    public Pacient(String nume, int durataSpitalizare, String numarAsigurareMedicala) {
        this.nume = nume;
        this.durataSpitalizare = durataSpitalizare;
        this.numarAsigurareMedicala = numarAsigurareMedicala;
    }

    public String getNume() {
        return nume;
    }

    public int getDurataSpitalizare() {
        return durataSpitalizare;
    }

    public String getNumarAsigurareMedicala() {
        return numarAsigurareMedicala;
    }
}
