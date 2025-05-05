package ro.cts.clase;

public class Preparat {
    private String denumire;
    private int tipAlocat;
    private float gradePreparare;

    public Preparat(String denumire,int tipAlocat, float gradePreparare) {
        this.denumire = denumire;
        this.tipAlocat = tipAlocat;
        this.gradePreparare = gradePreparare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Preparat{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", tipAlocat=").append(tipAlocat);
        sb.append(", gradePreparare=").append(gradePreparare);
        sb.append('}');
        return sb.toString();
    }

    public float getGradePreparare() {
        return gradePreparare;
    }
}
