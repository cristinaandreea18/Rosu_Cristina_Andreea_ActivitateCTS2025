package ro.cts.main;

import ro.cts.clase.PachetCazare;
import ro.cts.clase.PachetTuristic;
import ro.cts.decorator.OfertaPachetCazare;
import ro.cts.decorator.OfertaPachetTuristic;

public class Main {
    public static void main(String[] args){
        PachetTuristic pachetTuristic = new PachetCazare();
        pachetTuristic.descriere();
        System.out.println("Nu se poate realiza anularea!");
        System.out.println();

        OfertaPachetTuristic ofertaPachetTuristic = new OfertaPachetCazare(pachetTuristic);
        pachetTuristic.descriere();
        System.out.println("Se poate realiza anularea!");
        ofertaPachetTuristic.anulareRezervare();
    }
}
