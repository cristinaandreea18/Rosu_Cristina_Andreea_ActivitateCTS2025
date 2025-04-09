package ro.cts.clase;

public abstract class Medicament {
    protected String denumire;
    protected float pret;

    public Medicament(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public abstract void descriere();
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", pret='").append(pret).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
