package ro.cts.clase;

public class Calator implements Observer {
    private String nume;
    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("Calatorul "+nume+" a primit urmatorul mesaj "+mesaj);
    }

    public Calator(String nume) {
        this.nume = nume;
    }
}
