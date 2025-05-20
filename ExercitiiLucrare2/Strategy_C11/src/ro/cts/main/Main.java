package ro.cts.main;

import ro.cts.clase.ClientFarmacie;
import ro.cts.clase.IModPlata;
import ro.cts.clase.PlataCard;

public class Main {
    public static void main(String[] args){
        ClientFarmacie client = new ClientFarmacie("Andrei");
        client.realizeazaPlata();
        IModPlata plata = new PlataCard();
        client.setModalitatePlata(plata);
        client.realizeazaPlata();
    }
}
