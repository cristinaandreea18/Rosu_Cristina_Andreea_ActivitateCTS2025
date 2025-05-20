package ro.cts.main;

import ro.cts.clase.Banca;
import ro.cts.clase.ClientAbonati;
import ro.cts.clase.Observer;

public class Main {
    public static void main(String[] args){
        Observer client1 = new ClientAbonati("Ion");
        Observer client2 = new ClientAbonati("Alex");
        Observer client3 = new ClientAbonati("Robert");

        Banca banca = new Banca();
        banca.adaugaObserver(client1);
        banca.adaugaObserver(client2);
        banca.adaugaObserver(client3);

        banca.trimiteOferta("creditare");
    }
}
