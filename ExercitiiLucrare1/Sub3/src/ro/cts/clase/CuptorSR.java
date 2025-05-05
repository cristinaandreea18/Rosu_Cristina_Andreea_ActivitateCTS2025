package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class CuptorSR {
    private String restaurantDetinator;
    private float pret;
    private List<Preparat> preparate = new ArrayList<>();

    private static CuptorSR instance = null;

    private CuptorSR(String restaurantDetinator, float pret, List<Preparat> preparate) {
        this.restaurantDetinator = restaurantDetinator;
        this.pret = pret;
        this.preparate = preparate;
    }

    public Preparat gatestePreparat(Preparat preparat){
        if(!preparate.contains(preparat)){
            preparate.add(preparat);
            System.out.println("Preparatul a fost introdus in cuptor");
        }
        else
        {
            System.out.println("Preparatul se gateste");
        }
        return preparat;
    }

    public static CuptorSR getInstance(String restaurantDetinator, float pret, List<Preparat> preparate){
        if (instance==null){
            instance = new CuptorSR(restaurantDetinator,pret,preparate);
        }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append("restaurantDetinator='").append(restaurantDetinator).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", preparate=").append(preparate);
        sb.append('}');
        return sb.toString();
    }
}
