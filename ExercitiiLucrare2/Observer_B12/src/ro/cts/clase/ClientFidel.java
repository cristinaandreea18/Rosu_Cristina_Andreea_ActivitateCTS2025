package ro.cts.clase;

public class ClientFidel implements Observer {
    private String nume;

    public ClientFidel(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesajOferta) {
        System.out.println("Clientul "+nume+ " a primit oferta:"+mesajOferta);
    }
}
