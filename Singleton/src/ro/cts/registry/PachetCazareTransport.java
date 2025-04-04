package ro.cts.registry;

public class PachetCazareTransport implements PachetTuristic {
    @Override
    public void descriere() {
        System.out.println("Acest pachet contine atat cazare, cat si transport");
    }

    public PachetCazareTransport() {
    }
}
