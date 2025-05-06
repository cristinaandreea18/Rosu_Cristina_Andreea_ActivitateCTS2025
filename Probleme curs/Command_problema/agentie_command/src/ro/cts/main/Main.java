package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args){
        PachetTuristic pachetTuristic = new PachetCazare(5);
        Operator operator = new Operator();

        Command rezervare = new ComandaRezervare(pachetTuristic);
        operator.invoca(rezervare);

        Command vanzare = new ComandaVanzare(pachetTuristic);
        operator.invoca(vanzare);
    }
}
