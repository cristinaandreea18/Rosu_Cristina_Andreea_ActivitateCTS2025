package ro.cts.clase;

import java.util.List;

public class Spital {
    private String numeSpital;
    private List<Salon> saloaneSpital;

    public Spital(String numeSpital, List<Salon> saloaneSpital) {
        this.numeSpital = numeSpital;
        this.saloaneSpital = saloaneSpital;
    }

    public boolean verificareDisponibilitateSaloane(){
        for(Salon s: saloaneSpital){
            if(s.verificareDisponibilitatePaturi()){
                return true;
            }
        }
        return false;
    }

    public String getNumeSpital() {
        return numeSpital;
    }
}
