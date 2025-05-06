package ro.cts.main;

import ro.cts.clase.PachetCazare;
import ro.cts.clase.PachetCazareTransport;
import ro.cts.clase.PachetTuristic;

public class Main {
    public static void main(String[] args){
        PachetTuristic pachetCazare = new PachetCazare(9);
        pachetCazare.vindePachet();

        System.out.println();

        PachetTuristic pachetCazareTransport = new PachetCazareTransport(13);
        pachetCazareTransport.vindePachet();
    }
}
