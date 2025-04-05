package ro.cts.clase;

public class Tiramisu extends  FelDeMancare {
    private String aroma;

    public Tiramisu(float pret, float gramaj, String aroma) {
        super(pret, gramaj);
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Tiramisu{");
        sb.append("aroma='").append(aroma).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
