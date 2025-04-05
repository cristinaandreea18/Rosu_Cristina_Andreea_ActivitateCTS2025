package ro.cts.main;

import ro.cts.clase.Supa;
import ro.cts.clase.factory.FabricaSupe;
import ro.cts.clase.factory.TipSupa;

public class Main {
    public static void main(String[] args){

        FabricaSupe fabricaSupe = new FabricaSupe(25);

        Supa supaLegume = fabricaSupe.CreateSupa(TipSupa.LEGUME,"45min",350);
        Supa supaCiuperci = fabricaSupe.CreateSupa(TipSupa.CIUPERCI,"1h",370);
        Supa supaVita = fabricaSupe.CreateSupa(TipSupa.VITA,"2h",450);

        supaLegume.descriere();
        supaCiuperci.descriere();
        supaVita.descriere();

    }
}
