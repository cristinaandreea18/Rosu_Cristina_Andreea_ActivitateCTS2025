package ro.cts.main;

import ro.cts.registry.Autoritate;
import ro.cts.registry.Reglementare;

public class MainRegistry {
    public static void main(String[]args){
        Autoritate autoritate = Autoritate.getInstance("Autoritate","www.ase.ro");
        Reglementare reglementare = autoritate.reglementeazaModel("Dacia Logan");
        Reglementare reglementare2 = autoritate.reglementeazaModel("Tesla CyberTruck");
        System.out.println(reglementare);
        System.out.println(reglementare2);

        Reglementare reglementare3 = autoritate.reglementeazaModel("Dacia Logan");
        System.out.println(reglementare3);

    }
}
