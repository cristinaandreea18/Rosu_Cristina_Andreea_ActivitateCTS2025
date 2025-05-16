package ro.cts.main;

import ro.cts.clase.EntryValidatorFacade;

public class Main {
    public static void main(String[] args){
        EntryValidatorFacade facade = new EntryValidatorFacade();
        facade.validareIntrare("x1x2x3x4x5","12345");

    }
}
