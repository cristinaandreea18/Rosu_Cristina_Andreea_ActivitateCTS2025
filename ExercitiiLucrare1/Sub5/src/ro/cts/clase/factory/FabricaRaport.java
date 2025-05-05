package ro.cts.clase.factory;

import ro.cts.clase.AbstractRaport;
import ro.cts.clase.RaportAvertizare;
import ro.cts.clase.RaportEroare;
import ro.cts.clase.RaportSucces;

public class FabricaRaport {
    private String denumireFabrica;

    public FabricaRaport(String denumireFabrica) {
        this.denumireFabrica = denumireFabrica;
    }

    public AbstractRaport getRaport(TipRaport tip,float timpExecutieTest, String comportament, String coliziune){
        switch ((TipRaport)tip){
            case TipRaport.ERROR -> {
                return new RaportEroare(timpExecutieTest,comportament,coliziune);
            }
            case TipRaport.SUCCESS -> {
                return new RaportSucces(timpExecutieTest,comportament,coliziune);
            }
            case TipRaport.WARNING -> {
                return new RaportAvertizare(timpExecutieTest,comportament,coliziune);
            }
            default -> {
                throw  new IllegalArgumentException("Acest tip nu este unul valid");
            }
        }
    }
}
