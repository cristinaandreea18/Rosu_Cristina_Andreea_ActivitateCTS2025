package ro.cts.clase;

public class Persoana {
    private String nume;
    private boolean areAsigurare;

    public Persoana(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persoana{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", areAsigurare=").append(areAsigurare);
        sb.append('}');
        return sb.toString();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }

    public void setAreAsigurare(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
    }
}
