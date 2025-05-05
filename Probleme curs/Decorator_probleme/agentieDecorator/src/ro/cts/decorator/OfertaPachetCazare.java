package ro.cts.decorator;

import ro.cts.clase.PachetTuristic;

public class OfertaPachetCazare extends OfertaPachetTuristic {

    public OfertaPachetCazare(PachetTuristic pachetTuristic) {
        super(pachetTuristic);
    }

    @Override
    public void anulareRezervare() {
        System.out.println("Rezervarea pentru aceasta cazare a fost anulata!");
    }
}
