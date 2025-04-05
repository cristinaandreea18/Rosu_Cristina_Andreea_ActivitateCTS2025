package ro.cts.clase.factory;

import ro.cts.clase.Supa;
import ro.cts.clase.SupaCiuperci;
import ro.cts.clase.SupaLegume;
import ro.cts.clase.SupaVita;

public class FabricaSupe {
    private float pret;

    public FabricaSupe(float pret) {
        this.pret = pret;
    }

    public Supa CreateSupa(TipSupa tip, String timpPreparare, int gramaj){
        switch (tip){
            case LEGUME -> {
                SupaLegume supaLegume = new SupaLegume(timpPreparare,pret,gramaj);
                return supaLegume;
            }
            case CIUPERCI -> {
                SupaCiuperci supaCiuperci = new SupaCiuperci(timpPreparare,pret,gramaj);
                return supaCiuperci;
            }
            case VITA -> {
                SupaVita supaVita = new SupaVita(timpPreparare,pret,gramaj);
                return supaVita;
            }
            default -> {
                return null;
            }
        }
    }
}
