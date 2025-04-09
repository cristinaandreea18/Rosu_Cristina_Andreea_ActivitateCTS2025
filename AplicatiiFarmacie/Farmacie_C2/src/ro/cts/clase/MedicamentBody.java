package ro.cts.clase;

public class MedicamentBody extends Medicament {
    private String zonaAfectata;

    public MedicamentBody(String denumire, float pret, String zonaAfectata) {
        super(denumire, pret);
        this.zonaAfectata = zonaAfectata;
    }

    public MedicamentBody(String zonaAfectata, String denumire, float pret) {
        super(denumire, pret);
        this.zonaAfectata = zonaAfectata;
    }

    @Override
    public void descriere() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentBody{");
        sb.append("zonaAfectata='").append(zonaAfectata).append('\'');
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
