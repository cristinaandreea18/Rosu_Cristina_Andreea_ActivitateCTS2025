package ro.cts.clase;

public class ClientAbonati implements Observer {
    private String nume;

    public ClientAbonati(String nume) {
        this.nume = nume;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Clientul " + nume + "  a primit un mesaj personalizat:"+mesaj );
    }
}
