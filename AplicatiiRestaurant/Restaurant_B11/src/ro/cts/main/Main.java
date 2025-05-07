package ro.cts.main;

import ro.cts.clase.Card;
import ro.cts.clase.Cash;
import ro.cts.clase.Client;
import ro.cts.clase.ModalitatePlata;

public class Main {
    public static void main(String[] args){
        Client client = new Client("Ion");
        ModalitatePlata plata1 = new Cash();
        ModalitatePlata plata2 = new Card();
        client.setPlata(plata1);
        client.plateste(200);
        client.setPlata(plata2);
        client.plateste(300);
    }
}
