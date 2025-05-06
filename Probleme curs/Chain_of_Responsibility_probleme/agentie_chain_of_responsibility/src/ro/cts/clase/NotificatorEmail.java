package ro.cts.clase;

public class NotificatorEmail extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getAdresaEmail()!=null){
            System.out.println("Clientul cu numele "+client.getNume()+" a primit un mail cu mesajul "+mesaj);
        }
        else {
            super.getUrmatorulNotificator().notifica(client,mesaj);
        }
    }
}
