package ro.cts.clase;

public abstract class FelDeMancare {
    private float pret;
    private float gramaj;

    public FelDeMancare(float pret, float gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FelDeMancare{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
