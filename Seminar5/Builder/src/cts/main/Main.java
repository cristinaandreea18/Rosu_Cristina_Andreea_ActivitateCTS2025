package cts.main;

import cts.clase.Rezervare;
import cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[]args){
        RezervareBuilder builder = new RezervareBuilder();
        Rezervare rez1 = builder.setGenMuzica("jazz").setHasAsezareGeam(true).build("Ion");
        System.out.println(rez1);
        Rezervare rez2 = builder.setGenMuzica("ambientala").setHasDecorareMasa(true).setHasAsezareGeam(true).build("Andrei");
        System.out.println(rez2);
    }
}
