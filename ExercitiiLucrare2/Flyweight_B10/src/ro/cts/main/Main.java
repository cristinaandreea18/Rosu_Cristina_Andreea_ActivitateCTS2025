package ro.cts.main;

import ro.cts.clase.AbstractClient;
import ro.cts.clase.FabricaClienti;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args){
        FabricaClienti fabricaClienti = new FabricaClienti("La Tigrutz");
        try {
            AbstractClient client1 = fabricaClienti.getClient("Andreea", "1234567", "andreea@gmail.com");
            Rezervare rezervare1 = new Rezervare(18, 3, 16);
            Rezervare rezervare2 = new Rezervare(3, 4, 10);
            client1.descrieClient(rezervare1);
            AbstractClient client2 = fabricaClienti.getClient("1234567");
            client2.descrieClient(rezervare2);
        }
        catch(Exception ex){
            throw new RuntimeException(ex);
        }
    }
}
