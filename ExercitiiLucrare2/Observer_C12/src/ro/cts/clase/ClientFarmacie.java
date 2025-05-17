package ro.cts.clase;

public class ClientFarmacie implements Observer {
    private String nume;

    public ClientFarmacie(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteOferta(String mesajOferta) {
        System.out.println("Clientul "+nume+ " a primit noficare pentru oferta "+mesajOferta);
    }
}
