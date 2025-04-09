package ro.cts.clase;

public class MedicamentDurere extends Medicament {
    private String modAdministrare;
    public MedicamentDurere(String modAdministrare,String denumire, float pret) {
        super(denumire, pret);
        this.modAdministrare = modAdministrare;
    }

    @Override
    public void descriere() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MedicamentDurere{");
        sb.append("modAdministrare='").append(modAdministrare).append('\'');
        sb.append(", denumire='").append(denumire).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
