package ro.cts.clase;

public class Persoana {
    private String nume;
    private String numarTelefon;
    private String oraRezervare;
    private int numarPersoane;

    public Persoana(String nume, String numarTelefon, String oraRezervare, int numarPersoane) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.oraRezervare = oraRezervare;
        this.numarPersoane = numarPersoane;
    }

    public String getNume() {
        return nume;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }
}
