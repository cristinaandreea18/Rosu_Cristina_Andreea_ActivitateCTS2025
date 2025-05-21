package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args){
        Client client1 = new Client("Ionel",null,"ionel@gmail.com");
        HandlerOferta sms = new OfertaSMS();
        HandlerOferta email = new OfertaEmail();
        HandlerOferta manager = new OfertaManager();

        sms.setUrmatorul(email);
        email.setUrmatorul(manager);
        manager.setUrmatorul(null);

        sms.gestionareNotificareRestaurant(client1);

    }
}
