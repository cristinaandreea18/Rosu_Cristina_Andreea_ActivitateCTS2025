package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args){
        PachetTuristic pachetTuristic = new PachetTransport(19);
        Operator operator = new Operator();

        Command rezervare = new ComandaRezervare(pachetTuristic);
        Command vanzare = new ComandaVanzare(pachetTuristic);

        operator.invoca(rezervare);
        operator.invoca(vanzare);

        operator.undo();
        operator.undo();

    }
}
