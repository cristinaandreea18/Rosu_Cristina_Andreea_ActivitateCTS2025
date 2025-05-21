package ro.cts.clase;

public class OfertaSMS extends HandlerOferta {
    @Override
    public void gestionareNotificareRestaurant(Client client) {
        if(client.getNumarTelefon()!=null){
            System.out.println("Notificare trimisa prin SMS");
        }else {
            this.getUrmatorul().gestionareNotificareRestaurant(client);
        }
    }
}
