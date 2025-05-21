package ro.cts.main;

import ro.cts.clase.IRezervare;
import ro.cts.clase.Persoana;
import ro.cts.clase.ProxyRezervare;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args){
        Persoana persoana1 = new Persoana("Ilie","X","10:30",3);
        Persoana persoana2 = new Persoana("Alex","Y","18:00",4);

        IRezervare rezervare = new Rezervare();
        rezervare.rezerva(persoana1);
        IRezervare rezervare2 = new ProxyRezervare(rezervare);
        rezervare2.rezerva(persoana2);
    }
}
