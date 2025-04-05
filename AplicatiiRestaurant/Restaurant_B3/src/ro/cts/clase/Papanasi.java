package ro.cts.clase;

public class Papanasi extends FelDeMancare {
    private String aroma;
    public Papanasi(float pret, float gramaj,String aroma) {
        super(pret, gramaj);
        this.aroma = aroma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"Papanasi{");
        sb.append("aroma='").append(aroma).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
