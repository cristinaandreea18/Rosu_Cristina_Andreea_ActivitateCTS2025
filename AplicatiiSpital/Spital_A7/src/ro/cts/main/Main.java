package ro.cts.main;

import ro.cts.clase.Rezultate;
import ro.cts.clase.RezultateOnline;
import ro.cts.clase.RezultatePrintate;

public class Main {
    public static void main(String[] args){
        Rezultate rezultatePrintate = new RezultatePrintate("Ion");
        Rezultate rezultateOnline = new RezultateOnline(rezultatePrintate);
        rezultatePrintate.furnizeaza();
        System.out.println();
        rezultateOnline.furnizeaza();
    }
}
