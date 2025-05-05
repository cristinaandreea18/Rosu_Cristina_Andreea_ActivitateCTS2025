package ro.cts.clase;

import java.util.HashMap;

public class FabricaDeCamere {
    private HashMap<Integer,Camera>listaCamere;

    public FabricaDeCamere() {
        listaCamere = new HashMap<Integer,Camera>();
    }

    public ICamera getCamera(int codAranjare){
        if(listaCamere.containsKey(codAranjare)){
            return listaCamere.get(codAranjare);
        }
        else
        {
            ICamera camera = new Camera(codAranjare,3,1,2,5);
            listaCamere.put(codAranjare, (Camera) camera);
            return camera;
        }
    }
}
