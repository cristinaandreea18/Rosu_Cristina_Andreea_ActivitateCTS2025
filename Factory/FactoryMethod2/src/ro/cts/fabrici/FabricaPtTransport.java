package ro.cts.fabrici;

import ro.cts.clase.PachetTuristic;
import ro.cts.clase.TransportAutocar;
import ro.cts.clase.TransportMicrobuz;

public class FabricaPtTransport implements FabricaPacheteTuristice {
    private float distantaParcursa;

    public FabricaPtTransport(float distantaParcursa) {
        this.distantaParcursa = distantaParcursa;
    }

    @Override
    public PachetTuristic crearePachetTuristic(TipPachetTuristic tip,float pret, int nrLocOcupat) {
        switch ((TRANSPORT)tip){
            case AUTOCAR -> {
                TransportAutocar transportAutocar = new TransportAutocar(pret,nrLocOcupat);
                return transportAutocar;
            }
            case MICROBUZ -> {
                TransportMicrobuz transportMicrobuz = new TransportMicrobuz(pret, nrLocOcupat);
                return transportMicrobuz;
            }
            default -> {
                return null;
            }
        }
    }
}
