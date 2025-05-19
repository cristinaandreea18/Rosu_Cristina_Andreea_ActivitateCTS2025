package ro.cts.clase;

public class PachetCazare implements PachetTuristic {
    @Override
    public void descrire() {
        System.out.println("Acest pachet include doar cazare!");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("Rezervarea pachetului de cazare s-a realizat cu succes");
    }
}
