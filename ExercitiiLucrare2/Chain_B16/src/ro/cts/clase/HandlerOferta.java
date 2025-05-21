package ro.cts.clase;

public abstract class HandlerOferta {
    private HandlerOferta urmatorul;

    public HandlerOferta getUrmatorul() {
        return urmatorul;
    }

    public void setUrmatorul(HandlerOferta urmatorul) {
        this.urmatorul = urmatorul;
    }

    public abstract void gestionareNotificareRestaurant(Client client);

}
