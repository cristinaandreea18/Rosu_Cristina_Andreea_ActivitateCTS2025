package ro.cts.clase;

public class ClientAbonat implements Observer {
    private String nume;

    public ClientAbonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume+" a primit urmatoarea notificare: "+mesaj);
    }
}
