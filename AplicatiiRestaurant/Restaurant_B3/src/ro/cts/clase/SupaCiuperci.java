package ro.cts.clase;

public class SupaCiuperci  extends FelDeMancare{
    private int timpPregatire;

    public SupaCiuperci(float pret, float gramaj, int timpPregatire) {
        super(pret, gramaj);
        this.timpPregatire= timpPregatire;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"SupaCiuperci{");
        sb.append("timpPregatire=").append(timpPregatire);
        sb.append('}');
        return sb.toString();
    }
}
