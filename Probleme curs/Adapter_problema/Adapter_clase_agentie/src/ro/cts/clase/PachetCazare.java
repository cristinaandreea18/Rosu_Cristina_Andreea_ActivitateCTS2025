package ro.cts.clase;

public class PachetCazare implements PachetTuristic {
    @Override
    public void descriere() {
        System.out.println("Acest pachet include dora cazare!");
    }

    @Override
    public void rezervaPachet() {
        System.out.println("S-a realizat o rezervare de cazare!");
    }
}
