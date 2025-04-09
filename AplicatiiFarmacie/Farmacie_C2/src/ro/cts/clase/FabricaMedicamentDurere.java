package ro.cts.clase;

public class FabricaMedicamentDurere implements FabricaMedicament {
    private String modAdministrare;

    public FabricaMedicamentDurere(String modAdministrare) {
        this.modAdministrare = modAdministrare;
    }

    @Override
    public Medicament createMedicament(TipMedicament tip,float pret, String denumire) {
        switch ((TipMedicament)tip){
            case DURERE -> {
                return new MedicamentDurere(modAdministrare,denumire,pret);
            }
            default -> {
                return null;
            }
        }
    }
}
