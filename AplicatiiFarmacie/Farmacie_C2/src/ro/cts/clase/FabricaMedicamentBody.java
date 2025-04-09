package ro.cts.clase;

public class FabricaMedicamentBody implements FabricaMedicament {
    private String zonaAfectata;

    public FabricaMedicamentBody(String zonaAfectata) {
        this.zonaAfectata = zonaAfectata;
    }

    @Override
    public Medicament createMedicament(TipMedicament tip, float pret, String denumire) {
        switch ((TipMedicament)tip){
            case BODY -> {
                return new MedicamentBody(zonaAfectata,denumire,pret);
            }
            default -> {
                return null;
            }
        }
    }
}
