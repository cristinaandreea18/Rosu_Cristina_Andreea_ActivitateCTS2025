package ro.cts.main;

import ro.cts.clase.AbstractPersoana;
import ro.cts.clase.FabricaPersoane;
import ro.cts.clase.LocTribuna;
import ro.cts.clase.Persoana;

public class Main {
    public static void main(String[] args){
        FabricaPersoane fabrica = new FabricaPersoane();
        try{
            AbstractPersoana persoana1 = new Persoana(180,52);
            AbstractPersoana persoana2 = new Persoana(175,50);

            LocTribuna loc1 = new LocTribuna(5,"rosu");
            LocTribuna loc2 = new LocTribuna(17,"galben");
            LocTribuna loc3 = new LocTribuna(19,"galben");
            LocTribuna loc4 = new LocTribuna(27,"rosu");
            persoana1.deseneaza(loc3);
            persoana2.deseneaza(loc4);

            fabrica.getPersoana(5,186,54).deseneaza(loc1);
            fabrica.getPersoana(17,160,50).deseneaza(loc2);
            fabrica.getPersoana(17).deseneaza(loc3);
        }
        catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
