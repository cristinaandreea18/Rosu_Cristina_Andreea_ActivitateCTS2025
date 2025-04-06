package ro.cts.clase;

public abstract class PersonalSpital {
    protected String nume;
    protected float salariu;

    public PersonalSpital(String nume, float salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonalSpital{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", salariu=").append(salariu);
        sb.append('}');
        return sb.toString();
    }
    public abstract void descriere();
}
