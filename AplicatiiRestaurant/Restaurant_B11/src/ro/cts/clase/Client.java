package ro.cts.clase;

public class Client {
    private String nume;
    private ModalitatePlata plata;

    public Client(String nume, ModalitatePlata plata) {
        this.nume = nume;
        this.plata = plata;
    }

    public Client(String nume) {
        this.nume = nume;
        this.plata = new Cash();
    }

    public void plateste(double suma){
        plata.plateste(this.nume,suma);
    }

    public void setPlata(ModalitatePlata plata) {
        this.plata = plata;
    }
}
