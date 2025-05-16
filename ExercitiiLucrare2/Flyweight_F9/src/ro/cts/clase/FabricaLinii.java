package ro.cts.clase;

import javax.swing.plaf.InsetsUIResource;
import java.util.HashMap;

public class FabricaLinii {
    private HashMap<Integer,AbstractLinie>colectieLinii;

    public FabricaLinii() {
        this.colectieLinii = new HashMap<Integer,AbstractLinie>();
    }

    public AbstractLinie getLinie(int numarLinie, String primaStatie,String ultimaStatie){
      AbstractLinie linie = colectieLinii.get(numarLinie);
      if(linie==null){
          linie = new Linie(numarLinie,primaStatie,ultimaStatie);
          colectieLinii.put(numarLinie,linie);
      }
     return linie;
    }
}
