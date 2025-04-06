package ro.cts.clase;

public class FabricaPersonalNonMedical implements FabricaPersonalSpital {
    private int oreProgram;

    public FabricaPersonalNonMedical(int oreProgram) {
        this.oreProgram = oreProgram;
    }

    @Override
    public PersonalSpital createPersonalSpital(TipPersonalSpital tip, String nume, float salariu) {
        switch ((PersonalNonMedical)tip){
            case SECRETAR -> {
                return new Secretar(oreProgram,nume,salariu);
            }
            case REGISTRATOR -> {
                return new Registrator(oreProgram,nume,salariu);
            }
            default -> {
                return null;
            }
        }
    }
}
