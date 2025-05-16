package ro.cts.main;

import ro.cts.clase.*;

public class Main {
    public static void main(String[] args){
        AbstractVerificareSpectator tipLoc = new Peluza();
        Spectator spectator = new Spectator("Ion",tipLoc);
        spectator.verificareInFunctieDeLoc();
        spectator.setTipSpectator(new TribunaVIP());
        spectator.verificareInFunctieDeLoc();
        spectator.setTipSpectator(new Tribuna());
        spectator.verificareInFunctieDeLoc();
    }
}
