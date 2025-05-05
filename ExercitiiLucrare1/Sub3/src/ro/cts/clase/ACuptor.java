package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ACuptor {
    protected String restaurantDetinator;
    protected float pret;
    protected float nrMaxGrade;
    protected List<Preparat> preparate = new ArrayList<>();

    public ACuptor(String restaurantDetinator, float pret,float nrMaxGrade, List<Preparat> preparate) {
        this.restaurantDetinator = restaurantDetinator;
        this.pret = pret;
        this.nrMaxGrade = nrMaxGrade;
        this.preparate = preparate;
    }

    public ACuptor() {

    }

    public abstract ACuptor clone(float temperatura);

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ACuptor{");
        sb.append("restaurantDetinator='").append(restaurantDetinator).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrMaxGrade=").append(nrMaxGrade);
        sb.append(", preparate=").append(preparate);
        sb.append('}');
        return sb.toString();
    }
}
