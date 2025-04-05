package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[]args){
        FabricaDesert fabricaDesert = new FabricaDesert("vanilie");
        FabricaSupa fabricaSupa = new FabricaSupa(90);
        FelDeMancare supaCiuperci = fabricaSupa.creareFelMancare(SUPE.CIUPERCI,25,450);
        FelDeMancare supaLegume = fabricaSupa.creareFelMancare(SUPE.LEGUME,29,300);
        FelDeMancare supaVita = fabricaSupa.creareFelMancare(SUPE.VITA,25,350);

        FelDeMancare tiramisu = fabricaDesert.creareFelMancare(DESERT.TIRAMISU,15,100);
        FelDeMancare papanasi = fabricaDesert.creareFelMancare(DESERT.PAPANASI,19,150);

        System.out.println(supaCiuperci);
        System.out.println(supaLegume);
        System.out.println(supaVita);

        System.out.println(tiramisu);
        System.out.println(papanasi);
    }
}
