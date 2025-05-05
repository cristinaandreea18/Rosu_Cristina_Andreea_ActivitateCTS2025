package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class CamereLibere {
    private List<Integer> camereLibere;

    public CamereLibere() {
        camereLibere = new ArrayList<Integer>();
        for (int i=0;i<15;i++)
            camereLibere.add(i+1);
    }

    public boolean verificareDisponibiltateCamera(int codCamera){
        return camereLibere.contains(codCamera);
    }
}
