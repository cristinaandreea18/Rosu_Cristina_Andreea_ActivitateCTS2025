package ro.cts.main;

import ro.cts.clase.ABicicleta;
import ro.cts.clase.Bicicleta;
import ro.cts.clase.BicicletaBuilder;
import ro.cts.clase.factory.FabricaBiciclete;
import ro.cts.clase.factory.TipBicicleta;

public class Main {
    public static void main(String[] args){
        BicicletaBuilder builder = new BicicletaBuilder();
        Bicicleta b1 = builder.setDiametruRoti(40).setHasCascaProtectie(true).setNrViteze(4).setTipFrana("disc").build("Mountain Bike");

        b1.descriere();

        FabricaBiciclete fabricaBiciclete = new FabricaBiciclete("Pegasus");
        ABicicleta bicicletaElectrica = fabricaBiciclete.getBicicleta(TipBicicleta.Electrica,1550,35);
        ABicicleta bicicletaMTB = fabricaBiciclete.getBicicleta(TipBicicleta.MTB,1500,35);
        ABicicleta bicicletaTrekking = fabricaBiciclete.getBicicleta(TipBicicleta.Trekking,1700,37);
        ABicicleta bicicletaElectrica2 = fabricaBiciclete.getBicicleta(TipBicicleta.Electrica,1600,36);

        bicicletaElectrica.descriere();
        bicicletaMTB.descriere();
        bicicletaTrekking.descriere();
        bicicletaElectrica2.descriere();
    }
}
