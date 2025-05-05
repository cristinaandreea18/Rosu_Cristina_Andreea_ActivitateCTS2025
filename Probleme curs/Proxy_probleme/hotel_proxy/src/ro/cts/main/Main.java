package ro.cts.main;

import ro.cts.clase.IRezervare;
import ro.cts.clase.ProxyRezervare;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args){
        IRezervare rezervare = new Rezervare(3,134);
        rezervare.anulareRezervare();

        IRezervare rezervareProxy = new ProxyRezervare((Rezervare) rezervare);
        rezervareProxy.anulareRezervare();
    }
}
