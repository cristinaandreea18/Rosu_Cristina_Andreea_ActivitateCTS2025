package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args){
        Notificator notificatorSMS = new NotificatorSMS();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        Client client = new Client("Ion",null,null);
        notificatorSMS.notifica(client,"Buna ziua!");
    }
}
