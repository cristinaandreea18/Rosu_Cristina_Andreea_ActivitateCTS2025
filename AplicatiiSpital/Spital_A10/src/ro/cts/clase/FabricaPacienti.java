package ro.cts.clase;

import java.util.HashMap;

public class FabricaPacienti {
    private HashMap<String,IPacient>pacienti;

    public FabricaPacienti() {
        this.pacienti = new HashMap<String, IPacient>();
    }

    public int getNumarPacienti(){
        return pacienti.size();
    }

    public IPacient getPacient(String cheie){
        IPacient pacient = pacienti.get(cheie);
        if(pacient==null){
            pacient = new Pacient("Ion","0765432316","Bucuresti",30);
            pacienti.put(cheie,pacient);
        }
        return pacient;
    }
}
