package ro.cts.clase;

public class SupaVita extends  FelDeMancare{
    private int timpPreparare;
    public SupaVita(float pret, float gramaj,int timpPreparare) {
        super(pret, gramaj);
        this.timpPreparare = timpPreparare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString()+"SupaVita{");
        sb.append("timpPreparare=").append(timpPreparare);
        sb.append('}');
        return sb.toString();
    }
}
