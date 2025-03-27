package ro.cts.clase;

public class SupaCiuperci extends FelDeMancare {
    private int cantitate;
    public SupaCiuperci(float pret, float nrCalorii,int cantitate) {
        super(pret, nrCalorii);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"SupaCiuperci{");
        sb.append("cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
