package ro.cts.main;

import ro.cts.clase.Calator;
import ro.cts.clase.CardCalatorie;
import ro.cts.clase.IMetodaPlata;
import ro.cts.clase.PlatesteSMS;

public class Main {
    public static void main(String[] args){
        IMetodaPlata metodaPlata = new CardCalatorie(2);;
        Calator calator = new Calator("andreea",metodaPlata);
        calator.platesteBilet(5);
        calator.platesteBilet(5);
        calator.setMetodaPlata(new PlatesteSMS());
        calator.platesteBilet(5);
    }
}
