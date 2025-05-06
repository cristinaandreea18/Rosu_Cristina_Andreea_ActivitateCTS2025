package ro.cts.clase;

public class NotificatorSMS extends Notificator {

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNrTelefon()!=null){
            System.out.println(client.getNume()+" a primit un sms cu mesajul "+mesaj);
        }
        else {
            super.getUrmatorulNotificator().notifica(client,mesaj);
        }
    }
}
