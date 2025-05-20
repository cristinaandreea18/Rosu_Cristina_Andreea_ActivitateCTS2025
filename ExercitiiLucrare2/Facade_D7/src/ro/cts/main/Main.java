package ro.cts.main;

import ro.cts.clase.Banca;
import ro.cts.clase.Client;

public class Main {
    public static void main(String[] args){
        Client client1 = new Client("Ion",18,false,true);
        Banca banca = new Banca();
        banca.creareCont(client1);
    }
}
