package ro.cts.clase;

public class FabricaPersonalMedical implements FabricaPersonalSpital {
    private int vechime;

    public FabricaPersonalMedical(int vechime) {
        this.vechime = vechime;
    }

    @Override
    public PersonalSpital createPersonalSpital(TipPersonalSpital tip, String nume, float salariu) {
        switch ((PersonalMedical)tip){
            case MEDIC -> {
                return new Medic(vechime,nume,salariu);
            }
            case ASISTENT -> {
                return new Asistent(vechime,nume,salariu);
            }
            case BRANCARDIER -> {
                return new Brancardier(vechime,nume,salariu);
            }
            default ->{
                return null;
            }
        }
    }
}
