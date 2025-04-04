package ro.cts.registry;

public class PachetTransport implements PachetTuristic {
    @Override
    public void descriere() {
        System.out.println("Acest pachet contine doar transport");
    }

    public PachetTransport() {
    }
}
