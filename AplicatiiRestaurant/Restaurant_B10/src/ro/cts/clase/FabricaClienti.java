package ro.cts.clase;

import java.util.HashMap;

public class FabricaClienti {
    private HashMap<String, IClient> clienti;

    public FabricaClienti() {
        clienti = new HashMap<String,IClient>();
    }

    public IClient getClient(String cheie){
        IClient client = clienti.get(cheie);
        if (client==null){
            client = new Client("Ion","0764531290","ion@gmail.com");
            clienti.put(cheie,client);
        }
        return client;
    }
}
