package ro.cts.clase.factory;

import ro.cts.clase.Autobuz;
import ro.cts.clase.MijlocTransport;
import ro.cts.clase.Tramvai;
import ro.cts.clase.Troleibuz;

public class FabricaMijlocTransport {
    private String oras;
    private static FabricaMijlocTransport instance = null;

    private FabricaMijlocTransport(String oras) {
        this.oras = oras;
    }
    public static FabricaMijlocTransport getInstance(String oras){
        if(instance==null){
            instance = new FabricaMijlocTransport(oras);
        }
        return instance;
    }

    public MijlocTransport getMijlocTransport(TipMijlocTransport tip, int nrLocuri, int nr, String zonaReferintaTransport){
        switch ((TipMijlocTransport)tip){
            case TipMijlocTransport.Autobuz -> {
                return new Autobuz(nrLocuri,nr,zonaReferintaTransport);
            }
            case TipMijlocTransport.Tramvai -> {
                return new Tramvai(nrLocuri,nr,zonaReferintaTransport);
            }
            case TipMijlocTransport.Troleibuz -> {
                return new Troleibuz(nrLocuri,nr,zonaReferintaTransport);
            }
            default -> {
                return null;
            }
        }
    }

    public void descriereFabrica(){
        System.out.println("Fabrica a produs mijloace de transport pentru orasul "+oras);
    }
}
