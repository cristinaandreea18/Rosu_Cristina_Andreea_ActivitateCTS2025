package ro.cts.main;

import ro.cts.clase.Card;
import ro.cts.clase.Cash;
import ro.cts.clase.Client;

public class Main {
    public static void main(String[] args){
        Client client = new Client("Ion");
        client.setModPlata(new Cash());
        client.plateste(200);

        client.setModPlata(new Card());
        client.plateste(300);
    }
}
