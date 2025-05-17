package ro.cts.main;

import ro.cts.clase.ClientAbonat;
import ro.cts.clase.Observer;
import ro.cts.clase.SalaSport;

public class Main {
    public static void main(String[] args){
        Observer client1 = new ClientAbonat("Andrei");
        Observer client2 = new ClientAbonat("Robert");
        Observer client3 = new ClientAbonat("Ionut");

        SalaSport sala = new SalaSport();
        sala.aboneaza(client1);
        sala.aboneaza(client2);
        sala.aboneaza(client3);

        sala.programareMeci("handbal");
        sala.dezaboneaza(client2);
        sala.programareMeci("volei");

    }
}
