package ro.cts.main;

import ro.cts.clase.PachetSpitalizare;
import ro.cts.clase.PachetSpitalizareBuilder;

public class Main {
    public static void main(String[]args){
        PachetSpitalizareBuilder builder = new PachetSpitalizareBuilder();
        PachetSpitalizare pachetSpitalizare = builder.setHasMicDejunInclus(true).setHasPatRabatabil(true).setHasPapuciDeCamera(true).build("Andrei");
        System.out.println(pachetSpitalizare);
    }
}
