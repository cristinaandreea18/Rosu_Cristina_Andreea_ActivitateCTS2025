package ro.cts.main;

import ro.cts.clase.*;

public class main {
    public static void main(String[]args){
        FactorySupa factorySupa = new FactorySupa(500);
        FactoryDesert factoryDesert = new FactoryDesert("ciocolata");
        FelDeMancare supaLegume = factorySupa.creareFelDeMancare(SUPE.LEGUME,25,450);
        FelDeMancare supaCiuperci = factorySupa.creareFelDeMancare(SUPE.CIUPERCI,23,400);
        FelDeMancare tiramisu = factoryDesert.creareFelDeMancare(DESERT.TIRAMISU,20,500);
        FelDeMancare papanasi = factoryDesert.creareFelDeMancare(DESERT.PAPANASI,23,450);
        System.out.println(supaCiuperci);
        System.out.println(supaLegume);
        System.out.println(tiramisu);
        System.out.println(papanasi);
    }
}
