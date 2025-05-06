package ro.cts.clase;

public class ComandaRezervare implements Command {
    private PachetTuristic pachetTuristic;

    public ComandaRezervare(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void execute() {
        pachetTuristic.rezervare();
    }

    @Override
    public void unexecute() {
        pachetTuristic.anulareRezervare();
    }
}
