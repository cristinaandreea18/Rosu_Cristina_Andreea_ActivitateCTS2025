package ro.cts.main;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[]args){
        RezervareBuilder rezervareBuilder = new RezervareBuilder("Tudor");
        Rezervare rez1 = rezervareBuilder.setGenMuzica("jazz").setHasAsezareGeam(true).setHasScauneErgonomice(true).build();
        Rezervare rez2 = rezervareBuilder.setGenMuzica("ambientala").setHasDecorareMasa(true).build();

        System.out.println(rez1);
        System.out.println(rez2);
    }
}
