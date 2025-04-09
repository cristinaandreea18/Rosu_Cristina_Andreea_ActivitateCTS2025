package ro.cts.clase;

public class FabricaMedicamenteRaceala implements FabricaMedicament {
    private String simptom;

    public FabricaMedicamenteRaceala(String simptom) {
        this.simptom = simptom;
    }

    @Override
    public Medicament createMedicament(TipMedicament tip, float pret, String denumire) {
        switch ((TipMedicament)tip){
            case RACEALA -> {
                return new MedicamentRaceala(simptom,denumire,pret);
            }
            default -> {
                return null;
            }
        }
    }
}
