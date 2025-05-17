package ro.cts.main;

import ro.cts.clase.AjutorFarmacist;
import ro.cts.clase.Farmacist;
import ro.cts.clase.HandlerComanda;

public class Main {
    public static void main(String[] args){
        HandlerComanda farmacist = new Farmacist();
        HandlerComanda ajutor = new AjutorFarmacist();

        farmacist.setUrmatorul(ajutor);
        ajutor.setUrmatorul(null);

        farmacist.trimiteComanda("paracetamol");
        farmacist.trimiteComanda("diclofenac");
    }
}
