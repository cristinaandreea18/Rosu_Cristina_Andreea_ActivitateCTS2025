package ro.cts.main;

import ro.cts.clase.RetetaMedicament;
import ro.cts.clase.RetetaPrototype;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[]args){
        Map<String,Double> listaSolutiiAlgocalmin = new HashMap<>();
        listaSolutiiAlgocalmin.put("Ingr.1",13.6);
        listaSolutiiAlgocalmin.put("Ingr.2",15.9);
        listaSolutiiAlgocalmin.put("Ingr.3",10.3);

        RetetaPrototype retetaMedicament = new RetetaMedicament("Viorel","A1B2C3D4","paracetamol",listaSolutiiAlgocalmin);
        System.out.println(retetaMedicament);
        RetetaPrototype retetaMedicament2 = retetaMedicament.clone("panadol");
        System.out.println(retetaMedicament2);
    }
}
