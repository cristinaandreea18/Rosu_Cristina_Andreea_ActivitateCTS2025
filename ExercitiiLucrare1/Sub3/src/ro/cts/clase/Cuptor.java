package ro.cts.clase;

import java.util.IllformedLocaleException;
import java.util.List;

public class Cuptor extends ACuptor {
    private static int nrCuptoare = 0;
    private static final int nrMaxCuptoare = 4;

    public Cuptor(String restaurantDetinator, float pret,float nrMaxGrade, List<Preparat> preparate) {
        if(nrCuptoare>=nrMaxCuptoare ){
            throw new IllegalArgumentException("S-a atins nr max de 4 cuptoare");
        }
        try
        {
            Thread.sleep(3000);

            if(restaurantDetinator.length()>0){
                this.restaurantDetinator = restaurantDetinator;
            }
            else
            {
                this.restaurantDetinator = "Anonim";
            }

            if(pret>0){
                this.pret = pret;
            }
            else
            {
                this.pret = 0;
            }
            if(nrMaxGrade>0) {
                this.nrMaxGrade = nrMaxGrade;
            }

            this.preparate = preparate;

            if(preparate!= null){
                for(Preparat p: preparate){
                    if(p.getGradePreparare()>nrMaxGrade){
                        throw new IllegalArgumentException("Preparatul  are limita maxima de "+ nrMaxGrade);
                    }
                }
            }
            nrCuptoare++;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Cuptor(){
        super();
        if(nrCuptoare>=nrMaxCuptoare ){
            throw new IllegalArgumentException("S-a atins nr max de 4 cuptoare");
        }
        nrCuptoare++;
    }


    @Override
    public ACuptor clone(float temperatura) {
        Cuptor cuptor = new Cuptor();
        cuptor.restaurantDetinator = this.restaurantDetinator;
        cuptor.pret = this.pret;
        cuptor.nrMaxGrade = this.nrMaxGrade;
        cuptor.preparate = this.preparate;
        return cuptor;
    }
}
