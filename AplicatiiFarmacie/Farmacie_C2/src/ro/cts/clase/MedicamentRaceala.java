package ro.cts.clase;

public class MedicamentRaceala extends Medicament {
    private String simptom;

    public MedicamentRaceala(String simptom,String denumire, float pret) {
        super(denumire, pret);
        this.simptom = simptom;
    }

    @Override
    public void descriere() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentRaceala{");
        sb.append("simptom='").append(simptom).append('\'');
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
