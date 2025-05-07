package ro.cts.main;

import ro.cts.clase.FabricaClienti;
import ro.cts.clase.IClient;
import ro.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args){
        FabricaClienti fabrica = new FabricaClienti();
        Rezervare rezervare1 = new Rezervare(5,2,19);
        Rezervare rezervare2 = new Rezervare(9,4,15);

        IClient client = fabrica.getClient("Ion");
        client.descrieClient(rezervare1);
        client.descrieClient(rezervare2);

    }
}
