package ro.cts.clase;

public class FisaAccident {
    private String nume;
    private int nivelGravitate;

    public FisaAccident(String nume, int nivelGravitate) {
        this.nume = nume;
        this.nivelGravitate = nivelGravitate;
    }

    public void setNivelGravitate(int nivelGravitate) {
        this.nivelGravitate = nivelGravitate;
    }

    public int getNivelGravitate() {
        return nivelGravitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FisaAccident{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nivelGravitate=").append(nivelGravitate);
        sb.append('}');
        return sb.toString();
    }
}
