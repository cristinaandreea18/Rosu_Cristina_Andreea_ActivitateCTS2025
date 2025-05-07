package ro.cts.clase;

public class Spitalizare {
    private int numarSalon;
    private int numarPat;
    private int numarZileSpitalizare;
    private String diagnostic;

    public Spitalizare(int numarSalon, int numarPat, int numarZileSpitalizare, String diagnostic) {
        this.numarSalon = numarSalon;
        this.numarPat = numarPat;
        this.numarZileSpitalizare = numarZileSpitalizare;
        this.diagnostic = diagnostic;
    }

    public int getNumarSalon() {
        return numarSalon;
    }

    public void setNumarSalon(int numarSalon) {
        this.numarSalon = numarSalon;
    }

    public int getNumarPat() {
        return numarPat;
    }

    public void setNumarPat(int numarPat) {
        this.numarPat = numarPat;
    }

    public int getNumarZileSpitalizare() {
        return numarZileSpitalizare;
    }

    public void setNumarZileSpitalizare(int numarZileSpitalizare) {
        this.numarZileSpitalizare = numarZileSpitalizare;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }
}
