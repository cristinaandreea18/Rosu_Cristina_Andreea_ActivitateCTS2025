package ro.cts.clase.factory;

import ro.cts.clase.AMasina;
import ro.cts.clase.MasinaSEDAN;
import ro.cts.clase.MasinaSUV;
import ro.cts.clase.MasinaVAN;

public class FabricaMasina {
    private String culoare;
    private int totalAngajati;
    private int capacitateProductie;

    public FabricaMasina(String culoare, int totalAngajati, int capacitateProductie) {
        this.culoare = culoare;
        this.totalAngajati = totalAngajati;
        this.capacitateProductie = capacitateProductie;
    }

    public AMasina getMasina(TipMasina tip, String proprietar, int anFabricatie){
        switch ((TipMasina)tip){
            case TipMasina.SUV->{
                return new MasinaSUV(proprietar,anFabricatie);
            }
            case TipMasina.VAN -> {
                return new MasinaVAN(proprietar,anFabricatie);
            }
            case TipMasina.SEDAN -> {
                return new MasinaSEDAN(proprietar,anFabricatie);
            }
            default -> {
                return null;
            }
        }
    }
}
