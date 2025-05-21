package ro.cts.clase;

public class OfertaEmail extends HandlerOferta {

    @Override
    public void gestionareNotificareRestaurant(Client client) {
        if(client.getEmail()!=null){
            System.out.println("Notificare trimisa prin email");
        }else {
            this.getUrmatorul().gestionareNotificareRestaurant(client);
        }
    }
}
