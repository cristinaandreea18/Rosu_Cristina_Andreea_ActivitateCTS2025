package ro.cts.main;

import ro.cts.clase.*;


public class Main {
    public static void main(String[] args){
        HandlerAccidentare cursant = new Cursant();
        HandlerAccidentare antrenor = new Antrenor();
        HandlerAccidentare asistent = new AsistentMedical();
        HandlerAccidentare medic = new Medic();

        cursant.setHandler(antrenor);
        antrenor.setHandler(asistent);
        asistent.setHandler(medic);
        medic.setHandler(null);

        FisaAccident fisa = new FisaAccident("Ion",5);
        cursant.gestionareAccidentare(fisa);
        System.out.println();
        fisa.setNivelGravitate(10);
        cursant.gestionareAccidentare(fisa);
        System.out.println();
        fisa.setNivelGravitate(15);
        cursant.gestionareAccidentare(fisa);
        System.out.println();
        fisa.setNivelGravitate(20);
        cursant.gestionareAccidentare(fisa);
    }
}
