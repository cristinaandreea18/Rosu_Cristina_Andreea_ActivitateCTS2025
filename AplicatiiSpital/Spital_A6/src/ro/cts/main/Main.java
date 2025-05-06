package ro.cts.main;

import ro.cts.clase.Facade;
import ro.cts.clase.Pacient;

public class Main {
    public static void main(String[] args){
        Pacient p = new Pacient("Vasile",16,4,"Ion");
        Facade facade = new Facade();
        System.out.println(facade.poateSaFieInternat(p));
    }
}
