package ro.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Menajera {
    private List<Boolean> camereCuratate;

    public Menajera() {
        camereCuratate = new ArrayList<Boolean>();
        for(int i=0;i<10;i++){
            camereCuratate.add(true);
        }
        for(int i=10;i<15;i++){
            camereCuratate.add(false);
        }
    }

    public boolean esteCurataCamera(int codCamera){
        return camereCuratate.get(codCamera);
    }

    public boolean areProsoapeCurate(int codCamera){
        return camereCuratate.get(codCamera);
    }
}
