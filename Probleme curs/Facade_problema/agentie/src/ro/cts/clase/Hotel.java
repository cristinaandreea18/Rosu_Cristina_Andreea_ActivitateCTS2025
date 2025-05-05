package ro.cts.clase;

public class Hotel {
    private String numeHotel;

    public Hotel(String numeHotel) {
        this.numeHotel = numeHotel;
    }

    public void rezervaCamera(String oras){
        System.out.println("Se rezerva o camera la hotelul "+numeHotel+" in orasul "+oras);
    }
}
