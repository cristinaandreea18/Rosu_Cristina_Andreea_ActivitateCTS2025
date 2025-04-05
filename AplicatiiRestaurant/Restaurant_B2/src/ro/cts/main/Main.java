package ro.cts.main;

import ro.cts.clase.Rezervare;
import ro.cts.clase.RezervareBuilder;

public class Main {
    public static void main(String[]args){
        RezervareBuilder builder = new RezervareBuilder("Ana","13/04/2025");
        Rezervare rezervare = builder.setHasDecorareMasa(true).setHasAsezareLaGeam(true).setGenMuzica("pian").build();
        System.out.println(rezervare);
    }
}
