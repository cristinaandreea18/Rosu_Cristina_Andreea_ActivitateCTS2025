package ro.cts.fabrici;

import ro.cts.clase.CazareCabana;
import ro.cts.clase.CazareHotel;
import ro.cts.clase.PachetTuristic;

public class FabricaPtCazare implements FabricaPacheteTuristice {
    private String destinatie;

    public FabricaPtCazare(String destinatie) {
        this.destinatie = destinatie;
    }

    @Override
    public PachetTuristic crearePachetTuristic(TipPachetTuristic tip,float pret, int nrLocOcupat) {
        switch ((CAZARE)tip){
            case HOTEL -> {
                CazareHotel cazareHotel = new CazareHotel(pret,nrLocOcupat);
                return cazareHotel;
            }
            case CABANA -> {
                CazareCabana cazareCabana = new CazareCabana(pret,nrLocOcupat);
                return cazareCabana;
            }
            default -> {
                return null;
            }
        }
    }
}
