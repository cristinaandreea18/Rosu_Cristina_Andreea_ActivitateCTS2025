package ro.cts.main;

import ro.cts.clase.FabricaSupa.FabricaSupa;
import ro.cts.clase.FabricaSupa.TipSupa;
import ro.cts.clase.Supa;
import ro.cts.clase.SupaLegume;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabricaSupa = new FabricaSupa(14.99f, 49.99f);
        Supa supaLegume = fabricaSupa.getSupe(TipSupa.LEGUME, 320);
        Supa supaVita = fabricaSupa.getSupe(TipSupa.VITA, 350);
        Supa supaCocos = fabricaSupa.getSupe(TipSupa.COCOS, 360);

        supaLegume.afiseazaDescriere();
        supaVita.afiseazaDescriere();
        supaCocos.afiseazaDescriere();
    }
}