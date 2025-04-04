package ro.cts.registry;

public class PachetCazare implements PachetTuristic {
    @Override
    public void descriere() {
        System.out.println("Acest pachet contine doar cazare");
    }

    public PachetCazare() {
    }
}
