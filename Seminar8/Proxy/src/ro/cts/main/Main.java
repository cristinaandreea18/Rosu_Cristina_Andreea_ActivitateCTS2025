package ro.cts.main;

import ro.cts.clase.IRezervare;
import ro.cts.clase.ProxyNumarPersoane;
import ro.cts.clase.ProxyOra;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[]args){
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Andreea",5,14);

        IRezervare proxyNumarPersoane = new ProxyNumarPersoane(rezervare);
        proxyNumarPersoane.rezerva("Andreea",3, 14);

        IRezervare proxyOra = new ProxyOra(proxyNumarPersoane);
        proxyOra.rezerva("Ana",6, 19);

    }
}
