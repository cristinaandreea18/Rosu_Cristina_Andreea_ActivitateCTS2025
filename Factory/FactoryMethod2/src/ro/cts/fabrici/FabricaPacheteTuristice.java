package ro.cts.fabrici;

import ro.cts.clase.PachetTuristic;

public interface FabricaPacheteTuristice {
    public PachetTuristic crearePachetTuristic(TipPachetTuristic tip,float pret, int nrLocOcupat);
}
