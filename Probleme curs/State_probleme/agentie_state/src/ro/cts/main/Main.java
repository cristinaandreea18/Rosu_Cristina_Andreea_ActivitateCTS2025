package ro.cts.main;

import ro.cts.clase.Rezervare;
import ro.cts.clase.StareNeplatita;
import ro.cts.clase.StarePlatita;

public class Main {
    public static void main(String[] args){
        Rezervare rezervare = new Rezervare(200);
        StareNeplatita neplatita = new StareNeplatita();
        neplatita.doAction(rezervare);

        StarePlatita platita = new StarePlatita();
        platita.doAction(rezervare);
    }
}
