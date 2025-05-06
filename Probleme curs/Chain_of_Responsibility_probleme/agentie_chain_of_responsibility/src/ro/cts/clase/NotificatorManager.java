package ro.cts.clase;

public class NotificatorManager extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Agentia nu poate notifica managerul, deoarece agentia nu detine date de contact pentru clientul "+client.getNume());
    }
}
