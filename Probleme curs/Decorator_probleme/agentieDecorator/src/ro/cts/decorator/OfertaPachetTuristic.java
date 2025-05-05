package ro.cts.decorator;

import ro.cts.clase.PachetCazare;
import ro.cts.clase.PachetTuristic;

public abstract class OfertaPachetTuristic implements PachetTuristic {
    private PachetTuristic pachetTuristic;

    public OfertaPachetTuristic(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void descriere() {
        pachetTuristic.descriere();
    }

    public abstract void anulareRezervare();
}
