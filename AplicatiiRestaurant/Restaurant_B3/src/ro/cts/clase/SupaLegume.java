package ro.cts.clase;

public class SupaLegume extends FelDeMancare {
    private int timpPregatire;
    public SupaLegume(float pret, float gramaj, int timpPregatire) {
        super(pret, gramaj);
        this.timpPregatire= timpPregatire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"SupaLegume{");
        sb.append("timpPregatire=").append(timpPregatire);
        sb.append('}');
        return sb.toString();
    }
}
