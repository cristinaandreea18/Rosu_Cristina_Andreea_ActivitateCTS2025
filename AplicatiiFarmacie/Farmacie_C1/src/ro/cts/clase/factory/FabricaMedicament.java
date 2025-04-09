package ro.cts.clase.factory;

import ro.cts.clase.Medicament;
import ro.cts.clase.MedicamentBody;
import ro.cts.clase.MedicamentDurere;
import ro.cts.clase.MedicamentRaceala;

public class FabricaMedicament {
    public String destinatieFarmacie;

    public FabricaMedicament(String destinatieFarmacie) {
        this.destinatieFarmacie = destinatieFarmacie;
    }

    public Medicament createMedicament(TipMedicament tip, float pret, String denumire){
        switch ((TipMedicament)tip){
            case TipMedicament.BODY -> {
                return new MedicamentBody(pret,denumire);
            }
            case TipMedicament.DURERE -> {
                return new MedicamentDurere(pret,denumire);
            }
            case TipMedicament.RACEALA -> {
                return new MedicamentRaceala(pret,denumire);
            }
            default -> {
                return null;
            }
        }
    }
}
