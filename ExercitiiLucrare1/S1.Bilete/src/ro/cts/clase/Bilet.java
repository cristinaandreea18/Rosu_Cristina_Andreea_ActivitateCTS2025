package ro.cts.clase;
import java.util.HashSet;
import java.util.Set;

public abstract class Bilet {
    protected String titlu;
    protected String regie;
    protected String actorPrincipal;
    protected String companieProducatoare;
    protected String scurtaDescriere;
    protected boolean areReclame;
    protected String data;
    protected int ora;
    protected Set<Integer> locuriOcupate = new HashSet<>();

    public Bilet(String titlu, String regie, String actorPrincipal, String companieProducatoare, String scurtaDescriere, boolean areReclame, String data, int ora, Set<Integer> locuriOcupate) {
        try{
            Thread.sleep(10000);
            this.titlu = titlu;
            this.regie = regie;
            this.actorPrincipal = actorPrincipal;
            this.companieProducatoare = companieProducatoare;
            this.scurtaDescriere = scurtaDescriere;
            this.areReclame = areReclame;
            this.data = data;
            this.ora = ora;
            this.locuriOcupate = locuriOcupate;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public Bilet(){

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", regie='").append(regie).append('\'');
        sb.append(", actorPrincipal='").append(actorPrincipal).append('\'');
        sb.append(", companieProducatoare='").append(companieProducatoare).append('\'');
        sb.append(", scurtaDescriere='").append(scurtaDescriere).append('\'');
        sb.append(", areReclame=").append(areReclame);
        sb.append(", data='").append(data).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", locuriOcupate=").append(locuriOcupate);
        sb.append('}');
        return sb.toString();
    }

    public abstract Bilet clone(String data, int ora, Set<Integer>locuriOcupate);
}
