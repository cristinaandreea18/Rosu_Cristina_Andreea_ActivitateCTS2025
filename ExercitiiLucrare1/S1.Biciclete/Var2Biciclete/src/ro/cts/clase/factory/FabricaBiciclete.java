package ro.cts.clase.factory;

import ro.cts.clase.ABicicleta;
import ro.cts.clase.BicicletaElectrica;
import ro.cts.clase.BicicletaMTB;
import ro.cts.clase.BicicletaTrekking;

public class FabricaBiciclete {
    String marca;

    public FabricaBiciclete(String marca) {
        this.marca = marca;
    }

    public ABicicleta getBicicleta(TipBicicleta tip, double pretVanzare, float dimensiuneRoti){
        switch ((TipBicicleta)tip){
            case TipBicicleta.Electrica -> {
                return new BicicletaElectrica(marca,pretVanzare,dimensiuneRoti);
            }
            case TipBicicleta.MTB -> {
                return new BicicletaMTB(marca,pretVanzare,dimensiuneRoti);
            }
            case TipBicicleta.Trekking -> {
                return new BicicletaTrekking(marca,pretVanzare,dimensiuneRoti);
            }
            default -> {
                return null;
            }
        }
    }
}
