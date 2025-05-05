package ro.cts.clase;

import java.util.HashMap;

public class FabricaDePachete {
    private HashMap<Integer,IPachetTuristic>pacheteTuristiceHashMap;

    public FabricaDePachete() {
        pacheteTuristiceHashMap = new HashMap<Integer,IPachetTuristic>();
    }
    public int getNumarPachete(){
        return pacheteTuristiceHashMap.size();
    }

    public IPachetTuristic getPachetTuristic(int cod){
        IPachetTuristic pachet = pacheteTuristiceHashMap.get(cod);
        if(pachet==null){
            pachet = new PachetTuristic(cod,"Hotel","Oras",true);
            pacheteTuristiceHashMap.put(cod,pachet);
        }
        return pachet;
    }

}
