package ro.cts.main;

import ro.cts.clase.MijlocTransport;
import ro.cts.clase.factory.FabricaMijlocTransport;
import ro.cts.clase.factory.TipMijlocTransport;

public class Main {
    public static void main(String[] args){
        FabricaMijlocTransport fabricaMijlocTransport = FabricaMijlocTransport.getInstance("Bucureti");
        fabricaMijlocTransport.descriereFabrica();
        MijlocTransport autobuz = fabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Autobuz,30,105,"Valea Oltului-Nicolae Titulescu");
        MijlocTransport troleibuz = fabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Troleibuz,35,62, "Grup Scolar Auto-Gara de Nord");

        System.out.println(autobuz);
        System.out.println(troleibuz);

        FabricaMijlocTransport fabricaMijlocTransport2 = FabricaMijlocTransport.getInstance("Craiova");
        fabricaMijlocTransport2.descriereFabrica();
    }
}
