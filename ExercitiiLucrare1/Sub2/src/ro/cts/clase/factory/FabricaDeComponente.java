package ro.cts.clase.factory;

import ro.cts.clase.*;

public class FabricaDeComponente {
    private String denumire;
    private String locatie;

    public FabricaDeComponente(String denumire, String locatie) {
        this.denumire = denumire;
        this.locatie = locatie;
    }

    public ComponentaAuto getComponenta(TipComponente tip, String culoare, float greutate){
        switch ((TipComponente)tip){
            case TipComponente.Bara -> {
                return new Bara(culoare,greutate);
            }
            case TipComponente.Capota -> {
                return new Capota(culoare, greutate) {
                };
            }
            case TipComponente.Portbagaj -> {
                return new Portbagaj(culoare,greutate);
            }
            case TipComponente.Usa -> {
                return new Usa(culoare,greutate);
            }
            default -> {
                return null;
            }
        }
    }
}
