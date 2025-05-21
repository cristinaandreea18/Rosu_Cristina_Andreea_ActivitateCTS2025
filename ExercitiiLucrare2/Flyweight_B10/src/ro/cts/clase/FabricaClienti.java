package ro.cts.clase;

import java.util.HashMap;

public class FabricaClienti {
    private String numeRestaurant;
    private HashMap<String,AbstractClient>colectieClienti;

    public FabricaClienti(String numeRestaurant) {
        this.numeRestaurant = numeRestaurant;
        this.colectieClienti = new HashMap<String,AbstractClient> ();
    }

    public AbstractClient getClient(String numarTelefon) throws Exception {
        AbstractClient client  = colectieClienti.get(numarTelefon);
        if(client==null){
            throw new Exception("Nu exista acest client!");
        }
        return client;
    }

    public AbstractClient getClient(String nume,String numarTelefon,String email){
        AbstractClient client = colectieClienti.get(numarTelefon);
        if(client==null){
            client = new Client(nume,numarTelefon,email);
            colectieClienti.put(numarTelefon,client);
        }
        return client;
    }
}
