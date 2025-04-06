package ro.cts.main;

import ro.cts.clase.PachetSpitalizare;
import ro.cts.clase.PachetSpitalizareBuilder;

public class Main {
    public static void main(String[]args){
        PachetSpitalizareBuilder pachetSpitalizareBuilder = new PachetSpitalizareBuilder("Ion");
        PachetSpitalizare pachetSpitalizare = pachetSpitalizareBuilder.setHasHalatInterior(true).setHasMicDejunInclus(true).build();
        System.out.println(pachetSpitalizare);
    }
}
