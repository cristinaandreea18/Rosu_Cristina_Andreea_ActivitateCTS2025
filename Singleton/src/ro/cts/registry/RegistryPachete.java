package ro.cts.registry;

import java.util.HashMap;
import java.util.Map;

public class RegistryPachete {

    private Map<String,PachetTuristic> pachete = new HashMap<>();
    private static RegistryPachete instance = null;

    private RegistryPachete() {
        pachete.put("cazare", new PachetCazare());
        pachete.put("transport", new PachetTransport());
        pachete.put("cazareTransport", new PachetCazareTransport());
    }

    public PachetTuristic inregistreazaPachet(String name, PachetTuristic value){
        if(!pachete.containsKey(name)){
            pachete.put(name,value);
        }
        return pachete.get(name);
    }

    public static RegistryPachete getInstance(){
        if(instance== null){
            instance = new RegistryPachete();
        }
        return instance;
    }
}
