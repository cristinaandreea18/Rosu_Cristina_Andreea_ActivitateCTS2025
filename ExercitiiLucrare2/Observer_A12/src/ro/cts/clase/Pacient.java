package ro.cts.clase;

public class Pacient implements Observer {
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("Pacientul "+nume+ " a primit urmatoarea notificare:"+mesaj);
    }
}
