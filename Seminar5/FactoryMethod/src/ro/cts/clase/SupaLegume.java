package ro.cts.clase;

public class SupaLegume extends FelDeMancare {
    private int cantitate;
    public SupaLegume(float pret, float nrCalorii,int cantitate) {
        super(pret, nrCalorii);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"SupaLegume{");
        sb.append("cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
