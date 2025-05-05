package ro.cts.clase;

public class Rezervare implements IRezervare {
    private int numarNopti;
    private int codRezervare;

    public int getNumarNopti() {
        return numarNopti;
    }

    public Rezervare(int numarNopti, int codRezervare) {
        this.numarNopti = numarNopti;
        this.codRezervare = codRezervare;
    }


    @Override
    public void anulareRezervare() {
        System.out.println("A fost anulata rezervarea cu codul "+codRezervare);
    }
}
