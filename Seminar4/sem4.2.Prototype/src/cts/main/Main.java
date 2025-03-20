package cts.main;

import cts.clase.AbstractRezervare;
import cts.clase.RezervareTerasa;

public class Main {
    public static void main(String[]args){
        AbstractRezervare rezervareTerasa = new RezervareTerasa(12,13,"Maricica",9,true);
        AbstractRezervare rezervareTerasa2 = rezervareTerasa.copiaza(17);
        AbstractRezervare rezervareTerasa3 = rezervareTerasa2.copiaza(19);

        System.out.println(rezervareTerasa.toString());
        System.out.println(rezervareTerasa2.toString());
        rezervareTerasa2.setZiuaLunii(20);
        System.out.println(rezervareTerasa2.toString());
    }
}
