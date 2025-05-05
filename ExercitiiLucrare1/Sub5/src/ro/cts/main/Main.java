package ro.cts.main;

import ro.cts.clase.AbstractRaport;
import ro.cts.clase.Internet;
import ro.cts.clase.SenzorPerimetral;
import ro.cts.clase.SenzorTemperatura;
import ro.cts.clase.factory.FabricaRaport;
import ro.cts.clase.factory.TipRaport;

public class Main {
    public static void main(String[]args){
        Internet internet = Internet.getInstance("digi");
        SenzorPerimetral senzorPerimetral = SenzorPerimetral.getInstance(50);
        SenzorTemperatura senzorTemperatura = SenzorTemperatura.getInstance(60);

        Internet internet2 = Internet.getInstance("vodafone");
        System.out.println(internet);
        System.out.println(senzorPerimetral);
        System.out.println(senzorTemperatura);
        System.out.println(internet);


        FabricaRaport fabricaRaport = new FabricaRaport("Rapoarte pe banda rulanta");
        AbstractRaport raportAvertizare = fabricaRaport.getRaport(TipRaport.WARNING,60,"agresiv cu obstacolele","impact devastator");
        System.out.println(raportAvertizare);
    }
}
