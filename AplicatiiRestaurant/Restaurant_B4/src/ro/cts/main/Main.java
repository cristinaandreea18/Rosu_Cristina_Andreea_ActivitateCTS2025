package ro.cts.main;

import ro.cts.clase.AbstractRezervare;
import ro.cts.clase.RezervareInterior;

public class Main {
    public static void main(String[]args){
        AbstractRezervare rezervareInterior = new RezervareInterior(3,"Ion","13/04/2025",15,"jazz");
        AbstractRezervare rezervareInterior1 = rezervareInterior.copiaza(19);

        System.out.println(rezervareInterior1);
    }
}
