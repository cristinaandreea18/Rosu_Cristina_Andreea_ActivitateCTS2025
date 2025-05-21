package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;
public class Salon {
    private int numarSalon;
    private List<Integer>paturiLibere;
    private List<Integer>paturiOcupate;

    public Salon(int numarSalon, List<Integer>paturiLibere, List<Integer> paturiOcupate) {
        this.numarSalon = numarSalon;
        this.paturiLibere = paturiLibere;
        this.paturiOcupate = paturiOcupate;
    }

    public boolean verificareDisponibilitateSalon(int numarSalon){
        if(paturiLibere!=null && !paturiLibere.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

    public int getNumarSalon() {
        return numarSalon;
    }
}
