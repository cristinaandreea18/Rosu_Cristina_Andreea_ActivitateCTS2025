package ro.cts.clase.factory;

import ro.cts.clase.ARaport;
import ro.cts.clase.RaportAerCurat;
import ro.cts.clase.RaportAvertizare;
import ro.cts.clase.RaportRiscSanatate;

public class FabricaRaportCalitateAer {
    public FabricaRaportCalitateAer() {
    }

    public ARaport getRaport(float nivelParticule, float temperatura, String dataMasurare) {
        TipRaport tip = TipRaport.RAPORT_AER_CURAT;
        if (nivelParticule >= 0 && nivelParticule <= 30) {
            tip = TipRaport.RAPORT_AER_CURAT;
        } else if (nivelParticule >= 31 && nivelParticule <= 70) {
            tip = TipRaport.RAPORT_AVERTIZARE;
        } else if (nivelParticule >= 71) {
            tip = TipRaport.RAPORT_RISC_SANATATE;
        }

        switch(tip){
            case TipRaport.RAPORT_AER_CURAT->{
                return new RaportAerCurat(nivelParticule,temperatura,dataMasurare);
            }
            case TipRaport.RAPORT_AVERTIZARE->{
                return new RaportAvertizare(nivelParticule,temperatura,dataMasurare);
            }
            case TipRaport.RAPORT_RISC_SANATATE->{
                return new RaportRiscSanatate(nivelParticule,temperatura,dataMasurare);
            }
            default -> {
                return null;
            }
        }
    }
}
