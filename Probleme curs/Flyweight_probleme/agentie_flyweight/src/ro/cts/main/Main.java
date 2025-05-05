package ro.cts.main;

import ro.cts.clase.FabricaDePachete;
import ro.cts.clase.Optionale;
import ro.cts.clase.PachetTuristic;

public class Main {
    public static void main(String[]args){
        FabricaDePachete fabricaPachete = new FabricaDePachete();
        Optionale optional1 = new Optionale(true,2);
        Optionale optional2 = new Optionale(false,3);
        Optionale optional3 = new Optionale(true,4);

        PachetTuristic pachet = (PachetTuristic) fabricaPachete.getPachetTuristic(1);
        pachet.descrierePachet(optional1);
        fabricaPachete.getPachetTuristic(2).descrierePachet(optional3);
        optional3.setNumarExcursii(20);
        fabricaPachete.getPachetTuristic(2).descrierePachet(optional3);
        fabricaPachete.getPachetTuristic(1).descrierePachet(optional2);
        fabricaPachete.getPachetTuristic(1).descrierePachet(optional1);

        System.out.println(fabricaPachete.getNumarPachete());

    }
}
