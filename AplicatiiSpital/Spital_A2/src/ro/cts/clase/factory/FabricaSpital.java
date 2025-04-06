package ro.cts.clase.factory;

import ro.cts.clase.Asistent;
import ro.cts.clase.Brancardier;
import ro.cts.clase.Medic;
import ro.cts.clase.PersonalSpital;

public class FabricaSpital {
    private String numeSpital;

    public FabricaSpital(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    public PersonalSpital getPersonalSpital(TipPersonalSpital tip, String nume, float salariu, int vechime){
        switch (tip){
            case ASISTENT -> {
                return new Asistent(numeSpital,nume,salariu,vechime);
            }
            case BRANCARDIER -> {
                return new Brancardier(numeSpital,nume,salariu,vechime);
            }
            case MEDIC -> {
                return new Medic(numeSpital,nume,salariu,vechime);
            }
            default -> {
                return null;
            }
        }
    }
}
