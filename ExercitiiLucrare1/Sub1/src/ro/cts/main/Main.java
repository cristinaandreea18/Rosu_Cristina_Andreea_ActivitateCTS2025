package ro.cts.main;

import ro.cts.clase.AMasina;
import ro.cts.clase.Service;
import ro.cts.clase.factory.FabricaMasina;
import ro.cts.clase.factory.TipMasina;

public class Main {
    public static void main(String[]args){
        Service service = Service.getInstance("La Bucsa",5,"Maldaeni");
        System.out.println(service);

        Service service2 = Service.getInstance("Spaima soselelor",6,"Rosiori");
        System.out.println(service2);

        FabricaMasina fabricaMasina = new FabricaMasina("gri",25,100);
        AMasina suv = fabricaMasina.getMasina(TipMasina.SUV,"Ion",2005);
        AMasina sedan = fabricaMasina.getMasina(TipMasina.SEDAN,"Vasile",2008);

        AMasina suv2 = fabricaMasina.getMasina(TipMasina.SUV,"Gigel",2007);
        AMasina van = fabricaMasina.getMasina(TipMasina.VAN,"Ionel",2005);

        suv.descriere();
        sedan.descriere();
        suv2.descriere();
        van.descriere();

        System.out.println("---------------------------------------");
        service.reparaMasina(suv," accident");
        service.reparaMasina(van," schimb avelope ");
        service.reparaMasina(suv2," schimb ulei si filtre");
    }
}
